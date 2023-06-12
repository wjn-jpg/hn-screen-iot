package com.ntdq.hnscreen.udp.handler;

import com.ntdq.hnscreen.udp.domain.PowerStationReport;
import com.ntdq.hnscreen.util.CommonByteUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PowerStationReportDecoder extends MessageToMessageDecoder<ByteBuf> {

    private static final Logger logger = LoggerFactory.getLogger(PowerStationReportDecoder.class);

    /**
     * 读取最小字节数量
     */
    public static final int MIN_SIZE = 15;

    private String serviceName;

    public PowerStationReportDecoder(String serviceName) {
        this.serviceName = serviceName;
    }


    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf in, List<Object> out) throws Exception {
        logger.info("{}开始解析字节数据...",serviceName);
        if (in.readableBytes() < MIN_SIZE) {
            logger.info("读取到无用的字节数据:{}", in.readableBytes());
            return;
        }
        in.markReaderIndex();
        byte[] byteData = new byte[in.readableBytes()];
        in.readBytes(byteData);
        String data = CommonByteUtils.BinaryToHexString(byteData);
        logger.info("解析出的数据为:{}", data);
        out.add(PowerStationReport.build(byteData));
    }
}
