package com.ntdq.hnscreen.rest;

/**
 * 请求多个线圈数据
 * 1 输出电压
 * 2 输出电流
 * 3 光伏电压
 * 4 光伏电流
 * 5 风机电压
 * 6 风机电流
 * 7 当日发电量
 * 8 总发电量
 */
public enum RealParam {

    /**
     * 输出电压
     */
    OutputVoltage((byte) 0x1000),
    /**
     * 输出电流
     */
    OutputCurrent((byte)0x1001),
    /**
     * 风机电压
     */
    FanVoltage((byte) 0x1004),
    /**
     * 风机电流
     */
    FanCurrent((byte) 0x1005),
    /**
     * 光伏电压
     */
    PhotovoltaicVoltage((byte) 0x1002),
    /**
     * 光伏电流
     */
    PhotovoltaicCurrent((byte)0x1003);


    private byte address;


    RealParam(byte address) {
        this.address = address;
    }

    public byte getAddress() {
        return address;
    }

    public void setAddress(byte address) {
        this.address = address;
    }
}
