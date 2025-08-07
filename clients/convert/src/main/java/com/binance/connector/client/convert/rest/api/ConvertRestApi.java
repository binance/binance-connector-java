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
import com.binance.connector.client.convert.rest.model.QueryLimitOpenOrdersRequest;
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
     * upper/lower limits * User needs to supply either or both of the input parameter * If not
     * defined for both fromAsset and toAsset, only partial token pairs will be returned Weight:
     * 3000(IP)
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
     * @see <a href="https://developers.binance.com/docs/convert/market-data/">List All Convert
     *     Pairs Documentation</a>
     */
    public ApiResponse<ListAllConvertPairsResponse> listAllConvertPairs(
            String fromAsset, String toAsset) throws ApiException {
        return marketDataApi.listAllConvertPairs(fromAsset, toAsset);
    }

    /**
     * Query order quantity precision per asset(USER_DATA) Query for supported asset’s precision
     * information Weight: 100(IP)
     *
     * @param recvWindow The value cannot be greater than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/convert/market-data/Query-order-quantity-precision-per-asset">Query
     *     order quantity precision per asset(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOrderQuantityPrecisionPerAssetResponse>
            queryOrderQuantityPrecisionPerAsset(Long recvWindow) throws ApiException {
        return marketDataApi.queryOrderQuantityPrecisionPerAsset(recvWindow);
    }

    /**
     * Accept Quote (TRADE) Accept the offered quote by quote ID. Weight: 500(UID)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Accept-Quote">Accept Quote
     *     (TRADE) Documentation</a>
     */
    public ApiResponse<AcceptQuoteResponse> acceptQuote(AcceptQuoteRequest acceptQuoteRequest)
            throws ApiException {
        return tradeApi.acceptQuote(acceptQuoteRequest);
    }

    /**
     * Cancel limit order (USER_DATA) Enable users to cancel a limit order Weight: 200(UID)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Cancel-Order">Cancel limit
     *     order (USER_DATA) Documentation</a>
     */
    public ApiResponse<CancelLimitOrderResponse> cancelLimitOrder(
            CancelLimitOrderRequest cancelLimitOrderRequest) throws ApiException {
        return tradeApi.cancelLimitOrder(cancelLimitOrderRequest);
    }

    /**
     * Get Convert Trade History(USER_DATA) Get Convert Trade History * The max interval between
     * startTime and endTime is 30 days. Weight: 3000
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param limit Default 100, Max 1000 (optional)
     * @param recvWindow The value cannot be greater than 60000 (optional)
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
     *     href="https://developers.binance.com/docs/convert/trade/Get-Convert-Trade-History">Get
     *     Convert Trade History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetConvertTradeHistoryResponse> getConvertTradeHistory(
            Long startTime, Long endTime, Long limit, Long recvWindow) throws ApiException {
        return tradeApi.getConvertTradeHistory(startTime, endTime, limit, recvWindow);
    }

    /**
     * Order status(USER_DATA) Query order status by order ID. Weight: 100(UID)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Order-Status">Order
     *     status(USER_DATA) Documentation</a>
     */
    public ApiResponse<OrderStatusResponse> orderStatus(String orderId, String quoteId)
            throws ApiException {
        return tradeApi.orderStatus(orderId, quoteId);
    }

    /**
     * Place limit order (USER_DATA) Enable users to place a limit order * &#x60;baseAsset&#x60; or
     * &#x60;quoteAsset&#x60; can be determined via &#x60;exchangeInfo&#x60; endpoint. * Limit price
     * is defined from &#x60;baseAsset&#x60; to &#x60;quoteAsset&#x60;. * Either
     * &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60; is used. Weight: 500(UID)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Place-Order">Place limit
     *     order (USER_DATA) Documentation</a>
     */
    public ApiResponse<PlaceLimitOrderResponse> placeLimitOrder(
            PlaceLimitOrderRequest placeLimitOrderRequest) throws ApiException {
        return tradeApi.placeLimitOrder(placeLimitOrderRequest);
    }

    /**
     * Query limit open orders (USER_DATA) Request a quote for the requested token pairs Weight:
     * 3000(UID)
     *
     * @param queryLimitOpenOrdersRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Query-Order">Query limit open
     *     orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryLimitOpenOrdersResponse> queryLimitOpenOrders(
            QueryLimitOpenOrdersRequest queryLimitOpenOrdersRequest) throws ApiException {
        return tradeApi.queryLimitOpenOrders(queryLimitOpenOrdersRequest);
    }

    /**
     * Send Quote Request(USER_DATA) Request a quote for the requested token pairs * Either
     * fromAmount or toAmount should be sent * &#x60;quoteId&#x60; will be returned only if you have
     * enough funds to convert Weight: 200(UID)
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
     * @see <a href="https://developers.binance.com/docs/convert/trade/Send-quote-request">Send
     *     Quote Request(USER_DATA) Documentation</a>
     */
    public ApiResponse<SendQuoteRequestResponse> sendQuoteRequest(
            SendQuoteRequestRequest sendQuoteRequestRequest) throws ApiException {
        return tradeApi.sendQuoteRequest(sendQuoteRequestRequest);
    }
}
