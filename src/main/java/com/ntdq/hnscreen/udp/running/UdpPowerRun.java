package com.ntdq.hnscreen.udp.running;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UdpPowerRun implements ApplicationRunner {

    private List<UdpPowerStartServer> udpPowerStartServerList;


    @Autowired
    public void setUdpPowerStartServerList(List<UdpPowerStartServer> udpPowerStartServerList) {
        this.udpPowerStartServerList = udpPowerStartServerList;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        udpPowerStartServerList.forEach(UdpPowerStartServer::startUdpServer);
    }
}
