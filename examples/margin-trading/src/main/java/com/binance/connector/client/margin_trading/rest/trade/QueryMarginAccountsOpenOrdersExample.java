package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOpenOrdersResponse;

/** API examples for TradeApi */
public class QueryMarginAccountsOpenOrdersExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Margin Account&#39;s Open Orders (USER_DATA)
     *
     * <p>Query Margin Account&#39;s Open Orders * If the symbol is not sent, orders for all symbols
     * will be returned in an array. * When all symbols are returned, the number of requests counted
     * against the rate limiter is equal to the number of symbols currently trading on the exchange.
     * * If isIsolated &#x3D;\&quot;TRUE\&quot;, symbol must be sent. Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOpenOrdersExample() throws ApiException {
        String symbol = "";
        String isIsolated = "false";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOpenOrdersResponse> response =
                getApi().queryMarginAccountsOpenOrders(symbol, isIsolated, recvWindow);
        System.out.println(response.getData());
    }
}
