package com.ntdq.hnscreen.build.modbusmessage.messageComponent;

public class ModBusRtuSendBody {

    /**
     * 字节长度 这个发送rtu报文可以不用
     */
    private short length;

    private byte[] data;


    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
