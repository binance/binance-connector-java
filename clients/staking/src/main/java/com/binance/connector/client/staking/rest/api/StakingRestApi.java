package com.binance.connector.client.staking.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsRequest;
import com.binance.connector.client.staking.rest.model.ClaimBoostRewardsResponse;
import com.binance.connector.client.staking.rest.model.EthStakingAccountResponse;
import com.binance.connector.client.staking.rest.model.GetBnsolRateHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetBnsolRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetBoostRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetCurrentEthStakingQuotaResponse;
import com.binance.connector.client.staking.rest.model.GetEthRedemptionHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetEthStakingHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedPersonalLeftQuotaResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedProductListResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedProductPositionResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedRedemptionRecordResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedSubscriptionPreviewResponse;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedSubscriptionRecordResponse;
import com.binance.connector.client.staking.rest.model.GetSoftStakingProductListResponse;
import com.binance.connector.client.staking.rest.model.GetSoftStakingRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetSolRedemptionHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetSolStakingHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetSolStakingQuotaDetailsResponse;
import com.binance.connector.client.staking.rest.model.GetUnclaimedRewardsResponse;
import com.binance.connector.client.staking.rest.model.GetWbethRateHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethUnwrapHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethWrapHistoryResponse;
import com.binance.connector.client.staking.rest.model.OnChainYieldsAccountResponse;
import com.binance.connector.client.staking.rest.model.RedeemEthRequest;
import com.binance.connector.client.staking.rest.model.RedeemEthResponse;
import com.binance.connector.client.staking.rest.model.RedeemOnChainYieldsLockedProductRequest;
import com.binance.connector.client.staking.rest.model.RedeemOnChainYieldsLockedProductResponse;
import com.binance.connector.client.staking.rest.model.RedeemSolRequest;
import com.binance.connector.client.staking.rest.model.RedeemSolResponse;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedAutoSubscribeRequest;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedAutoSubscribeResponse;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedProductRedeemOptionRequest;
import com.binance.connector.client.staking.rest.model.SetOnChainYieldsLockedProductRedeemOptionResponse;
import com.binance.connector.client.staking.rest.model.SetSoftStakingResponse;
import com.binance.connector.client.staking.rest.model.SolStakingAccountResponse;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingResponse;
import com.binance.connector.client.staking.rest.model.SubscribeOnChainYieldsLockedProductRequest;
import com.binance.connector.client.staking.rest.model.SubscribeOnChainYieldsLockedProductResponse;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingResponse;
import com.binance.connector.client.staking.rest.model.WrapBethRequest;
import com.binance.connector.client.staking.rest.model.WrapBethResponse;

public class StakingRestApi {

    private final EthStakingApi ethStakingApi;
    private final OnChainYieldsApi onChainYieldsApi;
    private final SoftStakingApi softStakingApi;
    private final SolStakingApi solStakingApi;

    public StakingRestApi(ClientConfiguration configuration) {
        this(StakingRestApiUtil.getDefaultClient(configuration));
    }

    public StakingRestApi(ApiClient apiClient) {
        this.ethStakingApi = new EthStakingApi(apiClient);
        this.onChainYieldsApi = new OnChainYieldsApi(apiClient);
        this.softStakingApi = new SoftStakingApi(apiClient);
        this.solStakingApi = new SolStakingApi(apiClient);
    }

    /**
     * ETH Staking account(USER_DATA) ETH Staking account Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;EthStakingAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> ETH Staking account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/account/ETH-Staking-account">ETH
     *     Staking account(USER_DATA) Documentation</a>
     */
    public ApiResponse<EthStakingAccountResponse> ethStakingAccount(Long recvWindow)
            throws ApiException {
        return ethStakingApi.ethStakingAccount(recvWindow);
    }

