package com.binance.connector.client.stock_options.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.model.CancelAllOptionOrdersResponse;
import com.binance.connector.client.stock_options.rest.model.CancelOptionOrderResponse;
import com.binance.connector.client.stock_options.rest.model.CreateRenewListenKeyResponse;
import com.binance.connector.client.stock_options.rest.model.CurrentOpenOptionOrdersResponse;
import com.binance.connector.client.stock_options.rest.model.ExercisableOptionsResponse;
import com.binance.connector.client.stock_options.rest.model.OptionContractsResponse;
import com.binance.connector.client.stock_options.rest.model.OptionExchangeInfoResponse;
import com.binance.connector.client.stock_options.rest.model.OptionExerciseDetailResponse;
import com.binance.connector.client.stock_options.rest.model.OptionExerciseHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.OptionExpirationsResponse;
import com.binance.connector.client.stock_options.rest.model.OptionOrderDetailResponse;
import com.binance.connector.client.stock_options.rest.model.OptionOrderHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.OptionPositionsResponse;
import com.binance.connector.client.stock_options.rest.model.OptionSettlementEventDetailResponse;
import com.binance.connector.client.stock_options.rest.model.OptionSettlementEventHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.OptionTradeHistoryResponse;
import com.binance.connector.client.stock_options.rest.model.PlaceOptionOrderResponse;
import com.binance.connector.client.stock_options.rest.model.PositionIntent;
import com.binance.connector.client.stock_options.rest.model.Side;
import com.binance.connector.client.stock_options.rest.model.SubmitOptionExerciseResponse;
import com.binance.connector.client.stock_options.rest.model.TimeInForce;
import com.binance.connector.client.stock_options.rest.model.WalletType;

public class StockOptionsRestApi {

    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;
    private final UserDataApi userDataApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public StockOptionsRestApi(ClientConfiguration configuration) {
        this(StockOptionsRestApiUtil.getDefaultClient(configuration));
    }

