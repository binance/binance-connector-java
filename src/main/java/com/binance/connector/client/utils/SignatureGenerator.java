package com.binance.connector.client.utils;

public interface SignatureGenerator {
    String getSignature(String payload);
}