    /**
     * Get current ETH staking quota(USER_DATA) Get current ETH staking quota Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCurrentEthStakingQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get current ETH staking quota </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/account/Get-current-ETH-staking-quota">Get
     *     current ETH staking quota(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCurrentEthStakingQuotaResponse> getCurrentEthStakingQuota(Long recvWindow)
            throws ApiException {
        return ethStakingApi.getCurrentEthStakingQuota(recvWindow);
    }

    /**
     * Get ETH redemption history(USER_DATA) Get ETH redemption history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetEthRedemptionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get ETH redemption history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-ETH-redemption-history">Get
     *     ETH redemption history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetEthRedemptionHistoryResponse> getEthRedemptionHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getEthRedemptionHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get ETH staking history(USER_DATA) Get ETH staking history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetEthStakingHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get ETH staking history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-ETH-staking-history">Get
     *     ETH staking history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetEthStakingHistoryResponse> getEthStakingHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getEthStakingHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH Rate History(USER_DATA) Get WBETH Rate History * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetWbethRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get WBETH Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-BETH-Rate-History">Get
     *     WBETH Rate History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethRateHistoryResponse> getWbethRateHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethRateHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH rewards history(USER_DATA) Get WBETH rewards history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetWbethRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get WBETH rewards history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-WBETH-rewards-history">Get
     *     WBETH rewards history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethRewardsHistoryResponse> getWbethRewardsHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethRewardsHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH unwrap history(USER_DATA) Get WBETH unwrap history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetWbethUnwrapHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get WBETH unwrap history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-WBETH-unwrap-history">Get
     *     WBETH unwrap history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethUnwrapHistoryResponse> getWbethUnwrapHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethUnwrapHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH wrap history(USER_DATA) Get WBETH wrap history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetWbethWrapHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get WBETH wrap history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/history/Get-WBETH-wrap-history">Get
     *     WBETH wrap history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethWrapHistoryResponse> getWbethWrapHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethWrapHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Redeem ETH(TRADE) Redeem WBETH or BETH and get ETH * You need to open Enable Spot &amp;
     * Margin Trading permission for the API Key which requests this endpoint. Weight: 150
     *
     * @param redeemEthRequest (required)
     * @return ApiResponse&lt;RedeemEthResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem ETH </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/staking/Redeem-ETH">Redeem
     *     ETH(TRADE) Documentation</a>
     */
    public ApiResponse<RedeemEthResponse> redeemEth(RedeemEthRequest redeemEthRequest)
            throws ApiException {
        return ethStakingApi.redeemEth(redeemEthRequest);
    }

    /**
     * Subscribe ETH Staking(TRADE) Subscribe ETH Staking * You need to open Enable Spot &amp;
     * Margin Trading permission for the API Key which requests this endpoint. Weight: 150
     *
     * @param subscribeEthStakingRequest (required)
     * @return ApiResponse&lt;SubscribeEthStakingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe ETH Staking </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/eth-staking/staking/Subscribe-ETH-Staking">Subscribe
     *     ETH Staking(TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeEthStakingResponse> subscribeEthStaking(
            SubscribeEthStakingRequest subscribeEthStakingRequest) throws ApiException {
        return ethStakingApi.subscribeEthStaking(subscribeEthStakingRequest);
    }

    /**
     * Wrap BETH(TRADE) Wrap BETH * You need to open Enable Spot &amp; Margin Trading permission for
     * the API Key which requests this endpoint. Weight: 150
     *
     * @param wrapBethRequest (required)
     * @return ApiResponse&lt;WrapBethResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Wrap BETH </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/eth-staking/staking/Wrap-BETH">Wrap
     *     BETH(TRADE) Documentation</a>
     */
    public ApiResponse<WrapBethResponse> wrapBeth(WrapBethRequest wrapBethRequest)
            throws ApiException {
        return ethStakingApi.wrapBeth(wrapBethRequest);
    }

