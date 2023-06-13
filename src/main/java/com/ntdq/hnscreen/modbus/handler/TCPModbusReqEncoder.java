package com.ntdq.hnscreen.modbus.handler;

import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuMessageGenerate;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import com.ntdq.hnscreen.domain.common.ModBusMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;
import com.ntdq.hnscreen.modbus.util.ModBusHeaderEncoder;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCPModbusReqEncoder extends MessageToByteEncoder<ModBusMessage> {

    private final static Logger logger = LoggerFactory.getLogger(TCPModbusReqEncoder.class);

//    @Override
//    protected void encode(ChannelHandlerContext ctx, ModBusTcpMessage modBusTcpMessage, ByteBuf byteBuf) throws Exception {
//        logger.info("-----------TCPModbusReqEncoder encode begin------------");
//        //header
//        ModBusHeaderEncoder.encode(byteBuf, modBusTcpMessage.getModBusHeader());
//        logger.info("header:" + modBusTcpMessage.getModBusHeader().toString());
//
//        //functionCode
//        int functionCode = modBusTcpMessage.getModBusPayload().getFunctionCode();
//        logger.info("functionCode:" + functionCode);
//
//        byteBuf.writeByte(modBusTcpMessage.getModBusPayload().getFunctionCode());
//        byteBuf.writeBytes(modBusTcpMessage.getModBusPayload().getData());
////        byte[] bytes = new byte[byteBuf.readableBytes()];
////        byteBuf.readBytes(bytes);
////        logger.info("输出:{}", bytes);
//        logger.info("TCPModbus输出编码完成...");
//
//    }

    public static void main(String[] args) {

//        byte[] bytes = ByteUtil.shortToBytes((short) 584);
//        System.out.println(bytes);
    }

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ModBusMessage modBusMessage, ByteBuf byteBuf) throws Exception {
        if (modBusMessage instanceof ModBusTcpMessage) {
            ModBusTcpMessage modBusTcpMessage = (ModBusTcpMessage) modBusMessage;
            logger.info("-----------TCPModbusReqEncoder encode begin------------");
            //header
            ModBusHeaderEncoder.encode(byteBuf, modBusTcpMessage.getModBusHeader());
            logger.info("header:" + modBusTcpMessage.getModBusHeader().toString());
            //functionCode
            int functionCode = modBusTcpMessage.getModBusPayload().getFunctionCode();
            logger.info("functionCode:" + functionCode);
            byteBuf.writeByte(modBusTcpMessage.getModBusPayload().getFunctionCode());
            byteBuf.writeBytes(modBusTcpMessage.getModBusPayload().getData());
        } else if (modBusMessage instanceof ModBusRtuSendMessage) {
            ModBusRtuSendMessage modBusRtuSendMessage = (ModBusRtuSendMessage) modBusMessage;
            byteBuf.writeByte(modBusRtuSendMessage.getModBusHeader().getDeviceAddress());
            byteBuf.writeByte(modBusRtuSendMessage.getModBusHeader().getFunctionCode());
            byteBuf.writeBytes(modBusRtuSendMessage.getModBusPayLoad().getData());
            byteBuf.writeBytes(modBusRtuSendMessage.getModBusRtuCrcCheck().getCrcCheckData());
//            byte[] data = new byte[6];
//            data[0] = 0x01;
//            data[1] = 0x04;
//            data[2] = 0x0A;
//            data[3] = 0x00;
//            data[4] = 0x00;
//            data[5] = 0x01;
//            byte[] bytes = ModBusRtuMessageGenerate.CRC16(data);
//            byte[] send = new byte[8];
//            System.arraycopy(data, 0, send, 0, 6);
//            System.arraycopy(bytes, 0, send, 6, 2);
//            byteBuf.writeBytes(send);
        }
//        byte[] bytes = new byte[byteBuf.readableBytes()];
//        byteBuf.readBytes(bytes);
//        logger.info("输出:{}", bytes);
        logger.info("TCPModbus输出编码完成...");

    }

}
