package com.ntdq.hnscreen.domain.point.PhotovoltaicInvert;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 光伏逆变器遥信信息
 */
@AttributeInfo(startIndex = 2501, endIndex = 2544, type = 1)
public class PhotovoltaicInvertYXInfo extends BasePointInfo {

    /**
     * 电网过压
     */
    @ModelArguments(code = "GridOverVoltage", mean = "电网过压", number = 2501)
    private int GridOverVoltage;

    /**
     * 电网欠压
     */
    @ModelArguments(code = "GridDownVoltage", mean = "电网欠压", number = 2502)
    private int GridDownVoltage;

    /**
     * 电网过频
     */
    @ModelArguments(code = "GridOverFre", mean = "电网过频", number = 2503)
    private int GridOverFre;

    /**
     * 电网欠频
     */
    @ModelArguments(code = "GridDownFre", mean = "电网欠频", number = 2504)
    private int GridDownFre;

    /**
     * 电网反接
     */
    @ModelArguments(code = "GridReverse", mean = "电网反接", number = 2505)
    private int GridReverse;

    /**
     * 无电网
     */
    @ModelArguments(code = "NotGrid", mean = "无电网", number = 2506)
    private int NotGrid;

    /**
     * 电网不平衡
     */
    @ModelArguments(code = "GridImBalance", mean = "电网不平衡", number = 2507)
    private int GridImBalance;

    /**
     * 电网频率抖动
     */
    @ModelArguments(code = "GridFrequencyJitter", mean = "电网频率抖动", number = 2508)
    private int GridFrequencyJitter;

    /**
     * 电网过流
     */
    @ModelArguments(code = "GridOverCurrent", mean = "电网过流", number = 2509)
    private int GridOverCurrent;

    /**
     * 电网电流跟踪故障
     */
    @ModelArguments(code = "GridFaultCurrentTrack", mean = "电网电流跟踪故障", number = 2510)
    private int GridFaultCurrentTrack;

    /**
     * 预留1
     */
    @ModelArguments(code = "SetAside1", mean = "预留1", number = 2511)
    private int SetAside1;

    /**
     * 预留2
     */
    @ModelArguments(code = "SetAside2", mean = "预留2", number = 2512)
    private int SetAside2;

    /**
     * 预留3
     */
    @ModelArguments(code = "SetAside3", mean = "预留3", number = 2513)
    private int SetAside3;

    /**
     * 预留4
     */
    @ModelArguments(code = "SetAside4", mean = "预留4", number = 2514)
    private int SetAside4;

    /**
     * 预留5
     */
    @ModelArguments(code = "SetAside5", mean = "预留5", number = 2515)
    private int SetAside5;

    /**
     * 预留6
     */
    @ModelArguments(code = "SetAside6", mean = "预留6", number = 2516)
    private int SetAside6;

    /**
     * 预留7
     */
    @ModelArguments(code = "SetAside7", mean = "预留7", number = 2517)
    private int SetAside7;

    /**
     * 直流过压
     */
    @ModelArguments(code = "DcOverVoltage", mean = "直流过压", number = 2518)
    private int DcOverVoltage;

    /**
     * 直流母线过压
     */
    @ModelArguments(code = "DcBusOverVoltage", mean = "直流母线过压", number = 2519)
    private int DcBusOverVoltage;

    /**
     * 直流母线不均压
     */
    @ModelArguments(code = "DcBusUnevenPressure", mean = "直流母线不均压", number = 2520)
    private int DcBusUnevenPressure;

    /**
     * 直流母线欠压
     */
    @ModelArguments(code = "DcBusNVoltage", mean = "直流母线欠压", number = 2521)
    private int DcBusNVoltage;

    /**
     * 直流母线不均压2
     */
    @ModelArguments(code = "DcBusUnevenPressure2", mean = "直流母线不均压2", number = 2522)
    private int DcBusUnevenPressure2;

    /**
     * 直流A路过流
     */
    @ModelArguments(code = "DcPassingByAStream", mean = "直流A路过流", number = 2523)
    private int DcPassingByAStream;

