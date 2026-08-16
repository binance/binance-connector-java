package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderAmendmentsResponse;
import java.io.IOException;

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
     * Query Order Amendments (USER_DATA)
     *
     * <p>Queries all amendments of a single order. Weight(IP): 4 Security Type: USER_DATA Notes:
     * **Data Source:** Database
     *
     * @throws ApiException if the Api call fails
     */
    public void orderAmendmentsExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 9L;
        Long fromExecutionId = 22L;
        Long limit = 1L;
        Double recvWindow = 5000d;
        ApiResponse<OrderAmendmentsResponse> response =
                getApi().orderAmendments(symbol, orderId, fromExecutionId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
