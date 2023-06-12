package com.ntdq.hnscreen.modbus.config;

public class ModBusTcpServer {

    private String modbusIp = "127.0.0.1";

    private int modbusPort;

    private String serviceName;

    private String style;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    public String getModbusIp() {
        return modbusIp;
    }

    public void setModbusIp(String modbusIp) {
        this.modbusIp = modbusIp;
    }

    public int getModbusPort() {
        return modbusPort;
    }

    public void setModbusPort(int modbusPort) {
        this.modbusPort = modbusPort;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
