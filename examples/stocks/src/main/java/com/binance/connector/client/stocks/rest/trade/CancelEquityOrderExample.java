package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.CancelEquityOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelEquityOrderExample {
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
     * Cancel Equity Order (TRADE)
     *
     * <p>Cancel a single open order by its &#x60;orderId&#x60;. Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelEquityOrderExample() throws ApiException, IOException {
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        Long recvWindow = 5000L;
        ApiResponse<CancelEquityOrderResponse> response =
                getApi().cancelEquityOrder(orderId, recvWindow);
        System.out.println(response.getData());
    }
}
