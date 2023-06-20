package com.ntdq.hnscreen.domain.point.PhotovoltaicInvert;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 光伏逆变器遥测信息
 */
@AttributeInfo(startIndex = 2999, endIndex = 3043, funcType = 4)
@Topic(topicName = "PhotoInvertYC")
public class PhotovoltaicInvertYCInfo extends BasePointInfo {

    /**
     * 产品型号
     */
    @ModelArguments(code = "ProductModel", mean = "产品型号", number = 2999)
    private int ProductModel;

    /**
     * DSP软件版本
     */
    @ModelArguments(code = "DSPSoftWareVersion", mean = "DSP软件版本", number = 3000)
    private int DSPSoftWareVersion;

    /**
     * 液晶软件版本
     */
    @ModelArguments(code = "LCDSoftwareVersion", mean = "液晶软件版本", number = 3001)
    private int LCDSoftwareVersion;

    /**
     * 交流输出类型
     */
    @ModelArguments(code = "AcOutputType", mean = "交流输出类型", number = 3002)
    private int AcOutputType;

    /**
     * 直流输入类型
     */
    @ModelArguments(code = "DcInputType", mean = "直流输入类型", number = 3003)
    private int DcInputType;

    /**
     * 有功功率
     */
    @ModelArguments(code = "ActivePower", mean = "有功功率", number = 3004, length = 4)
    private float ActivePower;

    /**
     * 总直流输出功率
     */
    @ModelArguments(code = "TotalDcOutputPower", mean = "总直流输出功率", number = 3006, length = 4)
    private float TotalDcOutputPower;

    /**
     * 总发电量
     */
    @ModelArguments(code = "TotalGenPower", mean = "总发电量", number = 3008, length = 4)
    private float TotalGenPower;

    /**
     * 当月发电量
     */
    @ModelArguments(code = "MonthlyPowerCapacity", mean = "当月发电量", number = 3010, length = 4)
    private float MonthlyPowerCapacity;

    /**
     * 上月发电量
     */
    @ModelArguments(code = "LastMonthPowerCapacity", mean = "上月发电量", number = 3012, length = 4)
    private float LastMonthPowerCapacity;

    /**
     * 当日发电量
     */
    @ModelArguments(code = "ElectricityToday", mean = "当日发电量", number = 3014, coefficient = 0.1f)
    private float ElectricityToday;

    /**
     * 昨日发电量
     */
    @ModelArguments(code = "ElectricityYestDay", mean = "昨日发电量", number = 3015, coefficient = 0.1f)
    private float ElectricityYestDay;

    /**
     * 今年发电量
     */
    @ModelArguments(code = "PowerGenTheYear", mean = "今年发电量", number = 3016, length = 4)
    private float PowerGenTheYear;

    /**
     * 去年发电量
     */
    @ModelArguments(code = "PowerGenLastYear", mean = "去年发电量", number = 3018, length = 4)
    private float PowerGenLastYear;

    /**
     * 保留1
     */
    @ModelArguments(code = "reserve1", mean = "保留1", number = 3020)
    private short reserve1;

    /**
     * 直流电压1
     */
    @ModelArguments(code = "DcVoltage1", mean = "直流电压1", number = 3021, coefficient = 0.1f)
    private int DcVoltage1;

    /**
     * 直流电流1
     */
    @ModelArguments(code = "直流电流1", mean = "直流电流1", number = 3022, coefficient = 0.1f)
    private int DcCurrent1;


    /**
     * 直流电压2
     */
    @ModelArguments(code = "DcVoltage2", mean = "直流电压2", number = 3023, coefficient = 0.1f)
    private int DcVoltage2;

    /**
     * 直流电流2
     */
    @ModelArguments(code = "DcCurrent2", mean = "直流电流2", number = 3024, coefficient = 0.1f)
    private int DcCurrent2;

    /**
     * 直流电压3
     */
    @ModelArguments(code = "DcVoltage3", mean = "直流电压3", number = 3025, coefficient = 0.1f)
    private int DcVoltage3;

    /**
     * 直流电流3
     */
    @ModelArguments(code = "DcCurrent3", mean = "直流电流3", number = 3026, coefficient = 0.1f)
    private int DcCurrent3;

    /**
     * 直流电压4
     */
    @ModelArguments(code = "DcVoltage4", mean = "直流电压4", number = 3027, coefficient = 0.1f)
    private int DcVoltage4;

    /**
     * 直流电流4
     */
    @ModelArguments(code = "DcCurrent4", mean = "直流电流4", number = 3028, coefficient = 0.1f)
    private int DcCurrent4;


    /**
     * 保留2
     */
    @ModelArguments(code = "reserve2", mean = "保留2", number = 3029)
    private short reserve2;

    /**
     * 初始化接地电压值
     */
    @ModelArguments(code = "InitGroundVoltage", mean = "直流电流1", number = 3030, coefficient = 0.1f)
    private int InitGroundVoltage;

