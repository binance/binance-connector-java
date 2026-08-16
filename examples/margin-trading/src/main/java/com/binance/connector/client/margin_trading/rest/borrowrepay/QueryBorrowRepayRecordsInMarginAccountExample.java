package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import com.binance.connector.client.margin_trading.rest.model.QueryBorrowRepayRecordsInMarginAccountResponse;
import java.io.IOException;

/** API examples for BorrowRepayApi */
public class QueryBorrowRepayRecordsInMarginAccountExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query borrow/repay records in Margin account (USER_DATA)
     *
     * <p>Query borrow/repay records in Margin account Weight(IP): 10 Security Type: USER_DATA
     * Notes: - &#x60;txId&#x60; or &#x60;startTime&#x60; must be sent. &#x60;txId&#x60; takes
     * precedence. - Response in descending order - If an asset is sent, data within 30 days before
     * &#x60;endTime&#x60;; If an asset is not sent, data within 7 days before &#x60;endTime&#x60; -
     * If neither &#x60;startTime&#x60; nor &#x60;endTime&#x60; is sent, the recent 7-day data will
     * be returned. - &#x60;startTime&#x60; set as &#x60;endTime&#x60; - 7 days by default,
     * &#x60;endTime&#x60; set as current time by default
     *
     * @throws ApiException if the Api call fails
     */
    public void queryBorrowRepayRecordsInMarginAccountExample() throws ApiException, IOException {
        OrderType type = OrderType.ROLL_IN;
        String asset = "BNB";
        String isolatedSymbol = "BNBUSDT";
        Long txId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryBorrowRepayRecordsInMarginAccountResponse> response =
                getApi().queryBorrowRepayRecordsInMarginAccount(
                                type,
                                asset,
                                isolatedSymbol,
                                txId,
                                startTime,
                                endTime,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