    /**
     * 直流B路过流
     */
    @ModelArguments(code = "DcPassingByBStream", mean = "直流B路过流", number = 2524)
    private int DcPassingByBStream;

    /**
     * 直流输入扰动
     */
    @ModelArguments(code = "DcInputDisturbance", mean = "直流输入扰动", number = 2525)
    private int DcInputDisturbance;

    /**
     * 直流反接
     */
    @ModelArguments(code = "DirectCurrentReverse", mean = "直流反接", number = 2526)
    private int DirectCurrentReverse;

    /**
     * 预留8
     */
    @ModelArguments(code = "SetAside8", mean = "预留8", number = 2527)
    private int SetAside8;

    /**
     * 预留9
     */
    @ModelArguments(code = "SetAside9", mean = "预留9", number = 2528)
    private int SetAside9;

    /**
     * 预留10
     */
    @ModelArguments(code = "SetAside10", mean = "预留10", number = 2529)
    private int SetAside10;

    /**
     * 预留11
     */
    @ModelArguments(code = "SetAside11", mean = "预留11", number = 2530)
    private int SetAside11;

    /**
     * 预留12
     */
    @ModelArguments(code = "SetAside12", mean = "预留12", number = 2531)
    private int SetAside12;

    /**
     * 预留13
     */
    @ModelArguments(code = "SetAside13", mean = "预留13", number = 2532)
    private int SetAside13;

    /**
     * 预留14
     */
    @ModelArguments(code = "SetAside14", mean = "预留14", number = 2533)
    private int SetAside14;

    /**
     * 电网扰动
     */
    @ModelArguments(code = "GridDisturbance", mean = "电网扰动", number = 2534)
    private int GridDisturbance;

    /**
     * DSP初始化保护
     */
    @ModelArguments(code = "DSPInitProtect", mean = "DSP初始化保护", number = 2535)
    private int DSPInitProtect;

    /**
     * 逆变器温度保护
     */
    @ModelArguments(code = "InvertTemProtect", mean = "逆变器温度保护", number = 2536)
    private int InvertTemProtect;

    /**
     * PV绝缘故障
     */
    @ModelArguments(code = "PVInsulationFault", mean = "PV绝缘故障", number = 2537)
    private int PVInsulationFault;

    /**
     * 漏电流保护
     */
    @ModelArguments(code = "LeakageCurrentProtection", mean = "漏电流保护", number = 2538)
    private int LeakageCurrentProtection;

    /**
     * 继电器检测保护
     */
    @ModelArguments(code = "RelayCheckProtection", mean = "继电器检测保护", number = 2539)
    private int RelayCheckProtection;

    /**
     * DSP_B故障保护
     */
    @ModelArguments(code = "DSP_BFailProtection", mean = "DSP_B故障保护", number = 2540)
    private int DSP_BFailProtection;

    /**
     * 直流分量过大
     */
    @ModelArguments(code = "LargeDcComponent", mean = "直流分量过大", number = 2541)
    private int LargeDcComponent;

    /**
     * 12V欠压保护
     */
    @ModelArguments(code = "UnderVoltageProtection12V", mean = "12V欠压保护", number = 2542)
    private int UnderVoltageProtection12V;

    /**
     * 漏电流自检保护
     */
    @ModelArguments(code = "LeakageCurrentSelfPro", mean = "漏电流自检保护", number = 2543)
    private int LeakageCurrentSelfPro;

    /**
     * 欠温保护
     */
    @ModelArguments(code = "LowTemperaturePro", mean = "欠温保护", number = 2544)
    private int LowTemperaturePro;

    public int getGridOverVoltage() {
        return GridOverVoltage;
    }

    public void setGridOverVoltage(int gridOverVoltage) {
        GridOverVoltage = gridOverVoltage;
    }

    public int getGridDownVoltage() {
        return GridDownVoltage;
    }

    public void setGridDownVoltage(int gridDownVoltage) {
        GridDownVoltage = gridDownVoltage;
    }

