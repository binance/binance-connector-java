package com.binance.connector.client.alpha.websocket.stream.defaultpkg;

import com.binance.connector.client.alpha.websocket.stream.AlphaWebSocketStreamsUtil;
import com.binance.connector.client.alpha.websocket.stream.api.AlphaWebSocketStreams;
import com.binance.connector.client.alpha.websocket.stream.model.ContractKlineStreamRequest;
import com.binance.connector.client.alpha.websocket.stream.model.ContractKlineStreamResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class ContractKlineStreamExample {
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
     * Contract Kline Stream
     *
     * <p>Pushes kline updates by contractAddress@chainId.
     *
     * @throws ApiException if the Api call fails
     */
    public void contractKlineStreamExample() throws ApiException, InterruptedException {
        ContractKlineStreamRequest contractKlineStreamRequest = new ContractKlineStreamRequest();
        StreamBlockingQueueWrapper<ContractKlineStreamResponse> response =
                getApi().contractKlineStream(contractKlineStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
