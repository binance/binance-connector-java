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

    private final DefaultApi defaultApi;

    public MiningRestApi(ClientConfiguration configuration) {
        this(MiningRestApiUtil.getDefaultClient(configuration));
    }

    public MiningRestApi(ApiClient apiClient) {
        this.defaultApi = new DefaultApi(apiClient);
    }

    /**
     * Account List (USER_DATA) Query Account List Weight(IP): 1 Security Type: USER_DATA
     *
     * @param algo Algorithm name. (required)
     * @param userName Mining account (required)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#account-list">Account
     *     List (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountListResponse> accountList(
            String algo, String userName, Long recvWindow) throws ApiException {
        return defaultApi.accountList(algo, userName, recvWindow);
    }

    /**
     * Acquiring Algorithm (MARKET_DATA) Acquiring Algorithm Weight(IP): 1 Security Type:
     * MARKET_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#acquiring-algorithm">Acquiring
     *     Algorithm (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<AcquiringAlgorithmResponse> acquiringAlgorithm() throws ApiException {
        return defaultApi.acquiringAlgorithm();
    }

    /**
     * Acquiring CoinName (MARKET_DATA) Acquiring CoinName Weight(IP): 1 Security Type: MARKET_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#acquiring-coinname">Acquiring
     *     CoinName (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<AcquiringCoinnameResponse> acquiringCoinname() throws ApiException {
        return defaultApi.acquiringCoinname();
    }

    /**
     * Cancel hashrate resale configuration (USER_DATA) Cancel hashrate resale configuration
     * Weight(IP): 1 Security Type: USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#cancel-hashrate-resale-configuration">Cancel
     *     hashrate resale configuration (USER_DATA) Documentation</a>
     */
    public ApiResponse<CancelHashrateResaleConfigurationResponse> cancelHashrateResaleConfiguration(
            CancelHashrateResaleConfigurationRequest cancelHashrateResaleConfigurationRequest)
            throws ApiException {
        return defaultApi.cancelHashrateResaleConfiguration(
                cancelHashrateResaleConfigurationRequest);
    }

    /**
     * Earnings List (USER_DATA) Query Earnings List Weight(IP): 1 Security Type: USER_DATA
     *
     * @param algo Algorithm name. (required)
     * @param userName Mining account. (required)
     * @param coin Coin name (optional)
     * @param startDate Search start time in milliseconds. (optional)
     * @param endDate Search end time in milliseconds. (optional)
     * @param pageIndex Page number, starting from 1. (optional)
     * @param pageSize Number of rows per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#earnings-list">Earnings
     *     List (USER_DATA) Documentation</a>
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
        return defaultApi.earningsList(
                algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Extra Bonus List (USER_DATA) Extra Bonus List Weight(IP): 1 Security Type: USER_DATA
     *
     * @param algo Transfer algorithm (required)
     * @param userName Mining account (required)
     * @param coin Coin name (optional)
     * @param startDate Search start time in milliseconds. (optional)
     * @param endDate Search end time in milliseconds. (optional)
     * @param pageIndex Page number, starting from 1. (optional)
     * @param pageSize Number of rows per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#extra-bonus-list">Extra
     *     Bonus List (USER_DATA) Documentation</a>
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
        return defaultApi.extraBonusList(
                algo, userName, coin, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale Detail (USER_DATA) Hashrate Resale Detail(USER_DATA) Weight(IP): 1 Security
     * Type: USER_DATA
     *
     * @param configId Configuration ID. (required)
     * @param pageIndex Page number, starting from 1. (optional)
     * @param pageSize Number of rows per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#hashrate-resale-detail">Hashrate
     *     Resale Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<HashrateResaleDetailResponse> hashrateResaleDetail(
            Long configId, Long pageIndex, Long pageSize, Long recvWindow) throws ApiException {
        return defaultApi.hashrateResaleDetail(configId, pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale List (USER_DATA) Hashrate Resale List Weight(IP): 1 Security Type: USER_DATA
     *
     * @param pageIndex Page number, starting from 1. (optional)
     * @param pageSize Number of rows per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#hashrate-resale-list">Hashrate
     *     Resale List (USER_DATA) Documentation</a>
     */
    public ApiResponse<HashrateResaleListResponse> hashrateResaleList(
            Long pageIndex, Long pageSize, Long recvWindow) throws ApiException {
        return defaultApi.hashrateResaleList(pageIndex, pageSize, recvWindow);
    }

    /**
     * Hashrate Resale Request (USER_DATA) Hashrate Resale Request Weight(IP): 1 Security Type:
     * USER_DATA
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#hashrate-resale-request">Hashrate
     *     Resale Request (USER_DATA) Documentation</a>
     */
    public ApiResponse<HashrateResaleRequestResponse> hashrateResaleRequest(
            HashrateResaleRequestRequest hashrateResaleRequestRequest) throws ApiException {
        return defaultApi.hashrateResaleRequest(hashrateResaleRequestRequest);
    }

    /**
     * Mining Account Earning (USER_DATA) Mining Account Earning Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @param algo Algorithm (required)
     * @param startDate Millisecond timestamp (optional)
     * @param endDate Millisecond timestamp (optional)
     * @param pageIndex Page number, starting from 1. (optional)
     * @param pageSize Number of rows per page. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#mining-account-earning">Mining
     *     Account Earning (USER_DATA) Documentation</a>
     */
    public ApiResponse<MiningAccountEarningResponse> miningAccountEarning(
            String algo,
            Long startDate,
            Long endDate,
            Long pageIndex,
            Long pageSize,
            Long recvWindow)
            throws ApiException {
        return defaultApi.miningAccountEarning(
                algo, startDate, endDate, pageIndex, pageSize, recvWindow);
    }

    /**
     * Request for Detail Miner List (USER_DATA) Request for Detail Miner List Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param algo Algorithm (required)
     * @param userName Mining account (required)
     * @param workerName Miner name. (required)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#request-for-detail-miner-list">Request
     *     for Detail Miner List (USER_DATA) Documentation</a>
     */
    public ApiResponse<RequestForDetailMinerListResponse> requestForDetailMinerList(
            String algo, String userName, String workerName, Long recvWindow) throws ApiException {
        return defaultApi.requestForDetailMinerList(algo, userName, workerName, recvWindow);
    }

    /**
     * Request for Miner List (USER_DATA) Request for Miner List Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @param algo Algorithm (required)
     * @param userName Mining account (required)
     * @param pageIndex Page number, starting from 1. (optional)
     * @param sort Sort order. 0 for ascending, 1 for descending. (optional)
     * @param sortColumn Sort by: 1 miner name, 2 real-time hashrate, 3 daily average hashrate, 4
     *     real-time rejection rate, 5 last submission time (optional)
     * @param workerStatus Miner status. 0 all, 1 valid, 2 invalid, 3 failure. (optional)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#request-for-miner-list">Request
     *     for Miner List (USER_DATA) Documentation</a>
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
        return defaultApi.requestForMinerList(
                algo, userName, pageIndex, sort, sortColumn, workerStatus, recvWindow);
    }

    /**
     * Statistic List (USER_DATA) Statistic List Weight(IP): 1 Security Type: USER_DATA
     *
     * @param algo Algorithm (required)
     * @param userName Mining account (required)
     * @param recvWindow Request validity window in milliseconds. (optional)
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
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-mining/api/rest-api/~#statistic-list">Statistic
     *     List (USER_DATA) Documentation</a>
     */
    public ApiResponse<StatisticListResponse> statisticList(
            String algo, String userName, Long recvWindow) throws ApiException {
        return defaultApi.statisticList(algo, userName, recvWindow);
    }
}
