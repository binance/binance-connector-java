package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.QueryPreventedMatchesResponse;
import java.io.IOException;

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
     * Query Prevented Matches (USER_DATA)
     *
     * <p>Displays the list of orders that were expired due to STP. (Self-Trade Prevention).
     * Weight(IP): 10 Security Type: USER_DATA Notes: - Supported parameter combinations: -
     * &#x60;symbol&#x60; + &#x60;preventedMatchId&#x60; - &#x60;symbol&#x60; + &#x60;orderId&#x60;
     * - &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; - If
     * &#x60;orderId&#x60; is provided, all prevented matches for that order will be returned. - If
     * &#x60;preventedMatchId&#x60; is provided, the specific prevented match will be returned. - A
     * single request returns a maximum of 500 records. If there are more than 500 records, use
     * &#x60;symbol&#x60; + &#x60;orderId&#x60; + &#x60;fromPreventedMatchId&#x60; combination for
     * pagination.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPreventedMatchesExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long preventedMatchId = 1L;
        Long orderId = 1L;
        Long fromPreventedMatchId = 1L;
        IsIsolated isIsolated = IsIsolated.TRUE;
        Long recvWindow = 5000L;
        ApiResponse<QueryPreventedMatchesResponse> response =
                getApi().queryPreventedMatches(
                                symbol,
                                preventedMatchId,
                                orderId,
                                fromPreventedMatchId,
                                isIsolated,
                                recvWindow);
        System.out.println(response.getData());
    }
}
