package com.ntdq.hnscreen.udp.handler;

import com.alibaba.fastjson.JSON;
import com.ntdq.hnscreen.mqtt.client.MqttConsumer;
import com.ntdq.hnscreen.udp.domain.PowerStationReport;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.mqtt.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootNettyUdpSimpleChannelInboundHandler extends SimpleChannelInboundHandler<PowerStationReport> {

    private static final Logger logger = LoggerFactory.getLogger(BootNettyUdpSimpleChannelInboundHandler.class);

    private static final String POWER_TOPIC = "device/powerReport";

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, PowerStationReport powerStationReport) throws Exception {
        String powerMqttTopicBySource = findPowerMqttTopicBySource(powerStationReport);
        logger.info("转发充电桩数据主题:{}", powerMqttTopicBySource);
        MqttConsumer.publish(POWER_TOPIC, JSON.toJSONString(powerStationReport));
    }

    public static String findPowerMqttTopicBySource(PowerStationReport powerStationReport) {
//        return "device/powerReport";
        return "POWER_" + powerStationReport.getSourceAddr();
    }
}
