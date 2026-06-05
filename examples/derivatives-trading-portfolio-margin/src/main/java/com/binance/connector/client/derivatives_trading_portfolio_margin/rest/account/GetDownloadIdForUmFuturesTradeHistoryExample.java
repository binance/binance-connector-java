package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetDownloadIdForUmFuturesTradeHistoryResponse;

/** API examples for AccountApi */
public class GetDownloadIdForUmFuturesTradeHistoryExample {
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
     * Get Download Id For UM Futures Trade History (USER_DATA)
     *
     * <p>Get download id for UM futures trade history * Request Limitation is 5 times per month,
     * shared by front end download page and rest api * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; can not be longer than 1 year Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void getDownloadIdForUmFuturesTradeHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetDownloadIdForUmFuturesTradeHistoryResponse> response =
                getApi().getDownloadIdForUmFuturesTradeHistory(startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
