package com.ntdq.hnscreen.udp.handler;

import com.ntdq.hnscreen.udp.domain.PowerStationReport;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootNettyUdpSimpleChannelInboundHandler extends SimpleChannelInboundHandler<PowerStationReport> {

    private static final Logger logger = LoggerFactory.getLogger(BootNettyUdpSimpleChannelInboundHandler.class);

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, PowerStationReport powerStationReport) throws Exception {
        System.out.println(powerStationReport);
    }
}
