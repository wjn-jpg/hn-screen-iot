package com.ntdq.hnscreen.domain.point.EnergyStorage;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

@AttributeInfo(startIndex = 18189, endIndex = 18217, funcType = 3)
@Topic(topicName = "ENERGY_PROTECT_YX")
public class EnergyProtectYX extends BasePointInfo {

    /**
     * 整组启动
     */
    @ModelArguments(code = "OutputVoltage", mean = "输出电压", number = 18189)
    private short OutputVoltage;


    @ModelArguments(code = "ProtectionAction", mean = "保护动作", number = 18190)
    private short ProtectionAction;

    /***
     * 启动命令
     */
    @ModelArguments(code = "DCOverCurrentProtection", mean = "直流过流保护", number = 18191)
    private short DCOverCurrentProtection;

    /***
     * 启动命令
     */
    @ModelArguments(code = "DCOverVoltageProtection", mean = "直流过压保护", number = 18192)
    private short DCOverVoltageProtection;

    /***
     * 停机命令
     */
    @ModelArguments(code = "DCUnderVoltageProtection", mean = "直流欠压保护", number = 18193)
    private short DCUnderVoltageProtection;

    /**
     * 正常运行
     */
    @ModelArguments(code = "DCReverseConnectionProtection", mean = "直流反接保护", number = 18194)
    private short DCReverseConnectionProtection;

    /**
     * 告警运行
     * DC anti backdischarge protection
     */
    @ModelArguments(code = "DCAntiProtection", mean = "直流防反放电保护", number = 18195)
    private short DCAntiProtection;

    /**
     * AC overcurrent protection
     * 待机状态
     */
    @ModelArguments(code = "ACOverCurrentProtection", mean = "交流过流保护", number = 18196)
    private short ACOverCurrentProtection;

    /**
     * AC current imbalance protection
     * 正常停机
     */
    @ModelArguments(code = "ACCurrentImbalanceProtection", mean = "交流电流不平衡保护", number = 18197)
    private short ACCurrentImbalanceProtection;

