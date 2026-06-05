package com.binance.connector.client.spot.websocket.api.userdatastream;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.StreamResponse;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamEventsResponse;
import com.binance.connector.client.spot.websocket.api.model.UserDataStreamSubscribeResponse;

/** API examples for UserDataStreamApi */
public class UserDataStreamSubscribeExample {
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
     * WebSocket Subscribe to User Data Stream
     *
     * <p>Subscribe to the User Data Stream in the current WebSocket connection. Weight: 2
     */
    public void userDataStreamSubscribeExampleStream() throws InterruptedException {
        StreamResponse<UserDataStreamSubscribeResponse, UserDataStreamEventsResponse> resp =
                getApi().userDataStreamSubscribe();
        resp.getResponse()
                .thenAccept(
                        responseResult -> {
                            System.out.println(responseResult);
                        });
        StreamBlockingQueueWrapper<UserDataStreamEventsResponse> stream = resp.getStream();
        while (true) {
            System.out.println(stream.take().getActualInstance());
        }
    }
}
