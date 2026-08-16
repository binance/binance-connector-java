package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import com.binance.connector.client.margin_trading.rest.model.QueryCrossIsolatedMarginCapitalFlowResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class QueryCrossIsolatedMarginCapitalFlowExample {
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
     * Query Cross Isolated Margin Capital Flow (USER_DATA)
     *
     * <p>Query Cross Isolated Margin Capital Flow Weight(IP): 100 Security Type: USER_DATA Notes: -
     * Only supports querying the data of the last 90 days - The time between startTime and endTime
     * cannot be longer than 7 days. - If fromId is set, the data with id &gt; fromId will be
     * returned. Otherwise the latest data will be returned - To query isolated data, Symbol needs
     * to be entered.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCrossIsolatedMarginCapitalFlowExample() throws ApiException, IOException {
        String asset = "USDT";
        String symbol = "BTCUSDT";
        OrderType type = OrderType.ROLL_IN;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<QueryCrossIsolatedMarginCapitalFlowResponse> response =
                getApi().queryCrossIsolatedMarginCapitalFlow(
                                asset, symbol, type, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
