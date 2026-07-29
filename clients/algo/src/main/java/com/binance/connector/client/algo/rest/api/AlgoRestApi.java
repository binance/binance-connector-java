package com.binance.connector.client.algo.rest.api;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.model.CancelAlgoOrderFutureAlgoResponse;
import com.binance.connector.client.algo.rest.model.CancelAlgoOrderSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.QueryCurrentAlgoOpenOrdersFutureAlgoResponse;
import com.binance.connector.client.algo.rest.model.QueryCurrentAlgoOpenOrdersSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.QueryHistoricalAlgoOrdersFutureAlgoResponse;
import com.binance.connector.client.algo.rest.model.QueryHistoricalAlgoOrdersSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.QuerySubOrdersFutureAlgoResponse;
import com.binance.connector.client.algo.rest.model.QuerySubOrdersSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.Side;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceFutureAlgoRequest;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceFutureAlgoResponse;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceSpotAlgoRequest;
import com.binance.connector.client.algo.rest.model.TimeWeightedAveragePriceSpotAlgoResponse;
import com.binance.connector.client.algo.rest.model.VolumeParticipationFutureAlgoRequest;
import com.binance.connector.client.algo.rest.model.VolumeParticipationFutureAlgoResponse;
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class AlgoRestApi {

    private final FutureAlgoApi futureAlgoApi;
    private final SpotAlgoApi spotAlgoApi;

    public AlgoRestApi(ClientConfiguration configuration) {
        this(AlgoRestApiUtil.getDefaultClient(configuration));
    }

    public AlgoRestApi(ApiClient apiClient) {
        this.futureAlgoApi = new FutureAlgoApi(apiClient);
        this.spotAlgoApi = new SpotAlgoApi(apiClient);
    }

    /**
     * Cancel Futures Algo Order (TRADE) Cancel an active order. Weight(IP): 1 Security Type: TRADE
     * Notes: - You need to enable &#x60;Futures Trading Permission&#x60; for the API key that
     * requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;
     *
     * @param algoId eg. 14511 (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;CancelAlgoOrderFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Algo Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#cancel-algo-order-future-algo">Cancel
     *     Futures Algo Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAlgoOrderFutureAlgoResponse> cancelAlgoOrderFutureAlgo(
            Long algoId, Long recvWindow) throws ApiException {
        return futureAlgoApi.cancelAlgoOrderFutureAlgo(algoId, recvWindow);
    }

    /**
     * Query Current Futures Algo Open Orders (USER_DATA) Query Current Algo Open Orders Weight(IP):
     * 1 Security Type: USER_DATA Notes: - You need to enable &#x60;Futures Trading Permission&#x60;
     * for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryCurrentAlgoOpenOrdersFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Algo Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#query-current-algo-open-orders-future-algo">Query
     *     Current Futures Algo Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentAlgoOpenOrdersFutureAlgoResponse>
            queryCurrentAlgoOpenOrdersFutureAlgo(Long recvWindow) throws ApiException {
        return futureAlgoApi.queryCurrentAlgoOpenOrdersFutureAlgo(recvWindow);
    }

    /**
     * Query Historical Futures Algo Orders (USER_DATA) Query Historical Algo Order Weight(IP): 1
     * Security Type: USER_DATA Notes: - You need to enable &#x60;Futures Trading Permission&#x60;
     * for the API key that requests this endpoint. - Base URL: &#x60;https://api.binance.com&#x60;
     *
     * @param symbol Trading symbol eg. BTCUSDT (optional)
     * @param side BUY or SELL (optional)
     * @param startTime in milliseconds eg.1641522717552 (optional)
     * @param endTime in milliseconds eg.1641522526562 (optional)
     * @param page Page number (optional)
     * @param pageSize Records per page (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryHistoricalAlgoOrdersFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Historical Algo Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#query-historical-algo-orders-future-algo">Query
     *     Historical Futures Algo Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryHistoricalAlgoOrdersFutureAlgoResponse>
            queryHistoricalAlgoOrdersFutureAlgo(
                    String symbol,
                    Side side,
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long pageSize,
                    Long recvWindow)
                    throws ApiException {
        return futureAlgoApi.queryHistoricalAlgoOrdersFutureAlgo(
                symbol, side, startTime, endTime, page, pageSize, recvWindow);
    }

    /**
     * Query Futures Sub Orders (USER_DATA) Get respective sub orders for a specified algoId
     * Weight(IP): 1 Security Type: USER_DATA Notes: - You need to enable &#x60;Futures Trading
     * Permission&#x60; for the API key that requests this endpoint. - Base URL:
     * &#x60;https://api.binance.com&#x60;
     *
     * @param algoId eg. 14511 (required)
     * @param page Page number (optional)
     * @param pageSize Records per page (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QuerySubOrdersFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#query-sub-orders-future-algo">Query
     *     Futures Sub Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubOrdersFutureAlgoResponse> querySubOrdersFutureAlgo(
            Long algoId, Long page, Long pageSize, Long recvWindow) throws ApiException {
        return futureAlgoApi.querySubOrdersFutureAlgo(algoId, page, pageSize, recvWindow);
    }

    /**
     * Time-Weighted Futures Average Price (Twap) New Order (TRADE) Send in a Twap new order. Only
     * support on USDⓈ-M Contracts. Weight(UID): 3000 Security Type: TRADE Notes: - Other info: -
     * Total Algo open orders max allowed: &#x60;30&#x60; orders. - Leverage and position mode
     * follow your futures account settings. - Receiving &#x60;\&quot;success\&quot;: true&#x60;
     * does not guarantee execution; query order endpoints for final status. - If balance/position
     * constraints fail, response may still return success but order status becomes
     * &#x60;expired&#x60;. - &#x60;quantity * 60 / duration&#x60; must be greater than
     * &#x60;minQty&#x60;. - &#x60;duration&#x60; cannot be less than 5 minutes or greater than 24
     * hours. - For delivery contracts, TWAP end time should be one hour earlier than symbol
     * delivery time. - You need to enable the corresponding permission for the API key requesting
     * this endpoint: - &#x60;Futures Trading Permission&#x60; — for Classic Trading Account mode -
     * &#x60;Portfolio Margin Trading Permission&#x60; — for Portfolio Margin Account mode - Base
     * URL: &#x60;https://api.binance.com&#x60;
     *
     * @param timeWeightedAveragePriceFutureAlgoRequest (required)
     * @return ApiResponse&lt;TimeWeightedAveragePriceFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Time-Weighted Average Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#time-weighted-average-price-future-algo">Time-Weighted
     *     Futures Average Price (Twap) New Order (TRADE) Documentation</a>
     */
    public ApiResponse<TimeWeightedAveragePriceFutureAlgoResponse>
            timeWeightedAveragePriceFutureAlgo(
                    TimeWeightedAveragePriceFutureAlgoRequest
                            timeWeightedAveragePriceFutureAlgoRequest)
                    throws ApiException {
        return futureAlgoApi.timeWeightedAveragePriceFutureAlgo(
                timeWeightedAveragePriceFutureAlgoRequest);
    }

    /**
     * Volume Participation (VP) New Order (TRADE) Send in a VP new order. Only support on USDⓈ-M
     * Contracts. Weight(UID): 300 Security Type: TRADE Notes: - Other info: - Total Algo open
     * orders max allowed: &#x60;10&#x60; orders. - Leverage and position mode follow your futures
     * account settings. - Receiving &#x60;\&quot;success\&quot;: true&#x60; does not guarantee
     * execution; query order endpoints for final status. - If balance/position constraints fail,
     * response may still return success but order status becomes &#x60;expired&#x60;. - You need to
     * enable the corresponding permission for the API key requesting this endpoint: - &#x60;Futures
     * Trading Permission&#x60; — for Classic Trading Account mode - &#x60;Portfolio Margin Trading
     * Permission&#x60; — for Portfolio Margin Account mode - Base URL:
     * &#x60;https://api.binance.com&#x60;
     *
     * @param volumeParticipationFutureAlgoRequest (required)
     * @return ApiResponse&lt;VolumeParticipationFutureAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Volume Participation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/future-algo#volume-participation-future-algo">Volume
     *     Participation (VP) New Order (TRADE) Documentation</a>
     */
    public ApiResponse<VolumeParticipationFutureAlgoResponse> volumeParticipationFutureAlgo(
            VolumeParticipationFutureAlgoRequest volumeParticipationFutureAlgoRequest)
            throws ApiException {
        return futureAlgoApi.volumeParticipationFutureAlgo(volumeParticipationFutureAlgoRequest);
    }

    /**
     * Cancel Spot Algo Order (TRADE) Cancel an open TWAP order Weight(IP): 1 Security Type: TRADE
     *
     * @param algoId (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;CancelAlgoOrderSpotAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Algo Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/spot-algo#cancel-algo-order-spot-algo">Cancel
     *     Spot Algo Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAlgoOrderSpotAlgoResponse> cancelAlgoOrderSpotAlgo(
            Long algoId, Long recvWindow) throws ApiException {
        return spotAlgoApi.cancelAlgoOrderSpotAlgo(algoId, recvWindow);
    }

    /**
     * Query Current Spot Algo Open Orders (USER_DATA) Get all open SPOT TWAP orders Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryCurrentAlgoOpenOrdersSpotAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Algo Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/spot-algo#query-current-algo-open-orders-spot-algo">Query
     *     Current Spot Algo Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentAlgoOpenOrdersSpotAlgoResponse>
            queryCurrentAlgoOpenOrdersSpotAlgo(Long recvWindow) throws ApiException {
        return spotAlgoApi.queryCurrentAlgoOpenOrdersSpotAlgo(recvWindow);
    }

    /**
     * Query Historical Spot Algo Orders (USER_DATA) Get all historical SPOT TWAP orders Weight(IP):
     * 1 Security Type: USER_DATA
     *
     * @param symbol Trading symbol (optional)
     * @param side (optional)
     * @param startTime in milliseconds eg.1641522717552 (optional)
     * @param endTime in milliseconds eg.1641522526562 (optional)
     * @param page Page number (optional)
     * @param pageSize Records per page (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryHistoricalAlgoOrdersSpotAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Historical Algo Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/spot-algo#query-historical-algo-orders-spot-algo">Query
     *     Historical Spot Algo Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryHistoricalAlgoOrdersSpotAlgoResponse> queryHistoricalAlgoOrdersSpotAlgo(
            String symbol,
            Side side,
            Long startTime,
            Long endTime,
            Long page,
            Long pageSize,
            Long recvWindow)
            throws ApiException {
        return spotAlgoApi.queryHistoricalAlgoOrdersSpotAlgo(
                symbol, side, startTime, endTime, page, pageSize, recvWindow);
    }

    /**
     * Query Spot Sub Orders (USER_DATA) Get respective sub orders for a specified algoId
     * Weight(IP): 1 Security Type: USER_DATA
     *
     * @param algoId eg. 14511 (required)
     * @param page Page number (optional)
     * @param pageSize Records per page (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QuerySubOrdersSpotAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/spot-algo#query-sub-orders-spot-algo">Query
     *     Spot Sub Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubOrdersSpotAlgoResponse> querySubOrdersSpotAlgo(
            Long algoId, Long page, Long pageSize, Long recvWindow) throws ApiException {
        return spotAlgoApi.querySubOrdersSpotAlgo(algoId, page, pageSize, recvWindow);
    }

    /**
     * Time-Weighted Spot Average Price(Twap) New Order (TRADE) Place a new spot TWAP order with
     * Algo service. Weight(UID): 3000 Security Type: TRADE Notes: - Total Algo open orders max
     * allowed: &#x60;20&#x60; orders.
     *
     * @param timeWeightedAveragePriceSpotAlgoRequest (required)
     * @return ApiResponse&lt;TimeWeightedAveragePriceSpotAlgoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Time-Weighted Average Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-algo-trading/api/rest-api/spot-algo#time-weighted-average-price-spot-algo">Time-Weighted
     *     Spot Average Price(Twap) New Order (TRADE) Documentation</a>
     */
    public ApiResponse<TimeWeightedAveragePriceSpotAlgoResponse> timeWeightedAveragePriceSpotAlgo(
            TimeWeightedAveragePriceSpotAlgoRequest timeWeightedAveragePriceSpotAlgoRequest)
            throws ApiException {
        return spotAlgoApi.timeWeightedAveragePriceSpotAlgo(
                timeWeightedAveragePriceSpotAlgoRequest);
    }
}
