package com.ntdq.hnscreen.modbus.running;

import com.ntdq.hnscreen.modbus.config.ModBusConfig;
import com.ntdq.hnscreen.modbus.config.ModBusTcpClient;
import com.ntdq.hnscreen.modbus.init.TcpModBusClientHandlerInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Service
public class ModBusTcpClientStartServerImpl implements InitializingBean, ModBusStartServer {

    /**
     * 动态初始化
     */
    private static Executor pool = null;

    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(ModBusTcpClientStartServerImpl.class);


    private ModBusConfig modBusConfig;


    @Autowired
    public void setModBusTcpClientConfig(ModBusConfig modBusConfig) {
        this.modBusConfig = modBusConfig;
    }

    public void startServer() {
        for (Map.Entry<String, ModBusTcpClient> modBusTcpClientConfig : modBusConfig.getServiceNameModBusTcpClientMap().entrySet()) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    NioEventLoopGroup bossGroup = new NioEventLoopGroup();
                    Bootstrap bootstrap = new Bootstrap();
                    bootstrap.group(bossGroup).channel(NioSocketChannel.class)
                            .option(ChannelOption.SO_KEEPALIVE, true)
                            .handler(new TcpModBusClientHandlerInitializer(modBusTcpClientConfig.getKey(), modBusTcpClientConfig.getValue().getStyle()));
                    ChannelFuture connect = null;
                    try {
                        //sync方法等待connect建立连接完毕 不然会异步
                        connect = bootstrap.connect(modBusTcpClientConfig.getValue().getModbusIp(), modBusTcpClientConfig.getValue().getModbusPort()).sync();
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.info("ModBus客户端连接失败...");
                    }
                    if (connect == null) {
                        logger.info("ModBus客户端:{}连接失败...", modBusTcpClientConfig.getKey());
                        return;
                    }
                    connect.addListener(new ChannelFutureListener() {
                        @Override
                        public void operationComplete(ChannelFuture channelFuture) throws Exception {
                            if (!channelFuture.isSuccess()) {
                                logger.info("监测到ModBus服务连接断开 尝试重连...");
                            }
                        }
                    });
                    if (connect.isSuccess()) {
                        //ModBusChannelManager.addChannel(modBusTcpClientConfig.getKey(), connect.channel());
                        logger.info("ModBus:{}服务已连接 地址为:{} 端口为:{}", modBusTcpClientConfig.getKey(), modBusTcpClientConfig.getValue().getModbusIp(), modBusTcpClientConfig.getValue().getModbusPort());
                        connect.channel().closeFuture().addListener((listener) -> {
                            logger.info("监测到ModBus客户端:{}断开连接...", modBusTcpClientConfig.getKey());
                            bossGroup.shutdownGracefully();
                        });
                    } else {
                        logger.info("ModBus服务器:{}连接失败...", modBusTcpClientConfig.getKey());
                    }
                }
            });
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (modBusConfig.getServiceNameModBusTcpClientMap() != null && modBusConfig.getServiceNameModBusTcpClientMap().size() > 0) {
            pool = new ThreadPoolExecutor(modBusConfig.getServiceNameModBusTcpClientMap().size(), modBusConfig.getServiceNameModBusTcpClientMap().size() * 2, 1, TimeUnit.HOURS, new LinkedBlockingDeque<>());
        }
    }
}
