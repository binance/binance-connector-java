package com.binance.connector.client.stocks.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.model.CancelAllEquityOrdersResponse;
import com.binance.connector.client.stocks.rest.model.CancelEquityOrderResponse;
import com.binance.connector.client.stocks.rest.model.ConvertType;
import com.binance.connector.client.stocks.rest.model.CreateRenewListenKeyResponse;
import com.binance.connector.client.stocks.rest.model.CurrentOpenOrdersResponse;
import com.binance.connector.client.stocks.rest.model.EquityOrderDetailResponse;
import com.binance.connector.client.stocks.rest.model.EquityOrderHistoryResponse;
import com.binance.connector.client.stocks.rest.model.EquityTradeHistoryResponse;
import com.binance.connector.client.stocks.rest.model.ExchangeInfoResponse;
import com.binance.connector.client.stocks.rest.model.LatestQuoteResponse;
import com.binance.connector.client.stocks.rest.model.OrderType;
import com.binance.connector.client.stocks.rest.model.PlaceEquityOrderResponse;
import com.binance.connector.client.stocks.rest.model.Side;
import com.binance.connector.client.stocks.rest.model.SignUsEquityDisclaimerResponse;
import com.binance.connector.client.stocks.rest.model.TimeInForce;
import com.binance.connector.client.stocks.rest.model.TokenizedAssetsResponse;
import com.binance.connector.client.stocks.rest.model.TokenizedConvertHistoryResponse;
import com.binance.connector.client.stocks.rest.model.TokenizedConvertStatusResponse;
import com.binance.connector.client.stocks.rest.model.TokenizedMintResponse;
import com.binance.connector.client.stocks.rest.model.TokenizedRedeemResponse;
import com.binance.connector.client.stocks.rest.model.TradingSession;
import com.binance.connector.client.stocks.rest.model.WalletType;

public class StocksRestApi {

    private final AccountApi accountApi;
    private final MarketDataApi marketDataApi;
    private final TokenizedApi tokenizedApi;
    private final TradeApi tradeApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public StocksRestApi(ClientConfiguration configuration) {
        this(StocksRestApiUtil.getDefaultClient(configuration));
    }

    public StocksRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tokenizedApi = new TokenizedApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Sign US Equity Disclaimer (TRADE) Records the user&#39;s acknowledgement and acceptance of
     * the US equity disclaimer. This must be completed before the account can access certain US
     * equity trading features. The acceptance is tied to the account associated with the API key.
     * Weight: 1 Security Type: TRADE
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;SignUsEquityDisclaimerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sign US Equity Disclaimer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/account#sign-us-equity-disclaimer">Sign
     *     US Equity Disclaimer (TRADE) Documentation</a>
     */
    public ApiResponse<SignUsEquityDisclaimerResponse> signUsEquityDisclaimer(Long recvWindow)
            throws ApiException {
        return accountApi.signUsEquityDisclaimer(recvWindow);
    }

