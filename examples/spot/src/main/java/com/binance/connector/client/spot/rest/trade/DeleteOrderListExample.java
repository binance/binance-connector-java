package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.DeleteOrderListResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class DeleteOrderListExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Cancel Order list (TRADE)
     *
     * <p>Cancel an entire Order list Weight(IP): 1 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine **Notes:** - Canceling an individual order from an order list will cancel the
     * entire order list. - If both orderListId and listClientOrderId parameters are provided, the
     * orderListId is searched first, then the listClientOrderId from that result is checked against
     * that order. If both conditions are not met the request will be rejected.
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteOrderListExample() throws ApiException, IOException {
        String symbol = "BNBUSDT";
        Long orderListId = 1L;
        String listClientOrderId = "C3wyj4WVEktd7u9aVBRXcN";
        String newClientOrderId = "cancelMyOrder1";
        Double recvWindow = 5000d;
        ApiResponse<DeleteOrderListResponse> response =
                getApi().deleteOrderList(
                                symbol,
                                orderListId,
                                listClientOrderId,
                                newClientOrderId,
                                recvWindow);
        System.out.println(response.getData());
    }
}
