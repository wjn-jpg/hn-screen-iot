package com.ntdq.hnscreen.udp.running;

import com.ntdq.hnscreen.udp.config.PowerStationConfig;
import com.ntdq.hnscreen.udp.init.UdpChannelInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
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
public class UdpPowerStartServiceImpl implements UdpPowerStartServer, InitializingBean {

    /**
     * 动态初始化
     */
    private static Executor pool = null;

    private PowerStationConfig powerStationConfig;

    private final static Logger logger = LoggerFactory.getLogger(UdpPowerStartServiceImpl.class);

    @Autowired
    public void setPowerStationConfig(PowerStationConfig powerStationConfig) {
        this.powerStationConfig = powerStationConfig;
    }

    @Override
    public void startUdpServer() {
        for (Map.Entry<String, PowerStationServer> powerStationServerEntry : powerStationConfig.getServiceNamePowerStationServiceMap().entrySet()) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
                        Bootstrap bootstrap = new Bootstrap();
                        bootstrap.group(bossGroup).channel(NioDatagramChannel.class)
                                .option(ChannelOption.SO_BROADCAST, true)//支持广播
                                .handler(new UdpChannelInitializer(powerStationServerEntry.getKey()));
                        ChannelFuture channelFuture = bootstrap.bind(powerStationServerEntry.getValue().getAddress(), powerStationServerEntry.getValue().getPort()).sync();
                        if (channelFuture.isSuccess()) {
                            logger.info("UDP服务端已经开启 当前服务IP:{},端口:{}", powerStationServerEntry.getValue().getAddress(), powerStationServerEntry.getValue().getPort());
                            channelFuture.channel().closeFuture().addListener((listener) -> {
                                logger.info("UDP:{}Server停止...",powerStationServerEntry.getKey());
                                bossGroup.shutdownGracefully();
                            });
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
        pool = new ThreadPoolExecutor(powerStationConfig.getServiceNamePowerStationServiceMap().size(), powerStationConfig.getServiceNamePowerStationServiceMap().size() * 2, 1, TimeUnit.HOURS, new LinkedBlockingDeque<>());
    }

}