    /**
     * Get On-chain Yields Locked Personal Left Quota (USER_DATA) Get On-chain Yields Locked
     * Personal Left Quota Weight: 50
     *
     * @param projectId (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedPersonalLeftQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Personal Left Quota </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/account/Get-Onchain-Locked-Personal-Left-Quota">Get
     *     On-chain Yields Locked Personal Left Quota (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedPersonalLeftQuotaResponse>
            getOnChainYieldsLockedPersonalLeftQuota(String projectId, Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedPersonalLeftQuota(projectId, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Product List (USER_DATA) Get available On-chain Yields Locked
     * product list * Get available On-chain Yields Locked product list Weight: 50
     *
     * @param asset (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedProductListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Product List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/on-chain-yields/account/">Get
     *     On-chain Yields Locked Product List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedProductListResponse> getOnChainYieldsLockedProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedProductList(asset, current, size, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Product Position (USER_DATA) Get On-chain Yields Locked Product
     * Position Weight: 50
     *
     * @param asset (optional)
     * @param positionId (optional)
     * @param projectId (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedProductPositionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Product Position </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/account/Get-Onchain-Locked-Product-Position">Get
     *     On-chain Yields Locked Product Position (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedProductPositionResponse>
            getOnChainYieldsLockedProductPosition(
                    String asset,
                    String positionId,
                    String projectId,
                    Long current,
                    Long size,
                    Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedProductPosition(
                asset, positionId, projectId, current, size, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Redemption Record (USER_DATA) Get On-chain Yields Locked
     * Redemption Record * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 50
     *
     * @param positionId (optional)
     * @param redeemId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedRedemptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Redemption Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/history/Get-Onchain-Locked-Redemption-Record">Get
     *     On-chain Yields Locked Redemption Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedRedemptionRecordResponse>
            getOnChainYieldsLockedRedemptionRecord(
                    String positionId,
                    String redeemId,
                    String asset,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long size,
                    Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedRedemptionRecord(
                positionId, redeemId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Rewards History (USER_DATA) Get On-chain Yields Locked Rewards
     * History * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer
     * than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the
     * last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 50
     *
     * @param positionId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Rewards History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/history/Get-Onchain-Locked-Rewards-History">Get
     *     On-chain Yields Locked Rewards History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedRewardsHistoryResponse>
            getOnChainYieldsLockedRewardsHistory(
                    String positionId,
                    String asset,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long size,
                    Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedRewardsHistory(
                positionId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Subscription Preview (USER_DATA) Get On-chain Yields Locked
     * Subscription Preview Weight: 50
     *
     * @param projectId (required)
     * @param amount (required)
     * @param autoSubscribe true or false, default true. (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedSubscriptionPreviewResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Subscription Preview </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/on-chain-yields/earn/">Get On-chain
     *     Yields Locked Subscription Preview (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedSubscriptionPreviewResponse>
            getOnChainYieldsLockedSubscriptionPreview(
                    String projectId, Double amount, Boolean autoSubscribe, Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedSubscriptionPreview(
                projectId, amount, autoSubscribe, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Subscription Record (USER_DATA) Get On-chain Yields Locked
     * Subscription Record * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot
     * be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not
     * sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent
     * but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 50
     *
     * @param purchaseId (optional)
     * @param clientId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetOnChainYieldsLockedSubscriptionRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get On-chain Yields Locked Subscription Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/on-chain-yields/history/">Get
     *     On-chain Yields Locked Subscription Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedSubscriptionRecordResponse>
            getOnChainYieldsLockedSubscriptionRecord(
                    String purchaseId,
                    String clientId,
                    String asset,
                    Long startTime,
                    Long endTime,
                    Long current,
                    Long size,
                    Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedSubscriptionRecord(
                purchaseId, clientId, asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * On-chain Yields Account (USER_DATA) On-chain Yields Account query Weight: 50
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;OnChainYieldsAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> On-chain Yields Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/account/Onchain-Account">On-chain
     *     Yields Account (USER_DATA) Documentation</a>
     */
    public ApiResponse<OnChainYieldsAccountResponse> onChainYieldsAccount(Long recvWindow)
            throws ApiException {
        return onChainYieldsApi.onChainYieldsAccount(recvWindow);
    }

    /**
     * Redeem On-chain Yields Locked Product (TRADE) Redeem On-chain Yields Locked Product * You
     * need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which
     * requests this endpoint. Weight: 1/3s per account
     *
     * @param redeemOnChainYieldsLockedProductRequest (required)
     * @return ApiResponse&lt;RedeemOnChainYieldsLockedProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem On-chain Yields Locked Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/earn/Redeem-Onchain-Locked-Product">Redeem
     *     On-chain Yields Locked Product (TRADE) Documentation</a>
     */
    public ApiResponse<RedeemOnChainYieldsLockedProductResponse> redeemOnChainYieldsLockedProduct(
            RedeemOnChainYieldsLockedProductRequest redeemOnChainYieldsLockedProductRequest)
            throws ApiException {
        return onChainYieldsApi.redeemOnChainYieldsLockedProduct(
                redeemOnChainYieldsLockedProductRequest);
    }

