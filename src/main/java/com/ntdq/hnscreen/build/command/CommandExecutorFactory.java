package com.ntdq.hnscreen.build.command;

public class CommandExecutorFactory {

    public static com.ntdq.hnscreen.build.command.CommandGenExecutor findCommandExecutorByServiceName(String serviceName) {
        CommandGenExecutor commandGenExecutor = null;
        switch (serviceName) {
            case "EnergyPCS":
                commandGenExecutor = new EnergyPCSExecutor();
                return commandGenExecutor;
            case "EnergyBA":
                commandGenExecutor = new EnergyBAExecutor();
                return commandGenExecutor;
            case "EnergyPLC":
                commandGenExecutor = new EnergyBAExecutor();
                return commandGenExecutor;
            case "Pho":
                commandGenExecutor = new PhotovoltaicInvertExecutor();
                break;
            case "Fan":
                commandGenExecutor = new FanInvertExecutor();
                break;
        }
        return commandGenExecutor;
    }
}
