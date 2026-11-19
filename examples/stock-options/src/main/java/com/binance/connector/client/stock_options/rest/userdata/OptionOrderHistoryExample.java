package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionOrderHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.Side;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionOrderHistoryExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Option Order History (USER_DATA)
     *
     * <p>Paged option order history, sorted by creation time in descending order. Only option
     * orders are returned; stock orders are not included. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionOrderHistoryExample() throws ApiException, IOException {
        Long startTime = 1790100000000L;
        Long endTime = 1790200000000L;
        String underlyingSymbol = "NVDA";
        Side side = Side.BUY;
        String orderStatus = "FILLED,CANCELED";
        Integer current = 1;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<OptionOrderHistoryResponse> response =
                getApi().optionOrderHistory(
                                startTime,
                                endTime,
                                underlyingSymbol,
                                side,
                                orderStatus,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
