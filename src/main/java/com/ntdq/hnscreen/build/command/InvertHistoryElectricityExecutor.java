package com.ntdq.hnscreen.build.command;

import java.util.List;

public class InvertHistoryElectricityExecutor implements CommandGenExecutor {
    private static final int FIRST_ADDRESS = 0;

//    @Override
//    public List<ModBusRtuSendMessage> buildCommandRtu(String serviceName) {
//        List<ModBusRtuSendMessage> modBusRtuSendMessages = new LinkedList<>();
//        ModBusRtuSendMessage modBusRtuSendMessage = new ModBusRtuSendMessage();
//        if (serviceName.equalsIgnoreCase("逆变器历史电量数据")) {
//            ModBusRtuHeader modBusRtuHeader = new ModBusRtuHeader();
//            modBusRtuHeader.setDeviceAddress(FIRST_ADDRESS);
//            modBusRtuHeader.setFunctionCode((short) 4);
//            ModBusRtuSendBody modBusRtuSendBody = new ModBusRtuSendBody();
//            modBusRtuSendBody.setBeginAddress((short) 4864);
//            modBusRtuSendBody.setReadNum((short) 64);
//            modBusRtuSendMessage.setModBusHeader(modBusRtuHeader);
//            modBusRtuSendMessage.setModBusPayLoad(modBusRtuSendBody);
//        }
//        modBusRtuSendMessages.add(modBusRtuSendMessage);
//        return modBusRtuSendMessages;
//    }


    @Override
    public List<PointAttributeParse> getPointAttributeParseList() {
        return null;
    }
}
