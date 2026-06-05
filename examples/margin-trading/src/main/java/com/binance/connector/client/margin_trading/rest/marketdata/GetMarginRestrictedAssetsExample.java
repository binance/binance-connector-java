package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetMarginRestrictedAssetsResponse;

/** API examples for MarketDataApi */
public class GetMarginRestrictedAssetsExample {
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
     * Get Margin Restricted Assets (MARKET_DATA)
     *
     * <p>Get Margin Restricted Assets Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarginRestrictedAssetsExample() throws ApiException {
        ApiResponse<GetMarginRestrictedAssetsResponse> response =
                getApi().getMarginRestrictedAssets();
        System.out.println(response.getData());
    }
}
