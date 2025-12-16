package com.binance.connector.client.derivatives_trading_options.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.model.AcceptBlockTradeOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.AcceptBlockTradeOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountBlockTradeListResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountFundingFlowResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.AccountTradeListResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.AutoCancelAllOpenOrdersRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.AutoCancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelAllOptionOrdersByUnderlyingResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelAllOptionOrdersOnSpecificSymbolResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelMultipleOptionOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.CancelOptionOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.CheckServerTimeResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.ClientOrderIds;
import com.binance.connector.client.derivatives_trading_options.rest.model.ExchangeInformationResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.ExtendBlockTradeOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.ExtendBlockTradeOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.GetAutoCancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.GetDownloadIdForOptionTransactionHistoryResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.GetMarketMakerProtectionConfigResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.GetOptionTransactionHistoryDownloadLinkByIdResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.HistoricalExerciseRecordsResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.IndexPriceTickerResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.KlineCandlestickDataResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewBlockTradeOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewBlockTradeOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.NewOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OldTradesLookupResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OpenInterestResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OptionAccountInformationResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OptionMarginAccountInformationResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OptionMarkPriceResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OptionPositionInformationResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OrderBookResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.OrderIds;
import com.binance.connector.client.derivatives_trading_options.rest.model.PlaceMultipleOrdersRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.PlaceMultipleOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryBlockTradeDetailsResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryBlockTradeOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryCurrentOpenOptionOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.QueryOptionOrderHistoryResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.QuerySingleOrderResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.RecentBlockTradesListResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.RecentTradesListResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.ResetMarketMakerProtectionConfigRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.ResetMarketMakerProtectionConfigResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetAutoCancelAllOpenOrdersRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetAutoCancelAllOpenOrdersResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetMarketMakerProtectionConfigRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.SetMarketMakerProtectionConfigResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.StartUserDataStreamResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.Ticker24hrPriceChangeStatisticsResponse;
import com.binance.connector.client.derivatives_trading_options.rest.model.UserExerciseRecordResponse;

public class DerivativesTradingOptionsRestApi {

    private final AccountApi accountApi;
    private final MarketDataApi marketDataApi;
    private final MarketMakerBlockTradeApi marketMakerBlockTradeApi;
    private final MarketMakerEndpointsApi marketMakerEndpointsApi;
    private final TradeApi tradeApi;
    private final UserDataStreamsApi userDataStreamsApi;

    public DerivativesTradingOptionsRestApi(ClientConfiguration configuration) {
        this(DerivativesTradingOptionsRestApiUtil.getDefaultClient(configuration));
    }

    public DerivativesTradingOptionsRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.marketDataApi = new MarketDataApi(apiClient);
        this.marketMakerBlockTradeApi = new MarketMakerBlockTradeApi(apiClient);
        this.marketMakerEndpointsApi = new MarketMakerEndpointsApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
        this.userDataStreamsApi = new UserDataStreamsApi(apiClient);
    }

    /**
     * Account Funding Flow (USER_DATA) Query account funding flows. Weight: 1
     *
     * @param currency Asset type, only support USDT as of now (required)
     * @param recordId Return the recordId and subsequent data, the latest data is returned by
     *     default, e.g 100000 (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountFundingFlowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Funding Flow </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/account/Account-Funding-Flow">Account
     *     Funding Flow (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountFundingFlowResponse> accountFundingFlow(
            String currency,
            Long recordId,
            Long startTime,
            Long endTime,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return accountApi.accountFundingFlow(
                currency, recordId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Get Download Id For Option Transaction History (USER_DATA) Get download id for option
     * transaction history * Request Limitation is 5 times per month, shared by &gt; front end
     * download page and rest api * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * can not be longer than 1 year Weight: 5
     *
     * @param startTime Timestamp in ms (required)
     * @param endTime Timestamp in ms (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDownloadIdForOptionTransactionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Download Id For Option Transaction History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/account/Get-Download-Id-For-Option-Transaction-History">Get
     *     Download Id For Option Transaction History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDownloadIdForOptionTransactionHistoryResponse>
            getDownloadIdForOptionTransactionHistory(Long startTime, Long endTime, Long recvWindow)
                    throws ApiException {
        return accountApi.getDownloadIdForOptionTransactionHistory(startTime, endTime, recvWindow);
    }

    /**
     * Get Option Transaction History Download Link by Id (USER_DATA) Get option transaction history
     * download Link by Id * Download link expiration: 24h Weight: 5
     *
     * @param downloadId get by download id api (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOptionTransactionHistoryDownloadLinkByIdResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Option Transaction History Download Link by Id </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/account/Get-Option-Transaction-History-Download-Link-by-Id">Get
     *     Option Transaction History Download Link by Id (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOptionTransactionHistoryDownloadLinkByIdResponse>
            getOptionTransactionHistoryDownloadLinkById(String downloadId, Long recvWindow)
                    throws ApiException {
        return accountApi.getOptionTransactionHistoryDownloadLinkById(downloadId, recvWindow);
    }

    /**
     * Option Account Information(TRADE) Get current account information. Weight: 3
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;OptionAccountInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Account Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/account/Option-Account-Information">Option
     *     Account Information(TRADE) Documentation</a>
     */
    public ApiResponse<OptionAccountInformationResponse> optionAccountInformation(Long recvWindow)
            throws ApiException {
        return accountApi.optionAccountInformation(recvWindow);
    }

    /**
     * Option Margin Account Information (USER_DATA) Get current account information. Weight: 3
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;OptionMarginAccountInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Margin Account Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/account/Option-Margin-Account-Information">Option
     *     Margin Account Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionMarginAccountInformationResponse> optionMarginAccountInformation(
            Long recvWindow) throws ApiException {
        return accountApi.optionMarginAccountInformation(recvWindow);
    }

    /**
     * Check Server Time Test connectivity to the Rest API and get the current server time. Weight:
     * 1
     *
     * @return ApiResponse&lt;CheckServerTimeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Server Time </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Check-Server-Time">Check
     *     Server Time Documentation</a>
     */
    public ApiResponse<CheckServerTimeResponse> checkServerTime() throws ApiException {
        return marketDataApi.checkServerTime();
    }

    /**
     * Exchange Information Current exchange trading rules and symbol information Weight: 1
     *
     * @return ApiResponse&lt;ExchangeInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exchange Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Exchange-Information">Exchange
     *     Information Documentation</a>
     */
    public ApiResponse<ExchangeInformationResponse> exchangeInformation() throws ApiException {
        return marketDataApi.exchangeInformation();
    }

    /**
     * Historical Exercise Records Get historical exercise records. * REALISTIC_VALUE_STRICKEN -&gt;
     * Exercised * EXTRINSIC_VALUE_EXPIRED -&gt; Expired OTM Weight: 3
     *
     * @param underlying underlying, e.g BTCUSDT (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;HistoricalExerciseRecordsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Historical Exercise Records </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Historical-Exercise-Records">Historical
     *     Exercise Records Documentation</a>
     */
    public ApiResponse<HistoricalExerciseRecordsResponse> historicalExerciseRecords(
            String underlying, Long startTime, Long endTime, Long limit) throws ApiException {
        return marketDataApi.historicalExerciseRecords(underlying, startTime, endTime, limit);
    }

    /**
     * Index Price Ticker Get spot index price for option underlying. Weight: 1
     *
     * @param underlying Option underlying, e.g BTCUSDT (required)
     * @return ApiResponse&lt;IndexPriceTickerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Price Ticker </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Index-Price-Ticker">Index
     *     Price Ticker Documentation</a>
     */
    public ApiResponse<IndexPriceTickerResponse> indexPriceTicker(String underlying)
            throws ApiException {
        return marketDataApi.indexPriceTicker(underlying);
    }

    /**
     * Kline/Candlestick Data Kline/candlestick bars for an option symbol. Klines are uniquely
     * identified by their open time. * If startTime and endTime are not sent, the most recent
     * klines are returned. Weight: 1
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param interval Time interval (required)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;KlineCandlestickDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Kline/Candlestick Data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Kline-Candlestick-Data">Kline/Candlestick
     *     Data Documentation</a>
     */
    public ApiResponse<KlineCandlestickDataResponse> klineCandlestickData(
            String symbol, String interval, Long startTime, Long endTime, Long limit)
            throws ApiException {
        return marketDataApi.klineCandlestickData(symbol, interval, startTime, endTime, limit);
    }

    /**
     * Old Trades Lookup (MARKET_DATA) Get older market historical trades. Weight: 20
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param fromId The UniqueId ID from which to return. The latest deal record is returned by
     *     default (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;OldTradesLookupResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Old Trades Lookup </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Old-Trades-Lookup">Old
     *     Trades Lookup (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<OldTradesLookupResponse> oldTradesLookup(
            String symbol, Long fromId, Long limit) throws ApiException {
        return marketDataApi.oldTradesLookup(symbol, fromId, limit);
    }

    /**
     * Open Interest Get open interest for specific underlying asset on specific expiration date.
     * Weight: 0
     *
     * @param underlyingAsset underlying asset, e.g ETH/BTC (required)
     * @param expiration expiration date, e.g 221225 (required)
     * @return ApiResponse&lt;OpenInterestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Open Interest </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Open-Interest">Open
     *     Interest Documentation</a>
     */
    public ApiResponse<OpenInterestResponse> openInterest(String underlyingAsset, String expiration)
            throws ApiException {
        return marketDataApi.openInterest(underlyingAsset, expiration);
    }

    /**
     * Option Mark Price Option mark price and greek info. Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @return ApiResponse&lt;OptionMarkPriceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Mark Price </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Option-Mark-Price">Option
     *     Mark Price Documentation</a>
     */
    public ApiResponse<OptionMarkPriceResponse> optionMarkPrice(String symbol) throws ApiException {
        return marketDataApi.optionMarkPrice(symbol);
    }

    /**
     * Order Book Check orderbook depth on specific symbol Weight: limit | weight ------------ |
     * ------------ 5, 10, 20, 50 | 2 100 | 5 500 | 10 1000 | 20
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;OrderBookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Order Book </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Order-Book">Order
     *     Book Documentation</a>
     */
    public ApiResponse<OrderBookResponse> orderBook(String symbol, Long limit) throws ApiException {
        return marketDataApi.orderBook(symbol, limit);
    }

    /**
     * Recent Block Trades List Get recent block trades Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;RecentBlockTradesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Recent Block Trades List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Recent-Block-Trade-List">Recent
     *     Block Trades List Documentation</a>
     */
    public ApiResponse<RecentBlockTradesListResponse> recentBlockTradesList(
            String symbol, Long limit) throws ApiException {
        return marketDataApi.recentBlockTradesList(symbol, limit);
    }

    /**
     * Recent Trades List Get recent market trades Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @return ApiResponse&lt;RecentTradesListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Recent Trades List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Recent-Trades-List">Recent
     *     Trades List Documentation</a>
     */
    public ApiResponse<RecentTradesListResponse> recentTradesList(String symbol, Long limit)
            throws ApiException {
        return marketDataApi.recentTradesList(symbol, limit);
    }

    /**
     * Test Connectivity Test connectivity to the Rest API. Weight: 1
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/Test-Connectivity">Test
     *     Connectivity Documentation</a>
     */
    public void testConnectivity() throws ApiException {
        marketDataApi.testConnectivity();
    }

    /**
     * 24hr Ticker Price Change Statistics 24 hour rolling window price change statistics. Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @return ApiResponse&lt;Ticker24hrPriceChangeStatisticsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> 24hr Ticker Price Change Statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-data/24hr-Ticker-Price-Change-Statistics">24hr
     *     Ticker Price Change Statistics Documentation</a>
     */
    public ApiResponse<Ticker24hrPriceChangeStatisticsResponse> ticker24hrPriceChangeStatistics(
            String symbol) throws ApiException {
        return marketDataApi.ticker24hrPriceChangeStatistics(symbol);
    }

    /**
     * Accept Block Trade Order (TRADE) Accept a block trade order Weight: 5
     *
     * @param acceptBlockTradeOrderRequest (required)
     * @return ApiResponse&lt;AcceptBlockTradeOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Accept Block Trade Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Accept-Block-Trade-Order">Accept
     *     Block Trade Order (TRADE) Documentation</a>
     */
    public ApiResponse<AcceptBlockTradeOrderResponse> acceptBlockTradeOrder(
            AcceptBlockTradeOrderRequest acceptBlockTradeOrderRequest) throws ApiException {
        return marketMakerBlockTradeApi.acceptBlockTradeOrder(acceptBlockTradeOrderRequest);
    }

    /**
     * Account Block Trade List (USER_DATA) Gets block trades for a specific account. Weight: 5
     *
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param underlying underlying, e.g BTCUSDT (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountBlockTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Block Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Account-Block-Trade-List">Account
     *     Block Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountBlockTradeListResponse> accountBlockTradeList(
            Long endTime, Long startTime, String underlying, Long recvWindow) throws ApiException {
        return marketMakerBlockTradeApi.accountBlockTradeList(
                endTime, startTime, underlying, recvWindow);
    }

    /**
     * Cancel Block Trade Order (TRADE) Cancel a block trade order. Weight: 5
     *
     * @param blockOrderMatchingKey (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Cancel-Block-Trade-Order">Cancel
     *     Block Trade Order (TRADE) Documentation</a>
     */
    public void cancelBlockTradeOrder(String blockOrderMatchingKey, Long recvWindow)
            throws ApiException {
        marketMakerBlockTradeApi.cancelBlockTradeOrder(blockOrderMatchingKey, recvWindow);
    }

    /**
     * Extend Block Trade Order (TRADE) Extends a block trade expire time by 30 mins from the
     * current time. Weight: 5
     *
     * @param extendBlockTradeOrderRequest (required)
     * @return ApiResponse&lt;ExtendBlockTradeOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Extend Block Trade Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Extend-Block-Trade-Order">Extend
     *     Block Trade Order (TRADE) Documentation</a>
     */
    public ApiResponse<ExtendBlockTradeOrderResponse> extendBlockTradeOrder(
            ExtendBlockTradeOrderRequest extendBlockTradeOrderRequest) throws ApiException {
        return marketMakerBlockTradeApi.extendBlockTradeOrder(extendBlockTradeOrderRequest);
    }

    /**
     * New Block Trade Order (TRADE) Send in a new block trade order. Weight: 5
     *
     * @param newBlockTradeOrderRequest (required)
     * @return ApiResponse&lt;NewBlockTradeOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Block Trade Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/New-Block-Trade-Order">New
     *     Block Trade Order (TRADE) Documentation</a>
     */
    public ApiResponse<NewBlockTradeOrderResponse> newBlockTradeOrder(
            NewBlockTradeOrderRequest newBlockTradeOrderRequest) throws ApiException {
        return marketMakerBlockTradeApi.newBlockTradeOrder(newBlockTradeOrderRequest);
    }

    /**
     * Query Block Trade Details (USER_DATA) Query block trade details; returns block trade details
     * from counterparty&#39;s perspective. Weight: 5
     *
     * @param blockOrderMatchingKey (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryBlockTradeDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Block Trade Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Query-Block-Trade-Detail">Query
     *     Block Trade Details (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryBlockTradeDetailsResponse> queryBlockTradeDetails(
            String blockOrderMatchingKey, Long recvWindow) throws ApiException {
        return marketMakerBlockTradeApi.queryBlockTradeDetails(blockOrderMatchingKey, recvWindow);
    }

    /**
     * Query Block Trade Order (TRADE) Check block trade order status. Weight: 5
     *
     * @param blockOrderMatchingKey If specified, returns the specific block trade associated with
     *     the blockOrderMatchingKey (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param underlying underlying, e.g BTCUSDT (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryBlockTradeOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Block Trade Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-block-trade/Query-Block-Trade-Order">Query
     *     Block Trade Order (TRADE) Documentation</a>
     */
    public ApiResponse<QueryBlockTradeOrderResponse> queryBlockTradeOrder(
            String blockOrderMatchingKey,
            Long endTime,
            Long startTime,
            String underlying,
            Long recvWindow)
            throws ApiException {
        return marketMakerBlockTradeApi.queryBlockTradeOrder(
                blockOrderMatchingKey, endTime, startTime, underlying, recvWindow);
    }

    /**
     * Auto-Cancel All Open Orders (Kill-Switch) Heartbeat (TRADE) This endpoint resets the time
     * from which the countdown will begin to the time this messaged is received. It should be
     * called repeatedly as heartbeats. Multiple heartbeats can be updated at once by specifying the
     * underlying symbols as a list (ex. BTCUSDT,ETHUSDT) in the underlyings parameter. * The
     * response will only include underlying symbols where the heartbeat has been successfully
     * updated. Weight: 10
     *
     * @param autoCancelAllOpenOrdersRequest (required)
     * @return ApiResponse&lt;AutoCancelAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Auto-Cancel All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Auto-Cancel-All-Open-Orders-Heartbeat">Auto-Cancel
     *     All Open Orders (Kill-Switch) Heartbeat (TRADE) Documentation</a>
     */
    public ApiResponse<AutoCancelAllOpenOrdersResponse> autoCancelAllOpenOrders(
            AutoCancelAllOpenOrdersRequest autoCancelAllOpenOrdersRequest) throws ApiException {
        return marketMakerEndpointsApi.autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest);
    }

    /**
     * Get Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) This endpoint returns the
     * auto-cancel parameters for each underlying symbol. Note only active auto-cancel parameters
     * will be returned, if countdownTime is set to 0 (ie. countdownTime has been turned off), the
     * underlying symbol and corresponding countdownTime parameter will not be returned in the
     * response. * countdownTime &#x3D; 0 means the function is disabled. Weight: 1
     *
     * @param underlying underlying, e.g BTCUSDT (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetAutoCancelAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Auto-Cancel All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Get-Auto-Cancel-All-Open-Orders-Config">Get
     *     Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) Documentation</a>
     */
    public ApiResponse<GetAutoCancelAllOpenOrdersResponse> getAutoCancelAllOpenOrders(
            String underlying, Long recvWindow) throws ApiException {
        return marketMakerEndpointsApi.getAutoCancelAllOpenOrders(underlying, recvWindow);
    }

    /**
     * Get Market Maker Protection Config (TRADE) Get config for MMP. Weight: 1
     *
     * @param underlying underlying, e.g BTCUSDT (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetMarketMakerProtectionConfigResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Market Maker Protection Config </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Get-Market-Maker-Protection-Config">Get
     *     Market Maker Protection Config (TRADE) Documentation</a>
     */
    public ApiResponse<GetMarketMakerProtectionConfigResponse> getMarketMakerProtectionConfig(
            String underlying, Long recvWindow) throws ApiException {
        return marketMakerEndpointsApi.getMarketMakerProtectionConfig(underlying, recvWindow);
    }

    /**
     * Reset Market Maker Protection Config (TRADE) Reset MMP, start MMP order again. Weight: 1
     *
     * @param resetMarketMakerProtectionConfigRequest (required)
     * @return ApiResponse&lt;ResetMarketMakerProtectionConfigResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Reset Market Maker Protection Config </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Reset-Market-Maker-Protection-Config">Reset
     *     Market Maker Protection Config (TRADE) Documentation</a>
     */
    public ApiResponse<ResetMarketMakerProtectionConfigResponse> resetMarketMakerProtectionConfig(
            ResetMarketMakerProtectionConfigRequest resetMarketMakerProtectionConfigRequest)
            throws ApiException {
        return marketMakerEndpointsApi.resetMarketMakerProtectionConfig(
                resetMarketMakerProtectionConfigRequest);
    }

    /**
     * Set Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) This endpoint sets the
     * parameters of the auto-cancel feature which cancels all open orders (both market maker
     * protection and non market maker protection order types) of the underlying symbol at the end
     * of the specified countdown time period if no heartbeat message is sent. After the countdown
     * time period, all open orders will be cancelled and new orders will be rejected with error
     * code -2010 until either a heartbeat message is sent or the auto-cancel feature is turned off
     * by setting countdownTime to 0. * This rest endpoint sets up the parameters to cancel your
     * open orders in case of an outage or disconnection. * Example usage: Call this endpoint with a
     * countdownTime value of 10000 (10 seconds) to turn on the auto-cancel feature. If the
     * corresponding countdownCancelAllHeartBeat endpoint is not called within 10 seconds with the
     * specified underlying symbol, all open orders of the specified symbol will be automatically
     * canceled. If this endpoint is called with an countdownTime of 0, the countdown timer will be
     * stopped. * The system will check all countdowns approximately every 1000 milliseconds,
     * **please note that sufficient redundancy should be considered when using this function**. We
     * do not recommend setting the countdown time to be too precise or too small. Weight: 1
     *
     * @param setAutoCancelAllOpenOrdersRequest (required)
     * @return ApiResponse&lt;SetAutoCancelAllOpenOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Auto-Cancel All Open Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Set-Auto-Cancel-All-Open-Orders-Config">Set
     *     Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) Documentation</a>
     */
    public ApiResponse<SetAutoCancelAllOpenOrdersResponse> setAutoCancelAllOpenOrders(
            SetAutoCancelAllOpenOrdersRequest setAutoCancelAllOpenOrdersRequest)
            throws ApiException {
        return marketMakerEndpointsApi.setAutoCancelAllOpenOrders(
                setAutoCancelAllOpenOrdersRequest);
    }

    /**
     * Set Market Maker Protection Config (TRADE) Set config for MMP. Market Maker Protection(MMP)
     * is a set of protection mechanism for option market maker, this mechanism is able to prevent
     * mass trading in short period time. Once market maker&#39;s account branches the threshold,
     * the Market Maker Protection will be triggered. When Market Maker Protection triggers, all the
     * current MMP orders will be canceled, new MMP orders will be rejected. Market maker can use
     * this time to reevaluate market and modify order price. Weight: 1
     *
     * @param setMarketMakerProtectionConfigRequest (required)
     * @return ApiResponse&lt;SetMarketMakerProtectionConfigResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Market Maker Protection Config </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/market-maker-endpoints/Set-Market-Maker-Protection-Config">Set
     *     Market Maker Protection Config (TRADE) Documentation</a>
     */
    public ApiResponse<SetMarketMakerProtectionConfigResponse> setMarketMakerProtectionConfig(
            SetMarketMakerProtectionConfigRequest setMarketMakerProtectionConfigRequest)
            throws ApiException {
        return marketMakerEndpointsApi.setMarketMakerProtectionConfig(
                setMarketMakerProtectionConfigRequest);
    }

    /**
     * Account Trade List (USER_DATA) Get trades for a specific account and symbol. Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @param fromId The UniqueId ID from which to return. The latest deal record is returned by
     *     default (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountTradeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Trade List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Account-Trade-List">Account
     *     Trade List (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountTradeListResponse> accountTradeList(
            String symbol, Long fromId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.accountTradeList(symbol, fromId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Cancel All Option Orders By Underlying (TRADE) Cancel all active orders on specified
     * underlying. Weight: 1
     *
     * @param underlying Option underlying, e.g BTCUSDT (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllOptionOrdersByUnderlyingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel All Option Orders By Underlying </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Cancel-All-Option-Orders-By-Underlying">Cancel
     *     All Option Orders By Underlying (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllOptionOrdersByUnderlyingResponse> cancelAllOptionOrdersByUnderlying(
            String underlying, Long recvWindow) throws ApiException {
        return tradeApi.cancelAllOptionOrdersByUnderlying(underlying, recvWindow);
    }

    /**
     * Cancel all Option orders on specific symbol (TRADE) Cancel all active order on a symbol.
     * Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelAllOptionOrdersOnSpecificSymbolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel all Option orders on specific symbol </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Cancel-all-Option-orders-on-specific-symbol">Cancel
     *     all Option orders on specific symbol (TRADE) Documentation</a>
     */
    public ApiResponse<CancelAllOptionOrdersOnSpecificSymbolResponse>
            cancelAllOptionOrdersOnSpecificSymbol(String symbol, Long recvWindow)
                    throws ApiException {
        return tradeApi.cancelAllOptionOrdersOnSpecificSymbol(symbol, recvWindow);
    }

    /**
     * Cancel Multiple Option Orders (TRADE) Cancel multiple orders. * At least one instance of
     * &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent. * Max 10 orders can be
     * deleted in one request Weight: 1
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param orderIds Order ID, e.g [4611875134427365377,4611875134427365378] (optional)
     * @param clientOrderIds User-defined order ID, e.g
     *     [\&quot;my_id_1\&quot;,\&quot;my_id_2\&quot;] (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CancelMultipleOptionOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel Multiple Option Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Cancel-Multiple-Option-Orders">Cancel
     *     Multiple Option Orders (TRADE) Documentation</a>
     */
    public ApiResponse<CancelMultipleOptionOrdersResponse> cancelMultipleOptionOrders(
            String symbol, OrderIds orderIds, ClientOrderIds clientOrderIds, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelMultipleOptionOrders(symbol, orderIds, clientOrderIds, recvWindow);
    }

    /**
     * Cancel Option Order (TRADE) Cancel an active order. * At least one instance of
     * &#x60;orderId&#x60; and &#x60;clientOrderId&#x60; must be sent. Weight: 1
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param orderId Order ID, e.g 4611875134427365377 (optional)
     * @param clientOrderId User-defined order ID, e.g 10000 (optional)
     * @param recvWindow (optional)
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
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Cancel-Option-Order">Cancel
     *     Option Order (TRADE) Documentation</a>
     */
    public ApiResponse<CancelOptionOrderResponse> cancelOptionOrder(
            String symbol, Long orderId, String clientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.cancelOptionOrder(symbol, orderId, clientOrderId, recvWindow);
    }

    /**
     * New Order (TRADE) Send a new order. Weight: 0
     *
     * @param newOrderRequest (required)
     * @return ApiResponse&lt;NewOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> New Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/derivatives/option/trade/New-Order">New
     *     Order (TRADE) Documentation</a>
     */
    public ApiResponse<NewOrderResponse> newOrder(NewOrderRequest newOrderRequest)
            throws ApiException {
        return tradeApi.newOrder(newOrderRequest);
    }

    /**
     * Option Position Information (USER_DATA) Get current position information. Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;OptionPositionInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Option Position Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Option-Position-Information">Option
     *     Position Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<OptionPositionInformationResponse> optionPositionInformation(
            String symbol, Long recvWindow) throws ApiException {
        return tradeApi.optionPositionInformation(symbol, recvWindow);
    }

    /**
     * Place Multiple Orders(TRADE) Send multiple option orders. * Parameter rules are same with New
     * Order * Batch orders are processed concurrently, and the order of matching is not guaranteed.
     * Weight: 5
     *
     * @param placeMultipleOrdersRequest (required)
     * @return ApiResponse&lt;PlaceMultipleOrdersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Place Multiple Orders </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Place-Multiple-Orders">Place
     *     Multiple Orders(TRADE) Documentation</a>
     */
    public ApiResponse<PlaceMultipleOrdersResponse> placeMultipleOrders(
            PlaceMultipleOrdersRequest placeMultipleOrdersRequest) throws ApiException {
        return tradeApi.placeMultipleOrders(placeMultipleOrdersRequest);
    }

    /**
     * Query Current Open Option Orders (USER_DATA) Query current all open orders, status: ACCEPTED
     * PARTIALLY_FILLED Weight: 1 for a single symbol; 40 when the symbol parameter is omitted
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @param orderId Order ID, e.g 4611875134427365377 (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryCurrentOpenOptionOrdersResponse&gt;
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
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Query-Current-Open-Option-Orders">Query
     *     Current Open Option Orders (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryCurrentOpenOptionOrdersResponse> queryCurrentOpenOptionOrders(
            String symbol, Long orderId, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return tradeApi.queryCurrentOpenOptionOrders(
                symbol, orderId, startTime, endTime, recvWindow);
    }

    /**
     * Query Option Order History (TRADE) Query all finished orders within 5 days, finished status:
     * CANCELLED FILLED REJECTED. Weight: 3
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param orderId Order ID, e.g 4611875134427365377 (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryOptionOrderHistoryResponse&gt;
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
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Query-Option-Order-History">Query
     *     Option Order History (TRADE) Documentation</a>
     */
    public ApiResponse<QueryOptionOrderHistoryResponse> queryOptionOrderHistory(
            String symbol, Long orderId, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.queryOptionOrderHistory(
                symbol, orderId, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Single Order (TRADE) Check an order status. * These orders will not be found: * order
     * status is &#x60;CANCELED&#x60; or &#x60;REJECTED&#x60;, **AND** * order has NO filled trade,
     * **AND** * created time + 3 days &lt; current time * Either &#x60;orderId&#x60; or
     * &#x60;clientOrderId &#x60; must be sent. Weight: 1
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (required)
     * @param orderId Order ID, e.g 4611875134427365377 (optional)
     * @param clientOrderId User-defined order ID, e.g 10000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySingleOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Single Order </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/Query-Single-Order">Query
     *     Single Order (TRADE) Documentation</a>
     */
    public ApiResponse<QuerySingleOrderResponse> querySingleOrder(
            String symbol, Long orderId, String clientOrderId, Long recvWindow)
            throws ApiException {
        return tradeApi.querySingleOrder(symbol, orderId, clientOrderId, recvWindow);
    }

    /**
     * User Exercise Record (USER_DATA) Get account exercise records. Weight: 5
     *
     * @param symbol Option trading pair, e.g BTC-200730-9000-C (optional)
     * @param startTime Start Time, e.g 1593511200000 (optional)
     * @param endTime End Time, e.g 1593512200000 (optional)
     * @param limit Number of result sets returned Default:100 Max:1000 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;UserExerciseRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Exercise Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/trade/User-Exercise-Record">User
     *     Exercise Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserExerciseRecordResponse> userExerciseRecord(
            String symbol, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return tradeApi.userExerciseRecord(symbol, startTime, endTime, limit, recvWindow);
    }

    /**
     * Close User Data Stream (USER_STREAM) Close out a user data stream. Weight: 1
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/user-data-streams/Close-User-Data-Stream">Close
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void closeUserDataStream() throws ApiException {
        userDataStreamsApi.closeUserDataStream();
    }

    /**
     * Keepalive User Data Stream (USER_STREAM) Keepalive a user data stream to prevent a time out.
     * User data streams will close after 60 minutes. It&#39;s recommended to send a ping about
     * every 60 minutes. Weight: 1
     *
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/user-data-streams/Keepalive-User-Data-Stream">Keepalive
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public void keepaliveUserDataStream() throws ApiException {
        userDataStreamsApi.keepaliveUserDataStream();
    }

    /**
     * Start User Data Stream (USER_STREAM) Start a new user data stream. The stream will close
     * after 60 minutes unless a keepalive is sent. If the account has an active
     * &#x60;listenKey&#x60;, that &#x60;listenKey&#x60; will be returned and its validity will be
     * extended for 60 minutes. Weight: 1
     *
     * @return ApiResponse&lt;StartUserDataStreamResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Start User Data Stream </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/derivatives/option/user-data-streams/Start-User-Data-Stream">Start
     *     User Data Stream (USER_STREAM) Documentation</a>
     */
    public ApiResponse<StartUserDataStreamResponse> startUserDataStream() throws ApiException {
        return userDataStreamsApi.startUserDataStream();
    }
}
