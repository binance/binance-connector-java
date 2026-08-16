package com.binance.connector.client.spot.websocket.api.account;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusRequest;
import com.binance.connector.client.spot.websocket.api.model.OpenOrdersStatusResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for AccountApi */
public class OpenOrdersStatusExample {
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
     * Current open orders (USER_DATA)
     *
     * <p>Query execution status of all open orders. If you need to continuously monitor order
     * status updates, please consider using WebSocket Streams: *
     * &#x60;userDataStream.subscribe&#x60; if on an authenticated session *
     * &#x60;userDataStream.subscribe.signature&#x60; if subscribing through signature subscription
     * Weight: | Parameter | Weight | | --------- | ------ | | &#x60;symbol&#x60; | 6 | | none | 80
     * | Security Type: USER_DATA Notes: Data Source: Memory &#x3D;&gt; Database
     */
    public void openOrdersStatusExampleAsync() {
        OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest();
        CompletableFuture<OpenOrdersStatusResponse> future =
                getApi().openOrdersStatus(openOrdersStatusRequest);
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
     * Current open orders (USER_DATA)
     *
     * <p>Query execution status of all open orders. If you need to continuously monitor order
     * status updates, please consider using WebSocket Streams: *
     * &#x60;userDataStream.subscribe&#x60; if on an authenticated session *
     * &#x60;userDataStream.subscribe.signature&#x60; if subscribing through signature subscription
     * Weight: | Parameter | Weight | | --------- | ------ | | &#x60;symbol&#x60; | 6 | | none | 80
     * | Security Type: USER_DATA Notes: Data Source: Memory &#x3D;&gt; Database
     */
    public void openOrdersStatusExampleSync() {
        OpenOrdersStatusRequest openOrdersStatusRequest = new OpenOrdersStatusRequest();
        CompletableFuture<OpenOrdersStatusResponse> future =
                getApi().openOrdersStatus(openOrdersStatusRequest);
        OpenOrdersStatusResponse response = future.join();
        System.out.println(response);
    }
}
