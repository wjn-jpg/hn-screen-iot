package com.ntdq.hnscreen.mqtt.init;


import com.ntdq.hnscreen.mqtt.component.SessionSocketHolder;
import com.ntdq.hnscreen.mqtt.config.MqttServerBOBase;
import com.ntdq.hnscreen.mqtt.handler.MqttServerHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.mqtt.*;


/**
 * mqtt 初始化handler
 */
public class MqttChannelInitializer extends ChannelInitializer<SocketChannel> {

    private MqttServerHandler mqttServerHandler;

    public MqttChannelInitializer() {
    }

    public MqttChannelInitializer(SessionSocketHolder sessionSocketHolder, MqttServerBOBase mqttTopicBO) {
        mqttServerHandler = new MqttServerHandler(sessionSocketHolder, mqttTopicBO);
    }

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        System.out.println("initChannel:" + this);
        socketChannel.pipeline().addLast("mqttDecoder", new MqttDecoder(1024 * 1024));
        socketChannel.pipeline().addLast("mqttEncoder", MqttEncoder.INSTANCE);
        socketChannel.pipeline().addLast("mqttHandler", mqttServerHandler);
    }

    public void setMqttServerHandler(MqttServerHandler mqttServerHandler) {
        this.mqttServerHandler = mqttServerHandler;
    }
}
