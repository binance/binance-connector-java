package com.binance.connector.client.impl.websocketapi;

import org.json.JSONObject;

import com.binance.connector.client.utils.JSONParser;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

/**
 * <h2>Market Requests</h2>
 * All requests under the
 * <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#market-data-requests">Market requests</a>
 * section of the WebSocket API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketApiMarket {
    private WebSocketApiRequestHandler handler;

    public WebSocketApiMarket(WebSocketApiRequestHandler handler) {
        this.handler = handler;
    }

    /**
     * Get current order book.<br>
     * 
     * Note that this request returns limited market depth.<br>
     * 
     * If you need to continuously monitor order book updates, please consider using WebSocket Streams:<br>
     * &lt;symbol&gt;@depth&lt;levels&gt;<br>
     * &lt;symbol&gt;@depth<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * limit -- optional/int -- Default 100; max 5000. <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#order-book">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#order-book</a>
     */
    public void depth(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.publicRequest("depth", parameters);
    }

    /**
     * Get recent trades.
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * limit -- optional/int -- Default 100; max 1000. <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#recent-trades">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#recent-trades</a>
     */
    public void recentTrades(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.publicRequest("trades.recent", parameters);
    }


    /**
     * Get historical trades.<br>
     * 
     * If fromId is not specified, the most recent trades are returned.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * fromId -- optional/int -- Trade ID to begin at. <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#historical-trades-market_data">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#historical-trades-market_data</a>
     */
    public void historicalTrades(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.apiRequest("trades.historical", parameters);
    }

    /**
     * Get aggregate trades.<br>
     * 
     * An aggregate trade (aggtrade) represents one or more individual trades.<br>
     * Trades that fill at the same time, from the same taker order, with the same price – those trades are collected into an aggregate trade with total quantity of the individual trades.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * fromId -- optional/int -- Trade ID to begin at. <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * startTime -- optional/int <br>
     * endTime -- optional/int <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#aggregate-trades">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#aggregate-trades</a>
     */
    public void aggTrades(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.publicRequest("trades.aggregate", parameters);
    }


    /**
     * Get klines (candlestick bars).<br>
     * 
     * Klines are uniquely identified by their open and close time.<br>
     * 
     * @param symbol String
     * @param interval String -- Kline interval.
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * startTime -- optional/int <br>
     * endTime -- optional/int <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#klines">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#klines</a>
     */
    public void klines(String symbol, String interval, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(interval, String.class, "interval");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "interval", interval);

        this.handler.publicRequest("klines", parameters);
    }

    /**
     * Get klines (candlestick bars) optimized for presentation.<br>
     * 
     * This request is similar to klines, having the same parameters and response. uiKlines return modified kline data, optimized for presentation of candlestick charts.<br>
     * 
     * @param symbol String
     * @param interval String -- Kline interval.
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * startTime -- optional/int <br>
     * endTime -- optional/int <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#ui-klines">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#ui-klines</a>
     */
    public void uiKlines(String symbol, String interval, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(interval, String.class, "interval");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "interval", interval);

        this.handler.publicRequest("uiKlines", parameters);
    }

    /**
     * Get current average price for a symbol.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#current-average-price">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#current-average-price</a>
     */
    public void avgPrice(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.publicRequest("avgPrice", parameters);
    }

    /**
     * Get 24-hour rolling window price change statistics.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String -- Query ticker for a single symbol<br>
     * symbols -- optional/Array of String -- Query ticker for multiple symbols<br>
     * type -- optional/String -- Ticker type: FULL (default) or MINI<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#24hr-ticker-price-change-statistics">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#24hr-ticker-price-change-statistics</a>
     */
    public void ticker24H(JSONObject parameters) {
        ParameterChecker.checkOnlyOneOfParameters(parameters, "symbol", "symbols");
        this.handler.publicRequest("ticker.24hr", parameters);
    }

    /**
     * Get rolling window price change statistics with a custom window.<br>
     * 
     * Note: <br>
     * Window size precision is limited to 1 minute.<br>
     * While the closeTime is the current time of the request, openTime always start on a minute boundary.<br>
     * As such, the effective window might be up to 59999 ms wider than the requested windowSize.<br>
     * 
     * Either symbol or symbols must be specified.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String -- Query ticker for a single symbol<br>
     * symbols -- optional/Array of String -- Query ticker for multiple symbols<br>
     * type -- optional/String -- Ticker type: FULL (default) or MINI<br>
     * windowSize -- optional/int -- Default "1d"<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#rolling-window-price-change-statistics">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#rolling-window-price-change-statistics</a>
     */
    public void ticker(JSONObject parameters) {
        ParameterChecker.checkOnlyOneOfParameters(parameters, "symbol", "symbols");
        ParameterChecker.checkOneOfParametersRequired(parameters, "symbol", "symbols");
        this.handler.publicRequest("ticker", parameters);
    }

    /**
     * Get the latest market price for a symbol.
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String -- Query ticker for a single symbol<br>
     * symbols -- optional/Array of String -- Query ticker for multiple symbols<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#symbol-price-ticker">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#symbol-price-ticker</a>
     */
    public void tickerPrice(JSONObject parameters) {
        ParameterChecker.checkOnlyOneOfParameters(parameters, "symbol", "symbols");
        this.handler.publicRequest("ticker.price", parameters);
    }

    /**
     * Get the current best price and quantity on the order book.
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String -- Query ticker for a single symbol<br>
     * symbols -- optional/Array of String -- Query ticker for multiple symbols<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#symbol-order-book-ticker">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#symbol-order-book-ticker</a>
     */
    public void tickerBook(JSONObject parameters) {
        ParameterChecker.checkOnlyOneOfParameters(parameters, "symbol", "symbols");
        this.handler.publicRequest("ticker.book", parameters);
    }
}
