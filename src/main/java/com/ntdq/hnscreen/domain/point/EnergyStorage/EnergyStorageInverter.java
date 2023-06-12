package com.ntdq.hnscreen.domain.point.EnergyStorage;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 储能逆变器
 */
@AttributeInfo(startIndex = 18189, endIndex = 18417, type = 0)
public class EnergyStorageInverter extends BasePointInfo {


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
     * 故障停机
     */
    @ModelArguments(code = "RemoteSettingFailure", mean = "遥调指令故障", number = 18216)
    private short RemoteSettingFailure;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "ModelCheckFailure", mean = "模式校验错误", number = 18217)
    private short ModelCheckFailure;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "RemoteControlHave", mean = "远方控制使能", number = 18289)
    private short RemoteControlHave;


    /**
     * 功率因数
     */
    @ModelArguments(code = "BMSControlHave", mean = "BMS控制使能", number = 18290)
    private short BMSControlHave;

    /**
     * 转换效率
     */
    @ModelArguments(code = "StartCommand", mean = "启动命令", number = 18291)
    private short StartCommand;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "StopCommand", mean = "停机命令", number = 18292)
    private short StopCommand;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "AutomaticSwitchMachine", mean = "自动开关机", number = 18293)
    private short AutomaticSwitchMachine;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "BlackSwitchCommand", mean = "黑启动命令", number = 18294)
    private short BlackSwitchCommand;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "DcVoltageControlMode", mean = "投直流电压控制模式", number = 18295)
    private short DcVoltageControlMode;


    //==================================
    @ModelArguments(code = "ForDcCurrentControlMode", mean = "投直流电流控制模式", number = 18296)
    private short ForDcCurrentControlMode;

    @ModelArguments(code = "DcPowerControlMode", mean = "投直流功率控制模式", number = 18297)
    private short DcPowerControlMode;

    /***
     * 启动命令
     */
    @ModelArguments(code = "AcPowerControlMode", mean = "投交流功率控制模式 ", number = 18298)
    private short AcPowerControlMode;

    /***
     * 启动命令
     */
    @ModelArguments(code = "PowerFactorControlMode", mean = "投功率因数控制模式", number = 18299)
    private short PowerFactorControlMode;

    /***
     * 停机命令
     */
    @ModelArguments(code = "VSGControlMode", mean = "投VSG控制模式", number = 18300)
    private short VSGControlMode;

    /**
     * 正常运行
     */
    @ModelArguments(code = "VFControlMode", mean = "投VF控制模式", number = 18301)
    private short VFControlMode;

    /**
     * 告警运行
     */
    @ModelArguments(code = "TFNotCastMode", mean = "投充放末期转恒压模式", number = 18302)
    private short TFNotCastMode;

    /**
     * 待机状态
     */
    @ModelArguments(code = "ForVirtualImpedance", mean = "投虚拟阻抗", number = 18303)
    private short ForVirtualImpedance;

    /**
     * 正常停机
     */
    @ModelArguments(code = "NSVoltageControl", mean = "投负序电压控制", number = 18304)
    private short NSVoltageControl;

    /**
     * 故障停机
     */
    @ModelArguments(code = "RunningNormal", mean = "正常运行", number = 18305)
    private short RunningNormal;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "RunningAlarm", mean = "告警运行", number = 18306)
    private short RunningAlarm;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "StandByStatus", mean = "待机状态", number = 18307)
    private short StandByStatus;


    /**
     * 功率因数
     */
    @ModelArguments(code = "NormalDown", mean = "正常停机", number = 18308)
    private short NormalDown;

    /**
     * 转换效率
     */
    @ModelArguments(code = "FaultDown", mean = "故障停机", number = 18309)
    private short FaultDown;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "EnoughDownAuto", mean = "充满自动停机", number = 18310)
    private short EnoughDownAuto;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "EmptyDownAuto", mean = "放空自动停机", number = 18311)
    private short EmptyDownAuto;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "InverterAlarm", mean = "逆变器告警", number = 18312)
    private short InverterAlarm;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "HighTemperatureAlarm", mean = "高温告警", number = 18313)
    private short HighTemperatureAlarm;


    @ModelArguments(code = "HighTemperatureDecrease", mean = "高温降额", number = 18314)
    private short HighTemperatureDecrease;


    @ModelArguments(code = "DcInsulationAbnormal", mean = "直流绝缘异常", number = 18315)
    private short DcInsulationAbnormal;

    /***
     * 启动命令
     */
    @ModelArguments(code = "InsulationMonitoringFailure", mean = "绝缘监测失效 ", number = 18316)
    private short InsulationMonitoringFailure;

    /***
     * 启动命令
     */
    @ModelArguments(code = "ExcessiveLeakageCurrentAlarm", mean = "漏电流超标告警", number = 18317)
    private short ExcessiveLeakageCurrentAlarm;

    /***
     * 停机命令
     */
    @ModelArguments(code = "ModuleTemperatureElementAnomaly", mean = "模组测温元件异常", number = 18318)
    private short ModuleTemperatureElementAnomaly;

    /**
     * 正常运行
     */
    @ModelArguments(code = "FanAbnormalLoop", mean = "风机回路异常", number = 18319)
    private short FanAbnormalLoop;

    /**
     * 告警运行
     */
    @ModelArguments(code = "InverterSwitchFailure", mean = "逆变器分合闸失败", number = 18320)
    private short InverterSwitchFailure;

    /**
     * 待机状态
     */
    @ModelArguments(code = "SamplingAbnormal", mean = "采样异常", number = 18321)
    private short SamplingAbnormal;

    /**
     * 正常停机
     */
    @ModelArguments(code = "EmergencyStop", mean = "紧急停机", number = 18322)
    private short EmergencyStop;

    /**
     * 故障停机
     */
    @ModelArguments(code = "EmergencyShutdown", mean = "紧急停运（来自外部", number = 18323)
    private short EmergencyShutdown;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "TransformerTemperatureSignal", mean = "变压器温度信号", number = 18324)
    private short TransformerTemperatureSignal;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "ContainerFireSignal", mean = "集装箱火灾信号", number = 18325)
    private short ContainerFireSignal;


    /**
     * 功率因数
     */
    @ModelArguments(code = "DcIntoTheLineVoltage", mean = "直流进线电压", number = 18389)
    private short DcIntoTheLineVoltage;

    /**
     * 转换效率
     */
    @ModelArguments(code = "DcBusVoltage", mean = "直流母线电压", number = 18390)
    private short DcBusVoltage;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "DcCurrent", mean = "直流电流", number = 18391)
    private short DcCurrent;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "DcPower", mean = "直流功率", number = 18392)
    private short DcPower;
