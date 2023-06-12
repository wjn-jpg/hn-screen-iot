package com.ntdq.hnscreen.service;

import com.ntdq.hnscreen.mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 模版设备关联
 */
@Service
public class TemplateServiceImpl implements TemplateService {

    private TemplateMapper templateMapper;


    @Autowired
    public void setTemplateMapper(TemplateMapper templateMapper) {
        this.templateMapper = templateMapper;
    }

    @Override
    public Map<Long, List<String>> getTemplateIdDeviceCodesMap(List<Long> templateIds) {
        Map<Long, List<String>> templateIdCodeListMap = new HashMap<>();
        for (Long templateId : templateIds) {
            List<String> deviceCodesByTemplateId = templateMapper.getDeviceCodesByTemplateId(templateId);
            templateIdCodeListMap.put(templateId,deviceCodesByTemplateId);
        }
        return templateIdCodeListMap;
    }


}
