package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.RepayFuturesNegativeBalanceRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.RepayFuturesNegativeBalanceResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class RepayFuturesNegativeBalanceExample {
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
     * Repay futures Negative Balance (USER_DATA)
     *
     * <p>Repay futures Negative Balance Weight(IP): 750 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void repayFuturesNegativeBalanceExample() throws ApiException, IOException {
        RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest =
                new RepayFuturesNegativeBalanceRequest();
        ApiResponse<RepayFuturesNegativeBalanceResponse> response =
                getApi().repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
        System.out.println(response.getData());
    }
}
