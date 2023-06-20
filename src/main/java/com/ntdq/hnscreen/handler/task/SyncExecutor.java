package com.ntdq.hnscreen.handler.task;

import com.ntdq.hnscreen.build.command.CommandGenExecutor;
import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuCrcCheck;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuMessageGenerate;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import com.ntdq.hnscreen.domain.common.ModBusMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;
import com.ntdq.hnscreen.style.SocketStyle;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * 异步任务处理器
 */
@Component
public class SyncExecutor {

    /**
     * 服务通道Map
     */
    private static final Map<String, Channel> serviceChannelMap = new ConcurrentHashMap<>();

    private static final Executor TaskPool = new ThreadPoolExecutor(10, 20, 1, TimeUnit.DAYS, new LinkedBlockingDeque<>());


    public static void startCollect(String serviceName, Channel channel, CommandGenExecutor commandGenExecutor, List<PointAttributeParse> attributeParses, SocketStyle style) {
        serviceChannelMap.put(serviceName, channel);
        //ModBusMessage modBusMessage = commandGenExecutor.buildCommandRtu(serviceName);
        List<? extends ModBusMessage> modBusMessages = null;
        switch (style) {
            case TCP:
                modBusMessages = commandGenExecutor.buildCommandTcp(attributeParses);
                break;
            case SERIAL:
                modBusMessages = commandGenExecutor.buildCommandRtu(attributeParses);
                for (ModBusMessage modBusMessage : modBusMessages) {
                    ModBusRtuSendMessage modBusRtuSendMessage = (ModBusRtuSendMessage) modBusMessage;
                    byte[] CRC = ModBusRtuMessageGenerate.CRC16(modBusRtuSendMessage.build());
                    ModBusRtuCrcCheck modBusRtuCrcCheck = new ModBusRtuCrcCheck();
                    modBusRtuCrcCheck.setCrcCheckData(CRC);
                    modBusRtuSendMessage.setModBusRtuCrcCheck(modBusRtuCrcCheck);
                }
                break;
        }
        if (serviceName.equalsIgnoreCase("Fan")){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (serviceName.equalsIgnoreCase("EnergyBA")){
            try {
                Thread.sleep(750);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (serviceName.equalsIgnoreCase("EnergyPCS")){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flushThread(modBusMessages, channel);
    }

    private static void flushThread(List<? extends ModBusMessage> modBusMessages, Channel channel) {
        /**
         * 线程每隔5秒刷新一次
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    modBusMessages.forEach(modBusMessage -> {
                        if (modBusMessage instanceof ModBusTcpMessage) {
                            channel.writeAndFlush((ModBusTcpMessage) modBusMessage);
                        } else if (modBusMessage instanceof ModBusRtuSendMessage) {
                            channel.writeAndFlush((ModBusRtuSendMessage) modBusMessage);
                        }
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
                }
            }
        };
        TaskPool.execute(runnable);
    }

    public static Channel getChannelByServiceName(String serviceName) {
        return serviceChannelMap.get(serviceName);
    }

}
