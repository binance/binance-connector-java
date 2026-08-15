package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtocoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtocoResponse;
import com.binance.connector.client.spot.websocket.api.model.PendingAboveType;
import com.binance.connector.client.spot.websocket.api.model.PendingSide;
import com.binance.connector.client.spot.websocket.api.model.WorkingSide;
import com.binance.connector.client.spot.websocket.api.model.WorkingType;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderListPlaceOtocoExample {
    private SpotWebSocketApi api;

    public SpotWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place new Order list - OTOCO (TRADE)
     *
     * <p>Place an OTOCO. * An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised
     * of 3 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60;
     * or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The
     * behavior of the working order is the same as the [OTO](#order-list-place-oto). * OTOCO has 2
     * pending orders (pending above and pending below), forming an OCO pair. The pending orders are
     * only placed on the order book when the working order gets **fully filled**. * The rules of
     * the pending above and pending below follow the same rules as the [Order list
     * OCO](#order-list-place-oco). * OTOCOs add **3 orders** to the
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP):
     * 1 Unfilled Order Count: 3 Security Type: TRADE Notes: **Data Source:** Matching Engine
     * **Mandatory parameters based on &#x60;pendingAboveType&#x60;, &#x60;pendingBelowType&#x60; or
     * &#x60;workingType&#x60;** Depending on the
     * &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some
     * optional parameters will become mandatory. |Type |Additional mandatory parameters|Additional
     * information| |---- |---- |------ |&#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;
     * |&#x60;workingTimeInForce&#x60; | |&#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;
     * |&#x60;pendingAbovePrice&#x60; | |&#x60;pendingAboveType&#x60; &#x3D;
     * &#x60;STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;|
     * |&#x60;pendingAboveType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingAbovePrice&#x60;,
     * &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;,
     * &#x60;pendingAboveTimeInForce&#x60;| |&#x60;pendingBelowType&#x60;&#x3D;
     * &#x60;LIMIT_MAKER&#x60; |&#x60;pendingBelowPrice&#x60; | &#x60;pendingBelowType&#x3D;
     * STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;|
     * |&#x60;pendingBelowType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingBelowPrice&#x60;,
     * &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;,
     * &#x60;pendingBelowTimeInForce&#x60;|
     */
    public void orderListPlaceOtocoExampleAsync() {
        OrderListPlaceOtocoRequest orderListPlaceOtocoRequest = new OrderListPlaceOtocoRequest();
        orderListPlaceOtocoRequest.symbol("BNBUSDT");
        orderListPlaceOtocoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOtocoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOtocoRequest.workingPrice(1d);
        orderListPlaceOtocoRequest.workingQuantity(1d);
        orderListPlaceOtocoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOtocoRequest.pendingQuantity(1d);
        orderListPlaceOtocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        CompletableFuture<OrderListPlaceOtocoResponse> future =
                getApi().orderListPlaceOtoco(orderListPlaceOtocoRequest);
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * Place new Order list - OTOCO (TRADE)
     *
     * <p>Place an OTOCO. * An OTOCO (One-Triggers-One-Cancels-the-Other) is an order list comprised
     * of 3 orders. * The first order is called the **working order** and must be &#x60;LIMIT&#x60;
     * or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The
     * behavior of the working order is the same as the [OTO](#order-list-place-oto). * OTOCO has 2
     * pending orders (pending above and pending below), forming an OCO pair. The pending orders are
     * only placed on the order book when the working order gets **fully filled**. * The rules of
     * the pending above and pending below follow the same rules as the [Order list
     * OCO](#order-list-place-oco). * OTOCOs add **3 orders** to the
     * &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter. Weight(IP):
     * 1 Unfilled Order Count: 3 Security Type: TRADE Notes: **Data Source:** Matching Engine
     * **Mandatory parameters based on &#x60;pendingAboveType&#x60;, &#x60;pendingBelowType&#x60; or
     * &#x60;workingType&#x60;** Depending on the
     * &#x60;pendingAboveType&#x60;/&#x60;pendingBelowType&#x60; or &#x60;workingType&#x60;, some
     * optional parameters will become mandatory. |Type |Additional mandatory parameters|Additional
     * information| |---- |---- |------ |&#x60;workingType&#x60; &#x3D; &#x60;LIMIT&#x60;
     * |&#x60;workingTimeInForce&#x60; | |&#x60;pendingAboveType&#x60;&#x3D; &#x60;LIMIT_MAKER&#x60;
     * |&#x60;pendingAbovePrice&#x60; | |&#x60;pendingAboveType&#x60; &#x3D;
     * &#x60;STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingAboveStopPrice&#x60; and/or
     * &#x60;pendingAboveTrailingDelta&#x60;|
     * |&#x60;pendingAboveType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingAbovePrice&#x60;,
     * &#x60;pendingAboveStopPrice&#x60; and/or &#x60;pendingAboveTrailingDelta&#x60;,
     * &#x60;pendingAboveTimeInForce&#x60;| |&#x60;pendingBelowType&#x60;&#x3D;
     * &#x60;LIMIT_MAKER&#x60; |&#x60;pendingBelowPrice&#x60; | &#x60;pendingBelowType&#x3D;
     * STOP_LOSS/TAKE_PROFIT&#x60; |&#x60;pendingBelowStopPrice&#x60; and/or
     * &#x60;pendingBelowTrailingDelta&#x60;|
     * |&#x60;pendingBelowType&#x3D;STOP_LOSS_LIMIT/TAKE_PROFIT_LIMIT&#x60;|&#x60;pendingBelowPrice&#x60;,
     * &#x60;pendingBelowStopPrice&#x60; and/or &#x60;pendingBelowTrailingDelta&#x60;,
     * &#x60;pendingBelowTimeInForce&#x60;|
     */
    public void orderListPlaceOtocoExampleSync() {
        OrderListPlaceOtocoRequest orderListPlaceOtocoRequest = new OrderListPlaceOtocoRequest();
        orderListPlaceOtocoRequest.symbol("BNBUSDT");
        orderListPlaceOtocoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOtocoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOtocoRequest.workingPrice(1d);
        orderListPlaceOtocoRequest.workingQuantity(1d);
        orderListPlaceOtocoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOtocoRequest.pendingQuantity(1d);
        orderListPlaceOtocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        CompletableFuture<OrderListPlaceOtocoResponse> future =
                getApi().orderListPlaceOtoco(orderListPlaceOtocoRequest);
        OrderListPlaceOtocoResponse response = future.join();
        System.out.println(response);
    }
}
