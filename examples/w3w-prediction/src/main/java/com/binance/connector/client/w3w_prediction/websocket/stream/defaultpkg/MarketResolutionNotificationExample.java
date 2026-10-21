package com.binance.connector.client.w3w_prediction.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.W3WPredictionWebSocketStreamsUtil;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.W3WPredictionWebSocketStreams;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketResolutionNotificationResponse;

/** API examples for DefaultApi */
public class MarketResolutionNotificationExample {
    private W3WPredictionWebSocketStreams api;

    public W3WPredictionWebSocketStreams getApi() {
        if (api == null) {
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            WebSocketClientConfiguration clientConfiguration =
                    W3WPredictionWebSocketStreamsUtil.getClientConfiguration(
                            signatureConfiguration);
            api = new W3WPredictionWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Market resolution notification
     *
     * <p>Pushed when a market is resolved, to every user holding a position in it, win or lose. No
     * amount or outcome is included — call the REST API for the user&#39;s profit and loss. Update
     * Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void marketResolutionNotificationExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<MarketResolutionNotificationResponse> response =
                getApi().marketResolutionNotification();
        while (true) {
            System.out.println(response.take());
        }
    }
}
