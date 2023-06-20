package com.ntdq.hnscreen.controller.attribute;

import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusMessageGenerate;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;
import com.ntdq.hnscreen.modbus.handler.TCPModbusResHandler;
import com.ntdq.hnscreen.modbus.util.ModBusChannelManager;
import com.ntdq.hnscreen.rest.RestResponse;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPromise;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/control")
@RestController
public class EnergyController {


    /**
     * 控制
     *
     * @param power
     * @return
     */
    @RequestMapping("/energyPower")
    public RestResponse<String> controlEnergyPower(int power) {
        long startTime = System.currentTimeMillis();
        TCPModbusResHandler.ChannelPromiseWrapper channelPromiseWrapper = TCPModbusResHandler.newPromise("EnergyPCS");
        ChannelPromise channelPromise = channelPromiseWrapper.getChannelPromise();
        Channel energyPCS = channelPromiseWrapper.getChannel();
        ModBusHeader modBusHeader = ModBusMessageGenerate.newReadInputRegistersReqHeader(15);
        ModBusPayload modBusPayload = ModBusMessageGenerate.newReadHoldingRegistersReqPayLoad(61440, power, 6);
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
            return RestResponse.createSuccess("调控成功!", "调控功率为" + power + "成功!"+"耗时:" + (endTime - startTime) / 1000+"秒!");
        } else {
            return RestResponse.createFailed("调控失败!", channelPromise.cause().getMessage());
        }
    }


}
