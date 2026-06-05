package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.PortfolioMarginCollateralRateResponse;

/** API examples for MarketDataApi */
public class PortfolioMarginCollateralRateExample {
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
     * Portfolio Margin Collateral Rate(MARKET_DATA)
     *
     * <p>Portfolio Margin Collateral Rate Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void portfolioMarginCollateralRateExample() throws ApiException {
        ApiResponse<PortfolioMarginCollateralRateResponse> response =
                getApi().portfolioMarginCollateralRate();
        System.out.println(response.getData());
    }
}
