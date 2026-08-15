package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.DerivativesTradingCoinFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.api.DerivativesTradingCoinFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContractInfoStreamRequest;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model.ContractInfoStreamResponse;

/** API examples for DefaultApi */
public class ContractInfoStreamExample {
    private DerivativesTradingCoinFuturesWebSocketStreams api;

    public DerivativesTradingCoinFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingCoinFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Contract Info Stream
     *
     * <p>ContractInfo stream pushes when contract info updates(listing/settlement/contract bracket
     * update). bks field only shows up when bracket gets updated. &gt; **After CM migration**, this
     * stream pushes the merged UM + CM universe (subscribable on both &#x60;fstream&#x60; and
     * &#x60;dstream&#x60;); each payload is appended with a new &#x60;st&#x60; field (&#x60;1&#x60;
     * &#x3D; UM, &#x60;2&#x60; &#x3D; CM). Update Speed: Real-time
     *
     * @throws ApiException if the Api call fails
     */
    public void contractInfoStreamExample() throws ApiException, InterruptedException {
        ContractInfoStreamRequest contractInfoStreamRequest = new ContractInfoStreamRequest();
        StreamBlockingQueueWrapper<ContractInfoStreamResponse> response =
                getApi().contractInfoStream(contractInfoStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
