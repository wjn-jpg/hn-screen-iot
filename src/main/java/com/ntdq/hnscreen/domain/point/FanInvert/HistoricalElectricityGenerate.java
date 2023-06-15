package com.ntdq.hnscreen.domain.point.FanInvert;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.annotation.Topic;
import com.ntdq.hnscreen.domain.point.BasePointInfo;

/**
 * 历史发电量信息
 */
@AttributeInfo(startIndex = 4864, endIndex = 4924, funcType = 4)
@Topic(topicName = "FAN_HISTORY_YC")
public class HistoricalElectricityGenerate extends BasePointInfo {


    /**
     * 当前发电量
     */
    @ModelArguments(code = "ElectricityGenToday", mean = "当前发电量", number = 4864)
    private short ElectricityGenToday;

    /**
     * 昨1天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay1", mean = "昨1天发电量", number = 4865)
    private short ElectricityGenLastDay1;
    /**
     * 昨2天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay2", mean = "昨2天发电量", number = 4866)
    private short ElectricityGenLastDay2;
    /**
     * 昨3天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay3", mean = "昨3天发电量", number = 4867)
    private short ElectricityGenLastDay3;
    /**
     * 昨4天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay4", mean = "昨4天发电量", number = 4868)
    private short ElectricityGenLastDay4;
    /**
     * 昨5天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay5", mean = "昨5天发电量", number = 4869)
    private short ElectricityGenLastDay5;
    /**
     * 昨6天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay6", mean = "昨6天发电量", number = 4870)
    private short ElectricityGenLastDay6;

    /**
     * 昨7天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay7", mean = "昨7天发电量", number = 4871)
    private short ElectricityGenLastDay7;

    /**
     * 昨8天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay8", mean = "昨8天发电量", number = 4872)
    private short ElectricityGenLastDay8;

    /**
     * 昨9天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay9", mean = "昨9天发电量", number = 4873)
    private short ElectricityGenLastDay9;

    /**
     * 昨10天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay10", mean = "昨10天发电量", number = 4874)
    private short ElectricityGenLastDay10;

    /**
     * 昨11天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay11", mean = "昨11天发电量", number = 4875)
    private short ElectricityGenLastDay11;

    /**
     * 昨12天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay12", mean = "昨12天发电量", number = 4876)
    private short ElectricityGenLastDay12;

    /**
     * 昨13天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay13", mean = "昨13天发电量", number = 4877)
    private short ElectricityGenLastDay13;

    /**
     * 昨14天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay14", mean = "昨14天发电量", number = 4878)
    private short ElectricityGenLastDay14;

    /**
     * 昨15天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay15", mean = "昨15天发电量", number = 4879)
    private short ElectricityGenLastDay15;

    /**
     * 昨16天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay16", mean = "昨16天发电量", number = 4880)
    private short ElectricityGenLastDay16;

    /**
     * 昨17天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay17", mean = "昨17天发电量", number = 4881)
    private short ElectricityGenLastDay17;

    /**
     * 昨18天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay18", mean = "昨18天发电量", number = 4882)
    private short ElectricityGenLastDay18;

    /**
     * 昨19天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay19", mean = "昨19天发电量", number = 4883)
    private short ElectricityGenLastDay19;

    /**
     * 昨20天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay20", mean = "昨20天发电量", number = 4884)
    private short ElectricityGenLastDay20;

    /**
     * 昨21天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay21", mean = "昨21天发电量", number = 4885)
    private short ElectricityGenLastDay21;

    /**
     * 昨22天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay22", mean = "昨22天发电量", number = 4886)
    private short ElectricityGenLastDay22;

    /**
     * 昨23天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay23", mean = "昨23天发电量", number = 4887)
    private short ElectricityGenLastDay23;

    /**
     * 昨24天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay24", mean = "昨24天发电量", number = 4888)
    private short ElectricityGenLastDay24;

    /**
     * 昨25天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay25", mean = "昨25天发电量", number = 4889)
    private short ElectricityGenLastDay25;

    /**
     * 昨26天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay26", mean = "昨26天发电量", number = 4890)
    private short ElectricityGenLastDay26;

    /**
     * 昨27天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay27", mean = "昨27天发电量", number = 4891)
    private short ElectricityGenLastDay27;

    /**
     * 昨28天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay28", mean = "昨28天发电量", number = 4892)
    private short ElectricityGenLastDay28;

    /**
     * 昨29天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay29", mean = "昨29天发电量", number = 4893)
    private short ElectricityGenLastDay29;

    /**
     * 昨30天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay30", mean = "昨30天发电量", number = 4894)
    private short ElectricityGenLastDay30;

    /**
     * 昨31天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay31", mean = "昨31天发电量", number = 4895)
    private short ElectricityGenLastDay31;

    /**
     * 昨32天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay32", mean = "昨32天发电量", number = 4896)
    private short ElectricityGenLastDay32;

    /**
     * 昨33天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay33", mean = "昨33天发电量", number = 4897)
    private short ElectricityGenLastDay33;

    /**
     * 昨34天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay34", mean = "昨34天发电量", number = 4898)
    private short ElectricityGenLastDay34;

    /**
     * 昨35天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay35", mean = "昨35天发电量", number = 4899)
    private short ElectricityGenLastDay35;

    /**
     * 昨36天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay36", mean = "昨36天发电量", number = 4900)
    private short ElectricityGenLastDay36;

    /**
     * 昨37天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay37", mean = "昨37天发电量", number = 4901)
    private short ElectricityGenLastDay37;

    /**
     * 昨38天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay38", mean = "昨38天发电量", number = 4902)
    private short ElectricityGenLastDay38;

    /**
     * 昨39天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay39", mean = "昨39天发电量", number = 4903)
    private short ElectricityGenLastDay39;

    /**
     * 昨40天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay40", mean = "昨40天发电量", number = 4904)
    private short ElectricityGenLastDay40;

    /**
     * 昨41天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay41", mean = "昨41天发电量", number = 4905)
    private short ElectricityGenLastDay41;

    /**
     * 昨42天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay42", mean = "昨42天发电量", number = 4906)
    private short ElectricityGenLastDay42;

    /**
     * 昨43天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay43", mean = "昨43天发电量", number = 4907)
    private short ElectricityGenLastDay43;

    /**
     * 昨44天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay44", mean = "昨44天发电量", number = 4908)
    private short ElectricityGenLastDay44;

    /**
     * 昨45天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay45", mean = "昨45天发电量", number = 4909)
    private short ElectricityGenLastDay45;

    /**
     * 昨46天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay46", mean = "昨46天发电量", number = 4910)
    private short ElectricityGenLastDay46;

    /**
     * 昨47天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay47", mean = "昨47天发电量", number = 4911)
    private short ElectricityGenLastDay47;

    /**
     * 昨48天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay48", mean = "昨48天发电量", number = 4912)
    private short ElectricityGenLastDay48;

    /**
     * 昨49天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay49", mean = "昨49天发电量", number = 4913)
    private short ElectricityGenLastDay49;

    /**
     * 昨50天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay50", mean = "昨50天发电量", number = 4914)
    private short ElectricityGenLastDay50;

    /**
     * 昨51天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay51", mean = "昨51天发电量", number = 4915)
    private short ElectricityGenLastDay51;

    /**
     * 昨52天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay52", mean = "昨52天发电量", number = 4916)
    private short ElectricityGenLastDay52;

    /**
     * 昨53天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay53", mean = "昨54天发电量", number = 4917)
    private short ElectricityGenLastDay53;

    /**
     * 昨54天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay54", mean = "昨54天发电量", number = 4918)
    private short ElectricityGenLastDay54;

    /**
     * 昨55天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay55", mean = "昨55天发电量", number = 4919)
    private short ElectricityGenLastDay55;

    /**
     * 昨56天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay56", mean = "昨56天发电量", number = 4920)
    private short ElectricityGenLastDay56;

    /**
     * 昨57天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay57", mean = "昨57天发电量", number = 4921)
    private short ElectricityGenLastDay57;

    /**
     * 昨58天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay58", mean = "昨58天发电量", number = 4922)
    private short ElectricityGenLastDay58;

    /**
     * 昨59天发电量
     */
    @ModelArguments(code = "ElectricityGenLastDay59", mean = "昨59天发电量", number = 4923)
    private short ElectricityGenLastDay59;//1628202088903159810


