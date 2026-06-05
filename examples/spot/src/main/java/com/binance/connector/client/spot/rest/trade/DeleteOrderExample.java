package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.CancelRestrictions;
import com.binance.connector.client.spot.rest.model.DeleteOrderResponse;

/** API examples for TradeApi */
public class DeleteOrderExample {
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
     * Cancel order
     *
     * <p>Cancel an active order. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void deleteOrderExample() throws ApiException {
        String symbol = "BNBUSDT";
        Long orderId = 1L;
        String origClientOrderId = "";
        String newClientOrderId = "";
        CancelRestrictions cancelRestrictions = CancelRestrictions.ONLY_NEW;
        Double recvWindow = 5000.0d;
        ApiResponse<DeleteOrderResponse> response =
                getApi().deleteOrder(
                                symbol,
                                orderId,
                                origClientOrderId,
                                newClientOrderId,
                                cancelRestrictions,
                                recvWindow);
        System.out.println(response.getData());
    }
}
