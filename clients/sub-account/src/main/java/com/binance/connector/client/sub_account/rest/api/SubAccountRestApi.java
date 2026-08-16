package com.binance.connector.client.sub_account.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.model.AddIpRestrictionForSubAccountApiKeyRequest;
import com.binance.connector.client.sub_account.rest.model.AddIpRestrictionForSubAccountApiKeyResponse;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.CreateAVirtualSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.CreateSubAccountApiKeyRequest;
import com.binance.connector.client.sub_account.rest.model.CreateSubAccountApiKeyResponse;
import com.binance.connector.client.sub_account.rest.model.DeleteIpListForASubAccountApiKeyResponse;
import com.binance.connector.client.sub_account.rest.model.DepositAssetsIntoTheManagedSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.DepositAssetsIntoTheManagedSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.EnableFuturesForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.EnableFuturesForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.EnableOptionsForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.EnableOptionsForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.FuturesTransferForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.FuturesTransferForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetDetailOnSubAccountsFuturesAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetDetailOnSubAccountsFuturesAccountV2Response;
import com.binance.connector.client.sub_account.rest.model.GetDetailOnSubAccountsMarginAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetFuturesPositionRiskOfSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetFuturesPositionRiskOfSubAccountV2Response;
import com.binance.connector.client.sub_account.rest.model.GetIpRestrictionForASubAccountApiKeyResponse;
import com.binance.connector.client.sub_account.rest.model.GetManagedSubAccountDepositAddressResponse;
import com.binance.connector.client.sub_account.rest.model.GetMovePositionHistoryForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountDepositAddressResponse;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountDepositHistoryResponse;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountsStatusOnMarginOrFuturesResponse;
import com.binance.connector.client.sub_account.rest.model.GetSummaryOfSubAccountsFuturesAccountResponse;
import com.binance.connector.client.sub_account.rest.model.GetSummaryOfSubAccountsFuturesAccountV2Response;
import com.binance.connector.client.sub_account.rest.model.GetSummaryOfSubAccountsMarginAccountResponse;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MarginTransferForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.ModifySubAccountApiKeyPermissionRequest;
import com.binance.connector.client.sub_account.rest.model.ModifySubAccountApiKeyPermissionResponse;
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.OrderType;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountFuturesAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountListResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountMarginAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountSnapshotResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogMasterAccountInvestorResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogMasterAccountTradingResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogSubAccountTradingResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountApiKeyResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountAssetsAssetManagementResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountAssetsResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountFuturesAssetTransferHistoryResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountListResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountSpotAssetTransferHistoryResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountSpotAssetsSummaryResponse;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountTransactionStatisticsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryUniversalTransferHistoryResponse;
import com.binance.connector.client.sub_account.rest.model.SubAccountFuturesAssetTransferRequest;
import com.binance.connector.client.sub_account.rest.model.SubAccountFuturesAssetTransferResponse;
import com.binance.connector.client.sub_account.rest.model.SubAccountTransferHistoryResponse;
import com.binance.connector.client.sub_account.rest.model.TransferFunctionAccountType;
import com.binance.connector.client.sub_account.rest.model.TransferToMasterRequest;
import com.binance.connector.client.sub_account.rest.model.TransferToMasterResponse;
import com.binance.connector.client.sub_account.rest.model.TransferToSubAccountOfSameMasterRequest;
import com.binance.connector.client.sub_account.rest.model.TransferToSubAccountOfSameMasterResponse;
import com.binance.connector.client.sub_account.rest.model.UniversalTransferRequest;
import com.binance.connector.client.sub_account.rest.model.UniversalTransferResponse;
import com.binance.connector.client.sub_account.rest.model.WithdrawlAssetsFromTheManagedSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.WithdrawlAssetsFromTheManagedSubAccountResponse;

public class SubAccountRestApi {

    private final AccountManagementApi accountManagementApi;
    private final ApiManagementApi apiManagementApi;
    private final AssetManagementApi assetManagementApi;
    private final ManagedSubAccountApi managedSubAccountApi;

    public SubAccountRestApi(ClientConfiguration configuration) {
        this(SubAccountRestApiUtil.getDefaultClient(configuration));
    }

    public SubAccountRestApi(ApiClient apiClient) {
        this.accountManagementApi = new AccountManagementApi(apiClient);
        this.apiManagementApi = new ApiManagementApi(apiClient);
        this.assetManagementApi = new AssetManagementApi(apiClient);
        this.managedSubAccountApi = new ManagedSubAccountApi(apiClient);
    }

