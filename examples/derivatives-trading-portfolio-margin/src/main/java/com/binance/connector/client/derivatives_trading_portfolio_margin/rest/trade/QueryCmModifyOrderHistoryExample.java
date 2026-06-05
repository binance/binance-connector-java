package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmModifyOrderHistoryResponse;

/** API examples for TradeApi */
public class QueryCmModifyOrderHistoryExample {
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
     * Query CM Modify Order History(TRADE)
     *
     * <p>Get order modification history * Either &#x60;orderId&#x60; or
     * &#x60;origClientOrderId&#x60; must be sent, and the &#x60;orderId&#x60; will prevail if both
     * are sent. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCmModifyOrderHistoryExample() throws ApiException {
        String symbol = "";
        Long orderId = 1L;
        String origClientOrderId = "1";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryCmModifyOrderHistoryResponse> response =
                getApi().queryCmModifyOrderHistory(
                                symbol,
                                orderId,
                                origClientOrderId,
                                startTime,
                                endTime,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