    /**
     * Set On-chain Yields Locked Auto Subscribe(USER_DATA) Set On-chain Yield locked auto subscribe
     * Weight: 50
     *
     * @param setOnChainYieldsLockedAutoSubscribeRequest (required)
     * @return ApiResponse&lt;SetOnChainYieldsLockedAutoSubscribeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set On-chain Yields Locked Auto Subscribe </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/earn/Set-Onchain-Locked-Auto-Subscribe">Set
     *     On-chain Yields Locked Auto Subscribe(USER_DATA) Documentation</a>
     */
    public ApiResponse<SetOnChainYieldsLockedAutoSubscribeResponse>
            setOnChainYieldsLockedAutoSubscribe(
                    SetOnChainYieldsLockedAutoSubscribeRequest
                            setOnChainYieldsLockedAutoSubscribeRequest)
                    throws ApiException {
        return onChainYieldsApi.setOnChainYieldsLockedAutoSubscribe(
                setOnChainYieldsLockedAutoSubscribeRequest);
    }

    /**
     * Set On-chain Yields Locked Product Redeem Option(USER_DATA) Set On-chain Yields redeem option
     * for Locked product Weight: 50
     *
     * @param setOnChainYieldsLockedProductRedeemOptionRequest (required)
     * @return ApiResponse&lt;SetOnChainYieldsLockedProductRedeemOptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set On-chain Yields Locked Product Redeem Option </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/earn/Set-Onchain-Locked-Redeem-Option">Set
     *     On-chain Yields Locked Product Redeem Option(USER_DATA) Documentation</a>
     */
    public ApiResponse<SetOnChainYieldsLockedProductRedeemOptionResponse>
            setOnChainYieldsLockedProductRedeemOption(
                    SetOnChainYieldsLockedProductRedeemOptionRequest
                            setOnChainYieldsLockedProductRedeemOptionRequest)
                    throws ApiException {
        return onChainYieldsApi.setOnChainYieldsLockedProductRedeemOption(
                setOnChainYieldsLockedProductRedeemOptionRequest);
    }

    /**
     * Subscribe On-chain Yields Locked Product(TRADE) Subscribe On-chain Yields Locked Product *
     * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key
     * which requests this endpoint. Weight: 200
     *
     * @param subscribeOnChainYieldsLockedProductRequest (required)
     * @return ApiResponse&lt;SubscribeOnChainYieldsLockedProductResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe On-chain Yields Locked Product </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/on-chain-yields/earn/Subscribe-Onchain-Locked-Product">Subscribe
     *     On-chain Yields Locked Product(TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeOnChainYieldsLockedProductResponse>
            subscribeOnChainYieldsLockedProduct(
                    SubscribeOnChainYieldsLockedProductRequest
                            subscribeOnChainYieldsLockedProductRequest)
                    throws ApiException {
        return onChainYieldsApi.subscribeOnChainYieldsLockedProduct(
                subscribeOnChainYieldsLockedProductRequest);
    }

    /**
     * Get Soft Staking Product List (USER_DATA) Get the available Soft Staking product list.
     * Weight: 50
     *
     * @param asset (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSoftStakingProductListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Soft Staking Product List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/soft-staking/">Get Soft Staking
     *     Product List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSoftStakingProductListResponse> getSoftStakingProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return softStakingApi.getSoftStakingProductList(asset, current, size, recvWindow);
    }

    /**
     * Get Soft Staking Rewards History(USER_DATA) * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If
     * &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data
     * beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 50
     *
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSoftStakingRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Soft Staking Rewards History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/soft-staking/Get-Soft-Staking-Rewards-History">Get
     *     Soft Staking Rewards History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSoftStakingRewardsHistoryResponse> getSoftStakingRewardsHistory(
            String asset, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return softStakingApi.getSoftStakingRewardsHistory(
                asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Set Soft Staking (USER_DATA) Enable or disable Soft Staking. Weight: 50
     *
     * @param softStaking true or false (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;SetSoftStakingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Set Soft Staking </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/staking/soft-staking/Set-Soft-Staking">Set
     *     Soft Staking (USER_DATA) Documentation</a>
     */
    public ApiResponse<SetSoftStakingResponse> setSoftStaking(Boolean softStaking, Long recvWindow)
            throws ApiException {
        return softStakingApi.setSoftStaking(softStaking, recvWindow);
    }

    /**
     * Claim Boost Rewards(TRADE) Claim Boost APR Airdrop Rewards * You need to open Enable Spot
     * &amp; Margin Trading permission for the API Key which requests this endpoint. Weight: 150
     *
     * @param claimBoostRewardsRequest (required)
     * @return ApiResponse&lt;ClaimBoostRewardsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Claim Boost Rewards </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/staking/Claim-Boost-Rewards">Claim
     *     Boost Rewards(TRADE) Documentation</a>
     */
    public ApiResponse<ClaimBoostRewardsResponse> claimBoostRewards(
            ClaimBoostRewardsRequest claimBoostRewardsRequest) throws ApiException {
        return solStakingApi.claimBoostRewards(claimBoostRewardsRequest);
    }

