package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryUmPositionInformationResponse;
import java.io.IOException;

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
     * Query UM Position Information (USER_DATA)
     *
     * <p>Get current UM position information. Weight(IP): 5 Security Type: USER_DATA Notes: -
     * Please use with account push event &#x60;ACCOUNT_UPDATE&#x60; for timeliness and accuracy. -
     * In One-way Mode, only positions with side &#x60;BOTH&#x60; are shown. - In Hedge Mode,
     * positions with sides &#x60;BOTH&#x60;, &#x60;LONG&#x60;, and &#x60;SHORT&#x60; are shown.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUmPositionInformationExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QueryUmPositionInformationResponse> response =
                getApi().queryUmPositionInformation(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
