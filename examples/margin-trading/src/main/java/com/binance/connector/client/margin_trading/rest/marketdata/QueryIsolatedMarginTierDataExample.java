package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginTierDataResponse;

/** API examples for MarketDataApi */
public class QueryIsolatedMarginTierDataExample {
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
     * Query Isolated Margin Tier Data (USER_DATA)
     *
     * <p>Get isolated margin tier data collection with any tier as
     * https://www.binance.com/en/margin-data Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryIsolatedMarginTierDataExample() throws ApiException {
        String symbol = "";
        Long tier = 0L;
        Long recvWindow = 5000L;
        ApiResponse<QueryIsolatedMarginTierDataResponse> response =
                getApi().queryIsolatedMarginTierData(symbol, tier, recvWindow);
        System.out.println(response.getData());
    }
}
