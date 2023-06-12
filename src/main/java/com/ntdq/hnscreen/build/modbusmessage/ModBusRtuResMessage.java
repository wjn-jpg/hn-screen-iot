package com.ntdq.hnscreen.build.modbusmessage;

import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuHeader;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuResBody;

/**
 * 发送Rtu命令后返回的结果
 */
public class ModBusRtuResMessage {

    private ModBusRtuHeader modBusRtuHeader;

    private ModBusRtuResBody modBusRtuResBody;


    public ModBusRtuHeader getModBusRtuHeader() {
        return modBusRtuHeader;
    }

    public void setModBusRtuHeader(ModBusRtuHeader modBusRtuHeader) {
        this.modBusRtuHeader = modBusRtuHeader;
    }

    public ModBusRtuResBody getModBusRtuResBody() {
        return modBusRtuResBody;
    }

    public void setModBusRtuResBody(ModBusRtuResBody modBusRtuResBody) {
        this.modBusRtuResBody = modBusRtuResBody;
    }
}
