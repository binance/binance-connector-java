package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.CancelAllEquityOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelAllEquityOrdersExample {
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
     * Cancel All Equity Orders (TRADE)
     *
     * <p>Cancel all open orders for the caller. No request body is required — the scope is all of
     * the caller&#39;s open orders. The downstream service handles idempotency; to inspect
     * per-order outcomes, query &#x60;/order/history&#x60; after the call. Weight: 1 Security Type:
     * TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllEquityOrdersExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<CancelAllEquityOrdersResponse> response =
                getApi().cancelAllEquityOrders(recvWindow);
        System.out.println(response.getData());
    }
}
