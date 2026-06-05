package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.FundCollectionByAssetResponse;

/** API examples for AccountApi */
public class FundCollectionByAssetExample {
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
     * Fund Collection by Asset(USER_DATA)
     *
     * <p>Transfers specific asset from Futures Account to Margin account * The BNB transfer is not
     * be supported Weight: 60
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
