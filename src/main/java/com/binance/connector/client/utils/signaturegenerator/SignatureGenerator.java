package com.binance.connector.client.utils.signaturegenerator;

public interface SignatureGenerator {
    String getSignature(String payload);
}
