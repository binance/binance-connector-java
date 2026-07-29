package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryOptionOrderHistoryResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryOptionOrderHistoryExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Option Order History (TRADE)
     *
     * <p>Query all finished orders within 5 days, finished status: CANCELLED FILLED REJECTED.
     * Weight(IP): 3 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void queryOptionOrderHistoryExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long orderId = 4611875134427365000L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 20L;
        Long recvWindow = 5000L;
        ApiResponse<QueryOptionOrderHistoryResponse> response =
                getApi().queryOptionOrderHistory(
                                symbol, orderId, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
