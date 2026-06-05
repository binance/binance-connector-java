package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderAmendmentsResponse;

/** API examples for AccountApi */
public class OrderAmendmentsExample {
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
     * Query Order Amendments
     *
     * <p>Queries all amendments of a single order. Weight: 4
     *
     * @throws ApiException if the Api call fails
     */
    public void orderAmendmentsExample() throws ApiException {
        String symbol = "BNBUSDT";
        Long orderId = 1L;
        Long fromExecutionId = 1L;
        Long limit = 500L;
        Double recvWindow = 5000.0d;
        ApiResponse<OrderAmendmentsResponse> response =
                getApi().orderAmendments(symbol, orderId, fromExecutionId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