    public int getGridOverFre() {
        return GridOverFre;
    }

    public void setGridOverFre(int gridOverFre) {
        GridOverFre = gridOverFre;
    }

    public int getGridDownFre() {
        return GridDownFre;
    }

    public void setGridDownFre(int gridDownFre) {
        GridDownFre = gridDownFre;
    }

    public int getGridReverse() {
        return GridReverse;
    }

    public void setGridReverse(int gridReverse) {
        GridReverse = gridReverse;
    }

    public int getNotGrid() {
        return NotGrid;
    }

    public void setNotGrid(int notGrid) {
        NotGrid = notGrid;
    }

    public int getGridImBalance() {
        return GridImBalance;
    }

    public void setGridImBalance(int gridImBalance) {
        GridImBalance = gridImBalance;
    }

    public int getGridFrequencyJitter() {
        return GridFrequencyJitter;
    }

    public void setGridFrequencyJitter(int gridFrequencyJitter) {
        GridFrequencyJitter = gridFrequencyJitter;
    }

    public int getGridOverCurrent() {
        return GridOverCurrent;
    }

    public void setGridOverCurrent(int gridOverCurrent) {
        GridOverCurrent = gridOverCurrent;
    }

    public int getGridFaultCurrentTrack() {
        return GridFaultCurrentTrack;
    }

    public void setGridFaultCurrentTrack(int gridFaultCurrentTrack) {
        GridFaultCurrentTrack = gridFaultCurrentTrack;
    }

    public int getSetAside1() {
        return SetAside1;
    }

    public void setSetAside1(int setAside1) {
        SetAside1 = setAside1;
    }

    public int getSetAside2() {
        return SetAside2;
    }

    public void setSetAside2(int setAside2) {
        SetAside2 = setAside2;
    }

    public int getSetAside3() {
        return SetAside3;
    }

    public void setSetAside3(int setAside3) {
        SetAside3 = setAside3;
    }

    public int getSetAside4() {
        return SetAside4;
    }

    public void setSetAside4(int setAside4) {
        SetAside4 = setAside4;
    }

    public int getSetAside5() {
        return SetAside5;
    }

    public void setSetAside5(int setAside5) {
        SetAside5 = setAside5;
    }

    public int getSetAside6() {
        return SetAside6;
    }

    public void setSetAside6(int setAside6) {
        SetAside6 = setAside6;
    }

    public int getSetAside7() {
        return SetAside7;
    }

    public void setSetAside7(int setAside7) {
        SetAside7 = setAside7;
    }

    public int getDcOverVoltage() {
        return DcOverVoltage;
    }

    public void setDcOverVoltage(int dcOverVoltage) {
        DcOverVoltage = dcOverVoltage;
    }

    public int getDcBusOverVoltage() {
        return DcBusOverVoltage;
    }

    public void setDcBusOverVoltage(int dcBusOverVoltage) {
        DcBusOverVoltage = dcBusOverVoltage;
    }

    public int getDcBusUnevenPressure() {
        return DcBusUnevenPressure;
    }

    public void setDcBusUnevenPressure(int dcBusUnevenPressure) {
        DcBusUnevenPressure = dcBusUnevenPressure;
    }

    public int getDcBusNVoltage() {
        return DcBusNVoltage;
    }

    public void setDcBusNVoltage(int dcBusNVoltage) {
        DcBusNVoltage = dcBusNVoltage;
    }

    public int getDcBusUnevenPressure2() {
        return DcBusUnevenPressure2;
    }

    public void setDcBusUnevenPressure2(int dcBusUnevenPressure2) {
        DcBusUnevenPressure2 = dcBusUnevenPressure2;
    }

    public int getDcPassingByAStream() {
        return DcPassingByAStream;
    }

    public void setDcPassingByAStream(int dcPassingByAStream) {
        DcPassingByAStream = dcPassingByAStream;
    }

    public int getDcPassingByBStream() {
        return DcPassingByBStream;
    }

