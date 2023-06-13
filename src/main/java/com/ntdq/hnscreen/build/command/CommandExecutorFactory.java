package com.ntdq.hnscreen.build.command;

public class CommandExecutorFactory {

    public static com.ntdq.hnscreen.build.command.CommandGenExecutor findCommandExecutorByServiceName(String serviceName) {
        CommandGenExecutor commandGenExecutor = null;
        switch (serviceName) {
            case "Energy":
                commandGenExecutor = new EnergyExecutor();
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
