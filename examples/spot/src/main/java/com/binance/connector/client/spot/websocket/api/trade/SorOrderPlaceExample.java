package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderType;
import com.binance.connector.client.spot.websocket.api.model.Side;
import com.binance.connector.client.spot.websocket.api.model.SorOrderPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.SorOrderPlaceResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class SorOrderPlaceExample {
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
     * Place new order using SOR (TRADE)
     *
     * <p>Places an order using smart order routing (SOR). This adds 1 order to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [SOR
     * FAQ](/products/spot/faqs/sor_faq) to learn more. Weight(IP): 1 Unfilled Order Count: 1
     * Security Type: TRADE Notes: **Data Source:** Matching Engine **Note:**
     * &#x60;sor.order.place&#x60; only supports &#x60;LIMIT&#x60; and &#x60;MARKET&#x60; orders.
     * &#x60;quoteOrderQty&#x60; is not supported.
     */
    public void sorOrderPlaceExampleAsync() {
        SorOrderPlaceRequest sorOrderPlaceRequest = new SorOrderPlaceRequest();
        sorOrderPlaceRequest.symbol("BNBUSDT");
        sorOrderPlaceRequest.side(Side.BUY);
        sorOrderPlaceRequest.type(OrderType.MARKET);
        sorOrderPlaceRequest.quantity(1d);
        CompletableFuture<SorOrderPlaceResponse> future =
                getApi().sorOrderPlace(sorOrderPlaceRequest);
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
     * Place new order using SOR (TRADE)
     *
     * <p>Places an order using smart order routing (SOR). This adds 1 order to the
     * &#x60;EXCHANGE_MAX_ORDERS&#x60; filter and the &#x60;MAX_NUM_ORDERS&#x60; filter. Read [SOR
     * FAQ](/products/spot/faqs/sor_faq) to learn more. Weight(IP): 1 Unfilled Order Count: 1
     * Security Type: TRADE Notes: **Data Source:** Matching Engine **Note:**
     * &#x60;sor.order.place&#x60; only supports &#x60;LIMIT&#x60; and &#x60;MARKET&#x60; orders.
     * &#x60;quoteOrderQty&#x60; is not supported.
     */
    public void sorOrderPlaceExampleSync() {
        SorOrderPlaceRequest sorOrderPlaceRequest = new SorOrderPlaceRequest();
        sorOrderPlaceRequest.symbol("BNBUSDT");
        sorOrderPlaceRequest.side(Side.BUY);
        sorOrderPlaceRequest.type(OrderType.MARKET);
        sorOrderPlaceRequest.quantity(1d);
        CompletableFuture<SorOrderPlaceResponse> future =
                getApi().sorOrderPlace(sorOrderPlaceRequest);
        SorOrderPlaceResponse response = future.join();
        System.out.println(response);
    }
}
