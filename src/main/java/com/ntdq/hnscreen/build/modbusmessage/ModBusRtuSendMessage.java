package com.ntdq.hnscreen.build.modbusmessage;


import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuHeader;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuSendBody;
import com.ntdq.hnscreen.domain.common.ModBusMessage;

public class ModBusRtuSendMessage extends ModBusMessage {

    private ModBusRtuHeader modBusRtuHeader;

    private ModBusRtuSendBody modBusRtuSendBody;

    private ModBusRtuCrcCheck modBusRtuCrcCheck;

    public void setModBusRtuCrcCheck(ModBusRtuCrcCheck modBusRtuCrcCheck) {
        this.modBusRtuCrcCheck = modBusRtuCrcCheck;
    }

    public ModBusRtuCrcCheck getModBusRtuCrcCheck() {
        return modBusRtuCrcCheck;
    }

    public ModBusRtuHeader getModBusHeader() {
        return modBusRtuHeader;
    }

    public void setModBusHeader(ModBusRtuHeader modBusRtuHeader) {
        this.modBusRtuHeader = modBusRtuHeader;
    }

    public ModBusRtuSendBody getModBusPayLoad() {
        return modBusRtuSendBody;
    }

    public void setModBusPayLoad(ModBusRtuSendBody modBusRtuSendBody) {
        this.modBusRtuSendBody = modBusRtuSendBody;
    }

    public byte[] build() {
        byte[] bytes = new byte[6];
        bytes[0] = modBusRtuHeader.getDeviceAddress();
        bytes[1] = modBusRtuHeader.getFunctionCode();
        byte[] bodyData = modBusRtuSendBody.getData();
        for (int i = 0; i < bodyData.length; i++) {
            bytes[2 + i] = bodyData[i];
        }
        return bytes;
    }
}
