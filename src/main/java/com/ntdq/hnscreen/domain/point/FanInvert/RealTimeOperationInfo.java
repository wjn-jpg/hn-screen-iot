package com.ntdq.hnscreen.domain.point.FanInvert;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 实时运行信息
 */
@AttributeInfo(startIndex = 4096, endIndex = 4143, funcType = 4)
@Topic(topicName = "FAN_REAL_YC")
public class RealTimeOperationInfo extends BasePointInfo {


    /**
     * 输出电压
     */
    @ModelArguments(code = "OutputVoltage", mean = "输出电压", number = 4096)
    private float OutputVoltage;

    /**
     * 输出电流
     */
    @ModelArguments(code = "OutputCurrent", mean = "输出电流", number = 4097)
    private float OutputCurrent;

    /**
     * 光伏电压
     */
    @ModelArguments(code = "PhotovoltaicVoltage", mean = "光伏电压", number = 4098)
    private float PhotovoltaicVoltage;

    /**
     * 光伏电流
     */
    @ModelArguments(code = "PhotovoltaicCurrent", mean = "光伏电流", number = 4099)
    private float PhotovoltaicCurrent;

    /**
     * 风机电压
     */
    @ModelArguments(code = "FanVoltage", mean = "风机电压", number = 4100)
    private float FanVoltage;

    /**
     * 风机电流
     */
    @ModelArguments(code = "FanCurrent", mean = "风机电流", number = 4101)
    private float FanCurrent;

    /**
     * 泄荷电流
     */
    @ModelArguments(code = "DischargeCurrent", mean = "泄荷电流", number = 4102)
    private float DischargeCurrent;

    /**
     * 输出功率
     */
    @ModelArguments(code = "OutPower", mean = "输出功率", number = 4103)
    private float OutPower;

    /**
     * 峰值平均
     */
    @ModelArguments(code = "PeakAverage", mean = "峰值平均", number = 4104)
    private float PeakAverage;

    /**
     * 风电功率
     */
    @ModelArguments(code = "WindPower", mean = "风电功率", number = 4105)
    private float WindPower;

    /**
     * 泄荷功率
     */
    @ModelArguments(code = "DischargePower", mean = "泄荷功率", number = 4106)
    private float DischargePower;

    /**
     * 风机频率
     */
    @ModelArguments(code = "FanFrequency", mean = "风机频率", number = 4107)
    private float FanFrequency;

    /**
     * 风机转速
     */
    @ModelArguments(code = "fanSpeed", mean = "风机转速", number = 4108)
    private float fanSpeed;

    /**
     * 转速加速度
     */
    @ModelArguments(code = "SpeedAcceleration", mean = "转速加速度", number = 4109)
    private float SpeedAcceleration;

    /**
     * 转矩
     */
    @ModelArguments(code = "torque", mean = "转矩", number = 4110)
    private float torque;

    /**
     * 泄荷温度
     */
    @ModelArguments(code = "DischargeTemperature", mean = "泄荷温度", number = 4111)
    private float DischargeTemperature;

    /**
     * 左散热器T2
     */
    @ModelArguments(code = "LeftRadiatorT2", mean = "左散热器T2", number = 4112)
    private float LeftRadiatorT2;

    /**
     * 右散热器T1
     */
    @ModelArguments(code = "RightRadiatorT1", mean = "右散热器T1", number = 4113)
    private float RightRadiatorT1;

    /**
     * 泄荷平均
     */
    @ModelArguments(code = "DischargeAverage", mean = "泄荷平均", number = 4114)
    private float DischargeAverage;

    /**
     * 当日发电量
     */
    @ModelArguments(code = "DailyPowerGeneration", mean = "当日发电量", number = 4115, length = 4)
    private float DailyPowerGeneration;

    /**
     * 瞬时风速
     */
    @ModelArguments(code = "InstantaneousWindSpeed", mean = "瞬时风速", number = 4117)
    private float InstantaneousWindSpeed;

    /**
     * 平均风速
     */
    @ModelArguments(code = "AverageWindSpeed", mean = "平均风速", number = 4118)
    private float AverageWindSpeed;

    /**
     * 总发电量
     */
    @ModelArguments(code = "TotalPowerGeneration", mean = "总发电量", number = 4119, length = 4)
    private float TotalPowerGeneration;

    /**
     * 输出平均
     */
    @ModelArguments(code = "OutputAverage", mean = "输出平均", number = 4121)
    private float OutputAverage;

    /**
     * LED状态
     */
    @ModelArguments(code = "LEDStatus", mean = "LED状态", number = 4122, length = 1)
    private byte LEDStatus;