    /**
     * AC overvoltage protection
     * 故障停机
     */
    @ModelArguments(code = "ACOverVoltageProtection", mean = "交流过压保护", number = 18198)
    private short ACOverVoltageProtection;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "AcUnderVoltageProtection", mean = "交流欠压保护", number = 18199)
    private short AcUnderVoltageProtection;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "VoltageImbalanceProtection", mean = "交流电压不平衡保护", number = 18200)
    private short VoltageImbalanceProtection;


    /**
     * 功率因数
     */
    @ModelArguments(code = "OverFrequencyProtection", mean = "过频保护", number = 18201)
    private short OverFrequencyProtection;

    /**
     * 转换效率
     */
    @ModelArguments(code = "LowFrequencyProtection", mean = "欠频保护", number = 18202)
    private short LowFrequencyProtection;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "OverTemperatureProtection", mean = "过温保护", number = 18203)
    private short OverTemperatureProtection;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "LowTemperatureAtresia", mean = "低温闭锁", number = 18204)
    private short LowTemperatureAtresia;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "OverloadProtection", mean = "过载保护", number = 18205)
    private short OverloadProtection;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "LVRTProtection", mean = "LVRT保护", number = 18206)
    private short LVRTProtection;


    @ModelArguments(code = "DriverProtection", mean = "驱动保护", number = 18207)
    private short DriverProtection;


    @ModelArguments(code = "ADriveProtection", mean = "A相驱动保护", number = 18208)
    private short ADriveProtection;

    /***
     * 启动命令
     */
    @ModelArguments(code = "BDriveProtection", mean = "B相驱动保护", number = 18209)
    private short BDriveProtection;

    /***
     * 启动命令
     */
    @ModelArguments(code = "CDriveProtection", mean = "C相驱动保护", number = 18210)
    private short CDriveProtection;

    /***
     * 停机命令
     */
    @ModelArguments(code = "InverterInternalFault", mean = "逆变器内部故障", number = 18211)
    private short InverterInternalFault;

    /**
     * 正常运行
     */
    @ModelArguments(code = "PulseBlocking", mean = "脉冲闭锁", number = 18212)
    private short PulseBlocking;

    /**
     * 告警运行
     */
    @ModelArguments(code = "PTAbnormalProtection", mean = "PT异常保护", number = 18213)
    private short PTAbnormalProtection;

    /**
     * 待机状态
     */
    @ModelArguments(code = "LeakageCurrentProtection", mean = "漏电流保护", number = 18214)
    private short LeakageCurrentProtection;

    /**
     * 正常停机
     */
    @ModelArguments(code = "AuxiliaryPowerSupplyProtection", mean = "辅助电源异常保护", number = 18215)
    private short AuxiliaryPowerSupplyProtection;

    /**
     * 遥调指令故障
     */
    @ModelArguments(code = "RemoteSettingFailure", mean = "遥调指令故障", number = 18216)
    private short RemoteSettingFailure;

    /**
     * 模式校验错误
     */
    @ModelArguments(code = "ModelCheckFailure", mean = "模式校验错误", number = 18217)
    private short ModelCheckFailure;

    public short getOutputVoltage() {
        return OutputVoltage;
    }

    public void setOutputVoltage(short outputVoltage) {
        OutputVoltage = outputVoltage;
    }

    public short getProtectionAction() {
        return ProtectionAction;
    }

    public void setProtectionAction(short protectionAction) {
        ProtectionAction = protectionAction;
    }

    public short getDCOverCurrentProtection() {
        return DCOverCurrentProtection;
    }

    public void setDCOverCurrentProtection(short DCOverCurrentProtection) {
        this.DCOverCurrentProtection = DCOverCurrentProtection;
    }

    public short getDCOverVoltageProtection() {
        return DCOverVoltageProtection;
    }

    public void setDCOverVoltageProtection(short DCOverVoltageProtection) {
        this.DCOverVoltageProtection = DCOverVoltageProtection;
    }

    public short getDCUnderVoltageProtection() {
        return DCUnderVoltageProtection;
    }

    public void setDCUnderVoltageProtection(short DCUnderVoltageProtection) {
        this.DCUnderVoltageProtection = DCUnderVoltageProtection;
    }

    public short getDCReverseConnectionProtection() {
        return DCReverseConnectionProtection;
    }

    public void setDCReverseConnectionProtection(short DCReverseConnectionProtection) {
        this.DCReverseConnectionProtection = DCReverseConnectionProtection;
    }

    public short getDCAntiProtection() {
        return DCAntiProtection;
    }

    public void setDCAntiProtection(short DCAntiProtection) {
        this.DCAntiProtection = DCAntiProtection;
    }

    public short getACOverCurrentProtection() {
        return ACOverCurrentProtection;
    }

    public void setACOverCurrentProtection(short ACOverCurrentProtection) {
        this.ACOverCurrentProtection = ACOverCurrentProtection;
    }

    public short getACCurrentImbalanceProtection() {
        return ACCurrentImbalanceProtection;
    }

    public void setACCurrentImbalanceProtection(short ACCurrentImbalanceProtection) {
        this.ACCurrentImbalanceProtection = ACCurrentImbalanceProtection;
    }

    public short getACOverVoltageProtection() {
        return ACOverVoltageProtection;
    }

    public void setACOverVoltageProtection(short ACOverVoltageProtection) {
        this.ACOverVoltageProtection = ACOverVoltageProtection;
    }

    public short getAcUnderVoltageProtection() {
        return AcUnderVoltageProtection;
    }

    public void setAcUnderVoltageProtection(short acUnderVoltageProtection) {
        AcUnderVoltageProtection = acUnderVoltageProtection;
    }

    public short getVoltageImbalanceProtection() {
        return VoltageImbalanceProtection;
    }

    public void setVoltageImbalanceProtection(short voltageImbalanceProtection) {
        VoltageImbalanceProtection = voltageImbalanceProtection;
    }

    public short getOverFrequencyProtection() {
        return OverFrequencyProtection;
    }

    public void setOverFrequencyProtection(short overFrequencyProtection) {
        OverFrequencyProtection = overFrequencyProtection;
    }

    public short getLowFrequencyProtection() {
        return LowFrequencyProtection;
    }

    public void setLowFrequencyProtection(short lowFrequencyProtection) {
        LowFrequencyProtection = lowFrequencyProtection;
    }

    public short getOverTemperatureProtection() {
        return OverTemperatureProtection;
    }

    public void setOverTemperatureProtection(short overTemperatureProtection) {
        OverTemperatureProtection = overTemperatureProtection;
    }

    public short getLowTemperatureAtresia() {
        return LowTemperatureAtresia;
    }

    public void setLowTemperatureAtresia(short lowTemperatureAtresia) {
        LowTemperatureAtresia = lowTemperatureAtresia;
    }

    public short getOverloadProtection() {
        return OverloadProtection;
    }

    public void setOverloadProtection(short overloadProtection) {
        OverloadProtection = overloadProtection;
    }

    public short getLVRTProtection() {
        return LVRTProtection;
    }

    public void setLVRTProtection(short LVRTProtection) {
        this.LVRTProtection = LVRTProtection;
    }

    public short getDriverProtection() {
        return DriverProtection;
    }

    public void setDriverProtection(short driverProtection) {
        DriverProtection = driverProtection;
    }

    public short getADriveProtection() {
        return ADriveProtection;
    }

    public void setADriveProtection(short ADriveProtection) {
        this.ADriveProtection = ADriveProtection;
    }

    public short getBDriveProtection() {
        return BDriveProtection;
    }

    public void setBDriveProtection(short BDriveProtection) {
        this.BDriveProtection = BDriveProtection;
    }

    public short getCDriveProtection() {
        return CDriveProtection;
    }

    public void setCDriveProtection(short CDriveProtection) {
        this.CDriveProtection = CDriveProtection;
    }

    public short getInverterInternalFault() {
        return InverterInternalFault;
    }

    public void setInverterInternalFault(short inverterInternalFault) {
        InverterInternalFault = inverterInternalFault;
    }

    public short getPulseBlocking() {
        return PulseBlocking;
    }

    public void setPulseBlocking(short pulseBlocking) {
        PulseBlocking = pulseBlocking;
    }

    public short getPTAbnormalProtection() {
        return PTAbnormalProtection;
    }

    public void setPTAbnormalProtection(short PTAbnormalProtection) {
        this.PTAbnormalProtection = PTAbnormalProtection;
    }

    public short getLeakageCurrentProtection() {
        return LeakageCurrentProtection;
    }

    public void setLeakageCurrentProtection(short leakageCurrentProtection) {
        LeakageCurrentProtection = leakageCurrentProtection;
    }

    public short getAuxiliaryPowerSupplyProtection() {
        return AuxiliaryPowerSupplyProtection;
    }

    public void setAuxiliaryPowerSupplyProtection(short auxiliaryPowerSupplyProtection) {
        AuxiliaryPowerSupplyProtection = auxiliaryPowerSupplyProtection;
    }

    public short getRemoteSettingFailure() {
        return RemoteSettingFailure;
    }

    public void setRemoteSettingFailure(short remoteSettingFailure) {
        RemoteSettingFailure = remoteSettingFailure;
    }

    public short getModelCheckFailure() {
        return ModelCheckFailure;
    }

    public void setModelCheckFailure(short modelCheckFailure) {
        ModelCheckFailure = modelCheckFailure;
    }
}
