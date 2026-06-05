package com.binance.connector.client.spot.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.GetOpenOrdersResponse;

/** API examples for AccountApi */
public class GetOpenOrdersExample {
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
     * Current open orders
     *
     * <p>Get all open orders on a symbol. **Careful** when accessing this with no symbol. Weight: 6
     * for a single symbol; **80** when the symbol parameter is omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void getOpenOrdersExample() throws ApiException {
        String symbol = "BNBUSDT";
        Double recvWindow = 5000.0d;
        ApiResponse<GetOpenOrdersResponse> response = getApi().getOpenOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
