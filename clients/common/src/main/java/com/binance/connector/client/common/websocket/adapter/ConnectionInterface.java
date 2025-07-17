package com.binance.connector.client.common.websocket.adapter;

import com.binance.connector.client.common.websocket.dtos.ApiRequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import java.util.concurrent.BlockingQueue;

public interface ConnectionInterface {
    void connect();

    void send(ApiRequestWrapperDTO request) throws InterruptedException;

    BlockingQueue<String> sendForStream(ApiRequestWrapperDTO request) throws InterruptedException;

    void send(RequestWrapperDTO request) throws InterruptedException;

    void setUserAgent(String userAgent);

    boolean isConnected();
}
