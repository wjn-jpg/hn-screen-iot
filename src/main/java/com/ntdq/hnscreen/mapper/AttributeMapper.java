package com.ntdq.hnscreen.mapper;

import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttributeMapper {


    boolean saveBatchAttribute(List<TemplateAttribute> templateAttributes);

    /**
     * 根据一个模版Id 查询下面所有的属性
     * @param templateId
     * @return
     */
    List<TemplateAttribute> findAllAttributeInfoByTemplateId(Long templateId);

}
