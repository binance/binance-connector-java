package com.binance.connector.client.common.websocket.service;

import com.binance.connector.client.common.websocket.dtos.BaseRequestDTO;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class DeserializeExclusionStrategy implements ExclusionStrategy {
    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        return field.getDeclaringClass() == BaseRequestDTO.class;
    }

    @Override
    public boolean shouldSkipClass(Class<?> aClass) {
        return false;
    }
}
