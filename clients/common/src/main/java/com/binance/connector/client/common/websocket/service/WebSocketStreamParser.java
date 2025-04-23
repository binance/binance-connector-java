package com.binance.connector.client.common.websocket.service;

public interface WebSocketStreamParser<T> {
    T parse(String input, Class<T> clazz);
}
