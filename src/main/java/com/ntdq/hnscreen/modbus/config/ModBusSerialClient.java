package com.ntdq.hnscreen.modbus.config;

public class ModBusSerialClient {

    private String serviceName;

    private int boundRate;

    private String portName;

    public int getBoundRate() {
        return boundRate;
    }

    public void setBoundRate(int boundRate) {
        this.boundRate = boundRate;
    }

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