    /**
     * 光伏状态
     */
    @ModelArguments(code = "PhotovoltaicStatus", mean = "光伏状态", number = 4122, length = 1)
    private byte PhotovoltaicStatus;

    /**
     * 系统时间
     */
    @ModelArguments(code = "SystemTime", mean = "系统时间", number = 4123, length = 4)
    private float SystemTime;

    /**
     * 输出/泄荷状态
     */
    @ModelArguments(code = "OutputOrDischargeStatus", mean = "输出/泄荷状态", number = 4125, length = 1)
    private byte OutputOrDischargeStatus;

    /**
     * 光伏状态预留
     */
    @ModelArguments(code = "PhotovoltaicReverseStatus", mean = "光伏状态预留", number = 4125, length = 1)
    private byte PhotovoltaicReverseStatus;

    /**
     * 连续运行时
     */
    @ModelArguments(code = "ContinuousRunningHour", mean = "连续运行时", number = 4126)
    private float ContinuousRunningHour;

    /**
     * 连续运行分
     */
    @ModelArguments(code = "ContinuousRunningMinute", mean = "连续运行分", number = 4127, length = 1)
    private byte ContinuousRunningMinute;

    /**
     * 连续运行秒
     */
    @ModelArguments(code = "ContinuousRunningSecond", mean = "连续运行秒", number = 4127, length = 1)
    private byte ContinuousRunningSecond;

    /**
     * 平均转速
     */
    @ModelArguments(code = "AverageSpeed", mean = "平均转速", number = 4128)
    private float AverageSpeed;

    /**
     * 24V 电压
     */
    @ModelArguments(code = "voltage24V", mean = "24V 电压", number = 4129)
    private float voltage24V;

    /**
     * 24V 电流
     */
    @ModelArguments(code = "current24V", mean = "24V 电流", number = 4130)
    private float current24V;

    /**
     * 节点状态
     */
    @ModelArguments(code = "nodeStatus", mean = "节点状态", number = 4131, length = 1)
    private byte nodeStatus;

    /**
     * 下位机状态
     */
    @ModelArguments(code = "LowerComputerStatus", mean = "下位机状态", number = 4131, length = 1)
    private byte LowComputeStatus;

    /**
     * U 相电流
     */
    @ModelArguments(code = "UPhaseCurrent", mean = "U 相电流", number = 4132)
    private float UPhaseCurrent;


    /**
     * U 相频率
     */
    @ModelArguments(code = "UPhaseFrequency", mean = "U 相频率", number = 4133)
    private float UPhaseFrequency;

    /**
     * FAN1 速度
     */
    @ModelArguments(code = "FanSpeed1", mean = "FAN1 速度", number = 4134)
    private float FanSpeed1;

    /**
     * FAN2 速度
     */
    @ModelArguments(code = "FanSpeed2", mean = "FAN2 速度", number = 4135)
    private float FanSpeed2;

    /**
     * 系统状态
     */
    @ModelArguments(code = "SystemStatus", mean = "系统状态", number = 4136, length = 1)
    private byte SystemStatus;

    /**
     * CPU状态☆
     */
    @ModelArguments(code = "CpuStatus", mean = "CPU状态", number = 4136, length = 1)
    private byte CpuStatus;

    /**
     * 侧偏角度
     */
    @ModelArguments(code = "LateralDeviationAngle", mean = "侧偏角度", number = 4137)
    private float LateralDeviationAngle;

    /**
     * 起泄电压
     */
    @ModelArguments(code = "DischargeVoltage", mean = "起泄电压", number = 4138)
    private float DischargeVoltage;

    /**
     * 泄荷
     */
    @ModelArguments(code = "LoadingShielding", mean = "泄荷", number = 4139)
    private float LoadingShielding;


    /**
     * 目标转速
     */
    @ModelArguments(code = "TargetRotationalSpeed", mean = "目标转速", number = 4140)
    private float TargetRotationalSpeed;

    /**
     * 短路
     */
    @ModelArguments(code = "shortCircuit", mean = "短路", number = 4141)
    private float shortCircuit;

    /**
     * 变频频率
     */
    @ModelArguments(code = "VariableFrequency", mean = "变频频率", number = 4142)
    private float VariableFrequency;

    /**
     * 空调内温
     */
    @ModelArguments(code = "AirConditioningTemperature", mean = "空调内温", number = 4143)
    private float AirConditioningTemperature;

    public float getOutputVoltage() {
        return OutputVoltage;
    }

    public void setOutputVoltage(float outputVoltage) {
        OutputVoltage = outputVoltage;
    }

