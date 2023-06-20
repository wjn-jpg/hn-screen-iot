package com.ntdq.hnscreen.modbus.domain;


import com.ntdq.hnscreen.modbus.constant.ModBusFunctionCode;
import com.ntdq.hnscreen.util.ByteUtil;

import java.util.Arrays;

public class ModBusMessageGenerate {

    /**
     * 协议标识符
     */
    public static final short PROTOCOLID = 0;

    /**
     * 读取线圈 头数据
     *
     * @return
     */
    public static com.ntdq.hnscreen.modbus.domain.ModBusHeader newReadCoilsReqHeader() {
        byte id = 1;
        short transactionId = 1;
        short length = 6;
        com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader = new com.ntdq.hnscreen.modbus.domain.ModBusHeader();
        modBusHeader.setUnitId(id);
        modBusHeader.setTransactionId(transactionId);
        modBusHeader.setLength(length);
        modBusHeader.setProtocolId(PROTOCOLID);
        return modBusHeader;
    }

    /**
     * @param address  寄存器起始地址
     * @param quantity 寄存器数量
     * @return
     */
    public static com.ntdq.hnscreen.modbus.domain.ModBusPayload newReadCoilsReqPayLoad(String address, int quantity) {
        com.ntdq.hnscreen.modbus.domain.ModBusPayload modBusPayload = new com.ntdq.hnscreen.modbus.domain.ModBusPayload();
        modBusPayload.setFunctionCode(ModBusFunctionCode.ReadCoils);
        byte[] bytes = new byte[4];
        ByteUtil.copyBytes(bytes, ByteUtil.hexStringToBytes(address), 0);
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(quantity), 2);
        modBusPayload.setData(bytes);
        modBusPayload.setDataLength((short) bytes.length);
        return modBusPayload;
    }


    public static com.ntdq.hnscreen.modbus.domain.ModBusHeader newReadHoldingRegistersReqHeader() {
        byte id = 1;
        short transaction = 584;
        short length = 6;
        com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader = new com.ntdq.hnscreen.modbus.domain.ModBusHeader();
        modBusHeader.setTransactionId(transaction);
        modBusHeader.setProtocolId(PROTOCOLID);
        modBusHeader.setUnitId(id);
        modBusHeader.setLength(length);
        return modBusHeader;
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusPayload newReadHoldingRegistersReqPayLoad(String address, int quantity) {
        com.ntdq.hnscreen.modbus.domain.ModBusPayload modBusPayload = new com.ntdq.hnscreen.modbus.domain.ModBusPayload();
        modBusPayload.setFunctionCode(ModBusFunctionCode.ReadHoldingRegisters);
        byte[] bytes = new byte[4];
        ByteUtil.copyBytes(bytes, ByteUtil.hexStringToBytes(address), 0);
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(quantity), 2);
        modBusPayload.setData(bytes);
        modBusPayload.setDataLength((short) bytes.length);
        return modBusPayload;
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusPayload newReadHoldingRegistersReqPayLoad(int address, int quantity, int type) {
        com.ntdq.hnscreen.modbus.domain.ModBusPayload modBusPayload = new com.ntdq.hnscreen.modbus.domain.ModBusPayload();
        switch (type) {
            case 2:
                modBusPayload.setFunctionCode(ModBusFunctionCode.ReadDiscreteInputs);
                break;
            case 3:
                modBusPayload.setFunctionCode(ModBusFunctionCode.ReadHoldingRegisters);
                break;
            case 4:
                modBusPayload.setFunctionCode(ModBusFunctionCode.ReadInputRegisters);
                break;
            case 5:
                modBusPayload.setFunctionCode(ModBusFunctionCode.WriteSingleCoil);
                break;
            case 6:
                modBusPayload.setFunctionCode(ModBusFunctionCode.WriteSingleRegister);
                break;
        }
        byte[] bytes = new byte[4];
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(address), 0);
        ByteUtil.copyBytes(bytes, ByteUtil.intToBytesBig(quantity), 2);
        modBusPayload.setData(bytes);
        modBusPayload.setDataLength((short) bytes.length);
        return modBusPayload;
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusHeader newWriteSingleCoilReqHeader() {
        byte uuid = 1;
        short transactionId = 1;
        short length = 6; // uuid(1) + code(1) + start(2) + num(2)
        com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader = new com.ntdq.hnscreen.modbus.domain.ModBusHeader();
        modBusHeader.setTransactionId(transactionId);
        modBusHeader.setProtocolId(PROTOCOLID);
        modBusHeader.setUnitId(uuid);
        modBusHeader.setLength(length);
        return modBusHeader;
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusPayload newWriteSingleCoilReqPayLoad(String address, int values) {
        com.ntdq.hnscreen.modbus.domain.ModBusPayload pduPayload = new ModBusPayload();
        byte[] pduBytes = new byte[4];
        pduPayload.setFunctionCode(ModBusFunctionCode.WriteSingleCoil);
        pduPayload.setDataLength((short) pduBytes.length);
        ByteUtil.copyBytes(pduBytes, ByteUtil.hexStringToBytes(address), 0);
        ByteUtil.copyBytes(pduBytes, ByteUtil.intToBytesBig(values), 2);
        pduPayload.setData(pduBytes);
        return pduPayload;
    }

    public static void main(String[] args) {
//        byte[] transaction = new byte[2];
//        transaction[0] = 0x02;
//        transaction[1] = 0x48;
//        System.out.println(ByteUtil.byteArrayToShort(transaction));
//
//        byte[] bytes = ByteUtil.shortToByteArray((short) 584);
//        System.out.println(bytes);
//
//        byte a = 0x14;
//        byte f = 20;
//        byte g = 0x20;
//
//        System.out.println(a == f);
//
//        byte[] bb = new byte[2];
//        bb[0] = a;
//        bb[1] = f;
//        System.out.println(bb);

        byte[] bytes = ByteUtil.intToBytesBig(3000);
        System.out.println(Arrays.toString(bytes));
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusHeader newReadInputRegistersReqHeader() {
        byte id = 1;
        short transactionId = 1;
        short length = 48;
        com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader = new com.ntdq.hnscreen.modbus.domain.ModBusHeader();
        modBusHeader.setUnitId(id);
        modBusHeader.setTransactionId(transactionId);
        modBusHeader.setLength(length);
        modBusHeader.setProtocolId(PROTOCOLID);
        return modBusHeader;
    }

    public static com.ntdq.hnscreen.modbus.domain.ModBusHeader newReadInputRegistersReqHeader(int transactionId) {
        com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader = new ModBusHeader();
        modBusHeader.setProtocolId(PROTOCOLID);
        modBusHeader.setUnitId((byte) 1);
        modBusHeader.setTransactionId((short) transactionId);
        modBusHeader.setLength((short) 6);
        return modBusHeader;
    }
}
