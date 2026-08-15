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
     * Subscribe to User Data Stream
     *
     * <p>Subscribe to the User Data Stream in the current WebSocket connection. **Notes:** - This
     * method requires an authenticated WebSocket connection using Ed25519 keys. Please refer to
     * [&#x60;session.logon&#x60;](/catalog/core-trading-spot-trading/api/ws-api/auth#session-logon).
     * - To check the subscription status, use
     * [&#x60;session.status&#x60;](/catalog/core-trading-spot-trading/api/ws-api/auth#session-status),
     * see the &#x60;userDataStream&#x60; flag indicating you have have an active subscription. -
     * User Data Stream events are available in both JSON and [SBE](/products/spot/faqs/sbe_faq)
     * sessions. - Please refer to [User Data Streams](/products/spot/user-data-stream) for the
     * event format details. - For SBE, only SBE schema 2:1 or later is supported. Weight(IP): 2
     * Security Type: NONE
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
