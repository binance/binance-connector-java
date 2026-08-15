package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsAllOcoResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryMarginAccountsAllOcoExample {
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
     * Query Margin Account&#39;s all OCO (USER_DATA)
     *
     * <p>Retrieves all OCO for a specific margin account based on provided optional parameters
     * Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsAllOcoExample() throws ApiException, IOException {
        IsIsolated isIsolated = IsIsolated.TRUE;
        String symbol = "LTCBTC";
        Long fromId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsAllOcoResponse> response =
                getApi().queryMarginAccountsAllOco(
                                isIsolated, symbol, fromId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
