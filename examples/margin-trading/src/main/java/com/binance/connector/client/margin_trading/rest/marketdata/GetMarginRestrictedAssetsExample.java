package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetMarginRestrictedAssetsResponse;
import java.io.IOException;

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
     * <p>Get the list of margin-restricted assets. Weight(IP): 1 Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarginRestrictedAssetsExample() throws ApiException, IOException {
        ApiResponse<GetMarginRestrictedAssetsResponse> response =
                getApi().getMarginRestrictedAssets();
        System.out.println(response.getData());
    }
}
