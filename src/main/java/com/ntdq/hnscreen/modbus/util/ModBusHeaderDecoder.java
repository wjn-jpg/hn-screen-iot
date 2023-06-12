package com.ntdq.hnscreen.modbus.util;

import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import io.netty.buffer.ByteBuf;

public class ModBusHeaderDecoder {

    public static ModBusHeader decode(ByteBuf byteBuf) {
        ModBusHeader modBusHeader = new ModBusHeader();
        short transactionId = byteBuf.readShort();
        modBusHeader.setTransactionId(transactionId);
        short protocolId = (short) byteBuf.readShort();
        modBusHeader.setProtocolId(protocolId);
        short length = (short) byteBuf.readUnsignedShort();
        modBusHeader.setLength(length);
        byte unitId = (byte) byteBuf.readUnsignedByte();
        modBusHeader.setUnitId(unitId);
        return modBusHeader;
    }


}
