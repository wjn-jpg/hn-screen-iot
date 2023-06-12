package com.ntdq.hnscreen.build.modbusmessage.messageComponent;

public class ModBusRtuResBody {


    private int byteCount;


    private byte[] data;


    public int getByteCount() {
        return byteCount;
    }

    public void setByteCount(int byteCount) {
        this.byteCount = byteCount;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
