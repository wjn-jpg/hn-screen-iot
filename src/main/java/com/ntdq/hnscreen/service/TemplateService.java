package com.ntdq.hnscreen.service;

import java.util.List;
import java.util.Map;

public interface TemplateService {

    /**
     * 根据模版id去查询下面的所有关联设备
     *
     * @return
     */
    Map<Long, List<String>> getTemplateIdDeviceCodesMap(List<Long> templateIds);


}