    /**
     * 总发电量
     */
    @ModelArguments(code = "ElectricityGenALL", mean = "总发电量", number = 4924,length = 4)
    private float ElectricityGenALL;

    /**
     * 总发电量
     */
    @ModelArguments(code = "ElectricityXHALL", mean = "总泄荷电量", number = 4926,length = 4)
    private float ElectricityXHALL;


    public float getElectricityGenALL() {
        return ElectricityGenALL;
    }

    public void setElectricityGenALL(float electricityGenALL) {
        ElectricityGenALL = electricityGenALL;
    }

    public float getElectricityXHALL() {
        return ElectricityXHALL;
    }

    public void setElectricityXHALL(float electricityXHALL) {
        ElectricityXHALL = electricityXHALL;
    }

    public short getElectricityGenToday() {
        return ElectricityGenToday;
    }

    public void setElectricityGenToday(short electricityGenToday) {
        ElectricityGenToday = electricityGenToday;
    }

    public short getElectricityGenLastDay1() {
        return ElectricityGenLastDay1;
    }

    public void setElectricityGenLastDay1(short electricityGenLastDay1) {
        ElectricityGenLastDay1 = electricityGenLastDay1;
    }

    public short getElectricityGenLastDay2() {
        return ElectricityGenLastDay2;
    }

