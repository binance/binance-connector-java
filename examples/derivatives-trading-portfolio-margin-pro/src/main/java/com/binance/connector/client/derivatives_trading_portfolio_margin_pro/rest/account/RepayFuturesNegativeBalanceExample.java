package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.RepayFuturesNegativeBalanceResponse;

/** API examples for AccountApi */
public class RepayFuturesNegativeBalanceExample {
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
     * Repay futures Negative Balance(USER_DATA)
     *
     * <p>Repay futures Negative Balance Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void repayFuturesNegativeBalanceExample() throws ApiException {
        RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest =
                new RepayFuturesNegativeBalanceRequest();
        ApiResponse<RepayFuturesNegativeBalanceResponse> response =
                getApi().repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
        System.out.println(response.getData());
    }
}
