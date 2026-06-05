package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmInitialLeverageResponse;

/** API examples for AccountApi */
public class ChangeUmInitialLeverageExample {
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
     * Change UM Initial Leverage(TRADE)
     *
     * <p>Change user&#39;s initial leverage of specific symbol in UM. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changeUmInitialLeverageExample() throws ApiException {
        ChangeUmInitialLeverageRequest changeUmInitialLeverageRequest =
                new ChangeUmInitialLeverageRequest();
        changeUmInitialLeverageRequest.symbol("");
        changeUmInitialLeverageRequest.leverage(0L);
        ApiResponse<ChangeUmInitialLeverageResponse> response =
                getApi().changeUmInitialLeverage(changeUmInitialLeverageRequest);
        System.out.println(response.getData());
    }
}