    public void setElectricityGenLastDay2(short electricityGenLastDay2) {
        ElectricityGenLastDay2 = electricityGenLastDay2;
    }

    public short getElectricityGenLastDay3() {
        return ElectricityGenLastDay3;
    }

    public void setElectricityGenLastDay3(short electricityGenLastDay3) {
        ElectricityGenLastDay3 = electricityGenLastDay3;
    }

    public short getElectricityGenLastDay4() {
        return ElectricityGenLastDay4;
    }

    public void setElectricityGenLastDay4(short electricityGenLastDay4) {
        ElectricityGenLastDay4 = electricityGenLastDay4;
    }

    public short getElectricityGenLastDay5() {
        return ElectricityGenLastDay5;
    }

    public void setElectricityGenLastDay5(short electricityGenLastDay5) {
        ElectricityGenLastDay5 = electricityGenLastDay5;
    }

    public short getElectricityGenLastDay6() {
        return ElectricityGenLastDay6;
    }

    public void setElectricityGenLastDay6(short electricityGenLastDay6) {
        ElectricityGenLastDay6 = electricityGenLastDay6;
    }

    public short getElectricityGenLastDay7() {
        return ElectricityGenLastDay7;
    }

    public void setElectricityGenLastDay7(short electricityGenLastDay7) {
        ElectricityGenLastDay7 = electricityGenLastDay7;
    }

    public short getElectricityGenLastDay8() {
        return ElectricityGenLastDay8;
    }

    public void setElectricityGenLastDay8(short electricityGenLastDay8) {
        ElectricityGenLastDay8 = electricityGenLastDay8;
    }

    public short getElectricityGenLastDay9() {
        return ElectricityGenLastDay9;
    }

    public void setElectricityGenLastDay9(short electricityGenLastDay9) {
        ElectricityGenLastDay9 = electricityGenLastDay9;
    }

    public short getElectricityGenLastDay10() {
        return ElectricityGenLastDay10;
    }

    public void setElectricityGenLastDay10(short electricityGenLastDay10) {
        ElectricityGenLastDay10 = electricityGenLastDay10;
    }

