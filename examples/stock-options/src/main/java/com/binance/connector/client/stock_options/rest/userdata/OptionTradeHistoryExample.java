package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionTradeHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.Side;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionTradeHistoryExample {
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
     * Option Trade History (USER_DATA)
     *
     * <p>Paged per-fill option trade history. Only option fills are returned. Option fees are
     * charged per order, so individual fills carry no fee; see &#x60;fee&#x60; in Option Order
     * History / Option Order Detail. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionTradeHistoryExample() throws ApiException, IOException {
        Long startTime = 1790100000000L;
        Long endTime = 1790200000000L;
        String underlyingSymbol = "NVDA";
        Side side = Side.BUY;
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        Integer current = 1;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<OptionTradeHistoryResponse> response =
                getApi().optionTradeHistory(
                                startTime,
                                endTime,
                                underlyingSymbol,
                                side,
                                orderId,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
