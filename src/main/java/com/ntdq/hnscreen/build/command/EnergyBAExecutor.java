package com.ntdq.hnscreen.build.command;

import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStackYC;
import com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStoreYC;
import com.ntdq.hnscreen.handler.mapping.PointMapping;

import java.util.LinkedList;
import java.util.List;

public class EnergyBAExecutor  implements CommandGenExecutor{
    private static final int FIRST_ADDRESS = 0;

    private final List<PointAttributeParse> pointAttributeParses = new LinkedList<>();

    private static PointMapping pointMapping;

    private static final long templateEnergy = 1628209117201903617L;

    public static void setPointMapping(PointMapping pointMapping) {
        EnergyBAExecutor.pointMapping = pointMapping;
    }

    @Override
    public List<PointAttributeParse> getPointAttributeParseList() {
        List<TemplateAttribute> templateAttributesByIndex = pointMapping.getTemplateAttributesByIndex(templateEnergy);
        //根据顺序来
        PointAttributeParse energyYC = new PointAttributeParse();
        energyYC.setBoClass(EnergyStackYC.class);
        pointAttributeParses.add(energyYC);

        pointAttributeParses.forEach(pointAttributeParseItem -> {
            fillPointParse(pointAttributeParseItem, templateAttributesByIndex);
        });
        return pointAttributeParses;
    }

}
