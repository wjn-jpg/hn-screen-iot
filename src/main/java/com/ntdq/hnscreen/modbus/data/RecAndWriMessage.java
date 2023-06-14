package com.ntdq.hnscreen.modbus.data;

import cn.hutool.core.util.ByteUtil;
import com.ntdq.hnscreen.build.command.PointAttributeParse;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.BasePointInfo;
import com.ntdq.hnscreen.modbus.domain.ModBusHeader;
import com.ntdq.hnscreen.modbus.domain.ModBusPayload;
import io.netty.channel.Channel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;


public interface RecAndWriMessage {


    void acceptMessage(Channel channel, ModBusHeader modBusHeader, ModBusPayload modBusPayload, Map<Integer, PointAttributeParse> transactionPointAttributeParseMap);

//    default BasePointInfo mappingAttribute(byte[] data, BasePointInfo basePointInfo, List<TemplateAttribute> templateAttributes) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        int index = 0;
//        for (TemplateAttribute templateAttribute : templateAttributes) {
//            if (index >= data.length) {
//                return basePointInfo;
//            }
//            String GetMethod = "set" + templateAttribute.getAtrbCode();
//            Method method = basePointInfo.getClass().getMethod(GetMethod);
//            byte[] resultByte = new byte[templateAttribute.getAtrbDataLength()];
//            for (int i = 0; i < templateAttribute.getAtrbDataLength(); i++) {
//                resultByte[i] = data[index++];
//            }
//            double value = 0;
//            switch (templateAttribute.getAtrbDataLength()) {
//                case 2:
//                    value = ByteUtil.bytesToShort(resultByte);
//                    break;
//                case 4:
//                    value = ByteUtil.bytesToDouble(resultByte);
//                    break;
//            }
//            value = value * templateAttribute.getAtrbCoefficient();
//            method.invoke(basePointInfo, value);
//        }
//        return basePointInfo;
//    }

}
