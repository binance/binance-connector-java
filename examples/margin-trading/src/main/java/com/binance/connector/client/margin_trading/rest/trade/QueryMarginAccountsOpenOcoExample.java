package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOpenOcoResponse;

/** API examples for TradeApi */
public class QueryMarginAccountsOpenOcoExample {
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
     * Query Margin Account&#39;s Open OCO (USER_DATA)
     *
     * <p>Query Margin Account&#39;s Open OCO Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOpenOcoExample() throws ApiException {
        String isIsolated = "false";
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOpenOcoResponse> response =
                getApi().queryMarginAccountsOpenOco(isIsolated, symbol, recvWindow);
        System.out.println(response.getData());
    }
}