    public short getElectricityGenLastDay11() {
        return ElectricityGenLastDay11;
    }

    public void setElectricityGenLastDay11(short electricityGenLastDay11) {
        ElectricityGenLastDay11 = electricityGenLastDay11;
    }

    public short getElectricityGenLastDay12() {
        return ElectricityGenLastDay12;
    }

    public void setElectricityGenLastDay12(short electricityGenLastDay12) {
        ElectricityGenLastDay12 = electricityGenLastDay12;
    }

    public short getElectricityGenLastDay13() {
        return ElectricityGenLastDay13;
    }

    public void setElectricityGenLastDay13(short electricityGenLastDay13) {
        ElectricityGenLastDay13 = electricityGenLastDay13;
    }

    public short getElectricityGenLastDay14() {
        return ElectricityGenLastDay14;
    }

    public void setElectricityGenLastDay14(short electricityGenLastDay14) {
        ElectricityGenLastDay14 = electricityGenLastDay14;
    }

    public short getElectricityGenLastDay15() {
        return ElectricityGenLastDay15;
    }

    public void setElectricityGenLastDay15(short electricityGenLastDay15) {
        ElectricityGenLastDay15 = electricityGenLastDay15;
    }

    public short getElectricityGenLastDay16() {
        return ElectricityGenLastDay16;
    }

    public void setElectricityGenLastDay16(short electricityGenLastDay16) {
        ElectricityGenLastDay16 = electricityGenLastDay16;
    }

    public short getElectricityGenLastDay17() {
        return ElectricityGenLastDay17;
    }

    public void setElectricityGenLastDay17(short electricityGenLastDay17) {
        ElectricityGenLastDay17 = electricityGenLastDay17;
    }

    public short getElectricityGenLastDay18() {
        return ElectricityGenLastDay18;
    }

    public void setElectricityGenLastDay18(short electricityGenLastDay18) {
        ElectricityGenLastDay18 = electricityGenLastDay18;
    }

    public short getElectricityGenLastDay19() {
        return ElectricityGenLastDay19;
    }

    public void setElectricityGenLastDay19(short electricityGenLastDay19) {
        ElectricityGenLastDay19 = electricityGenLastDay19;
    }

    public short getElectricityGenLastDay20() {
        return ElectricityGenLastDay20;
    }

    public void setElectricityGenLastDay20(short electricityGenLastDay20) {
        ElectricityGenLastDay20 = electricityGenLastDay20;
    }

    public short getElectricityGenLastDay21() {
        return ElectricityGenLastDay21;
    }

    public void setElectricityGenLastDay21(short electricityGenLastDay21) {
        ElectricityGenLastDay21 = electricityGenLastDay21;
    }

    public short getElectricityGenLastDay22() {
        return ElectricityGenLastDay22;
    }

    public void setElectricityGenLastDay22(short electricityGenLastDay22) {
        ElectricityGenLastDay22 = electricityGenLastDay22;
    }

    public short getElectricityGenLastDay23() {
        return ElectricityGenLastDay23;
    }

    public void setElectricityGenLastDay23(short electricityGenLastDay23) {
        ElectricityGenLastDay23 = electricityGenLastDay23;
    }

    public short getElectricityGenLastDay24() {
        return ElectricityGenLastDay24;
    }

    public void setElectricityGenLastDay24(short electricityGenLastDay24) {
        ElectricityGenLastDay24 = electricityGenLastDay24;
    }

    public short getElectricityGenLastDay25() {
        return ElectricityGenLastDay25;
    }

    public void setElectricityGenLastDay25(short electricityGenLastDay25) {
        ElectricityGenLastDay25 = electricityGenLastDay25;
    }

    public short getElectricityGenLastDay26() {
        return ElectricityGenLastDay26;
    }

    public void setElectricityGenLastDay26(short electricityGenLastDay26) {
        ElectricityGenLastDay26 = electricityGenLastDay26;
    }

    public short getElectricityGenLastDay27() {
        return ElectricityGenLastDay27;
    }

