package com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.market;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.DerivativesTradingUsdsFuturesWebSocketStreamsUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.api.DerivativesTradingUsdsFuturesWebSocketStreams;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.TradingSessionStreamRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.stream.model.TradingSessionStreamResponse;

/** API examples for MarketApi */
public class TradingSessionStreamExample {
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
     * Trading Session Stream
     *
     * <p>Trading session information for the underlying assets of TradFi Perpetual contracts,
     * covering the U.S. equity market, Korean equity market, Hong Kong equity market, and the
     * commodity market, is updated every second. Trading session information for different
     * underlying markets is pushed in separate messages. **Event type:** -
     * &#x60;EquityUpdate&#x60;: Session types for the U.S. equity market include
     * \&quot;PRE_MARKET\&quot;, \&quot;REGULAR\&quot;, \&quot;AFTER_MARKET\&quot;,
     * \&quot;OVERNIGHT\&quot;, and \&quot;NO_TRADING\&quot;. - &#x60;CommodityUpdate&#x60;: Session
     * types for the commodity market include \&quot;REGULAR\&quot; and \&quot;NO_TRADING\&quot;. -
     * &#x60;KR_EquityUpdate&#x60;: Session types for the Korean equity market include
     * \&quot;REGULAR\&quot; and \&quot;NO_TRADING\&quot;. - &#x60;HK_EquityUpdate&#x60;: Session
     * types for the Hong Kong equity market include \&quot;REGULAR\&quot; and
     * \&quot;NO_TRADING\&quot;. Update Speed: 1s
     *
     * @throws ApiException if the Api call fails
     */
    public void tradingSessionStreamExample() throws ApiException, InterruptedException {
        TradingSessionStreamRequest tradingSessionStreamRequest = new TradingSessionStreamRequest();
        StreamBlockingQueueWrapper<TradingSessionStreamResponse> response =
                getApi().tradingSessionStream(tradingSessionStreamRequest);
        while (true) {
            System.out.println(response.take());
        }
    }
}