    /**
     * Exchange Info (MARKET_DATA) Returns current exchange trading rules and the list of tradable
     * US-equity symbols. MARKET_DATA endpoint — requires an API key (&#x60;X-MBX-APIKEY&#x60;) but
     * no signature. Response is served from a server-side cache. Weight: 1 Security Type:
     * MARKET_DATA
     *
     * @param symbol Filter to a single US-equity ticker, e.g. &#x60;AAPL&#x60;. When omitted,
     *     returns all active symbols. An unknown ticker returns an empty &#x60;symbols&#x60; array
     *     (HTTP 200), not an error. (optional)
     * @return ApiResponse&lt;ExchangeInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exchange Info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/market-data#exchange-info">Exchange
     *     Info (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<ExchangeInfoResponse> exchangeInfo(String symbol) throws ApiException {
        return marketDataApi.exchangeInfo(symbol);
    }

    /**
     * Latest Quote (MARKET_DATA) Returns the latest best bid / best ask for a single US-equity
     * ticker. The returned value is at most ~5 seconds stale. Returns an **empty response body**
     * (not the literal &#x60;null&#x60;) when no quote is available for the supplied ticker (e.g.
     * the ticker is unknown, halted, or de-listed). Weight: 1 Security Type: MARKET_DATA
     *
     * @param symbol US-equity ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. Case-insensitive;
     *     uppercased server-side. (required)
     * @return ApiResponse&lt;LatestQuoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Latest Quote </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/market-data#latest-quote">Latest
     *     Quote (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<LatestQuoteResponse> latestQuote(String symbol) throws ApiException {
        return marketDataApi.latestQuote(symbol);
    }

    /**
     * Tokenized Assets (MARKET_DATA) Returns the list of all tokenized assets currently available
     * for mint / redeem, together with each asset&#39;s underlying equity symbol and conversion
     * multiplier. MARKET_DATA endpoint — requires an API key (&#x60;X-MBX-APIKEY&#x60;) but no
     * signature. Response is served from a server-side cache. Weight: 1 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;TokenizedAssetsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Tokenized Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/market-data#tokenized-assets">Tokenized
     *     Assets (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<TokenizedAssetsResponse> tokenizedAssets() throws ApiException {
        return marketDataApi.tokenizedAssets();
    }

    /**
     * Tokenized Convert History (USER_DATA) Paged history of mint / redeem conversions for the
     * caller. Cursor-style pagination — supply the &#x60;nextLastId&#x60; from the previous
     * page&#39;s response to fetch the next page. Weight: 1 Security Type: USER_DATA
     *
     * @param startTime Start time (ms epoch). (optional)
     * @param endTime End time (ms epoch). (optional)
     * @param lastId Last record id from the previous page. Omit (or leave unset) to fetch the first
     *     page. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;TokenizedConvertHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Tokenized Convert History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/tokenized#tokenized-convert-history">Tokenized
     *     Convert History (USER_DATA) Documentation</a>
     */
    public ApiResponse<TokenizedConvertHistoryResponse> tokenizedConvertHistory(
            Long startTime, Long endTime, Long lastId, Integer size, Long recvWindow)
            throws ApiException {
        return tokenizedApi.tokenizedConvertHistory(startTime, endTime, lastId, size, recvWindow);
    }

    /**
     * Tokenized Convert Status (USER_DATA) Query the current status of a single mint / redeem
     * request by its &#x60;issuerRequestId&#x60;. Returns an empty object when no record matches
     * (caller&#39;s ID scope only). Weight: 1 Security Type: USER_DATA
     *
     * @param issuerRequestId Convert request id returned by &#x60;/tokenized/mint&#x60; or
     *     &#x60;/redeem&#x60;. (required)
     * @param convertType &#x60;MINT&#x60; or &#x60;REDEEM&#x60;. (required)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;TokenizedConvertStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Tokenized Convert Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/tokenized#tokenized-convert-status">Tokenized
     *     Convert Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<TokenizedConvertStatusResponse> tokenizedConvertStatus(
            String issuerRequestId, ConvertType convertType, Long recvWindow) throws ApiException {
        return tokenizedApi.tokenizedConvertStatus(issuerRequestId, convertType, recvWindow);
    }

    /**
     * Tokenized Mint (TRADE) Mint a tokenized asset from an underlying equity holding. The
     * caller&#39;s underlying equity (e.g. &#x60;AAPL&#x60;) is burned (or locked), and the
     * corresponding tokenized asset (e.g. &#x60;AAPLB&#x60;) is credited. The tokenized asset is
     * resolved server-side from &#x60;underlyingAsset&#x60;; callers only provide the underlying
     * ticker and quantity. Mint is asynchronous: the endpoint returns an
     * &#x60;issuerRequestId&#x60; immediately with a transient status; poll
     * &#x60;/tokenized/convert-status&#x60; to observe the terminal state, or inspect
     * &#x60;/tokenized/history&#x60; for the full record. Rate limit: 50 requests / min (UID).
     * Weight: 1 Security Type: TRADE
     *
     * @param underlyingAsset Underlying US-equity ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;.
     *     Resolved against the active-symbol list; unknown tickers return &#x60;-26004&#x60;. The
     *     target tokenized asset is looked up from this field via
     *     &#x60;/market/tokenized-assets&#x60;. (required)
     * @param underlyingAssetAmount Quantity of the underlying asset to mint from. Must be &gt; 0.
     *     (required)
     * @param clientOrderId Client order id for idempotency. Format
     *     &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Auto-generated when omitted. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;TokenizedMintResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Tokenized Mint </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/tokenized#tokenized-mint">Tokenized
     *     Mint (TRADE) Documentation</a>
     */
    public ApiResponse<TokenizedMintResponse> tokenizedMint(
            String underlyingAsset,
            String underlyingAssetAmount,
            String clientOrderId,
            Long recvWindow)
            throws ApiException {
        return tokenizedApi.tokenizedMint(
                underlyingAsset, underlyingAssetAmount, clientOrderId, recvWindow);
    }

