package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllCmOpenConditionalOrdersResponse;

/** API examples for TradeApi */
public class CancelAllCmOpenConditionalOrdersExample {
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
     * Cancel All CM Open Conditional Orders(TRADE)
     *
     * <p>Cancel All CM Open Conditional Orders Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllCmOpenConditionalOrdersExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllCmOpenConditionalOrdersResponse> response =
                getApi().cancelAllCmOpenConditionalOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
