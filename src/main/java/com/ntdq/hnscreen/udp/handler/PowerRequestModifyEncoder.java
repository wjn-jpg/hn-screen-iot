package com.ntdq.hnscreen.udp.handler;

import com.ntdq.hnscreen.udp.domain.PowerModifyRequest;
import com.ntdq.hnscreen.util.ByteUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.handler.codec.MessageToMessageEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.util.List;

import static com.ntdq.hnscreen.util.ByteUtil.hexStringToBytes;

public class PowerRequestModifyEncoder extends MessageToMessageEncoder<PowerModifyRequest> {


    private static final String IP_PREFIX = "192.168.1.";

    private static final String PORT_PREFIX = "400";

    private static final Logger logger = LoggerFactory.getLogger(PowerRequestModifyEncoder.class);

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, PowerModifyRequest powerModifyRequest, List<Object> list) throws Exception {
        //InetSocketAddress clientAddress = new InetSocketAddress("127.0.0.1", Integer.parseInt(PORT_PREFIX + powerModifyRequest.getTargetPort()));
        InetSocketAddress clientAddress = new InetSocketAddress(IP_PREFIX + powerModifyRequest.getTargetIp(), Integer.parseInt(PORT_PREFIX + powerModifyRequest.getTargetPort()));
        byte[] sendDataArr = new byte[8];
        System.arraycopy(powerModifyRequest.getHeadByteArr(), 0, sendDataArr, 0, 3);
        sendDataArr[3] = (byte) powerModifyRequest.getTargetIp();
        sendDataArr[4] = (byte) powerModifyRequest.getSource();
        sendDataArr[5] = powerModifyRequest.getAdjustType();
        String powerHex = String.format("%04x", (int) (powerModifyRequest.getPower() * 10 + 1000));
        sendDataArr[6] = hexStringToBytes(powerHex.substring(2, 4))[0];
        sendDataArr[7] = hexStringToBytes(powerHex.substring(0, 2))[0];
        io.netty.channel.socket.DatagramPacket datagramPacket = new io.netty.channel.socket.DatagramPacket(Unpooled.copiedBuffer(sendDataArr), clientAddress);
        list.add(datagramPacket);
    }


    private void sendPacket(DatagramPacket datagramPacket) {
        DatagramSocket so = null;
        try {
            so = new DatagramSocket(4001);
            so.send(datagramPacket);
            logger.info("成功发送充电桩功率调整命令!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert so != null;
            so.close();
        }
    }

}
