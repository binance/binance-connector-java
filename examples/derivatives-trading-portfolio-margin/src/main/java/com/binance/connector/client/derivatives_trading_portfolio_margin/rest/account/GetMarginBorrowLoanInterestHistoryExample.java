package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Archived;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetMarginBorrowLoanInterestHistoryResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetMarginBorrowLoanInterestHistoryExample {
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
     * Get Margin Borrow/Loan Interest History (USER_DATA)
     *
     * <p>Get Margin Borrow/Loan Interest History Weight(IP): 1 Security Type: USER_DATA Notes: -
     * Response in descending order - The max interval between startTime and endTime is 30 days. It
     * is a MUST to ensure data correctness. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; not
     * sent, return records of the last 7 days by default - If &#x60;startTime&#x60; is sent and
     * &#x60;endTime&#x60; is not sent, the records from &#x60;startTime&#x60; to the present will
     * be returned; if &#x60;startTime&#x60; is more than 30 days ago, the records of the past 30
     * days will be returned. - If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is
     * sent, the records of the 7 days before &#x60;endTime&#x60; is returned. - Type in response
     * has 5 enums: - &#x60;PERIODIC&#x60; interest charged per hour - &#x60;ON_BORROW&#x60; first
     * interest charged on borrow - &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour
     * converted into BNB - &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow
     * converted into BNB - &#x60;PORTFOLIO&#x60; Portfolio Margin negative balance daily interest
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarginBorrowLoanInterestHistoryExample() throws ApiException, IOException {
        String asset = "USDT";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 10L;
        Archived archived = Archived.TRUE;
        Long recvWindow = 5000L;
        ApiResponse<GetMarginBorrowLoanInterestHistoryResponse> response =
                getApi().getMarginBorrowLoanInterestHistory(
                                asset, startTime, endTime, current, size, archived, recvWindow);
        System.out.println(response.getData());
    }
}
