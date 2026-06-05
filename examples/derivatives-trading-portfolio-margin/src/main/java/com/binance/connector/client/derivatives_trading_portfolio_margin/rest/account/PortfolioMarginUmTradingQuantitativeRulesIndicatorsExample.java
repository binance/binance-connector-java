package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse;

/** API examples for AccountApi */
public class PortfolioMarginUmTradingQuantitativeRulesIndicatorsExample {
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
     * Portfolio Margin UM Trading Quantitative Rules Indicators(USER_DATA)
     *
     * <p>Portfolio Margin UM Trading Quantitative Rules Indicators Weight: 1 for a single symbol 10
     * when the symbol parameter is omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void portfolioMarginUmTradingQuantitativeRulesIndicatorsExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<PortfolioMarginUmTradingQuantitativeRulesIndicatorsResponse> response =
                getApi().portfolioMarginUmTradingQuantitativeRulesIndicators(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
