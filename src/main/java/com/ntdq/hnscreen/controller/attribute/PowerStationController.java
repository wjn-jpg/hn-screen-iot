//package com.ntdq.hnscreen.controller.attribute;
//
//import java.net.DatagramSocket;
//import java.net.InetAddress;
//import java.net.InetSocketAddress;
//
///**
// * 充电桩
// */
//public class PowerStationController {
//            if (!host.startsWith(netUrlPrefix)) {
//        return RestResponse.createFailed("传入的地址有误!", null);
//    }
//    String[] remoteAddressArr = host.split("\\.");
//    String lastAddr = remoteAddressArr[remoteAddressArr.length - 1];
//    String lastAddrHex = Integer.toHexString(Integer.parseInt(lastAddr));
//    byte[] AddrByteArrRemote = CommonByteUtils.hexStringToByteArray(lastAddrHex);
//
//    String localAddress = InetAddress.getLocalHost().getHostAddress();
//    String[] localAddressArr = localAddress.split("\\.");
//    String lastAddrLocal = remoteAddressArr[localAddressArr.length - 1];
//    String LastLocalAddrHex = Integer.toHexString(Integer.parseInt(lastAddrLocal));
//    byte[] AddrByteArrLocal = CommonByteUtils.hexStringToByteArray(LastLocalAddrHex);
//    String format = String.format("%04x", (int)(powerStation*10+1000));
//    //修改！
//        PowerStationReport.storeAddrPower(lastAddr,powerStation);
//
//        while (!isModifySuccess.get()) {
//
//        byte[] data = new byte[8];
//        data[0] = 0x68;
//        data[1] = 0x05;
//        data[2] = 0x00;
//        data[3] = AddrByteArrRemote.length == 1 ? AddrByteArrRemote[0] : 0x00;
//        data[4] = AddrByteArrLocal.length == 1 ? AddrByteArrLocal[0] : 0x00;
//        data[5] = powerAdjustType;
//        data[6] = hexStringToBytes(format.substring(2, 4))[0];
//        data[7] = hexStringToBytes(format.substring(0, 2))[0];
//
//        DatagramSocket so = new DatagramSocket(8089);
//        java.net.DatagramPacket datagramPacket = new java.net.DatagramPacket(data, data.length, new InetSocketAddress(host, port));
//        so.send(datagramPacket);
//        so.close();
//        Thread.sleep(500);
//        isModifySuccess.set(true);
//    }
//        if (isModifySuccess.get()) {
//        //重新复位false 以方便下一次修改
//        isModifySuccess.set(false);
//        return RestResponse.createSuccess("修改功率成功", null);
//    }
//        return RestResponse.createSuccess("修改功率失败", null);
//}