    /**
     * Tokenized Redeem (TRADE) Redeem a tokenized asset back into the underlying equity. The
     * caller&#39;s tokenized asset (e.g. &#x60;AAPLB&#x60;) is burned, and the corresponding
     * underlying equity (e.g. &#x60;AAPL&#x60;) is released. The underlying asset is resolved
     * server-side from &#x60;tokenizedAsset&#x60;; callers only provide the tokenized asset and
     * quantity. Redeem is asynchronous: the endpoint returns an &#x60;issuerRequestId&#x60;
     * immediately with a transient status; poll &#x60;/tokenized/convert-status&#x60; to observe
     * the terminal state, or inspect &#x60;/tokenized/history&#x60; for the full record. Rate
     * limit: 200 requests / min (UID). Weight: 1 Security Type: TRADE
     *
     * @param tokenizedAsset Tokenized asset to redeem, e.g. &#x60;AAPLB&#x60;. Not a US-equity
     *     ticker — this is the on-chain tokenized asset identifier. Unknown asset returns
     *     &#x60;-1102&#x60; (the message currently says the parameter was empty/malformed, but it
     *     was in fact sent — it is simply unknown). The target underlying ticker is looked up from
     *     this field via &#x60;/market/tokenized-assets&#x60;. (required)
     * @param tokenizedAssetAmount Quantity of the tokenized asset to redeem. Must be &gt; 0.
     *     (required)
     * @param clientOrderId Client order id for idempotency. Format
     *     &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;. Auto-generated when omitted. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;TokenizedRedeemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Tokenized Redeem </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/tokenized#tokenized-redeem">Tokenized
     *     Redeem (TRADE) Documentation</a>
     */
    public ApiResponse<TokenizedRedeemResponse> tokenizedRedeem(
            String tokenizedAsset,
            String tokenizedAssetAmount,
            String clientOrderId,
            Long recvWindow)
            throws ApiException {
        return tokenizedApi.tokenizedRedeem(
                tokenizedAsset, tokenizedAssetAmount, clientOrderId, recvWindow);
    }

    /**
     * Cancel All Equity Orders (TRADE) Cancel all open orders for the caller. No request body is
     * required — the scope is all of the caller&#39;s open orders. The downstream service handles
     * idempotency; to inspect per-order outcomes, query &#x60;/order/history&#x60; after the call.
     * Weight: 1 Security Type: TRADE
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CancelAllEquityOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All Equity Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#cancel-all-equity-orders">Cancel
     *     All Equity Orders (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllEquityOrdersResponse> cancelAllEquityOrders(Long recvWindow)
            throws ApiException {
        return tradeApi.cancelAllEquityOrders(recvWindow);
    }

    /**
     * Cancel Equity Order (TRADE) Cancel a single open order by its &#x60;orderId&#x60;. Weight: 1
     * Security Type: TRADE
     *
     * @param orderId Equity order id returned by &#x60;/order/place&#x60; or a query endpoint.
     *     (required)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CancelEquityOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Equity Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#cancel-equity-order">Cancel
     *     Equity Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelEquityOrderResponse> cancelEquityOrder(String orderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelEquityOrder(orderId, recvWindow);
    }

    /**
     * Current Open Orders (USER_DATA) Query all unfinished (open) orders for the caller. No
     * business parameters are needed — user identity is derived from the signature. Weight: 1
     * Security Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;CurrentOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Current Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#current-open-orders">Current
     *     Open Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<CurrentOpenOrdersResponse> currentOpenOrders(Long recvWindow)
            throws ApiException {
        return tradeApi.currentOpenOrders(recvWindow);
    }

    /**
     * Equity Order Detail (USER_DATA) Returns a single order along with its trade execution list.
     * Callers can only read their own orders — the user identity is derived from the signed
     * request. Weight: 1 Security Type: USER_DATA
     *
     * @param orderId Equity order id. Either &#x60;orderId&#x60; or &#x60;clientOrderId&#x60; must
     *     be provided. (optional)
     * @param clientOrderId Client-supplied order id. Either &#x60;orderId&#x60; or
     *     &#x60;clientOrderId&#x60; must be provided. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;EquityOrderDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Equity Order Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#equity-order-detail">Equity
     *     Order Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<EquityOrderDetailResponse> equityOrderDetail(
            String orderId, String clientOrderId, Long recvWindow) throws ApiException {
        return tradeApi.equityOrderDetail(orderId, clientOrderId, recvWindow);
    }

    /**
     * Equity Order History (USER_DATA) Paged order history for the caller. Filters by symbol, order
     * type, side, status, and time range. Weight: 1 Security Type: USER_DATA
     *
     * @param startTime Start time (ms epoch). (required)
     * @param endTime End time (ms epoch). (required)
     * @param symbol US-equity ticker filter, e.g. &#x60;NVDA&#x60;. (optional)
     * @param orderType Order type filter: &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. (optional)
     * @param side Side filter: &#x60;BUY&#x60; / &#x60;SELL&#x60;. (optional)
     * @param orderStatus Comma-separated status filter. Allowed values: &#x60;FILLED&#x60;,
     *     &#x60;PARTIALLY_FILLED&#x60;, &#x60;CANCELED&#x60;, &#x60;EXPIRED&#x60;,
     *     &#x60;REJECTED&#x60;. (optional)
     * @param current Page number, 1-based. Default &#x60;1&#x60;. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;EquityOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Equity Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#equity-order-history">Equity
     *     Order History (USER_DATA) Documentation</a>
     */
    public ApiResponse<EquityOrderHistoryResponse> equityOrderHistory(
            Long startTime,
            Long endTime,
            String symbol,
            OrderType orderType,
            Side side,
            String orderStatus,
            Integer current,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return tradeApi.equityOrderHistory(
                startTime,
                endTime,
                symbol,
                orderType,
                side,
                orderStatus,
                current,
                size,
                recvWindow);
    }

