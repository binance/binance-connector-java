package com.binance.connector.client.impl.spot;

import java.util.ArrayList;
import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.JSONParser;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;

/**
 * <h2>Market Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#market-data-endpoints">Market Data Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Market {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Market(String baseUrl, String apiKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, proxy);
        this.showLimitUsage = showLimitUsage;
    }
    private final String PING = "/api/v3/ping";
    /**
     * Test connectivity to the Rest API.
     * <br><br>
     * GET /api/v3/ping
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#test-connectivity">
     *     https://binance-docs.github.io/apidocs/spot/en/#test-connectivity</a>
     */
    public String ping() {
        return requestHandler.sendPublicRequest(baseUrl, PING, null, HttpMethod.GET, showLimitUsage);
    }

    private final String TIME = "/api/v3/time";
    /**
     * Test connectivity to the Rest API and get the current server time.
     * <br><br>
     * GET /api/v3/time
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#test-connectivity">
     *     https://binance-docs.github.io/apidocs/spot/en/#check-server-time</a>
     */
    public String time() {
        return requestHandler.sendPublicRequest(baseUrl, TIME, null, HttpMethod.GET, showLimitUsage);
    }

    private final String EXCHANGE_INFO = "/api/v3/exchangeInfo";
    /**
     * Current exchange trading rules and symbol information.
     * <br><br>
     * GET /api/v3/exchangeinfo
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string <br>
     * symbols -- optional/ArrayList <br>
     * permissions -- optional/ArrayList -- support single or multiple values (e.g. "SPOT", ["MARGIN","LEVERAGED"]) <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#exchange-information">
     *     https://binance-docs.github.io/apidocs/spot/en/#exchange-information</a>
     */
    public String exchangeInfo(Map<String, Object> parameters) {
        if (parameters.containsKey("symbol") && parameters.containsKey("symbols")) {
            throw new BinanceConnectorException("symbol and symbols cannot be sent together.");
        }
        if ((parameters.containsKey("symbol") && parameters.containsKey("permissions"))
             || parameters.containsKey("symbols") && parameters.containsKey("permissions")) {
            throw new BinanceConnectorException("permissions cannot be sent together with symbol or symbols.");
        }
        if (parameters.containsKey("symbols")) {
            ParameterChecker.checkParameterType(parameters.get("symbols"), ArrayList.class, "symbols");
            parameters.put("symbols", JSONParser.getJSONArray(
                                    (ArrayList<?>) parameters.get("symbols"), "symbols"));
        }
        if (parameters.containsKey("permissions")) {
            ParameterChecker.checkParameterType(parameters.get("permissions"), ArrayList.class, "permissions");
            parameters.put("permissions", JSONParser.getJSONArray(
                                    (ArrayList<?>) parameters.get("permissions"), "permissions"));
        }
        return requestHandler.sendPublicRequest(baseUrl, EXCHANGE_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DEPTH = "/api/v3/depth";
    /**
     * GET /api/v3/depth
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * limit -- optional/integer -- limit the results
     *            Default 100; max 5000. Valid limits:[5, 10, 20, 50, 100, 500, 1000, 5000] <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#order-book">
     *     https://binance-docs.github.io/apidocs/spot/en/#order-book</a>
     */
    public String depth(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendPublicRequest(baseUrl, DEPTH, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TRADES = "/api/v3/trades";
    /**
     * Get recent trades.
     * <br><br>
     * GET /api/v3/trades
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * limit -- optional/integer -- limit the results Default 500; max 1000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#recent-trades-list">
     *     https://binance-docs.github.io/apidocs/spot/en/#recent-trades-list</a>
     */
    public String trades(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendPublicRequest(baseUrl, TRADES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String HISTORICAL_TRADES = "/api/v3/historicalTrades";
    /**
     * Get older market trades.
     * <br><br>
     * GET /api/v3/historicalTrades
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * limit -- optional/integer -- limit the result Default 500; max 1000 <br>
     * fromId -- optional/long -- trade id to fetch from. Default gets most recent trades <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#old-trade-lookup">
     *     https://binance-docs.github.io/apidocs/spot/en/#old-trade-lookup</a>
     *
     */
    public String historicalTrades(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendApiRequest(baseUrl, HISTORICAL_TRADES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String AGG_TRADES = "/api/v3/aggTrades";
    /**
     * Get compressed, aggregate trades. Trades that fill at the time, from the same order,
     * with the same price will have the quantity aggregated.
     * <br><br>
     * GET /api/v3/aggTrades
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * fromId -- optional/long -- id to get aggregate trades from INCLUSIVE <br>
     * startTime -- optional/long -- Timestamp in ms to get aggregate trades from INCLUSIVE <br>
     * endTime -- optional/long -- Timestamp in ms to get aggregate trades until INCLUSIVE <br>
     * limit -- optional/integer -- limit the results Default 500; max 1000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#compressed-aggregate-trades-list">
     *     https://binance-docs.github.io/apidocs/spot/en/#compressed-aggregate-trades-list</a>
     */
    public String aggTrades(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendPublicRequest(baseUrl, AGG_TRADES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String KLINES = "/api/v3/klines";
    /**
     * Kline/candlestick bars for a symbol.
     * Klines are uniquely identified by their open time.
     * <br><br>
     * GET /api/v3/klines
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * interval -- mandatory/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/integer -- limit the results Default 500; max 1000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-data">
     *     https://binance-docs.github.io/apidocs/spot/en/#kline-candlestick-data</a>
     */
    public String klines(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "interval", String.class);
        return requestHandler.sendPublicRequest(baseUrl, KLINES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String UIKLINES = "/api/v3/uiKlines";
    /**
     * The request is similar to klines having the same parameters and response.
     * uiKlines return modified kline data, optimized for presentation of candlestick charts.
     * <br><br>
     * GET /api/v3/uiKlines
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * interval -- mandatory/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/integer -- limit the results Default 500; max 1000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#uiklines">
     *     https://binance-docs.github.io/apidocs/spot/en/#uiklines</a>
     */
    public String uiKlines(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "interval", String.class);
        return requestHandler.sendPublicRequest(baseUrl, UIKLINES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String AVG_PRICE = "/api/v3/avgPrice";
    /**
     * Current average price for a symbol.
     * <br><br>
     * GET /api/v3/avgPrice
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- the trading pair <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#current-average-price">
     *     https://binance-docs.github.io/apidocs/spot/en/#current-average-price</a>
     */
    public String averagePrice(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendPublicRequest(baseUrl, AVG_PRICE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TICKER_24H = "/api/v3/ticker/24hr";
    /**
     * 24 hour rolling window price change statistics. Careful when accessing this with no symbol.
     * <br><br>
     * GET /api/v3/ticker/24hr
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- the trading pair <br>
     * symbols -- optional/string <br>
     * type -- optional/enum -- Supported values: FULL or MINI. If none provided, the default is FULL <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#24hr-ticker-price-change-statistics">
     *     https://binance-docs.github.io/apidocs/spot/en/#24hr-ticker-price-change-statistics</a>
     */
    public String ticker24H(Map<String, Object> parameters) {
        if (parameters.containsKey("symbol") && parameters.containsKey("symbols")) {
            throw new BinanceConnectorException("symbol and symbols cannot be sent together.");
        }
        if (parameters.containsKey("symbols")) {
            ParameterChecker.checkParameterType(parameters.get("symbols"), ArrayList.class, "symbols");
            parameters.put("symbols", JSONParser.getJSONArray(
                    (ArrayList<?>) parameters.get("symbols"), "symbols"));
        }
        return requestHandler.sendPublicRequest(baseUrl, TICKER_24H, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TICKER_SYMBOL = "/api/v3/ticker/price";
    /**
     * Latest price for a symbol or symbols.
     * <br><br>
     * GET /api/v3/ticker/price
     * <br>
     * https://binance-docs.github.io/apidocs/spot/en/#24hr-ticker-price-change-statistics
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- the trading pair <br>
     * symbols -- optional/string <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#symbol-price-ticker">
     *     https://binance-docs.github.io/apidocs/spot/en/#symbol-price-ticker</a>
     */
    public String tickerSymbol(Map<String, Object> parameters) {
        if (parameters.containsKey("symbol") && parameters.containsKey("symbols")) {
            throw new BinanceConnectorException("symbol and symbols cannot be sent together.");
        }
        if (parameters.containsKey("symbols")) {
            ParameterChecker.checkParameterType(parameters.get("symbols"), ArrayList.class, "symbols");
            parameters.put("symbols", JSONParser.getJSONArray(
                    (ArrayList<?>) parameters.get("symbols"), "symbols"));
        }
        return requestHandler.sendPublicRequest(baseUrl, TICKER_SYMBOL, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BOOK_TICKER = "/api/v3/ticker/bookTicker";
    /**
     * Best price/qty on the order book for a symbol or symbols.
     * <br><br>
     * GET /api/v3/ticker/bookTicker
     * <br>
     * https://binance-docs.github.io/apidocs/spot/en/#24hr-ticker-price-change-statistics
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- the trading pair <br>
     * symbols -- optional/string <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#symbol-order-book-ticker">
     *     https://binance-docs.github.io/apidocs/spot/en/#symbol-order-book-ticker</a>
     */
    public String bookTicker(Map<String, Object> parameters) {
        if (parameters.containsKey("symbol") && parameters.containsKey("symbols")) {
            throw new BinanceConnectorException("symbol and symbols cannot be sent together.");
        }
        if (parameters.containsKey("symbols")) {
            ParameterChecker.checkParameterType(parameters.get("symbols"), ArrayList.class, "symbols");
            parameters.put("symbols", JSONParser.getJSONArray(
                    (ArrayList<?>) parameters.get("symbols"), "symbols"));
        }
        return requestHandler.sendPublicRequest(baseUrl, BOOK_TICKER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TICKER = "/api/v3/ticker";
    /**
     * The window used to compute statistics will be no more than 59999ms from the requested windowSize.
     * openTime for /api/v3/ticker always starts on a minute, while the closeTime is the current time of the request.
     * As such, the effective window will be up to 59999ms wider than windowSize.
     * <br><br>
     * GET /api/v3/ticker
     * <br>
     * https://binance-docs.github.io/apidocs/spot/en/#rolling-window-price-change-statistics
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- Either symbol or symbols must be provided
     * Examples of accepted format for the symbols parameter:
     * ["BTCUSDT","BNBUSDT"]
     * or
     * %5B%22BTCUSDT%22,%22BNBUSDT%22%5D <br>
     * symbols -- optional/string -- The maximum number of symbols allowed in a request is 100. <br>
     * windowSize -- optional/enum -- Defaults to 1d if no parameter provided <br>
     * type -- optional/enum -- Supported values: FULL or MINI. If none provided, the default is FULL <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#rolling-window-price-change-statistics">
     *     https://binance-docs.github.io/apidocs/spot/en/#rolling-window-price-change-statistics</a>
     */
    public String ticker(Map<String, Object> parameters) {
        if (parameters.containsKey("symbol") && parameters.containsKey("symbols")) {
            throw new BinanceConnectorException("symbol and symbols cannot be sent together.");
        }
        if (parameters.containsKey("symbols")) {
            ParameterChecker.checkParameterType(parameters.get("symbols"), ArrayList.class, "symbols");
            parameters.put("symbols", JSONParser.getJSONArray(
                    (ArrayList<?>) parameters.get("symbols"), "symbols"));
        } else {
            ParameterChecker.checkParameter(parameters, "symbol", String.class);
        }
        return requestHandler.sendPublicRequest(baseUrl, TICKER, parameters, HttpMethod.GET, showLimitUsage);
    }
}
