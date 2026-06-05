package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmPositionModeRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeUmPositionModeResponse;

/** API examples for AccountApi */
public class ChangeUmPositionModeExample {
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
     * Change UM Position Mode(TRADE)
     *
     * <p>Change user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in UM
     * Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void changeUmPositionModeExample() throws ApiException {
        ChangeUmPositionModeRequest changeUmPositionModeRequest = new ChangeUmPositionModeRequest();
        changeUmPositionModeRequest.dualSidePosition("");
        ApiResponse<ChangeUmPositionModeResponse> response =
                getApi().changeUmPositionMode(changeUmPositionModeRequest);
        System.out.println(response.getData());
    }
}
