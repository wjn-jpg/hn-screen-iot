package com.ntdq.hnscreen.nbt33007.domain;

/**
 * 卡信息查询
 */
public class CardInfoQuery {

    /**
     * 点卡信息查询
     */
    private String cardNumber;

    /**
     * 卡密码
     */
    private String cardPassword;

    /**
     * 卡状态
     *  0-卡不存在；1-卡未激活；2-正常；3-黑名单；4-已挂失；5-已注销
     */
    private int cardStatus;

    /**
     * 卡内金额
     */
    private double cardBalance;


}
