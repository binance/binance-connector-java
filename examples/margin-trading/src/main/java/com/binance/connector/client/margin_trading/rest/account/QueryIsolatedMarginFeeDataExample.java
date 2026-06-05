package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryIsolatedMarginFeeDataResponse;

/** API examples for AccountApi */
public class QueryIsolatedMarginFeeDataExample {
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
     * Query Isolated Margin Fee Data (USER_DATA)
     *
     * <p>Get isolated margin fee data collection with any vip level or user&#39;s current specific
     * data as https://www.binance.com/en/margin-fee Weight: 1 when a single is specified;(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryIsolatedMarginFeeDataExample() throws ApiException {
        Long vipLevel = 1L;
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryIsolatedMarginFeeDataResponse> response =
                getApi().queryIsolatedMarginFeeData(vipLevel, symbol, recvWindow);
        System.out.println(response.getData());
    }
}
