package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginPriceindexResponse;

/** API examples for MarketDataApi */
public class QueryMarginPriceindexExample {
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
     * Query Margin PriceIndex (MARKET_DATA)
     *
     * <p>Query Margin PriceIndex Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginPriceindexExample() throws ApiException {
        String symbol = "";
        ApiResponse<QueryMarginPriceindexResponse> response =
                getApi().queryMarginPriceindex(symbol);
        System.out.println(response.getData());
    }
}
