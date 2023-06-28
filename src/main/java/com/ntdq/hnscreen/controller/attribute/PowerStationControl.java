package com.ntdq.hnscreen.controller.attribute;


import com.ntdq.hnscreen.modbus.util.ModBusChannelManager;
import com.ntdq.hnscreen.param.ControlBatteryStationPowerParam;
import com.ntdq.hnscreen.rest.RestResponse;
import com.ntdq.hnscreen.udp.domain.PowerModifyRequest;
import io.netty.channel.Channel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 充电桩功率调节
 */
@RequestMapping("/powerStation/control")
@RestController
public class PowerStationControl {

    private static final String IP_PREFIX = "192.168.1.";

    private static final String TARGET_PORT = "400";

    private static final String POWER_NAME = "power";

    private static final int SOURCE = 220;


    /**
     * 充电桩功率调节
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/batteryPower", method = RequestMethod.POST)
    public RestResponse<String> batteryStationPower(@RequestBody ControlBatteryStationPowerParam controlBatteryStationPowerParam) {
        //充电桩功率
        float power = controlBatteryStationPowerParam.getPower();
        int number = controlBatteryStationPowerParam.getNumber();
        PowerModifyRequest powerModifyRequest = generate(power, number);
        Channel channel = ModBusChannelManager.getChannel(POWER_NAME);
        assert channel != null;
        channel.writeAndFlush(powerModifyRequest);
        return null;
    }


    private PowerModifyRequest generate(float power, int number) {
        PowerModifyRequest powerModifyRequest = new PowerModifyRequest();
        powerModifyRequest.setPower(power);
        powerModifyRequest.setTargetIp(number);//几号充电桩
        powerModifyRequest.setTargetPort(number);
        powerModifyRequest.setSource(SOURCE);//源地址
        return powerModifyRequest;
    }

}
