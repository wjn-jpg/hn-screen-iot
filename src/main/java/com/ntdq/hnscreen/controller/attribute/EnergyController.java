package com.ntdq.hnscreen.controller.attribute;

import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusMessageGenerate;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;
import com.ntdq.hnscreen.modbus.util.ModBusChannelManager;
import com.ntdq.hnscreen.rest.RestResponse;
import io.netty.channel.Channel;
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
        Channel energyPCS = ModBusChannelManager.getChannel("EnergyPCS");
        ModBusHeader modBusHeader = ModBusMessageGenerate.newReadInputRegistersReqHeader(15);
        ModBusPayload modBusPayload = ModBusMessageGenerate.newReadHoldingRegistersReqPayLoad(61440, power, 6);
        ModBusTcpMessage modBusTcpMessage = new ModBusTcpMessage();
        modBusTcpMessage.setModBusHeader(modBusHeader);
        modBusTcpMessage.setModBusPayload(modBusPayload);
        energyPCS.writeAndFlush(modBusTcpMessage);
        return RestResponse.createSuccess("调控成功!", null);
    }


}
