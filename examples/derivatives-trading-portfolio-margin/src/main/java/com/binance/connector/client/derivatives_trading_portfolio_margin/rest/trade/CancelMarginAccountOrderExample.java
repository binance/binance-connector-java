package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelMarginAccountOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelMarginAccountOrderExample {
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
     * Cancel Margin Account Order (TRADE)
     *
     * <p>Cancel Margin Account Order Weight(IP): 2 Security Type: TRADE Notes: - Either
     * &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelMarginAccountOrderExample() throws ApiException, IOException {
        String symbol = "LTCBTC";
        Long orderId = 1L;
        String origClientOrderId = "1";
        String newClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<CancelMarginAccountOrderResponse> response =
                getApi().cancelMarginAccountOrder(
                                symbol, orderId, origClientOrderId, newClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
