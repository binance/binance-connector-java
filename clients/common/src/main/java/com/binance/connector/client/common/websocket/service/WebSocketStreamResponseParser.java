package com.binance.connector.client.common.websocket.service;

import com.google.gson.Gson;
import java.lang.reflect.Type;

public class WebSocketStreamResponseParser<T> {
    private final Gson gson = new Gson();

    public T parse(String input, Type type) {
        return gson.fromJson(input, type);
    }
}
