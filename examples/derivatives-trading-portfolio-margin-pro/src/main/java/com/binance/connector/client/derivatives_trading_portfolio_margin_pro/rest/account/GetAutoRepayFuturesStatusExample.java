package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetAutoRepayFuturesStatusResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetAutoRepayFuturesStatusExample {
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
     * Get Auto-repay-futures Status (USER_DATA)
     *
     * <p>Query Auto-repay-futures Status Weight(IP): 30 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getAutoRepayFuturesStatusExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetAutoRepayFuturesStatusResponse> response =
                getApi().getAutoRepayFuturesStatus(recvWindow);
        System.out.println(response.getData());
    }
}
