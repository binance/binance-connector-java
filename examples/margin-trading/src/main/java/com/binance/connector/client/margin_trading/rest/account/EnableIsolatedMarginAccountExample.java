package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountRequest;
import com.binance.connector.client.margin_trading.rest.model.EnableIsolatedMarginAccountResponse;

/** API examples for AccountApi */
public class EnableIsolatedMarginAccountExample {
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
     * Enable Isolated Margin Account (TRADE)
     *
     * <p>Enable isolated margin account for a specific symbol(Only supports activation of
     * previously disabled accounts). Weight: 300(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void enableIsolatedMarginAccountExample() throws ApiException {
        EnableIsolatedMarginAccountRequest enableIsolatedMarginAccountRequest =
                new EnableIsolatedMarginAccountRequest();
        enableIsolatedMarginAccountRequest.symbol("");
        ApiResponse<EnableIsolatedMarginAccountResponse> response =
                getApi().enableIsolatedMarginAccount(enableIsolatedMarginAccountRequest);
        System.out.println(response.getData());
    }
}
