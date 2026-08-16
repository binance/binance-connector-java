package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryAllCurrentCmOpenOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryAllCurrentCmOpenOrdersExample {
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
     * Query All Current CM Open Orders (USER_DATA)
     *
     * <p>Get all open orders on a symbol. * If the symbol is not sent, orders for all symbols will
     * be returned in an array. Weight: - 1 for a single &#x60;symbol&#x60; - 40 when
     * &#x60;symbol&#x60; is omitted Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryAllCurrentCmOpenOrdersExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        String pair = "BTCUSD";
        Long recvWindow = 5000L;
        ApiResponse<QueryAllCurrentCmOpenOrdersResponse> response =
                getApi().queryAllCurrentCmOpenOrders(symbol, pair, recvWindow);
        System.out.println(response.getData());
    }
}
