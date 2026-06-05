package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryPreventedMatchesResponse;

/** API examples for TradeApi */
public class QueryPreventedMatchesExample {
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
     * Query Prevented Matches(USER_DATA)
     *
     * <p>Weight: 10(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPreventedMatchesExample() throws ApiException {
        String symbol = "";
        Long preventedMatchId = 1L;
        Long orderId = 1L;
        Long fromPreventedMatchId = 1L;
        Long recvWindow = 5000L;
        String isIsolated = "false";
        ApiResponse<QueryPreventedMatchesResponse> response =
                getApi().queryPreventedMatches(
                                symbol,
                                preventedMatchId,
                                orderId,
                                fromPreventedMatchId,
                                recvWindow,
                                isIsolated);
        System.out.println(response.getData());
    }
}