    public float getOutputCurrent() {
        return OutputCurrent;
    }

    public void setOutputCurrent(float outputCurrent) {
        OutputCurrent = outputCurrent;
    }

    public float getPhotovoltaicVoltage() {
        return PhotovoltaicVoltage;
    }

    public void setPhotovoltaicVoltage(float photovoltaicVoltage) {
        PhotovoltaicVoltage = photovoltaicVoltage;
    }

    public float getPhotovoltaicCurrent() {
        return PhotovoltaicCurrent;
    }

    public void setPhotovoltaicCurrent(float photovoltaicCurrent) {
        PhotovoltaicCurrent = photovoltaicCurrent;
    }

    public float getFanVoltage() {
        return FanVoltage;
    }

    public void setFanVoltage(float fanVoltage) {
        FanVoltage = fanVoltage;
    }

    public float getFanCurrent() {
        return FanCurrent;
    }

    public void setFanCurrent(float fanCurrent) {
        FanCurrent = fanCurrent;
    }

    public float getDischargeCurrent() {
        return DischargeCurrent;
    }

    public void setDischargeCurrent(float dischargeCurrent) {
        DischargeCurrent = dischargeCurrent;
    }

    public float getOutPower() {
        return OutPower;
    }

    public void setOutPower(float outPower) {
        OutPower = outPower;
    }

    public float getPeakAverage() {
        return PeakAverage;
    }

    public void setPeakAverage(float peakAverage) {
        PeakAverage = peakAverage;
    }

    public float getWindPower() {
        return WindPower;
    }

    public void setWindPower(float windPower) {
        WindPower = windPower;
    }

    public float getDischargePower() {
        return DischargePower;
    }

    public void setDischargePower(float dischargePower) {
        DischargePower = dischargePower;
    }

    public float getFanFrequency() {
        return FanFrequency;
    }

    public void setFanFrequency(float fanFrequency) {
        FanFrequency = fanFrequency;
    }

