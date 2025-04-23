package com.binance.connector.client.common.websocket.dtos;

public class ErrorResponseDTO {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
