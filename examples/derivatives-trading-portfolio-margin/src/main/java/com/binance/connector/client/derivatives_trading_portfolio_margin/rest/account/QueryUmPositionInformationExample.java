package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmPositionInformationResponse;

/** API examples for AccountApi */
public class QueryUmPositionInformationExample {
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
     * Query UM Position Information(USER_DATA)
     *
     * <p>Get current UM position information. * Please use with user data stream
     * &#x60;ACCOUNT_UPDATE&#x60; to meet your timeliness and accuracy needs. * for One-way Mode
     * user, the response will only show the \&quot;BOTH\&quot; positions * for Hedge Mode user, the
     * response will show \&quot;LONG\&quot;, and \&quot;SHORT\&quot; positions. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUmPositionInformationExample() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryUmPositionInformationResponse> response =
                getApi().queryUmPositionInformation(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
