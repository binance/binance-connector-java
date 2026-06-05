package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContractInfoStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.ContractInfoStreamResponse;

/** API examples for MarketApi */
public class ContractInfoStreamExample {
    private DerivativesTradingUsdsFuturesWebSocketStreams api;

    public DerivativesTradingUsdsFuturesWebSocketStreams getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketStreamsUtil.getClientConfiguration();
            api = new DerivativesTradingUsdsFuturesWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Contract Info Stream
     *
     * <p>ContractInfo stream pushes when contract info updates(listing/settlement/contract bracket
     * update). &#x60;bks&#x60; field only shows up when bracket gets updated. Update Speed:
     * Real-time
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
