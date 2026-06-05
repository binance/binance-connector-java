package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProSpanAccountInfoResponse;

/** API examples for AccountApi */
public class GetPortfolioMarginProSpanAccountInfoExample {
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
     * Get Portfolio Margin Pro SPAN Account Info(USER_DATA)
     *
     * <p>Get Portfolio Margin Pro SPAN Account Info (For Portfolio Margin Pro SPAN users only)
     * Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void getPortfolioMarginProSpanAccountInfoExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetPortfolioMarginProSpanAccountInfoResponse> response =
                getApi().getPortfolioMarginProSpanAccountInfo(recvWindow);
        System.out.println(response.getData());
    }
}
