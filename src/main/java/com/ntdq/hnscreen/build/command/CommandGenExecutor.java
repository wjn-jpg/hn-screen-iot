package com.ntdq.hnscreen.build.command;


import com.ntdq.hnscreen.annotation.AttributeInfo;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuMessageGenerate;
import com.ntdq.hnscreen.build.modbusmessage.ModBusRtuSendMessage;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuHeader;
import com.ntdq.hnscreen.build.modbusmessage.messageComponent.ModBusRtuSendBody;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusMessageGenerate;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import com.ntdq.hnscreen.modbus.domain.ModBusTcpMessage;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 命令生成器
 */
public interface CommandGenExecutor {

    /**
     * @param
     * @param
     * @return
     */
    default List<ModBusRtuSendMessage> buildCommandRtu(List<PointAttributeParse> pointAttributeParseList) {
        List<ModBusRtuSendMessage> modBusRtuSendMessages = new LinkedList<>();
        pointAttributeParseList.forEach(pointAttributeParse -> {
            List<TemplateAttribute> templateAttributes = pointAttributeParse.getTemplateAttributes();
            //获取获取数据数量
            int count = templateAttributes.size();
            //拿到首地址
            long address = templateAttributes.size() > 0 ? templateAttributes.get(0).getAtrbMessageAddress() : 0;
            ModBusRtuHeader modBusRtuHeader = ModBusRtuMessageGenerate.newReadInputRegistersReqHeader(1, pointAttributeParse.getType());
            ModBusRtuSendBody modBusRtuSendBody = ModBusRtuMessageGenerate.newReadInputRegistersReqPayLoad((int) address, count);
            ModBusRtuSendMessage modBusRtuSendMessage = new ModBusRtuSendMessage();
            modBusRtuSendMessage.setModBusHeader(modBusRtuHeader);
            modBusRtuSendMessage.setModBusPayLoad(modBusRtuSendBody);
            modBusRtuSendMessages.add(modBusRtuSendMessage);
        });
        return modBusRtuSendMessages;
    }

    default List<ModBusTcpMessage> buildCommandTcp(List<PointAttributeParse> pointAttributeParseList) {
        List<ModBusTcpMessage> modBusTcpMessages = new LinkedList<>();
        pointAttributeParseList.forEach(pointAttributeParse -> {
            List<TemplateAttribute> templateAttributes = pointAttributeParse.getTemplateAttributes();

            //拿到首地址
            long address = templateAttributes.size() > 0 ? templateAttributes.get(0).getAtrbMessageAddress() : 0;

            //末尾地址
            long lastAddress = templateAttributes.size() > 0 ? templateAttributes.get(templateAttributes.size() - 1).getAtrbMessageAddress() : 0;

            int totalLength = 0;
            for (TemplateAttribute templateAttribute : templateAttributes) {
                totalLength += templateAttribute.getAtrbDataLength();
            }
            int count = totalLength / 2;
//            int count = ((int) (lastAddress - address)) + 1;
//            count = count + (templateAttributes.get(templateAttributes.size() - 1).getAtrbDataLength() / 2);
            //=====
//            byte[] payload = new byte[4];
//            ByteUtil.copyBytes(payload, ByteUtil.hexStringToBytes(String.valueOf(address)), 0);
//            ByteUtil.copyBytes(payload, ByteUtil.intToBytesBig(count), 2);
            ModBusHeader modBusHeader = ModBusMessageGenerate.newReadInputRegistersReqHeader(pointAttributeParse.getTransactionId());
            ModBusPayload modBusPayload = ModBusMessageGenerate.newReadHoldingRegistersReqPayLoad((int) address, count, pointAttributeParse.getType());
            ModBusTcpMessage modBusTcpMessage = new ModBusTcpMessage();
            modBusTcpMessage.setModBusHeader(modBusHeader);
            modBusTcpMessage.setModBusPayload(modBusPayload);
            modBusTcpMessages.add(modBusTcpMessage);
        });
        return modBusTcpMessages;
    }


    List<PointAttributeParse> getPointAttributeParseList();


    default PointAttributeParse fillPointParse(PointAttributeParse pointAttributeParse, List<TemplateAttribute> templateAttributesByIndex) {
        AttributeInfo attributeInfo = pointAttributeParse.getBoClass().getAnnotation(AttributeInfo.class);
        List<TemplateAttribute> attributesList = templateAttributesByIndex.stream().filter(templateAttribute ->
                        templateAttribute.getAtrbMessageAddress() >= attributeInfo.startIndex()
                                && templateAttribute.getAtrbMessageAddress() <= attributeInfo.endIndex())
                .sorted(Comparator.comparing(TemplateAttribute::getAtrbMessageAddress))
                .collect(Collectors.toList());
        pointAttributeParse.setTemplateAttributes(attributesList);
        pointAttributeParse.setType(attributeInfo.funcType());
        return pointAttributeParse;
    }


}
