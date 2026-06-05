package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.RateLimitOrderResponse;

/** API examples for AccountApi */
public class RateLimitOrderExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Unfilled Order Count
     *
     * <p>Displays the user&#39;s unfilled order count for all intervals. Weight: 40
     *
     * @throws ApiException if the Api call fails
     */
    public void rateLimitOrderExample() throws ApiException {
        Double recvWindow = 5000.0d;
        ApiResponse<RateLimitOrderResponse> response = getApi().rateLimitOrder(recvWindow);
        System.out.println(response.getData());
    }
}
