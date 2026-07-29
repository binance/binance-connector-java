package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.AllTokens24hTickerStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.AllTokens24hTickerStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class AllTokens24hTickerStreamExample {
    private AlphaWebSocketStreams api;

    public AlphaWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    AlphaWebSocketStreamsUtil.getClientConfiguration();
            api = new AlphaWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * All Tokens 24h Ticker Stream
     *
     * <p>Pushes 24h ticker-like metrics for all tokens.
     *
     * @throws ApiException if the Api call fails
     */
    public void allTokens24hTickerStreamExample() throws ApiException, InterruptedException {
        AllTokens24hTickerStreamRequest allTokens24hTickerStreamRequest =
                new AllTokens24hTickerStreamRequest();
        StreamBlockingQueueWrapper<AllTokens24hTickerStreamResponse> response =
                getApi().allTokens24hTickerStream(allTokens24hTickerStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
