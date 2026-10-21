package com.binance.connector.client.w3w_prediction.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.W3WPredictionWebSocketStreamsUtil;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.W3WPredictionWebSocketStreams;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketSellOrderFullyFilledResponse;

/** API examples for DefaultApi */
public class MarketSellOrderFullyFilledExample {
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
     * Market sell order fully filled
     *
     * <p>Pushed when the user&#39;s **market sell order** is fully filled. Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void marketSellOrderFullyFilledExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<MarketSellOrderFullyFilledResponse> response =
                getApi().marketSellOrderFullyFilled();
        while (true) {
            System.out.println(response.take());
        }
    }
}
