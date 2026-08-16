package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Archived;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryMarginLoanRecordResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryMarginLoanRecordExample {
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
     * Query Margin Loan Record (USER_DATA)
     *
     * <p>Query margin loan record Weight(IP): 10 Security Type: USER_DATA Notes: - txId or
     * startTime must be sent. txId takes precedence. - Response in descending order - The max
     * interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by
     * default - Set &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginLoanRecordExample() throws ApiException, IOException {
        String asset = "USDT";
        Long txId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 10L;
        Archived archived = Archived.TRUE;
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginLoanRecordResponse> response =
                getApi().queryMarginLoanRecord(
                                asset,
                                txId,
                                startTime,
                                endTime,
                                current,
                                size,
                                archived,
                                recvWindow);
        System.out.println(response.getData());
    }
}
