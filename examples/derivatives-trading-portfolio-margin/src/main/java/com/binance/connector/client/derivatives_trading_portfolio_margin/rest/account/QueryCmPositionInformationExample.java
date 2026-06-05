package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCmPositionInformationResponse;

/** API examples for AccountApi */
public class QueryCmPositionInformationExample {
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
     * Query CM Position Information(USER_DATA)
     *
     * <p>Get current CM position information. * If neither &#x60;marginAsset&#x60; nor
     * &#x60;pair&#x60; is sent, positions of all symbols with &#x60;TRADING&#x60; status will be
     * returned. * for One-way Mode user, the response will only show the \&quot;BOTH\&quot;
     * positions * for Hedge Mode user, the response will show \&quot;LONG\&quot;, and
     * \&quot;SHORT\&quot; positions. * Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60;
     * to meet your timeliness and accuracy needs. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCmPositionInformationExample() throws ApiException {
        String marginAsset = "";
        String pair = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryCmPositionInformationResponse> response =
                getApi().queryCmPositionInformation(marginAsset, pair, recvWindow);
        System.out.println(response.getData());
    }
}
