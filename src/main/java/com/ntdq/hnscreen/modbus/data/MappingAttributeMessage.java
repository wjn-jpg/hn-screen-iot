package com.ntdq.hnscreen.modbus.data;

import cn.hutool.core.util.ByteUtil;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.domain.point.BasePointInfo;
import com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStackYC;
import com.ntdq.hnscreen.domain.point.EnergyStorage.EnergyStoreYC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.List;

public abstract class MappingAttributeMessage implements RecAndWriMessage {

    private static final Logger logger = LoggerFactory.getLogger(MappingAttributeMessage.class);

    public BasePointInfo mappingAttribute(byte[] data, BasePointInfo basePointInfo, List<TemplateAttribute> templateAttributes) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int index = 0;
        int length = data[index++];
        logger.info("解析数据长度:{}", length);
        long firstAddress = 0;
        for (TemplateAttribute templateAttribute : templateAttributes) {
            if (firstAddress == 0) {
                firstAddress = templateAttribute.getAtrbMessageAddress();
            }
            long theoryAddress = firstAddress + ((index - 1) / 2);//理论地址
            while (theoryAddress < templateAttribute.getAtrbMessageAddress()) {
                theoryAddress++;
                index = index + 2;
            }
            if (index >= data.length) {
                return basePointInfo;
            }
            String SetMethod = "set" + templateAttribute.getAtrbCode();
            Method executeMethod = null;
            for (Method method : basePointInfo.getClass().getMethods()) {
                if (method.getName().equalsIgnoreCase(SetMethod)) {
                    executeMethod = method;
                    break;
                }
            }
            //Method method = basePointInfo.getClass().getMethod(GetMethod);
            byte[] resultByte = new byte[templateAttribute.getAtrbDataLength()];
            for (int i = 0; i < templateAttribute.getAtrbDataLength(); i++) {
                resultByte[i] = data[index++];
            }
//            double value = 0;
            try {
                switch (templateAttribute.getAtrbDataLength()) {
                    case 1:
                        byte value1Byte = resultByte[0];
                        executeMethod.invoke(basePointInfo, value1Byte);
                        break;
                    case 2:
                        short value2Byte = ByteUtil.bytesToShort(resultByte);
                        value2Byte = (short) (value2Byte * templateAttribute.getAtrbCoefficient());
                        executeMethod.invoke(basePointInfo, value2Byte);
                        break;
                    case 4:
                        if (basePointInfo instanceof EnergyStoreYC) {
                            byte[] reverseByte = new byte[4];
                            System.arraycopy(resultByte, 2, reverseByte, 0, 2);
                            System.arraycopy(resultByte, 0, reverseByte, 2, 2);
                            resultByte = reverseByte;
                        }else if (basePointInfo instanceof EnergyStackYC){
                            ByteBuffer buffer = ByteBuffer.wrap(resultByte);
                            float value = buffer.getFloat();
                            executeMethod.invoke(basePointInfo,value);
                            break;
                        }
                        float value4Byte = ByteUtil.bytesToInt(resultByte);
//                        float value4Byte = Float.intBitsToFloat(resultByte[0] ^ resultByte[1] << 8 ^ resultByte[2] << 16 ^ resultByte[3] << 24);
                        // double value4Byte = ByteUtil.bytesToDouble(resultByte);
                        value4Byte = value4Byte * templateAttribute.getAtrbCoefficient();
                        executeMethod.invoke(basePointInfo, value4Byte);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
////            value = value * templateAttribute.getAtrbCoefficient();
//            assert executeMethod != null;
//            executeMethod.invoke(basePointInfo, value);
        }
        return basePointInfo;
    }

    public static void main(String[] args) throws Exception {
//        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
//        String format = decimalFormat.format(2.3830346E28);
//        System.out.println(format);
        byte[] data = new byte[]{0x00, 0x00, 0x2c, (byte) 0xa6};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        float v = dataInputStream.readFloat();
        System.out.println(v);
        BigDecimal bigDecimal = new BigDecimal(v);
        System.out.println(bigDecimal);

        int a = 114300;
        float b = a;
        System.out.println(b);

        float resutlt = ByteUtil.bytesToInt(data);
        System.out.println(resutlt);
    }

}
