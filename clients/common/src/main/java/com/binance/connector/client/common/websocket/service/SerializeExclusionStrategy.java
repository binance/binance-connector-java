package com.binance.connector.client.common.websocket.service;

import com.binance.connector.client.common.websocket.dtos.BaseRequestDTO;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import java.util.Arrays;

public class SerializeExclusionStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        boolean contains =
                Arrays.asList("apiKey", "timestamp", "signature").contains(field.getName());
        return contains && field.getDeclaringClass() != BaseRequestDTO.class;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}
