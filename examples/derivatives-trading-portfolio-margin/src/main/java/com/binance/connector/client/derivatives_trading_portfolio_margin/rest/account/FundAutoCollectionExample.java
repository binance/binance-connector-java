package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundAutoCollectionResponse;
import java.io.IOException;

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
     * Fund Auto-collection (TRADE)
     *
     * <p>Fund collection for Portfolio Margin Weight(IP): 750 Security Type: TRADE Notes: - BNB
     * assets will not be auto-collected. - Rolling window endpoint can be called at most 500 times
     * per hour.
     *
     * @throws ApiException if the Api call fails
     */
    public void fundAutoCollectionExample() throws ApiException, IOException {
        FundAutoCollectionRequest fundAutoCollectionRequest = new FundAutoCollectionRequest();
        ApiResponse<FundAutoCollectionResponse> response =
                getApi().fundAutoCollection(fundAutoCollectionRequest);
        System.out.println(response.getData());
    }
}
