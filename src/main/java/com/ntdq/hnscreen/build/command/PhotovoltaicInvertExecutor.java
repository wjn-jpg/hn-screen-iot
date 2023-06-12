package com.ntdq.hnscreen.build.command;

import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.PhotovoltaicInvert.PhotovoltaicInvertYCInfo;
import com.ntdq.hnscreen.domain.point.PhotovoltaicInvert.PhotovoltaicInvertYXInfo;
import com.ntdq.hnscreen.handler.mapping.PointMapping;

import java.util.LinkedList;
import java.util.List;

public class PhotovoltaicInvertExecutor implements CommandGenExecutor {
    private static final int FIRST_ADDRESS = 0;

    private final List<com.ntdq.hnscreen.build.command.PointAttributeParse> pointAttributeParses = new LinkedList<>();


    private static PointMapping pointMapping;


    private long PhotovoltaicInvert = 1628217422741712898L;

    public static void setPointMapping(PointMapping pointMapping) {
        PhotovoltaicInvertExecutor.pointMapping = pointMapping;
    }

    /**
     * @param serviceName 服务名称
     * @param
     * @return
     */
//    @Override
//    public List<ModBusRtuSendMessage> buildCommandRtu(String serviceName) {
//        List<ModBusRtuSendMessage> modBusRtuSendMessages = new LinkedList<>();
//        ModBusRtuSendMessage modBusRtuSendMessage = new ModBusRtuSendMessage();
//        if (serviceName.equalsIgnoreCase("光伏")) {
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
//    }

    @Override
    public List<com.ntdq.hnscreen.build.command.PointAttributeParse> getPointAttributeParseList() {
        List<TemplateAttribute> templateAttributesByIndex = pointMapping.getTemplateAttributesByIndex(PhotovoltaicInvert);
        //根据顺序来
        com.ntdq.hnscreen.build.command.PointAttributeParse pointAttributeParse1 = new com.ntdq.hnscreen.build.command.PointAttributeParse();
        pointAttributeParse1.setBoClass(PhotovoltaicInvertYCInfo.class);
        pointAttributeParses.add(pointAttributeParse1);
        com.ntdq.hnscreen.build.command.PointAttributeParse pointAttributeParse2 = new PointAttributeParse();
        pointAttributeParse2.setBoClass(PhotovoltaicInvertYXInfo.class);
        pointAttributeParses.add(pointAttributeParse2);

        pointAttributeParses.forEach(pointAttributeParseItem -> {
            fillPointParse(pointAttributeParseItem, templateAttributesByIndex);
        });

        return pointAttributeParses;
    }
}
