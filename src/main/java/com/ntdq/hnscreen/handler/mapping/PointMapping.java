package com.ntdq.hnscreen.handler.mapping;

import cn.hutool.core.util.ByteUtil;
import com.ntdq.hnscreen.build.command.EnergyExecutor;
import com.ntdq.hnscreen.build.command.PhotovoltaicInvertExecutor;
import com.ntdq.hnscreen.domain.attribute.TemplateAttribute;
import com.ntdq.hnscreen.mapper.AttributeMapper;
import com.ntdq.hnscreen.redis.RedisClient;
import io.netty.channel.oio.OioEventLoopGroup;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * 点表映射
 */
@Component
public class PointMapping implements InitializingBean {

    private static final Long templateIdOnEnergy = 1628209117201903617L;

    private static final String EnergyCode = "817e1662-ba66-4b35-add9-c68f32209a4e";

    private AttributeMapper attributeMapper;

    private List<TemplateAttribute> templateAttributes = new LinkedList<>();

    private RedisClient redisClient;

    @Autowired
    public void setRedisClient(RedisClient redisClient) {
        this.redisClient = redisClient;
    }

    @Autowired
    public void setAttributeMapper(AttributeMapper attributeMapper) {
        this.attributeMapper = attributeMapper;
    }

    public void setTemplateAttributes(List<TemplateAttribute> templateAttributes) {
        this.templateAttributes = templateAttributes;
    }

    /**
     * 最终将结果存到Redis
     *
     * @param dataList
     */
    private void restoreRedis(List<Map<String, Map<String, String>>> dataList) {
        new Thread(() -> {
            for (Map<String, Map<String, String>> stringMapMap : dataList) {
                for (Map.Entry<String, Map<String, String>> stringMapEntry : stringMapMap.entrySet()) {
                    String key = stringMapEntry.getKey();
                    Map<String, String> value = stringMapEntry.getValue();
                    redisClient.putHash("ntdq", key, value);
                }
            }
        }).start();
    }

//    public void mappingAttribute(byte[] data) {
//        int index = 0;
//        List<Map<String, Map<String, String>>> keyRedisList = new LinkedList<>();
//        for (TemplateAttribute templateAttribute : templateAttributes) {
//            if (index >= data.length) {
//                return;
//            }
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
//            Map<String, String> keyValueMap = new HashMap<>();
//            keyValueMap.put("deviceId", EnergyCode);
//            keyValueMap.put("attriCode", templateAttribute.getAtrbCode());
//            keyValueMap.put("updateTime", new Date().toString());
//            keyValueMap.put("value", String.valueOf(value));
//
//            String key = EnergyCode + "_" + templateAttribute.getAtrbCode();
//            Map<String, Map<String, String>> finalMap = new HashMap<>();
//            finalMap.put(key, keyValueMap);
//            keyRedisList.add(finalMap);
//        }
//        restoreRedis(keyRedisList);
//    }

    public List<TemplateAttribute> getTemplateAttributesByIndex(long templateId) {
        List<TemplateAttribute> allAttributeInfoByTemplateId = attributeMapper.findAllAttributeInfoByTemplateId(templateId);
        if (allAttributeInfoByTemplateId.size() > 0) {
            return allAttributeInfoByTemplateId;
        }
        return null;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        EnergyExecutor.setPointMapping(this);
        PhotovoltaicInvertExecutor.setPointMapping(this);
//        List<TemplateAttribute> allAttributeInfoByTemplateId = attributeMapper.findAllAttributeInfoByTemplateId(templateIdOnEnergy);
//        System.out.println(allAttributeInfoByTemplateId);
//        allAttributeInfoByTemplateId = allAttributeInfoByTemplateId.stream().sorted(Comparator.comparingLong(TemplateAttribute::getAtrbMessageAddress)).collect(Collectors.toList());
//        templateAttributes.addAll(allAttributeInfoByTemplateId);
//        byte[] bytes = new byte[100];
//        for (int i = 0; i < 100; i++) {
//            bytes[i] = (byte) i;
//        }
        //mappingAttribute(bytes);
    }

    public static void main(String[] args) {
        new OioEventLoopGroup();
    }
}
