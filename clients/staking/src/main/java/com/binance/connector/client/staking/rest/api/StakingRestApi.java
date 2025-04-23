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
import com.binance.connector.client.staking.rest.model.GetSolRedemptionHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetSolStakingHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetSolStakingQuotaDetailsResponse;
import com.binance.connector.client.staking.rest.model.GetUnclaimedRewardsResponse;
import com.binance.connector.client.staking.rest.model.GetWbethRateHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethRewardsHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethUnwrapHistoryResponse;
import com.binance.connector.client.staking.rest.model.GetWbethWrapHistoryResponse;
import com.binance.connector.client.staking.rest.model.RedeemEthRequest;
import com.binance.connector.client.staking.rest.model.RedeemEthResponse;
import com.binance.connector.client.staking.rest.model.RedeemSolRequest;
import com.binance.connector.client.staking.rest.model.RedeemSolResponse;
import com.binance.connector.client.staking.rest.model.SolStakingAccountResponse;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeEthStakingResponse;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingRequest;
import com.binance.connector.client.staking.rest.model.SubscribeSolStakingResponse;
import com.binance.connector.client.staking.rest.model.WrapBethRequest;
import com.binance.connector.client.staking.rest.model.WrapBethResponse;

public class StakingRestApi {

    private final EthStakingApi ethStakingApi;
    private final SolStakingApi solStakingApi;

    public StakingRestApi(ClientConfiguration configuration) {
        this(StakingRestApiUtil.getDefaultClient(configuration));
    }

    public StakingRestApi(ApiClient apiClient) {
        this.ethStakingApi = new EthStakingApi(apiClient);
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
