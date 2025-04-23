package com.binance.connector.client.common.websocket.service;

import com.binance.connector.client.common.JSON;
import com.google.gson.reflect.TypeToken;

public class StreamBlockingQueueWrapper<T> {
    private final StreamBlockingQueue<String> innerQueue;
    private final TypeToken<T> convertType;

    public StreamBlockingQueueWrapper(StreamBlockingQueue<String> innerQueue, TypeToken<T> type) {
        this.innerQueue = innerQueue;
        this.convertType = type;
    }

    public StreamBlockingQueue<String> getInnerQueue() {
        return innerQueue;
    }

    public T take() throws InterruptedException {
        String take = innerQueue.take();
        return JSON.getGson().fromJson(take, convertType);
    }
}