    public void setDcPassingByBStream(int dcPassingByBStream) {
        DcPassingByBStream = dcPassingByBStream;
    }

    public int getDcInputDisturbance() {
        return DcInputDisturbance;
    }

    public void setDcInputDisturbance(int dcInputDisturbance) {
        DcInputDisturbance = dcInputDisturbance;
    }

    public int getDirectCurrentReverse() {
        return DirectCurrentReverse;
    }

    public void setDirectCurrentReverse(int directCurrentReverse) {
        DirectCurrentReverse = directCurrentReverse;
    }

    public int getSetAside8() {
        return SetAside8;
    }

    public void setSetAside8(int setAside8) {
        SetAside8 = setAside8;
    }

    public int getSetAside9() {
        return SetAside9;
    }

    public void setSetAside9(int setAside9) {
        SetAside9 = setAside9;
    }

    public int getSetAside10() {
        return SetAside10;
    }

    public void setSetAside10(int setAside10) {
        SetAside10 = setAside10;
    }

    public int getSetAside11() {
        return SetAside11;
    }

    public void setSetAside11(int setAside11) {
        SetAside11 = setAside11;
    }

    public int getSetAside12() {
        return SetAside12;
    }

    public void setSetAside12(int setAside12) {
        SetAside12 = setAside12;
    }

    public int getSetAside13() {
        return SetAside13;
    }

    public void setSetAside13(int setAside13) {
        SetAside13 = setAside13;
    }

    public int getSetAside14() {
        return SetAside14;
    }

    public void setSetAside14(int setAside14) {
        SetAside14 = setAside14;
    }

    public int getGridDisturbance() {
        return GridDisturbance;
    }

    public void setGridDisturbance(int gridDisturbance) {
        GridDisturbance = gridDisturbance;
    }

    public int getDSPInitProtect() {
        return DSPInitProtect;
    }

    public void setDSPInitProtect(int DSPInitProtect) {
        this.DSPInitProtect = DSPInitProtect;
    }

    public int getInvertTemProtect() {
        return InvertTemProtect;
    }

    public void setInvertTemProtect(int invertTemProtect) {
        InvertTemProtect = invertTemProtect;
    }

    public int getPVInsulationFault() {
        return PVInsulationFault;
    }

    public void setPVInsulationFault(int PVInsulationFault) {
        this.PVInsulationFault = PVInsulationFault;
    }

    public int getLeakageCurrentProtection() {
        return LeakageCurrentProtection;
    }

    public void setLeakageCurrentProtection(int leakageCurrentProtection) {
        LeakageCurrentProtection = leakageCurrentProtection;
    }

    public int getRelayCheckProtection() {
        return RelayCheckProtection;
    }

    public void setRelayCheckProtection(int relayCheckProtection) {
        RelayCheckProtection = relayCheckProtection;
    }

    public int getDSP_BFailProtection() {
        return DSP_BFailProtection;
    }

    public void setDSP_BFailProtection(int DSP_BFailProtection) {
        this.DSP_BFailProtection = DSP_BFailProtection;
    }

    public int getLargeDcComponent() {
        return LargeDcComponent;
    }

    public void setLargeDcComponent(int largeDcComponent) {
        LargeDcComponent = largeDcComponent;
    }

    public int getUnderVoltageProtection12V() {
        return UnderVoltageProtection12V;
    }

    public void setUnderVoltageProtection12V(int underVoltageProtection12V) {
        UnderVoltageProtection12V = underVoltageProtection12V;
    }

    public int getLeakageCurrentSelfPro() {
        return LeakageCurrentSelfPro;
    }

    public void setLeakageCurrentSelfPro(int leakageCurrentSelfPro) {
        LeakageCurrentSelfPro = leakageCurrentSelfPro;
    }

    public int getLowTemperaturePro() {
        return LowTemperaturePro;
    }

    public void setLowTemperaturePro(int lowTemperaturePro) {
        LowTemperaturePro = lowTemperaturePro;
    }
}
