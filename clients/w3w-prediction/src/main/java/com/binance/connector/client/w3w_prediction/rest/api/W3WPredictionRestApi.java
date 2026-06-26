package com.binance.connector.client.w3w_prediction.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.model.BatchCancelOrdersRequest;
import com.binance.connector.client.w3w_prediction.rest.model.BatchCancelOrdersResponse;
import com.binance.connector.client.w3w_prediction.rest.model.BatchRedeemRequest;
import com.binance.connector.client.w3w_prediction.rest.model.BatchRedeemResponse;
import com.binance.connector.client.w3w_prediction.rest.model.CreateInboundTransferRequest;
import com.binance.connector.client.w3w_prediction.rest.model.CreateInboundTransferResponse;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOutboundTransferRequest;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOutboundTransferResponse;
import com.binance.connector.client.w3w_prediction.rest.model.Direction;
import com.binance.connector.client.w3w_prediction.rest.model.GetMarketDetailResponse;
import com.binance.connector.client.w3w_prediction.rest.model.GetPortfolioResponse;
import com.binance.connector.client.w3w_prediction.rest.model.GetPositionByTokenResponse;
import com.binance.connector.client.w3w_prediction.rest.model.GetQuotaStatusResponse;
import com.binance.connector.client.w3w_prediction.rest.model.GetQuoteRequest;
import com.binance.connector.client.w3w_prediction.rest.model.GetQuoteResponse;
import com.binance.connector.client.w3w_prediction.rest.model.GetRedeemStatusResponse;
import com.binance.connector.client.w3w_prediction.rest.model.ListPredictionCategoriesResponse;
import com.binance.connector.client.w3w_prediction.rest.model.ListPredictionMarketsResponse;
import com.binance.connector.client.w3w_prediction.rest.model.ListPredictionWalletsResponse;
import com.binance.connector.client.w3w_prediction.rest.model.MarketSearchResponse;
import com.binance.connector.client.w3w_prediction.rest.model.OrderBy;
import com.binance.connector.client.w3w_prediction.rest.model.OrderType;
import com.binance.connector.client.w3w_prediction.rest.model.PlaceOrderRequest;
import com.binance.connector.client.w3w_prediction.rest.model.PlaceOrderResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryActiveOrdersResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryLastTradePriceResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryOrderBookResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryOrderHistoryResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPaymentOptionBalancesResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPnLResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPositionsByFilterResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryPositionsResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QuerySettledPositionHistoryResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryTransferListResponse;
import com.binance.connector.client.w3w_prediction.rest.model.QueryTransferStatusResponse;
import com.binance.connector.client.w3w_prediction.rest.model.SortBy;
import com.binance.connector.client.w3w_prediction.rest.model.TradeSide;

public class W3WPredictionRestApi {

    private final MarketDataApi marketDataApi;
    private final PositionApi positionApi;
    private final RedeemApi redeemApi;
    private final TradeApi tradeApi;
    private final TransferApi transferApi;
    private final WalletApi walletApi;

    public W3WPredictionRestApi(ClientConfiguration configuration) {
        this(W3WPredictionRestApiUtil.getDefaultClient(configuration));
    }

