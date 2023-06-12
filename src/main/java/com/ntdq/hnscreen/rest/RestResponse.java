package com.ntdq.hnscreen.rest;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class RestResponse<T extends Serializable> implements Serializable {

    /**
     * 状态
     */
    private int code;

    /**
     * 返回信息
     */
    private T data;

    /**
     * 返回说明
     */
    private String message;

    private RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }


    private RestResponse(int code, String message, T data) {
        this.code = code;
        this.data = data;
        this.message = message;
    }


    public static <T extends Serializable> RestResponse<T> createSuccess(String message, T data) {
        return new RestResponse<T>(200, message, data);
    }

    public static <T extends Serializable> RestResponse<T> createFailed(String message, T data) {
        return new RestResponse<T>(500, message, data);
    }

    public static <T extends Serializable> RestResponse<T> createError(String message, Class<T> clazz) {
        return new RestResponse<>(500, message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        List<com.ntdq.hnscreen.rest.RealParam> realParams = new LinkedList<>();
        realParams.add(com.ntdq.hnscreen.rest.RealParam.OutputVoltage);
        com.ntdq.hnscreen.rest.RealParam outputVoltage = RealParam.OutputVoltage;
    }
}
