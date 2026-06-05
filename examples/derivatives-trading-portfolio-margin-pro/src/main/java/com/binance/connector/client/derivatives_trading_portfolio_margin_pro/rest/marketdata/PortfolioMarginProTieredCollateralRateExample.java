package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginProTieredCollateralRateResponse;

/** API examples for MarketDataApi */
public class PortfolioMarginProTieredCollateralRateExample {
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
     * Portfolio Margin Pro Tiered Collateral Rate(USER_DATA)
     *
     * <p>Portfolio Margin PRO Tiered Collateral Rate Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void portfolioMarginProTieredCollateralRateExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<PortfolioMarginProTieredCollateralRateResponse> response =
                getApi().portfolioMarginProTieredCollateralRate(recvWindow);
        System.out.println(response.getData());
    }
}
