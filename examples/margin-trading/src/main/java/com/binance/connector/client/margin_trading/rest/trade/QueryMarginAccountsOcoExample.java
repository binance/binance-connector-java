package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOcoResponse;

/** API examples for TradeApi */
public class QueryMarginAccountsOcoExample {
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
     * Query Margin Account&#39;s OCO (USER_DATA)
     *
     * <p>Retrieves a specific OCO based on provided optional parameters Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOcoExample() throws ApiException {
        String isIsolated = "false";
        String symbol = "";
        Long orderListId = 1L;
        String origClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOcoResponse> response =
                getApi().queryMarginAccountsOco(
                                isIsolated, symbol, orderListId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