    public StockOptionsRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataApi = new UserDataApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Option Contracts (MARKET_DATA) Returns every option contract (calls and puts) of an
     * underlying for one expiration date. Reference data only — no market data. Sorted by
     * &#x60;strikePrice&#x60; ascending; for the same strike, &#x60;CALL&#x60; comes before
     * &#x60;PUT&#x60;. Not paginated. If there is no contract for the &#x60;(underlying, root,
     * expiration)&#x60; combination, an empty array is returned. Only the &#x60;X-MBX-APIKEY&#x60;
     * header is required; this endpoint is **not signed** and takes no &#x60;timestamp&#x60; /
     * &#x60;recvWindow&#x60;. Weight: 1 Security Type: MARKET_DATA
     *
     * @param underlyingSymbol Underlying US-equity ticker, e.g. &#x60;NVDA&#x60;. (required)
     * @param expirationDate Expiration date in &#x60;YYYY-MM-DD&#x60;, taken from Option
     *     Expirations. Other formats (e.g. &#x60;2026-9-30&#x60;, &#x60;2026/09/30&#x60;) are
     *     rejected. (required)
     * @param rootSymbol OCC root. If omitted, only **standard** contracts are returned. To list
     *     corporate-action-adjusted contracts (e.g. &#x60;GOOG1&#x60;), pass the
     *     &#x60;rootSymbol&#x60; from Option Expirations. (optional)
     * @return ApiResponse&lt;OptionContractsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Contracts </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/market-data#option-contracts">Option
     *     Contracts (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<OptionContractsResponse> optionContracts(
            String underlyingSymbol, String expirationDate, String rootSymbol) throws ApiException {
        return marketDataApi.optionContracts(underlyingSymbol, expirationDate, rootSymbol);
    }

    /**
     * Option Exchange Info (MARKET_DATA) Returns the trading rules of a single option contract,
     * combining contract-level data (type, strike, expiration, multiplier, deliverables) with
     * underlying-level configuration (price / quantity increments and limits). &#x60;symbol&#x60;
     * is **required**. Unlike the stock &#x60;exchangeInfo&#x60;, listing all contracts is not
     * supported. To browse contracts, use Option Expirations and Option Contracts. **Price
     * constraints**: a limit price must be a multiple of &#x60;tickSize&#x60;, and the order
     * notional (&#x60;price&#x60; × &#x60;quantity&#x60; × &#x60;multiplier&#x60;, excluding fees)
     * must fall within the closed interval &#x60;[minNotional, maxNotional]&#x60;. For a put
     * &#x60;SELL&#x60; order, the limit price cannot exceed the strike price. All of these values
     * are returned by this endpoint, so you can validate an order before placing it.
     * **&#x60;multiplier&#x60; vs &#x60;contractSize&#x60;**: &#x60;multiplier&#x60; is used to
     * calculate cost, &#x60;contractSize&#x60; is the number of shares delivered. Both are 100 for
     * standard contracts and may differ for contracts adjusted by a corporate action (split,
     * merger, special dividend). Always estimate cost with &#x60;multiplier&#x60;. Only the
     * &#x60;X-MBX-APIKEY&#x60; header is required; this endpoint is **not signed** and takes no
     * &#x60;timestamp&#x60; / &#x60;recvWindow&#x60;. Weight: 1 Security Type: MARKET_DATA
     *
     * @param symbol OCC contract symbol, e.g. &#x60;NVDA260930C00100000&#x60;. (required)
     * @return ApiResponse&lt;OptionExchangeInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Exchange Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/market-data#option-exchange-info">Option
     *     Exchange Info (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<OptionExchangeInfoResponse> optionExchangeInfo(String symbol)
            throws ApiException {
        return marketDataApi.optionExchangeInfo(symbol);
    }

    /**
     * Option Expirations (MARKET_DATA) Returns every expiration date currently tradable for an
     * underlying, in ascending &#x60;expirationDate&#x60; order. When standard and
     * corporate-action-adjusted contracts share an expiration date, **multiple** rows are returned
     * with the same &#x60;expirationDate&#x60; and different &#x60;rootSymbol&#x60;. To list the
     * adjusted set, pass that &#x60;rootSymbol&#x60; to Option Contracts. Reference data only — no
     * market data. An unknown underlying, or one without listed options, returns &#x60;-1121
     * Invalid symbol.&#x60; An empty array is never returned. Only the &#x60;X-MBX-APIKEY&#x60;
     * header is required; this endpoint is **not signed** and takes no &#x60;timestamp&#x60; /
     * &#x60;recvWindow&#x60;. Weight: 1 Security Type: MARKET_DATA
     *
     * @param underlyingSymbol Underlying US-equity ticker, e.g. &#x60;NVDA&#x60;. (required)
     * @return ApiResponse&lt;OptionExpirationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Expirations </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/market-data#option-expirations">Option
     *     Expirations (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<OptionExpirationsResponse> optionExpirations(String underlyingSymbol)
            throws ApiException {
        return marketDataApi.optionExpirations(underlyingSymbol);
    }

    /**
     * Cancel All Option Orders (TRADE) Cancel all of the caller&#39;s open orders. **This also
     * cancels open stock orders.** Cancel-all is account-level at the broker and does not
     * distinguish asset classes; it is the same operation as
     * &#x60;/sapi/v1/equity/order/cancel-all&#x60;. To cancel option orders only, fetch them with
     * Current Open Option Orders and cancel each one with Cancel Option Order. Errors on this
     * endpoint use the Stocks Trading error codes (&#x60;486xxx&#x60;). See Stocks Trading Error
     * Code. Weight: 1 Security Type: TRADE
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CancelAllOptionOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All Option Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/trade#cancel-all-option-orders">Cancel
     *     All Option Orders (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllOptionOrdersResponse> cancelAllOptionOrders(Long recvWindow)
            throws ApiException {
        return tradeApi.cancelAllOptionOrders(recvWindow);
    }

    /**
     * Cancel Option Order (TRADE) Cancel an open order by &#x60;orderId&#x60;. Cancellation applies
     * to the caller&#39;s own brokerage account and is not restricted by asset class: passing the
     * &#x60;orderId&#x60; of a stock order also cancels it, and
     * &#x60;/sapi/v1/equity/order/cancel&#x60; can likewise cancel option orders. Only the
     * caller&#39;s own orders can be canceled. Errors on this endpoint use the Stocks Trading error
     * codes (&#x60;486xxx&#x60;). See Stocks Trading Error Code. Weight: 1 Security Type: TRADE
     *
     * @param orderId Option order ID. (required)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CancelOptionOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Option Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/trade#cancel-option-order">Cancel
     *     Option Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelOptionOrderResponse> cancelOptionOrder(String orderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelOptionOrder(orderId, recvWindow);
    }

    /**
     * Place Option Order (TRADE) Place an option limit order. The server calculates the amount to
     * lock based on &#x60;positionIntent&#x60; and the contract type: buy to open locks the premium
     * plus fees; sell to open locks the underlying shares for a covered call, or the
     * strike-equivalent cash for a cash-secured put. Fees are calculated by the server; callers do
     * not pass payment details. **&#x60;positionIntent&#x60;**: may be omitted, in which case it is
     * derived from &#x60;side&#x60;: &#x60;BUY&#x60; → &#x60;BUY_TO_OPEN&#x60;, &#x60;SELL&#x60; →
     * &#x60;SELL_TO_CLOSE&#x60;. The derivation is unreliable in two cases, and an order without
     * &#x60;positionIntent&#x60; is rejected (parameter error): a &#x60;BUY&#x60; while you hold a
     * **short** position in the contract (it may be meant as &#x60;BUY_TO_CLOSE&#x60;), and a
     * &#x60;SELL&#x60; while you hold **no long** position in the contract (it can only be
     * &#x60;SELL_TO_OPEN&#x60;). Therefore always pass it for the short side
     * (&#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;). When passed, it must match
     * &#x60;side&#x60; (&#x60;BUY_*&#x60; with &#x60;BUY&#x60;, &#x60;SELL_*&#x60; with
     * &#x60;SELL&#x60;), otherwise the order is rejected. Only &#x60;LIMIT&#x60; orders with
     * &#x60;timeInForce &#x3D; DAY&#x60; are supported, and &#x60;quantity&#x60; must be a whole
     * number of contracts. Resubmitting with the **same** &#x60;clientOrderId&#x60; is idempotent:
     * if the original order was accepted or is still processing, the original order is returned
     * (&#x60;S&#x60; / &#x60;P&#x60;); if the original order failed, &#x60;497401&#x60; is
     * returned. If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection
     * error code after the order has already been submitted to the broker, the order may still be
     * processing. Retry with the **same** &#x60;clientOrderId&#x60; (a replay then returns
     * &#x60;P&#x60;) or query Option Order Detail by &#x60;clientOrderId&#x60; for the final
     * status. Do not retry with a new &#x60;clientOrderId&#x60;. Rate limit: 200 requests / min
     * (UID). Weight: 1 Security Type: TRADE
     *
     * @param symbol OCC contract symbol. (required)
     * @param side &#x60;BUY&#x60; / &#x60;SELL&#x60;. (required)
     * @param quantity Number of contracts. Must be a whole number, minimum &#x60;1&#x60;.
     *     (required)
     * @param price Limit price (premium) per share, minimum &#x60;0.01&#x60;, must be a multiple of
     *     &#x60;tickSize&#x60;. For a put &#x60;SELL&#x60; order it cannot exceed the strike price
     *     (&#x60;497438&#x60;). (required)
     * @param quoteAsset Quote asset. Only &#x60;USDC&#x60; (default) is supported; other values
     *     return &#x60;497104&#x60;. (optional)
     * @param positionIntent May be omitted and derived from &#x60;side&#x60; (&#x60;BUY&#x60; →
     *     &#x60;BUY_TO_OPEN&#x60;, &#x60;SELL&#x60; → &#x60;SELL_TO_CLOSE&#x60;); always pass it
     *     for the short side (&#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;). Must match
     *     &#x60;side&#x60; when passed. (optional)
     * @param timeInForce Only &#x60;DAY&#x60; (default) is supported. Other values return a
     *     parameter error. (optional)
     * @param walletType Payment wallet: &#x60;CARD&#x60; (default) / &#x60;MAIN&#x60;. (optional)
     * @param clientOrderId Client order ID. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Generated by
     *     the server when omitted. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;PlaceOptionOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place Option Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/trade#place-option-order">Place
     *     Option Order (TRADE) Documentation</a>
     */
    public ApiResponse<PlaceOptionOrderResponse> placeOptionOrder(
            String symbol,
            Side side,
            String quantity,
            String price,
            String quoteAsset,
            PositionIntent positionIntent,
            TimeInForce timeInForce,
            WalletType walletType,
            String clientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.placeOptionOrder(
                symbol,
                side,
                quantity,
                price,
                quoteAsset,
                positionIntent,
                timeInForce,
                walletType,
                clientOrderId,
                recvWindow);
    }

    /**
     * Submit Option Exercise (TRADE) Submit an exercise request for a long option position.
     * Requires the &#x60;TRADE&#x60; permission, because exercising changes positions and balances.
     * **Exercise is asynchronous.** The request returns &#x60;PROCESSING&#x60;; delivery is handled
     * by the broker. Poll Option Exercise Detail for the final status. &#x60;quantity&#x60; cannot
     * exceed &#x60;availableQty&#x60; from Exercisable Options. Resubmitting with the **same**
     * &#x60;clientOrderId&#x60; is idempotent: if the original exercise was accepted or is still
     * processing, it is returned with its current status; if it failed, &#x60;497401&#x60; is
     * returned. If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection
     * error code, the exercise **may still be processing**: retry with the same
     * &#x60;clientOrderId&#x60; or query Option Exercise Detail by &#x60;clientOrderId&#x60;. Do
     * not resubmit with a new &#x60;clientOrderId&#x60;. Weight: 1 Security Type: TRADE
     *
     * @param symbol OCC contract symbol to exercise. (required)
     * @param quantity Number of contracts to exercise. Whole number, minimum &#x60;1&#x60;, up to
     *     &#x60;availableQty&#x60;. (required)
     * @param quoteAsset Quote asset. Only &#x60;USDC&#x60; (default) is supported; other values
     *     return &#x60;497104&#x60;. (optional)
     * @param clientOrderId Client ID. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Generated by the
     *     server when omitted. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;SubmitOptionExerciseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Submit Option Exercise </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/trade#submit-option-exercise">Submit
     *     Option Exercise (TRADE) Documentation</a>
     */
    public ApiResponse<SubmitOptionExerciseResponse> submitOptionExercise(
            String symbol,
            String quantity,
            String quoteAsset,
            String clientOrderId,
            Long recvWindow)
            throws ApiException {
        return tradeApi.submitOptionExercise(
                symbol, quantity, quoteAsset, clientOrderId, recvWindow);
    }

    /**
     * Current Open Option Orders (USER_DATA) Query all of the caller&#39;s open **option** orders,
     * including the remaining quantity of partially filled orders. Stock orders are not included.
     * Weight: 1 Security Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CurrentOpenOptionOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Open Option Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#current-open-option-orders">Current
     *     Open Option Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<CurrentOpenOptionOrdersResponse> currentOpenOptionOrders(Long recvWindow)
            throws ApiException {
        return userDataApi.currentOpenOptionOrders(recvWindow);
    }

    /**
     * Exercisable Options (USER_DATA) Returns the contracts that can currently be exercised. Only
     * **long** positions are exercisable; the short side is the assigned party and has no exercise
     * right. &#x60;availableQty&#x60; is the maximum quantity for Submit Option Exercise. Weight: 1
     * Security Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;ExercisableOptionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exercisable Options </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#exercisable-options">Exercisable
     *     Options (USER_DATA) Documentation</a>
     */
    public ApiResponse<ExercisableOptionsResponse> exercisableOptions(Long recvWindow)
            throws ApiException {
        return userDataApi.exercisableOptions(recvWindow);
    }

    /**
     * Option Exercise Detail (USER_DATA) Query the result of a single exercise request. Provide at
     * least one of &#x60;tranId&#x60; and &#x60;clientOrderId&#x60;; omitting both returns
     * &#x60;-1102&#x60;. If both are provided, the lookup uses &#x60;clientOrderId&#x60; and
     * &#x60;tranId&#x60; is ignored (the opposite of Option Order Detail). Returns &#x60;497402
     * Order not found.&#x60; if no record is found or the record does not belong to the caller.
     * &#x60;errorCode&#x60; is returned only when &#x60;status&#x60; is &#x60;FAILED&#x60;. Weight:
     * 1 Security Type: USER_DATA
     *
     * @param tranId Exercise transaction ID returned by Submit Option Exercise. (optional)
     * @param clientOrderId Client ID used at submission. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionExerciseDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Exercise Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-exercise-detail">Option
     *     Exercise Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionExerciseDetailResponse> optionExerciseDetail(
            Long tranId, String clientOrderId, Long recvWindow) throws ApiException {
        return userDataApi.optionExerciseDetail(tranId, clientOrderId, recvWindow);
    }

    /**
     * Option Exercise History (USER_DATA) Paged exercise history. Weight: 1 Security Type:
     * USER_DATA
     *
     * @param status Comma-separated status filter: &#x60;PROCESSING&#x60; / &#x60;SUCCESS&#x60; /
     *     &#x60;FAILED&#x60;. (optional)
     * @param startTime Start time (ms). (optional)
     * @param endTime End time (ms). (optional)
     * @param current Page number. Default &#x60;1&#x60;. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionExerciseHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Exercise History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-exercise-history">Option
     *     Exercise History (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionExerciseHistoryResponse> optionExerciseHistory(
            String status,
            Long startTime,
            Long endTime,
            Integer current,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return userDataApi.optionExerciseHistory(
                status, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Option Order Detail (USER_DATA) Query a single option order with its fills and an itemized
     * fee breakdown. Provide at least one of &#x60;orderId&#x60; and &#x60;clientOrderId&#x60;;
     * omitting both returns &#x60;-1102&#x60;. If both are provided, the order is looked up by
     * &#x60;orderId&#x60;, and &#x60;clientOrderId&#x60; must belong to the same order, otherwise
     * &#x60;486218 Order not found&#x60; is returned. Only option orders are accepted: the
     * &#x60;orderId&#x60; / &#x60;clientOrderId&#x60; of a stock order returns &#x60;-2013 Order
     * does not exist.&#x60;; an unknown order ID returns &#x60;486218 Order not found&#x60;.
     * Example: a fully filled buy-to-open order — &#x60;filledTotal&#x60; &#x3D; &#x60;total&#x60;
     * &#x3D; 1.48 × 1 × 100 &#x3D; 148 (excluding fees); total fees &#x60;fee&#x60; &#x3D; 0.65
     * (&#x60;commission&#x60; + &#x60;cat&#x60; + &#x60;orf&#x60; + &#x60;occ&#x60;).
     * &#x60;sec&#x60; / &#x60;taf&#x60; are &#x60;0&#x60; for buy orders. For an order still in
     * progress with no fills, &#x60;fee&#x60; and the itemized fees are not returned
     * (&#x60;platformFee&#x60; is always &#x60;\&quot;0\&quot;&#x60;); for an order canceled or
     * expired without any fill, each fee item is &#x60;\&quot;0\&quot;&#x60;.
     * &#x60;canceledAt&#x60; / &#x60;expiredAt&#x60; are returned only in the corresponding status;
     * &#x60;settlementDate&#x60; is not returned for buy orders. Weight: 1 Security Type: USER_DATA
     *
     * @param orderId Option order ID. Provide at least one of &#x60;orderId&#x60; and
     *     &#x60;clientOrderId&#x60;. (optional)
     * @param clientOrderId Client order ID. Provide at least one of &#x60;orderId&#x60; and
     *     &#x60;clientOrderId&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionOrderDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Order Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-order-detail">Option
     *     Order Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionOrderDetailResponse> optionOrderDetail(
            String orderId, String clientOrderId, Long recvWindow) throws ApiException {
        return userDataApi.optionOrderDetail(orderId, clientOrderId, recvWindow);
    }

    /**
     * Option Order History (USER_DATA) Paged option order history, sorted by creation time in
     * descending order. Only option orders are returned; stock orders are not included. Weight: 1
     * Security Type: USER_DATA
     *
     * @param startTime Start of the order creation time (&#x60;createdAt&#x60;) filter (ms). If the
     *     span to &#x60;endTime&#x60; exceeds 180 days, it is truncated to 180 days before
     *     &#x60;endTime&#x60;. (required)
     * @param endTime End of the order creation time (&#x60;createdAt&#x60;) filter (ms). (required)
     * @param underlyingSymbol Underlying US-equity ticker filter, e.g. &#x60;NVDA&#x60;,
     *     case-insensitive. Matches orders on **all** contracts of that underlying, not a single
     *     OCC contract. An unlisted or delisted ticker returns &#x60;-26004&#x60;. (optional)
     * @param side &#x60;BUY&#x60; / &#x60;SELL&#x60;. (optional)
     * @param orderStatus Comma-separated status filter, without spaces: &#x60;FILLED&#x60; /
     *     &#x60;PARTIALLY_FILLED&#x60; / &#x60;CANCELED&#x60; / &#x60;EXPIRED&#x60; /
     *     &#x60;REJECTED&#x60;. If omitted, all statuses are returned except open orders with no
     *     fills (&#x60;NEW&#x60; / &#x60;ACCEPTED&#x60;, etc.). (optional)
     * @param current Page number. Default &#x60;1&#x60;. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-order-history">Option
     *     Order History (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionOrderHistoryResponse> optionOrderHistory(
            Long startTime,
            Long endTime,
            String underlyingSymbol,
            Side side,
            String orderStatus,
            Integer current,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return userDataApi.optionOrderHistory(
                startTime, endTime, underlyingSymbol, side, orderStatus, current, size, recvWindow);
    }

    /**
     * Option Positions (USER_DATA) Returns all current option positions. One record per contract;
     * see &#x60;side&#x60; for the direction. **&#x60;free&#x60; / &#x60;locked&#x60; are signed:
     * negative for short positions.** For example, with 3 short contracts of which 1 is reserved by
     * an open order, &#x60;free&#x60; &#x3D; &#x60;\&quot;-2\&quot;&#x60; and &#x60;locked&#x60;
     * &#x3D; &#x60;\&quot;-1\&quot;&#x60;. When closing (&#x60;SELL_TO_CLOSE&#x60; /
     * &#x60;BUY_TO_CLOSE&#x60;), the quantity you can order is the **absolute value** of
     * &#x60;free&#x60;. Positions past the last trading time and awaiting settlement are not
     * returned. Weight: 1 Security Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionPositionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Positions </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-positions">Option
     *     Positions (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionPositionsResponse> optionPositions(Long recvWindow)
            throws ApiException {
        return userDataApi.optionPositions(recvWindow);
    }

    /**
     * Option Settlement Event Detail (USER_DATA) Full detail of a single settlement event,
     * including the settlement basis and collateral release. Returns &#x60;-1102&#x60; if
     * &#x60;eventId&#x60; does not exist or does not belong to the caller. All fields of the
     * history endpoint are included, with two differences: &#x60;contracts&#x60; is an absolute
     * value, and &#x60;eventTime&#x60; is the time the settlement record was created. For an
     * &#x60;EXPIRY&#x60; event, &#x60;settlementKind&#x60;, &#x60;cashDirection&#x60;,
     * &#x60;amount&#x60; and &#x60;shareDelta&#x60; are not returned. For an &#x60;EXPIRY&#x60;
     * event on a short position (covered call / cash-secured put), &#x60;collateralRelease&#x60;
     * lists the collateral released. Weight: 1 Security Type: USER_DATA
     *
     * @param eventId Event ID from Option Settlement Event History. (required)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionSettlementEventDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Settlement Event Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-settlement-event-detail">Option
     *     Settlement Event Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionSettlementEventDetailResponse> optionSettlementEventDetail(
            String eventId, Long recvWindow) throws ApiException {
        return userDataApi.optionSettlementEventDetail(eventId, recvWindow);
    }

    /**
     * Option Settlement Event History (USER_DATA) Query option settlement events — the settlement
     * outcome of a contract: exercise, assignment or expiry (expired worthless), along with the
     * shares / cash delivered and the collateral released. Sorted by event time in descending
     * order. These records are on a settlement basis, separate from orders and trades. **Cursor
     * pagination.** Omit &#x60;lastId&#x60; on the first page, then pass the &#x60;nextLastId&#x60;
     * from the previous page until &#x60;hasMore&#x60; is &#x60;false&#x60;. Weight: 1 Security
     * Type: USER_DATA
     *
     * @param underlyingSymbol Underlying US-equity ticker filter. (optional)
     * @param symbol OCC contract symbol filter. If both &#x60;symbol&#x60; and
     *     &#x60;underlyingSymbol&#x60; are sent, &#x60;symbol&#x60; takes precedence. (optional)
     * @param eventType Comma-separated event type filter: &#x60;EXERCISE&#x60; /
     *     &#x60;ASSIGNMENT&#x60; / &#x60;EXPIRY&#x60;, case-insensitive. (optional)
     * @param startTime Start of the event time (&#x60;eventTime&#x60;) filter (ms). (optional)
     * @param endTime End of the event time (&#x60;eventTime&#x60;) filter (ms). (optional)
     * @param lastId Cursor returned by the previous page. Omit on the first page. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionSettlementEventHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Settlement Event History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-settlement-event-history">Option
     *     Settlement Event History (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionSettlementEventHistoryResponse> optionSettlementEventHistory(
            String underlyingSymbol,
            String symbol,
            String eventType,
            Long startTime,
            Long endTime,
            Long lastId,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return userDataApi.optionSettlementEventHistory(
                underlyingSymbol, symbol, eventType, startTime, endTime, lastId, size, recvWindow);
    }

    /**
     * Option Trade History (USER_DATA) Paged per-fill option trade history. Only option fills are
     * returned. Option fees are charged per order, so individual fills carry no fee; see
     * &#x60;fee&#x60; in Option Order History / Option Order Detail. Weight: 1 Security Type:
     * USER_DATA
     *
     * @param startTime Start of the execution time (&#x60;executionAt&#x60;) filter (ms).
     *     (required)
     * @param endTime End of the execution time (&#x60;executionAt&#x60;) filter (ms). (required)
     * @param underlyingSymbol Underlying US-equity ticker filter, e.g. &#x60;NVDA&#x60;,
     *     case-insensitive. Matches fills on **all** contracts of that underlying, not a single OCC
     *     contract. An unlisted or delisted ticker returns &#x60;-26004&#x60;. (optional)
     * @param side &#x60;BUY&#x60; / &#x60;SELL&#x60;. (optional)
     * @param orderId Return fills of this order only. (optional)
     * @param current Page number. Default &#x60;1&#x60;. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;OptionTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data#option-trade-history">Option
     *     Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionTradeHistoryResponse> optionTradeHistory(
            Long startTime,
            Long endTime,
            String underlyingSymbol,
            Side side,
            String orderId,
            Integer current,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return userDataApi.optionTradeHistory(
                startTime, endTime, underlyingSymbol, side, orderId, current, size, recvWindow);
    }

    /**
     * Create / Renew Listen Key (USER_STREAM) Create or renew the user data stream
     * &#x60;listenKey&#x60;. - **Valid for 1 hour.** Calling again renews it (resets to 1 hour) and
     * returns the **same** key; renewing every 30 minutes is recommended. After expiry, a new key
     * is issued and you must resubscribe with it. - **Options and stocks share one key.** The key
     * is issued per user, not per asset class. This endpoint and
     * &#x60;/sapi/v1/equity/listenKey&#x60; return the same key; calling either is enough. - Use
     * the key to subscribe to the Order Report V2 Stream. Weight: 1 Security Type: USER_STREAM
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CreateRenewListenKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create / Renew Listen Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stock-option-trading/api/rest-api/user-data-streams#create-renew-listen-key">Create
     *     / Renew Listen Key (USER_STREAM) Documentation</a>
     */
    public ApiResponse<CreateRenewListenKeyResponse> createRenewListenKey(Long recvWindow)
            throws ApiException {
        return userDataStreamsApi.createRenewListenKey(recvWindow);
    }
}
