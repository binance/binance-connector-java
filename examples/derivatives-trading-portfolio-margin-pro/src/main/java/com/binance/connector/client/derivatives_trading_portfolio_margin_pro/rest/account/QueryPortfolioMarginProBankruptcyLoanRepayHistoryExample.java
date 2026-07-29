package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryPortfolioMarginProBankruptcyLoanRepayHistoryExample {
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
     * Query Portfolio Margin Pro Bankruptcy Loan Repay History (USER_DATA)
     *
     * <p>Query repay history of pmloan for portfolio margin pro. Weight(IP): 500 Security Type:
     * USER_DATA Notes: - &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 360
     * days - If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last
     * 30 days by default. - If &#x60;startTime&#x60;is sent and &#x60;endTime&#x60; is not sent,
     * return records of [startTime, startTime+30d]. - If &#x60;startTime&#x60; is not sent and
     * &#x60;endTime&#x60; is sent, return records of [endTime-30d, endTime].
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPortfolioMarginProBankruptcyLoanRepayHistoryExample()
            throws ApiException, IOException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long size = 10L;
        Long current = 1L;
        Long recvWindow = 5000L;
        ApiResponse<QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse> response =
                getApi().queryPortfolioMarginProBankruptcyLoanRepayHistory(
                                startTime, endTime, size, current, recvWindow);
        System.out.println(response.getData());
    }
}
