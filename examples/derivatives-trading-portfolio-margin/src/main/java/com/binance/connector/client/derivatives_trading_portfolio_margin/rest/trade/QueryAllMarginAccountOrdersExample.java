package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllMarginAccountOrdersResponse;
import java.io.IOException;

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
     * <p>Query All Margin Account Orders Weight(IP): 100 Security Type: USER_DATA Notes: - If
     * &#x60;orderId&#x60; is set, returns orders with id &gt;&#x3D; &#x60;orderId&#x60;; otherwise
     * returns recent order history. - For some historical orders, &#x60;cummulativeQuoteQty &lt;
     * 0&#x60; means the data is unavailable at this time.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllMarginAccountOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllMarginAccountOrdersResponse> response =
                getApi().queryAllMarginAccountOrders(
                                symbol, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
