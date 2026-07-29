package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllUmOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllUmOrdersExample {
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
     * Query All UM Orders (USER_DATA)
     *
     * <p>Get all account UM orders; active, canceled, or filled. Weight(IP): 5 Security Type:
     * USER_DATA Notes: - If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId.
     * Otherwise most recent orders are returned. - The query time period must be less then 7 days(
     * default as the recent 7 days).
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllUmOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllUmOrdersResponse> response =
                getApi().queryAllUmOrders(symbol, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
