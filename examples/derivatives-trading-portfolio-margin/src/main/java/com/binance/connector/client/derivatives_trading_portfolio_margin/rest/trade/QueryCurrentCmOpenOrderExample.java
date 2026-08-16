package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentCmOpenOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentCmOpenOrderExample {
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
     * Query Current CM Open Order (USER_DATA)
     *
     * <p>Query current CM open order Weight(IP): 1 Security Type: USER_DATA Notes: - Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - If the queried order has
     * been filled or cancelled, the error message \&quot;Order does not exist\&quot; will be
     * returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentCmOpenOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1917641L;
        String origClientOrderId = "abc";
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentCmOpenOrderResponse> response =
                getApi().queryCurrentCmOpenOrder(symbol, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
