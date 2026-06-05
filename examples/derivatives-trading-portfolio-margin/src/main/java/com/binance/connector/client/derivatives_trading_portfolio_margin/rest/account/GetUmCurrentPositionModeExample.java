package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetUmCurrentPositionModeResponse;

/** API examples for AccountApi */
public class GetUmCurrentPositionModeExample {
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
     * Get UM Current Position Mode(USER_DATA)
     *
     * <p>Get user&#39;s position mode (Hedge Mode or One-way Mode ) on EVERY symbol in UM Weight:
     * 30
     *
     * @throws ApiException if the Api call fails
     */
    public void getUmCurrentPositionModeExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetUmCurrentPositionModeResponse> response =
                getApi().getUmCurrentPositionMode(recvWindow);
        System.out.println(response.getData());
    }
}