    /**
     * 直流母线电压
     */
    @ModelArguments(code = "reserve2", mean = "直流母线电压", number = 3031, coefficient = 0.1f)
    private int DcBusVoltage;

    /**
     * 直流母线半电压
     */
    @ModelArguments(code = "DcBusHalfVoltage", mean = "直流母线半电压", number = 3032, coefficient = 0.1f)
    private int DcBusHalfVoltage;

    /**
     * AB线电压
     */
    @ModelArguments(code = "ABLineVoltage", mean = "直流母线电压", number = 3033, coefficient = 0.1f)
    private int ABLineVoltage;

    /**
     * BC线电压
     */
    @ModelArguments(code = "BCLineVoltage", mean = "BC线电压", number = 3034, coefficient = 0.1f)
    private int BCLineVoltage;

    /**
     * CA线电压
     */
    @ModelArguments(code = "CALineVoltage", mean = "CA线电压", number = 3035, coefficient = 0.1f)
    private int CALineVoltage;

    /**
     * A相电流
     */
    @ModelArguments(code = "APhaseCurrent", mean = "A相电流", number = 3036, coefficient = 0.1f)
    private int APhaseCurrent;

    /**
     * B相电流
     */
    @ModelArguments(code = "BPhaseCurrent", mean = "B相电流", number = 3037, coefficient = 0.1f)
    private int BPhaseCurrent;

    /**
     * C相电流
     */
    @ModelArguments(code = "CPhaseCurrent", mean = "C相电流", number = 3038, coefficient = 0.1f)
    private int CPhaseCurrent;


    /**
     * 保留3
     */
    @ModelArguments(code = "reserve3", mean = "保留3", number = 3039)
    private short reserve3;

    /**
     * 标准工作模式
     */
    @ModelArguments(code = "StandardWorkingMode", mean = "标准工作模式", number = 3040)
    private short StandardWorkingMode;

    /**
     * 逆变器温度
     */
    @ModelArguments(code = "InvertTemp", mean = "逆变器温度", number = 3041, coefficient = 0.1f)
    private short InvertTemp;

    /**
     * 电网频率
     */
    @ModelArguments(code = "GridFre", mean = "电网频率", number = 3042, coefficient = 0.01f)
    private short GridFre;

    /**
     * 逆变器当前状态
     */
    @ModelArguments(code = "InvertCurrentStatus", mean = "逆变器当前状态", number = 3043)
    private short InvertCurrentStatus;

    public int getProductModel() {
        return ProductModel;
    }

    public void setProductModel(int productModel) {
        ProductModel = productModel;
    }

    public int getDSPSoftWareVersion() {
        return DSPSoftWareVersion;
    }

    public void setDSPSoftWareVersion(int DSPSoftWareVersion) {
        this.DSPSoftWareVersion = DSPSoftWareVersion;
    }

    public int getLCDSoftwareVersion() {
        return LCDSoftwareVersion;
    }

    public void setLCDSoftwareVersion(int LCDSoftwareVersion) {
        this.LCDSoftwareVersion = LCDSoftwareVersion;
    }

    public int getAcOutputType() {
        return AcOutputType;
    }

    public void setAcOutputType(int acOutputType) {
        AcOutputType = acOutputType;
    }

    public int getDcInputType() {
        return DcInputType;
    }

    public void setDcInputType(int dcInputType) {
        DcInputType = dcInputType;
    }

    public float getActivePower() {
        return ActivePower;
    }

    public void setActivePower(float activePower) {
        ActivePower = activePower;
    }

    public float getTotalDcOutputPower() {
        return TotalDcOutputPower;
    }

    public void setTotalDcOutputPower(float totalDcOutputPower) {
        TotalDcOutputPower = totalDcOutputPower;
    }

    public float getTotalGenPower() {
        return TotalGenPower;
    }

    public void setTotalGenPower(float totalGenPower) {
        TotalGenPower = totalGenPower;
    }

    public float getMonthlyPowerCapacity() {
        return MonthlyPowerCapacity;
    }

    public void setMonthlyPowerCapacity(float monthlyPowerCapacity) {
        MonthlyPowerCapacity = monthlyPowerCapacity;
    }

    public float getLastMonthPowerCapacity() {
        return LastMonthPowerCapacity;
    }

    public void setLastMonthPowerCapacity(float lastMonthPowerCapacity) {
        LastMonthPowerCapacity = lastMonthPowerCapacity;
    }

    public float getElectricityToday() {
        return ElectricityToday;
    }

    public void setElectricityToday(float electricityToday) {
        ElectricityToday = electricityToday;
    }

    public float getElectricityYestDay() {
        return ElectricityYestDay;
    }

    public void setElectricityYestDay(float electricityYestDay) {
        ElectricityYestDay = electricityYestDay;
    }

