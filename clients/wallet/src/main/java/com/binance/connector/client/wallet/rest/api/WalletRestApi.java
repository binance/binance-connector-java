package com.binance.connector.client.wallet.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.model.AccountApiTradingStatusResponse;
import com.binance.connector.client.wallet.rest.model.AccountInfoResponse;
import com.binance.connector.client.wallet.rest.model.AccountStatusResponse;
import com.binance.connector.client.wallet.rest.model.AccountType;
import com.binance.connector.client.wallet.rest.model.AllCoinsInformationResponse;
import com.binance.connector.client.wallet.rest.model.AssetDetailResponse;
import com.binance.connector.client.wallet.rest.model.AssetDividendRecordResponse;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawRequest;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawResponse;
import com.binance.connector.client.wallet.rest.model.CheckQuestionnaireRequirementsResponse;
import com.binance.connector.client.wallet.rest.model.DailyAccountSnapshotResponse;
import com.binance.connector.client.wallet.rest.model.DepositAddressResponse;
import com.binance.connector.client.wallet.rest.model.DepositHistoryResponse;
import com.binance.connector.client.wallet.rest.model.DepositHistoryTravelRuleResponse;
import com.binance.connector.client.wallet.rest.model.DepositHistoryV2Response;
import com.binance.connector.client.wallet.rest.model.DisableFastWithdrawSwitchRequest;
import com.binance.connector.client.wallet.rest.model.DustConvertRequest;
import com.binance.connector.client.wallet.rest.model.DustConvertResponse;
import com.binance.connector.client.wallet.rest.model.DustConvertibleAssetsRequest;
import com.binance.connector.client.wallet.rest.model.DustConvertibleAssetsResponse;
import com.binance.connector.client.wallet.rest.model.DustTransferRequest;
import com.binance.connector.client.wallet.rest.model.DustTransferResponse;
import com.binance.connector.client.wallet.rest.model.DustlogResponse;
import com.binance.connector.client.wallet.rest.model.EnableFastWithdrawSwitchRequest;
import com.binance.connector.client.wallet.rest.model.FetchAddressVerificationListResponse;
import com.binance.connector.client.wallet.rest.model.FetchDepositAddressListWithNetworkResponse;
import com.binance.connector.client.wallet.rest.model.FetchWithdrawAddressListResponse;
import com.binance.connector.client.wallet.rest.model.FetchWithdrawQuotaResponse;
import com.binance.connector.client.wallet.rest.model.FromSymbol;
import com.binance.connector.client.wallet.rest.model.FundingWalletRequest;
import com.binance.connector.client.wallet.rest.model.FundingWalletResponse;
import com.binance.connector.client.wallet.rest.model.GetApiKeyPermissionResponse;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbRequest;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbResponse;
import com.binance.connector.client.wallet.rest.model.GetCloudMiningPaymentAndRefundHistoryResponse;
import com.binance.connector.client.wallet.rest.model.GetCountryListResponse;
import com.binance.connector.client.wallet.rest.model.GetOpenSymbolListResponse;
import com.binance.connector.client.wallet.rest.model.GetRegionListResponse;
import com.binance.connector.client.wallet.rest.model.GetSymbolsDelistScheduleForSpotResponse;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyRequest;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyResponse;
import com.binance.connector.client.wallet.rest.model.OrderType;
import com.binance.connector.client.wallet.rest.model.QueryUserDelegationHistoryResponse;
import com.binance.connector.client.wallet.rest.model.QueryUserUniversalTransferHistoryResponse;
import com.binance.connector.client.wallet.rest.model.QueryUserWalletBalanceResponse;
import com.binance.connector.client.wallet.rest.model.Status;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireResponse;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleResponse;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireV2Request;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireV2Response;
import com.binance.connector.client.wallet.rest.model.SystemStatusResponse;
import com.binance.connector.client.wallet.rest.model.ToSymbol;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestRequest;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestResponse;
import com.binance.connector.client.wallet.rest.model.TradeFeeResponse;
import com.binance.connector.client.wallet.rest.model.UserAssetRequest;
import com.binance.connector.client.wallet.rest.model.UserAssetResponse;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferRequest;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferResponse;
import com.binance.connector.client.wallet.rest.model.VaspListResponse;
import com.binance.connector.client.wallet.rest.model.WithdrawHistoryResponse;
import com.binance.connector.client.wallet.rest.model.WithdrawHistoryV1Response;
import com.binance.connector.client.wallet.rest.model.WithdrawHistoryV2Response;
import com.binance.connector.client.wallet.rest.model.WithdrawRequest;
import com.binance.connector.client.wallet.rest.model.WithdrawResponse;
import com.binance.connector.client.wallet.rest.model.WithdrawTravelRuleRequest;
import com.binance.connector.client.wallet.rest.model.WithdrawTravelRuleResponse;

public class WalletRestApi {

    private final AccountApi accountApi;
    private final AssetApi assetApi;
    private final CapitalApi capitalApi;
    private final OthersApi othersApi;
    private final TravelRuleApi travelRuleApi;

    public WalletRestApi(ClientConfiguration configuration) {
        this(WalletRestApiUtil.getDefaultClient(configuration));
    }

    public WalletRestApi(ApiClient apiClient) {
        this.accountApi = new AccountApi(apiClient);
        this.assetApi = new AssetApi(apiClient);
        this.capitalApi = new CapitalApi(apiClient);
        this.othersApi = new OthersApi(apiClient);
        this.travelRuleApi = new TravelRuleApi(apiClient);
    }

