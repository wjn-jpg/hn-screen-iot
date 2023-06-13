package com.ntdq.hnscreen.modbus.handler;

import com.ntdq.hnscreen.build.command.CommandExecutorFactory;
import com.ntdq.hnscreen.build.command.CommandGenExecutor;
import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.modbus.data.DataRecAndWriFactory;
import com.ntdq.hnscreen.modbus.data.RecAndWriMessage;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.modbus.domain.TCPModbusByteBufHolder;
import com.ntdq.hnscreen.modbus.util.ModBusChannelManager;
import com.ntdq.hnscreen.modbus.util.ModBusHeaderDecoder;
import com.ntdq.hnscreen.handler.task.SyncExecutor;
import com.ntdq.hnscreen.style.SocketStyle;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TCPModbusResHandler extends SimpleChannelInboundHandler<TCPModbusByteBufHolder> {

    private static final Logger logger = LoggerFactory.getLogger(TCPModbusResDecoder.class);

    public static final int HEADER_LENGTH = 8;

    private static final AtomicInteger transactionId = new AtomicInteger(0);


    private static final Map<Integer, PointAttributeParse> transactionPointAttributeParseMap = new ConcurrentHashMap<>();


    public String serviceName;

    private String style;

    public TCPModbusResHandler(String serviceName) {
        this.serviceName = serviceName;
    }

    public TCPModbusResHandler(String serviceName, String style) {
        this.serviceName = serviceName;
        this.style = style;
    }

    /**
     * 我需要知道每一个事物对应的解析类型是哪一个 也就是List<TemplateAttribute></>
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        logger.info("ModBus客户端上线");
        Channel channel = ctx.channel();
        ModBusChannelManager.addChannel(serviceName, channel);
        CommandGenExecutor commandGenExecutor = CommandExecutorFactory.findCommandExecutorByServiceName(serviceName);
        List<PointAttributeParse> pointAttributeParseList = commandGenExecutor.getPointAttributeParseList();
        switch (style) {
            case "TCP":
                pointAttributeParseList.forEach(pointAttributeParse -> {
                    int transactionIdAndIncrement = transactionId.getAndIncrement();
                    pointAttributeParse.setTransactionId(transactionIdAndIncrement);
                    transactionPointAttributeParseMap.put(transactionIdAndIncrement + 1, pointAttributeParse);
                });
                SyncExecutor.startCollect(serviceName, channel, commandGenExecutor, pointAttributeParseList, SocketStyle.TCP);
                break;
            case "RTU":
                SyncExecutor.startCollect(serviceName, channel, commandGenExecutor, pointAttributeParseList, SocketStyle.SERIAL);
        }
        logger.info("添加线圈channel:{}", channel);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        logger.info("ModBus客户端下线");
        Channel channel = ctx.channel();
//        ModBusChannelManager.remove(channel.remoteAddress().toString());
        ModBusChannelManager.remove(serviceName);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TCPModbusByteBufHolder msg) throws Exception {
        logger.info("拿到TCPModbusByteBufHolder对象...");
        int dataLength = 0;
        ByteBuf content = msg.content();
        int totalLength = content.readableBytes();
        if (totalLength < HEADER_LENGTH) {
            logger.info("modbusTCP数据丢失...");
            return;
        }
        ModBusHeader modBusHeader = ModBusHeaderDecoder.decode(content);
        logger.info("modBusHeader:{}", modBusHeader);
        ModBusPayload modBusPayload = new ModBusPayload();
        //读取指令类型
        short functionCode = content.readUnsignedByte();
        logger.info("收到指令类型Code:{}", functionCode);
        modBusPayload.setFunctionCode(functionCode);
        if (totalLength > HEADER_LENGTH) {
            dataLength = totalLength - HEADER_LENGTH;
        }
        modBusPayload.setDataLength((short) dataLength);
        byte[] data = new byte[dataLength];
        content.readBytes(data);
        modBusPayload.setData(data);
        RecAndWriMessage messageFactory = DataRecAndWriFactory.getMessageFactory(functionCode);
        if (messageFactory != null) {
            messageFactory.acceptMessage(ctx.channel(), modBusHeader, modBusPayload, transactionPointAttributeParseMap);
        } else {
            logger.info("没有此类型的功能码!");
        }
    }
}