    public float getPowerGenTheYear() {
        return PowerGenTheYear;
    }

    public void setPowerGenTheYear(float powerGenTheYear) {
        PowerGenTheYear = powerGenTheYear;
    }

    public float getPowerGenLastYear() {
        return PowerGenLastYear;
    }

    public void setPowerGenLastYear(float powerGenLastYear) {
        PowerGenLastYear = powerGenLastYear;
    }

    public short getReserve1() {
        return reserve1;
    }

    public void setReserve1(short reserve1) {
        this.reserve1 = reserve1;
    }

    public int getDcVoltage1() {
        return DcVoltage1;
    }

    public void setDcVoltage1(int dcVoltage1) {
        DcVoltage1 = dcVoltage1;
    }

    public int getDcCurrent1() {
        return DcCurrent1;
    }

    public void setDcCurrent1(int dcCurrent1) {
        DcCurrent1 = dcCurrent1;
    }

    public int getDcVoltage2() {
        return DcVoltage2;
    }

    public void setDcVoltage2(int dcVoltage2) {
        DcVoltage2 = dcVoltage2;
    }

    public int getDcCurrent2() {
        return DcCurrent2;
    }

    public void setDcCurrent2(int dcCurrent2) {
        DcCurrent2 = dcCurrent2;
    }

    public int getDcVoltage3() {
        return DcVoltage3;
    }

    public void setDcVoltage3(int dcVoltage3) {
        DcVoltage3 = dcVoltage3;
    }

    public int getDcCurrent3() {
        return DcCurrent3;
    }

    public void setDcCurrent3(int dcCurrent3) {
        DcCurrent3 = dcCurrent3;
    }

    public int getDcVoltage4() {
        return DcVoltage4;
    }

    public void setDcVoltage4(int dcVoltage4) {
        DcVoltage4 = dcVoltage4;
    }

    public int getDcCurrent4() {
        return DcCurrent4;
    }

    public void setDcCurrent4(int dcCurrent4) {
        DcCurrent4 = dcCurrent4;
    }

    public short getReserve2() {
        return reserve2;
    }

    public void setReserve2(short reserve2) {
        this.reserve2 = reserve2;
    }

    public int getInitGroundVoltage() {
        return InitGroundVoltage;
    }

    public void setInitGroundVoltage(int initGroundVoltage) {
        InitGroundVoltage = initGroundVoltage;
    }

    public int getDcBusVoltage() {
        return DcBusVoltage;
    }

    public void setDcBusVoltage(int dcBusVoltage) {
        DcBusVoltage = dcBusVoltage;
    }

    public int getDcBusHalfVoltage() {
        return DcBusHalfVoltage;
    }

    public void setDcBusHalfVoltage(int dcBusHalfVoltage) {
        DcBusHalfVoltage = dcBusHalfVoltage;
    }

    public int getABLineVoltage() {
        return ABLineVoltage;
    }

    public void setABLineVoltage(int ABLineVoltage) {
        this.ABLineVoltage = ABLineVoltage;
    }

    public int getBCLineVoltage() {
        return BCLineVoltage;
    }

    public void setBCLineVoltage(int BCLineVoltage) {
        this.BCLineVoltage = BCLineVoltage;
    }

    public int getCALineVoltage() {
        return CALineVoltage;
    }

    public void setCALineVoltage(int CALineVoltage) {
        this.CALineVoltage = CALineVoltage;
    }

    public int getAPhaseCurrent() {
        return APhaseCurrent;
    }

    public void setAPhaseCurrent(int APhaseCurrent) {
        this.APhaseCurrent = APhaseCurrent;
    }

    public int getBPhaseCurrent() {
        return BPhaseCurrent;
    }

    public void setBPhaseCurrent(int BPhaseCurrent) {
        this.BPhaseCurrent = BPhaseCurrent;
    }

    public int getCPhaseCurrent() {
        return CPhaseCurrent;
    }

    public void setCPhaseCurrent(int CPhaseCurrent) {
        this.CPhaseCurrent = CPhaseCurrent;
    }

    public short getReserve3() {
        return reserve3;
    }

    public void setReserve3(short reserve3) {
        this.reserve3 = reserve3;
    }

    public short getStandardWorkingMode() {
        return StandardWorkingMode;
    }

    public void setStandardWorkingMode(short standardWorkingMode) {
        StandardWorkingMode = standardWorkingMode;
    }

    public short getInvertTemp() {
        return InvertTemp;
    }

    public void setInvertTemp(short invertTemp) {
        InvertTemp = invertTemp;
    }

    public short getGridFre() {
        return GridFre;
    }

    public void setGridFre(short gridFre) {
        GridFre = gridFre;
    }

    public short getInvertCurrentStatus() {
        return InvertCurrentStatus;
    }

    public void setInvertCurrentStatus(short invertCurrentStatus) {
        InvertCurrentStatus = invertCurrentStatus;
    }
}