    public void setElectricityGenLastDay27(short electricityGenLastDay27) {
        ElectricityGenLastDay27 = electricityGenLastDay27;
    }

    public short getElectricityGenLastDay28() {
        return ElectricityGenLastDay28;
    }

    public void setElectricityGenLastDay28(short electricityGenLastDay28) {
        ElectricityGenLastDay28 = electricityGenLastDay28;
    }

    public short getElectricityGenLastDay29() {
        return ElectricityGenLastDay29;
    }

    public void setElectricityGenLastDay29(short electricityGenLastDay29) {
        ElectricityGenLastDay29 = electricityGenLastDay29;
    }

    public short getElectricityGenLastDay30() {
        return ElectricityGenLastDay30;
    }

    public void setElectricityGenLastDay30(short electricityGenLastDay30) {
        ElectricityGenLastDay30 = electricityGenLastDay30;
    }

    public short getElectricityGenLastDay31() {
        return ElectricityGenLastDay31;
    }

    public void setElectricityGenLastDay31(short electricityGenLastDay31) {
        ElectricityGenLastDay31 = electricityGenLastDay31;
    }

    public short getElectricityGenLastDay32() {
        return ElectricityGenLastDay32;
    }

    public void setElectricityGenLastDay32(short electricityGenLastDay32) {
        ElectricityGenLastDay32 = electricityGenLastDay32;
    }

    public short getElectricityGenLastDay33() {
        return ElectricityGenLastDay33;
    }

    public void setElectricityGenLastDay33(short electricityGenLastDay33) {
        ElectricityGenLastDay33 = electricityGenLastDay33;
    }

    public short getElectricityGenLastDay34() {
        return ElectricityGenLastDay34;
    }

    public void setElectricityGenLastDay34(short electricityGenLastDay34) {
        ElectricityGenLastDay34 = electricityGenLastDay34;
    }

    public short getElectricityGenLastDay35() {
        return ElectricityGenLastDay35;
    }

    public void setElectricityGenLastDay35(short electricityGenLastDay35) {
        ElectricityGenLastDay35 = electricityGenLastDay35;
    }

    public short getElectricityGenLastDay36() {
        return ElectricityGenLastDay36;
    }

    public void setElectricityGenLastDay36(short electricityGenLastDay36) {
        ElectricityGenLastDay36 = electricityGenLastDay36;
    }

    public short getElectricityGenLastDay37() {
        return ElectricityGenLastDay37;
    }

    public void setElectricityGenLastDay37(short electricityGenLastDay37) {
        ElectricityGenLastDay37 = electricityGenLastDay37;
    }

    public short getElectricityGenLastDay38() {
        return ElectricityGenLastDay38;
    }

    public void setElectricityGenLastDay38(short electricityGenLastDay38) {
        ElectricityGenLastDay38 = electricityGenLastDay38;
    }

    public short getElectricityGenLastDay39() {
        return ElectricityGenLastDay39;
    }

    public void setElectricityGenLastDay39(short electricityGenLastDay39) {
        ElectricityGenLastDay39 = electricityGenLastDay39;
    }

    public short getElectricityGenLastDay40() {
        return ElectricityGenLastDay40;
    }

    public void setElectricityGenLastDay40(short electricityGenLastDay40) {
        ElectricityGenLastDay40 = electricityGenLastDay40;
    }

    public short getElectricityGenLastDay41() {
        return ElectricityGenLastDay41;
    }

    public void setElectricityGenLastDay41(short electricityGenLastDay41) {
        ElectricityGenLastDay41 = electricityGenLastDay41;
    }

    public short getElectricityGenLastDay42() {
        return ElectricityGenLastDay42;
    }

    public void setElectricityGenLastDay42(short electricityGenLastDay42) {
        ElectricityGenLastDay42 = electricityGenLastDay42;
    }

    public short getElectricityGenLastDay43() {
        return ElectricityGenLastDay43;
    }

