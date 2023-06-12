package com.ntdq.hnscreen.build.modbusmessage;

import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuHeader;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuSendBody;
import com.ntdq.hnscreen.modbus.constant.ModBusFunctionCode;
import com.ntdq.hnscreen.util.ByteUtil;

public class ModBusRtuMessageGenerate {

    public static ModBusRtuHeader newReadInputRegistersReqHeader(int address, int type) {
        ModBusRtuHeader modBusRtuHeader = new ModBusRtuHeader();
        modBusRtuHeader.setDeviceAddress((byte) 1);
        modBusRtuHeader.setFunctionCode((byte) ModBusFunctionCode.ReadInputRegisters);
        return modBusRtuHeader;
    }

    public static ModBusRtuSendBody newReadInputRegistersReqPayLoad(int address, int quantity) {
        ModBusRtuSendBody modBusRtuSendBody = new ModBusRtuSendBody();
        byte[] bytes = new byte[4];
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(address), 0);
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(quantity), 2);
        modBusRtuSendBody.setData(bytes);
        modBusRtuSendBody.setLength((short) bytes.length);
        return modBusRtuSendBody;
    }

    public static byte[] CRC16(byte[] data) {
        //crc计算赋初始值
        int crc = 0xffff;
        for (int i = 0; i < data.length; i++) {
            crc = crc ^ data[i];
            for (int j = 0; j < 8; j++) {
                int temp;
                temp = crc & 1;
                crc = crc >> 1;
                crc = crc & 0x7fff;
                if (temp == 1) {
                    crc = crc ^ 0xa001;
                }
                crc = crc & 0xffff;
            }
        }
        //CRC寄存器的高低位进行互换
        byte[] crc16 = new byte[2];
        //CRC寄存器的高8位变成低8位，
        crc16[1] = (byte) ((crc >> 8) & 0xff);
        //CRC寄存器的低8位变成高8位
        crc16[0] = (byte) (crc & 0xff);
        return crc16;
    }


    /**
     * 计算CRC16校验码
     *
     * @param bytes 字节数组
     * @return {@link String} 校验码
     * @since 1.0
     */
    public static String getCRC(byte[] bytes) {
        // CRC寄存器全为1
        int CRC = 0x0000ffff;
        // 多项式校验值
        int POLYNOMIAL = 0x0000a001;
        int i, j;
        for (i = 0; i < bytes.length; i++) {
            CRC ^= ((int) bytes[i] & 0x000000ff);
            for (j = 0; j < 8; j++) {
                if ((CRC & 0x00000001) != 0) {
                    CRC >>= 1;
                    CRC ^= POLYNOMIAL;
                } else {
                    CRC >>= 1;
                }
            }
        }
        // 结果转换为16进制
        String result = Integer.toHexString(CRC).toUpperCase();
        if (result.length() != 4) {
            StringBuffer sb = new StringBuffer("0000");
            result = sb.replace(4 - result.length(), 4, result).toString();
        }
        //高位在前地位在后
        return result.substring(2, 4) + result.substring(0, 2);
        // 交换高低位，低位在前高位在后
//        return result.substring(2, 4) + result.substring(0, 2);
    }


}
