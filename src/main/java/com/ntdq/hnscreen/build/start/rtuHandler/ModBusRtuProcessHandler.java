package com.ntdq.hnscreen.build.start.rtuHandler;

import com.ntdq.hnscreen.build.command.CommandExecutorFactory;
import com.ntdq.hnscreen.build.command.CommandGenExecutor;
import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuResMessage;
import com.ntdq.hnscreen.handler.task.SyncExecutor;
import com.ntdq.hnscreen.modbus.util.ModBusChannelManager;
import com.ntdq.hnscreen.style.SocketStyle;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 最终处理数据的Handler
 */
public class ModBusRtuProcessHandler extends SimpleChannelInboundHandler<ModBusRtuResMessage> {

    private static final Logger logger = LoggerFactory.getLogger(ModBusRtuProcessHandler.class);

    private String serviceName;

    public ModBusRtuProcessHandler(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Channel channel = ctx.channel();
        String serialPortName = getSerialPortName(channel);
        logger.info("串口服务:{}已上线", serialPortName);
        ModBusChannelManager.addChannel(serviceName, channel);
        CommandGenExecutor commandGenExecutor = CommandExecutorFactory.findCommandExecutorByServiceName(serviceName);
        List<PointAttributeParse> pointAttributeParseList = commandGenExecutor.getPointAttributeParseList();
        SyncExecutor.startCollect(serviceName, channel, commandGenExecutor, pointAttributeParseList, SocketStyle.SERIAL);
//        if (serialPortName.equalsIgnoreCase("com1")) {
//            //SyncExecutor.startCollect(serialPortName,channel,new EnergyExecutor());
//        } else {
//            //....
//        }
    }

    private String getSerialPortName(Channel channel) {
        String localAddress = channel.localAddress().toString();
        return localAddress.substring(localAddress.indexOf("/") + 1);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        logger.info("串口服务:{}下线", serviceName);
        super.channelInactive(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ModBusRtuResMessage modBusRtuResMessage) throws Exception {
        System.out.println(modBusRtuResMessage);
    }
}