    /**
     * Create a Virtual Sub-account (For Master Account) (USER_DATA) Create a Virtual Sub-account
     * Weight(IP): 1 Security Type: USER_DATA Notes: - This request generates a virtual sub-account
     * under your master account. - The API key used to call this endpoint must have the
     * &#x60;trade&#x60; option enabled.
     *
     * @param createAVirtualSubAccountRequest (required)
     * @return ApiResponse&lt;CreateAVirtualSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create a Virtual Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#create-avirtual-sub-account">Create
     *     a Virtual Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<CreateAVirtualSubAccountResponse> createAVirtualSubAccount(
            CreateAVirtualSubAccountRequest createAVirtualSubAccountRequest) throws ApiException {
        return accountManagementApi.createAVirtualSubAccount(createAVirtualSubAccountRequest);
    }

    /**
     * Enable Futures for Sub-account (For Master Account) (USER_DATA) Enable Futures for
     * Sub-account for Master Account Weight(IP): 1 Security Type: USER_DATA
     *
     * @param enableFuturesForSubAccountRequest (required)
     * @return ApiResponse&lt;EnableFuturesForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Enable Futures for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#enable-futures-for-sub-account">Enable
     *     Futures for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<EnableFuturesForSubAccountResponse> enableFuturesForSubAccount(
            EnableFuturesForSubAccountRequest enableFuturesForSubAccountRequest)
            throws ApiException {
        return accountManagementApi.enableFuturesForSubAccount(enableFuturesForSubAccountRequest);
    }

    /**
     * Enable Options for Sub-account (For Master Account) (USER_DATA) Enable Options for
     * Sub-account (For Master Account). Weight(IP): 1 Security Type: USER_DATA
     *
     * @param enableOptionsForSubAccountRequest (required)
     * @return ApiResponse&lt;EnableOptionsForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Enable Options for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#enable-options-for-sub-account">Enable
     *     Options for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<EnableOptionsForSubAccountResponse> enableOptionsForSubAccount(
            EnableOptionsForSubAccountRequest enableOptionsForSubAccountRequest)
            throws ApiException {
        return accountManagementApi.enableOptionsForSubAccount(enableOptionsForSubAccountRequest);
    }

    /**
     * Get Futures Position-Risk of Sub-account (For Master Account) (USER_DATA) Get Futures
     * Position-Risk of Sub-account Weight(IP): 10 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesPositionRiskOfSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Position-Risk of Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#get-futures-position-risk-of-sub-account">Get
     *     Futures Position-Risk of Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesPositionRiskOfSubAccountResponse>
            getFuturesPositionRiskOfSubAccount(String email, Long recvWindow) throws ApiException {
        return accountManagementApi.getFuturesPositionRiskOfSubAccount(email, recvWindow);
    }

    /**
     * Get Futures Position-Risk of Sub-account V2 (For Master Account) (USER_DATA) Get Futures
     * Position-Risk of Sub-account V2 Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesPositionRiskOfSubAccountV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Position-Risk of Sub-account V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#get-futures-position-risk-of-sub-account-v2">Get
     *     Futures Position-Risk of Sub-account V2 (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetFuturesPositionRiskOfSubAccountV2Response>
            getFuturesPositionRiskOfSubAccountV2(String email, Long futuresType, Long recvWindow)
                    throws ApiException {
        return accountManagementApi.getFuturesPositionRiskOfSubAccountV2(
                email, futuresType, recvWindow);
    }

    /**
     * Get Sub-account&#39;s Status on Margin Or Futures (For Master Account) (USER_DATA) Get
     * Sub-account&#39;s Status on Margin Or Futures Weight(IP): 10 Security Type: USER_DATA Notes:
     * - If no email sent, all sub-accounts&#39; information will be returned.
     *
     * @param email (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSubAccountsStatusOnMarginOrFuturesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Sub-account&#39;s Status on Margin Or Futures </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#get-sub-accounts-status-on-margin-or-futures">Get
     *     Sub-account&#39;s Status on Margin Or Futures (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSubAccountsStatusOnMarginOrFuturesResponse>
            getSubAccountsStatusOnMarginOrFutures(String email, Long recvWindow)
                    throws ApiException {
        return accountManagementApi.getSubAccountsStatusOnMarginOrFutures(email, recvWindow);
    }

    /**
     * Query Sub-account List (For Master Account) (USER_DATA) Query Sub-account List Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param email (optional)
     * @param isFreeze (optional)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#query-sub-account-list">Query
     *     Sub-account List (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountListResponse> querySubAccountList(
            String email, String isFreeze, Long page, Long limit, Long recvWindow)
            throws ApiException {
        return accountManagementApi.querySubAccountList(email, isFreeze, page, limit, recvWindow);
    }

    /**
     * Query Sub-account Transaction Statistics (For Master Account) (USER_DATA) Query Sub-account
     * Transaction statistics (For Master Account). Weight(IP): 60 Security Type: USER_DATA
     *
     * @param email Managed sub-account email (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountTransactionStatisticsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Transaction Statistics </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/account-management#query-sub-account-transaction-statistics">Query
     *     Sub-account Transaction Statistics (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountTransactionStatisticsResponse>
            querySubAccountTransactionStatistics(String email, Long recvWindow)
                    throws ApiException {
        return accountManagementApi.querySubAccountTransactionStatistics(email, recvWindow);
    }

    /**
     * Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA) Add IP
     * Restriction for Sub-Account API key Weight(UID): 3000 Security Type: USER_DATA Notes: - You
     * need to enable Enable Spot &amp; Margin Trading option for the api key which requests this
     * endpoint
     *
     * @param addIpRestrictionForSubAccountApiKeyRequest (required)
     * @return ApiResponse&lt;AddIpRestrictionForSubAccountApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Add IP Restriction for Sub-Account API key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#add-ip-restriction-for-sub-account-api-key">Add
     *     IP Restriction for Sub-Account API key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<AddIpRestrictionForSubAccountApiKeyResponse>
            addIpRestrictionForSubAccountApiKey(
                    AddIpRestrictionForSubAccountApiKeyRequest
                            addIpRestrictionForSubAccountApiKeyRequest)
                    throws ApiException {
        return apiManagementApi.addIpRestrictionForSubAccountApiKey(
                addIpRestrictionForSubAccountApiKeyRequest);
    }

    /**
     * Create Sub-account API Key (For Master Account) (USER_DATA) Create a new API Key for a
     * sub-account. Weight(UID): 3000 Security Type: USER_DATA Notes: - &#x60;status&#x3D;2&#x60;
     * requires &#x60;ipAddress&#x60; - &#x60;status&#x3D;3&#x60; requires
     * &#x60;thirdPartyName&#x60; - Asset Sub Account is not supported - The caller must pass the
     * KYC IP restriction check
     *
     * @param createSubAccountApiKeyRequest (required)
     * @return ApiResponse&lt;CreateSubAccountApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create Sub-account API Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#create-sub-account-api-key">Create
     *     Sub-account API Key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<CreateSubAccountApiKeyResponse> createSubAccountApiKey(
            CreateSubAccountApiKeyRequest createSubAccountApiKeyRequest) throws ApiException {
        return apiManagementApi.createSubAccountApiKey(createSubAccountApiKeyRequest);
    }

    /**
     * Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA) Delete IP List For
     * a Sub-account API Key Weight(UID): 3000 Security Type: USER_DATA Notes: - You need to enable
     * Enable Spot &amp; Margin Trading option for the api key which requests this endpoint
     *
     * @param email (required)
     * @param subAccountApiKey (required)
     * @param ipAddress IPs to be deleted. Can be added in batches, separated by commas (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;DeleteIpListForASubAccountApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Delete IP List For a Sub-account API Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#delete-ip-list-for-asub-account-api-key">Delete
     *     IP List For a Sub-account API Key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DeleteIpListForASubAccountApiKeyResponse> deleteIpListForASubAccountApiKey(
            String email, String subAccountApiKey, String ipAddress, Long recvWindow)
            throws ApiException {
        return apiManagementApi.deleteIpListForASubAccountApiKey(
                email, subAccountApiKey, ipAddress, recvWindow);
    }

    /**
     * Delete Sub-account API Key (For Master Account) (USER_DATA) Delete an API Key of a
     * sub-account. Weight(UID): 3000 Security Type: USER_DATA Notes: - Asset Sub Account is not
     * supported - The caller must pass the KYC IP restriction check
     *
     * @param email Sub-account email (required)
     * @param subAccountApiKey The sub-account API Key to be deleted (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Delete Sub-account API Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#delete-sub-account-api-key">Delete
     *     Sub-account API Key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<Object> deleteSubAccountApiKey(
            String email, String subAccountApiKey, Long recvWindow) throws ApiException {
        return apiManagementApi.deleteSubAccountApiKey(email, subAccountApiKey, recvWindow);
    }

    /**
     * Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA) Get IP
     * Restriction for a Sub-account API Key Weight(UID): 3000 Security Type: USER_DATA
     *
     * @param email (required)
     * @param subAccountApiKey (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetIpRestrictionForASubAccountApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get IP Restriction for a Sub-account API Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#get-ip-restriction-for-asub-account-api-key">Get
     *     IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetIpRestrictionForASubAccountApiKeyResponse>
            getIpRestrictionForASubAccountApiKey(
                    String email, String subAccountApiKey, Long recvWindow) throws ApiException {
        return apiManagementApi.getIpRestrictionForASubAccountApiKey(
                email, subAccountApiKey, recvWindow);
    }

    /**
     * Modify Sub-account API Key Permission (For Master Account) (USER_DATA) Modify the trading
     * permissions of a sub-account API Key. Weight(UID): 3000 Security Type: USER_DATA Notes: -
     * Portfolio Margin Retail User is not supported - Asset Sub Account is not supported - The
     * caller must pass the KYC IP restriction check
     *
     * @param modifySubAccountApiKeyPermissionRequest (required)
     * @return ApiResponse&lt;ModifySubAccountApiKeyPermissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Modify Sub-account API Key Permission </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#modify-sub-account-api-key-permission">Modify
     *     Sub-account API Key Permission (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<ModifySubAccountApiKeyPermissionResponse> modifySubAccountApiKeyPermission(
            ModifySubAccountApiKeyPermissionRequest modifySubAccountApiKeyPermissionRequest)
            throws ApiException {
        return apiManagementApi.modifySubAccountApiKeyPermission(
                modifySubAccountApiKeyPermissionRequest);
    }

    /**
     * Query Sub-account API Key (For Master Account) (USER_DATA) Query the API Key list of a
     * sub-account. Weight(UID): 3000 Security Type: USER_DATA
     *
     * @param email Sub-account email (required)
     * @param subAccountApiKey Specify an API Key for exact match (optional)
     * @param page Page number, default 1, minimum 1 (optional)
     * @param size Page size, default 30, maximum 100 (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountApiKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Query Sub-account API Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/api-management#query-sub-account-api-key">Query
     *     Sub-account API Key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountApiKeyResponse> querySubAccountApiKey(
            String email, String subAccountApiKey, Long page, Long size, Long recvWindow)
            throws ApiException {
        return apiManagementApi.querySubAccountApiKey(
                email, subAccountApiKey, page, size, recvWindow);
    }

    /**
     * Futures Transfer for Sub-account (For Master Account) (USER_DATA) Futures Transfer for
     * Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - You need to open Enable Spot
     * &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @param futuresTransferForSubAccountRequest (required)
     * @return ApiResponse&lt;FuturesTransferForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Futures Transfer for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#futures-transfer-for-sub-account">Futures
     *     Transfer for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesTransferForSubAccountResponse> futuresTransferForSubAccount(
            FuturesTransferForSubAccountRequest futuresTransferForSubAccountRequest)
            throws ApiException {
        return assetManagementApi.futuresTransferForSubAccount(futuresTransferForSubAccountRequest);
    }

    /**
     * Get Detail on Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) Get Detail
     * on Sub-account&#39;s Futures Account Weight(IP): 10 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDetailOnSubAccountsFuturesAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Detail on Sub-account&#39;s Futures Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-detail-on-sub-accounts-futures-account">Get
     *     Detail on Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetDetailOnSubAccountsFuturesAccountResponse>
            getDetailOnSubAccountsFuturesAccount(String email, Long recvWindow)
                    throws ApiException {
        return assetManagementApi.getDetailOnSubAccountsFuturesAccount(email, recvWindow);
    }

    /**
     * Get Detail on Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA) Get
     * Detail on Sub-account&#39;s Futures Account Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDetailOnSubAccountsFuturesAccountV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Detail on Sub-account&#39;s Futures Account V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-detail-on-sub-accounts-futures-account-v2">Get
     *     Detail on Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetDetailOnSubAccountsFuturesAccountV2Response>
            getDetailOnSubAccountsFuturesAccountV2(String email, Long futuresType, Long recvWindow)
                    throws ApiException {
        return assetManagementApi.getDetailOnSubAccountsFuturesAccountV2(
                email, futuresType, recvWindow);
    }

    /**
     * Get Detail on Sub-account&#39;s Margin Account (For Master Account) (USER_DATA) Get Detail on
     * Sub-account&#39;s Margin Account Weight(IP): 10 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetDetailOnSubAccountsMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Detail on Sub-account&#39;s Margin Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-detail-on-sub-accounts-margin-account">Get
     *     Detail on Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetDetailOnSubAccountsMarginAccountResponse>
            getDetailOnSubAccountsMarginAccount(String email, Long recvWindow) throws ApiException {
        return assetManagementApi.getDetailOnSubAccountsMarginAccount(email, recvWindow);
    }

    /**
     * Get Move Position History for Sub-account (For Master Account) (USER_DATA) Query move
     * position history Weight(IP): 1 Security Type: USER_DATA Notes: - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both omitted, records from the last 90 days are returned by default
     * (up to 1000 records). - If &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is omitted,
     * records in &#x60;[max(startTime, now-90d), now]&#x60; are returned. - If
     * &#x60;startTime&#x60; is omitted and &#x60;endTime&#x60; is sent, records in &#x60;[max(now,
     * endTime-90d), endTime]&#x60; are returned.
     *
     * @param symbol (required)
     * @param page (required)
     * @param rows (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetMovePositionHistoryForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Move Position History for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-move-position-history-for-sub-account">Get
     *     Move Position History for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetMovePositionHistoryForSubAccountResponse>
            getMovePositionHistoryForSubAccount(
                    String symbol,
                    Long page,
                    Long rows,
                    Long startTime,
                    Long endTime,
                    Long recvWindow)
                    throws ApiException {
        return assetManagementApi.getMovePositionHistoryForSubAccount(
                symbol, page, rows, startTime, endTime, recvWindow);
    }

    /**
     * Get Sub-account Deposit Address (For Master Account) (USER_DATA) Fetch sub-account deposit
     * address Weight(IP): 1 Security Type: USER_DATA Notes: - &#x60;amount&#x60; needs to be sent
     * if using LIGHTNING network
     *
     * @param email (required)
     * @param coin (required)
     * @param network networks can be found in &#x60;GET /sapi/v1/capital/deposit/address&#x60;
     *     (optional)
     * @param amount (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSubAccountDepositAddressResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Sub-account Deposit Address </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-sub-account-deposit-address">Get
     *     Sub-account Deposit Address (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSubAccountDepositAddressResponse> getSubAccountDepositAddress(
            String email, String coin, String network, Double amount, Long recvWindow)
            throws ApiException {
        return assetManagementApi.getSubAccountDepositAddress(
                email, coin, network, amount, recvWindow);
    }

    /**
     * Get Sub-account Deposit History (For Master Account) (USER_DATA) Fetch sub-account deposit
     * history Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param includeSource Default &#x60;false&#x60;, return &#x60;sourceAddress&#x60; field when
     *     set to &#x60;true&#x60; (optional)
     * @param coin (optional)
     * @param status Deposit status: 0&#x3D;pending, 6&#x3D;credited but cannot withdraw,
     *     7&#x3D;wrong deposit, 8&#x3D;waiting user confirmation, 1&#x3D;success. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param offset (optional)
     * @param recvWindow (optional)
     * @param txId (optional)
     * @return ApiResponse&lt;GetSubAccountDepositHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Sub-account Deposit History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-sub-account-deposit-history">Get
     *     Sub-account Deposit History (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSubAccountDepositHistoryResponse> getSubAccountDepositHistory(
            String email,
            Boolean includeSource,
            String coin,
            Long status,
            Long startTime,
            Long endTime,
            Long limit,
            Long offset,
            Long recvWindow,
            String txId)
            throws ApiException {
        return assetManagementApi.getSubAccountDepositHistory(
                email,
                includeSource,
                coin,
                status,
                startTime,
                endTime,
                limit,
                offset,
                recvWindow,
                txId);
    }

    /**
     * Get Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) Get Summary
     * of Sub-account&#39;s Futures Account Weight(IP): 1 Security Type: USER_DATA
     *
     * @param page (required)
     * @param limit (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSummaryOfSubAccountsFuturesAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Summary of Sub-account&#39;s Futures Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-summary-of-sub-accounts-futures-account">Get
     *     Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSummaryOfSubAccountsFuturesAccountResponse>
            getSummaryOfSubAccountsFuturesAccount(Long page, Long limit, Long recvWindow)
                    throws ApiException {
        return assetManagementApi.getSummaryOfSubAccountsFuturesAccount(page, limit, recvWindow);
    }

    /**
     * Get Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA) Get
     * Summary of Sub-account&#39;s Futures Account Weight(IP): 10 Security Type: USER_DATA
     *
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSummaryOfSubAccountsFuturesAccountV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Summary of Sub-account&#39;s Futures Account V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-summary-of-sub-accounts-futures-account-v2">Get
     *     Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSummaryOfSubAccountsFuturesAccountV2Response>
            getSummaryOfSubAccountsFuturesAccountV2(
                    Long futuresType, Long page, Long limit, Long recvWindow) throws ApiException {
        return assetManagementApi.getSummaryOfSubAccountsFuturesAccountV2(
                futuresType, page, limit, recvWindow);
    }

    /**
     * Get Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA) Get Summary
     * of Sub-account&#39;s Margin Account Weight(IP): 10 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSummaryOfSubAccountsMarginAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Summary of Sub-account&#39;s Margin Account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#get-summary-of-sub-accounts-margin-account">Get
     *     Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSummaryOfSubAccountsMarginAccountResponse>
            getSummaryOfSubAccountsMarginAccount(Long recvWindow) throws ApiException {
        return assetManagementApi.getSummaryOfSubAccountsMarginAccount(recvWindow);
    }

    /**
     * Margin Transfer for Sub-account (For Master Account) (USER_DATA) Margin Transfer for
     * Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - You need to open Enable Spot
     * &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @param marginTransferForSubAccountRequest (required)
     * @return ApiResponse&lt;MarginTransferForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Margin Transfer for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#margin-transfer-for-sub-account">Margin
     *     Transfer for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<MarginTransferForSubAccountResponse> marginTransferForSubAccount(
            MarginTransferForSubAccountRequest marginTransferForSubAccountRequest)
            throws ApiException {
        return assetManagementApi.marginTransferForSubAccount(marginTransferForSubAccountRequest);
    }

    /**
     * Move Position for Sub-account (For Master Account) (USER_DATA) Move position between
     * sub-master, master-sub, or sub-sub accounts when necessary Weight(IP): 1 Security Type:
     * USER_DATA Notes: - You need to enable the &#x60;Trading&#x60; permission for the API key used
     * to call this endpoint. - This function is only available for VIP levels 7-9. - Only master
     * accounts can call this endpoint. - &#x60;quantity&#x60; must be a positive number. -
     * Supported account types: normal account, PM PRO, PM PRO SPAN, and PM Retail. - The source
     * account must have positions. - For orders in the same &#x60;orderArgs&#x60; request, if any
     * symbol&#39;s total close position quantity exceeds current position quantity, all orders in
     * that batch fail. - Only cross margin mode is supported. - The move position price supports
     * &#x60;MARK_PRICE&#x60; only. - MSA is not supported. - Symbols configured with
     * &#x60;Reduce-Only&#x60; are not supported.
     *
     * @param movePositionForSubAccountRequest (required)
     * @return ApiResponse&lt;MovePositionForSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Move Position for Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#move-position-for-sub-account">Move
     *     Position for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<MovePositionForSubAccountResponse> movePositionForSubAccount(
            MovePositionForSubAccountRequest movePositionForSubAccountRequest) throws ApiException {
        return assetManagementApi.movePositionForSubAccount(movePositionForSubAccountRequest);
    }

    /**
     * Query Sub-account Assets (For Master Account) (USER_DATA) Fetch sub-account assets
     * Weight(UID): 60 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountAssetsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-sub-account-assets">Query
     *     Sub-account Assets (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountAssetsResponse> querySubAccountAssets(
            String email, Long recvWindow) throws ApiException {
        return assetManagementApi.querySubAccountAssets(email, recvWindow);
    }

    /**
     * Query Sub-account Assets V4 (For Master Account) (USER_DATA) Fetch sub-account assets
     * Weight(UID): 60 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountAssetsAssetManagementResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-sub-account-assets-asset-management">Query
     *     Sub-account Assets V4 (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountAssetsAssetManagementResponse>
            querySubAccountAssetsAssetManagement(String email, Long recvWindow)
                    throws ApiException {
        return assetManagementApi.querySubAccountAssetsAssetManagement(email, recvWindow);
    }

    /**
     * Query Sub-account Futures Asset Transfer History (For Master Account) (USER_DATA) Query
     * Sub-account Futures Asset Transfer History Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param startTime Cannot be earlier than 1 month ago (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountFuturesAssetTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Futures Asset Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-sub-account-futures-asset-transfer-history">Query
     *     Sub-account Futures Asset Transfer History (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QuerySubAccountFuturesAssetTransferHistoryResponse>
            querySubAccountFuturesAssetTransferHistory(
                    String email,
                    Long futuresType,
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long limit,
                    Long recvWindow)
                    throws ApiException {
        return assetManagementApi.querySubAccountFuturesAssetTransferHistory(
                email, futuresType, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Query Sub-account Spot Asset Transfer History (For Master Account) (USER_DATA) Query
     * Sub-account Spot Asset Transfer History Weight(IP): 1 Security Type: USER_DATA Notes: -
     * &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; cannot be sent at the same time. - If both
     * &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; are omitted, records with &#x60;fromEmail&#x60;
     * equal to the master account are returned by default.
     *
     * @param fromEmail (optional)
     * @param toEmail (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountSpotAssetTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Spot Asset Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-sub-account-spot-asset-transfer-history">Query
     *     Sub-account Spot Asset Transfer History (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QuerySubAccountSpotAssetTransferHistoryResponse>
            querySubAccountSpotAssetTransferHistory(
                    String fromEmail,
                    String toEmail,
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long limit,
                    Long recvWindow)
                    throws ApiException {
        return assetManagementApi.querySubAccountSpotAssetTransferHistory(
                fromEmail, toEmail, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Query Sub-account Spot Assets Summary (For Master Account) (USER_DATA) Get BTC valued asset
     * summary of subaccounts. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email Managed sub-account email (optional)
     * @param page (optional)
     * @param size (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QuerySubAccountSpotAssetsSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Spot Assets Summary </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-sub-account-spot-assets-summary">Query
     *     Sub-account Spot Assets Summary (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountSpotAssetsSummaryResponse> querySubAccountSpotAssetsSummary(
            String email, Long page, Long size, Long recvWindow) throws ApiException {
        return assetManagementApi.querySubAccountSpotAssetsSummary(email, page, size, recvWindow);
    }

    /**
     * Query Universal Transfer History (For Master Account) (USER_DATA) Query Universal Transfer
     * History Weight(IP): 1 Security Type: USER_DATA Notes: - &#x60;fromEmail&#x60; and
     * &#x60;toEmail&#x60; cannot be sent at the same time. - If both &#x60;fromEmail&#x60; and
     * &#x60;toEmail&#x60; are omitted, records with &#x60;fromEmail&#x60; equal to the master
     * account are returned by default. - The query time range must be less than 7 days. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are omitted, records from the last 7 days are
     * returned by default.
     *
     * @param fromEmail (optional)
     * @param toEmail (optional)
     * @param clientTranId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUniversalTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Universal Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#query-universal-transfer-history">Query
     *     Universal Transfer History (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUniversalTransferHistoryResponse> queryUniversalTransferHistory(
            String fromEmail,
            String toEmail,
            String clientTranId,
            Long startTime,
            Long endTime,
            Long page,
            Long limit,
            Long recvWindow)
            throws ApiException {
        return assetManagementApi.queryUniversalTransferHistory(
                fromEmail, toEmail, clientTranId, startTime, endTime, page, limit, recvWindow);
    }

    /**
     * Sub-account Futures Asset Transfer (For Master Account) (USER_DATA) Sub-account Futures Asset
     * Transfer Weight(IP): 1 Security Type: USER_DATA Notes: - A master account can transfer at
     * most 2000 times per minute. - The futures wallet must have sufficient margin balance to
     * execute the transfer.
     *
     * @param subAccountFuturesAssetTransferRequest (required)
     * @return ApiResponse&lt;SubAccountFuturesAssetTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Futures Asset Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#sub-account-futures-asset-transfer">Sub-account
     *     Futures Asset Transfer (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubAccountFuturesAssetTransferResponse> subAccountFuturesAssetTransfer(
            SubAccountFuturesAssetTransferRequest subAccountFuturesAssetTransferRequest)
            throws ApiException {
        return assetManagementApi.subAccountFuturesAssetTransfer(
                subAccountFuturesAssetTransferRequest);
    }

    /**
     * Sub-account Transfer History (For Sub-account) (USER_DATA) Sub-account Transfer History
     * Weight(IP): 1 Security Type: USER_DATA Notes: - If &#x60;type&#x60; is not sent, records of
     * type &#x60;2&#x60; (transfer out) are returned by default. - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, data from the most recent 30 days is returned.
     *
     * @param asset If not sent, result of all assets will be returned (optional)
     * @param type 1: transfer in, 2: transfer out (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param returnFailHistory Default &#x60;False&#x60;, return PROCESS and SUCCESS status
     *     history; If &#x60;True&#x60;,return PROCESS and SUCCESS and FAILURE status history
     *     (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;SubAccountTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Sub-account Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#sub-account-transfer-history">Sub-account
     *     Transfer History (For Sub-account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubAccountTransferHistoryResponse> subAccountTransferHistory(
            String asset,
            Long type,
            Long startTime,
            Long endTime,
            Long limit,
            Boolean returnFailHistory,
            Long recvWindow)
            throws ApiException {
        return assetManagementApi.subAccountTransferHistory(
                asset, type, startTime, endTime, limit, returnFailHistory, recvWindow);
    }

    /**
     * Transfer to Master (For Sub-account) (USER_DATA) Transfer to Master Weight(IP): 1 Security
     * Type: USER_DATA Notes: - You need to open Enable Spot &amp; Margin Trading permission for the
     * API Key which requests this endpoint.
     *
     * @param transferToMasterRequest (required)
     * @return ApiResponse&lt;TransferToMasterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Transfer to Master </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#transfer-to-master">Transfer
     *     to Master (For Sub-account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<TransferToMasterResponse> transferToMaster(
            TransferToMasterRequest transferToMasterRequest) throws ApiException {
        return assetManagementApi.transferToMaster(transferToMasterRequest);
    }

    /**
     * Transfer to Sub-account of Same Master (For Sub-account) (USER_DATA) Transfer to Sub-account
     * of Same Master Weight(IP): 1 Security Type: USER_DATA Notes: - You need to open Enable Spot
     * &amp; Margin Trading permission for the API Key which requests this endpoint.
     *
     * @param transferToSubAccountOfSameMasterRequest (required)
     * @return ApiResponse&lt;TransferToSubAccountOfSameMasterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Transfer to Sub-account of Same Master </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#transfer-to-sub-account-of-same-master">Transfer
     *     to Sub-account of Same Master (For Sub-account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<TransferToSubAccountOfSameMasterResponse> transferToSubAccountOfSameMaster(
            TransferToSubAccountOfSameMasterRequest transferToSubAccountOfSameMasterRequest)
            throws ApiException {
        return assetManagementApi.transferToSubAccountOfSameMaster(
                transferToSubAccountOfSameMasterRequest);
    }

    /**
     * Universal Transfer (For Master Account) (USER_DATA) Universal Transfer Weight(IP): 1
     * Weight(UID): 360 Security Type: USER_DATA Notes: - You need to enable the &#x60;internal
     * transfer&#x60; option for the API key used to call this endpoint. - If &#x60;fromEmail&#x60;
     * is not sent, transfer out from the master account by default. - If &#x60;toEmail&#x60; is not
     * sent, transfer into the master account by default. - When &#x60;fromAccountType&#x60; and
     * &#x60;toAccountType&#x60; are the same, at least one of &#x60;fromEmail&#x60; or
     * &#x60;toEmail&#x60; must be sent. - Supported transfer scenarios: - &#x60;SPOT&#x60; -&gt;
     * &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; / &#x60;COIN_FUTURE&#x60; (master or sub-account).
     * - &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; / &#x60;COIN_FUTURE&#x60; -&gt; &#x60;SPOT&#x60;
     * (master or sub-account). - Master account &#x60;SPOT&#x60; -&gt; sub-account
     * &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60;. - Sub-account
     * &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60; -&gt; master account
     * &#x60;SPOT&#x60;. - Sub-account &#x60;MARGIN(Cross)&#x60; -&gt; sub-account
     * &#x60;MARGIN(Cross)&#x60;. - &#x60;ALPHA&#x60; -&gt; &#x60;ALPHA&#x60; (master or
     * sub-account).
     *
     * @param universalTransferRequest (required)
     * @return ApiResponse&lt;UniversalTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Universal Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/asset-management#universal-transfer">Universal
     *     Transfer (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<UniversalTransferResponse> universalTransfer(
            UniversalTransferRequest universalTransferRequest) throws ApiException {
        return assetManagementApi.universalTransfer(universalTransferRequest);
    }

    /**
     * Deposit Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA) Deposit
     * Assets Into The Managed Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: - You need
     * to enable &#x60;Enable Spot &amp; Margin Trading&#x60; option for the api key which requests
     * this endpoint
     *
     * @param depositAssetsIntoTheManagedSubAccountRequest (required)
     * @return ApiResponse&lt;DepositAssetsIntoTheManagedSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit Assets Into The Managed Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#deposit-assets-into-the-managed-sub-account">Deposit
     *     Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<DepositAssetsIntoTheManagedSubAccountResponse>
            depositAssetsIntoTheManagedSubAccount(
                    DepositAssetsIntoTheManagedSubAccountRequest
                            depositAssetsIntoTheManagedSubAccountRequest)
                    throws ApiException {
        return managedSubAccountApi.depositAssetsIntoTheManagedSubAccount(
                depositAssetsIntoTheManagedSubAccountRequest);
    }

    /**
     * Get Managed Sub-account Deposit Address (For Investor Master Account) (USER_DATA) Get
     * investor&#39;s managed sub-account deposit address. Weight(UID): 1 Security Type: USER_DATA
     * Notes: - If &#x60;network&#x60; is not sent, the default &#x60;network&#x60; for the
     * &#x60;coin&#x60; is returned. - When using &#x60;LIGHTNING&#x60;, &#x60;amount&#x60; must be
     * provided.
     *
     * @param email (required)
     * @param coin (required)
     * @param network networks can be found in &#x60;GET /sapi/v1/capital/deposit/address&#x60;
     *     (optional)
     * @param amount (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetManagedSubAccountDepositAddressResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Managed Sub-account Deposit Address </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#get-managed-sub-account-deposit-address">Get
     *     Managed Sub-account Deposit Address (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetManagedSubAccountDepositAddressResponse>
            getManagedSubAccountDepositAddress(
                    String email, String coin, String network, Double amount, Long recvWindow)
                    throws ApiException {
        return managedSubAccountApi.getManagedSubAccountDepositAddress(
                email, coin, network, amount, recvWindow);
    }

    /**
     * Query Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA) Query
     * Managed Sub-account Asset Details Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountAssetDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub-account Asset Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-asset-details">Query
     *     Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountAssetDetailsResponse>
            queryManagedSubAccountAssetDetails(String email, Long recvWindow) throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountAssetDetails(email, recvWindow);
    }

    /**
     * Query Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA)
     * Investor can use this api to query managed sub account futures asset details Weight(UID): 60
     * Security Type: USER_DATA
     *
     * @param email (required)
     * @param accountType No input or input \&quot;USDT_FUTURE\&quot; to get UM Futures account
     *     details. Input \&quot;COIN_FUTURE\&quot; to get CM Futures account details. (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountFuturesAssetDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub-account Futures Asset Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-futures-asset-details">Query
     *     Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountFuturesAssetDetailsResponse>
            queryManagedSubAccountFuturesAssetDetails(String email, String accountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountFuturesAssetDetails(email, accountType);
    }

    /**
     * Query Managed Sub-account List (For Investor) (USER_DATA) Get investor&#39;s managed
     * sub-account list. Weight(UID): 60 Security Type: USER_DATA
     *
     * @param email (optional)
     * @param page (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub-account List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-list">Query
     *     Managed Sub-account List (For Investor) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountListResponse> queryManagedSubAccountList(
            String email, Long page, Long limit, Long recvWindow) throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountList(email, page, limit, recvWindow);
    }

    /**
     * Query Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA)
     * Investor can use this api to query managed sub account margin asset details Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param email (required)
     * @param accountType No input or input \&quot;MARGIN\&quot; to get Cross Margin account
     *     details. Input \&quot;ISOLATED_MARGIN\&quot; to get Isolated Margin account details.
     *     (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountMarginAssetDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub-account Margin Asset Details </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-margin-asset-details">Query
     *     Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountMarginAssetDetailsResponse>
            queryManagedSubAccountMarginAssetDetails(String email, String accountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountMarginAssetDetails(email, accountType);
    }

    /**
     * Query Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA) Query Managed
     * Sub-account Snapshot Weight(IP): 2400 Security Type: USER_DATA Notes: - The query time range
     * must be less than 30 days. - Only data from the most recent month is supported. - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are omitted, records from the last 7 days are
     * returned by default.
     *
     * @param email (required)
     * @param type (required)
     * @param startTime Query time range must be within 30 days and only supports data within the
     *     last month. (optional)
     * @param endTime If both startTime and endTime are omitted, records from the last 7 days are
     *     returned by default. (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountSnapshotResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub-account Snapshot </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-snapshot">Query
     *     Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountSnapshotResponse> queryManagedSubAccountSnapshot(
            String email, OrderType type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountSnapshot(
                email, type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Managed Sub Account Transfer Log For Investor Master Account (USER_DATA) Query Managed
     * Sub Account Transfer Log For Investor Master Account Investor can use this api to query
     * managed sub account transfer log. This endpoint is available for investor of Managed
     * Sub-Account. A Managed Sub-Account is an account type for investors who value flexibility in
     * asset allocation and account application, while delegating trades to a professional trading
     * team. Please refer to
     * [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)
     * Weight(IP): 1 Security Type: USER_DATA
     *
     * @param email (required)
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page Page (required)
     * @param limit (required)
     * @param transfers Transfer Direction (FROM/TO) (optional)
     * @param transferFunctionAccountType (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountTransferLogMasterAccountInvestorResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub Account Transfer Log </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-transfer-log-master-account-investor">Query
     *     Managed Sub Account Transfer Log For Investor Master Account (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountTransferLogMasterAccountInvestorResponse>
            queryManagedSubAccountTransferLogMasterAccountInvestor(
                    String email,
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long limit,
                    String transfers,
                    TransferFunctionAccountType transferFunctionAccountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountTransferLogMasterAccountInvestor(
                email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
    }

    /**
     * Query Managed Sub Account Transfer Log For Trading Team Master Account (USER_DATA) Query
     * Managed Sub Account Transfer Log For Trading Team Master Account Trading team can use this
     * api to query managed sub account transfer log. This endpoint is available for trading team of
     * Managed Sub-Account. A Managed Sub-Account is an account type for investors who value
     * flexibility in asset allocation and account application, while delegating trades to a
     * professional trading team. Please refer to
     * [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)
     * Weight(UID): 60 Security Type: USER_DATA
     *
     * @param email (required)
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page (required)
     * @param limit (required)
     * @param transfers Transfer Direction (FROM/TO) (optional)
     * @param transferFunctionAccountType (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountTransferLogMasterAccountTradingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub Account Transfer Log </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-transfer-log-master-account-trading">Query
     *     Managed Sub Account Transfer Log For Trading Team Master Account (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountTransferLogMasterAccountTradingResponse>
            queryManagedSubAccountTransferLogMasterAccountTrading(
                    String email,
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long limit,
                    String transfers,
                    TransferFunctionAccountType transferFunctionAccountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountTransferLogMasterAccountTrading(
                email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
    }

    /**
     * Query Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA) Query
     * Managed Sub Account Transfer Log (For Trading Team Sub Account) Weight(UID): 60 Security
     * Type: USER_DATA
     *
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page (required)
     * @param limit (required)
     * @param transfers Transfer Direction (from/to) (optional)
     * @param transferFunctionAccountType (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryManagedSubAccountTransferLogSubAccountTradingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Managed Sub Account Transfer Log </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#query-managed-sub-account-transfer-log-sub-account-trading">Query
     *     Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountTransferLogSubAccountTradingResponse>
            queryManagedSubAccountTransferLogSubAccountTrading(
                    Long startTime,
                    Long endTime,
                    Long page,
                    Long limit,
                    String transfers,
                    TransferFunctionAccountType transferFunctionAccountType,
                    Long recvWindow)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountTransferLogSubAccountTrading(
                startTime,
                endTime,
                page,
                limit,
                transfers,
                transferFunctionAccountType,
                recvWindow);
    }

    /**
     * Withdrawl Assets From The Managed Sub-account (For Investor Master Account) (USER_DATA)
     * Withdrawl Assets From The Managed Sub-account Weight(IP): 1 Security Type: USER_DATA Notes: -
     * Your API key must have the permission &#x60;Enable Spot &amp; Margin Trading&#x60;.
     *
     * @param withdrawlAssetsFromTheManagedSubAccountRequest (required)
     * @return ApiResponse&lt;WithdrawlAssetsFromTheManagedSubAccountResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdrawl Assets From The Managed Sub-account </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/vip-and-institutional-sub-account/api/rest-api/managed-sub-account#withdrawl-assets-from-the-managed-sub-account">Withdrawl
     *     Assets From The Managed Sub-account (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<WithdrawlAssetsFromTheManagedSubAccountResponse>
            withdrawlAssetsFromTheManagedSubAccount(
                    WithdrawlAssetsFromTheManagedSubAccountRequest
                            withdrawlAssetsFromTheManagedSubAccountRequest)
                    throws ApiException {
        return managedSubAccountApi.withdrawlAssetsFromTheManagedSubAccount(
                withdrawlAssetsFromTheManagedSubAccountRequest);
    }
}
