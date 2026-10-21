package com.binance.connector.client.w3w_prediction.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.W3WPredictionWebSocketStreamsUtil;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.W3WPredictionWebSocketStreams;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.RewardClaimFailedResponse;

/** API examples for DefaultApi */
public class RewardClaimFailedExample {
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
     * Reward claim failed
     *
     * <p>Pushed when a claim fails completely — a single claim, or every item of a batch. For a
     * batch, only the first failed item&#39;s amount and outcome are included. Update Speed:
     * Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void rewardClaimFailedExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<RewardClaimFailedResponse> response =
                getApi().rewardClaimFailed();
        while (true) {
            System.out.println(response.take());
        }
    }
}
