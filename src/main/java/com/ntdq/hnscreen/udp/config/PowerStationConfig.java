package com.ntdq.hnscreen.udp.config;

import com.ntdq.hnscreen.udp.running.PowerStationServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class PowerStationConfig implements InitializingBean {

    /**
     * 日志
     */
    private final Logger logger = LoggerFactory.getLogger(PowerStationConfig.class);

    /**
     * 服务名充电桩信息
     */
    private final Map<String, PowerStationServer> serviceNamePowerStationServiceMap = new ConcurrentHashMap<>();

    public Map<String, PowerStationServer> getServiceNamePowerStationServiceMap() {
        return serviceNamePowerStationServiceMap;
    }

    private final static String POWER_STATION_UDP_PROPERTIES_FILE_PATH = "/powerStation.properties";

    /**
     * 初始化ModBusClient
     */
    private void initUdpPowerStationServiceConfig() {
        logger.info("读取配置文件,初始化所有充电桩服务端");
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource(POWER_STATION_UDP_PROPERTIES_FILE_PATH));
            for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
                String key = (String) objectObjectEntry.getKey();
                if (key.contains("ip")) {
                    PowerStationServer powerStationServer = new PowerStationServer();
                    powerStationServer.setAddress((String) objectObjectEntry.getValue());
                    String portConfigStr = key.replace("ip", "port");
                    String portValue = (String) properties.get(portConfigStr);
                    powerStationServer.setPort(Integer.valueOf(portValue));
                    String serviceName = key.split("\\.")[0];
                    powerStationServer.setServerName(serviceName);
                    serviceNamePowerStationServiceMap.put(serviceName, powerStationServer);
                }
            }
            System.out.println(properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initUdpPowerStationServiceConfig();
    }
}
