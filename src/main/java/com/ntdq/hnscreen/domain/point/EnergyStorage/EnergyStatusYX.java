package com.ntdq.hnscreen.domain.point.EnergyStorage;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

@AttributeInfo(startIndex = 18289, endIndex = 18325, funcType = 3)
@Topic(topicName = "ENERGY_STATUS_YX")
public class EnergyStatusYX extends BasePointInfo {

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
}
