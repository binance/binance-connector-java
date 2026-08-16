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
import com.binance.connector.client.staking.rest.model.OrderType;
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
     * ETH Staking account (USER_DATA) ETH Staking account Weight(IP): 150 Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#eth-staking-account">ETH
     *     Staking account (USER_DATA) Documentation</a>
     */
    public ApiResponse<EthStakingAccountResponse> ethStakingAccount(Long recvWindow)
            throws ApiException {
        return ethStakingApi.ethStakingAccount(recvWindow);
    }

    /**
     * Get current ETH staking quota (USER_DATA) Get current ETH staking quota Weight(IP): 150
     * Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-current-eth-staking-quota">Get
     *     current ETH staking quota (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCurrentEthStakingQuotaResponse> getCurrentEthStakingQuota(Long recvWindow)
            throws ApiException {
        return ethStakingApi.getCurrentEthStakingQuota(recvWindow);
    }

    /**
     * Get ETH redemption history (USER_DATA) Get ETH redemption history Weight(IP): 150 Security
     * Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param redeemId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-eth-redemption-history">Get
     *     ETH redemption history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetEthRedemptionHistoryResponse> getEthRedemptionHistory(
            Long redeemId, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getEthRedemptionHistory(
                redeemId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get ETH staking history (USER_DATA) Get ETH staking history Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param purchaseId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-eth-staking-history">Get
     *     ETH staking history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetEthStakingHistoryResponse> getEthStakingHistory(
            Long purchaseId, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getEthStakingHistory(
                purchaseId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH Rate History (USER_DATA) Get WBETH Rate History Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-wbeth-rate-history">Get
     *     WBETH Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethRateHistoryResponse> getWbethRateHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethRateHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH rewards history (USER_DATA) Get WBETH rewards history Weight(IP): 150 Security
     * Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-wbeth-rewards-history">Get
     *     WBETH rewards history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethRewardsHistoryResponse> getWbethRewardsHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethRewardsHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH unwrap history (USER_DATA) Get WBETH unwrap history Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-wbeth-unwrap-history">Get
     *     WBETH unwrap history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethUnwrapHistoryResponse> getWbethUnwrapHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethUnwrapHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get WBETH wrap history (USER_DATA) Get WBETH wrap history Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#get-wbeth-wrap-history">Get
     *     WBETH wrap history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetWbethWrapHistoryResponse> getWbethWrapHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return ethStakingApi.getWbethWrapHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Redeem ETH (TRADE) Redeem WBETH or BETH and get ETH Weight(IP): 150 Security Type: TRADE
     * Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which
     * requests this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#redeem-eth">Redeem
     *     ETH (TRADE) Documentation</a>
     */
    public ApiResponse<RedeemEthResponse> redeemEth(RedeemEthRequest redeemEthRequest)
            throws ApiException {
        return ethStakingApi.redeemEth(redeemEthRequest);
    }

    /**
     * Subscribe ETH Staking (TRADE) Subscribe ETH Staking Weight(IP): 150 Security Type: TRADE
     * Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which
     * requests this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#subscribe-eth-staking">Subscribe
     *     ETH Staking (TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeEthStakingResponse> subscribeEthStaking(
            SubscribeEthStakingRequest subscribeEthStakingRequest) throws ApiException {
        return ethStakingApi.subscribeEthStaking(subscribeEthStakingRequest);
    }

    /**
     * Wrap BETH (TRADE) Wrap BETH Weight(IP): 150 Security Type: TRADE Notes: - You need to open
     * Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/eth-staking#wrap-beth">Wrap
     *     BETH (TRADE) Documentation</a>
     */
    public ApiResponse<WrapBethResponse> wrapBeth(WrapBethRequest wrapBethRequest)
            throws ApiException {
        return ethStakingApi.wrapBeth(wrapBethRequest);
    }

    /**
     * Get On-chain Yields Locked Personal Left Quota (USER_DATA) Get On-chain Yields Locked
     * Personal Left Quota Weight(IP): 50 Security Type: USER_DATA
     *
     * @param projectId (required)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-personal-left-quota">Get
     *     On-chain Yields Locked Personal Left Quota (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedPersonalLeftQuotaResponse>
            getOnChainYieldsLockedPersonalLeftQuota(String projectId, Long recvWindow)
                    throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedPersonalLeftQuota(projectId, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Product List (USER_DATA) Get available On-chain Yields Locked
     * product list Weight(IP): 50 Security Type: USER_DATA Notes: - Get available On-chain Yields
     * Locked product list
     *
     * @param asset (optional)
     * @param current Currently querying page (optional)
     * @param size Number of results per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-product-list">Get
     *     On-chain Yields Locked Product List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetOnChainYieldsLockedProductListResponse> getOnChainYieldsLockedProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return onChainYieldsApi.getOnChainYieldsLockedProductList(asset, current, size, recvWindow);
    }

    /**
     * Get On-chain Yields Locked Product Position (USER_DATA) Get On-chain Yields Locked Product
     * Position Weight(IP): 50 Security Type: USER_DATA
     *
     * @param asset (optional)
     * @param positionId (optional)
     * @param projectId (optional)
     * @param current Currently querying page (optional)
     * @param size Number of results per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-product-position">Get
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
     * Redemption Record Weight(IP): 50 Security Type: USER_DATA Notes: - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. - If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. - If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned.
     *
     * @param positionId (optional)
     * @param redeemId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-redemption-record">Get
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
     * History Weight(IP): 50 Security Type: USER_DATA Notes: - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. - If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. - If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned.
     *
     * @param positionId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-rewards-history">Get
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
     * Subscription Preview Weight(IP): 50 Security Type: USER_DATA
     *
     * @param projectId (required)
     * @param amount (required)
     * @param autoSubscribe (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-subscription-preview">Get
     *     On-chain Yields Locked Subscription Preview (USER_DATA) Documentation</a>
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
     * Subscription Record Weight(IP): 50 Security Type: USER_DATA Notes: - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39;
     * data will be returned. - If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not
     * sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. - If
     * &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data
     * before &#x60;endTime&#x60; will be returned.
     *
     * @param purchaseId (optional)
     * @param clientId (optional)
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#get-on-chain-yields-locked-subscription-record">Get
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
     * On-chain Yields Account (USER_DATA) On-chain Yields Account query Weight(IP): 50 Security
     * Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than &#x60;60000&#x60; (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#on-chain-yields-account">On-chain
     *     Yields Account (USER_DATA) Documentation</a>
     */
    public ApiResponse<OnChainYieldsAccountResponse> onChainYieldsAccount(Long recvWindow)
            throws ApiException {
        return onChainYieldsApi.onChainYieldsAccount(recvWindow);
    }

    /**
     * Redeem On-chain Yields Locked Product (TRADE) Redeem On-chain Yields Locked Product
     * Weight(IP): 200 Security Type: TRADE Notes: - You need to open &#x60;Enable Spot &amp; Margin
     * Trading&#x60; permission for the API Key which requests this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#redeem-on-chain-yields-locked-product">Redeem
     *     On-chain Yields Locked Product (TRADE) Documentation</a>
     */
    public ApiResponse<RedeemOnChainYieldsLockedProductResponse> redeemOnChainYieldsLockedProduct(
            RedeemOnChainYieldsLockedProductRequest redeemOnChainYieldsLockedProductRequest)
            throws ApiException {
        return onChainYieldsApi.redeemOnChainYieldsLockedProduct(
                redeemOnChainYieldsLockedProductRequest);
    }

    /**
     * Set On-chain Yields Locked Auto Subscribe (USER_DATA) Set On-chain Yield locked auto
     * subscribe Weight(IP): 50 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#set-on-chain-yields-locked-auto-subscribe">Set
     *     On-chain Yields Locked Auto Subscribe (USER_DATA) Documentation</a>
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
     * Set On-chain Yields Locked Product Redeem Option (USER_DATA) Set On-chain Yields redeem
     * option for Locked product Weight(IP): 50 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#set-on-chain-yields-locked-product-redeem-option">Set
     *     On-chain Yields Locked Product Redeem Option (USER_DATA) Documentation</a>
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
     * Subscribe On-chain Yields Locked Product (TRADE) Subscribe On-chain Yields Locked Product
     * Weight(IP): 200 Security Type: TRADE Notes: - You need to open &#x60;Enable Spot &amp; Margin
     * Trading&#x60; permission for the API Key which requests this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/on-chain-yields#subscribe-on-chain-yields-locked-product">Subscribe
     *     On-chain Yields Locked Product (TRADE) Documentation</a>
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
     * Weight(IP): 50 Security Type: USER_DATA
     *
     * @param asset (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/soft-staking#get-soft-staking-product-list">Get
     *     Soft Staking Product List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSoftStakingProductListResponse> getSoftStakingProductList(
            String asset, Long current, Long size, Long recvWindow) throws ApiException {
        return softStakingApi.getSoftStakingProductList(asset, current, size, recvWindow);
    }

    /**
     * Get Soft Staking Rewards History (USER_DATA) Get Soft Staking Rewards History Weight(IP): 50
     * Security Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; cannot be longer than 3 months. - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. - If
     * &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data
     * beginning from &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/soft-staking#get-soft-staking-rewards-history">Get
     *     Soft Staking Rewards History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSoftStakingRewardsHistoryResponse> getSoftStakingRewardsHistory(
            String asset, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return softStakingApi.getSoftStakingRewardsHistory(
                asset, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Set Soft Staking (USER_DATA) Enable or disable Soft Staking. Weight(IP): 50 Security Type:
     * USER_DATA
     *
     * @param softStaking (required)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/soft-staking#set-soft-staking">Set
     *     Soft Staking (USER_DATA) Documentation</a>
     */
    public ApiResponse<SetSoftStakingResponse> setSoftStaking(Boolean softStaking, Long recvWindow)
            throws ApiException {
        return softStakingApi.setSoftStaking(softStaking, recvWindow);
    }

    /**
     * Claim Boost Rewards (TRADE) Claim Boost APR Airdrop Rewards Weight(IP): 150 Security Type:
     * TRADE Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key
     * which requests this endpoint.
     *
     * @param claimBoostRewardsRequest (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#claim-boost-rewards">Claim
     *     Boost Rewards (TRADE) Documentation</a>
     */
    public ApiResponse<ClaimBoostRewardsResponse> claimBoostRewards(
            ClaimBoostRewardsRequest claimBoostRewardsRequest) throws ApiException {
        return solStakingApi.claimBoostRewards(claimBoostRewardsRequest);
    }

    /**
     * Get BNSOL Rate History (USER_DATA) Get BNSOL Rate History Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow The value cannot be greater than 60000 (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-bnsol-rate-history">Get
     *     BNSOL Rate History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnsolRateHistoryResponse> getBnsolRateHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBnsolRateHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get BNSOL rewards history (USER_DATA) Get BNSOL rewards history Weight(IP): 150 Security
     * Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-bnsol-rewards-history">Get
     *     BNSOL rewards history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBnsolRewardsHistoryResponse> getBnsolRewardsHistory(
            Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBnsolRewardsHistory(startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get Boost Rewards History (USER_DATA) Get Boost rewards history Weight(IP): 150 Security
     * Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param type (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-boost-rewards-history">Get
     *     Boost Rewards History (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetBoostRewardsHistoryResponse> getBoostRewardsHistory(
            OrderType type, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getBoostRewardsHistory(
                type, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL redemption history (USER_DATA) Get SOL redemption history Weight(IP): 150 Security
     * Type: USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60;
     * cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both
     * not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is
     * sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param redeemId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-sol-redemption-history">Get
     *     SOL redemption history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolRedemptionHistoryResponse> getSolRedemptionHistory(
            Long redeemId, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolRedemptionHistory(
                redeemId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL staking history (USER_DATA) Get SOL staking history Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param purchaseId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current Currently querying page (optional)
     * @param size (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-sol-staking-history">Get
     *     SOL staking history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolStakingHistoryResponse> getSolStakingHistory(
            Long purchaseId, Long startTime, Long endTime, Long current, Long size, Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolStakingHistory(
                purchaseId, startTime, endTime, current, size, recvWindow);
    }

    /**
     * Get SOL staking quota details (USER_DATA) Get SOL staking quota Weight(IP): 150 Security
     * Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than 60000 (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-sol-staking-quota-details">Get
     *     SOL staking quota details (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSolStakingQuotaDetailsResponse> getSolStakingQuotaDetails(Long recvWindow)
            throws ApiException {
        return solStakingApi.getSolStakingQuotaDetails(recvWindow);
    }

    /**
     * Get Unclaimed Rewards (USER_DATA) Get Unclaimed rewards Weight(IP): 150 Security Type:
     * USER_DATA Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be
     * longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent,
     * then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but
     * &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from
     * &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned.
     *
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#get-unclaimed-rewards">Get
     *     Unclaimed Rewards (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetUnclaimedRewardsResponse> getUnclaimedRewards(Long recvWindow)
            throws ApiException {
        return solStakingApi.getUnclaimedRewards(recvWindow);
    }

    /**
     * Redeem SOL (TRADE) Redeem BNSOL get SOL Weight(IP): 150 Security Type: TRADE Notes: - You
     * need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this
     * endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#redeem-sol">Redeem
     *     SOL (TRADE) Documentation</a>
     */
    public ApiResponse<RedeemSolResponse> redeemSol(RedeemSolRequest redeemSolRequest)
            throws ApiException {
        return solStakingApi.redeemSol(redeemSolRequest);
    }

    /**
     * SOL Staking account (USER_DATA) SOL Staking account Weight(IP): 150 Security Type: USER_DATA
     *
     * @param recvWindow The value cannot be greater than 60000 (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#sol-staking-account">SOL
     *     Staking account (USER_DATA) Documentation</a>
     */
    public ApiResponse<SolStakingAccountResponse> solStakingAccount(Long recvWindow)
            throws ApiException {
        return solStakingApi.solStakingAccount(recvWindow);
    }

    /**
     * Subscribe SOL Staking (TRADE) Subscribe SOL Staking Weight(IP): 150 Security Type: TRADE
     * Notes: - You need to open Enable Spot &amp; Margin Trading permission for the API Key which
     * requests this endpoint.
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-staking/api/rest-api/sol-staking#subscribe-sol-staking">Subscribe
     *     SOL Staking (TRADE) Documentation</a>
     */
    public ApiResponse<SubscribeSolStakingResponse> subscribeSolStaking(
            SubscribeSolStakingRequest subscribeSolStakingRequest) throws ApiException {
        return solStakingApi.subscribeSolStaking(subscribeSolStakingRequest);
    }
}
