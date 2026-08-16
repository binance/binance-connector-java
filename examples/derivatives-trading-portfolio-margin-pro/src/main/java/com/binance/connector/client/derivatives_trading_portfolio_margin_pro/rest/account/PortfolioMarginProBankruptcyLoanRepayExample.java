package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProBankruptcyLoanRepayResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class PortfolioMarginProBankruptcyLoanRepayExample {
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
     * Portfolio Margin Pro Bankruptcy Loan Repay (TRADE)
     *
     * <p>Repay Portfolio Margin Pro Bankruptcy Loan Weight(UID): 3000 Security Type: TRADE Notes: -
     * Please note that the API Key has enabled Spot &amp; Margin Trading permissions to access this
     * endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void portfolioMarginProBankruptcyLoanRepayExample() throws ApiException, IOException {
        PortfolioMarginProBankruptcyLoanRepayRequest portfolioMarginProBankruptcyLoanRepayRequest =
                new PortfolioMarginProBankruptcyLoanRepayRequest();
        ApiResponse<PortfolioMarginProBankruptcyLoanRepayResponse> response =
                getApi().portfolioMarginProBankruptcyLoanRepay(
                                portfolioMarginProBankruptcyLoanRepayRequest);
        System.out.println(response.getData());
    }
}
