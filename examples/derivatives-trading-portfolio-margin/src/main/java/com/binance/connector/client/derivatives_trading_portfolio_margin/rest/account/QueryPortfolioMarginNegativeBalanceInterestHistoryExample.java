package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryPortfolioMarginNegativeBalanceInterestHistoryResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryPortfolioMarginNegativeBalanceInterestHistoryExample {
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
     * Query Portfolio Margin Negative Balance Interest History (USER_DATA)
     *
     * <p>Query interest history of negative balance for portfolio margin. Weight(IP): 50 Security
     * Type: USER_DATA Notes: - Results are returned in descending order. - The query range cannot
     * exceed 30 days to ensure data correctness. - If both &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are omitted, the most recent 7 days are returned by default. - If
     * &#x60;startTime&#x60; is provided but &#x60;endTime&#x60; is omitted, records from
     * &#x60;startTime&#x60; to now are returned; if that exceeds 30 days, only the most recent 30
     * days are returned. - If &#x60;endTime&#x60; is provided but &#x60;startTime&#x60; is omitted,
     * records from the 7 days before &#x60;endTime&#x60; are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPortfolioMarginNegativeBalanceInterestHistoryExample()
            throws ApiException, IOException {
        String asset = "USDT";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryPortfolioMarginNegativeBalanceInterestHistoryResponse> response =
                getApi().queryPortfolioMarginNegativeBalanceInterestHistory(
                                asset, startTime, endTime, size, recvWindow);
        System.out.println(response.getData());
    }
}
