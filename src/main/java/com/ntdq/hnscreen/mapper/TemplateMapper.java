package com.ntdq.hnscreen.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface TemplateMapper {

    /**
     * 根据系统Name获取主Id
     * @param systemName
     * @return
     */
    Long getTemplateIdByName(@Param("systemName") String systemName);


    /**
     * 根据typeId查询到该子系统下面的所有模版Id
     * @param typeId
     * @return
     */
    List<Long> getTemplateIdsByTypeId(@Param("typeId") Long typeId);


    /**
     * 根据模版id查询到当前子系统下面的所有子设备
     * @param tmplId
     * @return
     */
    List<String> getDeviceCodesByTemplateId(@Param("tmplId") Long tmplId);

}
