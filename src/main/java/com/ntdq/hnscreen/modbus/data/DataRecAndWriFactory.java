package com.ntdq.hnscreen.modbus.data;

import com.ntdq.hnscreen.modbus.constant.ModBusFunctionCode;
import com.ntdq.hnscreen.modbus.data.res.ReadCoilsResMessageFactory;
import com.ntdq.hnscreen.modbus.data.res.ReadHoldingRegistersFactory;
import com.ntdq.hnscreen.modbus.data.res.ReadInputRegistersFactory;

public class DataRecAndWriFactory {

    public static com.ntdq.hnscreen.modbus.data.RecAndWriMessage getMessageFactory(int functionCode) {
        RecAndWriMessage recAndWriMessage = null;
        switch (functionCode) {
            case ModBusFunctionCode.ReadCoils:
                recAndWriMessage = new ReadCoilsResMessageFactory();
                break;
//            case ModBusFunctionCode.ReadHoldingRegisters:
//                recAndWriMessage = new ReadHoldingRegistersFactory();
//                break;
            case ModBusFunctionCode.ReadHoldingRegisters:
            case ModBusFunctionCode.ReadInputRegisters:
            case ModBusFunctionCode.ReadDiscreteInputs:
                recAndWriMessage = new ReadInputRegistersFactory();
                break;
        }
        return recAndWriMessage;
    }


}