    public W3WPredictionRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.positionApi = new PositionApi(apiClient);
        this.redeemApi = new RedeemApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.transferApi = new TransferApi(apiClient);
        this.walletApi = new WalletApi(apiClient);
    }

    /**
     * Get Market Detail Get full details for a specific prediction market topic, including variant
     * data and timeline. Weight(IP): 200
     *
     * @param marketTopicId Market topic ID. Must be &gt; 0 (required)
     * @return ApiResponse&lt;GetMarketDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Market Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#get-market-detail">Get
     *     Market Detail Documentation</a>
     */
    public ApiResponse<GetMarketDetailResponse> getMarketDetail(Long marketTopicId)
            throws ApiException {
        return marketDataApi.getMarketDetail(marketTopicId);
    }

    /**
     * List Prediction Categories Get all available prediction market categories (L1 and L2).
     * Weight(IP): 200
     *
     * @return ApiResponse&lt;ListPredictionCategoriesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List Prediction Categories </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#list-prediction-categories">List
     *     Prediction Categories Documentation</a>
     */
    public ApiResponse<ListPredictionCategoriesResponse> listPredictionCategories()
            throws ApiException {
        return marketDataApi.listPredictionCategories();
    }

    /**
     * List Prediction Markets Get a paginated list of prediction market topics, with optional
     * category and sort filters. Weight(IP): 200
     *
     * @param l1Category Level-1 category filter (optional)
     * @param l2Category Level-2 category filter (optional)
     * @param sortBy Sort field. Enum: &#x60;RECOMMENDED&#x60;, &#x60;VOLUME&#x60;,
     *     &#x60;PARTICIPANTS&#x60;, &#x60;CREATED_TIME&#x60;, &#x60;END_DATE&#x60; (optional)
     * @param orderBy Sort direction. Enum: &#x60;ASC&#x60;, &#x60;DESC&#x60; (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @return ApiResponse&lt;ListPredictionMarketsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List Prediction Markets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#list-prediction-markets">List
     *     Prediction Markets Documentation</a>
     */
    public ApiResponse<ListPredictionMarketsResponse> listPredictionMarkets(
            String l1Category,
            String l2Category,
            SortBy sortBy,
            OrderBy orderBy,
            Integer offset,
            Integer limit)
            throws ApiException {
        return marketDataApi.listPredictionMarkets(
                l1Category, l2Category, sortBy, orderBy, offset, limit);
    }

    /**
     * Market Search Semantic search for prediction market topics by keyword. Weight(IP): 200
     *
     * @param query Search keyword. Not blank (required)
     * @param topK Max number of results to return. Default &#x60;20&#x60;, range 1–50 (optional)
     * @return ApiResponse&lt;MarketSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Market Search </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#market-search">Market
     *     Search Documentation</a>
     */
    public ApiResponse<MarketSearchResponse> marketSearch(String query, Integer topK)
            throws ApiException {
        return marketDataApi.marketSearch(query, topK);
    }

    /**
     * Query Last Trade Price Get the most recent trade price for a prediction market. Weight(IP):
     * 200
     *
     * @param marketId Market ID. Must be &gt; 0 (required)
     * @return ApiResponse&lt;QueryLastTradePriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Last Trade Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#query-last-trade-price">Query
     *     Last Trade Price Documentation</a>
     */
    public ApiResponse<QueryLastTradePriceResponse> queryLastTradePrice(Long marketId)
            throws ApiException {
        return marketDataApi.queryLastTradePrice(marketId);
    }

    /**
     * Query Order Book Get the current order book (bids and asks) for a specific prediction market
     * outcome token. Weight(IP): 200
     *
     * @param vendor Vendor identifier (e.g. &#x60;predict_fun&#x60;) (required)
     * @param marketId Market ID. Must be &gt; 0 (required)
     * @param tokenId Prediction outcome token ID (required)
     * @return ApiResponse&lt;QueryOrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Order Book </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/market-data#query-order-book">Query
     *     Order Book Documentation</a>
     */
    public ApiResponse<QueryOrderBookResponse> queryOrderBook(
            String vendor, Long marketId, String tokenId) throws ApiException {
        return marketDataApi.queryOrderBook(vendor, marketId, tokenId);
    }

    /**
     * Get Position by Token Get the authenticated user&#39;s position detail for a specific
     * prediction token. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param tokenId Prediction outcome token ID (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetPositionByTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Position by Token </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/position#get-position-by-token">Get
     *     Position by Token Documentation</a>
     */
    public ApiResponse<GetPositionByTokenResponse> getPositionByToken(
            String walletAddress, String tokenId, Long recvWindow) throws ApiException {
        return positionApi.getPositionByToken(walletAddress, tokenId, recvWindow);
    }

    /**
     * Query PnL Query profit and loss records for the authenticated user&#39;s prediction
     * positions. When &#x60;tokenId&#x60; is provided, returns a single record in &#x60;pnl&#x60;;
     * otherwise returns a list in &#x60;pnlList&#x60;. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param tokenId Filter by prediction token ID (optional)
     * @param marketId Filter by market ID. Must be &gt; 0 (optional)
     * @param marketTopicId Filter by market topic ID. Must be &gt; 0 (optional)
     * @param activeOnly If &#x60;true&#x60;, return only active (unresolved) positions (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryPnLResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query PnL </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/position#query-pn-l">Query
     *     PnL Documentation</a>
     */
    public ApiResponse<QueryPnLResponse> queryPnL(
            String walletAddress,
            String tokenId,
            Long marketId,
            Long marketTopicId,
            Boolean activeOnly,
            Long recvWindow)
            throws ApiException {
        return positionApi.queryPnL(
                walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow);
    }

    /**
     * Query Positions Get the authenticated user&#39;s prediction token positions with portfolio
     * summary and tab-based filtering. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param tab Position status tab. Values from &#x60;PositionQueryType&#x60;. Default
     *     &#x60;ONGOING&#x60; (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryPositionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Positions </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/position#query-positions">Query
     *     Positions Documentation</a>
     */
    public ApiResponse<QueryPositionsResponse> queryPositions(
            String walletAddress, String tab, Integer offset, Integer limit, Long recvWindow)
            throws ApiException {
        return positionApi.queryPositions(walletAddress, tab, offset, limit, recvWindow);
    }

    /**
     * Query Positions by Filter Get prediction positions filtered by wallet address and/or market
     * topic ID. Both parameters are optional. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (optional)
     * @param marketTopicId Filter by market topic ID (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryPositionsByFilterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Positions by Filter </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/position#query-positions-by-filter">Query
     *     Positions by Filter Documentation</a>
     */
    public ApiResponse<QueryPositionsByFilterResponse> queryPositionsByFilter(
            String walletAddress, Long marketTopicId, Long recvWindow) throws ApiException {
        return positionApi.queryPositionsByFilter(walletAddress, marketTopicId, recvWindow);
    }

    /**
     * Query Settled Position History Get the authenticated user&#39;s settled (resolved) prediction
     * position history with optional filters. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param l1Category Filter by level-1 category (optional)
     * @param result Settlement result filter (optional)
     * @param startDate Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60;
     *     (optional)
     * @param endDate End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60;
     *     (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QuerySettledPositionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Settled Position History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/position#query-settled-position-history">Query
     *     Settled Position History Documentation</a>
     */
    public ApiResponse<QuerySettledPositionHistoryResponse> querySettledPositionHistory(
            String walletAddress,
            String l1Category,
            Integer result,
            String startDate,
            String endDate,
            Integer offset,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return positionApi.querySettledPositionHistory(
                walletAddress, l1Category, result, startDate, endDate, offset, limit, recvWindow);
    }

    /**
     * Batch Redeem Redeem one or more settled prediction tokens on-chain to claim winnings.
     * Requires SAS authorization. Weight(IP): 200 Security Type: TRADE
     *
     * @param batchRedeemRequest (required)
     * @return ApiResponse&lt;BatchRedeemResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Batch Redeem </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/redeem#batch-redeem">Batch
     *     Redeem Documentation</a>
     */
    public ApiResponse<BatchRedeemResponse> batchRedeem(BatchRedeemRequest batchRedeemRequest)
            throws ApiException {
        return redeemApi.batchRedeem(batchRedeemRequest);
    }

    /**
     * Get Redeem Status Query the on-chain transaction status of a previously submitted redeem
     * request. Weight(IP): 200 Security Type: USER_DATA Response Notes: - Status values: | Value |
     * Description | | ----------- | -------------------------------------------- | |
     * &#x60;PENDING&#x60; | Transaction submitted, awaiting confirmation | | &#x60;CONFIRMED&#x60;
     * | Transaction confirmed on-chain | | &#x60;FAILED&#x60; | Transaction failed | |
     * &#x60;NOT_FOUND&#x60; | Transaction hash not found |
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param txHash Redeem transaction hash (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetRedeemStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Redeem Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/redeem#get-redeem-status">Get
     *     Redeem Status Documentation</a>
     */
    public ApiResponse<GetRedeemStatusResponse> getRedeemStatus(
            String walletAddress, String txHash, Long recvWindow) throws ApiException {
        return redeemApi.getRedeemStatus(walletAddress, txHash, recvWindow);
    }

    /**
     * Batch Cancel Orders Cancel one or more active prediction orders in a single request. Requires
     * SAS authorization. **Known Issue — Bracket Encoding Incompatibility:** This endpoint uses
     * indexed bracket notation (&#x60;cancelInfoList[0].orderId&#x60;). Binance SAPI signature
     * verification runs over the **raw, unencoded** canonical string. However, mainstream HTTP
     * libraries (Python &#x60;requests&#x60;, Java &#x60;HttpURLConnection&#x60;/&#x60;URI&#x60;,
     * Go &#x60;net/url&#x60;, Node.js &#x60;url&#x60;) automatically percent-encode &#x60;[&#x60; →
     * &#x60;%5B&#x60; and &#x60;]&#x60; → &#x60;%5D&#x60;, producing a signature mismatch with
     * error &#x60;-1022 Signature for this request is not valid&#x60;. Postman is unaffected
     * because it does not encode keys. **Workarounds** (use low-level HTTP APIs that do not
     * normalize URLs): - **Python:** use &#x60;http.client&#x60; (stdlib) and hand-build the body
     * string. - **Java:** use &#x60;HttpURLConnection&#x60; and write the raw body bytes directly.
     * - **Go:** use &#x60;strings.NewReader&#x60; with a hand-built body instead of
     * &#x60;url.Values.Encode()&#x60;. Weight(IP): 200 Security Type: TRADE Notes: - Use dot
     * notation for nested list fields: &#x60;cancelInfoList[0].orderId&#x60;,
     * &#x60;cancelInfoList[1].orderId&#x60;, etc. - &#x60;vendor&#x60; does not need to be
     * supplied. The server automatically sets the correct vendor (&#x60;predict_fun&#x60;) for
     * every item in the batch.
     *
     * @param batchCancelOrdersRequest (required)
     * @return ApiResponse&lt;BatchCancelOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Batch Cancel Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/trade#batch-cancel-orders">Batch
     *     Cancel Orders Documentation</a>
     */
    public ApiResponse<BatchCancelOrdersResponse> batchCancelOrders(
            BatchCancelOrdersRequest batchCancelOrdersRequest) throws ApiException {
        return tradeApi.batchCancelOrders(batchCancelOrdersRequest);
    }

    /**
     * Get Quote Get a price quote for a prediction order. The returned &#x60;quoteId&#x60; must be
     * used in the subsequent Place Order request. Weight(IP): 200 Security Type: TRADE Response
     * Notes: - &#x60;feeAmount&#x60; is a string because it is denominated in wei (18 decimals) and
     * may exceed JavaScript&#39;s safe integer range. &#x60;feeDiscountBps&#x60; is also a string
     * to allow fractional basis-point values in the future. &#x60;feeRateBps&#x60; and
     * &#x60;slippageBps&#x60; are integers and will never exceed safe integer bounds. - **MARKET
     * order minimum amount:** For &#x60;MARKET&#x60; orders, &#x60;amountIn&#x60; must be at least
     * approximately **1.5 USDT** (in wei: &#x60;1500000000000000000&#x60;). The exact minimum
     * varies by market liquidity. If the amount is too small, the server returns &#x60;-9000 Your
     * order amount is too small&#x60;. This limit does **not** apply to &#x60;LIMIT&#x60; orders.
     *
     * @param getQuoteRequest (required)
     * @return ApiResponse&lt;GetQuoteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Quote </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/trade#get-quote">Get
     *     Quote Documentation</a>
     */
    public ApiResponse<GetQuoteResponse> getQuote(GetQuoteRequest getQuoteRequest)
            throws ApiException {
        return tradeApi.getQuote(getQuoteRequest);
    }

    /**
     * Place Order Place a prediction order using a previously obtained quote. Requires SAS
     * authorization. Weight(IP): 200 Security Type: TRADE Notes: - Validation rules: | orderType |
     * timeInForce | priceLimit | | --------- | ------------- | --------------------- | |
     * &#x60;MARKET&#x60; | Must be &#x60;FOK&#x60; | Not required | | &#x60;LIMIT&#x60; | Must be
     * &#x60;GTC&#x60; | Required, must be &gt; 0 |
     *
     * @param placeOrderRequest (required)
     * @return ApiResponse&lt;PlaceOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/trade#place-order">Place
     *     Order Documentation</a>
     */
    public ApiResponse<PlaceOrderResponse> placeOrder(PlaceOrderRequest placeOrderRequest)
            throws ApiException {
        return tradeApi.placeOrder(placeOrderRequest);
    }

    /**
     * Query Active Orders Get active (open) prediction orders for the authenticated user.
     * Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param tradeSide Filter by trade side. Enum: &#x60;BUY&#x60;, &#x60;SELL&#x60; (optional)
     * @param l1Category Filter by level-1 category (optional)
     * @param marketId Filter by market ID (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryActiveOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Active Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/trade#query-active-orders">Query
     *     Active Orders Documentation</a>
     */
    public ApiResponse<QueryActiveOrdersResponse> queryActiveOrders(
            String walletAddress,
            TradeSide tradeSide,
            String l1Category,
            Long marketId,
            Integer offset,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryActiveOrders(
                walletAddress, tradeSide, l1Category, marketId, offset, limit, recvWindow);
    }

    /**
     * Query Order History Get historical prediction orders (all statuses) for the authenticated
     * user, with optional filters. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param l1Category Filter by level-1 category (optional)
     * @param orderType Filter by order type. Enum: &#x60;MARKET&#x60;, &#x60;LIMIT&#x60; (optional)
     * @param status Filter by order status (optional)
     * @param startDate Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60;
     *     (optional)
     * @param endDate End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60;
     *     (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryOrderHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Order History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/trade#query-order-history">Query
     *     Order History Documentation</a>
     */
    public ApiResponse<QueryOrderHistoryResponse> queryOrderHistory(
            String walletAddress,
            String l1Category,
            OrderType orderType,
            String status,
            String startDate,
            String endDate,
            Integer offset,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return tradeApi.queryOrderHistory(
                walletAddress,
                l1Category,
                orderType,
                status,
                startDate,
                endDate,
                offset,
                limit,
                recvWindow);
    }

    /**
     * Create Inbound Transfer Transfer funds from the prediction wallet back to the user&#39;s CEX
     * account (SPOT or FUNDING). Requires SAS authorization. ⚠️ **SAS Authorization Required:**
     * This endpoint enforces SAS (Self-Authorization Service) authorization. If SAS is not enabled
     * for the wallet, the request will be rejected with &#x60;-31003 SAS authorization
     * required&#x60;. Enable SAS for your wallet before calling this endpoint. Weight(IP): 200
     * Security Type: TRADE
     *
     * @param createInboundTransferRequest (required)
     * @return ApiResponse&lt;CreateInboundTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create Inbound Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/transfer#create-inbound-transfer">Create
     *     Inbound Transfer Documentation</a>
     */
    public ApiResponse<CreateInboundTransferResponse> createInboundTransfer(
            CreateInboundTransferRequest createInboundTransferRequest) throws ApiException {
        return transferApi.createInboundTransfer(createInboundTransferRequest);
    }

    /**
     * Create Outbound Transfer Transfer funds from the user&#39;s CEX account (SPOT or FUNDING)
     * into the prediction wallet. Requires SAS authorization. Weight(IP): 200 Security Type: TRADE
     *
     * @param createOutboundTransferRequest (required)
     * @return ApiResponse&lt;CreateOutboundTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create Outbound Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/transfer#create-outbound-transfer">Create
     *     Outbound Transfer Documentation</a>
     */
    public ApiResponse<CreateOutboundTransferResponse> createOutboundTransfer(
            CreateOutboundTransferRequest createOutboundTransferRequest) throws ApiException {
        return transferApi.createOutboundTransfer(createOutboundTransferRequest);
    }

    /**
     * Query Transfer List Get the authenticated user&#39;s prediction wallet transfer history
     * within a date range. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param startDate Start date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≤ &#x60;endDate&#x60;
     *     (required)
     * @param endDate End date. Format: &#x60;yyyy-MM-dd&#x60;. Must be ≥ &#x60;startDate&#x60;
     *     (required)
     * @param tokenSymbol Filter by token symbol (e.g. &#x60;USDT&#x60;) (optional)
     * @param direction Filter by direction. Enum: &#x60;INBOUND&#x60;, &#x60;OUTBOUND&#x60;
     *     (optional)
     * @param offset Pagination offset. Default &#x60;0&#x60; (optional)
     * @param limit Page size. Default &#x60;20&#x60;, range 1–100 (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryTransferListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Transfer List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/transfer#query-transfer-list">Query
     *     Transfer List Documentation</a>
     */
    public ApiResponse<QueryTransferListResponse> queryTransferList(
            String walletAddress,
            String startDate,
            String endDate,
            String tokenSymbol,
            Direction direction,
            Integer offset,
            Integer limit,
            Long recvWindow)
            throws ApiException {
        return transferApi.queryTransferList(
                walletAddress,
                startDate,
                endDate,
                tokenSymbol,
                direction,
                offset,
                limit,
                recvWindow);
    }

    /**
     * Query Transfer Status Query the current status of a prediction wallet transfer by transfer
     * ID. **&#x60;status&#x60; values:** Terminal states are &#x60;COMPLETED&#x60; and
     * &#x60;FAILED&#x60;. Intermediate states are &#x60;PROCESSING&#x60; and &#x60;PENDING&#x60;.
     * **Do not** poll for &#x60;SUCCESS&#x60; — it is not a valid terminal state. Weight(IP): 200
     * Security Type: USER_DATA
     *
     * @param transferId Transfer ID returned from outbound/inbound transfer (required)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryTransferStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Transfer Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/transfer#query-transfer-status">Query
     *     Transfer Status Documentation</a>
     */
    public ApiResponse<QueryTransferStatusResponse> queryTransferStatus(
            String transferId, Long recvWindow) throws ApiException {
        return transferApi.queryTransferStatus(transferId, recvWindow);
    }

    /**
     * Get Portfolio Get the authenticated user&#39;s prediction portfolio overview including active
     * positions count, aggregated PnL, and full position list. Weight(IP): 200 Security Type:
     * USER_DATA
     *
     * @param walletAddress User&#39;s prediction wallet address (required)
     * @param tokenId Filter by prediction token ID (optional)
     * @param marketId Filter by market ID. Must be &gt; 0 (optional)
     * @param marketTopicId Filter by market topic ID. Must be &gt; 0 (optional)
     * @param activeOnly If &#x60;true&#x60;, return only active (unresolved) positions (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetPortfolioResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Portfolio </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/wallet#get-portfolio">Get
     *     Portfolio Documentation</a>
     */
    public ApiResponse<GetPortfolioResponse> getPortfolio(
            String walletAddress,
            String tokenId,
            Long marketId,
            Long marketTopicId,
            Boolean activeOnly,
            Long recvWindow)
            throws ApiException {
        return walletApi.getPortfolio(
                walletAddress, tokenId, marketId, marketTopicId, activeOnly, recvWindow);
    }

    /**
     * Get Quota Status Query the current user&#39;s daily trading quota limit and remaining
     * allowance for prediction markets. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetQuotaStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Quota Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/wallet#get-quota-status">Get
     *     Quota Status Documentation</a>
     */
    public ApiResponse<GetQuotaStatusResponse> getQuotaStatus(Long recvWindow) throws ApiException {
        return walletApi.getQuotaStatus(recvWindow);
    }

    /**
     * List Prediction Wallets Get all prediction wallets registered for the authenticated user.
     * Weight(IP): 200 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;ListPredictionWalletsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List Prediction Wallets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/wallet#list-prediction-wallets">List
     *     Prediction Wallets Documentation</a>
     */
    public ApiResponse<ListPredictionWalletsResponse> listPredictionWallets(Long recvWindow)
            throws ApiException {
        return walletApi.listPredictionWallets(recvWindow);
    }

    /**
     * Query Payment Option Balances Get available balances for each payment option that can be used
     * for prediction trading. Weight(IP): 200 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;QueryPaymentOptionBalancesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Payment Option Balances </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/dev-docs/catalog/web3-wallet-prediction-trading/api/rest-api/wallet#query-payment-option-balances">Query
     *     Payment Option Balances Documentation</a>
     */
    public ApiResponse<QueryPaymentOptionBalancesResponse> queryPaymentOptionBalances(
            Long recvWindow) throws ApiException {
        return walletApi.queryPaymentOptionBalances(recvWindow);
    }
}
