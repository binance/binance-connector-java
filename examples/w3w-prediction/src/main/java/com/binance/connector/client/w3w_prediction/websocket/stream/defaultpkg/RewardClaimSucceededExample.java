package com.binance.connector.client.w3w_prediction.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.W3WPredictionWebSocketStreamsUtil;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.W3WPredictionWebSocketStreams;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.RewardClaimSucceededResponse;

/** API examples for DefaultApi */
public class RewardClaimSucceededExample {
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
     * Reward claim succeeded
     *
     * <p>Pushed when a claim fully succeeds — a single claim, or every item of a batch. Only the
     * total is reported; no market title or outcome is included. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void rewardClaimSucceededExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<RewardClaimSucceededResponse> response =
                getApi().rewardClaimSucceeded();
        while (true) {
            System.out.println(response.take());
        }
    }
}
