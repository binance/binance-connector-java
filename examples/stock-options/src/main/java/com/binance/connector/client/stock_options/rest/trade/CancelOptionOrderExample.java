package com.binance.connector.client.stock_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.CancelOptionOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelOptionOrderExample {
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
     * Cancel Option Order (TRADE)
     *
     * <p>Cancel an open order by &#x60;orderId&#x60;. Cancellation applies to the caller&#39;s own
     * brokerage account and is not restricted by asset class: passing the &#x60;orderId&#x60; of a
     * stock order also cancels it, and &#x60;/sapi/v1/equity/order/cancel&#x60; can likewise cancel
     * option orders. Only the caller&#39;s own orders can be canceled. Errors on this endpoint use
     * the Stocks Trading error codes (&#x60;486xxx&#x60;). See Stocks Trading Error Code. Weight: 1
     * Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelOptionOrderExample() throws ApiException, IOException {
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        Long recvWindow = 5000L;
        ApiResponse<CancelOptionOrderResponse> response =
                getApi().cancelOptionOrder(orderId, recvWindow);
        System.out.println(response.getData());
    }
}
