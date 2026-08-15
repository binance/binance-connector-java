package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.AutoRepay;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeAutoRepayFuturesStatusRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.ChangeAutoRepayFuturesStatusResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class ChangeAutoRepayFuturesStatusExample {
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
     * Change Auto-repay-futures Status (TRADE)
     *
     * <p>Change Auto-repay-futures Status Weight(IP): 750 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void changeAutoRepayFuturesStatusExample() throws ApiException, IOException {
        ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest =
                new ChangeAutoRepayFuturesStatusRequest();
        changeAutoRepayFuturesStatusRequest.autoRepay(AutoRepay.TRUE);
        ApiResponse<ChangeAutoRepayFuturesStatusResponse> response =
                getApi().changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
        System.out.println(response.getData());
    }
}
