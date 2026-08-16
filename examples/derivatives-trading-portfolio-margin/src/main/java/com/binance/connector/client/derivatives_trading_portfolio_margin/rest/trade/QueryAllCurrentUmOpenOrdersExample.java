package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentUmOpenOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllCurrentUmOpenOrdersExample {
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
     * Query All Current UM Open Orders (USER_DATA)
     *
     * <p>Get all open orders on a symbol. Weight: - 1 for a single &#x60;symbol&#x60; - 40 when
     * &#x60;symbol&#x60; is omitted Security Type: USER_DATA Notes: - If the symbol is not sent,
     * orders for all symbols will be returned in an array.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllCurrentUmOpenOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QueryAllCurrentUmOpenOrdersResponse> response =
                getApi().queryAllCurrentUmOpenOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
