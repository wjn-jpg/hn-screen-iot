package com.ntdq.hnscreen.param;

/**
 * 调控充电桩功率的参数
 */
public class ControlBatteryStationPowerParam {

    private String nowTimeDate;


    private float power;


    private String executeSecret;


    private int number;

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNowTimeDate() {
        return nowTimeDate;
    }

    public void setNowTimeDate(String nowTimeDate) {
        this.nowTimeDate = nowTimeDate;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getExecuteSecret() {
        return executeSecret;
    }

    public void setExecuteSecret(String executeSecret) {
        this.executeSecret = executeSecret;
    }
}
