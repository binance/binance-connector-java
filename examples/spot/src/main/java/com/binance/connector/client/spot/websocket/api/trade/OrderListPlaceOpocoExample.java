package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOpocoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOpocoResponse;
import com.binance.connector.client.spot.websocket.api.model.PendingAboveType;
import com.binance.connector.client.spot.websocket.api.model.PendingSide;
import com.binance.connector.client.spot.websocket.api.model.WorkingSide;
import com.binance.connector.client.spot.websocket.api.model.WorkingType;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderListPlaceOpocoExample {
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
     * OPOCO (TRADE)
     *
     * <p>Place an [OPOCO](/products/spot/faqs/opo). Weight(IP): 1 Unfilled Order Count: 3 Security
     * Type: TRADE Notes: **Data Source:** Matching Engine
     */
    public void orderListPlaceOpocoExampleAsync() {
        OrderListPlaceOpocoRequest orderListPlaceOpocoRequest = new OrderListPlaceOpocoRequest();
        orderListPlaceOpocoRequest.symbol("BNBUSDT");
        orderListPlaceOpocoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOpocoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOpocoRequest.workingPrice(1d);
        orderListPlaceOpocoRequest.workingQuantity(1d);
        orderListPlaceOpocoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOpocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        CompletableFuture<OrderListPlaceOpocoResponse> future =
                getApi().orderListPlaceOpoco(orderListPlaceOpocoRequest);
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
     * OPOCO (TRADE)
     *
     * <p>Place an [OPOCO](/products/spot/faqs/opo). Weight(IP): 1 Unfilled Order Count: 3 Security
     * Type: TRADE Notes: **Data Source:** Matching Engine
     */
    public void orderListPlaceOpocoExampleSync() {
        OrderListPlaceOpocoRequest orderListPlaceOpocoRequest = new OrderListPlaceOpocoRequest();
        orderListPlaceOpocoRequest.symbol("BNBUSDT");
        orderListPlaceOpocoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOpocoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOpocoRequest.workingPrice(1d);
        orderListPlaceOpocoRequest.workingQuantity(1d);
        orderListPlaceOpocoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOpocoRequest.pendingAboveType(PendingAboveType.STOP_LOSS_LIMIT);
        CompletableFuture<OrderListPlaceOpocoResponse> future =
                getApi().orderListPlaceOpoco(orderListPlaceOpocoRequest);
        OrderListPlaceOpocoResponse response = future.join();
        System.out.println(response);
    }
}
