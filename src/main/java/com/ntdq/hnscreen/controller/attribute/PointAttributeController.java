package com.ntdq.hnscreen.controller.attribute;

import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.annotation.ModelArguments;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.mapper.AttributeMapper;
import com.ntdq.hnscreen.rest.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

/**
 * 点表添加
 */
@RequestMapping("/point")
@RestController
public class PointAttributeController {


    @Autowired
    private AttributeMapper attributeMapper;

    /**
     * 给对应的模版添加属性
     *
     * @return
     */
    @RequestMapping("/addPoint")
    public RestResponse<String> addPointAttributeBySystem(long templateId, String className) throws ClassNotFoundException {
        //RealTimeOperationInfo realTimeOperationInfo = new RealTimeOperationInfo();
        //HistoricalElectricityGenerate historicalElectricityGenerate = new HistoricalElectricityGenerate();
        //com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStorageInverter
        Class<?> aClass = Class.forName(className);
        List<TemplateAttribute> templateAttributeList = new LinkedList<>();
        AttributeInfo attributeInfo = aClass.getAnnotation(AttributeInfo.class);
        for (Field declaredField : aClass.getDeclaredFields()) {
            ModelArguments modelArguments = declaredField.getAnnotation(ModelArguments.class);
            TemplateAttribute templateAttribute = new TemplateAttribute();
            templateAttribute.setTemplateId(templateId);//1628202088903159810l
            templateAttribute.setAtrbCode(modelArguments.code());
            templateAttribute.setAtrbDataLength(modelArguments.length());
            templateAttribute.setAtrbName(modelArguments.mean());
            templateAttribute.setAtrbMessageAddress(modelArguments.number());
            templateAttribute.setAtrbCoefficient(modelArguments.coefficient());
            templateAttribute.setAtrbType(attributeInfo.funcType());
            templateAttributeList.add(templateAttribute);
        }
        boolean saveSuccess = attributeMapper.saveBatchAttribute(templateAttributeList);
        if (saveSuccess) {
            return RestResponse.createSuccess("插入成功!", null);
        } else {
            return RestResponse.createSuccess("插入失败!", null);
        }
    }


}
