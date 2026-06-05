package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllMarginAccountOrdersResponse;

/** API examples for TradeApi */
public class QueryAllMarginAccountOrdersExample {
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
     * Query All Margin Account Orders (USER_DATA)
     *
     * <p>Query All Margin Account Orders Weight: 100
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllMarginAccountOrdersExample() throws ApiException {
        String symbol = "";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllMarginAccountOrdersResponse> response =
                getApi().queryAllMarginAccountOrders(
                                symbol, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
