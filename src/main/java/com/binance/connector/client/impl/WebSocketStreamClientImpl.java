package com.binance.connector.client.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestBuilder;
import com.binance.connector.client.utils.UrlBuilder;
import com.binance.connector.client.utils.WebSocketConnection;
import com.binance.connector.client.utils.httpclient.WebSocketStreamHttpClientSingleton;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * <h2>WebSocket Streams</h2>
 * All stream endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams">WebSocket Market Streams</a> and
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#user-data-streams">User Data Streams</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketStreamClientImpl implements WebSocketStreamClient {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketStreamClientImpl.class);
    private static final OkHttpClient client = WebSocketStreamHttpClientSingleton.getHttpClient();
    private final String baseUrl;
    private final Map<Integer, WebSocketConnection> connections = new HashMap<>();
    private final WebSocketOpenCallback noopOpenCallback = response -> { };
    private final WebSocketClosingCallback noopClosingCallback = (code, reason) -> { };
    private final WebSocketClosedCallback noopClosedCallback = (code, reason) -> { };
    private final WebSocketFailureCallback noopFailureCallback = (throwable, response) -> { };

    public WebSocketStreamClientImpl() {
        this.baseUrl = DefaultUrls.WS_URL;
    }

    public WebSocketStreamClientImpl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * The Aggregate Trade Streams push trade information that is aggregated for a single taker order.
     * <br><br>
     * &lt;symbol&gt;@aggTrade
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#aggregate-trade-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#aggregate-trade-streams</a>
     */
    @Override
    public int aggTradeStream(String symbol, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return aggTradeStream(symbol.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #aggTradeStream(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int aggTradeStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@aggTrade", baseUrl, symbol.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * The Trade Streams push raw trade information; each trade has a unique buyer and seller.
     * <br><br>
     * &lt;symbol&gt;@trade
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#trade-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#trade-streams</a>
     */
    @Override
    public int tradeStream(String symbol, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return tradeStream(symbol.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #tradeStream(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int tradeStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@trade", baseUrl, symbol.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * The Kline/Candlestick Stream push updates to the current klines/candlestick every second.
     * <br><br>
     * &lt;symbol&gt;@kline_&lt;interval&gt;
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @param interval Time interval for kline/candlestick
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-streams</a>
     */
    @Override
    public int klineStream(String symbol, String interval, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return klineStream(symbol.toLowerCase(), interval, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #klineStream(String, String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param interval Time interval for kline/candlestick
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int klineStream(String symbol, String interval, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@kline_%s", baseUrl, symbol.toLowerCase(), interval));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * 24hr rolling window mini-ticker statistics.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * <br><br>
     * &lt;symbol&gt;@miniTicker
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-mini-ticker-stream">
     * https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-mini-ticker-stream</a>
     */
    @Override
    public int miniTickerStream(String symbol, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return miniTickerStream(symbol.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #miniTickerStream(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int miniTickerStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@miniTicker", baseUrl, symbol.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * 24hr rolling window mini-ticker statistics for all symbols that changed in an array.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * Note that only tickers that have changed will be present in the array.
     * <br><br>
     * !miniTicker@arr
     * <br><br>
     * Update Speed: Real-time
     *
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-market-mini-tickers-stream">
     * https://binance-docs.github.io/apidocs/spot/en/#all-market-mini-tickers-stream</a>
     */
    @Override
    public int allMiniTickerStream(WebSocketMessageCallback callback) {
        return allMiniTickerStream(noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #allMiniTickerStream(WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int allMiniTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/!miniTicker@arr", baseUrl));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * 24hr rolling window ticker statistics for a single symbol.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * <br><br>
     * &lt;symbol&gt;@ticker
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-ticker-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-ticker-streams</a>
     */
    @Override
    public int symbolTicker(String symbol, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return symbolTicker(symbol.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #symbolTicker(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int symbolTicker(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@ticker", baseUrl, symbol.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * 24hr rolling window ticker statistics for all symbols that changed in an array.
     * These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.
     * Note that only tickers that have changed will be present in the array.
     * <br><br>
     * !ticker@arr
     * <br><br>
     * Update Speed: Real-time
     *
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-market-tickers-stream">
     * https://binance-docs.github.io/apidocs/spot/en/#all-market-tickers-stream</a>
     */
    @Override
    public int allTickerStream(WebSocketMessageCallback callback) {
        return allTickerStream(noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #allTickerStream(WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int allTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/!ticker@arr", baseUrl));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Rolling window ticker statistics for a single symbol, computed over multiple windows.
     * <br><br>
     * &lt;symbol&gt;@ticker_&lt;window_size&gt;
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @param windowSize Window Sizes: 1h,4h
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-rolling-window-statistics-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-rolling-window-statistics-streams</a>
     */
    public int rollingWindowTicker(String symbol, String windowSize, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(symbol, String.class, "windowSize");
        ArrayList<String> allowedWindowSize = new ArrayList<String>() {{
                add("1h");
                add("4h");
            }};
        if (!allowedWindowSize.contains(windowSize)) {
            throw new BinanceConnectorException(String.format("\"%s\" is not a valid window size.", windowSize));
        }
        return rollingWindowTicker(symbol.toLowerCase(), windowSize, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #rollingWindowTicker(String, String, WebSocketMessageCallback)} (String, WebSocketCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int rollingWindowTicker(String symbol, String windowSize, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(symbol, String.class, "windowSize");
        ArrayList<String> allowedWindowSize = new ArrayList<String>() {{
                add("1h");
                add("4h");
            }};
        if (!allowedWindowSize.contains(windowSize)) {
            throw new BinanceConnectorException(String.format("\"%s\" is not a valid window size.", windowSize));
        }
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@ticker_%s", baseUrl, symbol.toLowerCase(), windowSize));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Rolling window ticker statistics for all market symbols, computed over multiple windows.
     * Note that only tickers that have changed will be present in the array.
     * <br><br>
     * !ticker_&lt;window-size&gt;@arr
     * <br><br>
     * Update Speed: Real-time
     *
     * @param windowSize Window Sizes: 1h,4h
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-market-rolling-window-statistics-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#all-market-rolling-window-statistics-streams</a>
     */
    @Override
    public int allRollingWindowTicker(String windowSize, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(windowSize, String.class, "windowSize");
        ArrayList<String> allowedWindowSize = new ArrayList<String>() {{
                add("1h");
                add("4h");
            }};
        if (!allowedWindowSize.contains(windowSize.toLowerCase())) {
            throw new BinanceConnectorException(String.format("\"%s\" is not a valid window size.", windowSize.toLowerCase()));
        }
        return allRollingWindowTicker(windowSize.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #allRollingWindowTicker(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param windowSize Window Sizes: 1h,4h
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int allRollingWindowTicker(String windowSize, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(windowSize, String.class, "windowSize");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/!ticker_%s@arr", baseUrl, windowSize.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Pushes any update to the best bid or ask's price or quantity in real-time for a specified symbol.
     * <br><br>
     * &lt;symbol&gt;@bookTicker
     * <br><br>
     * Update Speed: Real-time
     *
     * @param symbol Name of the trading pair
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-book-ticker-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#individual-symbol-book-ticker-streams</a>
     */
    @Override
    public int bookTicker(String symbol, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return bookTicker(symbol.toLowerCase(), noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #bookTicker(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int bookTicker(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@bookTicker", baseUrl, symbol.toLowerCase()));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Pushes any update to the best bid or ask's price or quantity in real-time for all symbols.
     * <br><br>
     * !bookTicker
     * <br><br>
     * Update Speed: Real-time
     *
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-book-tickers-stream">
     * https://binance-docs.github.io/apidocs/spot/en/#all-book-tickers-stream</a>
     */
    @Override
    public int allBookTickerStream(WebSocketMessageCallback callback) {
        return allBookTickerStream(noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #allBookTickerStream(WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int allBookTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/!bookTicker", baseUrl));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Top bids and asks, Valid are 5, 10, or 20.
     * <br><br>
     * &lt;symbol&gt;@depth&lt;levels&gt;@&lt;speed&gt;ms
     * <br><br>
     * Update Speed: 1000ms or 100ms
     *
     * @param symbol Name of the trading pair
     * @param levels Valid are 5, 10, or 20
     * @param speed  1000ms or 100ms
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#partial-book-depth-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#partial-book-depth-streams</a>
     */
    @Override
    public int partialDepthStream(String symbol, int levels, int speed, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return partialDepthStream(symbol.toLowerCase(), levels, speed, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #partialDepthStream(String, int, int, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param levels Valid are 5, 10, or 20
     * @param speed  1000ms or 100ms
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int partialDepthStream(String symbol, int levels, int speed, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@depth%s@%sms", baseUrl, symbol.toLowerCase(), levels, speed));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Order book price and quantity depth updates used to locally manage an order book.
     * <br><br>
     * &lt;symbol&gt;@depth@&lt;speed&gt;ms
     * <br><br>
     * Update Speed: 1000ms or 100ms
     *
     * @param symbol Name of the trading pair
     * @param speed  1000ms or 100ms
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#diff-depth-stream">
     * https://binance-docs.github.io/apidocs/spot/en/#diff-depth-stream</a>
     */
    @Override
    public int diffDepthStream(String symbol, int speed, WebSocketMessageCallback callback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        return diffDepthStream(symbol.toLowerCase(), speed, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #diffDepthStream(String, int, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param symbol Name of the trading pair
     * @param speed  1000ms or 100ms
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int diffDepthStream(String symbol, int speed, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s@depth@%sms", baseUrl, symbol.toLowerCase(), speed));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * User Data Streams are accessed at /ws/&lt;listenKey&gt;
     *
     * @param listenKey listen key obtained from this
     *                  <a href="https://binance-docs.github.io/apidocs/spot/en/#listen-key-spot">endpoint</a>
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#user-data-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#user-data-streams</a>
     */
    @Override
    public int listenUserStream(String listenKey, WebSocketMessageCallback callback) {
        return listenUserStream(listenKey, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #listenUserStream(String, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param listenKey listen key obtained from this
     *                  <a href="https://binance-docs.github.io/apidocs/spot/en/#listen-key-spot">endpoint</a>
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int listenUserStream(String listenKey, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(String.format("%s/ws/%s", baseUrl, listenKey));
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Combined streams are accessed at /stream?streams=&lt;streamName1&gt;/&lt;streamName2&gt;/&lt;streamName3&gt;
     *
     * @param streams ArrayList of stream names to be combined <br>
     * @return int - Connection ID
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams">
     * https://binance-docs.github.io/apidocs/spot/en/#websocket-market-streams</a>
     */
    @Override
    public int combineStreams(ArrayList<String> streams, WebSocketMessageCallback callback) {
        return combineStreams(streams, noopOpenCallback, callback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    /**
     * Same as {@link #combineStreams(ArrayList, WebSocketMessageCallback)} plus accepts callbacks for all major websocket connection events.
     *
     * @param streams ArrayList of stream names to be combined <br>
     * @param onOpenCallback Callback for when the websocket connection is opened
     * @param onMessageCallback Callback for when a message is received
     * @param onClosingCallback Callback for when the websocket connection is closing
     * @param onFailureCallback Callback for when an error occurs
     * @return int - Connection ID
     */
    @Override
    public int combineStreams(ArrayList<String> streams, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        String url = UrlBuilder.buildStreamUrl(baseUrl, streams);
        Request request = RequestBuilder.buildWebSocketRequest(url);
        return createConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request);
    }

    /**
     * Closes a specific stream based on stream ID.
     *
     * @param connectionId The connection ID to close.
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
            client.dispatcher().executorService().shutdown();
            logger.info("All connections are closed!");
        }
    }

    private int createConnection(
            WebSocketOpenCallback onOpenCallback,
            WebSocketMessageCallback onMessageCallback,
            WebSocketClosingCallback onClosingCallback,
            WebSocketClosedCallback onClosedCallback,
            WebSocketFailureCallback onFailureCallback,
            Request request
    ) {
        WebSocketConnection connection = new WebSocketConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request, client);
        connection.connect();
        int connectionId = connection.getConnectionId();
        connections.put(connectionId, connection);
        return connectionId;
    }
}
