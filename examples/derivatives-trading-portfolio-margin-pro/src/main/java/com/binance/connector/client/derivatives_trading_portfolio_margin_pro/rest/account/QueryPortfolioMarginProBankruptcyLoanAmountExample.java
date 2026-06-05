package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanAmountResponse;

/** API examples for AccountApi */
public class QueryPortfolioMarginProBankruptcyLoanAmountExample {
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
     * Query Portfolio Margin Pro Bankruptcy Loan Amount(USER_DATA)
     *
     * <p>Query Portfolio Margin Pro Bankruptcy Loan Amount * If there’s no classic portfolio margin
     * bankruptcy loan, the amount would be 0 Weight: 500
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPortfolioMarginProBankruptcyLoanAmountExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<QueryPortfolioMarginProBankruptcyLoanAmountResponse> response =
                getApi().queryPortfolioMarginProBankruptcyLoanAmount(recvWindow);
        System.out.println(response.getData());
    }
}
