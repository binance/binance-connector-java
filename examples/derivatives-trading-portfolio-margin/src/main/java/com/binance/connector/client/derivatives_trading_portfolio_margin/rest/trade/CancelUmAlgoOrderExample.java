package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.CancelUmAlgoOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelUmAlgoOrderExample {
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
     * Cancel UM Algo Order (TRADE)
     *
     * <p>Cancel an active UM algo order Weight(IP): 1 Security Type: TRADE Notes: - Either
     * &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60; must be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelUmAlgoOrderExample() throws ApiException, IOException {
        Long algoId = 2146760L;
        String clientAlgoId = "6B2I9XVcJpCjqPAJ4YoFX7";
        Long recvWindow = 5000L;
        ApiResponse<CancelUmAlgoOrderResponse> response =
                getApi().cancelUmAlgoOrder(algoId, clientAlgoId, recvWindow);
        System.out.println(response.getData());
    }
}