    /**
     * Get BNSOL Rate History(USER_DATA) Get BNSOL Rate History * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetBnsolRateHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get BNSOL Rate History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-BNSOL-Rate-History">Get
     *     BNSOL Rate History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnsolRateHistoryResponse> getBnsolRateHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBnsolRateHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get BNSOL rewards history(USER_DATA) Get BNSOL rewards history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetBnsolRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get BNSOL rewards history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-BNSOL-rewards-history">Get
     *     BNSOL rewards history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnsolRewardsHistoryResponse> getBnsolRewardsHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBnsolRewardsHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Boost Rewards History(USER_DATA) Get Boost rewards history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param type \&quot;CLAIM\&quot;, \&quot;DISTRIBUTE\&quot;, default \&quot;CLAIM\&quot;
     *     (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetBoostRewardsHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Boost Rewards History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-Boost-Rewards-History">Get
     *     Boost Rewards History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBoostRewardsHistoryResponse> getBoostRewardsHistory(
            String type, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBoostRewardsHistory(
                type, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL redemption history(USER_DATA) Get SOL redemption history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSolRedemptionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get SOL redemption history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-SOL-redemption-history">Get
     *     SOL redemption history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolRedemptionHistoryResponse> getSolRedemptionHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolRedemptionHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL staking history(USER_DATA) Get SOL staking history * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page. Start from 1. Default:1 (optional)
     * @param size Default:10, Max:100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSolStakingHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get SOL staking history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-SOL-staking-history">Get
     *     SOL staking history(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolStakingHistoryResponse> getSolStakingHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolStakingHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL staking quota details(USER_DATA) Get SOL staking quota Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSolStakingQuotaDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get SOL staking quota details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/account/Get-SOL-staking-quota-details">Get
     *     SOL staking quota details(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolStakingQuotaDetailsResponse> getSolStakingQuotaDetails(Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolStakingQuotaDetails(recvWindow);
    }

    /**
     * Get Unclaimed Rewards(USER_DATA) Get Unclaimed rewards * The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetUnclaimedRewardsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Unclaimed Rewards </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/history/Get-Unclaimed-Rewards">Get
     *     Unclaimed Rewards(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUnclaimedRewardsResponse> getUnclaimedRewards(Long recvWindow)
            throws ApiException {
        return solStakingApi.getUnclaimedRewards(recvWindow);
    }

    /**
     * Redeem SOL(TRADE) Redeem BNSOL get SOL * You need to open Enable Spot &amp; Margin Trading
     * permission for the API Key which requests this endpoint. Weight: 150
     *
     * @param redeemSolRequest (required)
     * @return ApiResponse&lt;RedeemSolResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem SOL </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/staking/Redeem-SOL">Redeem
     *     SOL(TRADE) Documentation</a>
     */
    public ApiResponse<RedeemSolResponse> redeemSol(RedeemSolRequest redeemSolRequest)
            throws ApiException {
        return solStakingApi.redeemSol(redeemSolRequest);
    }

    /**
     * SOL Staking account(USER_DATA) SOL Staking account Weight: 150
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;SolStakingAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> SOL Staking account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/account/SOL-Staking-account">SOL
     *     Staking account(USER_DATA) Documentation</a>
     */
    public ApiResponse<SolStakingAccountResponse> solStakingAccount(Long recvWindow)
            throws ApiException {
        return solStakingApi.solStakingAccount(recvWindow);
    }

    /**
     * Subscribe SOL Staking(TRADE) Subscribe SOL Staking * You need to open Enable Spot &amp;
     * Margin Trading permission for the API Key which requests this endpoint. Weight: 150
     *
     * @param subscribeSolStakingRequest (required)
     * @return ApiResponse&lt;SubscribeSolStakingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe SOL Staking </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/staking/sol-staking/staking/Subscribe-SOL-Staking">Subscribe
     *     SOL Staking(TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeSolStakingResponse> subscribeSolStaking(
            SubscribeSolStakingRequest subscribeSolStakingRequest) throws ApiException {
        return solStakingApi.subscribeSolStaking(subscribeSolStakingRequest);
    }
}
