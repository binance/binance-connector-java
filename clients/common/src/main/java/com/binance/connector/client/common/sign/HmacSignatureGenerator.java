package com.binance.connector.client.common.sign;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.crypto.CryptoException;

public class HmacSignatureGenerator implements SignatureGenerator {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private final String apiSecret;

    public HmacSignatureGenerator(String apiSecret) {
        //        ParameterChecker.checkParameterType(apiSecret, String.class, "apiSecret");
        this.apiSecret = apiSecret;
    }

    @Override
    public byte[] sign(String input) throws CryptoException {
        return sign(input.getBytes());
    }

    @Override
    public byte[] sign(byte[] input) throws CryptoException {
        byte[] hmacSha256;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(apiSecret.getBytes(), HMAC_SHA256);
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(secretKeySpec);
            hmacSha256 = mac.doFinal(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to calculate hmac-sha256", e);
        }
        return hmacSha256;
    }

    @Override
    public String signAsString(String input) throws CryptoException {
        return signAsString(input.getBytes());
    }

    @Override
    public String signAsString(byte[] input) throws CryptoException {
        return Hex.encodeHexString(sign(input));
    }
}
