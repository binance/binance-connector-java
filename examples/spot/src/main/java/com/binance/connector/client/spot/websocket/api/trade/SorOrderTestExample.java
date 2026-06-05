package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderType;
import com.binance.connector.client.spot.websocket.api.model.Side;
import com.binance.connector.client.spot.websocket.api.model.SorOrderTestRequest;
import com.binance.connector.client.spot.websocket.api.model.SorOrderTestResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class SorOrderTestExample {
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
     * WebSocket Test new order using SOR
     *
     * <p>Test new order creation and signature/recvWindow using smart order routing (SOR). Creates
     * and validates a new order but does not send it into the matching engine. Weight: |Condition |
     * Request Weight| |------------ | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1
     * | |With &#x60;computeCommissionRates&#x60; |20 |
     */
    public void sorOrderTestExampleAsync() {
        SorOrderTestRequest sorOrderTestRequest = new SorOrderTestRequest();
        sorOrderTestRequest.symbol("BNBUSDT");
        sorOrderTestRequest.side(Side.BUY);
        sorOrderTestRequest.type(OrderType.MARKET);
        sorOrderTestRequest.quantity(1.0d);
        CompletableFuture<SorOrderTestResponse> future = getApi().sorOrderTest(sorOrderTestRequest);
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
     * WebSocket Test new order using SOR
     *
     * <p>Test new order creation and signature/recvWindow using smart order routing (SOR). Creates
     * and validates a new order but does not send it into the matching engine. Weight: |Condition |
     * Request Weight| |------------ | ------------ | |Without &#x60;computeCommissionRates&#x60;| 1
     * | |With &#x60;computeCommissionRates&#x60; |20 |
     */
    public void sorOrderTestExampleSync() {
        SorOrderTestRequest sorOrderTestRequest = new SorOrderTestRequest();
        sorOrderTestRequest.symbol("BNBUSDT");
        sorOrderTestRequest.side(Side.BUY);
        sorOrderTestRequest.type(OrderType.MARKET);
        sorOrderTestRequest.quantity(1.0d);
        CompletableFuture<SorOrderTestResponse> future = getApi().sorOrderTest(sorOrderTestRequest);
        SorOrderTestResponse response = future.join();
        System.out.println(response);
    }
}
