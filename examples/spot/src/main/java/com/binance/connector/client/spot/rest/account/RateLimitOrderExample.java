package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.RateLimitOrderResponse;
import java.io.IOException;

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
     * Query Unfilled Order Count (USER_DATA)
     *
     * <p>Displays the user&#39;s unfilled order count for all intervals. Weight(IP): 40 Security
     * Type: USER_DATA Notes: **Data Source:** Memory
     *
     * @throws ApiException if the Api call fails
     */
    public void rateLimitOrderExample() throws ApiException, IOException {
        Double recvWindow = 5000d;
        ApiResponse<RateLimitOrderResponse> response = getApi().rateLimitOrder(recvWindow);
        System.out.println(response.getData());
    }
}
