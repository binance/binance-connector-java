package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundCollectionByAssetRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.FundCollectionByAssetResponse;

/** API examples for AccountApi */
public class FundCollectionByAssetExample {
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
     * Fund Collection by Asset(TRADE)
     *
     * <p>Transfers specific asset from Futures Account to Margin account * The BNB transfer is not
     * be supported Weight: 30
     *
     * @throws ApiException if the Api call fails
     */
    public void fundCollectionByAssetExample() throws ApiException {
        FundCollectionByAssetRequest fundCollectionByAssetRequest =
                new FundCollectionByAssetRequest();
        fundCollectionByAssetRequest.asset("");
        ApiResponse<FundCollectionByAssetResponse> response =
                getApi().fundCollectionByAsset(fundCollectionByAssetRequest);
        System.out.println(response.getData());
    }
}
