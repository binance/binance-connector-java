package com.binance.connector.client.spot.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.OrderListOtoRequest;
import com.binance.connector.client.spot.rest.model.OrderListOtoResponse;
import com.binance.connector.client.spot.rest.model.PendingSide;
import com.binance.connector.client.spot.rest.model.PendingType;
import com.binance.connector.client.spot.rest.model.WorkingSide;
import com.binance.connector.client.spot.rest.model.WorkingType;
import java.io.IOException;

/** API examples for TradeApi */
public class OrderListOtoExample {
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
     * New Order list - OTO (TRADE)
     *
     * <p>Place an OTO. - An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders. -
     * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or
     * &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The
     * second order is called the **pending order**. It can be any order type except for
     * &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is
     * only placed on the order book when the working order gets **fully filled**. - If either the
     * working order or the pending order is cancelled individually, the other order in the order
     * list will also be canceled or expired. - When the order list is placed, if the working order
     * gets **immediately fully filled**, the placement response will show the working order as
     * &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You
     * need to query the status of the pending order again to see its updated status. - OTOs add **2
     * orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight(IP): 1 Unfilled Order Count: 2 Security Type: TRADE Notes: **Data Source:**
     * Matching Engine **Mandatory parameters based on &#x60;pendingType&#x60; or
     * &#x60;workingType&#x60;** Depending on the &#x60;pendingType&#x60; or
     * &#x60;workingType&#x60;, some optional parameters will become mandatory. |Type |Additional
     * mandatory parameters|Additional information| |---- |---- |------ |&#x60;workingType&#x60;
     * &#x3D; &#x60;LIMIT&#x60; |&#x60;workingTimeInForce&#x60; | |&#x60;pendingType&#x60; &#x3D;
     * &#x60;LIMIT&#x60; |&#x60;pendingPrice&#x60;, &#x60;pendingTimeInForce&#x60; |
     * |&#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS&#x60; or &#x60;TAKE_PROFIT&#x60;
     * |&#x60;pendingStopPrice&#x60; and/or &#x60;pendingTrailingDelta&#x60;|
     * |&#x60;pendingType&#x60; &#x3D; &#x60;STOP_LOSS_LIMIT&#x60; or
     * &#x60;TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingPrice&#x60;, &#x60;pendingStopPrice&#x60; and/or
     * &#x60;pendingTrailingDelta&#x60;, &#x60;pendingTimeInForce&#x60;|
     *
     * @throws ApiException if the Api call fails
     */
    public void orderListOtoExample() throws ApiException, IOException {
        OrderListOtoRequest orderListOtoRequest = new OrderListOtoRequest();
        orderListOtoRequest.symbol("BNBUSDT");
        orderListOtoRequest.workingType(WorkingType.LIMIT);
        orderListOtoRequest.workingSide(WorkingSide.BUY);
        orderListOtoRequest.workingPrice(1d);
        orderListOtoRequest.workingQuantity(1d);
        orderListOtoRequest.pendingType(PendingType.LIMIT);
        orderListOtoRequest.pendingSide(PendingSide.BUY);
        orderListOtoRequest.pendingQuantity(1d);
        ApiResponse<OrderListOtoResponse> response = getApi().orderListOto(orderListOtoRequest);
        System.out.println(response.getData());
    }
}
