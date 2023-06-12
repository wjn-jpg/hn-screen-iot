package com.ntdq.hnscreen.nbt33007.domain;

/**
 * 充电记录
 */
public class ChargingRecord {

    /**
     * 开始充电时间
     */
    private String startChargingTime;


    /**
     * 结束充电时间
     */
    private String endChargingTime;


    /**
     * 充电卡号
     */
    private String cardNumber;

    /**
     * E充电前电表读数
     */
    private float EMeterReadingBefore;

    /**
     * E充电后电表读数
     */
    private float EMeterReadingAgo;

    /**
     * 本次充电电量
     */
    private float CurrentChargingCapacity;

    /**
     * 本次充电金额
     */
    private float CurrentChargingAmount;


    /**
     * 充电前卡余额
     */
    private float AmountBeforeCharging;

    /**
     * 充电后卡余额
     */
    private float AmountAfterCharging;


    public String getStartChargingTime() {
        return startChargingTime;
    }

    public void setStartChargingTime(String startChargingTime) {
        this.startChargingTime = startChargingTime;
    }

    public String getEndChargingTime() {
        return endChargingTime;
    }

    public void setEndChargingTime(String endChargingTime) {
        this.endChargingTime = endChargingTime;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public float getEMeterReadingBefore() {
        return EMeterReadingBefore;
    }

    public void setEMeterReadingBefore(float EMeterReadingBefore) {
        this.EMeterReadingBefore = EMeterReadingBefore;
    }

    public float getEMeterReadingAgo() {
        return EMeterReadingAgo;
    }

    public void setEMeterReadingAgo(float EMeterReadingAgo) {
        this.EMeterReadingAgo = EMeterReadingAgo;
    }

    public float getCurrentChargingCapacity() {
        return CurrentChargingCapacity;
    }

    public void setCurrentChargingCapacity(float currentChargingCapacity) {
        CurrentChargingCapacity = currentChargingCapacity;
    }

    public float getCurrentChargingAmount() {
        return CurrentChargingAmount;
    }

    public void setCurrentChargingAmount(float currentChargingAmount) {
        CurrentChargingAmount = currentChargingAmount;
    }

    public float getAmountBeforeCharging() {
        return AmountBeforeCharging;
    }

    public void setAmountBeforeCharging(float amountBeforeCharging) {
        AmountBeforeCharging = amountBeforeCharging;
    }

    public float getAmountAfterCharging() {
        return AmountAfterCharging;
    }

    public void setAmountAfterCharging(float amountAfterCharging) {
        AmountAfterCharging = amountAfterCharging;
    }
}
