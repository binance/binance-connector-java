package com.binance.connector.client.auto_invest.rest.api;

import com.binance.connector.client.auto_invest.rest.AutoInvestRestApiUtil;
import com.binance.connector.client.auto_invest.rest.model.ChangePlanStatusRequest;
import com.binance.connector.client.auto_invest.rest.model.ChangePlanStatusResponse;
import com.binance.connector.client.auto_invest.rest.model.GetListOfPlansResponse;
import com.binance.connector.client.auto_invest.rest.model.GetTargetAssetListResponse;
import com.binance.connector.client.auto_invest.rest.model.GetTargetAssetRoiDataResponse;
import com.binance.connector.client.auto_invest.rest.model.IndexLinkedPlanRebalanceDetailsResponse;
import com.binance.connector.client.auto_invest.rest.model.IndexLinkedPlanRedemptionRequest;
import com.binance.connector.client.auto_invest.rest.model.IndexLinkedPlanRedemptionResponse;
import com.binance.connector.client.auto_invest.rest.model.IndexLinkedPlanRedemptionTradeResponse;
import com.binance.connector.client.auto_invest.rest.model.InvestmentPlanAdjustmentRequest;
import com.binance.connector.client.auto_invest.rest.model.InvestmentPlanAdjustmentResponse;
import com.binance.connector.client.auto_invest.rest.model.InvestmentPlanCreationRequest;
import com.binance.connector.client.auto_invest.rest.model.InvestmentPlanCreationResponse;
import com.binance.connector.client.auto_invest.rest.model.OneTimeTransactionRequest;
import com.binance.connector.client.auto_invest.rest.model.OneTimeTransactionResponse;
import com.binance.connector.client.auto_invest.rest.model.QueryAllSourceAssetAndTargetAssetResponse;
import com.binance.connector.client.auto_invest.rest.model.QueryHoldingDetailsOfThePlanResponse;
import com.binance.connector.client.auto_invest.rest.model.QueryIndexDetailsResponse;
import com.binance.connector.client.auto_invest.rest.model.QueryIndexLinkedPlanPositionDetailsResponse;
import com.binance.connector.client.auto_invest.rest.model.QueryOneTimeTransactionStatusResponse;
import com.binance.connector.client.auto_invest.rest.model.QuerySourceAssetListResponse;
import com.binance.connector.client.auto_invest.rest.model.QuerySubscriptionTransactionHistoryResponse;
import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class AutoInvestRestApi {

    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;

    public AutoInvestRestApi(ClientConfiguration configuration) {
        this(AutoInvestRestApiUtil.getDefaultClient(configuration));
    }

    public AutoInvestRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
    }

    /**
     * Get list of plans (USER_DATA) Query plan lists * max one request every 3s per account Weight:
     * 1
     *
     * @param planType Plan identifier (required)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;GetListOfPlansResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get list of plans </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Get-list-of-plans">Get
     *     list of plans (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetListOfPlansResponse> getListOfPlans(String planType, Long recvWindow)
            throws ApiException {
        return marketDataApi.getListOfPlans(planType, recvWindow);
    }

    /**
     * Get target asset list(USER_DATA) Get target asset list Weight: 1
     *
     * @param targetAsset Plan identifier (optional)
     * @param size Default: 8, Max:100 (optional)
     * @param current Current query page. Default: 1, start from 1 (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;GetTargetAssetListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get target asset list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Get-target-asset-list">Get
     *     target asset list(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetTargetAssetListResponse> getTargetAssetList(
            Long targetAsset, Long size, Long current, Long recvWindow) throws ApiException {
        return marketDataApi.getTargetAssetList(targetAsset, size, current, recvWindow);
    }

    /**
     * Get target asset ROI data ROI return list for target asset Weight: 1
     *
     * @param targetAsset e.g \&quot;BTC\&quot; (required)
     * @param hisRoiType FIVE_YEAR,THREE_YEAR,ONE_YEAR,SIX_MONTH,THREE_MONTH,SEVEN_DAY (required)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;GetTargetAssetRoiDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get target asset ROI data </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Get-target-asset-ROI-data">Get
     *     target asset ROI data Documentation</a>
     */
    public ApiResponse<GetTargetAssetRoiDataResponse> getTargetAssetRoiData(
            String targetAsset, String hisRoiType, Long recvWindow) throws ApiException {
        return marketDataApi.getTargetAssetRoiData(targetAsset, hisRoiType, recvWindow);
    }

    /**
     * Query all source asset and target asset(USER_DATA) Query all source assets and target assets
     * Weight: 1
     *
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QueryAllSourceAssetAndTargetAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> all source asset and target asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Query-all-source-asset-and-target-asset">Query
     *     all source asset and target asset(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryAllSourceAssetAndTargetAssetResponse> queryAllSourceAssetAndTargetAsset(
            Long recvWindow) throws ApiException {
        return marketDataApi.queryAllSourceAssetAndTargetAsset(recvWindow);
    }

    /**
     * Query Index Details(USER_DATA) Query index details Weight: 1
     *
     * @param indexId (required)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QueryIndexDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Query-Index-Details">Query
     *     Index Details(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIndexDetailsResponse> queryIndexDetails(Long indexId, Long recvWindow)
            throws ApiException {
        return marketDataApi.queryIndexDetails(indexId, recvWindow);
    }

    /**
     * Query source asset list(USER_DATA) Query Source Asset to be used for investment Weight: 1
     *
     * @param usageType \&quot;RECURRING\&quot;, \&quot;ONE_TIME\&quot; (required)
     * @param targetAsset Plan identifier (optional)
     * @param indexId 指数identifier, value &#x3D; 1 (optional)
     * @param flexibleAllowedToUse (optional)
     * @param sourceType &#x60;MAIN_SITE&#x60; for Binance user,&#x60;TR&#x60; for Binance Turkey
     *     user (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QuerySourceAssetListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> source asset list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/market-data/Query-source-asset-list">Query
     *     source asset list(USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySourceAssetListResponse> querySourceAssetList(
            String usageType,
            Long targetAsset,
            Long indexId,
            Boolean flexibleAllowedToUse,
            String sourceType,
            Long recvWindow)
            throws ApiException {
        return marketDataApi.querySourceAssetList(
                usageType, targetAsset, indexId, flexibleAllowedToUse, sourceType, recvWindow);
    }

    /**
     * Change Plan Status(TRADE) Change Plan Status * max one request every 3s per account Weight: 1
     *
     * @param changePlanStatusRequest (required)
     * @return ApiResponse&lt;ChangePlanStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Plan Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Change-Plan-Status">Change
     *     Plan Status(TRADE) Documentation</a>
     */
    public ApiResponse<ChangePlanStatusResponse> changePlanStatus(
            ChangePlanStatusRequest changePlanStatusRequest) throws ApiException {
        return tradeApi.changePlanStatus(changePlanStatusRequest);
    }

    /**
     * Index Linked Plan Rebalance Details(USER_DATA) Get the history of Index Linked Plan
     * Redemption transactions * Max 30 day difference between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; * If no &#x60;startTime&#x60; and &#x60;endTime&#x60;, default to show
     * past 30 day records Weight: 1
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current query page. Default: 1, start from 1 (optional)
     * @param size Default: 8, Max:100 (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;IndexLinkedPlanRebalanceDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Linked Plan Rebalance Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Index-Linked-Plan-Rebalance-Details">Index
     *     Linked Plan Rebalance Details(USER_DATA) Documentation</a>
     */
    public ApiResponse<IndexLinkedPlanRebalanceDetailsResponse> indexLinkedPlanRebalanceDetails(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return tradeApi.indexLinkedPlanRebalanceDetails(
                startTime, endTime, current, size, recvWindow);
    }

    /**
     * Index Linked Plan Redemption(TRADE) To redeem index-Linked plan holdings Weight: 1
     *
     * @param indexLinkedPlanRedemptionRequest (required)
     * @return ApiResponse&lt;IndexLinkedPlanRedemptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Linked Plan Redemption </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Index-Linked-Plan-Redemption">Index
     *     Linked Plan Redemption(TRADE) Documentation</a>
     */
    public ApiResponse<IndexLinkedPlanRedemptionResponse> indexLinkedPlanRedemption(
            IndexLinkedPlanRedemptionRequest indexLinkedPlanRedemptionRequest) throws ApiException {
        return tradeApi.indexLinkedPlanRedemption(indexLinkedPlanRedemptionRequest);
    }

    /**
     * Index Linked Plan Redemption(USER_DATA) Get the history of Index Linked Plan Redemption
     * transactions * Max 30 day difference between &#x60;startTime&#x60; and &#x60;endTime&#x60; *
     * If no &#x60;startTime&#x60; and &#x60;endTime&#x60;, default to show past 30 day records
     * Weight: 1
     *
     * @param requestId request id (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Current query page. Default: 1, start from 1 (optional)
     * @param asset (optional)
     * @param size Default: 8, Max:100 (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;IndexLinkedPlanRedemptionTradeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Linked Plan Redemption </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Query-Index-Linked-Plan-Redemption">Index
     *     Linked Plan Redemption(USER_DATA) Documentation</a>
     */
    public ApiResponse<IndexLinkedPlanRedemptionTradeResponse> indexLinkedPlanRedemptionTrade(
            Long requestId,
            Long startTime,
            Long endTime,
            Long current,
            String asset,
            Long size,
            Long recvWindow)
            throws ApiException {
        return tradeApi.indexLinkedPlanRedemptionTrade(
                requestId, startTime, endTime, current, asset, size, recvWindow);
    }

    /**
     * Investment plan adjustment(TRADE) Query Source Asset to be used for investment * max one
     * request every 3s per account Weight: 1
     *
     * @param investmentPlanAdjustmentRequest (required)
     * @return ApiResponse&lt;InvestmentPlanAdjustmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Investment plan adjustment </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Investment-plan-adjustment">Investment
     *     plan adjustment(TRADE) Documentation</a>
     */
    public ApiResponse<InvestmentPlanAdjustmentResponse> investmentPlanAdjustment(
            InvestmentPlanAdjustmentRequest investmentPlanAdjustmentRequest) throws ApiException {
        return tradeApi.investmentPlanAdjustment(investmentPlanAdjustmentRequest);
    }

    /**
     * Investment plan creation(USER_DATA) Post an investment plan creation * max one request every
     * 3s per account Weight: 1
     *
     * @param investmentPlanCreationRequest (required)
     * @return ApiResponse&lt;InvestmentPlanCreationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Investment plan creation </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Investment-plan-creation">Investment
     *     plan creation(USER_DATA) Documentation</a>
     */
    public ApiResponse<InvestmentPlanCreationResponse> investmentPlanCreation(
            InvestmentPlanCreationRequest investmentPlanCreationRequest) throws ApiException {
        return tradeApi.investmentPlanCreation(investmentPlanCreationRequest);
    }

    /**
     * One Time Transaction(TRADE) One time transaction *
     * &#x60;planId&#x60;/&#x60;planId&#x60;/&#x60;details&#x60; must not all be null Weight: 1
     *
     * @param oneTimeTransactionRequest (required)
     * @return ApiResponse&lt;OneTimeTransactionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> One Time Transaction </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/auto_invest/trade/One-Time-Transaction">One
     *     Time Transaction(TRADE) Documentation</a>
     */
    public ApiResponse<OneTimeTransactionResponse> oneTimeTransaction(
            OneTimeTransactionRequest oneTimeTransactionRequest) throws ApiException {
        return tradeApi.oneTimeTransaction(oneTimeTransactionRequest);
    }

    /**
     * Query holding details of the plan(USER_DATA) Query holding details of the plan Weight: 1
     *
     * @param planId Plan identifier (optional)
     * @param requestId requestId when create (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QueryHoldingDetailsOfThePlanResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> holding details of the plan </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Query-holding-details-of-the-plan">Query
     *     holding details of the plan(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryHoldingDetailsOfThePlanResponse> queryHoldingDetailsOfThePlan(
            Long planId, String requestId, Long recvWindow) throws ApiException {
        return tradeApi.queryHoldingDetailsOfThePlan(planId, requestId, recvWindow);
    }

    /**
     * Query Index Linked Plan Position Details(USER_DATA) Details on users Index-Linked plan
     * position details Weight: 1
     *
     * @param indexId (required)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QueryIndexLinkedPlanPositionDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Index Linked Plan Position Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Query-Index-Linked-Plan-Position-Details">Query
     *     Index Linked Plan Position Details(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryIndexLinkedPlanPositionDetailsResponse>
            queryIndexLinkedPlanPositionDetails(Long indexId, Long recvWindow) throws ApiException {
        return tradeApi.queryIndexLinkedPlanPositionDetails(indexId, recvWindow);
    }

    /**
     * Query One-Time Transaction Status(USER_DATA) Transaction status for one-time transaction
     * Weight: 1
     *
     * @param transactionId PORTFOLIO plan&#39;s Id (required)
     * @param requestId requestId when create (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QueryOneTimeTransactionStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> One-Time Transaction Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Query-One-Time-Transaction-Status">Query
     *     One-Time Transaction Status(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOneTimeTransactionStatusResponse> queryOneTimeTransactionStatus(
            Long transactionId, String requestId, Long recvWindow) throws ApiException {
        return tradeApi.queryOneTimeTransactionStatus(transactionId, requestId, recvWindow);
    }

    /**
     * Query subscription transaction history(USER_DATA) Query subscription transaction history of a
     * plan * Max span between startTime and endTime is 30days * If both startTime and endTime are
     * null，then default is 30days Weight: 1
     *
     * @param planId Plan identifier (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param targetAsset Plan identifier (optional)
     * @param planType SINGLE, PORTFOLIO, INDEX, ALL (optional)
     * @param size Default: 8, Max:100 (optional)
     * @param current Current query page. Default: 1, start from 1 (optional)
     * @param recvWindow no more than &#x60;&#x60;&#x60;60000&#x60;&#x60;&#x60; (optional)
     * @return ApiResponse&lt;QuerySubscriptionTransactionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> subscription transaction history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/auto_invest/trade/Query-subscription-transaction-history">Query
     *     subscription transaction history(USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubscriptionTransactionHistoryResponse>
            querySubscriptionTransactionHistory(
                    Long planId,
                    Long startTime,
                    Long endTime,
                    Long targetAsset,
                    Long planType,
                    Long size,
                    Long current,
                    Long recvWindow)
                    throws ApiException {
        return tradeApi.querySubscriptionTransactionHistory(
                planId, startTime, endTime, targetAsset, planType, size, current, recvWindow);
    }
}