    /**
     * Account API Trading Status (USER_DATA) Fetch account api trading status detail. Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountApiTradingStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account API Trading Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#account-api-trading-status">Account
     *     API Trading Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountApiTradingStatusResponse> accountApiTradingStatus(Long recvWindow)
            throws ApiException {
        return accountApi.accountApiTradingStatus(recvWindow);
    }

    /**
     * Account info (USER_DATA) Fetch account info detail. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account info </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#account-info">Account
     *     info (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInfoResponse> accountInfo(Long recvWindow) throws ApiException {
        return accountApi.accountInfo(recvWindow);
    }

    /**
     * Account Status (USER_DATA) Fetch account status detail. Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AccountStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Account Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#account-status">Account
     *     Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountStatusResponse> accountStatus(Long recvWindow) throws ApiException {
        return accountApi.accountStatus(recvWindow);
    }

    /**
     * Daily Account Snapshot (USER_DATA) Daily account snapshot Weight(IP): 2400 Security Type:
     * USER_DATA Notes: - The query time period must be less then 30 days - Support query within the
     * last one month only - If startTimeand endTime not sent, return records of the last 7 days by
     * default
     *
     * @param type (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;DailyAccountSnapshotResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Daily Account Snapshot </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#daily-account-snapshot">Daily
     *     Account Snapshot (USER_DATA) Documentation</a>
     */
    public ApiResponse<DailyAccountSnapshotResponse> dailyAccountSnapshot(
            OrderType type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return accountApi.dailyAccountSnapshot(type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Disable Fast Withdraw Switch (USER_DATA) Disable Fast Withdraw Switch Weight(IP): 1 Security
     * Type: USER_DATA Notes: - This request will disable fastwithdraw switch under your account.
     * You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint.
     *
     * @param disableFastWithdrawSwitchRequest (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#disable-fast-withdraw-switch">Disable
     *     Fast Withdraw Switch (USER_DATA) Documentation</a>
     */
    public void disableFastWithdrawSwitch(
            DisableFastWithdrawSwitchRequest disableFastWithdrawSwitchRequest) throws ApiException {
        accountApi.disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest);
    }

    /**
     * Enable Fast Withdraw Switch (USER_DATA) Enable Fast Withdraw Switch (USER_DATA) Weight(IP): 1
     * Security Type: USER_DATA Notes: - This request will enable fastwithdraw switch under your
     * account. You need to enable \&quot;trade\&quot; option for the api key which requests this
     * endpoint. - When Fast Withdraw Switch is on, transferring funds to a Binance account will be
     * done instantly. There is no on-chain transaction, no transaction ID and no withdrawal fee.
     *
     * @param enableFastWithdrawSwitchRequest (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#enable-fast-withdraw-switch">Enable
     *     Fast Withdraw Switch (USER_DATA) Documentation</a>
     */
    public void enableFastWithdrawSwitch(
            EnableFastWithdrawSwitchRequest enableFastWithdrawSwitchRequest) throws ApiException {
        accountApi.enableFastWithdrawSwitch(enableFastWithdrawSwitchRequest);
    }

    /**
     * Get API Key Permission (USER_DATA) Get API Key Permission Weight(IP): 1 Security Type:
     * USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetApiKeyPermissionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get API Key Permission </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/account#get-api-key-permission">Get
     *     API Key Permission (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetApiKeyPermissionResponse> getApiKeyPermission(Long recvWindow)
            throws ApiException {
        return accountApi.getApiKeyPermission(recvWindow);
    }

    /**
     * Asset Detail (USER_DATA) Fetch details of assets supported on Binance. Weight(IP): 1 Security
     * Type: USER_DATA Notes: - Please get network and other deposit or withdraw details from
     * &#x60;GET /sapi/v1/capital/config/getall&#x60;.
     *
     * @param asset (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AssetDetailResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Asset Detail </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#asset-detail">Asset
     *     Detail (USER_DATA) Documentation</a>
     */
    public ApiResponse<AssetDetailResponse> assetDetail(String asset, Long recvWindow)
            throws ApiException {
        return assetApi.assetDetail(asset, recvWindow);
    }

    /**
     * Asset Dividend Record (USER_DATA) Query asset dividend record. Weight(IP): 10 Security Type:
     * USER_DATA Notes: - There cannot be more than 180 days between parameter &#x60;startTime&#x60;
     * and &#x60;endTime&#x60;.
     *
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AssetDividendRecordResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Asset Dividend Record </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#asset-dividend-record">Asset
     *     Dividend Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<AssetDividendRecordResponse> assetDividendRecord(
            String asset, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return assetApi.assetDividendRecord(asset, startTime, endTime, limit, recvWindow);
    }

    /**
     * Dust Convert (USER_DATA) Convert dust assets Weight(UID): 10 Security Type: USER_DATA
     *
     * @param dustConvertRequest (required)
     * @return ApiResponse&lt;DustConvertResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Dust Convert </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#dust-convert">Dust
     *     Convert (USER_DATA) Documentation</a>
     */
    public ApiResponse<DustConvertResponse> dustConvert(DustConvertRequest dustConvertRequest)
            throws ApiException {
        return assetApi.dustConvert(dustConvertRequest);
    }

    /**
     * Dust Convertible Assets (USER_DATA) Query dust convertible assets Weight(IP): 1 Security
     * Type: USER_DATA
     *
     * @param dustConvertibleAssetsRequest (required)
     * @return ApiResponse&lt;DustConvertibleAssetsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Dust Convertible Assets </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#dust-convertible-assets">Dust
     *     Convertible Assets (USER_DATA) Documentation</a>
     */
    public ApiResponse<DustConvertibleAssetsResponse> dustConvertibleAssets(
            DustConvertibleAssetsRequest dustConvertibleAssetsRequest) throws ApiException {
        return assetApi.dustConvertibleAssets(dustConvertibleAssetsRequest);
    }

    /**
     * Dust Transfer (USER_DATA) Convert dust assets to BNB. Weight(UID): 10 Security Type:
     * USER_DATA Notes: - You need to open&#x60;Enable Spot &amp; Margin Trading&#x60; permission
     * for the API Key which requests this endpoint.
     *
     * @param dustTransferRequest (required)
     * @return ApiResponse&lt;DustTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Dust Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#dust-transfer">Dust
     *     Transfer (USER_DATA) Documentation</a>
     */
    public ApiResponse<DustTransferResponse> dustTransfer(DustTransferRequest dustTransferRequest)
            throws ApiException {
        return assetApi.dustTransfer(dustTransferRequest);
    }

    /**
     * DustLog (USER_DATA) Dustlog Weight(IP): 1 Security Type: USER_DATA Notes: - Only return last
     * 100 records - Only return records after 2020/12/01
     *
     * @param accountType (optional, default to SPOT)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;DustlogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> DustLog </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#dustlog">DustLog
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<DustlogResponse> dustlog(
            AccountType accountType, Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return assetApi.dustlog(accountType, startTime, endTime, recvWindow);
    }

    /**
     * Funding Wallet (USER_DATA) Query Funding Wallet Weight(IP): 1 Security Type: USER_DATA Notes:
     * - Currently supports querying the following business assets：Binance Pay, Binance Card,
     * Binance Gift Card, Stock Token
     *
     * @param fundingWalletRequest (optional)
     * @return ApiResponse&lt;FundingWalletResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Funding Wallet </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#funding-wallet">Funding
     *     Wallet (USER_DATA) Documentation</a>
     */
    public ApiResponse<FundingWalletResponse> fundingWallet(
            FundingWalletRequest fundingWalletRequest) throws ApiException {
        return assetApi.fundingWallet(fundingWalletRequest);
    }

    /**
     * Get Assets That Can Be Converted Into BNB (USER_DATA) Get Assets That Can Be Converted Into
     * BNB Weight(IP): 1 Security Type: USER_DATA
     *
     * @param getAssetsThatCanBeConvertedIntoBnbRequest (optional)
     * @return ApiResponse&lt;GetAssetsThatCanBeConvertedIntoBnbResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Assets That Can Be Converted Into BNB </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#get-assets-that-can-be-converted-into-bnb">Get
     *     Assets That Can Be Converted Into BNB (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetAssetsThatCanBeConvertedIntoBnbResponse>
            getAssetsThatCanBeConvertedIntoBnb(
                    GetAssetsThatCanBeConvertedIntoBnbRequest
                            getAssetsThatCanBeConvertedIntoBnbRequest)
                    throws ApiException {
        return assetApi.getAssetsThatCanBeConvertedIntoBnb(
                getAssetsThatCanBeConvertedIntoBnbRequest);
    }

    /**
     * Get Cloud-Mining payment and refund history (USER_DATA) The query of Cloud-Mining payment and
     * refund history Weight(UID): 600 Security Type: USER_DATA Notes: - Just return the SUCCESS
     * records of payment and refund. - For response, type &#x3D; 248 means payment, type &#x3D; 249
     * means refund, status &#x3D;S means SUCCESS.
     *
     * @param startTime inclusive, unit: ms (required)
     * @param endTime exclusive, unit: ms (required)
     * @param tranId The transaction id (optional)
     * @param clientTranId The unique flag (optional)
     * @param asset If it is blank, we will query all assets (optional)
     * @param current (optional)
     * @param size (optional)
     * @return ApiResponse&lt;GetCloudMiningPaymentAndRefundHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Cloud-Mining payment and refund history </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#get-cloud-mining-payment-and-refund-history">Get
     *     Cloud-Mining payment and refund history (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCloudMiningPaymentAndRefundHistoryResponse>
            getCloudMiningPaymentAndRefundHistory(
                    Long startTime,
                    Long endTime,
                    Long tranId,
                    String clientTranId,
                    String asset,
                    Long current,
                    Long size)
                    throws ApiException {
        return assetApi.getCloudMiningPaymentAndRefundHistory(
                startTime, endTime, tranId, clientTranId, asset, current, size);
    }

    /**
     * Get Open Symbol List (MARKET_DATA) Get the list of symbols that are scheduled to be opened
     * for trading in the market. Weight(IP): 100 Security Type: MARKET_DATA
     *
     * @return ApiResponse&lt;GetOpenSymbolListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Open Symbol List </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#get-open-symbol-list">Get
     *     Open Symbol List (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetOpenSymbolListResponse> getOpenSymbolList() throws ApiException {
        return assetApi.getOpenSymbolList();
    }

    /**
     * Query User Delegation History(For Master Account) (USER_DATA) Query User Delegation History
     * Weight(IP): 60 Security Type: USER_DATA
     *
     * @param email (required)
     * @param startTime (required)
     * @param endTime (required)
     * @param type (optional)
     * @param asset (optional)
     * @param current (optional)
     * @param size (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUserDelegationHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Delegation History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#query-user-delegation-history">Query
     *     User Delegation History(For Master Account) (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserDelegationHistoryResponse> queryUserDelegationHistory(
            String email,
            Long startTime,
            Long endTime,
            OrderType type,
            String asset,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return assetApi.queryUserDelegationHistory(
                email, startTime, endTime, type, asset, current, size, recvWindow);
    }

    /**
     * Query User Universal Transfer History (USER_DATA) Query User Universal Transfer History
     * Weight(IP): 1 Security Type: USER_DATA Notes: - &#x60;fromSymbol&#x60; must be sent when type
     * are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - &#x60;toSymbol&#x60; must be
     * sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - Support query
     * within the last 6 months only - If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent,
     * return records of the last 7 days by default
     *
     * @param type (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current (optional)
     * @param size (optional)
     * @param fromSymbol (optional)
     * @param toSymbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUserUniversalTransferHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Universal Transfer History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#query-user-universal-transfer-history">Query
     *     User Universal Transfer History (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserUniversalTransferHistoryResponse> queryUserUniversalTransferHistory(
            String type,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            FromSymbol fromSymbol,
            ToSymbol toSymbol,
            Long recvWindow)
            throws ApiException {
        return assetApi.queryUserUniversalTransferHistory(
                type, startTime, endTime, current, size, fromSymbol, toSymbol, recvWindow);
    }

    /**
     * Query User Wallet Balance (USER_DATA) Query User Wallet Balance Weight(IP): 60 Security Type:
     * USER_DATA
     *
     * @param quoteAsset (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;QueryUserWalletBalanceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Wallet Balance </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#query-user-wallet-balance">Query
     *     User Wallet Balance (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserWalletBalanceResponse> queryUserWalletBalance(
            String quoteAsset, Long recvWindow) throws ApiException {
        return assetApi.queryUserWalletBalance(quoteAsset, recvWindow);
    }

    /**
     * Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA) Toggle BNB Burn On Spot Trade
     * And Margin Interest Weight(IP): 1 Security Type: USER_DATA Notes: - \&quot;spotBNBBurn\&quot;
     * and \&quot;interestBNBBurn\&quot; should be sent at least one.
     *
     * @param toggleBnbBurnOnSpotTradeAndMarginInterestRequest (optional)
     * @return ApiResponse&lt;ToggleBnbBurnOnSpotTradeAndMarginInterestResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Toggle BNB Burn On Spot Trade And Margin Interest </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#toggle-bnb-burn-on-spot-trade-and-margin-interest">Toggle
     *     BNB Burn On Spot Trade And Margin Interest (USER_DATA) Documentation</a>
     */
    public ApiResponse<ToggleBnbBurnOnSpotTradeAndMarginInterestResponse>
            toggleBnbBurnOnSpotTradeAndMarginInterest(
                    ToggleBnbBurnOnSpotTradeAndMarginInterestRequest
                            toggleBnbBurnOnSpotTradeAndMarginInterestRequest)
                    throws ApiException {
        return assetApi.toggleBnbBurnOnSpotTradeAndMarginInterest(
                toggleBnbBurnOnSpotTradeAndMarginInterestRequest);
    }

    /**
     * Trade Fee (USER_DATA) Fetch trade fee Weight(IP): 1 Security Type: USER_DATA
     *
     * @param symbol (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;TradeFeeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Trade Fee </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#trade-fee">Trade
     *     Fee (USER_DATA) Documentation</a>
     */
    public ApiResponse<TradeFeeResponse> tradeFee(String symbol, Long recvWindow)
            throws ApiException {
        return assetApi.tradeFee(symbol, recvWindow);
    }

    /**
     * User Asset (USER_DATA) Get user assets, just for positive data. Weight(IP): 5 Security Type:
     * USER_DATA Notes: - If asset is set, then return this asset, otherwise return all assets
     * positive. - If needBtcValuation is set, then return btcValudation.
     *
     * @param userAssetRequest (optional)
     * @return ApiResponse&lt;UserAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#user-asset">User
     *     Asset (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserAssetResponse> userAsset(UserAssetRequest userAssetRequest)
            throws ApiException {
        return assetApi.userAsset(userAssetRequest);
    }

    /**
     * User Universal Transfer (USER_DATA) User universal transfer Weight(UID): 900 Security Type:
     * USER_DATA Notes: - You need to enable Permits Universal Transfer option for the API Key that
     * requests this endpoint. - &#x60;fromSymbol&#x60; must be sent when type is
     * &#x60;ISOLATEDMARGIN_MARGIN&#x60; or &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. -
     * &#x60;toSymbol&#x60; must be sent when type is &#x60;MARGIN_ISOLATEDMARGIN&#x60; or
     * &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. - ENUM of transfer types: -
     * &#x60;MAIN_UMFUTURE&#x60;: Spot → USDⓈ-M Futures - &#x60;MAIN_CMFUTURE&#x60;: Spot → COIN-M
     * Futures - &#x60;MAIN_MARGIN&#x60;: Spot → Margin (cross) - &#x60;UMFUTURE_MAIN&#x60;: USDⓈ-M
     * Futures → Spot - &#x60;UMFUTURE_MARGIN&#x60;: USDⓈ-M Futures → Margin (cross) -
     * &#x60;CMFUTURE_MAIN&#x60;: COIN-M Futures → Spot - &#x60;CMFUTURE_MARGIN&#x60;: COIN-M
     * Futures → Margin (cross) - &#x60;MARGIN_MAIN&#x60;: Margin (cross) → Spot -
     * &#x60;MARGIN_UMFUTURE&#x60;: Margin (cross) → USDⓈ-M Futures - &#x60;MARGIN_CMFUTURE&#x60;:
     * Margin (cross) → COIN-M Futures - &#x60;ISOLATEDMARGIN_MARGIN&#x60;: Isolated margin → Margin
     * (cross) - &#x60;MARGIN_ISOLATEDMARGIN&#x60;: Margin (cross) → Isolated margin -
     * &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;: Isolated margin → Isolated margin -
     * &#x60;MAIN_FUNDING&#x60;: Spot → Funding - &#x60;FUNDING_MAIN&#x60;: Funding → Spot -
     * &#x60;FUNDING_UMFUTURE&#x60;: Funding → USDⓈ-M Futures - &#x60;UMFUTURE_FUNDING&#x60;: USDⓈ-M
     * Futures → Funding - &#x60;MARGIN_FUNDING&#x60;: Margin (cross) → Funding -
     * &#x60;FUNDING_MARGIN&#x60;: Funding → Margin (cross) - &#x60;FUNDING_CMFUTURE&#x60;: Funding
     * → COIN-M Futures - &#x60;CMFUTURE_FUNDING&#x60;: COIN-M Futures → Funding -
     * &#x60;MAIN_OPTION&#x60;: Spot → Options - &#x60;OPTION_MAIN&#x60;: Options → Spot -
     * &#x60;UMFUTURE_OPTION&#x60;: USDⓈ-M Futures → Options - &#x60;OPTION_UMFUTURE&#x60;: Options
     * → USDⓈ-M Futures - &#x60;MARGIN_OPTION&#x60;: Margin (cross) → Options -
     * &#x60;OPTION_MARGIN&#x60;: Options → Margin (cross) - &#x60;FUNDING_OPTION&#x60;: Funding →
     * Options - &#x60;OPTION_FUNDING&#x60;: Options → Funding - &#x60;MAIN_PORTFOLIO_MARGIN&#x60;:
     * Spot → Portfolio Margin - &#x60;PORTFOLIO_MARGIN_MAIN&#x60;: Portfolio Margin → Spot
     *
     * @param userUniversalTransferRequest (required)
     * @return ApiResponse&lt;UserUniversalTransferResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> User Universal Transfer </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/asset#user-universal-transfer">User
     *     Universal Transfer (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserUniversalTransferResponse> userUniversalTransfer(
            UserUniversalTransferRequest userUniversalTransferRequest) throws ApiException {
        return assetApi.userUniversalTransfer(userUniversalTransferRequest);
    }

    /**
     * All Coins&#39; Information (USER_DATA) Get information of coins (available for deposit and
     * withdraw) for user. Weight(IP): 10 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;AllCoinsInformationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> All Coins&#39; Information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#all-coins-information">All
     *     Coins&#39; Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllCoinsInformationResponse> allCoinsInformation(Long recvWindow)
            throws ApiException {
        return capitalApi.allCoinsInformation(recvWindow);
    }

    /**
     * Deposit Address(supporting network) (USER_DATA) Fetch deposit address with network.
     * Weight(IP): 10 Security Type: USER_DATA Notes: - If &#x60;network&#x60; is not send, return
     * with default network of the coin. - You can get &#x60;network&#x60; and &#x60;isDefault&#x60;
     * in &#x60;networkList&#x60; in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC
     * SHA256)&#x60;. - &#x60;amount&#x60; needs to be sent if using LIGHTNING network
     *
     * @param coin &#x60;coin&#x60; refers to the parent network address format that the address is
     *     using (required)
     * @param network (optional)
     * @param amount (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;DepositAddressResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit Address </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#deposit-address">Deposit
     *     Address(supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositAddressResponse> depositAddress(
            String coin, String network, Double amount, Long recvWindow) throws ApiException {
        return capitalApi.depositAddress(coin, network, amount, recvWindow);
    }

    /**
     * Deposit History (supporting network) (USER_DATA) Fetch deposit history. Weight(IP): 1
     * Security Type: USER_DATA Notes: - Please notice the default &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. - If both
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60;
     * and &#x60;endTime&#x60; must be less than 90 days.
     *
     * @param includeSource return &#x60;sourceAddress&#x60; field when set to &#x60;true&#x60;
     *     (optional)
     * @param coin (optional)
     * @param status 0: pending, 6: credited but cannot withdraw, 7: Wrong Deposit, 8: Waiting User
     *     confirm, 1: success (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param offset (optional)
     * @param limit (optional)
     * @param recvWindow (optional)
     * @param txId (optional)
     * @return ApiResponse&lt;DepositHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#deposit-history">Deposit
     *     History (supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositHistoryResponse> depositHistory(
            Boolean includeSource,
            String coin,
            Status status,
            Long startTime,
            Long endTime,
            Long offset,
            Long limit,
            Long recvWindow,
            String txId)
            throws ApiException {
        return capitalApi.depositHistory(
                includeSource, coin, status, startTime, endTime, offset, limit, recvWindow, txId);
    }

    /**
     * Fetch deposit address list with network (USER_DATA) Fetch deposit address list with network.
     * Weight(IP): 10 Security Type: USER_DATA
     *
     * @param coin Coin name (required)
     * @param network If network is not send, return with default network of the coin. You can get
     *     network and isDefault in networkList in the response of &#x60;Get
     *     /sapi/v1/capital/config/getall&#x60; (optional)
     * @return ApiResponse&lt;FetchDepositAddressListWithNetworkResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch deposit address list with network </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#fetch-deposit-address-list-with-network">Fetch
     *     deposit address list with network (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchDepositAddressListWithNetworkResponse>
            fetchDepositAddressListWithNetwork(String coin, String network) throws ApiException {
        return capitalApi.fetchDepositAddressListWithNetwork(coin, network);
    }

    /**
     * Fetch withdraw address list (USER_DATA) Fetch withdraw address list Weight(IP): 10 Security
     * Type: USER_DATA
     *
     * @return ApiResponse&lt;FetchWithdrawAddressListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch withdraw address list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#fetch-withdraw-address-list">Fetch
     *     withdraw address list (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchWithdrawAddressListResponse> fetchWithdrawAddressList()
            throws ApiException {
        return capitalApi.fetchWithdrawAddressList();
    }

    /**
     * Fetch withdraw quota (USER_DATA) Fetch withdraw quota Weight(IP): 10 Security Type: USER_DATA
     *
     * @return ApiResponse&lt;FetchWithdrawQuotaResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch withdraw quota </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#fetch-withdraw-quota">Fetch
     *     withdraw quota (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchWithdrawQuotaResponse> fetchWithdrawQuota() throws ApiException {
        return capitalApi.fetchWithdrawQuota();
    }

    /**
     * One click arrival deposit apply (for expired address deposit) (USER_DATA) Apply deposit
     * credit for expired address (One click arrival) Weight(IP): 1 Security Type: USER_DATA
     *
     * @param oneClickArrivalDepositApplyRequest (optional)
     * @return ApiResponse&lt;OneClickArrivalDepositApplyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> One click arrival deposit apply </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#one-click-arrival-deposit-apply">One
     *     click arrival deposit apply (for expired address deposit) (USER_DATA) Documentation</a>
     */
    public ApiResponse<OneClickArrivalDepositApplyResponse> oneClickArrivalDepositApply(
            OneClickArrivalDepositApplyRequest oneClickArrivalDepositApplyRequest)
            throws ApiException {
        return capitalApi.oneClickArrivalDepositApply(oneClickArrivalDepositApplyRequest);
    }

    /**
     * Withdraw (USER_DATA) Submit a withdraw request Weight(UID): 900 Security Type: USER_DATA
     * Notes: - If &#x60;network&#x60; not send, return with default network of the coin. - You can
     * get &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; of a coin in the
     * response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. - To check if
     * travel rule is required, by using &#x60;GET
     * /sapi/v1/localentity/questionnaire-requirements&#x60; and if it returns anything other than
     * &#x60;NIL&#x60; you will need update SAPI to &#x60;POST
     * /sapi/v1/localentity/withdraw/apply&#x60; else you can continue &#x60;POST
     * /sapi/v1/capital/withdraw/apply&#x60;. Please note that if you are required to comply to
     * travel rule please refer to the Travel Rule SAPI. - \&quot;For networks that do not support
     * memo/tag, submitting a withdrawal request with a non-empty &#x60;addressTag&#x60; will return
     * error &#x60;-4106 TAG_NOT_SUPPORTED_FOR_NETWORK&#x60;. Please omit the &#x60;addressTag&#x60;
     * field for such networks. You can check whether a network requires a tag via &#x60;GET
     * /sapi/v1/capital/config/getall&#x60;: If &#x60;withdrawTag&#x60; &#x3D; &#x60;true&#x60; →
     * memo/tag is required. If &#x60;withdrawTag&#x60; &#x3D; &#x60;false&#x60; → memo/tag is not
     * supported; omit &#x60;addressTag&#x60;.\&quot;
     *
     * @param withdrawRequest (required)
     * @return ApiResponse&lt;WithdrawResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdraw </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#withdraw">Withdraw
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<WithdrawResponse> withdraw(WithdrawRequest withdrawRequest)
            throws ApiException {
        return capitalApi.withdraw(withdrawRequest);
    }

    /**
     * Withdraw History (supporting network) (USER_DATA) Fetch withdraw history Weight(UID): 18000
     * (10 requests per second) Security Type: USER_DATA Notes: - &#x60;network&#x60; may not be in
     * the response for old withdraw. - Please notice the default &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. - If both
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between &#x60;startTime&#x60;and
     * &#x60;endTime&#x60;must be less than 90 days. - If &#x60;withdrawOrderId&#x60; is sent, time
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 7 days. - If
     * &#x60;withdrawOrderId&#x60; is sent, &#x60;startTime&#x60; and &#x60;endTime&#x60; are not
     * sent, will return last 7 days records by default. - Maximum support &#x60;idList&#x60; number
     * is 45.
     *
     * @param coin (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param status 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed)
     *     (optional)
     * @param offset Default: 0 (optional)
     * @param limit (optional)
     * @param idList id list returned in the response of POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, separated by &#x60;,&#x60; (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;WithdrawHistoryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdraw History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/capital#withdraw-history">Withdraw
     *     History (supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<WithdrawHistoryResponse> withdrawHistory(
            String coin,
            String withdrawOrderId,
            Long status,
            Long offset,
            Long limit,
            String idList,
            Long startTime,
            Long endTime,
            Long recvWindow)
            throws ApiException {
        return capitalApi.withdrawHistory(
                coin,
                withdrawOrderId,
                status,
                offset,
                limit,
                idList,
                startTime,
                endTime,
                recvWindow);
    }

    /**
     * Get Spot Delist Schedule (MARKET_DATA) Get symbols delist schedule for spot Weight(IP): 100
     * Security Type: MARKET_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetSymbolsDelistScheduleForSpotResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get symbols delist schedule for spot </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/others#get-symbols-delist-schedule-for-spot">Get
     *     Spot Delist Schedule (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetSymbolsDelistScheduleForSpotResponse> getSymbolsDelistScheduleForSpot(
            Long recvWindow) throws ApiException {
        return othersApi.getSymbolsDelistScheduleForSpot(recvWindow);
    }

    /**
     * System Status Fetch system status. Weight(IP): 1 Security Type: System
     *
     * @return ApiResponse&lt;SystemStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> System Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/others#system-status">System
     *     Status Documentation</a>
     */
    public ApiResponse<SystemStatusResponse> systemStatus() throws ApiException {
        return othersApi.systemStatus();
    }

    /**
     * Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA) Submit a
     * withdrawal request for brokers of local entities that required travel rule. Weight(UID): 600
     * Security Type: USER_DATA Notes: - If &#x60;network&#x60; not send, return with default
     * network of the coin, but if the address could not match default network, the withdraw will be
     * rejected. - You can get &#x60;network&#x60; in &#x60;networkList&#x60; of a coin in the
     * response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. - Questionnaire is
     * different for each local entity, please refer to the &#x60;Withdraw Questionnaire
     * Contents&#x60; page. - If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, please try to verify the format of the
     * questionnaire and use URL-encoded format.
     *
     * @param brokerWithdrawRequest (required)
     * @return ApiResponse&lt;BrokerWithdrawResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Broker Withdraw </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#broker-withdraw">Broker
     *     Withdraw (for brokers of local entities that require travel rule) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<BrokerWithdrawResponse> brokerWithdraw(
            BrokerWithdrawRequest brokerWithdrawRequest) throws ApiException {
        return travelRuleApi.brokerWithdraw(brokerWithdrawRequest);
    }

    /**
     * Check Questionnaire Requirements (for local entities that require travel rule) (supporting
     * network) (USER_DATA) This API will return user-specific Travel Rule questionnaire requirement
     * information in reference to the current API key. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;CheckQuestionnaireRequirementsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Questionnaire Requirements </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#check-questionnaire-requirements">Check
     *     Questionnaire Requirements (for local entities that require travel rule) (supporting
     *     network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckQuestionnaireRequirementsResponse> checkQuestionnaireRequirements(
            Long recvWindow) throws ApiException {
        return travelRuleApi.checkQuestionnaireRequirements(recvWindow);
    }

    /**
     * Deposit History Travel Rule (for local entities that required travel rule) (supporting
     * network) (USER_DATA) Fetch deposit history for local entities that required travel rule.
     * Weight(IP): 1 Security Type: USER_DATA Notes: - Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90
     * days. - If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 90 days. - Please, note that
     * due to network-specific characteristics, the returned source address may be inaccurate. If
     * multiple source addresses are found, only the first one will be returned.
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId Comma(,) separated list of transaction Ids. (optional)
     * @param tranId Comma(,) separated list of wallet tran Ids. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param pendingQuestionnaire true: Only return records that pending deposit questionnaire.
     *     false/not provided: return all records. (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param offset Default: 0 (optional)
     * @param limit (optional)
     * @return ApiResponse&lt;DepositHistoryTravelRuleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#deposit-history-travel-rule">Deposit
     *     History Travel Rule (for local entities that required travel rule) (supporting network)
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositHistoryTravelRuleResponse> depositHistoryTravelRule(
            String trId,
            String txId,
            String tranId,
            String network,
            String coin,
            Long travelRuleStatus,
            Boolean pendingQuestionnaire,
            Long startTime,
            Long endTime,
            Long offset,
            Long limit)
            throws ApiException {
        return travelRuleApi.depositHistoryTravelRule(
                trId,
                txId,
                tranId,
                network,
                coin,
                travelRuleStatus,
                pendingQuestionnaire,
                startTime,
                endTime,
                offset,
                limit);
    }

    /**
     * Deposit History V2 (for local entities that required travel rule) (supporting network)
     * (USER_DATA) Fetch deposit history for local entities that with required travel rule
     * information. Weight(IP): 1 Security Type: USER_DATA Notes: - Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90
     * days. - If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 90 days. - Please, note that
     * due to network-specific characteristics, the returned source address may be inaccurate. If
     * multiple source addresses are found, only the first one will be returned.
     *
     * @param depositId Comma(,) separated list of wallet tran Ids. (optional)
     * @param txId Comma(,) separated list of transaction Ids. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param retrieveQuestionnaire true: return &#x60;questionnaire&#x60; within response.
     *     (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param offset (optional)
     * @param limit (optional)
     * @return ApiResponse&lt;DepositHistoryV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Deposit History V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#deposit-history-v2">Deposit
     *     History V2 (for local entities that required travel rule) (supporting network)
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositHistoryV2Response> depositHistoryV2(
            Long depositId,
            String txId,
            String network,
            String coin,
            Boolean retrieveQuestionnaire,
            Long startTime,
            Long endTime,
            Long offset,
            Long limit)
            throws ApiException {
        return travelRuleApi.depositHistoryV2(
                depositId,
                txId,
                network,
                coin,
                retrieveQuestionnaire,
                startTime,
                endTime,
                offset,
                limit);
    }

    /**
     * Fetch address verification list (USER_DATA) Fetch address verification list for user to check
     * on status and other details for the addresses stored in Address Book. Weight(IP): 1 Security
     * Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FetchAddressVerificationListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch address verification list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#fetch-address-verification-list">Fetch
     *     address verification list (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchAddressVerificationListResponse> fetchAddressVerificationList(
            Long recvWindow) throws ApiException {
        return travelRuleApi.fetchAddressVerificationList(recvWindow);
    }

    /**
     * Get Country List (USER_DATA) Query the active country list for travel rule questionnaires.
     * Currently, only supports AU entity. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetCountryListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Country list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#get-country-list">Get
     *     Country List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetCountryListResponse> getCountryList(Long recvWindow) throws ApiException {
        return travelRuleApi.getCountryList(recvWindow);
    }

    /**
     * Get Region List (USER_DATA) Query the active region/city list for a given country. Currently,
     * only supports AU entity. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param countryCode ISO 2-digit country code (from Country List API). (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetRegionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Region list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#get-region-list">Get
     *     Region List (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetRegionListResponse> getRegionList(String countryCode, Long recvWindow)
            throws ApiException {
        return travelRuleApi.getRegionList(countryCode, recvWindow);
    }

    /**
     * Submit Deposit Questionnaire Broker (For local entities that require travel rule) (supporting
     * network) (USER_DATA) Submit questionnaire for brokers of local entities that require travel
     * rule. The questionnaire is only applies to transactions from un-hosted wallets or VASPs that
     * are not yet onboarded with GTR. Weight(UID): 600 Security Type: USER_DATA Notes: -
     * Questionnaire is different for each local entity, please refer to &#x60;Deposit Questionnaire
     * Content&#x60; page. - If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, please try to verify the format of the
     * questionnaire and use URL-encoded format.
     *
     * @param submitDepositQuestionnaireRequest (required)
     * @return ApiResponse&lt;SubmitDepositQuestionnaireResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Submit Deposit Questionnaire </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#submit-deposit-questionnaire">Submit
     *     Deposit Questionnaire Broker (For local entities that require travel rule) (supporting
     *     network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubmitDepositQuestionnaireResponse> submitDepositQuestionnaire(
            SubmitDepositQuestionnaireRequest submitDepositQuestionnaireRequest)
            throws ApiException {
        return travelRuleApi.submitDepositQuestionnaire(submitDepositQuestionnaireRequest);
    }

    /**
     * Submit Deposit Questionnaire (For local entities that require travel rule) (supporting
     * network) (USER_DATA) Submit questionnaire for local entities that require travel rule. The
     * questionnaire is only applies to transactions from unhosted wallets or VASPs that are not yet
     * onboarded with GTR. Weight(UID): 600 Security Type: USER_DATA Notes: - Questionnaire is
     * different for each local entity, please refer to &#x60;Deposit Questionnaire Content&#x60;
     * page. - If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, please try to verify the format of the
     * questionnaire and use URL-encoded format.
     *
     * @param submitDepositQuestionnaireTravelRuleRequest (required)
     * @return ApiResponse&lt;SubmitDepositQuestionnaireTravelRuleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Submit Deposit Questionnaire </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#submit-deposit-questionnaire-travel-rule">Submit
     *     Deposit Questionnaire (For local entities that require travel rule) (supporting network)
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubmitDepositQuestionnaireTravelRuleResponse>
            submitDepositQuestionnaireTravelRule(
                    SubmitDepositQuestionnaireTravelRuleRequest
                            submitDepositQuestionnaireTravelRuleRequest)
                    throws ApiException {
        return travelRuleApi.submitDepositQuestionnaireTravelRule(
                submitDepositQuestionnaireTravelRuleRequest);
    }

    /**
     * Submit Deposit Questionnaire V2 (For local entities that require travel rule) (supporting
     * network) (USER_DATA) Submit questionnaire for local entities that require travel rule. The
     * questionnaire is only applies to transactions from unhosted wallets or VASPs that are not yet
     * onboarded with GTR. Weight(UID): 600 Security Type: USER_DATA Notes: - Questionnaire is
     * different for each local entity, please refer to &#x60;Deposit Questionnaire Content&#x60;
     * page. - If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, please try to verify the format of the
     * questionnaire and use URL-encoded format.
     *
     * @param submitDepositQuestionnaireV2Request (required)
     * @return ApiResponse&lt;SubmitDepositQuestionnaireV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Submit Deposit Questionnaire V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#submit-deposit-questionnaire-v2">Submit
     *     Deposit Questionnaire V2 (For local entities that require travel rule) (supporting
     *     network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubmitDepositQuestionnaireV2Response> submitDepositQuestionnaireV2(
            SubmitDepositQuestionnaireV2Request submitDepositQuestionnaireV2Request)
            throws ApiException {
        return travelRuleApi.submitDepositQuestionnaireV2(submitDepositQuestionnaireV2Request);
    }

    /**
     * VASP list (for local entities that require travel rule) (supporting network) (USER_DATA)
     * Fetch the VASP list for local entities. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;VaspListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> VASP list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#vasp-list">VASP
     *     list (for local entities that require travel rule) (supporting network) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<VaspListResponse> vaspList(Long recvWindow) throws ApiException {
        return travelRuleApi.vaspList(recvWindow);
    }

    /**
     * Withdraw History Travel Rule (supporting network) (USER_DATA) Fetch withdraw history for
     * local entities that required travel rule. Weight(IP): 1 Security Type: USER_DATA Notes: -
     * &#x60;network&#x60; may not be in the response for old withdraw. - Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90
     * days. - If both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between
     * &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less than 90 days.
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId Comma(,) separated list of transaction Ids. (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param offset (optional)
     * @param limit (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;WithdrawHistoryV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdraw History </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#withdraw-history-v1">Withdraw
     *     History Travel Rule (supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<WithdrawHistoryV1Response> withdrawHistoryV1(
            String trId,
            String txId,
            String withdrawOrderId,
            String network,
            String coin,
            Long travelRuleStatus,
            Long offset,
            Long limit,
            Long startTime,
            Long endTime,
            Long recvWindow)
            throws ApiException {
        return travelRuleApi.withdrawHistoryV1(
                trId,
                txId,
                withdrawOrderId,
                network,
                coin,
                travelRuleStatus,
                offset,
                limit,
                startTime,
                endTime,
                recvWindow);
    }

    /**
     * Withdraw History V2 (for local entities that require travel rule) (supporting network)
     * (USER_DATA) Fetch withdraw history for local entities that required travel rule. Weight(IP):
     * 1 Security Type: USER_DATA Notes: - &#x60;network&#x60; may not be in the response for old
     * withdraw. - Withdrawal made through /sapi/v1/capital/withdraw/apply may not be in the
     * response. - Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make
     * sure that time interval is within 0-90 days. - If both &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;are sent, time between &#x60;startTime&#x60;and &#x60;endTime&#x60;must be
     * less than 90 days. - If withdrawOrderId is sent, time between startTime and endTime must be
     * less than 7 days. - If withdrawOrderId is sent, startTime and endTime are not sent, will
     * return last 7 days records by default. - Maximum support trId,txId number is 45. -
     * WithdrawOrderId only support 1. - If responsible does not include withdrawalStatus, please
     * input trId or txId retrieve the data.
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId Comma(,) separated list of transaction Ids. (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param offset (optional)
     * @param limit (optional)
     * @param startTime Default: 90 days from current timestamp (optional)
     * @param endTime Default: present timestamp (optional)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;WithdrawHistoryV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdraw History V2 </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#withdraw-history-v2">Withdraw
     *     History V2 (for local entities that require travel rule) (supporting network) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<WithdrawHistoryV2Response> withdrawHistoryV2(
            String trId,
            String txId,
            String withdrawOrderId,
            String network,
            String coin,
            Long travelRuleStatus,
            Long offset,
            Long limit,
            Long startTime,
            Long endTime,
            Long recvWindow)
            throws ApiException {
        return travelRuleApi.withdrawHistoryV2(
                trId,
                txId,
                withdrawOrderId,
                network,
                coin,
                travelRuleStatus,
                offset,
                limit,
                startTime,
                endTime,
                recvWindow);
    }

    /**
     * Withdraw Travel Rule (USER_DATA) Submit a withdrawal request for local entities that required
     * travel rule. Weight(UID): 600 Security Type: USER_DATA Notes: - If &#x60;network&#x60; not
     * send, return with default network of the coin, but if the address could not match default
     * network, the withdraw will be rejected. - You can get &#x60;network&#x60; and
     * &#x60;isDefault&#x60; in &#x60;networkList&#x60; of a coin in the response of &#x60;Get
     * /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. - Questionnaire is different for each
     * local entity, please refer to the &#x60;Withdraw Questionnaire Contents&#x60; page. - If
     * getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must
     * not be blank&#x60;, please try to verify the format of the questionnaire and use URL-encoded
     * format.
     *
     * @param withdrawTravelRuleRequest (required)
     * @return ApiResponse&lt;WithdrawTravelRuleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Withdraw </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/core-trading-wallet/api/rest-api/travel-rule#withdraw-travel-rule">Withdraw
     *     Travel Rule (USER_DATA) Documentation</a>
     */
    public ApiResponse<WithdrawTravelRuleResponse> withdrawTravelRule(
            WithdrawTravelRuleRequest withdrawTravelRuleRequest) throws ApiException {
        return travelRuleApi.withdrawTravelRule(withdrawTravelRuleRequest);
    }
}
