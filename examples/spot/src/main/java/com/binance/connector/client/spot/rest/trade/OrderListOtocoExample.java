/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderListOtocoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtocoResponse;
import com.binance.connector.client.spot.rest.model.PendingAboveType;
import com.binance.connector.client.spot.rest.model.PendingSide;
import com.binance.connector.client.spot.rest.model.WorkingSide;
import com.binance.connector.client.spot.rest.model.WorkingType;

/** API examples for TradeApi */
public class OrderListOtocoExample {
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
     * New Order list - OTOCO
     *
     * <p>Place an OTOCO. * An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised
     * of 3 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60;
     * or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The
     * behavior of the working order is the same as the [OTO](#new-order-list---oto-trade). * OTOCO
     * has 2 pending orders (pending above and pending below), forming an OCO pair. The pending
     * orders are only placed on the order book when the working order gets **fully filled**. * The
     * rules of the pending above and pending below follow the same rules as the [Order list
     * OCO](#new-order-list---oco-trade). * OTOCOs add **3 orders** to the
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight: 1
     * Unfilled Order Count: 3
     *
     * @throws ApiException if the Api call fails
     */
    public void orderListOtocoExample() throws ApiException {
        OrderListOtocoRequest orderListOtocoRequest = new OrderListOtocoRequest();
        orderListOtocoRequest.symbol("BNBUSDT");
        orderListOtocoRequest.workingType(WorkingType.LIMIT);
        orderListOtocoRequest.workingSide(WorkingSide.BUY);
        orderListOtocoRequest.workingPrice(1.0d);
        orderListOtocoRequest.workingQuantity(1.0d);
        orderListOtocoRequest.pendingSide(PendingSide.BUY);
        orderListOtocoRequest.pendingQuantity(1.0d);
        orderListOtocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        ApiResponse<OrderListOtocoResponse> response =
                getApi().orderListOtoco(orderListOtocoRequest);
        System.out.println(response.getData());
    }
}
