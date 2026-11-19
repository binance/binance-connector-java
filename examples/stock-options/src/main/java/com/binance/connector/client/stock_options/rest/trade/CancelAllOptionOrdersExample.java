package com.binance.connector.client.stock_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.CancelAllOptionOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelAllOptionOrdersExample {
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
     * Cancel All Option Orders (TRADE)
     *
     * <p>Cancel all of the caller&#39;s open orders. **This also cancels open stock orders.**
     * Cancel-all is account-level at the broker and does not distinguish asset classes; it is the
     * same operation as &#x60;/sapi/v1/equity/order/cancel-all&#x60;. To cancel option orders only,
     * fetch them with Current Open Option Orders and cancel each one with Cancel Option Order.
     * Errors on this endpoint use the Stocks Trading error codes (&#x60;486xxx&#x60;). See Stocks
     * Trading Error Code. Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelAllOptionOrdersExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<CancelAllOptionOrdersResponse> response =
                getApi().cancelAllOptionOrders(recvWindow);
        System.out.println(response.getData());
    }
}
