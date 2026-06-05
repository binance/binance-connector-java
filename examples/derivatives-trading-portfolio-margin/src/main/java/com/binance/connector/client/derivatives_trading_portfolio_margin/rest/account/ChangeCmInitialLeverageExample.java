package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmInitialLeverageRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeCmInitialLeverageResponse;

/** API examples for AccountApi */
public class ChangeCmInitialLeverageExample {
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
     * Change CM Initial Leverage (TRADE)
     *
     * <p>Change user&#39;s initial leverage of specific symbol in CM. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changeCmInitialLeverageExample() throws ApiException {
        ChangeCmInitialLeverageRequest changeCmInitialLeverageRequest =
                new ChangeCmInitialLeverageRequest();
        changeCmInitialLeverageRequest.symbol("");
        changeCmInitialLeverageRequest.leverage(0L);
        ApiResponse<ChangeCmInitialLeverageResponse> response =
                getApi().changeCmInitialLeverage(changeCmInitialLeverageRequest);
        System.out.println(response.getData());
    }
}
