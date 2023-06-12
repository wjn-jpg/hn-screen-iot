package com.ntdq.hnscreen.modbus.data.res;

import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.modbus.data.RecAndWriMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.util.ByteUtil;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class ReadHoldingRegistersFactory implements RecAndWriMessage {

    private static final Logger logger = LoggerFactory.getLogger(ReadCoilsResMessageFactory.class);
    @Override
    public void acceptMessage(Channel channel, ModBusHeader modBusHeader, ModBusPayload modBusPayload, Map<Integer, PointAttributeParse> transactionPointAttributeParseMap) {
        logger.info("-----------recMessage:读保持寄存器 begin------------");
//        int transactionId = modBusHeader.getTransactionId();
        logger.info("header: " + modBusHeader.toString());
        logger.info("functionCode: " + modBusPayload.getFunctionCode());
        logger.info("data length: " + modBusPayload.getDataLength());
        logger.info("data:{}",modBusPayload.getData());
        logger.info("data hex data: " + ByteUtil.bytesToHexString(modBusPayload.getData()));
        logger.info("-----------recMessage:读保持寄存器 end------------");
    }
}
