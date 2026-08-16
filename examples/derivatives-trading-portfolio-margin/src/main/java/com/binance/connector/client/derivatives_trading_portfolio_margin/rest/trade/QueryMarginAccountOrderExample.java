package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryMarginAccountOrderExample {
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
     * Query Margin Account Order (USER_DATA)
     *
     * <p>Query Margin Account Order Weight(IP): 10 Security Type: USER_DATA Notes: - Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical
     * orders, &#x60;cummulativeQuoteQty &lt; 0&#x60; means the data is unavailable at this time.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1L;
        String origClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountOrderResponse> response =
                getApi().queryMarginAccountOrder(symbol, orderId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
