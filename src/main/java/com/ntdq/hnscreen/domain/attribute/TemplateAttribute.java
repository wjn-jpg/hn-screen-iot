package com.ntdq.hnscreen.domain.attribute;


public class TemplateAttribute {

    /**
     * 模版Id
     */
    private long templateId;

    /**
     * 属性编码
     */
    private String atrbCode;

    /**
     * 属性名称
     */
    private String atrbName;

    /**
     * 字节长度
     */
    private int atrbDataLength;

    /**
     * 消息地址
     */
    private long atrbMessageAddress;

    private float atrbCoefficient;


    private int atrbType;

    public int getAtrbType() {
        return atrbType;
    }

    public void setAtrbType(int atrbType) {
        this.atrbType = atrbType;
    }

    public float getAtrbCoefficient() {
        return atrbCoefficient;
    }

    public void setAtrbCoefficient(float atrbCoefficient) {
        this.atrbCoefficient = atrbCoefficient;
    }

    public long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(long templateId) {
        this.templateId = templateId;
    }

    public String getAtrbCode() {
        return atrbCode;
    }

    public void setAtrbCode(String atrbCode) {
        this.atrbCode = atrbCode;
    }

    public String getAtrbName() {
        return atrbName;
    }

    public void setAtrbName(String atrbName) {
        this.atrbName = atrbName;
    }

    public int getAtrbDataLength() {
        return atrbDataLength;
    }

    public void setAtrbDataLength(int atrbDataLength) {
        this.atrbDataLength = atrbDataLength;
    }

    public long getAtrbMessageAddress() {
        return atrbMessageAddress;
    }

    public void setAtrbMessageAddress(long atrbMessageAddress) {
        this.atrbMessageAddress = atrbMessageAddress;
    }
}
