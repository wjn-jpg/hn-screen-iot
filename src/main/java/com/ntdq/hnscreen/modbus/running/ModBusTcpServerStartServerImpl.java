package com.ntdq.hnscreen.modbus.running;

import com.ntdq.hnscreen.modbus.config.ModBusConfig;
import com.ntdq.hnscreen.modbus.config.ModBusTcpServer;
import com.ntdq.hnscreen.modbus.init.TcpModBusClientHandlerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//@Service
public class ModBusTcpServerStartServerImpl implements ModBusStartServer, InitializingBean {


    /**
     * 动态初始化
     */
    private static Executor pool = null;

    private static final Logger logger = LoggerFactory.getLogger(ModBusTcpServerStartServerImpl.class);

    private ModBusConfig modBusConfig;


    @Autowired
    public void setModBusTcpClientConfig(ModBusConfig modBusConfig) {
        this.modBusConfig = modBusConfig;
    }

    @Override
    public void startServer() {
        for (Map.Entry<String, ModBusTcpServer> modBusTcpServerConfig : modBusConfig.getServiceNameModBusTcpServerMap().entrySet()) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
                    NioEventLoopGroup workerGroup = new NioEventLoopGroup();
                    try {
                        ServerBootstrap serverBootstrap = new ServerBootstrap();
                        serverBootstrap.group(bossGroup, workerGroup)
                                .channel(NioServerSocketChannel.class)
                                .childOption(ChannelOption.SO_KEEPALIVE, true)
                                .childOption(ChannelOption.TCP_NODELAY, true)
                                .childOption(ChannelOption.SO_REUSEADDR, true)
                                .childHandler(new TcpModBusClientHandlerInitializer(modBusTcpServerConfig.getKey(),modBusTcpServerConfig.getValue().getStyle()));
                        ChannelFuture bind = serverBootstrap.bind(modBusTcpServerConfig.getValue().getModbusPort()).sync();
                        if (bind.isSuccess()) {
                            logger.info("ModBus:{}服务已启动 端口为:{}", modBusTcpServerConfig.getKey(), modBusTcpServerConfig.getValue().getModbusPort());
                            bind.channel().closeFuture().addListener((listener) -> {
                                workerGroup.shutdownGracefully();
                                bossGroup.shutdownGracefully();
                            });
                        } else {
                            logger.info("ModBus服务启动失败...");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (modBusConfig.getServiceNameModBusTcpServerMap() != null && modBusConfig.getServiceNameModBusTcpServerMap().size() > 0) {
            pool = new ThreadPoolExecutor(modBusConfig.getServiceNameModBusTcpServerMap().size(), modBusConfig.getServiceNameModBusTcpServerMap().size() * 2, 1, TimeUnit.HOURS, new LinkedBlockingDeque<>());
        }
    }

}
