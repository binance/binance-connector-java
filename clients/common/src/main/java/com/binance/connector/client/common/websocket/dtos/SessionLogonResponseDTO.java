package com.binance.connector.client.common.websocket.dtos;

public class SessionLogonResponseDTO {
    private String apiKey;
    private Long authorizedSince;
    private Long connectedSince;
    private Boolean returnRateLimits;
    private Long serverTime;
    private Boolean userDataStream;
}
