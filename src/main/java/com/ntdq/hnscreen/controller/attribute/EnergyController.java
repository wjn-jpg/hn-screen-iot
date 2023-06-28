package com.ntdq.hnscreen.controller.attribute;

import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusMessageGenerate;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;
import com.ntdq.hnscreen.modbus.handler.TCPModbusResHandler;
import com.ntdq.hnscreen.param.ControlPowerIntParam;
import com.ntdq.hnscreen.redis.RedisClient;
import com.ntdq.hnscreen.rest.RestResponse;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPromise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 储能功率调节
 */
@RequestMapping("/energy/control")
@RestController
public class EnergyController {

    private RedisClient redisClient;

    @Autowired
    public void setRedisClient(RedisClient redisClient) {
        this.redisClient = redisClient;
    }

    /**
     * 控制
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/energyPower", method = RequestMethod.POST)
    public RestResponse<String> controlEnergyPower(@RequestBody ControlPowerIntParam controlPowerIntParam) {
        String executeSecret = controlPowerIntParam.getExecuteSecret();
        String taskSecret = redisClient.getKeyForStrValue("TaskSecret");
        if (executeSecret == null ||  !executeSecret.equals(taskSecret)) {
            return RestResponse.createFailed("执行Token不正确!", null);
        }
        try {
            if (controlPowerIntParam.getNowTimeDate() != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date preDate = simpleDateFormat.parse(controlPowerIntParam.getNowTimeDate());
                if (preDate.after(new Date())) {
                    return RestResponse.createSuccess("还未到执行时间!", null);
                }
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long startTime = System.currentTimeMillis();
        TCPModbusResHandler.ChannelPromiseWrapper channelPromiseWrapper = TCPModbusResHandler.newPromise("EnergyPCS");
        ChannelPromise channelPromise = channelPromiseWrapper.getChannelPromise();
        Channel energyPCS = channelPromiseWrapper.getChannel();
        ModBusHeader modBusHeader = ModBusMessageGenerate.newReadInputRegistersReqHeader(15);
        ModBusPayload modBusPayload = ModBusMessageGenerate.newReadHoldingRegistersReqPayLoad(61440, controlPowerIntParam.getPower(), 6);
        ModBusTcpMessage modBusTcpMessage = new ModBusTcpMessage();
        modBusTcpMessage.setModBusHeader(modBusHeader);
        modBusTcpMessage.setModBusPayload(modBusPayload);
        energyPCS.writeAndFlush(modBusTcpMessage);
        try {
            channelPromise.await();
        } catch (Exception e) {
            e.printStackTrace();
            return RestResponse.createSuccess("调控失败!", "调控程序中断!");
        }
        long endTime = System.currentTimeMillis();
        if (channelPromise.isSuccess()) {
            return RestResponse.createSuccess("调控成功!", "调控功率为" + controlPowerIntParam.getPower() + "成功!" + "耗时:" + (endTime - startTime) / 1000 + "秒!");
        } else {
            return RestResponse.createFailed("调控失败!", channelPromise.cause().getMessage());
        }
    }


}
