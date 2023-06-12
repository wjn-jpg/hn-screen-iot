package com.ntdq.hnscreen.udp.init;

import com.ntdq.hnscreen.udp.handler.BootNettyUdpSimpleChannelInboundHandler;
import com.ntdq.hnscreen.udp.handler.HeartCheckHandler;
import com.ntdq.hnscreen.udp.handler.PowerStationReportDecoder;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.DatagramChannel;
import io.netty.handler.codec.DatagramPacketDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class UdpChannelInitializer extends ChannelInitializer<DatagramChannel> {

    private static final int readTimeout = 12000000;

    private static final int writeTimeout = 100000;

    private String serviceName;

    public UdpChannelInitializer(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    protected void initChannel(DatagramChannel ch){
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new ChannelHandler[]{new IdleStateHandler((long)this.readTimeout, (long)this.writeTimeout, 0L, TimeUnit.MILLISECONDS)});
        pipeline.addLast("hearCheckHandler",new HeartCheckHandler());
        pipeline.addLast(new ChannelHandler[]{new DatagramPacketDecoder((MessageToMessageDecoder)new PowerStationReportDecoder(serviceName))});
        pipeline.addLast(new ChannelHandler[]{new BootNettyUdpSimpleChannelInboundHandler()});
    }
}
