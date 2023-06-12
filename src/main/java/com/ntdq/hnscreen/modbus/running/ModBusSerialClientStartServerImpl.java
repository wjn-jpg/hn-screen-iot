package com.ntdq.hnscreen.modbus.running;

import com.ntdq.hnscreen.build.start.rtuHandler.ModBusRtuDecoder;
import com.ntdq.hnscreen.build.start.rtuHandler.ModBusRtuEncoder;
import com.ntdq.hnscreen.build.start.rtuHandler.ModBusRtuProcessHandler;
import com.ntdq.hnscreen.modbus.config.ModBusConfig;
import com.ntdq.hnscreen.modbus.config.ModBusSerialClient;
//import gnu.io.*;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.rxtx.RxtxChannel;
import io.netty.channel.rxtx.RxtxDeviceAddress;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import purejavacomm.CommPortIdentifier;
import purejavacomm.SerialPort;

import java.util.Map;

/**
 * 串口ModBus通信
 */
//@Service
public class ModBusSerialClientStartServerImpl implements ModBusStartServer {

    private static final Logger logger = LoggerFactory.getLogger(ModBusSerialClientStartServerImpl.class);

    private ModBusConfig modBusConfig;

    @Autowired
    public void setModBusConfig(ModBusConfig modBusConfig) {
        this.modBusConfig = modBusConfig;
    }

//    public void connectSerialClient(String serialPortName) throws Exception {
//        // Configure the RXTX serial port
//        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(serialPortName);
//        SerialPort serialPort = (SerialPort) portIdentifier.open("NettyRXTXSerialExample", 2000);
//        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
//        serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
//
//        // Create the Netty event loop group
//        EventLoopGroup group = new NioEventLoopGroup();
//
//        try {
//            // Create the Netty bootstrap and configure the RXTX channel
//            Bootstrap bootstrap = new Bootstrap();
//            bootstrap.group(group)
//                    .channel(NioSocketChannel.class)
//                    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 2000)
//                    .handler(new ChannelInitializer<RxtxChannel>() {
//                        @Override
//                        protected void initChannel(RxtxChannel ch) throws Exception {
//                            ChannelPipeline pipeline = ch.pipeline();
//                            // Add your custom handlers to process the serial data
//                            pipeline.addLast(new ModBusRtuDecoder());
//                            pipeline.addLast(new ModBusRtuEncoder());
//                            pipeline.addLast(new ModBusRtuProcessHandler());
//                        }
//                    });
//
//            // Connect to the serial device
//            ChannelFuture future = bootstrap.connect(new RxtxDeviceAddress(serialPort.getName())).sync();
//
//            // Wait for the connection to close
//            future.channel().closeFuture().sync();
//        } finally {
//            // Cleanup resources
//            group.shutdownGracefully().sync();
//            serialPort.close();
//        }
//    }

    @Override
    public void startServer() {
        for (Map.Entry<String, ModBusSerialClient> modBusSerialClientEntry : modBusConfig.getServiceNameModBusSerialClientMap().entrySet()) {
            CommPortIdentifier portIdentifier = null;
            SerialPort serialPort = null;
            try {
                portIdentifier = CommPortIdentifier.getPortIdentifier(modBusSerialClientEntry.getValue().getPortName());
                serialPort = (SerialPort) portIdentifier.open(modBusSerialClientEntry.getKey(), 2000);
                serialPort.setSerialPortParams(modBusSerialClientEntry.getValue().getBoundRate(), SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
                serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
            } catch (Exception e) {
                e.printStackTrace();
            }
            EventLoopGroup group = new NioEventLoopGroup();

            try {
                Bootstrap bootstrap = new Bootstrap();
                bootstrap.group(group)
                        .channel(NioSocketChannel.class)
                        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 2000)
                        .handler(new ChannelInitializer<RxtxChannel>() {
                            @Override
                            protected void initChannel(RxtxChannel ch) throws Exception {
                                ChannelPipeline pipeline = ch.pipeline();
                                // Add your custom handlers to process the serial data
                                pipeline.addLast(new ModBusRtuDecoder());
                                pipeline.addLast(new ModBusRtuEncoder());
                                pipeline.addLast(new ModBusRtuProcessHandler(modBusSerialClientEntry.getKey()));
                            }
                        });
                ChannelFuture future = bootstrap.connect(new RxtxDeviceAddress(serialPort.getName())).sync();
                future.channel().closeFuture().addListener((listener) -> {
                    logger.info("ModBus串口断开连接 服务:{},串口:{}", modBusSerialClientEntry.getKey(), modBusSerialClientEntry.getValue().getPortName());
                    group.shutdownGracefully();
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                if (serialPort != null) {
                    serialPort.close();
                }
            }
        }
    }

//    public static void main(String[] args) throws Exception {
//        // Configure the RXTX serial port
//        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier("/dev/ttyUSB0");
//        SerialPort serialPort = (SerialPort) portIdentifier.open("NettyRXTXSerialExample", 2000);
//        serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
//        serialPort.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
//
//        // Create the Netty event loop group
//        EventLoopGroup group = new NioEventLoopGroup();
//
//        try {
//            // Create the Netty bootstrap and configure the RXTX channel
//            Bootstrap bootstrap = new Bootstrap();
//            bootstrap.group(group)
//                    .channel(NioSocketChannel.class)
//                    .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 2000)
//                    .handler(new ChannelInitializer<RxtxChannel>() {
//                        @Override
//                        protected void initChannel(RxtxChannel ch) throws Exception {
//                            ChannelPipeline pipeline = ch.pipeline();
//                            // Add your custom handlers to process the serial data
//                            pipeline.addLast(new MySerialHandler());
//                        }
//                    });
//
//            // Connect to the serial device
//            ChannelFuture future = bootstrap.connect(new RxtxDeviceAddress(serialPort.getName())).sync();
//
//            // Wait for the connection to close
//            future.channel().closeFuture().sync();
//        } finally {
//            // Cleanup resources
//            group.shutdownGracefully().sync();
//            serialPort.close();
//        }
//    }

    private static class MySerialHandler extends ChannelInboundHandlerAdapter {
        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
            // Handle incoming data from the serial device
            // You can process the data here as needed
            byte[] data = (byte[]) msg;
            System.out.println("Received data: " + new String(data));
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
            // Handle exceptions
            cause.printStackTrace();
            ctx.close();
        }
    }
}




