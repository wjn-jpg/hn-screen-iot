package com.ntdq.hnscreen.modbus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class ModBusConfig implements InitializingBean {

    private static final Logger logger = LoggerFactory.getLogger(ModBusConfig.class);

    /**
     * modBus配置文件
     */
    private final static String MODBUS_TCP_PROPERTIES_FILE_PATH = "/modbusTcp.properties";


    private final static String MODBUS_SERIAL_PROPERTIES_FILE_PATH = "/modbusSerial.properties";

    private final Map<String, ModBusTcpClient> serviceNameModBusTcpClientMap = new ConcurrentHashMap<>();

    private final Map<String, ModBusTcpServer> serviceNameModBusTcpServerMap = new ConcurrentHashMap<>();

    private final Map<String, ModBusSerialClient> serviceNameModBusSerialClientMap = new ConcurrentHashMap<>();

    public Map<String, ModBusTcpClient> getServiceNameModBusTcpClientMap() {
        return serviceNameModBusTcpClientMap;
    }

    public Map<String, ModBusTcpServer> getServiceNameModBusTcpServerMap() {
        return serviceNameModBusTcpServerMap;
    }

    public Map<String, ModBusSerialClient> getServiceNameModBusSerialClientMap() {
        return serviceNameModBusSerialClientMap;
    }

    /**
     * 初始化ModBusClient
     */
    private void initModBusClientConfig() {
        logger.info("读取配置文件,初始化所有ModBus客户端和服务端");
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource(MODBUS_TCP_PROPERTIES_FILE_PATH));
            for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
                String key = (String) objectObjectEntry.getKey();
                if (key.contains("clientName")) {
                    ModBusTcpClient modBusTcpClient = new ModBusTcpClient();
                    String clientName = (String) objectObjectEntry.getValue();
                    modBusTcpClient.setServiceName(clientName);
                    String addressValueKey = key.replace("clientName", "ip");
                    String ip = (String) properties.get(addressValueKey);
                    String replace = key.replace("clientName", "style");
                    String style = (String) properties.get(replace);
                    modBusTcpClient.setModbusIp(ip);
                    modBusTcpClient.setStyle(style);
                    serviceNameModBusTcpClientMap.put(clientName, modBusTcpClient);
                } else if (key.contains("serverName")) {
                    ModBusTcpServer modBusTcpServer = new ModBusTcpServer();
                    String serverName = (String) objectObjectEntry.getValue();
                    modBusTcpServer.setServiceName(serverName);
                    String addressValueKey = key.replace("serverName", "port");
                    String port = (String) properties.get(addressValueKey);
                    modBusTcpServer.setModbusPort(Integer.parseInt(port));
                    serviceNameModBusTcpServerMap.put(serverName, modBusTcpServer);
                }
            }
            System.out.println(properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void initModBusSerialConfig() {
        logger.info("读取配置文件,初始化所有ModBus串口");
        try {
            Properties properties = PropertiesLoaderUtils.loadProperties(new ClassPathResource(MODBUS_SERIAL_PROPERTIES_FILE_PATH));
            for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
                String key = (String) objectObjectEntry.getKey();
                if (key.contains("serialName")) {
                    ModBusSerialClient modBusSerialClient = new ModBusSerialClient();
                    String clientName = (String) objectObjectEntry.getValue();
                    modBusSerialClient.setServiceName(clientName);
                    String addressValueKey = key.replace("serialName", "serialPort");
                    String serialPortAndBoundRate = (String) properties.get(addressValueKey);
                    String[] serialPortAndBoundRateArr = serialPortAndBoundRate.split("_");
                    modBusSerialClient.setPortName(serialPortAndBoundRateArr[0]);
                    modBusSerialClient.setBoundRate(Integer.parseInt(serialPortAndBoundRateArr[1]));
                    serviceNameModBusSerialClientMap.put(clientName, modBusSerialClient);
                }
            }
            System.out.println(properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        initModBusClientConfig();
        initModBusSerialConfig();
    }
}
