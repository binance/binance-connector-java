package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AutoCloseType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUsersCmForceOrdersResponse;

/** API examples for TradeApi */
public class QueryUsersCmForceOrdersExample {
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
     * Query User&#39;s CM Force Orders(USER_DATA)
     *
     * <p>Query User&#39;s CM Force Orders * If \&quot;autoCloseType\&quot; is not sent, orders with
     * both of the types will be returned * If \&quot;startTime\&quot; is not sent, data within 7
     * days before \&quot;endTime\&quot; can be queried * Only support querying data in the past 90
     * days Weight: 20 with symbol, 50 without symbol
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUsersCmForceOrdersExample() throws ApiException {
        String symbol = "";
        AutoCloseType autoCloseType = AutoCloseType.LIQUIDATION;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUsersCmForceOrdersResponse> response =
                getApi().queryUsersCmForceOrders(
                                symbol, autoCloseType, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