    public void setElectricityGenLastDay43(short electricityGenLastDay43) {
        ElectricityGenLastDay43 = electricityGenLastDay43;
    }

    public short getElectricityGenLastDay44() {
        return ElectricityGenLastDay44;
    }

    public void setElectricityGenLastDay44(short electricityGenLastDay44) {
        ElectricityGenLastDay44 = electricityGenLastDay44;
    }

    public short getElectricityGenLastDay45() {
        return ElectricityGenLastDay45;
    }

    public void setElectricityGenLastDay45(short electricityGenLastDay45) {
        ElectricityGenLastDay45 = electricityGenLastDay45;
    }

    public short getElectricityGenLastDay46() {
        return ElectricityGenLastDay46;
    }

    public void setElectricityGenLastDay46(short electricityGenLastDay46) {
        ElectricityGenLastDay46 = electricityGenLastDay46;
    }

    public short getElectricityGenLastDay47() {
        return ElectricityGenLastDay47;
    }

    public void setElectricityGenLastDay47(short electricityGenLastDay47) {
        ElectricityGenLastDay47 = electricityGenLastDay47;
    }

    public short getElectricityGenLastDay48() {
        return ElectricityGenLastDay48;
    }

    public void setElectricityGenLastDay48(short electricityGenLastDay48) {
        ElectricityGenLastDay48 = electricityGenLastDay48;
    }

    public short getElectricityGenLastDay49() {
        return ElectricityGenLastDay49;
    }

    public void setElectricityGenLastDay49(short electricityGenLastDay49) {
        ElectricityGenLastDay49 = electricityGenLastDay49;
    }

    public short getElectricityGenLastDay50() {
        return ElectricityGenLastDay50;
    }

    public void setElectricityGenLastDay50(short electricityGenLastDay50) {
        ElectricityGenLastDay50 = electricityGenLastDay50;
    }

    public short getElectricityGenLastDay51() {
        return ElectricityGenLastDay51;
    }

    public void setElectricityGenLastDay51(short electricityGenLastDay51) {
        ElectricityGenLastDay51 = electricityGenLastDay51;
    }

    public short getElectricityGenLastDay52() {
        return ElectricityGenLastDay52;
    }

    public void setElectricityGenLastDay52(short electricityGenLastDay52) {
        ElectricityGenLastDay52 = electricityGenLastDay52;
    }

    public short getElectricityGenLastDay53() {
        return ElectricityGenLastDay53;
    }

    public void setElectricityGenLastDay53(short electricityGenLastDay53) {
        ElectricityGenLastDay53 = electricityGenLastDay53;
    }

    public short getElectricityGenLastDay54() {
        return ElectricityGenLastDay54;
    }

    public void setElectricityGenLastDay54(short electricityGenLastDay54) {
        ElectricityGenLastDay54 = electricityGenLastDay54;
    }

    public short getElectricityGenLastDay55() {
        return ElectricityGenLastDay55;
    }

    public void setElectricityGenLastDay55(short electricityGenLastDay55) {
        ElectricityGenLastDay55 = electricityGenLastDay55;
    }

    public short getElectricityGenLastDay56() {
        return ElectricityGenLastDay56;
    }

    public void setElectricityGenLastDay56(short electricityGenLastDay56) {
        ElectricityGenLastDay56 = electricityGenLastDay56;
    }

    public short getElectricityGenLastDay57() {
        return ElectricityGenLastDay57;
    }

    public void setElectricityGenLastDay57(short electricityGenLastDay57) {
        ElectricityGenLastDay57 = electricityGenLastDay57;
    }

    public short getElectricityGenLastDay58() {
        return ElectricityGenLastDay58;
    }

    public void setElectricityGenLastDay58(short electricityGenLastDay58) {
        ElectricityGenLastDay58 = electricityGenLastDay58;
    }

    public short getElectricityGenLastDay59() {
        return ElectricityGenLastDay59;
    }

    public void setElectricityGenLastDay59(short electricityGenLastDay59) {
        ElectricityGenLastDay59 = electricityGenLastDay59;
    }


}
