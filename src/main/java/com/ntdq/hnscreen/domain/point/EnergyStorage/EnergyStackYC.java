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
    @ModelArguments(code = "BatteryStackVoltage", mean = "电池堆电压", number = 51, length = 4)
    private float BatteryStackVoltage;

    /**
     * "电池堆电流"
     */
    @ModelArguments(code = "BatteryStackCurrent", mean = "电池堆电流", number = 53, length = 4)
    private float BatteryStackCurrent;

    /**
     * "电池堆SOC"
     */
    @ModelArguments(code = "BatteryStackSOC", mean = "电池堆SOC", number = 55, length = 4)
    private float BatteryStackSOC;

    /**
     * "电池堆电压"
     */
    @ModelArguments(code = "BatteryStackSOH", mean = "电池堆SOH", number = 57, length = 4)
    private float BatteryStackSOH;

    /**
     * "电池堆可充电量"
     */
    @ModelArguments(code = "BatteryStackCanCharging", mean = "电池堆可充电量", number = 59, length = 4)
    private float BatteryStackCanChargingIn;

    /**
     * "电池堆可放电量"
     */
    @ModelArguments(code = "BatteryStackCanChargingOut", mean = "电池堆可放电量", number = 61, length = 4)
    private float BatteryStackCanChargingOut;

    /**
     * "电池堆单次可充电量"
     */
    @ModelArguments(code = "BatteryStackSingChargingIn", mean = "电池堆单次可充电量", number = 63, length = 4)
    private float BatteryStackSingChargingIn;
    /**
     * "电池堆单次可放电量"
     */
    @ModelArguments(code = "BatteryStackSingChargingOut", mean = "电池电池堆单次可放电量堆电压", number = 65, length = 4)
    private float BatteryStackSingChargingOut;

    /**
     * "电池堆累计充电量"
     */
    @ModelArguments(code = "BatteryStackTotalChargingIn", mean = "电池堆累计充电量", number = 67, length = 4)
    private float BatteryStackTotalChargingIn;

    /**
     * "电池堆累计放电量"
     */
    @ModelArguments(code = "BatteryStackTotalChargingOut", mean = "电池堆累计放电量", number = 69, length = 4)
    private float BatteryStackTotalChargingOut;

    /**
     * "堆单体电压压差极差值"
     */
    @ModelArguments(code = "PoorHeapMonomerVoltageDiffValue", mean = "堆单体电压压差极差值", number = 71, length = 4)
    private float PoorHeapMonomerVoltageDiffValue;

    /**
     * "最高单体电压"
     */
    @ModelArguments(code = "SignalMaxVoltage", mean = "最高单体电压", number = 73, length = 4)
    private float SignalMaxVoltage;

    /**
     * "最低单体电压"
     */
    @ModelArguments(code = "SignalMinVoltage", mean = "最低单体电压", number = 75, length = 4)
    private float SignalMinVoltage;

    /**
     * "堆单体温度温差极差值"
     */
    @ModelArguments(code = "PoorHeapMonomerTempDiffValue", mean = "堆单体温度温差极差值", number = 77, length = 4)
    private float PoorHeapMonomerTempDiffValue;

    /**
     * "最高电池温度"
     */
    @ModelArguments(code = "MaximumBatteryTemperature", mean = "最高电池温度", number = 79, length = 4)
    private float MaximumBatteryTemperature;

    /**
     * "最低电池温度"
     */
    @ModelArguments(code = "MinimumBatteryTemperature", mean = "最低电池温度", number = 81, length = 4)
    private float MinimumBatteryTemperature;

    /**
     * "组SOC差极差值"
     */
    @ModelArguments(code = "GroupSocReduce", mean = "组SOC差极差值", number = 83, length = 4)
    private float GroupSocReduce;

    /**
     * "组SOC最大"
     */
    @ModelArguments(code = "GroupSocMax", mean = "组SOC最大", number = 85, length = 4)
    private float GroupSocMax;

    /**
     * "组SOC最小"
     */
    @ModelArguments(code = "GroupSocMin", mean = "组SOC最小", number = 87, length = 4)
    private float GroupSocMin;

    /**
     * "组电压差极差值"
     */
    @ModelArguments(code = "GroupVoltageReduce", mean = "组电压差极差值", number = 89, length = 4)
    private float GroupVoltageReduce;

    /**
     * "组电压最大"
     */
    @ModelArguments(code = "GroupVoltageMax", mean = "组电压最大", number = 91, length = 4)
    private float GroupVoltageMax;


    /**
     * "组电压最小"
     */
    @ModelArguments(code = "GroupVoltageMin", mean = "组电压最小", number = 93, length = 4)
    private float GroupVoltageMin;

    /**
     * "电池堆当前允许最大充电功率"
     */
    @ModelArguments(code = "BatteryStackMaxPowerIn", mean = "电池堆当前允许最大充电功率", number = 95, length = 4)
    private float BatteryStackMaxPowerIn;

    /**
     * "电池堆当前允许最大放电功率"
     */
    @ModelArguments(code = "BatteryStackMaxPowerOut", mean = "电池堆当前允许最大放电功率", number = 97, length = 4)
    private float BatteryStackMaxPowerOut;

    /**
     * "电池堆当前允许最大充电电流"
     */
    @ModelArguments(code = "BatteryStackMaxCurrentIn", mean = "电池堆当前允许最大充电电流", number = 99, length = 4)
    private float BatteryStackMaxCurrentIn;

    /**
     * "电池堆当前允许最大放电电流"
     */
    @ModelArguments(code = "BatteryStackMaxCurrentOut", mean = "电池堆当前允许最大放电电流", number = 101, length = 4)
    private float BatteryStackMaxCurrentOut;


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


    public float getPoorHeapMonomerVoltageDiffValue() {
        return PoorHeapMonomerVoltageDiffValue;
    }

    public void setPoorHeapMonomerVoltageDiffValue(float poorHeapMonomerVoltageDiffValue) {
        PoorHeapMonomerVoltageDiffValue = poorHeapMonomerVoltageDiffValue;
    }

    public float getSignalMaxVoltage() {
        return SignalMaxVoltage;
    }

    public void setSignalMaxVoltage(float signalMaxVoltage) {
        SignalMaxVoltage = signalMaxVoltage;
    }

    public float getSignalMinVoltage() {
        return SignalMinVoltage;
    }

    public void setSignalMinVoltage(float signalMinVoltage) {
        SignalMinVoltage = signalMinVoltage;
    }

    public float getPoorHeapMonomerTempDiffValue() {
        return PoorHeapMonomerTempDiffValue;
    }

    public void setPoorHeapMonomerTempDiffValue(float poorHeapMonomerTempDiffValue) {
        PoorHeapMonomerTempDiffValue = poorHeapMonomerTempDiffValue;
    }

    public float getMaximumBatteryTemperature() {
        return MaximumBatteryTemperature;
    }

    public void setMaximumBatteryTemperature(float maximumBatteryTemperature) {
        MaximumBatteryTemperature = maximumBatteryTemperature;
    }

    public float getMinimumBatteryTemperature() {
        return MinimumBatteryTemperature;
    }

    public void setMinimumBatteryTemperature(float minimumBatteryTemperature) {
        MinimumBatteryTemperature = minimumBatteryTemperature;
    }

    public float getGroupSocReduce() {
        return GroupSocReduce;
    }

    public void setGroupSocReduce(float groupSocReduce) {
        GroupSocReduce = groupSocReduce;
    }

    public float getGroupSocMax() {
        return GroupSocMax;
    }

    public void setGroupSocMax(float groupSocMax) {
        GroupSocMax = groupSocMax;
    }

    public float getGroupSocMin() {
        return GroupSocMin;
    }

    public void setGroupSocMin(float groupSocMin) {
        GroupSocMin = groupSocMin;
    }

    public float getGroupVoltageReduce() {
        return GroupVoltageReduce;
    }

    public void setGroupVoltageReduce(float groupVoltageReduce) {
        GroupVoltageReduce = groupVoltageReduce;
    }

    public float getGroupVoltageMax() {
        return GroupVoltageMax;
    }

    public void setGroupVoltageMax(float groupVoltageMax) {
        GroupVoltageMax = groupVoltageMax;
    }

    public float getGroupVoltageMin() {
        return GroupVoltageMin;
    }

    public void setGroupVoltageMin(float groupVoltageMin) {
        GroupVoltageMin = groupVoltageMin;
    }

    public float getBatteryStackMaxPowerIn() {
        return BatteryStackMaxPowerIn;
    }

    public void setBatteryStackMaxPowerIn(float batteryStackMaxPowerIn) {
        BatteryStackMaxPowerIn = batteryStackMaxPowerIn;
    }

    public float getBatteryStackMaxPowerOut() {
        return BatteryStackMaxPowerOut;
    }

    public void setBatteryStackMaxPowerOut(float batteryStackMaxPowerOut) {
        BatteryStackMaxPowerOut = batteryStackMaxPowerOut;
    }

    public float getBatteryStackMaxCurrentIn() {
        return BatteryStackMaxCurrentIn;
    }

    public void setBatteryStackMaxCurrentIn(float batteryStackMaxCurrentIn) {
        BatteryStackMaxCurrentIn = batteryStackMaxCurrentIn;
    }

    public float getBatteryStackMaxCurrentOut() {
        return BatteryStackMaxCurrentOut;
    }

    public void setBatteryStackMaxCurrentOut(float batteryStackMaxCurrentOut) {
        BatteryStackMaxCurrentOut = batteryStackMaxCurrentOut;
    }
}
