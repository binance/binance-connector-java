package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityRequest;
import com.binance.connector.client.spot.rest.model.OrderAmendKeepPriorityResponse;

/** API examples for TradeApi */
public class OrderAmendKeepPriorityExample {
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
     * Order Amend Keep Priority
     *
     * <p>Reduce the quantity of an existing open order. This adds 0 orders to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [Order
     * Amend Keep Priority FAQ](faqs/order_amend_keep_priority.md) to learn more. Weight: 4
     *
     * @throws ApiException if the Api call fails
     */
    public void orderAmendKeepPriorityExample() throws ApiException {
        OrderAmendKeepPriorityRequest orderAmendKeepPriorityRequest =
                new OrderAmendKeepPriorityRequest();
        orderAmendKeepPriorityRequest.symbol("BNBUSDT");
        orderAmendKeepPriorityRequest.newQty(1.0d);
        ApiResponse<OrderAmendKeepPriorityResponse> response =
                getApi().orderAmendKeepPriority(orderAmendKeepPriorityRequest);
        System.out.println(response.getData());
    }
}
