package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelAllUmAlgoOpenOrdersResponse;

/** API examples for TradeApi */
public class CancelAllUmAlgoOpenOrdersExample {
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
     * Cancel All UM Algo Open Orders (TRADE)
     *
     * <p>Cancel All UM Algo Open Orders Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllUmAlgoOpenOrdersExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<CancelAllUmAlgoOpenOrdersResponse> response =
                getApi().cancelAllUmAlgoOpenOrders(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
