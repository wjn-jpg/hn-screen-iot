package com.ntdq.hnscreen.modbus.init;

import com.ntdq.hnscreen.modbus.handler.TCPModbusReqEncoder;
import com.ntdq.hnscreen.modbus.handler.TCPModbusResDecoder;
import com.ntdq.hnscreen.modbus.handler.TCPModbusResHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class TcpModBusClientHandlerInitializer extends ChannelInitializer<SocketChannel> {

    private String serviceName;

    private String style;


    public TcpModBusClientHandlerInitializer() {

    }

    public TcpModBusClientHandlerInitializer(String serviceName,String style) {
        this.serviceName = serviceName;
        this.style = style;
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast("decoder", new TCPModbusResDecoder());
        pipeline.addLast("encoder", new TCPModbusReqEncoder());
        pipeline.addLast("tcpModBus", new TCPModbusResHandler(serviceName,style));
    }
}
