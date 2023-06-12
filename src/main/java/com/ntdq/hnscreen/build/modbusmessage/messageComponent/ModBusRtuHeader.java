package com.ntdq.hnscreen.build.modbusmessage.messageComponent;

public class ModBusRtuHeader {

    /**
     * 从机地址
     */
    private byte deviceAddress;

    /**
     * 功能编码
     */
    private byte functionCode;

    public byte getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(byte deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public byte getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(byte functionCode) {
        this.functionCode = functionCode;
    }
}
