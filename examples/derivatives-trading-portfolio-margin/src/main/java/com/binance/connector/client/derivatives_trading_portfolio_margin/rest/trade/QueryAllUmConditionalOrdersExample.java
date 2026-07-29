package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllUmConditionalOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllUmConditionalOrdersExample {
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
     * Query All UM Conditional Orders (USER_DATA)
     *
     * <p>Query All UM Conditional Orders Weight: - 1 for a single &#x60;symbol&#x60; - 40 when
     * &#x60;symbol&#x60; is omitted Security Type: USER_DATA Notes: - These orders will not be
     * found: - order strategyStatus is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** - order
     * has NO filled trade, **AND** - created time + 7 days * The query time period must be less
     * than 7 days( default as the recent 7 days).
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllUmConditionalOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long strategyId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllUmConditionalOrdersResponse> response =
                getApi().queryAllUmConditionalOrders(
                                symbol, strategyId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