    /**
     * Equity Trade History (USER_DATA) Paged equity trade (per-fill) history for the caller. Each
     * row is one execution, not one order — a partially filled order produces multiple rows.
     * Filters by symbol, side, specific &#x60;orderId&#x60;, and time range. Weight: 1 Security
     * Type: USER_DATA
     *
     * @param startTime Start time (ms epoch). (required)
     * @param endTime End time (ms epoch). (required)
     * @param symbol US-equity ticker filter, e.g. &#x60;NVDA&#x60;. (optional)
     * @param side Side filter: &#x60;BUY&#x60; / &#x60;SELL&#x60;. (optional)
     * @param orderId Narrow the result to executions of a single order. (optional)
     * @param current Page number, 1-based. Default &#x60;1&#x60;. (optional)
     * @param size Page size. Default &#x60;20&#x60;, max &#x60;100&#x60;. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;EquityTradeHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Equity Trade History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#equity-trade-history">Equity
     *     Trade History (USER_DATA) Documentation</a>
     */
    public ApiResponse<EquityTradeHistoryResponse> equityTradeHistory(
            Long startTime,
            Long endTime,
            String symbol,
            Side side,
            String orderId,
            Integer current,
            Integer size,
            Long recvWindow)
            throws ApiException {
        return tradeApi.equityTradeHistory(
                startTime, endTime, symbol, side, orderId, current, size, recvWindow);
    }

