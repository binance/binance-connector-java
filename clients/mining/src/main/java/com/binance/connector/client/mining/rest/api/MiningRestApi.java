package com.binance.connector.client.mining.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.model.AccountListResponse;
import com.binance.connector.client.mining.rest.model.AcquiringAlgorithmResponse;
import com.binance.connector.client.mining.rest.model.AcquiringCoinnameResponse;
import com.binance.connector.client.mining.rest.model.CancelHashrateResaleConfigurationRequest;
import com.binance.connector.client.mining.rest.model.CancelHashrateResaleConfigurationResponse;
import com.binance.connector.client.mining.rest.model.EarningsListResponse;
import com.binance.connector.client.mining.rest.model.ExtraBonusListResponse;
import com.binance.connector.client.mining.rest.model.HashrateResaleDetailResponse;
import com.binance.connector.client.mining.rest.model.HashrateResaleListResponse;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestRequest;
import com.binance.connector.client.mining.rest.model.HashrateResaleRequestResponse;
import com.binance.connector.client.mining.rest.model.MiningAccountEarningResponse;
import com.binance.connector.client.mining.rest.model.RequestForDetailMinerListResponse;
import com.binance.connector.client.mining.rest.model.RequestForMinerListResponse;
import com.binance.connector.client.mining.rest.model.StatisticListResponse;

public class MiningRestApi {

    private final MiningApi miningApi;

    public MiningRestApi(ClientConfiguration configuration) {
        this(MiningRestApiUtil.getDefaultClient(configuration));
    }

    public MiningRestApi(ApiClient apiClient) {
        this.miningApi = new MiningApi(apiClient);
    }

    /**
     * Account List(USER_DATA) Query Account List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/mining/rest-api/Account-List">Account
     *     List(USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountListResponse> accountList(
            String algo, String userName, Long recvWindow) throws ApiException {
        return miningApi.accountList(algo, userName, recvWindow);
    }

    /**
     * Acquiring Algorithm(MARKET_DATA) Acquiring Algorithm Weight: 1
     *
     * @return ApiResponse&lt;AcquiringAlgorithmResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Acquiring Algorithm </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Acquiring-Algorithm">Acquiring
     *     Algorithm(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<AcquiringAlgorithmResponse> acquiringAlgorithm() throws ApiException {
        return miningApi.acquiringAlgorithm();
    }

    /**
     * Acquiring CoinName(MARKET_DATA) Acquiring CoinName Weight: 1
     *
     * @return ApiResponse&lt;AcquiringCoinnameResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Acquiring CoinName </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Acquiring-CoinName">Acquiring
     *     CoinName(MARKET_DATA) Documentation</a>
     */
    public ApiResponse<AcquiringCoinnameResponse> acquiringCoinname() throws ApiException {
        return miningApi.acquiringCoinname();
    }

    /**
     * Cancel hashrate resale configuration(USER_DATA) Weight: 5
     *
     * @param cancelHashrateResaleConfigurationRequest (required)
     * @return ApiResponse&lt;CancelHashrateResaleConfigurationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Cancel hashrate resale configuration </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Cancel-hashrate-resale-configuration">Cancel
     *     hashrate resale configuration(USER_DATA) Documentation</a>
     */
    public ApiResponse<CancelHashrateResaleConfigurationResponse> cancelHashrateResaleConfiguration(
            CancelHashrateResaleConfigurationRequest cancelHashrateResaleConfigurationRequest)
            throws ApiException {
        return miningApi.cancelHashrateResaleConfiguration(
                cancelHashrateResaleConfigurationRequest);
    }

