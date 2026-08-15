package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossMarginFeeDataResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryCrossMarginFeeDataExample {
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
     * Query Cross Margin Fee Data (USER_DATA)
     *
     * <p>Get cross margin fee data collection with any vip level or user&#39;s current specific
     * data as https://www.binance.com/en/margin-fee Weight: 1 when coin is specified;(IP) 5 when
     * the coin parameter is omitted(IP) Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCrossMarginFeeDataExample() throws ApiException, IOException {
        Long vipLevel = 1L;
        String coin = "BTC";
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossMarginFeeDataResponse> response =
                getApi().queryCrossMarginFeeData(vipLevel, coin, recvWindow);
        System.out.println(response.getData());
    }
}
