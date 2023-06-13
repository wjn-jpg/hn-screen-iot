package com.ntdq.hnscreen.modbus.data.res;

import com.alibaba.fastjson.JSON;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.domain.point.BasePointInfo;
import com.ntdq.hnscreen.handler.mapping.PointMapping;
import com.ntdq.hnscreen.modbus.data.RecAndWriMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.mqtt.client.MqttConsumer;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.Target;
import java.util.Map;


public class ReadInputRegistersFactory implements RecAndWriMessage {

    private static final Logger logger = LoggerFactory.getLogger(ReadInputRegistersFactory.class);

    private PointMapping pointMapping;


    @Override
    public void acceptMessage(Channel channel, ModBusHeader modBusHeader, ModBusPayload modBusPayload, Map<Integer, PointAttributeParse> transactionPointAttributeParseMap) {
        int transactionId = modBusHeader.getTransactionId();
        PointAttributeParse pointAttributeParse = transactionPointAttributeParseMap.get(transactionId);
        if (pointAttributeParse == null) {
            logger.info("没有对应的事务解析信息:{}", transactionId);
            return;
        }
        byte[] data = modBusPayload.getData();
        BasePointInfo instance = null;
        try {
            instance = mappingAttribute(data, (BasePointInfo) pointAttributeParse.getBoClass().newInstance(), pointAttributeParse.getTemplateAttributes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert instance != null;
        Topic topic = instance.getClass().getAnnotation(Topic.class);
        if (!topic.topicName().equals("")) {
            MqttConsumer.publish(topic.topicName(), JSON.toJSONString(instance));
        }
        System.out.println(instance);
    }
}
