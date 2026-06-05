package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundAutoCollectionResponse;

/** API examples for AccountApi */
public class FundAutoCollectionExample {
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
     * Fund Auto-collection(USER_DATA)
     *
     * <p>Transfers all assets from Futures Account to Margin account * The BNB would not be
     * collected from UM-PM account to the Portfolio Margin account. * You can only use this
     * function 500 times per hour in a rolling manner. Weight: 1500
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
