package com.ntdq.hnscreen.modbus.domain;

import com.ntdq.hnscreen.domain.common.ModBusMessage;

public class ModBusTcpMessage extends ModBusMessage {

    private com.ntdq.hnscreen.modbus.domain.ModBusHeader modBusHeader;

    private com.ntdq.hnscreen.modbus.domain.ModBusPayload modBusPayload;


    public com.ntdq.hnscreen.modbus.domain.ModBusHeader getModBusHeader() {
        return modBusHeader;
    }

    public void setModBusHeader(ModBusHeader modBusHeader) {
        this.modBusHeader = modBusHeader;
    }

    public com.ntdq.hnscreen.modbus.domain.ModBusPayload getModBusPayload() {
        return modBusPayload;
    }

    public void setModBusPayload(ModBusPayload modBusPayload) {
        this.modBusPayload = modBusPayload;
    }

    @Override
    public String toString() {
        return "ModBusMessage{" +
                "modBusHeader=" + modBusHeader +
                ", modBusPayload=" + modBusPayload +
                '}';
    }
}
