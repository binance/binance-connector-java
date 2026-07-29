package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryCurrentOpenOptionOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentOpenOptionOrdersExample {
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
     * Query Current Open Option Orders (USER_DATA)
     *
     * <p>Query current all open orders, status: ACCEPTED PARTIALLY_FILLED Weight: 1 for a single
     * symbol; 40 when the symbol parameter is omitted Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentOpenOptionOrdersExample() throws ApiException, IOException {
        String symbol = "BTC-200730-9000-C";
        Long orderId = 4611875134427365000L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentOpenOptionOrdersResponse> response =
                getApi().queryCurrentOpenOptionOrders(
                                symbol, orderId, startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
