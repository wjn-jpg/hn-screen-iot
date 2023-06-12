package com.ntdq.hnscreen.modbus.config;

import io.netty.channel.Channel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ModBusChannelManager {

    private static final Map<String, Channel> device_channel_map = new ConcurrentHashMap<>();

    public static void addChannel(String serviceName, Channel channel) {
        device_channel_map.put(serviceName, channel);
    }

    public static Channel getChannel(String serviceName) {
       return device_channel_map.get(serviceName);
    }


}
