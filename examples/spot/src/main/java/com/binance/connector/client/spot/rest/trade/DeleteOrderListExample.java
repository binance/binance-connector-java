package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.DeleteOrderListResponse;

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
     * Cancel Order list
     *
     * <p>Cancel an entire Order list Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteOrderListExample() throws ApiException {
        String symbol = "BNBUSDT";
        Long orderListId = 1L;
        String listClientOrderId = "";
        String newClientOrderId = "";
        Double recvWindow = 5000.0d;
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
