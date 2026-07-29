package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.AutoRepay;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.ChangeAutoRepayFuturesStatusRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.ChangeAutoRepayFuturesStatusResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class ChangeAutoRepayFuturesStatusExample {
    private DerivativesTradingPortfolioMarginProRestApi api;

    public DerivativesTradingPortfolioMarginProRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginProRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginProRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Change Auto-repay-futures Status (TRADE)
     *
     * <p>Change Auto-repay-futures Status Weight(IP): 1500 Security Type: TRADE
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
