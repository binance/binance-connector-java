package com.binance.connector.client.impl;

import com.binance.connector.client.WebsocketClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.utils.HttpClientSingleton;
import com.binance.connector.client.utils.RequestBuilder;
import com.binance.connector.client.utils.UrlBuilder;
import com.binance.connector.client.utils.WebSocketCallback;
import com.binance.connector.client.utils.WebSocketConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <h2>Websocket Streams</h2>
 * All stream endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams">Websocket Market Streams</a> and
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#user-data-streams">User Data Streams</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebsocketClientImpl implements WebsocketClient {
    private final String baseUrl;
    private final Map<Integer, WebSocketConnection> connections = new HashMap<>();
    private static final Logger logger = LoggerFactory.getLogger(WebsocketClientImpl.class);

    public WebsocketClientImpl() {
        this.baseUrl = DefaultUrls.WS_URL;
    }

    public WebsocketClientImpl(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    /**
     * The Aggregate Trade Streams push trade information that is aggregated for a single taker order.
     * <br><br>
     * &lt;symbol&gt;@aggTrade
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#aggregate-trade-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#aggregate-trade-streams</a>
     */
    @Override
    public int aggTradeStream(String symbol, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@aggTrade", baseUrl, symbol));
        return createConnection(callback, request);
    }

    /**
     * The Trade Streams push raw trade information; each trade has a unique buyer and seller.
     * <br><br>
     * &lt;symbol&gt;@trade
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#trade-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#trade-streams</a>
     */
    @Override
    public int tradeStream(String symbol, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@trade", baseUrl, symbol));
        return createConnection(callback, request);
    }

    /**
     * The Kline/Candlestick Stream push updates to the current klines/candlestick every second.
     * <br><br>
     * &lt;symbol&gt;@kline_&lt;interval&gt;
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-streams</a>
     */
    @Override
    public int klineStream(String symbol, String interval, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@kline_%s", baseUrl, symbol, interval));
        return createConnection(callback, request);
    }

    /**
     * 24hr rolling window mini-ticker statistics.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * <br><br>
     * &lt;symbol&gt;@miniTicker
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-mini-ticker-stream">
     *     https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-mini-ticker-stream</a>
     */
    @Override
    public int miniTickerStream(String symbol, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@miniTicker", baseUrl, symbol));
        return createConnection(callback, request);
    }

    /**
     * 24hr rolling window mini-ticker statistics for all symbols that changed in an array.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * Note that only tickers that have changed will be present in the array.
     * <br><br>
     * !miniTicker@arr
     * <br><br>
     * Update Speed: Real-time
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-market-mini-tickers-stream">
     *     https://binance-docs.github.io/apidocs/spot/en/#all-market-mini-tickers-stream</a>
     */
    @Override
    public int allMiniTickerStream(WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/!miniTicker@arr", baseUrl));
        return createConnection(callback, request);
    }

    /**
     * 24hr rolling window ticker statistics for a single symbol.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * <br><br>
     * &lt;symbol&gt;@ticker
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-ticker-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-ticker-streams</a>
     */
    @Override
    public int symbolTicker(String symbol, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@ticker", baseUrl, symbol));
        return createConnection(callback, request);
    }

    /**
     * 24hr rolling window ticker statistics for all symbols that changed in an array.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * Note that only tickers that have changed will be present in the array.
     * <br><br>
     * !ticker@arr
     * <br><br>
     * Update Speed: Real-time
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-market-tickers-stream">
     *     https://binance-docs.github.io/apidocs/spot/en/#all-market-tickers-stream</a>
     */
    @Override
    public int allTickerStream(WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/!ticker@arr", baseUrl));
        return createConnection(callback, request);
    }

    /**
     * Pushes any update to the best bid or ask's price or quantity in real-time for a specified symbol.
     * <br><br>
     * &lt;symbol&gt;@bookTicker
     * <br><br>
     * Update Speed: Real-time
     * @param
     * symbol Name of trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-book-ticker-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-book-ticker-streams</a>
     */
    @Override
    public int bookTicker(String symbol, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@bookTicker", baseUrl, symbol));
        return createConnection(callback, request);
    }

    /**
     * Pushes any update to the best bid or ask's price or quantity in real-time for all symbols.
     * <br><br>
     * !bookTicker
     * <br><br>
     * Update Speed: Real-time
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-book-tickers-stream">
     *     https://binance-docs.github.io/apidocs/spot/en/#all-book-tickers-stream</a>
     */
    @Override
    public int allBookTickerStream(WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/!bookTicker", baseUrl));
        return createConnection(callback, request);
    }

    /**
     * Top bids and asks, Valid are 5, 10, or 20.
     * <br><br>
     * &lt;symbol&gt;@depth&lt;levels&gt;@&lt;speed&gt;ms
     * <br><br>
     * Update Speed: 1000ms or 100ms
     * @param
     * symbol Name of trading pair
     * @param
     * levels Valid are 5, 10, or 20
     * @param
     * speed 1000ms or 100ms
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#partial-book-depth-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#partial-book-depth-streams</a>
     */
    @Override
    public int partialDepthStream(String symbol, int levels, int speed, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@depth%s@%sms", baseUrl, symbol, levels, speed));
        return createConnection(callback, request);
    }

    /**
     * Order book price and quantity depth updates used to locally manage an order book.
     * <br><br>
     * &lt;symbol&gt;@depth@&lt;speed&gt;ms
     * <br><br>
     * Update Speed: 1000ms or 100ms
     * @param
     * symbol Name of trading pair
     * @param
     * speed 1000ms or 100ms
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#diff-depth-stream">
     *     https://binance-docs.github.io/apidocs/spot/en/#diff-depth-stream</a>
     */
    @Override
    public int diffDepthStream(String symbol, int speed, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s@depth@%sms", baseUrl, symbol, speed));
        return createConnection(callback, request);
    }

    /**
     * User Data Streams are accessed at /ws/&lt;listenKey&gt;
     * @param
     * listenKey listen key obtained from this
     *           <a href="https://binance-docs.github.io/apidocs/spot/en/#listen-key-spot">endpoint</a>
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#user-data-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#user-data-streams</a>
     */
    @Override
    public int listenUserStream(String listenKey, WebSocketCallback callback) {
        Request request = RequestBuilder.buildWebsocketRequest(String.format("%s/ws/%s", baseUrl, listenKey));
        return createConnection(callback, request);
    }

    /**
     * Combined streams are accessed at /stream?streams=&lt;streamName1&gt;/&lt;streamName2&gt;/&lt;streamName3&gt;
     * @param streams A list of stream names to be combined <br>
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams">
     *     https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams</a>
     */
    @Override
    public int combineStreams(ArrayList<String> streams, WebSocketCallback callback) {
        String url = UrlBuilder.buildStreamUrl(String.format("%s/stream", baseUrl), streams);
        Request request = RequestBuilder.buildWebsocketRequest(url);
        return createConnection(callback, request);
    }

    /**
     * Closes a specific stream based on stream Id.
     * @param connectionId
     */
    @Override
    public void closeConnection(int connectionId) {
        if (connections.containsKey(connectionId)) {
            connections.get(connectionId).close();
            logger.info("Closing Connection ID {}", connectionId);
            connections.remove(connectionId);
        } else {
            logger.info("Connection ID {} does not exist!", connectionId);
        }
    }

    /**
     * Closes all streams
     */
    @Override
    public void closeAllConnections() {
        if (!connections.isEmpty()) {
            logger.info("Closing {} connections(s)", connections.size());
            Iterator<Map.Entry<Integer, WebSocketConnection>> iter = connections.entrySet().iterator();
            while (iter.hasNext()) {
                WebSocketConnection connection = iter.next().getValue();
                connection.close();
                iter.remove();
            }
        }

        if (connections.isEmpty()) {
            HttpClientSingleton.getHttpClient().dispatcher().executorService().shutdown();
            logger.info("All connections are closed!");
        }
    }

    private int createConnection(WebSocketCallback callback, Request request) {
        WebSocketConnection connection = new WebSocketConnection(callback, request);
        connection.connect();
        int connectionId = connection.getConnectionId();
        connections.put(connectionId, connection);
        return connectionId;
    }
}