//wwwwwwwww
    /**
     * 总放电量低位
     */
    @ModelArguments(code = "ABLineVoltageOfPowerGrid", mean = "电网AB线电压", number = 18393)
    private short ABLineVoltageOfPowerGrid;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "BCLineVoltageOfPowerGrid", mean = "电网BC线电压", number = 18394)
    private short BCLineVoltageOfPowerGrid;

//======**********

    /**
     * 正常停机
     */
    @ModelArguments(code = "CALineVoltageOfPowerGrid", mean = "电网CA线电压", number = 18395)
    private short CALineVoltageOfPowerGrid;

    /**
     * 故障停机
     */
    @ModelArguments(code = "APhaseVoltage", mean = "A相电压", number = 18396)
    private short APhaseVoltage;

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "BPhaseVoltage", mean = "B相电压", number = 18397)
    private short BPhaseVoltage;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "CPhaseVoltage", mean = "C相电压", number = 18398)
    private short CPhaseVoltage;


    /**
     * 功率因数
     */
    @ModelArguments(code = "APhaseCurrent", mean = "A相电流", number = 18399)
    private short APhaseCurrent;

    /**
     * 转换效率
     */
    @ModelArguments(code = "BPhaseCurrent", mean = "B相电流", number = 18400)
    private short BPhaseCurrent;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "CPhaseCurrent", mean = "C相电流", number = 18401)
    private short CPhaseCurrent;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "SystemFrequency", mean = "系统频率", number = 18402)
    private short SystemFrequency;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "AcActivePower", mean = "交流有功功率", number = 18403)
    private short AcActivePower;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "AcInActivePower", mean = "交流无功功率", number = 18404)
    private short AcInActivePower;

