package com.ntdq.hnscreen.mqtt;

import com.ntdq.hnscreen.mqtt.client.MqttConsumer;
import com.ntdq.hnscreen.mqtt.component.SessionSocketHolder;
import com.ntdq.hnscreen.mqtt.config.MqttServerBOBase;
import com.ntdq.hnscreen.mqtt.init.MqttChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MqttServerRunning implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(MqttServerRunning.class);

    private final static SessionSocketHolder sessionSocketHolder = new SessionSocketHolder();

    private MqttServerBOBase mqttServerBOBase;

    private MqttConsumer mqttConsumer;

    @Autowired
    public void setMqttConsumer(MqttConsumer mqttConsumer) {
        this.mqttConsumer = mqttConsumer;
    }

    @Autowired
    public void setMqttServerBOBase(MqttServerBOBase mqttServerBOBase) {
        this.mqttServerBOBase = mqttServerBOBase;
    }

    public void startServer(MqttServerBOBase appConfiguration) {
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childOption(ChannelOption.TCP_NODELAY, true)
                    .childOption(ChannelOption.SO_REUSEADDR, true)
                    .childHandler(new MqttChannelInitializer(sessionSocketHolder, mqttServerBOBase));
            ChannelFuture bind = serverBootstrap.bind(mqttServerBOBase.getPort()).sync();
            if (bind.isSuccess()) {
                logger.info("MQTT服务已启动 端口为:{}", mqttServerBOBase.getPort());
                bind.channel().closeFuture().addListener((listener) -> {
                    workerGroup.shutdownGracefully();
                    bossGroup.shutdownGracefully();
                });
                mqttConsumer.connect();
            } else {
                logger.info("MQTT服务启动失败...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("成功开启MQTT服务...");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        startServer(mqttServerBOBase);
    }
}
