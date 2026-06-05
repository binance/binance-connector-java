package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse;

/** API examples for AccountApi */
public class QueryPortfolioMarginProNegativeBalanceInterestHistoryExample {
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
     * Query Portfolio Margin Pro Negative Balance Interest History(USER_DATA)
     *
     * <p>Query interest history of negative balance for portfolio margin. Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPortfolioMarginProNegativeBalanceInterestHistoryExample() throws ApiException {
        String asset = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse> response =
                getApi().queryPortfolioMarginProNegativeBalanceInterestHistory(
                                asset, startTime, endTime, size, recvWindow);
        System.out.println(response.getData());
    }
}
