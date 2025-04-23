package com.binance.connector.client.nft.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.nft.rest.NftRestApiUtil;
import com.binance.connector.client.nft.rest.model.GetNFTAssetResponse;
import com.binance.connector.client.nft.rest.model.GetNFTDepositHistoryResponse;
import com.binance.connector.client.nft.rest.model.GetNFTTransactionHistoryResponse;
import com.binance.connector.client.nft.rest.model.GetNFTWithdrawHistoryResponse;

public class NftRestApi {

    private final NftApi nftApi;

    public NftRestApi(ClientConfiguration configuration) {
        this(NftRestApiUtil.getDefaultClient(configuration));
    }

    public NftRestApi(ApiClient apiClient) {
        this.nftApi = new NftApi(apiClient);
    }

    /**
     * Get NFT Asset(USER_DATA) Get NFT Asset Weight: 3000
     *
     * @param limit Default 50, Max 50 (optional)
     * @param page Default 1 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetNFTAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get NFT Asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/nft/rest-api/Get-NFT-Asset">Get NFT
     *     Asset(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetNFTAssetResponse> getNFTAsset(Long limit, Long page, Long recvWindow)
            throws ApiException {
        return nftApi.getNFTAsset(limit, page, recvWindow);
    }

    /**
     * Get NFT Deposit History(USER_DATA) et NFT Deposit History * The max interval between
     * startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7
     * days&#39; data will be returned. Weight: 3000
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 50, Max 50 (optional)
     * @param page Default 1 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetNFTDepositHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get NFT Deposit History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/nft/rest-api/Get-NFT-Deposit-History">Get
     *     NFT Deposit History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetNFTDepositHistoryResponse> getNFTDepositHistory(
            Long startTime, Long endTime, Long limit, Long page, Long recvWindow)
            throws ApiException {
        return nftApi.getNFTDepositHistory(startTime, endTime, limit, page, recvWindow);
    }

    /**
     * Get NFT Transaction History(USER_DATA) Get NFT Transaction History * The max interval between
     * startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7
     * days&#39; data will be returned. Weight: 3000
     *
     * @param orderType 0: purchase order, 1: sell order, 2: royalty income, 3: primary market
     *     order, 4: mint fee (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 50, Max 50 (optional)
     * @param page Default 1 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetNFTTransactionHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get NFT Transaction History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/nft/rest-api/Get-NFT-Transaction-History">Get
     *     NFT Transaction History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetNFTTransactionHistoryResponse> getNFTTransactionHistory(
            Long orderType, Long startTime, Long endTime, Long limit, Long page, Long recvWindow)
            throws ApiException {
        return nftApi.getNFTTransactionHistory(
                orderType, startTime, endTime, limit, page, recvWindow);
    }

    /**
     * Get NFT Withdraw History(USER_DATA) Get NFT Withdraw History * The max interval between
     * startTime and endTime is 90 days. * If startTime and endTime are not sent, the recent 7
     * days&#39; data will be returned. Weight: 3000
     *
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default 50, Max 50 (optional)
     * @param page Default 1 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetNFTWithdrawHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get NFT Withdraw History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a href="https://developers.binance.com/docs/nft/rest-api/Get-NFT-Withdraw-History">Get
     *     NFT Withdraw History(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetNFTWithdrawHistoryResponse> getNFTWithdrawHistory(
            Long startTime, Long endTime, Long limit, Long page, Long recvWindow)
            throws ApiException {
        return nftApi.getNFTWithdrawHistory(startTime, endTime, limit, page, recvWindow);
    }
}
