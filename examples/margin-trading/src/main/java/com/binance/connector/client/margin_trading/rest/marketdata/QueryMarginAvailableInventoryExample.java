package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAvailableInventoryResponse;

/** API examples for MarketDataApi */
public class QueryMarginAvailableInventoryExample {
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
     * Query Margin Available Inventory(USER_DATA)
     *
     * <p>Margin available Inventory query Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAvailableInventoryExample() throws ApiException {
        String type = "";
        ApiResponse<QueryMarginAvailableInventoryResponse> response =
                getApi().queryMarginAvailableInventory(type);
        System.out.println(response.getData());
    }
}