    /**
     * Place Equity Order (TRADE) Place a new equity order. Supports all combinations of
     * &#x60;LIMIT&#x60; / &#x60;MARKET&#x60; × &#x60;BUY&#x60; / &#x60;SELL&#x60;. For &#x60;LIMIT
     * BUY&#x60; orders the commission fee is automatically computed and reserved by the server at
     * placement time — callers submit &#x60;price&#x60; and &#x60;quantity&#x60; only, no
     * &#x60;fee&#x60; field is required. **Field combination matrix** | Side | OrderType | Required
     * | Forbidden | | ---- | --------- | -------- | --------- | | BUY | LIMIT | &#x60;price&#x60;,
     * &#x60;quantity&#x60;, &#x60;tradingSession&#x60; | &#x60;notional&#x60; | | BUY | MARKET |
     * &#x60;notional&#x60; | &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; |
     * | SELL | LIMIT | &#x60;price&#x60;, &#x60;quantity&#x60;, &#x60;tradingSession&#x60; |
     * &#x60;notional&#x60; | | SELL | MARKET | &#x60;quantity&#x60; | &#x60;price&#x60;,
     * &#x60;notional&#x60;, &#x60;tradingSession&#x60; | **Fractional shares**: when
     * &#x60;quantity&#x60; has a decimal component, or an order is placed by &#x60;notional&#x60;,
     * it is treated as a fractional-share order. A fractional-share &#x60;GTC&#x60; order must be
     * paired with &#x60;tradingSession &#x3D; EXTENDED&#x60; or &#x60;24H&#x60;. Rate limit: 200
     * requests / min (UID). Weight: 1 Security Type: TRADE
     *
     * @param symbol US stock ticker, e.g. &#x60;AAPL&#x60;, &#x60;TSLA&#x60;. Must be a symbol with
     *     tokenization enabled — check via &#x60;/market/tokenized-assets&#x60;. (required)
     * @param side &#x60;BUY&#x60; / &#x60;SELL&#x60;. (required)
     * @param orderType &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. (required)
     * @param quoteAsset Quote asset. Defaults to &#x60;USDC&#x60;; must be within the server&#39;s
     *     allowed set. (optional)
     * @param price **Required** for &#x60;LIMIT&#x60;; **forbidden** for &#x60;MARKET&#x60;.
     *     Maximum 2 decimal places. (optional)
     * @param quantity **Required** for &#x60;LIMIT&#x60; (both sides) and &#x60;SELL MARKET&#x60;;
     *     **forbidden** for &#x60;BUY MARKET&#x60;. (optional)
     * @param notional **Required** for &#x60;BUY MARKET&#x60;; **forbidden** for &#x60;LIMIT&#x60;
     *     and &#x60;SELL MARKET&#x60;. (optional)
     * @param timeInForce &#x60;DAY&#x60; (default) / &#x60;GTC&#x60;. &#x60;GTC&#x60; is only
     *     supported for &#x60;LIMIT&#x60; orders; a fractional-share &#x60;GTC&#x60; order must be
     *     paired with &#x60;tradingSession &#x3D; EXTENDED&#x60; or &#x60;24H&#x60;. (optional)
     * @param tradingSession &#x60;RTH&#x60; / &#x60;EXTENDED&#x60; / &#x60;24H&#x60;. **Required**
     *     for &#x60;LIMIT&#x60;; **forbidden** for &#x60;MARKET&#x60;. (optional)
     * @param walletType Payment wallet for &#x60;BUY&#x60; orders: &#x60;CARD&#x60; (default) /
     *     &#x60;MAIN&#x60;. &#x60;SELL&#x60; orders always settle to &#x60;CARD&#x60;. (optional)
     * @param clientOrderId Client-supplied order id. Format &#x60;^[a-zA-Z0-9-_]{32,36}$&#x60;.
     *     Auto-generated when omitted. (optional)
     * @param tokenize Whether to tokenize the purchased stock asset upon settlement. Default
     *     &#x60;true&#x60;. Set to &#x60;false&#x60; to receive the underlying equity directly
     *     instead of a tokenized asset. (optional)
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60;. (optional)
     * @return ApiResponse&lt;PlaceEquityOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place Equity Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/trade#place-equity-order">Place
     *     Equity Order (TRADE) Documentation</a>
     */
    public ApiResponse<PlaceEquityOrderResponse> placeEquityOrder(
            String symbol,
            Side side,
            OrderType orderType,
            String quoteAsset,
            String price,
            String quantity,
            String notional,
            TimeInForce timeInForce,
            TradingSession tradingSession,
            WalletType walletType,
            String clientOrderId,
            Boolean tokenize,
            Long recvWindow)
            throws ApiException {
        return tradeApi.placeEquityOrder(
                symbol,
                side,
                orderType,
                quoteAsset,
                price,
                quantity,
                notional,
                timeInForce,
                tradingSession,
                walletType,
                clientOrderId,
                tokenize,
                recvWindow);
    }

    /**
     * Create / Renew Listen Key (USER_STREAM) Create a new stock user-data-stream
     * &#x60;listenKey&#x60;, or renew an existing one. Calling this endpoint for the same user with
     * an active &#x60;listenKey&#x60; extends its validity; if there is no active key, a new one is
     * issued. Use the returned &#x60;listenKey&#x60; to subscribe to the stock user data stream.
     * Weight: 1 Security Type: USER_STREAM
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
     *     href="https://developers.binance.com/en/docs/catalog/advanced-trading-stocks-trading/api/rest-api/user-data-streams#create-renew-listen-key">Create
     *     / Renew Listen Key (USER_STREAM) Documentation</a>
     */
    public ApiResponse<CreateRenewListenKeyResponse> createRenewListenKey(Long recvWindow)
            throws ApiException {
        return userDataStreamsApi.createRenewListenKey(recvWindow);
    }
}
