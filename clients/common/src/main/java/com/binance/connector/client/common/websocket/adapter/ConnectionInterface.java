package com.binance.connector.client.common.websocket.adapter;

import com.binance.connector.client.common.websocket.dtos.ApiRequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;

public interface ConnectionInterface {
    void connect();

    void send(ApiRequestWrapperDTO request) throws InterruptedException;

    void send(RequestWrapperDTO request) throws InterruptedException;

    void setUserAgent(String userAgent);

    boolean isConnected();
}
