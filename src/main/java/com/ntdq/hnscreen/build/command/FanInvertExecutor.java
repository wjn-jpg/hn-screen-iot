package com.ntdq.hnscreen.build.command;

import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.FanInvert.HistoricalElectricityGenerate;
import com.ntdq.hnscreen.domain.point.FanInvert.RealTimeOperationInfo;
import com.ntdq.hnscreen.handler.mapping.PointMapping;

import java.util.LinkedList;
import java.util.List;

public class FanInvertExecutor implements CommandGenExecutor {

    private final List<PointAttributeParse> pointAttributeParses = new LinkedList<>();

    private static PointMapping pointMapping;

    private static final long FanInvert = 1628202088903159810L;

    public static void setPointMapping(PointMapping pointMapping) {
        FanInvertExecutor.pointMapping = pointMapping;
    }

    @Override
    public List<PointAttributeParse> getPointAttributeParseList() {
        List<TemplateAttribute> templateAttributesByIndex = pointMapping.getTemplateAttributesByIndex(FanInvert);
        PointAttributeParse realPointAttribute = new PointAttributeParse();
        realPointAttribute.setBoClass(RealTimeOperationInfo.class);
        pointAttributeParses.add(realPointAttribute);
        PointAttributeParse historyEleAttribute = new PointAttributeParse();
        historyEleAttribute.setBoClass(HistoricalElectricityGenerate.class);
        pointAttributeParses.add(historyEleAttribute);
        pointAttributeParses.forEach(pointAttributeParse -> {
            fillPointParse(pointAttributeParse, templateAttributesByIndex);
        });
        return pointAttributeParses;
    }
}
