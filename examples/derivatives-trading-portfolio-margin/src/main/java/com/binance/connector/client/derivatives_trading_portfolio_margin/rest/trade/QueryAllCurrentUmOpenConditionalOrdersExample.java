package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentUmOpenConditionalOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllCurrentUmOpenConditionalOrdersExample {
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
     * Query All Current UM Open Conditional Orders (USER_DATA)
     *
     * <p>Get all open conditional orders on a symbol. Weight: - 1 for a single &#x60;symbol&#x60; -
     * 40 when &#x60;symbol&#x60; is omitted Security Type: USER_DATA Notes: - If &#x60;symbol&#x60;
     * is not provided, conditional open orders for all symbols are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllCurrentUmOpenConditionalOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QueryAllCurrentUmOpenConditionalOrdersResponse> response =
                getApi().queryAllCurrentUmOpenConditionalOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