// 9999999

    /**
     * 交流有功功率
     */
    @ModelArguments(code = "PowerFactor", mean = "功率因数", number = 18405)
    private short PowerFactor;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "ConversionEfficiency", mean = "转换效率", number = 18406)
    private short ConversionEfficiency;


    /**
     * 功率因数
     */
    @ModelArguments(code = "HighestTemperatureModule", mean = "模组最高温度", number = 18407)
    private short HighestTemperatureModule;

    /**
     * 转换效率
     */
    @ModelArguments(code = "ModuleA1Temperature", mean = "模块A1温度", number = 18408)
    private short ModuleA1Temperature;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "ModuleB1Temperature", mean = "模块B1温度", number = 18409)
    private short ModuleB1Temperature;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "ModuleC1Temperature", mean = "模块C1温度", number = 18410)
    private short ModuleC1Temperature;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "ModuleA2Temperature", mean = "模块A2温度", number = 18411)
    private short ModuleA2Temperature;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "ModuleB2Temperature", mean = "模块B2温度", number = 18412)
    private short ModuleB2Temperature;


//000


    /**
     * 交流有功功率
     */
    @ModelArguments(code = "ModuleC2Temperature", mean = "模块C2温度", number = 18413)
    private short ModuleC2Temperature;

    /**
     * 交流无功功率
     */
    @ModelArguments(code = "TotalGeneratingCapacityLow", mean = "总发电量低位", number = 18414)
    private short TotalGeneratingCapacityLow;


    /**
     * 功率因数
     */
    @ModelArguments(code = "TotalGeneratingCapacityHigh", mean = "总发电量高位", number = 18415)
    private short TotalGeneratingCapacityHigh;

    /**
     * 转换效率
     */
    @ModelArguments(code = "TotalConsumeLow", mean = "总放电量低位", number = 18416)
    private short TotalConsumeLow;

    /**
     * 总发电量低位
     */
    @ModelArguments(code = "TotalConsumeHigh", mean = "总放电量高位 ", number = 18417)
    private short TotalConsumeHigh;


    /**
     * 总发电量高位
     */
    @ModelArguments(code = "RemoteRegulatingActive", mean = "遥调有功", number = 18489)
    private short RemoteRegulatingActive;

    /**
     * 总放电量低位
     */
    @ModelArguments(code = "RemoteControlSwitchMachine", mean = "遥控开关机", number = 18490)
    private short RemoteControlSwitchMachine;


    /**
     * 总放电量高位
     */
    @ModelArguments(code = "SignalReset", mean = "信号复归", number = 18491)
    private short SignalReset;


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

    public short getRemoteControlHave() {
        return RemoteControlHave;
    }

    public void setRemoteControlHave(short remoteControlHave) {
        RemoteControlHave = remoteControlHave;
    }

    public short getBMSControlHave() {
        return BMSControlHave;
    }

    public void setBMSControlHave(short BMSControlHave) {
        this.BMSControlHave = BMSControlHave;
    }

    public short getStartCommand() {
        return StartCommand;
    }

    public void setStartCommand(short startCommand) {
        StartCommand = startCommand;
    }

    public short getStopCommand() {
        return StopCommand;
    }

    public void setStopCommand(short stopCommand) {
        StopCommand = stopCommand;
    }

    public short getAutomaticSwitchMachine() {
        return AutomaticSwitchMachine;
    }

    public void setAutomaticSwitchMachine(short automaticSwitchMachine) {
        AutomaticSwitchMachine = automaticSwitchMachine;
    }

    public short getBlackSwitchCommand() {
        return BlackSwitchCommand;
    }

    public void setBlackSwitchCommand(short blackSwitchCommand) {
        BlackSwitchCommand = blackSwitchCommand;
    }

    public short getDcVoltageControlMode() {
        return DcVoltageControlMode;
    }

    public void setDcVoltageControlMode(short dcVoltageControlMode) {
        DcVoltageControlMode = dcVoltageControlMode;
    }

    public short getForDcCurrentControlMode() {
        return ForDcCurrentControlMode;
    }

    public void setForDcCurrentControlMode(short forDcCurrentControlMode) {
        ForDcCurrentControlMode = forDcCurrentControlMode;
    }

    public short getDcPowerControlMode() {
        return DcPowerControlMode;
    }

    public void setDcPowerControlMode(short dcPowerControlMode) {
        DcPowerControlMode = dcPowerControlMode;
    }

    public short getAcPowerControlMode() {
        return AcPowerControlMode;
    }

    public void setAcPowerControlMode(short acPowerControlMode) {
        AcPowerControlMode = acPowerControlMode;
    }

    public short getPowerFactorControlMode() {
        return PowerFactorControlMode;
    }

    public void setPowerFactorControlMode(short powerFactorControlMode) {
        PowerFactorControlMode = powerFactorControlMode;
    }

    public short getVSGControlMode() {
        return VSGControlMode;
    }

    public void setVSGControlMode(short VSGControlMode) {
        this.VSGControlMode = VSGControlMode;
    }

    public short getVFControlMode() {
        return VFControlMode;
    }

    public void setVFControlMode(short VFControlMode) {
        this.VFControlMode = VFControlMode;
    }

    public short getTFNotCastMode() {
        return TFNotCastMode;
    }

    public void setTFNotCastMode(short TFNotCastMode) {
        this.TFNotCastMode = TFNotCastMode;
    }

    public short getForVirtualImpedance() {
        return ForVirtualImpedance;
    }

    public void setForVirtualImpedance(short forVirtualImpedance) {
        ForVirtualImpedance = forVirtualImpedance;
    }

    public short getNSVoltageControl() {
        return NSVoltageControl;
    }

    public void setNSVoltageControl(short NSVoltageControl) {
        this.NSVoltageControl = NSVoltageControl;
    }

    public short getRunningNormal() {
        return RunningNormal;
    }

    public void setRunningNormal(short runningNormal) {
        RunningNormal = runningNormal;
    }

    public short getRunningAlarm() {
        return RunningAlarm;
    }

    public void setRunningAlarm(short runningAlarm) {
        RunningAlarm = runningAlarm;
    }

    public short getStandByStatus() {
        return StandByStatus;
    }

    public void setStandByStatus(short standByStatus) {
        StandByStatus = standByStatus;
    }

    public short getNormalDown() {
        return NormalDown;
    }

    public void setNormalDown(short normalDown) {
        NormalDown = normalDown;
    }

    public short getFaultDown() {
        return FaultDown;
    }

    public void setFaultDown(short faultDown) {
        FaultDown = faultDown;
    }

    public short getEnoughDownAuto() {
        return EnoughDownAuto;
    }

    public void setEnoughDownAuto(short enoughDownAuto) {
        EnoughDownAuto = enoughDownAuto;
    }

    public short getEmptyDownAuto() {
        return EmptyDownAuto;
    }

    public void setEmptyDownAuto(short emptyDownAuto) {
        EmptyDownAuto = emptyDownAuto;
    }

    public short getInverterAlarm() {
        return InverterAlarm;
    }

    public void setInverterAlarm(short inverterAlarm) {
        InverterAlarm = inverterAlarm;
    }

    public short getHighTemperatureAlarm() {
        return HighTemperatureAlarm;
    }

    public void setHighTemperatureAlarm(short highTemperatureAlarm) {
        HighTemperatureAlarm = highTemperatureAlarm;
    }

    public short getHighTemperatureDecrease() {
        return HighTemperatureDecrease;
    }

    public void setHighTemperatureDecrease(short highTemperatureDecrease) {
        HighTemperatureDecrease = highTemperatureDecrease;
    }

    public short getDcInsulationAbnormal() {
        return DcInsulationAbnormal;
    }

    public void setDcInsulationAbnormal(short dcInsulationAbnormal) {
        DcInsulationAbnormal = dcInsulationAbnormal;
    }

    public short getInsulationMonitoringFailure() {
        return InsulationMonitoringFailure;
    }

    public void setInsulationMonitoringFailure(short insulationMonitoringFailure) {
        InsulationMonitoringFailure = insulationMonitoringFailure;
    }

    public short getExcessiveLeakageCurrentAlarm() {
        return ExcessiveLeakageCurrentAlarm;
    }

    public void setExcessiveLeakageCurrentAlarm(short excessiveLeakageCurrentAlarm) {
        ExcessiveLeakageCurrentAlarm = excessiveLeakageCurrentAlarm;
    }

    public short getModuleTemperatureElementAnomaly() {
        return ModuleTemperatureElementAnomaly;
    }

    public void setModuleTemperatureElementAnomaly(short moduleTemperatureElementAnomaly) {
        ModuleTemperatureElementAnomaly = moduleTemperatureElementAnomaly;
    }

    public short getFanAbnormalLoop() {
        return FanAbnormalLoop;
    }

    public void setFanAbnormalLoop(short fanAbnormalLoop) {
        FanAbnormalLoop = fanAbnormalLoop;
    }

    public short getInverterSwitchFailure() {
        return InverterSwitchFailure;
    }

    public void setInverterSwitchFailure(short inverterSwitchFailure) {
        InverterSwitchFailure = inverterSwitchFailure;
    }

    public short getSamplingAbnormal() {
        return SamplingAbnormal;
    }

    public void setSamplingAbnormal(short samplingAbnormal) {
        SamplingAbnormal = samplingAbnormal;
    }

    public short getEmergencyStop() {
        return EmergencyStop;
    }

    public void setEmergencyStop(short emergencyStop) {
        EmergencyStop = emergencyStop;
    }

    public short getEmergencyShutdown() {
        return EmergencyShutdown;
    }

    public void setEmergencyShutdown(short emergencyShutdown) {
        EmergencyShutdown = emergencyShutdown;
    }

    public short getTransformerTemperatureSignal() {
        return TransformerTemperatureSignal;
    }

    public void setTransformerTemperatureSignal(short transformerTemperatureSignal) {
        TransformerTemperatureSignal = transformerTemperatureSignal;
    }

    public short getContainerFireSignal() {
        return ContainerFireSignal;
    }

    public void setContainerFireSignal(short containerFireSignal) {
        ContainerFireSignal = containerFireSignal;
    }

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

    public short getModuleB1Temperature() {
        return ModuleB1Temperature;
    }

    public void setModuleB1Temperature(short moduleB1Temperature) {
        ModuleB1Temperature = moduleB1Temperature;
    }

    public short getModuleC1Temperature() {
        return ModuleC1Temperature;
    }

    public void setModuleC1Temperature(short moduleC1Temperature) {
        ModuleC1Temperature = moduleC1Temperature;
    }

    public short getModuleA2Temperature() {
        return ModuleA2Temperature;
    }

    public void setModuleA2Temperature(short moduleA2Temperature) {
        ModuleA2Temperature = moduleA2Temperature;
    }

    public short getModuleB2Temperature() {
        return ModuleB2Temperature;
    }

    public void setModuleB2Temperature(short moduleB2Temperature) {
        ModuleB2Temperature = moduleB2Temperature;
    }

    public short getModuleC2Temperature() {
        return ModuleC2Temperature;
    }

    public void setModuleC2Temperature(short moduleC2Temperature) {
        ModuleC2Temperature = moduleC2Temperature;
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

    public short getTotalConsumeLow() {
        return TotalConsumeLow;
    }

    public void setTotalConsumeLow(short totalConsumeLow) {
        TotalConsumeLow = totalConsumeLow;
    }

    public short getTotalConsumeHigh() {
        return TotalConsumeHigh;
    }

    public void setTotalConsumeHigh(short totalConsumeHigh) {
        TotalConsumeHigh = totalConsumeHigh;
    }

    public short getRemoteRegulatingActive() {
        return RemoteRegulatingActive;
    }

    public void setRemoteRegulatingActive(short remoteRegulatingActive) {
        RemoteRegulatingActive = remoteRegulatingActive;
    }

    public short getRemoteControlSwitchMachine() {
        return RemoteControlSwitchMachine;
    }

    public void setRemoteControlSwitchMachine(short remoteControlSwitchMachine) {
        RemoteControlSwitchMachine = remoteControlSwitchMachine;
    }

    public short getSignalReset() {
        return SignalReset;
    }

    public void setSignalReset(short signalReset) {
        SignalReset = signalReset;
    }

    public static void main(String[] args) {
        EnergyStorageInverter energyStorageInverter = new EnergyStorageInverter();
        System.out.println(energyStorageInverter.getClass().getDeclaredFields().length);
    }
}
