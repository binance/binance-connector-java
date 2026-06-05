package com.binance.connector.client.spot.websocket.api.userdatastream;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamUnsubscribeRequest;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamUnsubscribeResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for UserDataStreamApi */
public class UserDataStreamUnsubscribeExample {
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
     * WebSocket Unsubscribe from User Data Stream
     *
     * <p>Stop listening to the User Data Stream in the current WebSocket connection. Note that
     * &#x60;session.logout&#x60; will only close the subscription created with
     * &#x60;userDataStream.subscribe&#x60; but not subscriptions opened with
     * &#x60;userDataStream.subscribe.signature&#x60;. Weight: 2
     */
    public void userDataStreamUnsubscribeExampleAsync() {
        UserDataStreamUnsubscribeRequest userDataStreamUnsubscribeRequest =
                new UserDataStreamUnsubscribeRequest();
        CompletableFuture<UserDataStreamUnsubscribeResponse> future =
                getApi().userDataStreamUnsubscribe(userDataStreamUnsubscribeRequest);
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
     * WebSocket Unsubscribe from User Data Stream
     *
     * <p>Stop listening to the User Data Stream in the current WebSocket connection. Note that
     * &#x60;session.logout&#x60; will only close the subscription created with
     * &#x60;userDataStream.subscribe&#x60; but not subscriptions opened with
     * &#x60;userDataStream.subscribe.signature&#x60;. Weight: 2
     */
    public void userDataStreamUnsubscribeExampleSync() {
        UserDataStreamUnsubscribeRequest userDataStreamUnsubscribeRequest =
                new UserDataStreamUnsubscribeRequest();
        CompletableFuture<UserDataStreamUnsubscribeResponse> future =
                getApi().userDataStreamUnsubscribe(userDataStreamUnsubscribeRequest);
        UserDataStreamUnsubscribeResponse response = future.join();
        System.out.println(response);
    }
}
