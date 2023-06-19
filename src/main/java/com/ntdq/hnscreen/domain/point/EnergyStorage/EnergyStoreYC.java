package com.ntdq.hnscreen.domain.point.EnergyStorage;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

@AttributeInfo(startIndex = 0, endIndex = 21, funcType = 4)
@Topic(topicName = "ENERGY_STORE_YC")
public class EnergyStoreYC extends BasePointInfo {
    /**
     * 功率因数
     */
    @ModelArguments(code = "DcIntoTheLineVoltage", mean = "直流进线电压", number = 0)
    private short DcIntoTheLineVoltage;

    /**
     * 转换效率
     */
    @ModelArguments(code = "DcBusVoltage", mean = "直流母线电压", number = 1)
    private short DcBusVoltage;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "DcCurrent", mean = "直流电流", number = 2)
    private short DcCurrent;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "DcPower", mean = "直流功率", number = 3)
    private short DcPower;
//wwwwwwwww
    /**
     * 总放电量低位
     */
    @ModelArguments(code = "ABLineVoltageOfPowerGrid", mean = "电网AB线电压", number = 4)
    private short ABLineVoltageOfPowerGrid;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "BCLineVoltageOfPowerGrid", mean = "电网BC线电压", number = 5)
    private short BCLineVoltageOfPowerGrid;

//======**********

    /**
     * 正常停机
     */
    @ModelArguments(code = "CALineVoltageOfPowerGrid", mean = "电网CA线电压", number = 6)
    private short CALineVoltageOfPowerGrid;

    /**
     * 故障停机
     */
    @ModelArguments(code = "APhaseVoltage", mean = "A相电压", number = 7)
    private short APhaseVoltage;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "BPhaseVoltage", mean = "B相电压", number = 8)
    private short BPhaseVoltage;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "CPhaseVoltage", mean = "C相电压", number = 9)
    private short CPhaseVoltage;


    /**
     * 功率因数
     */
    @ModelArguments(code = "APhaseCurrent", mean = "A相电流", number = 10)
    private short APhaseCurrent;

    /**
     * 转换效率
     */
    @ModelArguments(code = "BPhaseCurrent", mean = "B相电流", number = 11)
    private short BPhaseCurrent;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "CPhaseCurrent", mean = "C相电流", number = 12)
    private short CPhaseCurrent;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "SystemFrequency", mean = "系统频率", number = 13)
    private short SystemFrequency;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "AcActivePower", mean = "交流有功功率", number = 14)
    private short AcActivePower;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "AcInActivePower", mean = "交流无功功率", number = 15)
    private short AcInActivePower;

