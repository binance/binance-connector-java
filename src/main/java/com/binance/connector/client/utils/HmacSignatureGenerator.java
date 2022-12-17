package com.binance.connector.client.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;

public final class HmacSignatureGenerator implements SignatureGenerator {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private String apiSecret;

    public HmacSignatureGenerator(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getSignature(String data) {
        byte[] hmacSha256;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(apiSecret.getBytes(), HMAC_SHA256);
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(secretKeySpec);
            hmacSha256 = mac.doFinal(data.getBytes());
        } catch (Exception e) {
            throw new RuntimeException("Failed to calculate hmac-sha256", e);
        }
        return Hex.encodeHexString(hmacSha256);
    }
}
