package com.binance.connector.client.alpha.rest.api;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.model.AggregatedTradesResponse;
import com.binance.connector.client.alpha.rest.model.FullDepthResponse;
import com.binance.connector.client.alpha.rest.model.GetExchangeInfoResponse;
import com.binance.connector.client.alpha.rest.model.Interval;
import com.binance.connector.client.alpha.rest.model.KlinesResponse;
import com.binance.connector.client.alpha.rest.model.Limit;
import com.binance.connector.client.alpha.rest.model.TickerResponse;
import com.binance.connector.client.alpha.rest.model.TokenListResponse;
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class AlphaRestApi {

    private final MarketDataApi marketDataApi;

    public AlphaRestApi(ClientConfiguration configuration) {
        this(AlphaRestApiUtil.getDefaultClient(configuration));
    }

    public AlphaRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
    }

    /**
     * Aggregated Trades Retrieves compressed, aggregated historical trades for a specific symbol.
     * Useful for recent trade history.
     *
     * @param symbol Trading pair symbol, e.g. ALPHA_118USDC (use token ID from Token List).
     *     (required)
     * @param fromId Starting aggregate trade ID to fetch from. (optional)
     * @param startTime Start timestamp in milliseconds. (optional)
     * @param endTime End timestamp in milliseconds. (optional)
     * @param limit Number of results to return. (optional)
     * @return ApiResponse&lt;AggregatedTradesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Aggregated Trades </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#aggregated-trades">Aggregated
     *     Trades Documentation</a>
     */
    public ApiResponse<AggregatedTradesResponse> aggregatedTrades(
            String symbol, Long fromId, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.aggregatedTrades(symbol, fromId, startTime, endTime, limit);
    }

    /**
     * Full Depth Fetches the full order book depth (UI &amp; API orders) for a symbol, including
     * bid and ask orders with their prices and quantities.
     *
     * @param symbol Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
     *     (required)
     * @param limit Number of price levels to return. Valid values: 5, 10, 20, 50, 100, 500, 1000.
     *     (optional, default to 500)
     * @return ApiResponse&lt;FullDepthResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Full Depth </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#full-depth">Full
     *     Depth Documentation</a>
     */
    public ApiResponse<FullDepthResponse> fullDepth(String symbol, Limit limit)
            throws ApiException {
        return marketDataApi.fullDepth(symbol, limit);
    }

    /**
     * Get Exchange Info Fetches general exchange information, such as supported symbols, rate
     * limits, and server time.
     *
     * @return ApiResponse&lt;GetExchangeInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Exchange Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#get-exchange-info">Get
     *     Exchange Info Documentation</a>
     */
    public ApiResponse<GetExchangeInfoResponse> getExchangeInfo() throws ApiException {
        return marketDataApi.getExchangeInfo();
    }

    /**
     * Klines Fetches Kline/candlestick bars for a symbol, which include open/high/low/close prices
     * and volume over intervals. Useful for charting and analysis.
     *
     * @param symbol Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
     *     (required)
     * @param interval Kline interval. (required)
     * @param limit Number of klines to return. (optional)
     * @param startTime Start timestamp in milliseconds. (optional)
     * @param endTime End timestamp in milliseconds. (optional)
     * @return ApiResponse&lt;KlinesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Klines </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#klines">Klines
     *     Documentation</a>
     */
    public ApiResponse<KlinesResponse> klines(
            String symbol, Interval interval, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.klines(symbol, interval, limit, startTime, endTime);
    }

    /**
     * Ticker Gets the 24-hour rolling window price change statistics for a symbol, including volume
     * and price changes.
     *
     * @param symbol Trading pair symbol, e.g. ALPHA_175USDT (use token ID from Token List).
     *     (required)
     * @return ApiResponse&lt;TickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#ticker">Ticker
     *     Documentation</a>
     */
    public ApiResponse<TickerResponse> ticker(String symbol) throws ApiException {
        return marketDataApi.ticker(symbol);
    }

    /**
     * Token List Retrieves a list of all available ALPHA tokens, including their IDs and symbols.
     * Use this to find the token ID for constructing symbols in other endpoints.
     *
     * @return ApiResponse&lt;TokenListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Token List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-alpha-trading/api/rest-api/market-data#token-list">Token
     *     List Documentation</a>
     */
    public ApiResponse<TokenListResponse> tokenList() throws ApiException {
        return marketDataApi.tokenList();
    }
}
