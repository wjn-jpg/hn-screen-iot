package com.ntdq.hnscreen.nbt33007.domain;

/**
 * 单体电池信息
 */
public class BmsSingleBatteryInfo {

    /**
     * 电池分组号
     */
    private int groupNo;

    /**
     * 本电池有多少个电池
     */
    private int singleTotal;

    /**
     * 当前电池组序号?
     */
    private int singleNo;


    /**
     * 这一帧上传的电池数量
     */
    private int singleCount;

    /**
     * 各个电池的电压值
     */
    private float[] batteryVoltageArr;

}
