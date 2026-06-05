package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUserNegativeBalanceAutoExchangeRecordResponse;

/** API examples for AccountApi */
public class QueryUserNegativeBalanceAutoExchangeRecordExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query User Negative Balance Auto Exchange Record (USER_DATA)
     *
     * <p>Query user negative balance auto exchange record * Response in descending order * The max
     * interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 3 months. Weight: 100
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUserNegativeBalanceAutoExchangeRecordExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUserNegativeBalanceAutoExchangeRecordResponse> response =
                getApi().queryUserNegativeBalanceAutoExchangeRecord(startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
