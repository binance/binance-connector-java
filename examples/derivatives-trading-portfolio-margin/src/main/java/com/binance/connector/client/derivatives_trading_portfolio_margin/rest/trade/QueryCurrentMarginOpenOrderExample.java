package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentMarginOpenOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentMarginOpenOrderExample {
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
     * Query Current Margin Open Order (USER_DATA)
     *
     * <p>Query Current Margin Open Order Weight(IP): 5 Security Type: USER_DATA Notes: - If
     * &#x60;symbol&#x60; is not sent, order records for all symbols are returned. - When returning
     * all symbols, the request count charged to the rate limiter equals the number of symbols
     * currently trading on the exchange.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentMarginOpenOrderExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentMarginOpenOrderResponse> response =
                getApi().queryCurrentMarginOpenOrder(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