    public float getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(float fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public float getSpeedAcceleration() {
        return SpeedAcceleration;
    }

    public void setSpeedAcceleration(float speedAcceleration) {
        SpeedAcceleration = speedAcceleration;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public float getDischargeTemperature() {
        return DischargeTemperature;
    }

    public void setDischargeTemperature(float dischargeTemperature) {
        DischargeTemperature = dischargeTemperature;
    }

    public float getLeftRadiatorT2() {
        return LeftRadiatorT2;
    }

    public void setLeftRadiatorT2(float leftRadiatorT2) {
        LeftRadiatorT2 = leftRadiatorT2;
    }

    public float getRightRadiatorT1() {
        return RightRadiatorT1;
    }

    public void setRightRadiatorT1(float rightRadiatorT1) {
        RightRadiatorT1 = rightRadiatorT1;
    }

    public float getDischargeAverage() {
        return DischargeAverage;
    }

    public void setDischargeAverage(float dischargeAverage) {
        DischargeAverage = dischargeAverage;
    }

    public float getDailyPowerGeneration() {
        return DailyPowerGeneration;
    }

    public void setDailyPowerGeneration(float dailyPowerGeneration) {
        DailyPowerGeneration = dailyPowerGeneration;
    }

    public float getInstantaneousWindSpeed() {
        return InstantaneousWindSpeed;
    }

    public void setInstantaneousWindSpeed(float instantaneousWindSpeed) {
        InstantaneousWindSpeed = instantaneousWindSpeed;
    }

    public float getAverageWindSpeed() {
        return AverageWindSpeed;
    }

    public void setAverageWindSpeed(float averageWindSpeed) {
        AverageWindSpeed = averageWindSpeed;
    }

    public float getTotalPowerGeneration() {
        return TotalPowerGeneration;
    }

    public void setTotalPowerGeneration(float totalPowerGeneration) {
        TotalPowerGeneration = totalPowerGeneration;
    }

    public float getOutputAverage() {
        return OutputAverage;
    }

    public void setOutputAverage(float outputAverage) {
        OutputAverage = outputAverage;
    }

    public byte getLEDStatus() {
        return LEDStatus;
    }

    public void setLEDStatus(byte LEDStatus) {
        this.LEDStatus = LEDStatus;
    }

    public byte getPhotovoltaicStatus() {
        return PhotovoltaicStatus;
    }

    public void setPhotovoltaicStatus(byte photovoltaicStatus) {
        PhotovoltaicStatus = photovoltaicStatus;
    }

    public float getSystemTime() {
        return SystemTime;
    }

    public void setSystemTime(float systemTime) {
        SystemTime = systemTime;
    }

    public byte getOutputOrDischargeStatus() {
        return OutputOrDischargeStatus;
    }

    public void setOutputOrDischargeStatus(byte outputOrDischargeStatus) {
        OutputOrDischargeStatus = outputOrDischargeStatus;
    }

    public byte getPhotovoltaicReverseStatus() {
        return PhotovoltaicReverseStatus;
    }

    public void setPhotovoltaicReverseStatus(byte photovoltaicReverseStatus) {
        PhotovoltaicReverseStatus = photovoltaicReverseStatus;
    }

    public float getContinuousRunningHour() {
        return ContinuousRunningHour;
    }

    public void setContinuousRunningHour(float continuousRunningHour) {
        ContinuousRunningHour = continuousRunningHour;
    }

    public byte getContinuousRunningMinute() {
        return ContinuousRunningMinute;
    }

    public void setContinuousRunningMinute(byte continuousRunningMinute) {
        ContinuousRunningMinute = continuousRunningMinute;
    }

    public byte getContinuousRunningSecond() {
        return ContinuousRunningSecond;
    }

    public void setContinuousRunningSecond(byte continuousRunningSecond) {
        ContinuousRunningSecond = continuousRunningSecond;
    }

    public float getAverageSpeed() {
        return AverageSpeed;
    }

    public void setAverageSpeed(float averageSpeed) {
        AverageSpeed = averageSpeed;
    }

    public float getVoltage24V() {
        return voltage24V;
    }

    public void setVoltage24V(float voltage24V) {
        this.voltage24V = voltage24V;
    }

    public float getCurrent24V() {
        return current24V;
    }

    public void setCurrent24V(float current24V) {
        this.current24V = current24V;
    }

    public byte getNodeStatus() {
        return nodeStatus;
    }

    public void setNodeStatus(byte nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    public byte getLowComputeStatus() {
        return LowComputeStatus;
    }

    public void setLowComputeStatus(byte lowComputeStatus) {
        LowComputeStatus = lowComputeStatus;
    }

    public float getUPhaseCurrent() {
        return UPhaseCurrent;
    }

    public void setUPhaseCurrent(float UPhaseCurrent) {
        this.UPhaseCurrent = UPhaseCurrent;
    }

    public float getUPhaseFrequency() {
        return UPhaseFrequency;
    }

    public void setUPhaseFrequency(float UPhaseFrequency) {
        this.UPhaseFrequency = UPhaseFrequency;
    }

    public float getFanSpeed1() {
        return FanSpeed1;
    }

    public void setFanSpeed1(float fanSpeed1) {
        FanSpeed1 = fanSpeed1;
    }

    public float getFanSpeed2() {
        return FanSpeed2;
    }

    public void setFanSpeed2(float fanSpeed2) {
        FanSpeed2 = fanSpeed2;
    }

    public byte getSystemStatus() {
        return SystemStatus;
    }

    public void setSystemStatus(byte systemStatus) {
        SystemStatus = systemStatus;
    }

    public byte getCpuStatus() {
        return CpuStatus;
    }

    public void setCpuStatus(byte cpuStatus) {
        CpuStatus = cpuStatus;
    }

    public float getLateralDeviationAngle() {
        return LateralDeviationAngle;
    }

    public void setLateralDeviationAngle(float lateralDeviationAngle) {
        LateralDeviationAngle = lateralDeviationAngle;
    }

    public float getDischargeVoltage() {
        return DischargeVoltage;
    }

    public void setDischargeVoltage(float dischargeVoltage) {
        DischargeVoltage = dischargeVoltage;
    }

    public float getLoadingShielding() {
        return LoadingShielding;
    }

    public void setLoadingShielding(float loadingShielding) {
        LoadingShielding = loadingShielding;
    }

    public float getTargetRotationalSpeed() {
        return TargetRotationalSpeed;
    }

    public void setTargetRotationalSpeed(float targetRotationalSpeed) {
        TargetRotationalSpeed = targetRotationalSpeed;
    }

    public float getShortCircuit() {
        return shortCircuit;
    }

    public void setShortCircuit(float shortCircuit) {
        this.shortCircuit = shortCircuit;
    }

    public float getVariableFrequency() {
        return VariableFrequency;
    }

    public void setVariableFrequency(float variableFrequency) {
        VariableFrequency = variableFrequency;
    }

    public float getAirConditioningTemperature() {
        return AirConditioningTemperature;
    }

    public void setAirConditioningTemperature(float airConditioningTemperature) {
        AirConditioningTemperature = airConditioningTemperature;
    }
}
