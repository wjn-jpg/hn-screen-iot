package com.ntdq.hnscreen.build.start.rtuHandler;

import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuMessageGenerate;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.springframework.stereotype.Component;

/**
 * ModBus串口消息编码器
 */
@Component
public class ModBusRtuEncoder extends MessageToByteEncoder<ModBusRtuSendMessage> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ModBusRtuSendMessage modBusRtuSendMessage, ByteBuf out) throws Exception {
        out.writeByte(modBusRtuSendMessage.getModBusHeader().getDeviceAddress());
        out.writeByte(modBusRtuSendMessage.getModBusHeader().getFunctionCode());
        out.writeBytes(modBusRtuSendMessage.getModBusPayLoad().getData());
        byte[] CRC = ModBusRtuMessageGenerate.CRC16(modBusRtuSendMessage.build());
        out.writeBytes(CRC);
    }
}
