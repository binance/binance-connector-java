package com.binance.connector.client.alpha.rest.api;

import com.binance.connector.client.alpha.rest.AlphaRestApiUtil;
import com.binance.connector.client.alpha.rest.model.AggregatedTradesResponse;
import com.binance.connector.client.alpha.rest.model.GetExchangeInfoResponse;
import com.binance.connector.client.alpha.rest.model.KlinesResponse;
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
     * Useful for recent trade history. Weight: 0
     *
     * @param symbol e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List (required)
     * @param fromId starting trade ID to fetch from (optional)
     * @param startTime start timestamp (milliseconds) (optional)
     * @param endTime end timestamp (milliseconds) (optional)
     * @param limit number of results to return (default 500, max 1000) (optional)
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
     *     href="https://developers.binance.com/docs/alpha/market-data/rest-api/Aggregated-Trades">Aggregated
     *     Trades Documentation</a>
     */
    public ApiResponse<AggregatedTradesResponse> aggregatedTrades(
            String symbol, Long fromId, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.aggregatedTrades(symbol, fromId, startTime, endTime, limit);
    }

    /**
     * Get Exchange Info Fetches general exchange information, such as supported symbols, rate
     * limits, and server time. Weight: 0
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
     *     href="https://developers.binance.com/docs/alpha/market-data/rest-api/Get-Exchange-Info">Get
     *     Exchange Info Documentation</a>
     */
    public ApiResponse<GetExchangeInfoResponse> getExchangeInfo() throws ApiException {
        return marketDataApi.getExchangeInfo();
    }

    /**
     * Klines (Candlestick Data) Fetches Kline/candlestick bars for a symbol, which include
     * open/high/low/close prices and volume over intervals. Useful for charting and analysis.
     * Weight: 0
     *
     * @param symbol e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List (required)
     * @param interval e.g., \&quot;1h\&quot; – supported intervals: 1s, 15s, 1m, 3m, 5m, 15m, 30m,
     *     1h, 2h, 4h, 6h, 8h, 12h, 1d, 3d, 1w, 1M (required)
     * @param limit number of results to return (default 500, max 1000) (optional)
     * @param startTime start timestamp (milliseconds) (optional)
     * @param endTime end timestamp (milliseconds) (optional)
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
     * @see <a href="https://developers.binance.com/docs/alpha/market-data/rest-api/Klines">Klines
     *     (Candlestick Data) Documentation</a>
     */
    public ApiResponse<KlinesResponse> klines(
            String symbol, String interval, Long limit, Long startTime, Long endTime)
            throws ApiException {
        return marketDataApi.klines(symbol, interval, limit, startTime, endTime);
    }

    /**
     * Ticker (24hr Price Statistics) Gets the 24-hour rolling window price change statistics for a
     * symbol, including volume and price changes. Weight: 0
     *
     * @param symbol e.g., \&quot;ALPHA_175USDT\&quot; – use token ID from Token List (required)
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
     *     href="https://developers.binance.com/docs/alpha/market-data/rest-api/24hr-ticker-price-change">Ticker
     *     (24hr Price Statistics) Documentation</a>
     */
    public ApiResponse<TickerResponse> ticker(String symbol) throws ApiException {
        return marketDataApi.ticker(symbol);
    }

    /**
     * Token List Retrieves a list of all available ALPHA tokens, including their IDs and symbols.
     * Use this to find the token ID for constructing symbols in other endpoints. Weight: 0
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
     *     href="https://developers.binance.com/docs/alpha/market-data/rest-api/Token-List">Token
     *     List Documentation</a>
     */
    public ApiResponse<TokenListResponse> tokenList() throws ApiException {
        return marketDataApi.tokenList();
    }
}
