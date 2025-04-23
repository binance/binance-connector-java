package com.binance.connector.client.common.auth;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.SignatureGenerator;

public class BinanceAuthenticationFactory {
    public Authentication getAuthentication(SignatureConfiguration configuration) {
        SignatureGeneratorFactory signatureGeneratorFactory = new SignatureGeneratorFactory();
        SignatureGenerator signatureGenerator =
                signatureGeneratorFactory.getSignatureGenerator(configuration);
        if (signatureGenerator != null) {
            return new SignatureAuthentication(configuration.getApiKey(), signatureGenerator);
        }
        return null;
    }
}
