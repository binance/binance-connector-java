package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.MyTradesRequest;
import com.binance.connector.client.spot.websocket.api.model.MyTradesResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class MyTradesExample {
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
     * Account trade history (USER_DATA)
     *
     * <p>Query information about all your trades, filtered by time range. Weight: Condition|
     * Weight| ---| --- |Without orderId|20| |With orderId|5| Security Type: USER_DATA Notes: Data
     * Source: Memory &#x3D;&gt; Database Notes: - If &#x60;fromId&#x60; is specified, return trades
     * with trade ID &gt;&#x3D; &#x60;fromId&#x60;. - If &#x60;startTime&#x60; and/or
     * &#x60;endTime&#x60; are specified, trades are filtered by execution time (&#x60;time&#x60;).
     * - &#x60;fromId&#x60; cannot be used together with &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;. - If &#x60;orderId&#x60; is specified, only trades related to that order
     * are returned. - &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be used together with
     * &#x60;orderId&#x60;. - If no condition is specified, the most recent trades are returned. -
     * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24
     * hours.
     */
    public void myTradesExampleAsync() {
        MyTradesRequest myTradesRequest = new MyTradesRequest();
        myTradesRequest.symbol("BNBUSDT");
        CompletableFuture<MyTradesResponse> future = getApi().myTrades(myTradesRequest);
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
     * Account trade history (USER_DATA)
     *
     * <p>Query information about all your trades, filtered by time range. Weight: Condition|
     * Weight| ---| --- |Without orderId|20| |With orderId|5| Security Type: USER_DATA Notes: Data
     * Source: Memory &#x3D;&gt; Database Notes: - If &#x60;fromId&#x60; is specified, return trades
     * with trade ID &gt;&#x3D; &#x60;fromId&#x60;. - If &#x60;startTime&#x60; and/or
     * &#x60;endTime&#x60; are specified, trades are filtered by execution time (&#x60;time&#x60;).
     * - &#x60;fromId&#x60; cannot be used together with &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;. - If &#x60;orderId&#x60; is specified, only trades related to that order
     * are returned. - &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be used together with
     * &#x60;orderId&#x60;. - If no condition is specified, the most recent trades are returned. -
     * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; can&#39;t be longer than 24
     * hours.
     */
    public void myTradesExampleSync() {
        MyTradesRequest myTradesRequest = new MyTradesRequest();
        myTradesRequest.symbol("BNBUSDT");
        CompletableFuture<MyTradesResponse> future = getApi().myTrades(myTradesRequest);
        MyTradesResponse response = future.join();
        System.out.println(response);
    }
}
