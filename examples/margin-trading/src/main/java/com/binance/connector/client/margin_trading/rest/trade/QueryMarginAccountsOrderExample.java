package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryMarginAccountsOrderExample {
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
     * Query Margin Account&#39;s Order (USER_DATA)
     *
     * <p>Query Margin Account&#39;s Order Weight(IP): 10 Security Type: USER_DATA Notes: - Either
     * orderId or origClientOrderId must be sent. - For some historical orders cummulativeQuoteQty
     * will be &lt; 0, meaning the data is not available at this time.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOrderExample() throws ApiException, IOException {
        String symbol = "BNBBTC";
        IsIsolated isIsolated = IsIsolated.TRUE;
        Long orderId = 1L;
        String origClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOrderResponse> response =
                getApi().queryMarginAccountsOrder(
                                symbol, isIsolated, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
