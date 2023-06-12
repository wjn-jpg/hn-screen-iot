package com.ntdq.hnscreen.modbus.running;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ModBusTcpRun implements ApplicationRunner {

    private List<ModBusStartServer> modBusStartServers;

    @Autowired
    public void setModBusStartServers(List<ModBusStartServer> modBusStartServers) {
        this.modBusStartServers = modBusStartServers;
    }

    //    private ModBusTcpClientStartServer modBusTcpClientStartServer;
//
//    private ModBusTcpServerStartServer modBusTcpServerStartServer;
//
//    @Autowired
//    public void setModBusTcpClientStartServer(ModBusTcpClientStartServer modBusTcpClientStartServer) {
//        this.modBusTcpClientStartServer = modBusTcpClientStartServer;
//    }
//
//    @Autowired
//    public void setModBusTcpServerStartServer(ModBusTcpServerStartServer modBusTcpServerStartServer) {
//        this.modBusTcpServerStartServer = modBusTcpServerStartServer;
//    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (modBusStartServers != null && modBusStartServers.size() > 0) {
            modBusStartServers.forEach(ModBusStartServer::startServer);
        }
    }
}
