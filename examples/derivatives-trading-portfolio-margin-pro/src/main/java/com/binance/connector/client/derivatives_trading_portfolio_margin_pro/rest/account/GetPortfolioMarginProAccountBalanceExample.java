package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetPortfolioMarginProAccountBalanceResponse;

/** API examples for AccountApi */
public class GetPortfolioMarginProAccountBalanceExample {
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
     * Get Portfolio Margin Pro Account Balance(USER_DATA)
     *
     * <p>Query Portfolio Margin Pro account balance Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void getPortfolioMarginProAccountBalanceExample() throws ApiException {
        String asset = "";
        Long recvWindow = 5000L;
        ApiResponse<GetPortfolioMarginProAccountBalanceResponse> response =
                getApi().getPortfolioMarginProAccountBalance(asset, recvWindow);
        System.out.println(response.getData());
    }
}
