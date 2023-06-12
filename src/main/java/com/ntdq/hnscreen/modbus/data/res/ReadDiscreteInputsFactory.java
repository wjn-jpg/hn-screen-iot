package com.ntdq.hnscreen.modbus.data.res;

import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.modbus.data.RecAndWriMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import io.netty.channel.Channel;

import java.util.Map;

public class ReadDiscreteInputsFactory implements RecAndWriMessage {
    @Override
    public void acceptMessage(Channel channel, ModBusHeader modBusHeader, ModBusPayload modBusPayload, Map<Integer, PointAttributeParse> transactionPointAttributeParseMap) {

    }
}
