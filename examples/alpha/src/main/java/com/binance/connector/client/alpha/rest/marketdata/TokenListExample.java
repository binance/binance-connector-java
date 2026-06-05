package com.binance.connector.client.alpha.rest.marketdata;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.api.AlphaRestApi;
import com.binance.connector.client.alpha.rest.model.TokenListResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for MarketDataApi */
public class TokenListExample {
    private AlphaRestApi api;

    public AlphaRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlphaRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlphaRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Token List
     *
     * <p>Retrieves a list of all available ALPHA tokens, including their IDs and symbols. Use this
     * to find the token ID for constructing symbols in other endpoints. Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void tokenListExample() throws ApiException {
        ApiResponse<TokenListResponse> response = getApi().tokenList();
        System.out.println(response.getData());
    }
}
