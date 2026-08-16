package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCmOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllCmOrdersExample {
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
     * Query All CM Orders (USER_DATA)
     *
     * <p>Get all account CM orders; active, canceled, or filled. Weight: - 20 with
     * &#x60;symbol&#x60; - 40 with &#x60;pair&#x60; Security Type: USER_DATA Notes: - Either
     * &#x60;symbol&#x60; or &#x60;pair&#x60; must be sent. - If &#x60;orderId&#x60; is set, it will
     * get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. - These orders
     * will not be found: - order status is &#x60;CANCELED&#x60; or &#x60;EXPIRED&#x60;, **AND** -
     * order has NO filled trade, **AND** - created time + 3 days &lt; current time
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllCmOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        String pair = "BTCUSD";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryAllCmOrdersResponse> response =
                getApi().queryAllCmOrders(
                                symbol, pair, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
