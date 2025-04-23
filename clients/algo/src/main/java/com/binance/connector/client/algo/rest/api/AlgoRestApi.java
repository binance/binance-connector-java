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
     * Cancel Algo Order(TRADE) Cancel an active order. * You need to enable &#x60;Futures Trading
     * Permission&#x60; for the api key which requests this endpoint. * Base URL:
     * https://api.binance.com Weight: 1
     *
     * @param algoId eg. 14511 (required)
     * @param recvWindow (optional)
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
     * @see <a href="https://developers.binance.com/docs/algo/future-algo/Cancel-Algo-Order">Cancel
     *     Algo Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAlgoOrderFutureAlgoResponse> cancelAlgoOrderFutureAlgo(
            Long algoId, Long recvWindow) throws ApiException {
        return futureAlgoApi.cancelAlgoOrderFutureAlgo(algoId, recvWindow);
    }

    /**
     * Query Current Algo Open Orders(USER_DATA) Query Current Algo Open Orders * You need to enable
     * &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base
     * URL: https://api.binance.com Weight: 1
     *
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/docs/algo/future-algo/Query-Current-Algo-Open-Orders">Query
     *     Current Algo Open Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentAlgoOpenOrdersFutureAlgoResponse>
            queryCurrentAlgoOpenOrdersFutureAlgo(Long recvWindow) throws ApiException {
        return futureAlgoApi.queryCurrentAlgoOpenOrdersFutureAlgo(recvWindow);
    }

    /**
     * Query Historical Algo Orders(USER_DATA) Query Historical Algo Order * You need to enable
     * &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. * Base
     * URL: https://api.binance.com Weight: 1
     *
     * @param symbol Trading symbol eg. BTCUSDT (optional)
     * @param side BUY or SELL (optional)
     * @param startTime in milliseconds eg.1641522717552 (optional)
     * @param endTime in milliseconds eg.1641522526562 (optional)
     * @param page Default is 1 (optional)
     * @param pageSize MIN 1, MAX 100; Default 100 (optional)
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/docs/algo/future-algo/Query-Historical-Algo-Orders">Query
     *     Historical Algo Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryHistoricalAlgoOrdersFutureAlgoResponse>
            queryHistoricalAlgoOrdersFutureAlgo(
                    String symbol,
                    String side,
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
     * Query Sub Orders(USER_DATA) Get respective sub orders for a specified algoId * You need to
     * enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. *
     * Base URL: https://api.binance.com Weight: 1
     *
     * @param algoId eg. 14511 (required)
     * @param page Default is 1 (optional)
     * @param pageSize MIN 1, MAX 100; Default 100 (optional)
     * @param recvWindow (optional)
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
     * @see <a href="https://developers.binance.com/docs/algo/future-algo/Query-Sub-Orders">Query
     *     Sub Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubOrdersFutureAlgoResponse> querySubOrdersFutureAlgo(
            Long algoId, Long page, Long pageSize, Long recvWindow) throws ApiException {
        return futureAlgoApi.querySubOrdersFutureAlgo(algoId, page, pageSize, recvWindow);
    }

    /**
     * Time-Weighted Average Price(Twap) New Order(TRADE) Send in a Twap new order. Only support on
     * USDⓈ-M Contracts. * Total Algo open orders max allowed: &#x60;30&#x60; orders. * Leverage of
     * symbols and position mode will be the same as your futures account settings. You can set up
     * through the trading page or fapi. * Receiving &#x60;\&quot;success\&quot;: true&#x60; does
     * not mean that your order will be executed. Please use the query order endpoints（&#x60;GET
     * sapi/v1/algo/futures/openOrders&#x60; or &#x60;GET
     * sapi/v1/algo/futures/historicalOrders&#x60;） to check the order status. For example: Your
     * futures balance is insufficient, or open position with reduce only or position side is
     * inconsistent with your own setting. In these cases you will receive
     * &#x60;\&quot;success\&quot;: true&#x60;, but the order status will be &#x60;expired&#x60;
     * after we check it. * &#x60;quantity&#x60; * 60 / &#x60;duration&#x60; should be larger than
     * minQty * &#x60;duration&#x60; cannot be less than 5 mins or more than 24 hours. * For
     * delivery contracts, TWAP end time should be one hour earlier than the delivery time of the
     * symbol. * You need to enable &#x60;Futures Trading Permission&#x60; for the api key which
     * requests this endpoint. * Base URL: https://api.binance.com Weight: 3000
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
     *     href="https://developers.binance.com/docs/algo/future-algo/Time-Weighted-Average-Price-New-Order">Time-Weighted
     *     Average Price(Twap) New Order(TRADE) Documentation</a>
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
     * Volume Participation(VP) New Order (TRADE) Send in a VP new order. Only support on USDⓈ-M
     * Contracts. * Total Algo open orders max allowed: &#x60;10&#x60; orders. * Leverage of symbols
     * and position mode will be the same as your futures account settings. You can set up through
     * the trading page or fapi. * Receiving &#x60;\&quot;success\&quot;: true&#x60; does not mean
     * that your order will be executed. Please use the query order endpoints（&#x60;GET
     * sapi/v1/algo/futures/openOrders&#x60; or &#x60;GET
     * sapi/v1/algo/futures/historicalOrders&#x60;） to check the order status. For example: Your
     * futures balance is insufficient, or open position with reduce only or position side is
     * inconsistent with your own setting. In these cases you will receive
     * &#x60;\&quot;success\&quot;: true&#x60;, but the order status will be &#x60;expired&#x60;
     * after we check it. * You need to enable &#x60;Futures Trading Permission&#x60; for the api
     * key which requests this endpoint. * Base URL: https://api.binance.com Weight: 300
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
     *     href="https://developers.binance.com/docs/algo/future-algo/Volume-Participation-New-Order">Volume
     *     Participation(VP) New Order (TRADE) Documentation</a>
     */
    public ApiResponse<VolumeParticipationFutureAlgoResponse> volumeParticipationFutureAlgo(
            VolumeParticipationFutureAlgoRequest volumeParticipationFutureAlgoRequest)
            throws ApiException {
        return futureAlgoApi.volumeParticipationFutureAlgo(volumeParticipationFutureAlgoRequest);
    }

    /**
     * Cancel Algo Order(TRADE) Cancel an open TWAP order Weight: 1
     *
     * @param algoId eg. 14511 (required)
     * @param recvWindow (optional)
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
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Cancel-Algo-Order">Cancel
     *     Algo Order(TRADE) Documentation</a>
     */
    public ApiResponse<CancelAlgoOrderSpotAlgoResponse> cancelAlgoOrderSpotAlgo(
            Long algoId, Long recvWindow) throws ApiException {
        return spotAlgoApi.cancelAlgoOrderSpotAlgo(algoId, recvWindow);
    }

    /**
     * Query Current Algo Open Orders(USER_DATA) Get all open SPOT TWAP orders Weight: 1
     *
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/docs/algo/spot-algo/Query-Current-Algo-Open-Orders">Query
     *     Current Algo Open Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentAlgoOpenOrdersSpotAlgoResponse>
            queryCurrentAlgoOpenOrdersSpotAlgo(Long recvWindow) throws ApiException {
        return spotAlgoApi.queryCurrentAlgoOpenOrdersSpotAlgo(recvWindow);
    }

    /**
     * Query Historical Algo Orders(USER_DATA) Get all historical SPOT TWAP orders Weight: 1
     *
     * @param symbol Trading symbol eg. BTCUSDT (optional)
     * @param side BUY or SELL (optional)
     * @param startTime in milliseconds eg.1641522717552 (optional)
     * @param endTime in milliseconds eg.1641522526562 (optional)
     * @param page Default is 1 (optional)
     * @param pageSize MIN 1, MAX 100; Default 100 (optional)
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/docs/algo/spot-algo/Query-Historical-Algo-Orders">Query
     *     Historical Algo Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryHistoricalAlgoOrdersSpotAlgoResponse> queryHistoricalAlgoOrdersSpotAlgo(
            String symbol,
            String side,
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
     * Query Sub Orders(USER_DATA) Get respective sub orders for a specified algoId Weight: 1
     *
     * @param algoId eg. 14511 (required)
     * @param page Default is 1 (optional)
     * @param pageSize MIN 1, MAX 100; Default 100 (optional)
     * @param recvWindow (optional)
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
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Query-Sub-Orders">Query Sub
     *     Orders(USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubOrdersSpotAlgoResponse> querySubOrdersSpotAlgo(
            Long algoId, Long page, Long pageSize, Long recvWindow) throws ApiException {
        return spotAlgoApi.querySubOrdersSpotAlgo(algoId, page, pageSize, recvWindow);
    }

    /**
     * Time-Weighted Average Price(Twap) New Order(TRADE) Place a new spot TWAP order with Algo
     * service. * Total Algo open orders max allowed: &#x60;20&#x60; orders. Weight: 3000
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
     *     href="https://developers.binance.com/docs/algo/spot-algo/Time-Weighted-Average-Price-New-Order">Time-Weighted
     *     Average Price(Twap) New Order(TRADE) Documentation</a>
     */
    public ApiResponse<TimeWeightedAveragePriceSpotAlgoResponse> timeWeightedAveragePriceSpotAlgo(
            TimeWeightedAveragePriceSpotAlgoRequest timeWeightedAveragePriceSpotAlgoRequest)
            throws ApiException {
        return spotAlgoApi.timeWeightedAveragePriceSpotAlgo(
                timeWeightedAveragePriceSpotAlgoRequest);
    }
}
