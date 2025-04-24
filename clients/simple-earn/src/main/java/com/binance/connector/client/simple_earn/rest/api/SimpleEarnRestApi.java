package com.binance.connector.client.simple_earn.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.model.GetCollateralRecordResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexiblePersonalLeftQuotaResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleProductPositionResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleRedemptionRecordResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleRewardsHistoryResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleSubscriptionPreviewResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleSubscriptionRecordResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedPersonalLeftQuotaResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedProductPositionResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedRedemptionRecordResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedRewardsHistoryResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedSubscriptionPreviewResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedSubscriptionRecordResponse;
import com.binance.connector.client.simple_earn.rest.model.GetRateHistoryResponse;
import com.binance.connector.client.simple_earn.rest.model.GetSimpleEarnFlexibleProductListResponse;
import com.binance.connector.client.simple_earn.rest.model.GetSimpleEarnLockedProductListResponse;
import com.binance.connector.client.simple_earn.rest.model.RedeemFlexibleProductRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemFlexibleProductResponse;
import com.binance.connector.client.simple_earn.rest.model.RedeemLockedProductRequest;
import com.binance.connector.client.simple_earn.rest.model.RedeemLockedProductResponse;
import com.binance.connector.client.simple_earn.rest.model.SetFlexibleAutoSubscribeRequest;
import com.binance.connector.client.simple_earn.rest.model.SetFlexibleAutoSubscribeResponse;
import com.binance.connector.client.simple_earn.rest.model.SetLockedAutoSubscribeRequest;
import com.binance.connector.client.simple_earn.rest.model.SetLockedAutoSubscribeResponse;
import com.binance.connector.client.simple_earn.rest.model.SetLockedProductRedeemOptionRequest;
import com.binance.connector.client.simple_earn.rest.model.SetLockedProductRedeemOptionResponse;
import com.binance.connector.client.simple_earn.rest.model.SimpleAccountResponse;
import com.binance.connector.client.simple_earn.rest.model.SubscribeFlexibleProductRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeFlexibleProductResponse;
import com.binance.connector.client.simple_earn.rest.model.SubscribeLockedProductRequest;
import com.binance.connector.client.simple_earn.rest.model.SubscribeLockedProductResponse;

public class SimpleEarnRestApi {

    private final AccountApi accountApi;
    private final EarnApi earnApi;
    private final HistoryApi historyApi;

    public SimpleEarnRestApi(ClientConfiguration configuration) {
        this(SimpleEarnRestApiUtil.getDefaultClient(configuration));
    }

