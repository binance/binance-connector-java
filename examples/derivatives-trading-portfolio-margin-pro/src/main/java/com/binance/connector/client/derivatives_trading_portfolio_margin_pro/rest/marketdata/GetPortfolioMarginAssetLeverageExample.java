package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginAssetLeverageResponse;

/** API examples for MarketDataApi */
public class GetPortfolioMarginAssetLeverageExample {
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
     * Get Portfolio Margin Asset Leverage(USER_DATA)
     *
     * <p>Get Portfolio Margin Asset Leverage Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void getPortfolioMarginAssetLeverageExample() throws ApiException {
        ApiResponse<GetPortfolioMarginAssetLeverageResponse> response =
                getApi().getPortfolioMarginAssetLeverage();
        System.out.println(response.getData());
    }
}
