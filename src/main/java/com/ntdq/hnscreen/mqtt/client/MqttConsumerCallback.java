package com.ntdq.hnscreen.mqtt.client;

import org.eclipse.paho.client.mqttv3.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * mqtt回调处理类
 */

public class MqttConsumerCallback implements MqttCallbackExtended {

    private final MqttClient client;
    private final MqttConnectOptions options;
    private final String[] topic;
    private final int[] qos;

    public MqttConsumerCallback(MqttClient client, MqttConnectOptions options, String[] topic, int[] qos) {
        this.client = client;
        this.options = options;
        this.topic = topic;
        this.qos = qos;
    }

    /*
     * 断开重连
     */

    @Override
    public void connectionLost(Throwable cause) {
        System.out.println("MQTT连接断开，发起重连......");
        try {
            if (null != client && !client.isConnected()) {
                client.reconnect();
                System.out.println("尝试重新连接");
            } else {
                client.connect(options);
                System.out.println("尝试建立新连接");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 接收到消息调用令牌中调用
     */

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {

        //log.info("deliveryComplete---------" + Arrays.toString(topic));
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws UnsupportedEncodingException {
        byte[] payload = message.getPayload();
        String s = new String(payload, "UTF-8");
        System.out.println("转发接受到的消息:" + s);
    }



    /*
     * mqtt连接后订阅主题

     */
    public void connectComplete(boolean b, String s) {
        try {
            if (null != topic && null != qos) {
                if (client.isConnected()) {
                    client.subscribe(topic, qos);
                    System.out.println("mqtt连接成功，客户端ID：" + PropertiesUtil.MQTT_CLIENT_ID);
                    System.out.println("--订阅主题:：" + Arrays.toString(topic));
                } else {
                    System.out.println("mqtt连接失败，客户端ID：" + PropertiesUtil.MQTT_CLIENT_ID);
                }
            }
        } catch (Exception e) {
            System.out.println("mqtt订阅主题异常:" + e);
        }
    }
}

