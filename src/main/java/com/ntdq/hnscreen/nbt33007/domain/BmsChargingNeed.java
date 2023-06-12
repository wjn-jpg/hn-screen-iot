package com.ntdq.hnscreen.nbt33007.domain;

/**
 * BMS充电需求
 */
public class BmsChargingNeed {

    /**
     * 电压需求
     */
    private String voltageRequirement;

    /**
     * 电流需求
     */
    private String currentRequirement;

    /**
     * 充电模式
     */
    private int chargingMethod;

    public String getVoltageRequirement() {
        return voltageRequirement;
    }

    public void setVoltageRequirement(String voltageRequirement) {
        this.voltageRequirement = voltageRequirement;
    }

    public String getCurrentRequirement() {
        return currentRequirement;
    }

    public void setCurrentRequirement(String currentRequirement) {
        this.currentRequirement = currentRequirement;
    }

    public int getChargingMethod() {
        return chargingMethod;
    }

    public void setChargingMethod(int chargingMethod) {
        this.chargingMethod = chargingMethod;
    }
}
