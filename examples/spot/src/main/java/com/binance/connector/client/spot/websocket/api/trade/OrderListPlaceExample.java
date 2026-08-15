package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceResponse;
import com.binance.connector.client.spot.websocket.api.model.Side;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderListPlaceExample {
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
     * Place new OCO - Deprecated (TRADE)
     *
     * <p>Send in a new one-cancels-the-other (OCO) pair: &#x60;LIMIT_MAKER&#x60; +
     * &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; orders (called *legs*), where activation of
     * one order immediately cancels the other. This adds 1 order to &#x60;EXCHANGE_MAX_ORDERS&#x60;
     * filter and the &#x60;MAX_NUM_ORDERS&#x60; filter Weight(IP): 1 Unfilled Order Count: 1
     * Security Type: TRADE Notes: **Data Source:** Matching Engine Notes: *
     * &#x60;listClientOrderId&#x60; parameter specifies &#x60;listClientOrderId&#x60; for the OCO
     * pair. A new OCO with the same &#x60;listClientOrderId&#x60; is accepted only when the
     * previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from
     * &#x60;clientOrderId&#x60; of individual orders. * &#x60;limitClientOrderId&#x60; and
     * &#x60;stopClientOrderId&#x60; specify &#x60;clientOrderId&#x60; values for both legs of the
     * OCO. A new order with the same &#x60;clientOrderId&#x60; is accepted only when the previous
     * one is filled or expired. * Price restrictions on the legs: | &#x60;side&#x60; | Price
     * relation | | ------ | -------------- | | &#x60;BUY&#x60; | &#x60;price&#x60; &lt; market
     * price &lt; &#x60;stopPrice&#x60; | | &#x60;SELL&#x60; | &#x60;price&#x60; &gt; market price
     * &gt; &#x60;stopPrice&#x60; | * Both legs have the same &#x60;quantity&#x60;. However, you can
     * set different iceberg quantity for individual legs. If &#x60;stopIcebergQty&#x60; is used,
     * &#x60;stopLimitTimeInForce&#x60; must be &#x60;GTC&#x60;. * &#x60;trailingDelta&#x60; applies
     * only to the &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; leg of the OCO.
     */
    public void orderListPlaceExampleAsync() {
        OrderListPlaceRequest orderListPlaceRequest = new OrderListPlaceRequest();
        orderListPlaceRequest.symbol("BNBUSDT");
        orderListPlaceRequest.side(Side.BUY);
        orderListPlaceRequest.price(1d);
        orderListPlaceRequest.quantity(1d);
        CompletableFuture<OrderListPlaceResponse> future =
                getApi().orderListPlace(orderListPlaceRequest);
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
     * Place new OCO - Deprecated (TRADE)
     *
     * <p>Send in a new one-cancels-the-other (OCO) pair: &#x60;LIMIT_MAKER&#x60; +
     * &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; orders (called *legs*), where activation of
     * one order immediately cancels the other. This adds 1 order to &#x60;EXCHANGE_MAX_ORDERS&#x60;
     * filter and the &#x60;MAX_NUM_ORDERS&#x60; filter Weight(IP): 1 Unfilled Order Count: 1
     * Security Type: TRADE Notes: **Data Source:** Matching Engine Notes: *
     * &#x60;listClientOrderId&#x60; parameter specifies &#x60;listClientOrderId&#x60; for the OCO
     * pair. A new OCO with the same &#x60;listClientOrderId&#x60; is accepted only when the
     * previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from
     * &#x60;clientOrderId&#x60; of individual orders. * &#x60;limitClientOrderId&#x60; and
     * &#x60;stopClientOrderId&#x60; specify &#x60;clientOrderId&#x60; values for both legs of the
     * OCO. A new order with the same &#x60;clientOrderId&#x60; is accepted only when the previous
     * one is filled or expired. * Price restrictions on the legs: | &#x60;side&#x60; | Price
     * relation | | ------ | -------------- | | &#x60;BUY&#x60; | &#x60;price&#x60; &lt; market
     * price &lt; &#x60;stopPrice&#x60; | | &#x60;SELL&#x60; | &#x60;price&#x60; &gt; market price
     * &gt; &#x60;stopPrice&#x60; | * Both legs have the same &#x60;quantity&#x60;. However, you can
     * set different iceberg quantity for individual legs. If &#x60;stopIcebergQty&#x60; is used,
     * &#x60;stopLimitTimeInForce&#x60; must be &#x60;GTC&#x60;. * &#x60;trailingDelta&#x60; applies
     * only to the &#x60;STOP_LOSS&#x60;/&#x60;STOP_LOSS_LIMIT&#x60; leg of the OCO.
     */
    public void orderListPlaceExampleSync() {
        OrderListPlaceRequest orderListPlaceRequest = new OrderListPlaceRequest();
        orderListPlaceRequest.symbol("BNBUSDT");
        orderListPlaceRequest.side(Side.BUY);
        orderListPlaceRequest.price(1d);
        orderListPlaceRequest.quantity(1d);
        CompletableFuture<OrderListPlaceResponse> future =
                getApi().orderListPlace(orderListPlaceRequest);
        OrderListPlaceResponse response = future.join();
        System.out.println(response);
    }
}
