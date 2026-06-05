package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginInterestRateHistoryResponse;

/** API examples for BorrowRepayApi */
public class QueryMarginInterestRateHistoryExample {
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
     * Query Margin Interest Rate History (USER_DATA)
     *
     * <p>Query Margin Interest Rate History Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginInterestRateHistoryExample() throws ApiException {
        String asset = "";
        Long vipLevel = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginInterestRateHistoryResponse> response =
                getApi().queryMarginInterestRateHistory(
                                asset, vipLevel, startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
