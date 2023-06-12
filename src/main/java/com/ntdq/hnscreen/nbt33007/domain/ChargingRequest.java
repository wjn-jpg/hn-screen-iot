package com.ntdq.hnscreen.nbt33007.domain;

public class ChargingRequest {

    /**
     * 充电口编号 定位到某个充电枪
     */
    private String chargingPortNumber;

    /**
     * flag
     * 是否启动充电
     */
    private int flag;

    /**
     * 卡号
     */
    private String cardNumber;

    /**
     * 控制信息
     */
    private byte controlInfo;

    /**
     * 定时充电多久...
     */
    private int Timing;

    /**
     * 最大允许电压
     */
    private float maximumAllowableVoltage;

    /**
     * 最大允许电流
     */
    private float maximumAllowableCurrent;

    /**
     * 控制数据
     */
    private String chargeControlData;

    /**
     * card密码
     */
    private String cardPassWord;

    public String getChargingPortNumber() {
        return chargingPortNumber;
    }

    public void setChargingPortNumber(String chargingPortNumber) {
        this.chargingPortNumber = chargingPortNumber;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public byte getControlInfo() {
        return controlInfo;
    }

    public void setControlInfo(byte controlInfo) {
        this.controlInfo = controlInfo;
    }

    public int getTiming() {
        return Timing;
    }

    public void setTiming(int timing) {
        Timing = timing;
    }

    public float getMaximumAllowableVoltage() {
        return maximumAllowableVoltage;
    }

    public void setMaximumAllowableVoltage(float maximumAllowableVoltage) {
        this.maximumAllowableVoltage = maximumAllowableVoltage;
    }

    public float getMaximumAllowableCurrent() {
        return maximumAllowableCurrent;
    }

    public void setMaximumAllowableCurrent(float maximumAllowableCurrent) {
        this.maximumAllowableCurrent = maximumAllowableCurrent;
    }

    public String getChargeControlData() {
        return chargeControlData;
    }

    public void setChargeControlData(String chargeControlData) {
        this.chargeControlData = chargeControlData;
    }

    public String getCardPassWord() {
        return cardPassWord;
    }

    public void setCardPassWord(String cardPassWord) {
        this.cardPassWord = cardPassWord;
    }
}
