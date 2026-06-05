package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMaxBorrowResponse;

/** API examples for BorrowRepayApi */
public class QueryMaxBorrowExample {
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
     * Query Max Borrow (USER_DATA)
     *
     * <p>Query Max Borrow * If isolatedSymbol is not sent, crossed margin data will be sent. *
     * &#x60;borrowLimit&#x60; is also available from
     * [https://www.binance.com/en/margin-fee](https://www.binance.com/en/margin-fee) Weight: 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMaxBorrowExample() throws ApiException {
        String asset = "";
        String isolatedSymbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryMaxBorrowResponse> response =
                getApi().queryMaxBorrow(asset, isolatedSymbol, recvWindow);
        System.out.println(response.getData());
    }
}
