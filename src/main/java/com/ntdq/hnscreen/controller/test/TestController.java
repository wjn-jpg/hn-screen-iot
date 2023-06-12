package com.ntdq.hnscreen.controller.test;

import com.ntdq.hnscreen.mapper.TemplateMapper;
import com.ntdq.hnscreen.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestController {

    private static final String SYSTEM_NAME = "海南大屏";

    public TemplateMapper templateMapper;


    private TemplateService templateService;

    @Autowired
    public void setTemplateService(TemplateService templateService) {
        this.templateService = templateService;
    }

    @Autowired
    public void setTemplateMapper(TemplateMapper templateMapper) {
        this.templateMapper = templateMapper;
    }

    @RequestMapping("/query")
    public void test() {
        Long templateIdByName = templateMapper.getTemplateIdByName(SYSTEM_NAME);
        List<Long> templateIdsByTypeId = templateMapper.getTemplateIdsByTypeId(templateIdByName);
        System.out.println(templateIdsByTypeId);
        Map<Long, List<String>> templateIdDeviceCodesMap = templateService.getTemplateIdDeviceCodesMap(templateIdsByTypeId);
        System.out.println(templateIdDeviceCodesMap);
    }


}
