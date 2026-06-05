package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginAccountInfoResponse;

/** API examples for AccountApi */
public class QueryIsolatedMarginAccountInfoExample {
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
     * Query Isolated Margin Account Info (USER_DATA)
     *
     * <p>Query Isolated Margin Account Info * If \&quot;symbols\&quot; is not sent, all isolated
     * assets will be returned. * If \&quot;symbols\&quot; is sent, only the isolated assets of the
     * sent symbols will be returned. Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryIsolatedMarginAccountInfoExample() throws ApiException {
        String symbols = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryIsolatedMarginAccountInfoResponse> response =
                getApi().queryIsolatedMarginAccountInfo(symbols, recvWindow);
        System.out.println(response.getData());
    }
}