// 9999999

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "PowerFactor", mean = "功率因数", number = 16)
    private short PowerFactor;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "ConversionEfficiency", mean = "转换效率", number = 17)
    private short ConversionEfficiency;


    /**
     * 功率因数
     */
    @ModelArguments(code = "HighestTemperatureModule", mean = "模组最高温度", number = 18)
    private short HighestTemperatureModule;

    /**
     * 转换效率
     */
    @ModelArguments(code = "ModuleA1Temperature", mean = "模块A1温度", number = 19)
    private short ModuleA1Temperature;


    /**
     * 交流无功功率
     */
    @ModelArguments(code = "TotalGeneratingCapacityLow", mean = "总发电量低位", number = 20)
    private short TotalGeneratingCapacityLow;

    /**
     * 功率因数
     */
    @ModelArguments(code = "TotalGeneratingCapacityHigh", mean = "总发电量高位", number = 21)
    private short TotalGeneratingCapacityHigh;

    public short getDcIntoTheLineVoltage() {
        return DcIntoTheLineVoltage;
    }

    public void setDcIntoTheLineVoltage(short dcIntoTheLineVoltage) {
        DcIntoTheLineVoltage = dcIntoTheLineVoltage;
    }

    public short getDcBusVoltage() {
        return DcBusVoltage;
    }

    public void setDcBusVoltage(short dcBusVoltage) {
        DcBusVoltage = dcBusVoltage;
    }

    public short getDcCurrent() {
        return DcCurrent;
    }

    public void setDcCurrent(short dcCurrent) {
        DcCurrent = dcCurrent;
    }

    public short getDcPower() {
        return DcPower;
    }

    public void setDcPower(short dcPower) {
        DcPower = dcPower;
    }

    public short getABLineVoltageOfPowerGrid() {
        return ABLineVoltageOfPowerGrid;
    }

    public void setABLineVoltageOfPowerGrid(short ABLineVoltageOfPowerGrid) {
        this.ABLineVoltageOfPowerGrid = ABLineVoltageOfPowerGrid;
    }

    public short getBCLineVoltageOfPowerGrid() {
        return BCLineVoltageOfPowerGrid;
    }

    public void setBCLineVoltageOfPowerGrid(short BCLineVoltageOfPowerGrid) {
        this.BCLineVoltageOfPowerGrid = BCLineVoltageOfPowerGrid;
    }

    public short getCALineVoltageOfPowerGrid() {
        return CALineVoltageOfPowerGrid;
    }

    public void setCALineVoltageOfPowerGrid(short CALineVoltageOfPowerGrid) {
        this.CALineVoltageOfPowerGrid = CALineVoltageOfPowerGrid;
    }

    public short getAPhaseVoltage() {
        return APhaseVoltage;
    }

    public void setAPhaseVoltage(short APhaseVoltage) {
        this.APhaseVoltage = APhaseVoltage;
    }

    public short getBPhaseVoltage() {
        return BPhaseVoltage;
    }

    public void setBPhaseVoltage(short BPhaseVoltage) {
        this.BPhaseVoltage = BPhaseVoltage;
    }

    public short getCPhaseVoltage() {
        return CPhaseVoltage;
    }

    public void setCPhaseVoltage(short CPhaseVoltage) {
        this.CPhaseVoltage = CPhaseVoltage;
    }

    public short getAPhaseCurrent() {
        return APhaseCurrent;
    }

    public void setAPhaseCurrent(short APhaseCurrent) {
        this.APhaseCurrent = APhaseCurrent;
    }

    public short getBPhaseCurrent() {
        return BPhaseCurrent;
    }

    public void setBPhaseCurrent(short BPhaseCurrent) {
        this.BPhaseCurrent = BPhaseCurrent;
    }

    public short getCPhaseCurrent() {
        return CPhaseCurrent;
    }

    public void setCPhaseCurrent(short CPhaseCurrent) {
        this.CPhaseCurrent = CPhaseCurrent;
    }

    public short getSystemFrequency() {
        return SystemFrequency;
    }

    public void setSystemFrequency(short systemFrequency) {
        SystemFrequency = systemFrequency;
    }

    public short getAcActivePower() {
        return AcActivePower;
    }

    public void setAcActivePower(short acActivePower) {
        AcActivePower = acActivePower;
    }

    public short getAcInActivePower() {
        return AcInActivePower;
    }

    public void setAcInActivePower(short acInActivePower) {
        AcInActivePower = acInActivePower;
    }

    public short getPowerFactor() {
        return PowerFactor;
    }

    public void setPowerFactor(short powerFactor) {
        PowerFactor = powerFactor;
    }

    public short getConversionEfficiency() {
        return ConversionEfficiency;
    }

    public void setConversionEfficiency(short conversionEfficiency) {
        ConversionEfficiency = conversionEfficiency;
    }

    public short getHighestTemperatureModule() {
        return HighestTemperatureModule;
    }

    public void setHighestTemperatureModule(short highestTemperatureModule) {
        HighestTemperatureModule = highestTemperatureModule;
    }

    public short getModuleA1Temperature() {
        return ModuleA1Temperature;
    }

    public void setModuleA1Temperature(short moduleA1Temperature) {
        ModuleA1Temperature = moduleA1Temperature;
    }

    public short getTotalGeneratingCapacityLow() {
        return TotalGeneratingCapacityLow;
    }

    public void setTotalGeneratingCapacityLow(short totalGeneratingCapacityLow) {
        TotalGeneratingCapacityLow = totalGeneratingCapacityLow;
    }

    public short getTotalGeneratingCapacityHigh() {
        return TotalGeneratingCapacityHigh;
    }

    public void setTotalGeneratingCapacityHigh(short totalGeneratingCapacityHigh) {
        TotalGeneratingCapacityHigh = totalGeneratingCapacityHigh;
    }
}