    /**
     * Earnings List(USER_DATA) Query Earnings List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param coin Coin Name (optional)
     * @param startDate Millisecond timestamp (optional)
     * @param endDate Millisecond timestamp (optional)
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param pageSize Min 10,Max 200 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;EarningsListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Earnings List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/mining/rest-api/Earnings-List">Earnings
     *     List(USER_DATA) Documentation</a>
     */
    public ApiResponse<EarningsListResponse> earningsList(
            String algo,
            String userName,
            String coin,
            Long startDate,
            Long endDate,
            Long pageIndex,
            Long pageSize,
            Long recvWindow)
            throws ApiException {
        return miningApi.earningsList(
                algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Extra Bonus List(USER_DATA) Extra Bonus List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param coin Coin Name (optional)
     * @param startDate Millisecond timestamp (optional)
     * @param endDate Millisecond timestamp (optional)
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param pageSize Min 10,Max 200 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;ExtraBonusListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Extra Bonus List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/mining/rest-api/Extra-Bonus-List">Extra
     *     Bonus List(USER_DATA) Documentation</a>
     */
    public ApiResponse<ExtraBonusListResponse> extraBonusList(
            String algo,
            String userName,
            String coin,
            Long startDate,
            Long endDate,
            Long pageIndex,
            Long pageSize,
            Long recvWindow)
            throws ApiException {
        return miningApi.extraBonusList(
                algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale Detail(USER_DATA) Hashrate Resale Detail(USER_DATA) Weight: 5
     *
     * @param configId Mining ID 168 (required)
     * @param userName Mining account test (required)
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param pageSize Min 10,Max 200 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;HashrateResaleDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Hashrate Resale Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Hashrate-Resale-Detail">Hashrate
     *     Resale Detail(USER_DATA) Documentation</a>
     */
    public ApiResponse<HashrateResaleDetailResponse> hashrateResaleDetail(
            Long configId, String userName, Long pageIndex, Long pageSize, Long recvWindow)
            throws ApiException {
        return miningApi.hashrateResaleDetail(configId, userName, pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale List Hashrate Resale List Weight: 5
     *
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param pageSize Min 10,Max 200 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;HashrateResaleListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Hashrate Resale List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Hashrate-Resale-List">Hashrate
     *     Resale List Documentation</a>
     */
    public ApiResponse<HashrateResaleListResponse> hashrateResaleList(
            Long pageIndex, Long pageSize, Long recvWindow) throws ApiException {
        return miningApi.hashrateResaleList(pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale Request(USER_DATA) Hashrate Resale Request Weight: 5
     *
     * @param hashrateResaleRequestRequest (required)
     * @return ApiResponse&lt;HashrateResaleRequestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Hashrate Resale Request </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Hashrate-Resale-Request">Hashrate
     *     Resale Request(USER_DATA) Documentation</a>
     */
    public ApiResponse<HashrateResaleRequestResponse> hashrateResaleRequest(
            HashrateResaleRequestRequest hashrateResaleRequestRequest) throws ApiException {
        return miningApi.hashrateResaleRequest(hashrateResaleRequestRequest);
    }

    /**
     * Mining Account Earning(USER_DATA) Mining Account Earning Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param startDate Millisecond timestamp (optional)
     * @param endDate Millisecond timestamp (optional)
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param pageSize Min 10,Max 200 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;MiningAccountEarningResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Mining Account Earning </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Mining-Account-Earning">Mining
     *     Account Earning(USER_DATA) Documentation</a>
     */
    public ApiResponse<MiningAccountEarningResponse> miningAccountEarning(
            String algo,
            Long startDate,
            Long endDate,
            Long pageIndex,
            Long pageSize,
            Long recvWindow)
            throws ApiException {
        return miningApi.miningAccountEarning(
                algo, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Request for Detail Miner List(USER_DATA) Request for Detail Miner List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param workerName Miner’s name(required) bhdc1.16A10404B (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;RequestForDetailMinerListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Request for Detail Miner List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Request-for-Detail-Miner-List">Request
     *     for Detail Miner List(USER_DATA) Documentation</a>
     */
    public ApiResponse<RequestForDetailMinerListResponse> requestForDetailMinerList(
            String algo, String userName, String workerName, Long recvWindow) throws ApiException {
        return miningApi.requestForDetailMinerList(algo, userName, workerName, recvWindow);
    }

    /**
     * Request for Miner List(USER_DATA) Request for Miner List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param pageIndex Page number, empty default first page, starting from 1 (optional)
     * @param sort sort sequence(default&#x3D;0)0 positive sequence，1 negative sequence (optional)
     * @param sortColumn Sort by( default 1): &lt;br&gt;&lt;/br&gt;1: miner name,
     *     &lt;br&gt;&lt;/br&gt;2: real-time computing power, &lt;br&gt;&lt;/br&gt;3: daily average
     *     computing power, &lt;br&gt;&lt;/br&gt;4: real-time rejection rate,
     *     &lt;br&gt;&lt;/br&gt;5: last submission time (optional)
     * @param workerStatus miners status(default&#x3D;0),0 all，1 valid，2 invalid，3 failure
     *     (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;RequestForMinerListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Request for Miner List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/mining/rest-api/Request-for-Miner-List">Request
     *     for Miner List(USER_DATA) Documentation</a>
     */
    public ApiResponse<RequestForMinerListResponse> requestForMinerList(
            String algo,
            String userName,
            Long pageIndex,
            Long sort,
            Long sortColumn,
            Long workerStatus,
            Long recvWindow)
            throws ApiException {
        return miningApi.requestForMinerList(
                algo, userName, pageIndex, sort, sortColumn, workerStatus, recvWindow);
    }

    /**
     * Statistic List(USER_DATA) Statistic List Weight: 5
     *
     * @param algo Algorithm(sha256) sha256 (required)
     * @param userName Mining account test (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;StatisticListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Statistic List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/mining/rest-api/Statistic-List">Statistic
     *     List(USER_DATA) Documentation</a>
     */
    public ApiResponse<StatisticListResponse> statisticList(
            String algo, String userName, Long recvWindow) throws ApiException {
        return miningApi.statisticList(algo, userName, recvWindow);
    }
}
