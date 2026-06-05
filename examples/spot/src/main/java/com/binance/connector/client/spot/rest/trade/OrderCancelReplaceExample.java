package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.CancelReplaceMode;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceRequest;
import com.binance.connector.client.spot.rest.model.OrderCancelReplaceResponse;
import com.binance.connector.client.spot.rest.model.OrderType;
import com.binance.connector.client.spot.rest.model.Side;

/** API examples for TradeApi */
public class OrderCancelReplaceExample {
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
     * Cancel an Existing Order and Send a New Order
     *
     * <p>* Cancels an existing order and places a new order on the same symbol. * Filters and Order
     * Count are evaluated before the processing of the cancellation and order placement occurs. * A
     * new order that was not attempted (i.e. when &#x60;newOrderResult: NOT_ATTEMPTED&#x60;), will
     * still increase the unfilled order count by 1. * You can only cancel an individual order from
     * an orderList using this endpoint, but the result is the same as canceling the entire
     * orderList. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void orderCancelReplaceExample() throws ApiException {
        OrderCancelReplaceRequest orderCancelReplaceRequest = new OrderCancelReplaceRequest();
        orderCancelReplaceRequest.symbol("BNBUSDT");
        orderCancelReplaceRequest.side(Side.BUY);
        orderCancelReplaceRequest.type(OrderType.MARKET);
        orderCancelReplaceRequest.cancelReplaceMode(CancelReplaceMode.STOP_ON_FAILURE);
        ApiResponse<OrderCancelReplaceResponse> response =
                getApi().orderCancelReplace(orderCancelReplaceRequest);
        System.out.println(response.getData());
    }
}
