package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.CurrentOpenOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CurrentOpenOrdersExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Current Open Orders (USER_DATA)
     *
     * <p>Query all unfinished (open) orders for the caller. No business parameters are needed —
     * user identity is derived from the signature. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void currentOpenOrdersExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<CurrentOpenOrdersResponse> response = getApi().currentOpenOrders(recvWindow);
        System.out.println(response.getData());
    }
}
