package com.binance.connector.client.w3w_prediction.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.W3WPredictionWebSocketStreamsUtil;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.W3WPredictionWebSocketStreams;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.LimitOrderPartiallyFilledResponse;

/** API examples for DefaultApi */
public class LimitOrderPartiallyFilledExample {
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
     * Limit order partially filled
     *
     * <p>Pushed on each new partial fill of a **limit order**. One order can be pushed several
     * times, so always remove duplicates by &#x60;pushId&#x60;. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void limitOrderPartiallyFilledExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<LimitOrderPartiallyFilledResponse> response =
                getApi().limitOrderPartiallyFilled();
        while (true) {
            System.out.println(response.take());
        }
    }
}
