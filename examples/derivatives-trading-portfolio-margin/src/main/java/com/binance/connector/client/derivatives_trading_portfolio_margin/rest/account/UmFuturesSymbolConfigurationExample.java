package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.UmFuturesSymbolConfigurationResponse;

/** API examples for AccountApi */
public class UmFuturesSymbolConfigurationExample {
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
     * UM Futures Symbol Configuration(USER_DATA)
     *
     * <p>Get current UM account symbol configuration. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void umFuturesSymbolConfigurationExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<UmFuturesSymbolConfigurationResponse> response =
                getApi().umFuturesSymbolConfiguration(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
