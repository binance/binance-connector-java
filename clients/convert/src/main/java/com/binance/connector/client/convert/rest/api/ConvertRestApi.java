package com.binance.connector.client.convert.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.model.AcceptQuoteRequest;
import com.binance.connector.client.convert.rest.model.AcceptQuoteResponse;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderResponse;
import com.binance.connector.client.convert.rest.model.GetConvertTradeHistoryResponse;
import com.binance.connector.client.convert.rest.model.ListAllConvertPairsResponse;
import com.binance.connector.client.convert.rest.model.OrderStatusResponse;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderResponse;
import com.binance.connector.client.convert.rest.model.QueryLimitOpenOrdersResponse;
import com.binance.connector.client.convert.rest.model.QueryOrderQuantityPrecisionPerAssetResponse;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestResponse;

public class ConvertRestApi {

    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;

    public ConvertRestApi(ClientConfiguration configuration) {
        this(ConvertRestApiUtil.getDefaultClient(configuration));
    }

    public ConvertRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
    }

    /**
     * List All Convert Pairs Query for all convertible token pairs and the tokens’ respective
     * upper/lower limits Weight(IP): 3000 Notes: - User needs to supply either or both input
     * parameters. - If only one of &#x60;fromAsset&#x60; and &#x60;toAsset&#x60; is provided, only
     * partial token pairs are returned.
     *
     * @param fromAsset User spends coin (optional)
     * @param toAsset User receives coin (optional)
     * @return ApiResponse&lt;ListAllConvertPairsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List All Convert Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/market-data#list-all-convert-pairs">List
     *     All Convert Pairs Documentation</a>
     */
    public ApiResponse<ListAllConvertPairsResponse> listAllConvertPairs(
            String fromAsset, String toAsset) throws ApiException {
        return marketDataApi.listAllConvertPairs(fromAsset, toAsset);
    }

    /**
     * Query order quantity precision per asset (USER_DATA) Query for supported asset’s precision
     * information Weight(IP): 100 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryOrderQuantityPrecisionPerAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> order quantity precision per asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/market-data#query-order-quantity-precision-per-asset">Query
     *     order quantity precision per asset (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOrderQuantityPrecisionPerAssetResponse>
            queryOrderQuantityPrecisionPerAsset(Long recvWindow) throws ApiException {
        return marketDataApi.queryOrderQuantityPrecisionPerAsset(recvWindow);
    }

    /**
     * Accept Quote (TRADE) Accept the offered quote by quote ID. Weight(UID): 500 Security Type:
     * TRADE
     *
     * @param acceptQuoteRequest (required)
     * @return ApiResponse&lt;AcceptQuoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Accept Quote </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#accept-quote">Accept
     *     Quote (TRADE) Documentation</a>
     */
    public ApiResponse<AcceptQuoteResponse> acceptQuote(AcceptQuoteRequest acceptQuoteRequest)
            throws ApiException {
        return tradeApi.acceptQuote(acceptQuoteRequest);
    }

    /**
     * Cancel limit order (TRADE) Enable users to cancel a limit order Weight(UID): 200 Security
     * Type: TRADE
     *
     * @param cancelLimitOrderRequest (required)
     * @return ApiResponse&lt;CancelLimitOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel limit order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#cancel-limit-order">Cancel
     *     limit order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelLimitOrderResponse> cancelLimitOrder(
            CancelLimitOrderRequest cancelLimitOrderRequest) throws ApiException {
        return tradeApi.cancelLimitOrder(cancelLimitOrderRequest);
    }

    /**
     * Get Convert Trade History (USER_DATA) Get Convert Trade History Weight(UID): 3000 Security
     * Type: USER_DATA Notes: - The max interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; is 30 days.
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param limit Number of records to return (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetConvertTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Convert Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#get-convert-trade-history">Get
     *     Convert Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetConvertTradeHistoryResponse> getConvertTradeHistory(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        return tradeApi.getConvertTradeHistory(startTime, endTime, limit, recvWindow);
    }

    /**
     * Order status (USER_DATA) Query order status by order ID. Weight(UID): 100 Security Type:
     * USER_DATA
     *
     * @param orderId Either orderId or quoteId is required (optional)
     * @param quoteId Either orderId or quoteId is required (optional)
     * @return ApiResponse&lt;OrderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#order-status">Order
     *     status (USER_DATA) Documentation</a>
     */
    public ApiResponse<OrderStatusResponse> orderStatus(String orderId, String quoteId)
            throws ApiException {
        return tradeApi.orderStatus(orderId, quoteId);
    }

    /**
     * Place limit order (TRADE) Enable users to place a limit order Weight(UID): 500 Security Type:
     * TRADE Notes: - &#x60;baseAsset&#x60; and &#x60;quoteAsset&#x60; can be determined via the
     * &#x60;exchangeInfo&#x60; endpoint. - Limit price is defined from &#x60;baseAsset&#x60; to
     * &#x60;quoteAsset&#x60;. - Exactly one of &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60;
     * should be sent.
     *
     * @param placeLimitOrderRequest (required)
     * @return ApiResponse&lt;PlaceLimitOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place limit order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#place-limit-order">Place
     *     limit order (TRADE) Documentation</a>
     */
    public ApiResponse<PlaceLimitOrderResponse> placeLimitOrder(
            PlaceLimitOrderRequest placeLimitOrderRequest) throws ApiException {
        return tradeApi.placeLimitOrder(placeLimitOrderRequest);
    }

    /**
     * Query limit open orders (USER_DATA) Query current open limit orders Weight(UID): 3000
     * Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryLimitOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> limit open orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#query-limit-open-orders">Query
     *     limit open orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryLimitOpenOrdersResponse> queryLimitOpenOrders(Long recvWindow)
            throws ApiException {
        return tradeApi.queryLimitOpenOrders(recvWindow);
    }

    /**
     * Send Quote Request (TRADE) Request a quote for the requested token pairs Weight(UID): 200
     * Security Type: TRADE Notes: - Either &#x60;fromAmount&#x60; or &#x60;toAmount&#x60; should be
     * sent. - &#x60;quoteId&#x60; is returned only if you have enough funds to convert.
     *
     * @param sendQuoteRequestRequest (required)
     * @return ApiResponse&lt;SendQuoteRequestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Send Quote Request </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-convert/api/rest-api/trade#send-quote-request">Send
     *     Quote Request (TRADE) Documentation</a>
     */
    public ApiResponse<SendQuoteRequestResponse> sendQuoteRequest(
            SendQuoteRequestRequest sendQuoteRequestRequest) throws ApiException {
        return tradeApi.sendQuoteRequest(sendQuoteRequestRequest);
    }
}
