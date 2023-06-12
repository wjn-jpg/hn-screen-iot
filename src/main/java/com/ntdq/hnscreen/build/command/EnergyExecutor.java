package com.ntdq.hnscreen.build.command;


import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStorageInverter;
import com.ntdq.hnscreen.handler.mapping.PointMapping;

import java.util.LinkedList;
import java.util.List;

public class EnergyExecutor implements CommandGenExecutor {

    private static final int FIRST_ADDRESS = 0;

    private final List<PointAttributeParse> pointAttributeParses = new LinkedList<>();


    private static PointMapping pointMapping;


    private long templateEnergy = 1628202088903159810L;

    public static void setPointMapping(PointMapping pointMapping) {
        EnergyExecutor.pointMapping = pointMapping;
    }


    @Override
    public List<ModBusRtuSendMessage> buildCommandRtu(List<PointAttributeParse> pointAttributeParseList) {
//        List<ModBusRtuSendMessage> modBusRtuSendMessages = new LinkedList<>();
//        ModBusRtuSendMessage modBusRtuSendMessage = new ModBusRtuSendMessage();
//        if (serviceName.equalsIgnoreCase("储能")) {
//            ModBusRtuHeader modBusRtuHeader = new ModBusRtuHeader();
//            modBusRtuHeader.setDeviceAddress(FIRST_ADDRESS);
//            modBusRtuHeader.setFunctionCode((short) 3);
//            ModBusRtuSendBody modBusRtuSendBody = new ModBusRtuSendBody();
//            modBusRtuSendBody.setBeginAddress((short) 18189);
//            modBusRtuSendBody.setReadNum((short) 98);
//            modBusRtuSendMessage.setModBusHeader(modBusRtuHeader);
//            modBusRtuSendMessage.setModBusPayLoad(modBusRtuSendBody);
//        }
//        modBusRtuSendMessages.add(modBusRtuSendMessage);
//        return modBusRtuSendMessages;
        return null;
    }

    @Override
    public List<PointAttributeParse> getPointAttributeParseList() {
        List<TemplateAttribute> templateAttributesByIndex = pointMapping.getTemplateAttributesByIndex(templateEnergy);
        //根据顺序来
        PointAttributeParse pointAttributeParse = new PointAttributeParse();
        pointAttributeParse.setBoClass(EnergyStorageInverter.class);
        pointAttributeParses.add(pointAttributeParse);

        pointAttributeParses.forEach(pointAttributeParseItem->{
            fillPointParse(pointAttributeParseItem,templateAttributesByIndex);
        });

        return pointAttributeParses;
    }

    public static void main(String[] args) {
        short a = 13;
        byte b = (byte) a;
        System.out.println(b);

    }
}
