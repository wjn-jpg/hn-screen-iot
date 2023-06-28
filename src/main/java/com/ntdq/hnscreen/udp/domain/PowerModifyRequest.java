package com.ntdq.hnscreen.udp.domain;

public class PowerModifyRequest {

    private float power;

    private int targetIp;

    private int targetPort;

    public int getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(int targetIp) {
        this.targetIp = targetIp;
    }

    public int getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(int targetPort) {
        this.targetPort = targetPort;
    }

    private int source;

    private final byte adjustType;

    private final byte[] headByteArr = new byte[]{0x68, 0x65, 0x00};

    public byte[] getHeadByteArr() {
        return headByteArr;
    }

    public PowerModifyRequest() {
        this.adjustType = 0x61;
    }

    public byte getAdjustType() {
        return adjustType;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }
}
