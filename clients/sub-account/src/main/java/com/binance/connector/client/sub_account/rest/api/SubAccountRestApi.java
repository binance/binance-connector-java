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
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountFuturesAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountListResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountMarginAssetDetailsResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountSnapshotResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogMasterAccountInvestorResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogMasterAccountTradingResponse;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogSubAccountTradingResponse;
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
     * Create a Virtual Sub-account (For Master Account) (USER_DATA) Create a Virtual Sub-account *
     * This request will generate a virtual sub account under your master account. * You need to
     * enable \&quot;trade\&quot; option for the API Key which requests this endpoint. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Create-a-Virtual-Sub-account">Create
     *     a Virtual Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<CreateAVirtualSubAccountResponse> createAVirtualSubAccount(
            CreateAVirtualSubAccountRequest createAVirtualSubAccountRequest) throws ApiException {
        return accountManagementApi.createAVirtualSubAccount(createAVirtualSubAccountRequest);
    }

    /**
     * Enable Futures for Sub-account (For Master Account) (USER_DATA) Enable Futures for
     * Sub-account for Master Account Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Enable-Futures-for-Sub-account">Enable
     *     Futures for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<EnableFuturesForSubAccountResponse> enableFuturesForSubAccount(
            EnableFuturesForSubAccountRequest enableFuturesForSubAccountRequest)
            throws ApiException {
        return accountManagementApi.enableFuturesForSubAccount(enableFuturesForSubAccountRequest);
    }

    /**
     * Enable Options for Sub-account (For Master Account) (USER_DATA) Enable Options for
     * Sub-account (For Master Account). Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Enable-Options-for-Sub-account">Enable
     *     Options for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<EnableOptionsForSubAccountResponse> enableOptionsForSubAccount(
            EnableOptionsForSubAccountRequest enableOptionsForSubAccountRequest)
            throws ApiException {
        return accountManagementApi.enableOptionsForSubAccount(enableOptionsForSubAccountRequest);
    }

    /**
     * Get Futures Position-Risk of Sub-account (For Master Account) (USER_DATA) Get Futures
     * Position-Risk of Sub-account Weight: 10
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Get-Futures-Position-Risk-of-Sub-account">Get
     *     Futures Position-Risk of Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesPositionRiskOfSubAccountResponse>
            getFuturesPositionRiskOfSubAccount(String email, Long recvWindow) throws ApiException {
        return accountManagementApi.getFuturesPositionRiskOfSubAccount(email, recvWindow);
    }

    /**
     * Get Futures Position-Risk of Sub-account V2 (For Master Account) (USER_DATA) Get Futures
     * Position-Risk of Sub-account V2 Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Get-Futures-Position-Risk-of-Sub-account-V2">Get
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
     * Sub-account&#39;s Status on Margin Or Futures * If no email sent, all sub-accounts&#39;
     * information will be returned. Weight: 10
     *
     * @param email Managed sub-account email (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Get-Sub-accounts-Status-on-Margin-Or-Futures">Get
     *     Sub-account&#39;s Status on Margin Or Futures (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSubAccountsStatusOnMarginOrFuturesResponse>
            getSubAccountsStatusOnMarginOrFutures(String email, Long recvWindow)
                    throws ApiException {
        return accountManagementApi.getSubAccountsStatusOnMarginOrFutures(email, recvWindow);
    }

    /**
     * Query Sub-account List (For Master Account) (USER_DATA) Query Sub-account List Weight: 1
     *
     * @param email Managed sub-account email (optional)
     * @param isFreeze true or false (optional)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Query-Sub-account-List">Query
     *     Sub-account List (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountListResponse> querySubAccountList(
            String email, String isFreeze, Long page, Long limit, Long recvWindow)
            throws ApiException {
        return accountManagementApi.querySubAccountList(email, isFreeze, page, limit, recvWindow);
    }

    /**
     * Query Sub-account Transaction Statistics (For Master Account) (USER_DATA) Query Sub-account
     * Transaction statistics (For Master Account). Weight: 60
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/account-management/Query-Sub-account-Transaction-Statistics">Query
     *     Sub-account Transaction Statistics (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountTransactionStatisticsResponse>
            querySubAccountTransactionStatistics(String email, Long recvWindow)
                    throws ApiException {
        return accountManagementApi.querySubAccountTransactionStatistics(email, recvWindow);
    }

    /**
     * Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA) Add IP
     * Restriction for Sub-Account API key * You need to enable Enable Spot &amp; Margin Trading
     * option for the api key which requests this endpoint Weight: 3000
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
     *     href="https://developers.binance.com/docs/sub_account/api-management/Add-IP-Restriction-for-Sub-Account-API-key">Add
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
     * Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA) Delete IP List For
     * a Sub-account API Key * You need to enable Enable Spot &amp; Margin Trading option for the
     * api key which requests this endpoint Weight: 3000
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/api-management/Delete-IP-List-For-a-Sub-account-API-Key">Delete
     *     IP List For a Sub-account API Key (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DeleteIpListForASubAccountApiKeyResponse> deleteIpListForASubAccountApiKey(
            String email, String subAccountApiKey, String ipAddress, Long recvWindow)
            throws ApiException {
        return apiManagementApi.deleteIpListForASubAccountApiKey(
                email, subAccountApiKey, ipAddress, recvWindow);
    }

    /**
     * Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA) Get IP
     * Restriction for a Sub-account API Key Weight: 3000
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/api-management/Get-IP-Restriction-for-a-Sub-account-API-Key">Get
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
     * Futures Transfer for Sub-account (For Master Account) (USER_DATA) Futures Transfer for
     * Sub-account * You need to open Enable Spot &amp; Margin Trading permission for the API Key
     * which requests this endpoint. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Futures-Transfer-for-Sub-account">Futures
     *     Transfer for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<FuturesTransferForSubAccountResponse> futuresTransferForSubAccount(
            FuturesTransferForSubAccountRequest futuresTransferForSubAccountRequest)
            throws ApiException {
        return assetManagementApi.futuresTransferForSubAccount(futuresTransferForSubAccountRequest);
    }

    /**
     * Get Detail on Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) Get Detail
     * on Sub-account&#39;s Futures Account Weight: 10
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Detail-on-Sub-accounts-Futures-Account">Get
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
     * Detail on Sub-account&#39;s Futures Account Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Detail-on-Sub-accounts-Futures-Account-V2">Get
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
     * Sub-account&#39;s Margin Account Weight: 10
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Detail-on-Sub-accounts-Margin-Account">Get
     *     Detail on Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetDetailOnSubAccountsMarginAccountResponse>
            getDetailOnSubAccountsMarginAccount(String email, Long recvWindow) throws ApiException {
        return assetManagementApi.getDetailOnSubAccountsMarginAccount(email, recvWindow);
    }

    /**
     * Get Move Position History for Sub-account (For Master Account) (USER_DATA) Query move
     * position history * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records
     * of the last 90 days by default with 1000 maximum limits * If &#x60;startTime&#x60; is sent
     * and &#x60;endTime&#x60; is not sent, return records of [max(startTime, now-90d), now]. * If
     * &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of
     * [max(now,endTime-90d), endTime]. Weight: 150
     *
     * @param symbol (required)
     * @param page Page (required)
     * @param row (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Move-Position-History-for-Sub-account">Get
     *     Move Position History for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetMovePositionHistoryForSubAccountResponse>
            getMovePositionHistoryForSubAccount(
                    String symbol,
                    Long page,
                    Long row,
                    Long startTime,
                    Long endTime,
                    Long recvWindow)
                    throws ApiException {
        return assetManagementApi.getMovePositionHistoryForSubAccount(
                symbol, page, row, startTime, endTime, recvWindow);
    }

    /**
     * Get Sub-account Deposit Address (For Master Account) (USER_DATA) Fetch sub-account deposit
     * address * &#x60;amount&#x60; needs to be sent if using LIGHTNING network Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Sub-account-Deposit-Address">Get
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
     * history Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param coin (optional)
     * @param status 0(0:pending,6: credited but cannot withdraw,7:Wrong Deposit,8:Waiting User
     *     confirm,1:success) (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
     * @param offset default:0 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Sub-account-Deposit-History">Get
     *     Sub-account Deposit History (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetSubAccountDepositHistoryResponse> getSubAccountDepositHistory(
            String email,
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
                email, coin, status, startTime, endTime, limit, offset, recvWindow, txId);
    }

    /**
     * Get Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA) Get Summary
     * of Sub-account&#39;s Futures Account Weight: 1
     *
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Summary-of-Sub-accounts-Futures-Account">Get
     *     Summary of Sub-account&#39;s Futures Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSummaryOfSubAccountsFuturesAccountResponse>
            getSummaryOfSubAccountsFuturesAccount(Long recvWindow) throws ApiException {
        return assetManagementApi.getSummaryOfSubAccountsFuturesAccount(recvWindow);
    }

    /**
     * Get Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA) Get
     * Summary of Sub-account&#39;s Futures Account Weight: 10
     *
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Summary-of-Sub-accounts-Futures-Account-V2">Get
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
     * of Sub-account&#39;s Margin Account Weight: 10
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Get-Summary-of-Sub-accounts-Margin-Account">Get
     *     Summary of Sub-account&#39;s Margin Account (For Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<GetSummaryOfSubAccountsMarginAccountResponse>
            getSummaryOfSubAccountsMarginAccount(Long recvWindow) throws ApiException {
        return assetManagementApi.getSummaryOfSubAccountsMarginAccount(recvWindow);
    }

    /**
     * Margin Transfer for Sub-account (For Master Account) (USER_DATA) Margin Transfer for
     * Sub-account * You need to open Enable Spot &amp; Margin Trading permission for the API Key
     * which requests this endpoint. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Margin-Transfer-for-Sub-account">Margin
     *     Transfer for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<MarginTransferForSubAccountResponse> marginTransferForSubAccount(
            MarginTransferForSubAccountRequest marginTransferForSubAccountRequest)
            throws ApiException {
        return assetManagementApi.marginTransferForSubAccount(marginTransferForSubAccountRequest);
    }

    /**
     * Move Position for Sub-account (For Master Account) (USER_DATA) Move position between
     * sub-master, master-sub, or sub-sub accounts when necessary * You need to Enable Trading
     * permission for the API Key which requests this endpoint. * This function only support VIP
     * level 7-9. * Only master account can use the function * Quantity should be positive number
     * only * The function support normal account, PM PRO and PM PRO SPAN. * Only support for from
     * account has positions * For all orders in the same orderArgs request, if any symbol’s total
     * close position quantity is bigger than the symbol’s current position quantity, all batch
     * orders in the same list will fail simultaneously. * Only support cross margin mode * The
     * price for move position is MarkPrice only. * Not support for MSA. * Not support for the
     * symbol under Reduce-Only. Weight: 150
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Move-Position-for-Sub-account">Move
     *     Position for Sub-account (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<MovePositionForSubAccountResponse> movePositionForSubAccount(
            MovePositionForSubAccountRequest movePositionForSubAccountRequest) throws ApiException {
        return assetManagementApi.movePositionForSubAccount(movePositionForSubAccountRequest);
    }

    /**
     * Query Sub-account Assets (For Master Account) (USER_DATA) Fetch sub-account assets Weight: 60
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Sub-account-Assets-V4">Query
     *     Sub-account Assets (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountAssetsResponse> querySubAccountAssets(
            String email, Long recvWindow) throws ApiException {
        return assetManagementApi.querySubAccountAssets(email, recvWindow);
    }

    /**
     * Query Sub-account Assets (For Master Account) (USER_DATA) Fetch sub-account assets Weight: 60
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Sub-account-Assets-V4">Query
     *     Sub-account Assets (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountAssetsAssetManagementResponse>
            querySubAccountAssetsAssetManagement(String email, Long recvWindow)
                    throws ApiException {
        return assetManagementApi.querySubAccountAssetsAssetManagement(email, recvWindow);
    }

    /**
     * Query Sub-account Futures Asset Transfer History (For Master Account) (USER_DATA) Query
     * Sub-account Futures Asset Transfer History Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param futuresType 1:USDT-margined Futures，2: Coin-margined Futures (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Sub-account-Futures-Asset-Transfer-History">Query
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
     * Sub-account Spot Asset Transfer History * fromEmail and toEmail cannot be sent at the same
     * time. * Return fromEmail equal master account email by default. Weight: 1
     *
     * @param fromEmail (optional)
     * @param toEmail (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Sub-account-Spot-Asset-Transfer-History">Query
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
     * summary of subaccounts. Weight: 1
     *
     * @param email Managed sub-account email (optional)
     * @param page Default value: 1 (optional)
     * @param size default 10, max 20 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Sub-account-Spot-Assets-Summary">Query
     *     Sub-account Spot Assets Summary (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QuerySubAccountSpotAssetsSummaryResponse> querySubAccountSpotAssetsSummary(
            String email, Long page, Long size, Long recvWindow) throws ApiException {
        return assetManagementApi.querySubAccountSpotAssetsSummary(email, page, size, recvWindow);
    }

    /**
     * Query Universal Transfer History (For Master Account) (USER_DATA) Query Universal Transfer
     * History * fromEmail and toEmail cannot be sent at the same time. * Return fromEmail equal
     * master account email by default. * The query time period must be less than 7 days. * If
     * startTime and endTime not sent, return records of the last 7 days by default. Weight: 1
     *
     * @param fromEmail (optional)
     * @param toEmail (optional)
     * @param clientTranId (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Query-Universal-Transfer-History">Query
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
     * Transfer * Master account can transfer max 2000 times a minute * There must be sufficient
     * margin balance in futures wallet to execute transferring. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Sub-account-Futures-Asset-Transfer">Sub-account
     *     Futures Asset Transfer (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubAccountFuturesAssetTransferResponse> subAccountFuturesAssetTransfer(
            SubAccountFuturesAssetTransferRequest subAccountFuturesAssetTransferRequest)
            throws ApiException {
        return assetManagementApi.subAccountFuturesAssetTransfer(
                subAccountFuturesAssetTransferRequest);
    }

    /**
     * Sub-account Transfer History (For Sub-account) (USER_DATA) Sub-account Transfer History * If
     * type is not sent, the records of type 2: transfer out will be returned by default. * If
     * startTime and endTime are not sent, the recent 30-day data will be returned. Weight: 1
     *
     * @param asset If not sent, result of all assets will be returned (optional)
     * @param type 1: transfer in, 2: transfer out (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Sub-account-Transfer-History">Sub-account
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
     * Transfer to Master (For Sub-account) (USER_DATA) Transfer to Master * You need to open Enable
     * Spot &amp; Margin Trading permission for the API Key which requests this endpoint. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Transfer-to-Master">Transfer
     *     to Master (For Sub-account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<TransferToMasterResponse> transferToMaster(
            TransferToMasterRequest transferToMasterRequest) throws ApiException {
        return assetManagementApi.transferToMaster(transferToMasterRequest);
    }

    /**
     * Transfer to Sub-account of Same Master (For Sub-account) (USER_DATA) Transfer to Sub-account
     * of Same Master * You need to open Enable Spot &amp; Margin Trading permission for the API Key
     * which requests this endpoint. Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Transfer-to-Sub-account-of-Same-Master">Transfer
     *     to Sub-account of Same Master (For Sub-account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<TransferToSubAccountOfSameMasterResponse> transferToSubAccountOfSameMaster(
            TransferToSubAccountOfSameMasterRequest transferToSubAccountOfSameMasterRequest)
            throws ApiException {
        return assetManagementApi.transferToSubAccountOfSameMaster(
                transferToSubAccountOfSameMasterRequest);
    }

    /**
     * Universal Transfer (For Master Account) (USER_DATA) Universal Transfer * You need to enable
     * \&quot;internal transfer\&quot; option for the api key which requests this endpoint. *
     * Transfer from master account by default if fromEmail is not sent. * Transfer to master
     * account by default if toEmail is not sent. * At least either fromEmail or toEmail need to be
     * sent when the fromAccountType and the toAccountType are the same. * Supported transfer
     * scenarios: * &#x60;SPOT&#x60; transfer to &#x60;SPOT&#x60;, &#x60;USDT_FUTURE&#x60;,
     * &#x60;COIN_FUTURE&#x60; (regardless of master or sub) * &#x60;SPOT&#x60;,
     * &#x60;USDT_FUTURE&#x60;, &#x60;COIN_FUTURE&#x60; transfer to &#x60;SPOT&#x60; (regardless of
     * master or sub) * Master account &#x60;SPOT&#x60; transfer to sub-account
     * &#x60;MARGIN(Cross)&#x60;, &#x60;ISOLATED_MARGIN&#x60; * Sub-account
     * &#x60;MARGIN(Cross)&#x60;, &#x60;ISOLATED_MARGIN&#x60; transfer to master account
     * &#x60;SPOT&#x60; * Sub-account &#x60;MARGIN(Cross)&#x60; transfer to Sub-account
     * &#x60;MARGIN(Cross)&#x60; * &#x60;ALPHA&#x60; to &#x60;ALPHA&#x60; (regardless of master or
     * sub) Weight: 360
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
     *     href="https://developers.binance.com/docs/sub_account/asset-management/Universal-Transfer">Universal
     *     Transfer (For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<UniversalTransferResponse> universalTransfer(
            UniversalTransferRequest universalTransferRequest) throws ApiException {
        return assetManagementApi.universalTransfer(universalTransferRequest);
    }

    /**
     * Deposit Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA) Deposit
     * Assets Into The Managed Sub-account * You need to enable &#x60;Enable Spot &amp; Margin
     * Trading&#x60; option for the api key which requests this endpoint Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Deposit-Assets-Into-The-Managed-Sub-account">Deposit
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
     * investor&#39;s managed sub-account deposit address. * If &#x60;network&#x60; is not send,
     * return with default &#x60;network&#x60; of the &#x60;coin&#x60;. * * &#x60;amount&#x60; needs
     * to be sent if using LIGHTNING network Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Get-Managed-Sub-account-Deposit-Address">Get
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
     * Managed Sub-account Asset Details Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-account-Asset-Details">Query
     *     Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountAssetDetailsResponse>
            queryManagedSubAccountAssetDetails(String email, Long recvWindow) throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountAssetDetails(email, recvWindow);
    }

    /**
     * Query Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA)
     * Investor can use this api to query managed sub account futures asset details Weight: 60
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param accountType No input or input \&quot;MARGIN\&quot; to get Cross Margin account
     *     details. Input \&quot;ISOLATED_MARGIN\&quot; to get Isolated Margin account details.
     *     (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-account-Futures-Asset-Details">Query
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
     * sub-account list. Weight: 60
     *
     * @param email Managed sub-account email (optional)
     * @param page Default value: 1 (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-account-List">Query
     *     Managed Sub-account List (For Investor) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountListResponse> queryManagedSubAccountList(
            String email, Long page, Long limit, Long recvWindow) throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountList(email, page, limit, recvWindow);
    }

    /**
     * Query Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA)
     * Investor can use this api to query managed sub account margin asset details Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-account-Margin-Asset-Details">Query
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
     * Sub-account Snapshot * The query time period must be less then 30 days * Support query within
     * the last one month only * If startTimeand endTime not sent, return records of the last 7 days
     * by default Weight: 2400
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param type \&quot;SPOT\&quot;, \&quot;MARGIN\&quot;（cross）, \&quot;FUTURES\&quot;（UM）
     *     (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit Default value: 1, Max value: 200 (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-account-Snapshot">Query
     *     Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryManagedSubAccountSnapshotResponse> queryManagedSubAccountSnapshot(
            String email, String type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountSnapshot(
                email, type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Query Managed Sub Account Transfer Log (For Investor Master Account) (USER_DATA) Investor can
     * use this api to query managed sub account transfer log. This endpoint is available for
     * investor of Managed Sub-Account. A Managed Sub-Account is an account type for investors who
     * value flexibility in asset allocation and account application, while delegating trades to a
     * professional trading team. Please refer to
     * [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)
     * Weight: 1
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page Page (required)
     * @param limit Limit (Max: 500) (required)
     * @param transfers Transfer Direction (FROM/TO) (optional)
     * @param transferFunctionAccountType Transfer function account type
     *     (SPOT/MARGIN/ISOLATED_MARGIN/USDT_FUTURE/COIN_FUTURE) (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-Account-Transfer-Log-Investor">Query
     *     Managed Sub Account Transfer Log (For Investor Master Account) (USER_DATA)
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
                    String transferFunctionAccountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountTransferLogMasterAccountInvestor(
                email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
    }

    /**
     * Query Managed Sub Account Transfer Log (For Trading Team Master Account) (USER_DATA) Trading
     * team can use this api to query managed sub account transfer log. This endpoint is available
     * for trading team of Managed Sub-Account. A Managed Sub-Account is an account type for
     * investors who value flexibility in asset allocation and account application, while delegating
     * trades to a professional trading team. Please refer to
     * [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)
     * Weight: 60
     *
     * @param email [Sub-account email](#email-address) (required)
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page Page (required)
     * @param limit Limit (Max: 500) (required)
     * @param transfers Transfer Direction (FROM/TO) (optional)
     * @param transferFunctionAccountType Transfer function account type
     *     (SPOT/MARGIN/ISOLATED_MARGIN/USDT_FUTURE/COIN_FUTURE) (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-Account-Transfer-Log-Trading-Team-Master">Query
     *     Managed Sub Account Transfer Log (For Trading Team Master Account) (USER_DATA)
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
                    String transferFunctionAccountType)
                    throws ApiException {
        return managedSubAccountApi.queryManagedSubAccountTransferLogMasterAccountTrading(
                email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
    }

    /**
     * Query Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA) Query
     * Managed Sub Account Transfer Log (For Trading Team Sub Account) Weight: 60
     *
     * @param startTime Start Time (required)
     * @param endTime End Time (The start time and end time interval cannot exceed half a year)
     *     (required)
     * @param page Page (required)
     * @param limit Limit (Max: 500) (required)
     * @param transfers Transfer Direction (FROM/TO) (optional)
     * @param transferFunctionAccountType Transfer function account type
     *     (SPOT/MARGIN/ISOLATED_MARGIN/USDT_FUTURE/COIN_FUTURE) (optional)
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Query-Managed-Sub-Account-Transfer-Log-Trading-Team-Sub">Query
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
                    String transferFunctionAccountType,
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
     * Withdrawl Assets From The Managed Sub-account * You need to enable &#x60;Enable Spot &amp;
     * Margin Trading&#x60; option for the api key which requests this endpoint Weight: 1
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
     *     href="https://developers.binance.com/docs/sub_account/managed-sub-account/Withdrawl-Assets-From-The-Managed-Sub-account">Withdrawl
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
