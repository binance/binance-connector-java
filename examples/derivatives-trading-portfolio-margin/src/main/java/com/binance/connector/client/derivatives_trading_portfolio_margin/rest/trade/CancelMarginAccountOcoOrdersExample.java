package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelMarginAccountOcoOrdersResponse;

/** API examples for TradeApi */
public class CancelMarginAccountOcoOrdersExample {
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
     * Cancel Margin Account OCO Orders(TRADE)
     *
     * <p>Cancel Margin Account OCO Orders * Additional notes: Canceling an individual leg will
     * cancel the entire OCO Weight: 2
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelMarginAccountOcoOrdersExample() throws ApiException {
        String symbol = "";
        Long orderListId = 1L;
        String listClientOrderId = "1";
        String newClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<CancelMarginAccountOcoOrdersResponse> response =
                getApi().cancelMarginAccountOcoOrders(
                                symbol,
                                orderListId,
                                listClientOrderId,
                                newClientOrderId,
                                recvWindow);
        System.out.println(response.getData());
    }
}
