package com.ntdq.hnscreen.domain.point.EnergyStorage;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 电池堆
 */
@Topic(topicName = "ENERGY_STACK_YC")
@AttributeInfo(startIndex = 51, endIndex = 69, funcType = 4)
public class EnergyStackYC extends BasePointInfo {

    /**
     * "电池堆电压"
     */
    @ModelArguments(code = "BatteryStackVoltage", mean = "电池堆电压", number = 51,length = 4)
    private float BatteryStackVoltage;

    /**
     * "电池堆电流"
     */
    @ModelArguments(code = "BatteryStackCurrent", mean = "电池堆电流", number = 53,length = 4)
    private float BatteryStackCurrent;

    /**
     * "电池堆SOC"
     */
    @ModelArguments(code = "BatteryStackSOC", mean = "电池堆SOC", number = 55,length = 4)
    private float BatteryStackSOC;

    /**
     * "电池堆电压"
     */
    @ModelArguments(code = "BatteryStackSOH", mean = "电池堆SOH", number = 57,length = 4)
    private float BatteryStackSOH;

    /**
     * "电池堆可充电量"
     */
    @ModelArguments(code = "BatteryStackCanChargingIn", mean = "电池堆可充电量", number = 59,length = 4)
    private float BatteryStackCanChargingIn;

    /**
     * "电池堆可放电量"
     */
    @ModelArguments(code = "BatteryStackCanChargingOut", mean = "电池堆可放电量", number = 61,length = 4)
    private float BatteryStackCanChargingOut;

    /**
     * "电池堆单次可充电量"
     */
    @ModelArguments(code = "BatteryStackSingChargingIn", mean = "电池堆单次可充电量", number = 63,length = 4)
    private float BatteryStackSingChargingIn;
    /**
     * "电池堆单次可放电量"
     */
    @ModelArguments(code = "BatteryStackSingChargingOut", mean = "电池电池堆单次可放电量堆电压", number = 65,length = 4)
    private float BatteryStackSingChargingOut;

    /**
     * "电池堆累计充电量"
     */
    @ModelArguments(code = "BatteryStackTotalChargingIn", mean = "电池堆累计充电量", number = 67,length = 4)
    private float BatteryStackTotalChargingIn;
    /**
     * "电池堆累计放电量"
     */
    @ModelArguments(code = "BatteryStackTotalChargingOut", mean = "电池堆累计放电量", number = 69,length = 4)
    private float BatteryStackTotalChargingOut;

    public float getBatteryStackVoltage() {
        return BatteryStackVoltage;
    }

    public void setBatteryStackVoltage(float batteryStackVoltage) {
        BatteryStackVoltage = batteryStackVoltage;
    }

    public float getBatteryStackCurrent() {
        return BatteryStackCurrent;
    }

    public void setBatteryStackCurrent(float batteryStackCurrent) {
        BatteryStackCurrent = batteryStackCurrent;
    }

    public float getBatteryStackSOC() {
        return BatteryStackSOC;
    }

    public void setBatteryStackSOC(float batteryStackSOC) {
        BatteryStackSOC = batteryStackSOC;
    }

    public float getBatteryStackSOH() {
        return BatteryStackSOH;
    }

    public void setBatteryStackSOH(float batteryStackSOH) {
        BatteryStackSOH = batteryStackSOH;
    }

    public float getBatteryStackCanChargingIn() {
        return BatteryStackCanChargingIn;
    }

    public void setBatteryStackCanChargingIn(float batteryStackCanChargingIn) {
        BatteryStackCanChargingIn = batteryStackCanChargingIn;
    }

    public float getBatteryStackCanChargingOut() {
        return BatteryStackCanChargingOut;
    }

    public void setBatteryStackCanChargingOut(float batteryStackCanChargingOut) {
        BatteryStackCanChargingOut = batteryStackCanChargingOut;
    }

    public float getBatteryStackSingChargingIn() {
        return BatteryStackSingChargingIn;
    }

    public void setBatteryStackSingChargingIn(float batteryStackSingChargingIn) {
        BatteryStackSingChargingIn = batteryStackSingChargingIn;
    }

    public float getBatteryStackSingChargingOut() {
        return BatteryStackSingChargingOut;
    }

    public void setBatteryStackSingChargingOut(float batteryStackSingChargingOut) {
        BatteryStackSingChargingOut = batteryStackSingChargingOut;
    }

    public float getBatteryStackTotalChargingIn() {
        return BatteryStackTotalChargingIn;
    }

    public void setBatteryStackTotalChargingIn(float batteryStackTotalChargingIn) {
        BatteryStackTotalChargingIn = batteryStackTotalChargingIn;
    }

    public float getBatteryStackTotalChargingOut() {
        return BatteryStackTotalChargingOut;
    }

    public void setBatteryStackTotalChargingOut(float batteryStackTotalChargingOut) {
        BatteryStackTotalChargingOut = batteryStackTotalChargingOut;
    }
}
