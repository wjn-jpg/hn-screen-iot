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
//            byte[] result = new byte[]{0x00,0x01,0x00, (byte) 0x60};
            byte[] result = modBusTcpMessage.getModBusPayload().getData();
            //byte[] result = new byte[]{0x00, 0x01, 0x00, 0x00, 0x06, 0x01, 0x05, 0x00, 0x00, 0x00, 0x01};
            byteBuf.writeBytes(result);

            //===================
            //byte[] data = new byte[]{0x00, 0x00, 0x00, 0x08}; //储能
            //byte[] data = new byte[]{0x09, (byte) 0xD6, 0x00, 0x08}; //光伏
//            byte[] add = new byte[2];
//            add[0] = data[0];
//            add[1] = data[1];
//            byteBuf.writeBytes(add);
//            byte[] q = new byte[]{0x00, 0x40};
//            byteBuf.writeBytes(q);
            //byteBuf.writeBytes(modBusTcpMessage.getModBusPayload().getData());
//
//            byte[] data = new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x06, 0x01, 0x04, 0x13, 0x00, 0x00, 0x32};
            // byteBuf.writeBytes(data);
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
