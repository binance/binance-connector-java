package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryEnabledIsolatedMarginAccountLimitResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryEnabledIsolatedMarginAccountLimitExample {
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
     * Query Enabled Isolated Margin Account Limit (USER_DATA)
     *
     * <p>Query enabled isolated margin account limit. Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryEnabledIsolatedMarginAccountLimitExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<QueryEnabledIsolatedMarginAccountLimitResponse> response =
                getApi().queryEnabledIsolatedMarginAccountLimit(recvWindow);
        System.out.println(response.getData());
    }
}
