package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryLiquidationLoanRepayHistoryResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryLiquidationLoanRepayHistoryExample {
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
     * Query Liquidation Loan Repay History (USER_DATA)
     *
     * <p>Query the repayment history of cross-margin liquidation loans (deficit caused by
     * bankruptcy during liquidation). Supports time-range filtering and pagination. Weight(UID):
     * 100 Security Type: USER_DATA Notes: - The maximum query range is 90 days. If
     * &#x60;startTime&#x60; is earlier than 90 days ago, it will be clamped to 90 days ago. - Only
     * records with status &#x60;SUCCESS&#x60; or &#x60;PENDING&#x60; are returned. Failed repayment
     * records are excluded.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryLiquidationLoanRepayHistoryExample() throws ApiException, IOException {
        Long startTime = 1714492800000L;
        Long endTime = 1714579200000L;
        Long current = 1L;
        Long size = 50L;
        Long recvWindow = 5000L;
        ApiResponse<QueryLiquidationLoanRepayHistoryResponse> response =
                getApi().queryLiquidationLoanRepayHistory(
                                startTime, endTime, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
