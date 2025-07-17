package com.binance.connector.client.common.websocket.dtos;

import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import java.util.concurrent.CompletableFuture;

public class StreamResponse<T, U> {
    private final CompletableFuture<T> response;
    private final StreamBlockingQueueWrapper<U> stream;

    public StreamResponse(CompletableFuture<T> response, StreamBlockingQueueWrapper<U> stream) {
        this.response = response;
        this.stream = stream;
    }

    public CompletableFuture<T> getResponse() {
        return response;
    }

    public StreamBlockingQueueWrapper<U> getStream() {
        return stream;
    }
}
