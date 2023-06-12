package com.ntdq.hnscreen.build.command;

import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;

import java.util.List;

public class PointAttributeParse {

    /**
     * 转换Class
     */
    private Class<?> boClass;


    private List<TemplateAttribute> templateAttributes;


    private int transactionId;

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Class<?> getBoClass() {
        return boClass;
    }

    public void setBoClass(Class<?> boClass) {
        this.boClass = boClass;
    }

    public List<TemplateAttribute> getTemplateAttributes() {
        return templateAttributes;
    }

    public void setTemplateAttributes(List<TemplateAttribute> templateAttributes) {
        this.templateAttributes = templateAttributes;
    }
}
