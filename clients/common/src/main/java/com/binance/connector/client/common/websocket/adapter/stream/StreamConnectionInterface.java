package com.binance.connector.client.common.websocket.adapter.stream;

import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import java.util.Map;
import java.util.Set;

public interface StreamConnectionInterface {
    Map<String, StreamBlockingQueue<String>> subscribe(
            RequestWrapperDTO<Set<String>, Object> requestWrapperDTO);

    void unsubscribe(StreamBlockingQueueWrapper queue);

    void unsubscribe(StreamBlockingQueue blockingQueueWrapper);

    void connect();

    boolean isConnected();

    void setUserAgent(String userAgent);
}
