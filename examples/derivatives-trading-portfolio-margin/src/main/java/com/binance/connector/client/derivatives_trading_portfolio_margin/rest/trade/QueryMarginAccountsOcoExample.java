package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginAccountsOcoResponse;

/** API examples for TradeApi */
public class QueryMarginAccountsOcoExample {
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
     * Query Margin Account&#39;s OCO (USER_DATA)
     *
     * <p>Retrieves a specific OCO based on provided optional parameters Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOcoExample() throws ApiException {
        Long orderListId = 1L;
        String origClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOcoResponse> response =
                getApi().queryMarginAccountsOco(orderListId, origClientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