    public SimpleEarnRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.earnApi = new EarnApi(apiClient);
        this.historyApi = new HistoryApi(apiClient);
    }

    /**
     * Get Flexible Personal Left Quota(USER_DATA) Get Flexible Personal Left Quota Weight: 150
     *
     * @param productId (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexiblePersonalLeftQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Personal Left Quota </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Personal-Left-Quota">Get
     *     Flexible Personal Left Quota(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexiblePersonalLeftQuotaResponse> getFlexiblePersonalLeftQuota(
            String productId, Long recvWindow) throws ApiException {
        return accountApi.getFlexiblePersonalLeftQuota(productId, recvWindow);
    }

    /**
     * Get Flexible Product Position(USER_DATA) Get Flexible Product Position Weight: 150
     *
     * @param asset (optional)
     * @param productId (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleProductPositionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Product Position </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Product-Position">Get
     *     Flexible Product Position(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleProductPositionResponse> getFlexibleProductPosition(
            String asset, String productId, Long current, Long size, Long recvWindow)
            throws ApiException {
        return accountApi.getFlexibleProductPosition(asset, productId, current, size, recvWindow);
    }

    /**
     * Get Locked Personal Left Quota(USER_DATA) Get Locked Personal Left Quota Weight: 150
     *
     * @param projectId (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedPersonalLeftQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Personal Left Quota </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Locked-Personal-Left-Quota">Get
     *     Locked Personal Left Quota(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLockedPersonalLeftQuotaResponse> getLockedPersonalLeftQuota(
            String projectId, Long recvWindow) throws ApiException {
        return accountApi.getLockedPersonalLeftQuota(projectId, recvWindow);
    }

    /**
     * Get Locked Product Position Get Locked Product Position Weight: 150
     *
     * @param asset (optional)
     * @param positionId (optional)
     * @param projectId (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedProductPositionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Product Position </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Locked-Product-Position">Get
     *     Locked Product Position Documentation</a>
     */
    public ApiResponse<GetLockedProductPositionResponse> getLockedProductPosition(
            String asset,
            String positionId,
            String projectId,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return accountApi.getLockedProductPosition(
                asset, positionId, projectId, current, size, recvWindow);
    }

    /**
     * Get Simple Earn Flexible Product List(USER_DATA) Get available Simple Earn flexible product
     * list Weight: 150
     *
     * @param asset (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSimpleEarnFlexibleProductListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Simple Earn Flexible Product List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Flexible-Product-List">Get
     *     Simple Earn Flexible Product List(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSimpleEarnFlexibleProductListResponse> getSimpleEarnFlexibleProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return accountApi.getSimpleEarnFlexibleProductList(asset, current, size, recvWindow);
    }

    /**
     * Get Simple Earn Locked Product List(USER_DATA) Get Simple Earn Locked Product List * Get
     * available Simple Earn locked product list Weight: 150
     *
     * @param asset (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSimpleEarnLockedProductListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Simple Earn Locked Product List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Locked-Product-List">Get
     *     Simple Earn Locked Product List(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSimpleEarnLockedProductListResponse> getSimpleEarnLockedProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return accountApi.getSimpleEarnLockedProductList(asset, current, size, recvWindow);
    }

    /**
     * Simple Account(USER_DATA) Simple Account query Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;SimpleAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Simple Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Simple-Account">Simple
     *     Account(USER_DATA) Documentation</a>
     */
    public ApiResponse<SimpleAccountResponse> simpleAccount(Long recvWindow) throws ApiException {
        return accountApi.simpleAccount(recvWindow);
    }

    /**
     * Get Flexible Subscription Preview(USER_DATA) Get Flexible Subscription Preview Weight: 150
     *
     * @param productId (required)
     * @param amount (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleSubscriptionPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Subscription Preview </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Get-Flexible-Subscription-Preview">Get
     *     Flexible Subscription Preview(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleSubscriptionPreviewResponse> getFlexibleSubscriptionPreview(
            String productId, Double amount, Long recvWindow) throws ApiException {
        return earnApi.getFlexibleSubscriptionPreview(productId, amount, recvWindow);
    }

    /**
     * Get Locked Subscription Preview(USER_DATA) Get Locked Subscription Preview Weight: 150
     *
     * @param projectId (required)
     * @param amount (required)
     * @param autoSubscribe true or false, default true. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedSubscriptionPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Subscription Preview </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Get-Locked-Subscription-Preview">Get
     *     Locked Subscription Preview(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLockedSubscriptionPreviewResponse> getLockedSubscriptionPreview(
            String projectId, Double amount, Boolean autoSubscribe, Long recvWindow)
            throws ApiException {
        return earnApi.getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow);
    }

    /**
     * Redeem Flexible Product(TRADE) Redeem Flexible Product * You need to open &#x60;Enable Spot
     * &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint. Weight: 1
     *
     * @param redeemFlexibleProductRequest (required)
     * @return ApiResponse&lt;RedeemFlexibleProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem Flexible Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Redeem-Flexible-Product">Redeem
     *     Flexible Product(TRADE) Documentation</a>
     */
    public ApiResponse<RedeemFlexibleProductResponse> redeemFlexibleProduct(
            RedeemFlexibleProductRequest redeemFlexibleProductRequest) throws ApiException {
        return earnApi.redeemFlexibleProduct(redeemFlexibleProductRequest);
    }

    /**
     * Redeem Locked Product(TRADE) Redeem Locked Product * You need to open &#x60;Enable Spot &amp;
     * Margin Trading&#x60; permission for the API Key which requests this endpoint. Weight: 1/3s
     * per account
     *
     * @param redeemLockedProductRequest (required)
     * @return ApiResponse&lt;RedeemLockedProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem Locked Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Redeem-Locked-Product">Redeem
     *     Locked Product(TRADE) Documentation</a>
     */
    public ApiResponse<RedeemLockedProductResponse> redeemLockedProduct(
            RedeemLockedProductRequest redeemLockedProductRequest) throws ApiException {
        return earnApi.redeemLockedProduct(redeemLockedProductRequest);
    }

    /**
     * Set Flexible Auto Subscribe(USER_DATA) Set Flexible Auto Subscribe Weight: 150
     *
     * @param setFlexibleAutoSubscribeRequest (required)
     * @return ApiResponse&lt;SetFlexibleAutoSubscribeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Flexible Auto Subscribe </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Set-Flexible-Auto-Subscribe">Set
     *     Flexible Auto Subscribe(USER_DATA) Documentation</a>
     */
    public ApiResponse<SetFlexibleAutoSubscribeResponse> setFlexibleAutoSubscribe(
            SetFlexibleAutoSubscribeRequest setFlexibleAutoSubscribeRequest) throws ApiException {
        return earnApi.setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest);
    }

    /**
     * Set Locked Auto Subscribe(USER_DATA) Set locked auto subscribe Weight: 150
     *
     * @param setLockedAutoSubscribeRequest (required)
     * @return ApiResponse&lt;SetLockedAutoSubscribeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Locked Auto Subscribe </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Set-Locked-Auto-Subscribe">Set
     *     Locked Auto Subscribe(USER_DATA) Documentation</a>
     */
    public ApiResponse<SetLockedAutoSubscribeResponse> setLockedAutoSubscribe(
            SetLockedAutoSubscribeRequest setLockedAutoSubscribeRequest) throws ApiException {
        return earnApi.setLockedAutoSubscribe(setLockedAutoSubscribeRequest);
    }

    /**
     * Set Locked Product Redeem Option(USER_DATA) Set redeem option for Locked product Weight: 50
     *
     * @param setLockedProductRedeemOptionRequest (required)
     * @return ApiResponse&lt;SetLockedProductRedeemOptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Locked Product Redeem Option </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Set-Locked-Redeem-Option">Set
     *     Locked Product Redeem Option(USER_DATA) Documentation</a>
     */
    public ApiResponse<SetLockedProductRedeemOptionResponse> setLockedProductRedeemOption(
            SetLockedProductRedeemOptionRequest setLockedProductRedeemOptionRequest)
            throws ApiException {
        return earnApi.setLockedProductRedeemOption(setLockedProductRedeemOptionRequest);
    }

    /**
     * Subscribe Flexible Product(TRADE) Subscribe Flexible Product * You need to open &#x60;Enable
     * Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.
     * Weight: 1
     *
     * @param subscribeFlexibleProductRequest (required)
     * @return ApiResponse&lt;SubscribeFlexibleProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe Flexible Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Subscribe-Flexible-Product">Subscribe
     *     Flexible Product(TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeFlexibleProductResponse> subscribeFlexibleProduct(
            SubscribeFlexibleProductRequest subscribeFlexibleProductRequest) throws ApiException {
        return earnApi.subscribeFlexibleProduct(subscribeFlexibleProductRequest);
    }

    /**
     * Subscribe Locked Product(TRADE) Subscribe Locked Product * You need to open &#x60;Enable Spot
     * &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint. Weight: 1
     *
     * @param subscribeLockedProductRequest (required)
     * @return ApiResponse&lt;SubscribeLockedProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe Locked Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/earn/Subscribe-Locked-Product">Subscribe
     *     Locked Product(TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeLockedProductResponse> subscribeLockedProduct(
            SubscribeLockedProductRequest subscribeLockedProductRequest) throws ApiException {
        return earnApi.subscribeLockedProduct(subscribeLockedProductRequest);
    }

    /**
     * Get Collateral Record(USER_DATA) Get Collateral Record * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 30 days. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 1
     *
     * @param productId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCollateralRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Collateral Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Collateral-Record">Get
     *     Collateral Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCollateralRecordResponse> getCollateralRecord(
            String productId,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getCollateralRecord(
                productId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Flexible Redemption Record(USER_DATA) Get Flexible Redemption Record * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param productId (optional)
     * @param redeemId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @return ApiResponse&lt;GetFlexibleRedemptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Redemption Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Redemption-Record">Get
     *     Flexible Redemption Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleRedemptionRecordResponse> getFlexibleRedemptionRecord(
            String productId,
            String redeemId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size)
            throws ApiException {
        return historyApi.getFlexibleRedemptionRecord(
                productId, redeemId, asset, startTime, endTime, current, size);
    }

    /**
     * Get Flexible Rewards History(USER_DATA) Get Flexible Rewards History * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param type &#x60;Bonus&#x60; - Bonus tiered APR, &#x60;REALTIME&#x60; Real-time APR,
     *     &#x60;REWARDS&#x60; Historical rewards,&#x60;ALL&#x60;(set to default) (required)
     * @param productId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Rewards History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Rewards-History">Get
     *     Flexible Rewards History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleRewardsHistoryResponse> getFlexibleRewardsHistory(
            String type,
            String productId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getFlexibleRewardsHistory(
                type, productId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Flexible Subscription Record(USER_DATA) Get Flexible Subscription Record * The time
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param productId (optional)
     * @param purchaseId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFlexibleSubscriptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Flexible Subscription Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Subscription-Record">Get
     *     Flexible Subscription Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFlexibleSubscriptionRecordResponse> getFlexibleSubscriptionRecord(
            String productId,
            String purchaseId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getFlexibleSubscriptionRecord(
                productId, purchaseId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Locked Redemption Record(USER_DATA) Get Locked Redemption Record * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param positionId (optional)
     * @param redeemId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedRedemptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Redemption Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Redemption-Record">Get
     *     Locked Redemption Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLockedRedemptionRecordResponse> getLockedRedemptionRecord(
            String positionId,
            String redeemId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getLockedRedemptionRecord(
                positionId, redeemId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Locked Rewards History(USER_DATA) Get Locked Rewards History * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param positionId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Rewards History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Rewards-History">Get
     *     Locked Rewards History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLockedRewardsHistoryResponse> getLockedRewardsHistory(
            String positionId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getLockedRewardsHistory(
                positionId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Locked Subscription Record(USER_DATA) Get Locked Subscription Record * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param purchaseId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetLockedSubscriptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Locked Subscription Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Subscription-Record">Get
     *     Locked Subscription Record(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetLockedSubscriptionRecordResponse> getLockedSubscriptionRecord(
            String purchaseId,
            String asset,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getLockedSubscriptionRecord(
                purchaseId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Rate History(USER_DATA) Get Rate History * The time between startTime and endTime cannot
     * be longer than 1 year. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 150
     *
     * @param productId (required)
     * @param aprPeriod \&quot;DAY\&quot;,\&quot;YEAR\&quot;,default\&quot;DAY\&quot; (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying the page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Rate-History">Get
     *     Rate History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetRateHistoryResponse> getRateHistory(
            String productId,
            String aprPeriod,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return historyApi.getRateHistory(
                productId, aprPeriod, startTime, endTime, current, size, recvWindow);
    }
}
