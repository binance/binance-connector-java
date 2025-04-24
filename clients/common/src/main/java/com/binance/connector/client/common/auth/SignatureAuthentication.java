package com.binance.connector.client.common.auth;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.Pair;
import com.binance.connector.client.common.sign.SignatureGenerator;
import java.net.URI;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http.HttpMethod;
import org.apache.commons.lang3.StringUtils;
import org.bouncycastle.crypto.CryptoException;

public class SignatureAuthentication extends BinanceBaseAuthentication {

    private final String apiKey;
    private final SignatureGenerator generator;

    public SignatureAuthentication(String apiKey, SignatureGenerator generator) {
        this.apiKey = apiKey;
        this.generator = generator;
    }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri)
            throws ApiException {
        headerParams.put("X-MBX-APIKEY", apiKey);
        queryParams.add(new Pair("timestamp", buildTimestamp()));
        String allParametersAsString = joinQueryParameters(queryParams);
        if (HttpMethod.requiresRequestBody(method) && StringUtils.isNotEmpty(payload)) {
            allParametersAsString += payload;
        }
        try {
            queryParams.add(new Pair("signature", generator.signAsString(allParametersAsString)));
        } catch (CryptoException e) {
            throw new RuntimeException(e);
        }
    }
}
