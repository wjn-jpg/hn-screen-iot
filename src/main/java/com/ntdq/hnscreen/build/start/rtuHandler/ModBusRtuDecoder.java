package com.ntdq.hnscreen.build.start.rtuHandler;

import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuResMessage;
import com.ntdq.hnscreen.build.modbusmessage.ModbusFunctionCode;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuHeader;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuResBody;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * ModBus串口消息解码器
 */
@Component
public class ModBusRtuDecoder extends ReplayingDecoder<ModBusRtuResMessage> {


    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List<Object> out) throws Exception {
        int deviceAddress = in.readUnsignedByte();
        int functionCode = in.readUnsignedByte();
        int byteCount = in.readUnsignedByte();
        if (functionCode == ModbusFunctionCode.READ_COILS.getCode() ||
                functionCode == ModbusFunctionCode.READ_DISCRETE_INPUTS.getCode() ||
                functionCode == ModbusFunctionCode.READ_HOLDING_REGISTERS.getCode() ||
                functionCode == ModbusFunctionCode.READ_INPUT_REGISTERS.getCode()) {
            byte[] data = new byte[byteCount];
            in.readBytes(data);
            ModBusRtuResMessage modBusRtuResMessage = new ModBusRtuResMessage();
            ModBusRtuHeader modBusRtuHeader = new ModBusRtuHeader();
            modBusRtuHeader.setDeviceAddress((byte) deviceAddress);
            modBusRtuHeader.setFunctionCode((byte) functionCode);
            ModBusRtuResBody modBusRtuResBody = new ModBusRtuResBody();
            modBusRtuResBody.setByteCount(byteCount);
            modBusRtuResBody.setData(data);
            modBusRtuResMessage.setModBusRtuHeader(modBusRtuHeader);
            modBusRtuResMessage.setModBusRtuResBody(modBusRtuResBody);
            out.add(modBusRtuResMessage);
        } else {
            in.skipBytes(byteCount);
        }
    }
}
