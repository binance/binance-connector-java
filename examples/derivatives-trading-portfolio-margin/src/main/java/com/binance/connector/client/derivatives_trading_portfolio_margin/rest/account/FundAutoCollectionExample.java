package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionResponse;

/** API examples for AccountApi */
public class FundAutoCollectionExample {
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
     * Fund Auto-collection(TRADE)
     *
     * <p>Fund collection for Portfolio Margin * The BNB would not be collected from UM-PM account
     * to the Portfolio Margin account. * You can only use this function 500 times per hour in a
     * rolling manner. Weight: 750
     *
     * @throws ApiException if the Api call fails
     */
    public void fundAutoCollectionExample() throws ApiException {
        FundAutoCollectionRequest fundAutoCollectionRequest = new FundAutoCollectionRequest();
        ApiResponse<FundAutoCollectionResponse> response =
                getApi().fundAutoCollection(fundAutoCollectionRequest);
        System.out.println(response.getData());
    }
}
