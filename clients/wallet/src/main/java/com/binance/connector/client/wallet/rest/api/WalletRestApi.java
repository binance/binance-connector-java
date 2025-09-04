package com.binance.connector.client.wallet.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.model.AccountApiTradingStatusResponse;
import com.binance.connector.client.wallet.rest.model.AccountInfoResponse;
import com.binance.connector.client.wallet.rest.model.AccountStatusResponse;
import com.binance.connector.client.wallet.rest.model.AllCoinsInformationResponse;
import com.binance.connector.client.wallet.rest.model.AssetDetailResponse;
import com.binance.connector.client.wallet.rest.model.AssetDividendRecordResponse;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawRequest;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawResponse;
import com.binance.connector.client.wallet.rest.model.DailyAccountSnapshotResponse;
import com.binance.connector.client.wallet.rest.model.DepositAddressResponse;
import com.binance.connector.client.wallet.rest.model.DepositHistoryResponse;
import com.binance.connector.client.wallet.rest.model.DepositHistoryTravelRuleResponse;
import com.binance.connector.client.wallet.rest.model.DisableFastWithdrawSwitchRequest;
import com.binance.connector.client.wallet.rest.model.DustTransferRequest;
import com.binance.connector.client.wallet.rest.model.DustTransferResponse;
import com.binance.connector.client.wallet.rest.model.DustlogResponse;
import com.binance.connector.client.wallet.rest.model.EnableFastWithdrawSwitchRequest;
import com.binance.connector.client.wallet.rest.model.FetchAddressVerificationListResponse;
import com.binance.connector.client.wallet.rest.model.FetchDepositAddressListWithNetworkResponse;
import com.binance.connector.client.wallet.rest.model.FetchWithdrawAddressListResponse;
import com.binance.connector.client.wallet.rest.model.FetchWithdrawQuotaResponse;
import com.binance.connector.client.wallet.rest.model.FundingWalletRequest;
import com.binance.connector.client.wallet.rest.model.FundingWalletResponse;
import com.binance.connector.client.wallet.rest.model.GetApiKeyPermissionResponse;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbRequest;
import com.binance.connector.client.wallet.rest.model.GetAssetsThatCanBeConvertedIntoBnbResponse;
import com.binance.connector.client.wallet.rest.model.GetCloudMiningPaymentAndRefundHistoryResponse;
import com.binance.connector.client.wallet.rest.model.GetOpenSymbolListResponse;
import com.binance.connector.client.wallet.rest.model.GetSymbolsDelistScheduleForSpotResponse;
import com.binance.connector.client.wallet.rest.model.OnboardedVaspListResponse;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyRequest;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyResponse;
import com.binance.connector.client.wallet.rest.model.QueryUserDelegationHistoryResponse;
import com.binance.connector.client.wallet.rest.model.QueryUserUniversalTransferHistoryResponse;
import com.binance.connector.client.wallet.rest.model.QueryUserWalletBalanceResponse;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireResponse;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleResponse;
import com.binance.connector.client.wallet.rest.model.SystemStatusResponse;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestRequest;
import com.binance.connector.client.wallet.rest.model.ToggleBnbBurnOnSpotTradeAndMarginInterestResponse;
import com.binance.connector.client.wallet.rest.model.TradeFeeResponse;
import com.binance.connector.client.wallet.rest.model.UserAssetRequest;
import com.binance.connector.client.wallet.rest.model.UserAssetResponse;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferRequest;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferResponse;
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
     * Account API Trading Status (USER_DATA) Fetch account api trading status detail. Weight: 1
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
     *     href="https://developers.binance.com/docs/wallet/account/Account-API-Trading-Status">Account
     *     API Trading Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountApiTradingStatusResponse> accountApiTradingStatus(Long recvWindow)
            throws ApiException {
        return accountApi.accountApiTradingStatus(recvWindow);
    }

    /**
     * Account info (USER_DATA) Fetch account info detail. Weight: 1
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
     * @see <a href="https://developers.binance.com/docs/wallet/account/Account-info">Account info
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountInfoResponse> accountInfo(Long recvWindow) throws ApiException {
        return accountApi.accountInfo(recvWindow);
    }

    /**
     * Account Status (USER_DATA) Fetch account status detail. Weight: 1
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
     * @see <a href="https://developers.binance.com/docs/wallet/account/Account-Status">Account
     *     Status (USER_DATA) Documentation</a>
     */
    public ApiResponse<AccountStatusResponse> accountStatus(Long recvWindow) throws ApiException {
        return accountApi.accountStatus(recvWindow);
    }

    /**
     * Daily Account Snapshot (USER_DATA) Daily account snapshot * The query time period must be
     * less then 30 days * Support query within the last one month only * If startTimeand endTime
     * not sent, return records of the last 7 days by default Weight: 2400
     *
     * @param type (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit min 7, max 30, default 7 (optional)
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
     *     href="https://developers.binance.com/docs/wallet/account/daily-account-snapshoot">Daily
     *     Account Snapshot (USER_DATA) Documentation</a>
     */
    public ApiResponse<DailyAccountSnapshotResponse> dailyAccountSnapshot(
            String type, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return accountApi.dailyAccountSnapshot(type, startTime, endTime, limit, recvWindow);
    }

    /**
     * Disable Fast Withdraw Switch (USER_DATA) Weight: 1
     *
     * @param disableFastWithdrawSwitchRequest (required)
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
     *     href="https://developers.binance.com/docs/wallet/account/Disable-Fast-Withdraw-Switch">Disable
     *     Fast Withdraw Switch (USER_DATA) Documentation</a>
     */
    public void disableFastWithdrawSwitch(
            DisableFastWithdrawSwitchRequest disableFastWithdrawSwitchRequest) throws ApiException {
        accountApi.disableFastWithdrawSwitch(disableFastWithdrawSwitchRequest);
    }

    /**
     * Enable Fast Withdraw Switch (USER_DATA) Enable Fast Withdraw Switch (USER_DATA) * This
     * request will enable fastwithdraw switch under your account. &lt;br&gt;&lt;/br&gt; * When Fast
     * Withdraw Switch is on, transferring funds to a Binance account will be done instantly. There
     * is no on-chain transaction, no transaction ID and no withdrawal fee. Weight: 1
     *
     * @param enableFastWithdrawSwitchRequest (required)
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
     *     href="https://developers.binance.com/docs/wallet/account/Enable-Fast-Withdraw-Switch">Enable
     *     Fast Withdraw Switch (USER_DATA) Documentation</a>
     */
    public void enableFastWithdrawSwitch(
            EnableFastWithdrawSwitchRequest enableFastWithdrawSwitchRequest) throws ApiException {
        accountApi.enableFastWithdrawSwitch(enableFastWithdrawSwitchRequest);
    }

    /**
     * Get API Key Permission (USER_DATA) Get API Key Permission Weight: 1
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
     * @see <a href="https://developers.binance.com/docs/wallet/account/api-key-permission">Get API
     *     Key Permission (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetApiKeyPermissionResponse> getApiKeyPermission(Long recvWindow)
            throws ApiException {
        return accountApi.getApiKeyPermission(recvWindow);
    }

    /**
     * Asset Detail (USER_DATA) Fetch details of assets supported on Binance. * Please get network
     * and other deposit or withdraw details from &#x60;&#x60;GET
     * /sapi/v1/capital/config/getall&#x60;&#x60;. Weight: 1
     *
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/Asset-Detail">Asset Detail
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<AssetDetailResponse> assetDetail(Long recvWindow) throws ApiException {
        return assetApi.assetDetail(recvWindow);
    }

    /**
     * Asset Dividend Record (USER_DATA) Query asset dividend record. * There cannot be more than
     * 180 days between parameter &#x60;startTime&#x60; and &#x60;endTime&#x60;. Weight: 10
     *
     * @param asset (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param limit min 7, max 30, default 7 (optional)
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/assets-divided-record">Asset
     *     Dividend Record (USER_DATA) Documentation</a>
     */
    public ApiResponse<AssetDividendRecordResponse> assetDividendRecord(
            String asset, Long startTime, Long endTime, Long limit, Long recvWindow)
            throws ApiException {
        return assetApi.assetDividendRecord(asset, startTime, endTime, limit, recvWindow);
    }

    /**
     * Dust Transfer (USER_DATA) Convert dust assets to BNB. * You need to open&#x60;Enable Spot
     * &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint. Weight:
     * 10
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/Dust-Transfer">Dust Transfer
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<DustTransferResponse> dustTransfer(DustTransferRequest dustTransferRequest)
            throws ApiException {
        return assetApi.dustTransfer(dustTransferRequest);
    }

    /**
     * DustLog(USER_DATA) Dustlog * Only return last 100 records * Only return records after
     * 2020/12/01 Weight: 1
     *
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/dust-log">DustLog(USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<DustlogResponse> dustlog(Long startTime, Long endTime, Long recvWindow)
            throws ApiException {
        return assetApi.dustlog(startTime, endTime, recvWindow);
    }

    /**
     * Funding Wallet (USER_DATA) Query Funding Wallet * Currently supports querying the following
     * business assets：Binance Pay, Binance Card, Binance Gift Card, Stock Token Weight: 1
     *
     * @param fundingWalletRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/Funding-Wallet">Funding Wallet
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<FundingWalletResponse> fundingWallet(
            FundingWalletRequest fundingWalletRequest) throws ApiException {
        return assetApi.fundingWallet(fundingWalletRequest);
    }

    /**
     * Get Assets That Can Be Converted Into BNB (USER_DATA) Get Assets That Can Be Converted Into
     * BNB Weight: 1
     *
     * @param getAssetsThatCanBeConvertedIntoBnbRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/assets-can-convert-bnb">Get
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
     * refund history * Just return the SUCCESS records of payment and refund. * For response, type
     * &#x3D; 248 means payment, type &#x3D; 249 means refund, status &#x3D;S means SUCCESS. Weight:
     * 600
     *
     * @param startTime (required)
     * @param endTime (required)
     * @param tranId The transaction id (optional)
     * @param clientTranId The unique flag (optional)
     * @param asset (optional)
     * @param current current page, default 1, the min value is 1 (optional)
     * @param size page size, default 10, the max value is 100 (optional)
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
     *     href="https://developers.binance.com/docs/wallet/asset/cloud-mining-payment-and-refund-history">Get
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
     * for trading in the market. Weight: 100
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/open-symbol-list">Get Open
     *     Symbol List (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetOpenSymbolListResponse> getOpenSymbolList() throws ApiException {
        return assetApi.getOpenSymbolList();
    }

    /**
     * Query User Delegation History(For Master Account)(USER_DATA) Query User Delegation History *
     * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests
     * this endpoint Weight: 60
     *
     * @param email (required)
     * @param startTime (required)
     * @param endTime (required)
     * @param type Delegate/Undelegate (optional)
     * @param asset (optional)
     * @param current current page, default 1, the min value is 1 (optional)
     * @param size page size, default 10, the max value is 100 (optional)
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/query-user-delegation">Query
     *     User Delegation History(For Master Account)(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserDelegationHistoryResponse> queryUserDelegationHistory(
            String email,
            Long startTime,
            Long endTime,
            String type,
            String asset,
            Long current,
            Long size,
            Long recvWindow)
            throws ApiException {
        return assetApi.queryUserDelegationHistory(
                email, startTime, endTime, type, asset, current, size, recvWindow);
    }

    /**
     * Query User Universal Transfer History(USER_DATA) Query User Universal Transfer History *
     * &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and
     * ISOLATEDMARGIN_ISOLATEDMARGIN * &#x60;toSymbol&#x60; must be sent when type are
     * MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN * Support query within the last 6
     * months only * If &#x60;startTime&#x60;and &#x60;endTime&#x60; not sent, return records of the
     * last 7 days by default Weight: 1
     *
     * @param type (required)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param current current page, default 1, the min value is 1 (optional)
     * @param size page size, default 10, the max value is 100 (optional)
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
     *     href="https://developers.binance.com/docs/wallet/asset/query-user-universal-transfer">Query
     *     User Universal Transfer History(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserUniversalTransferHistoryResponse> queryUserUniversalTransferHistory(
            String type,
            Long startTime,
            Long endTime,
            Long current,
            Long size,
            String fromSymbol,
            String toSymbol,
            Long recvWindow)
            throws ApiException {
        return assetApi.queryUserUniversalTransferHistory(
                type, startTime, endTime, current, size, fromSymbol, toSymbol, recvWindow);
    }

    /**
     * Query User Wallet Balance (USER_DATA) Query User Wallet Balance * You need to open Permits
     * Universal Transfer permission for the API Key which requests this endpoint. Weight: 60
     *
     * @param quoteAsset &#x60;USDT&#x60;, &#x60;ETH&#x60;, &#x60;USDC&#x60;, &#x60;BNB&#x60;, etc.
     *     default &#x60;BTC&#x60; (optional)
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
     *     href="https://developers.binance.com/docs/wallet/asset/Query-User-Wallet-Balance">Query
     *     User Wallet Balance (USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryUserWalletBalanceResponse> queryUserWalletBalance(
            String quoteAsset, Long recvWindow) throws ApiException {
        return assetApi.queryUserWalletBalance(quoteAsset, recvWindow);
    }

    /**
     * Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA) Toggle BNB Burn On Spot Trade
     * And Margin Interest * \&quot;spotBNBBurn\&quot; and \&quot;interestBNBBurn\&quot; should be
     * sent at least one. Weight: 1(IP)
     *
     * @param toggleBnbBurnOnSpotTradeAndMarginInterestRequest (required)
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
     *     href="https://developers.binance.com/docs/wallet/asset/Toggle-BNB-Burn-On-Spot-Trade-And-Margin-Interest">Toggle
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
     * Trade Fee (USER_DATA) Fetch trade fee Weight: 1
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/Trade-Fee">Trade Fee
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<TradeFeeResponse> tradeFee(String symbol, Long recvWindow)
            throws ApiException {
        return assetApi.tradeFee(symbol, recvWindow);
    }

    /**
     * User Asset (USER_DATA) Get user assets, just for positive data. * If asset is set, then
     * return this asset, otherwise return all assets positive. * If needBtcValuation is set, then
     * return btcValudation. Weight: 5
     *
     * @param userAssetRequest (required)
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/user-assets">User Asset
     *     (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserAssetResponse> userAsset(UserAssetRequest userAssetRequest)
            throws ApiException {
        return assetApi.userAsset(userAssetRequest);
    }

    /**
     * User Universal Transfer (USER_DATA) user universal transfer * &#x60;fromSymbol&#x60; must be
     * sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN *
     * &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and
     * ISOLATEDMARGIN_ISOLATEDMARGIN * ENUM of transfer types: * MAIN_UMFUTURE Spot account transfer
     * to USDⓈ-M Futures account * MAIN_CMFUTURE Spot account transfer to COIN-M Futures account *
     * MAIN_MARGIN Spot account transfer to Margin（cross）account * UMFUTURE_MAIN USDⓈ-M Futures
     * account transfer to Spot account * UMFUTURE_MARGIN USDⓈ-M Futures account transfer to
     * Margin（cross）account * CMFUTURE_MAIN COIN-M Futures account transfer to Spot account *
     * CMFUTURE_MARGIN COIN-M Futures account transfer to Margin(cross) account * MARGIN_MAIN
     * Margin（cross）account transfer to Spot account * MARGIN_UMFUTURE Margin（cross）account transfer
     * to USDⓈ-M Futures * MARGIN_CMFUTURE Margin（cross）account transfer to COIN-M Futures *
     * ISOLATEDMARGIN_MARGIN Isolated margin account transfer to Margin(cross) account *
     * MARGIN_ISOLATEDMARGIN Margin(cross) account transfer to Isolated margin account *
     * ISOLATEDMARGIN_ISOLATEDMARGIN Isolated margin account transfer to Isolated margin account *
     * MAIN_FUNDING Spot account transfer to Funding account * FUNDING_MAIN Funding account transfer
     * to Spot account * FUNDING_UMFUTURE Funding account transfer to UMFUTURE account *
     * UMFUTURE_FUNDING UMFUTURE account transfer to Funding account * MARGIN_FUNDING MARGIN account
     * transfer to Funding account * FUNDING_MARGIN Funding account transfer to Margin account *
     * FUNDING_CMFUTURE Funding account transfer to CMFUTURE account * CMFUTURE_FUNDING CMFUTURE
     * account transfer to Funding account * MAIN_OPTION Spot account transfer to Options account *
     * OPTION_MAIN Options account transfer to Spot account * UMFUTURE_OPTION USDⓈ-M Futures account
     * transfer to Options account * OPTION_UMFUTURE Options account transfer to USDⓈ-M Futures
     * account * MARGIN_OPTION Margin（cross）account transfer to Options account * OPTION_MARGIN
     * Options account transfer to Margin（cross）account * FUNDING_OPTION Funding account transfer to
     * Options account * OPTION_FUNDING Options account transfer to Funding account *
     * MAIN_PORTFOLIO_MARGIN Spot account transfer to Portfolio Margin account *
     * PORTFOLIO_MARGIN_MAIN Portfolio Margin account transfer to Spot account Weight: 900
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
     * @see <a href="https://developers.binance.com/docs/wallet/asset/User-Universal-Transfer">User
     *     Universal Transfer (USER_DATA) Documentation</a>
     */
    public ApiResponse<UserUniversalTransferResponse> userUniversalTransfer(
            UserUniversalTransferRequest userUniversalTransferRequest) throws ApiException {
        return assetApi.userUniversalTransfer(userUniversalTransferRequest);
    }

    /**
     * All Coins&#39; Information (USER_DATA) Get information of coins (available for deposit and
     * withdraw) for user. Weight: 10
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
     * @see <a href="https://developers.binance.com/docs/wallet/capital/all-coins-info">All
     *     Coins&#39; Information (USER_DATA) Documentation</a>
     */
    public ApiResponse<AllCoinsInformationResponse> allCoinsInformation(Long recvWindow)
            throws ApiException {
        return capitalApi.allCoinsInformation(recvWindow);
    }

    /**
     * Deposit Address(supporting network) (USER_DATA) Fetch deposit address with network. * If
     * &#x60;network&#x60; is not send, return with default network of the coin. * You can get
     * &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; in the response of
     * &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. * &#x60;amount&#x60; needs to
     * be sent if using LIGHTNING network Weight: 10
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
     * @see <a href="https://developers.binance.com/docs/wallet/capital/deposite-address">Deposit
     *     Address(supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositAddressResponse> depositAddress(
            String coin, String network, Double amount, Long recvWindow) throws ApiException {
        return capitalApi.depositAddress(coin, network, amount, recvWindow);
    }

    /**
     * Deposit History (supporting network) (USER_DATA) Fetch deposit history. * Please notice the
     * default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is
     * within 0-90 days. * If both &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; are sent, time between &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; must be less than 90 days. Weight: 1
     *
     * @param includeSource Default: &#x60;false&#x60;, return &#x60;sourceAddress&#x60;field when
     *     set to &#x60;true&#x60; (optional)
     * @param coin (optional)
     * @param status 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed)
     *     (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param offset Default: 0 (optional)
     * @param limit min 7, max 30, default 7 (optional)
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
     * @see <a href="https://developers.binance.com/docs/wallet/capital/deposite-history">Deposit
     *     History (supporting network) (USER_DATA) Documentation</a>
     */
    public ApiResponse<DepositHistoryResponse> depositHistory(
            Boolean includeSource,
            String coin,
            Long status,
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
     * Fetch deposit address list with network(USER_DATA) Fetch deposit address list with network. *
     * If network is not send, return with default network of the coin. * You can get network and
     * isDefault in networkList in the response of &#x60;Get /sapi/v1/capital/config/getall&#x60;.
     * Weight: 10
     *
     * @param coin &#x60;coin&#x60; refers to the parent network address format that the address is
     *     using (required)
     * @param network (optional)
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
     *     href="https://developers.binance.com/docs/wallet/capital/Fetch-deposit-address-list-with-network">Fetch
     *     deposit address list with network(USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchDepositAddressListWithNetworkResponse>
            fetchDepositAddressListWithNetwork(String coin, String network) throws ApiException {
        return capitalApi.fetchDepositAddressListWithNetwork(coin, network);
    }

    /**
     * Fetch withdraw address list (USER_DATA) Fetch withdraw address list Weight: 10
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
     *     href="https://developers.binance.com/docs/wallet/capital/fetch-withdraw-address">Fetch
     *     withdraw address list (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchWithdrawAddressListResponse> fetchWithdrawAddressList()
            throws ApiException {
        return capitalApi.fetchWithdrawAddressList();
    }

    /**
     * Fetch withdraw quota (USER_DATA) Fetch withdraw quota Weight: 10
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
     * @see <a href="https://developers.binance.com/docs/wallet/capital/Fetch-withdraw-quota">Fetch
     *     withdraw quota (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchWithdrawQuotaResponse> fetchWithdrawQuota() throws ApiException {
        return capitalApi.fetchWithdrawQuota();
    }

    /**
     * One click arrival deposit apply (for expired address deposit) (USER_DATA) Apply deposit
     * credit for expired address (One click arrival) * Params need to be in the POST body Weight: 1
     *
     * @param oneClickArrivalDepositApplyRequest (required)
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
     *     href="https://developers.binance.com/docs/wallet/capital/one-click-arrival-deposite-apply">One
     *     click arrival deposit apply (for expired address deposit) (USER_DATA) Documentation</a>
     */
    public ApiResponse<OneClickArrivalDepositApplyResponse> oneClickArrivalDepositApply(
            OneClickArrivalDepositApplyRequest oneClickArrivalDepositApplyRequest)
            throws ApiException {
        return capitalApi.oneClickArrivalDepositApply(oneClickArrivalDepositApplyRequest);
    }

    /**
     * Withdraw(USER_DATA) Submit a withdraw request. * If &#x60;network&#x60; not send, return with
     * default network of the coin. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in
     * &#x60;networkList&#x60; of a coin in the response of &#x60;Get /sapi/v1/capital/config/getall
     * (HMAC SHA256)&#x60;. Weight: 900
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
     *     href="https://developers.binance.com/docs/wallet/capital/Withdraw">Withdraw(USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<WithdrawResponse> withdraw(WithdrawRequest withdrawRequest)
            throws ApiException {
        return capitalApi.withdraw(withdrawRequest);
    }

    /**
     * Withdraw History (supporting network) (USER_DATA) Fetch withdraw history. *
     * &#x60;network&#x60; may not be in the response for old withdraw. * Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90
     * days. * If both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between
     * &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less than 90 days. * If
     * &#x60;withdrawOrderId&#x60; is sent, time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; must be less than 7 days. * If &#x60;withdrawOrderId&#x60; is sent,
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, will return last 7 days records
     * by default. * Maximum support &#x60;idList&#x60; number is 45. Weight: 18000 Request limit:
     * 10 requests per second
     *
     * @param coin (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param status 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed)
     *     (optional)
     * @param offset Default: 0 (optional)
     * @param limit min 7, max 30, default 7 (optional)
     * @param idList id list returned in the response of POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, separated by &#x60;,&#x60; (optional)
     * @param startTime (optional)
     * @param endTime (optional)
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
     * @see <a href="https://developers.binance.com/docs/wallet/capital/Withdraw-History">Withdraw
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
     * Get symbols delist schedule for spot (MARKET_DATA) Get symbols delist schedule for spot
     * Weight: 100
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
     * @see <a href="https://developers.binance.com/docs/wallet/others/delist-schedule">Get symbols
     *     delist schedule for spot (MARKET_DATA) Documentation</a>
     */
    public ApiResponse<GetSymbolsDelistScheduleForSpotResponse> getSymbolsDelistScheduleForSpot(
            Long recvWindow) throws ApiException {
        return othersApi.getSymbolsDelistScheduleForSpot(recvWindow);
    }

    /**
     * System Status (System) Fetch system status. Weight: 1
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
     * @see <a href="https://developers.binance.com/docs/wallet/others/System-Status">System Status
     *     (System) Documentation</a>
     */
    public ApiResponse<SystemStatusResponse> systemStatus() throws ApiException {
        return othersApi.systemStatus();
    }

    /**
     * Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA) Submit a
     * withdrawal request for brokers of local entities that required travel rule. * If
     * &#x60;network&#x60; not send, return with default network of the coin, but if the address
     * could not match default network, the withdraw will be rejected. * You can get
     * &#x60;network&#x60; in &#x60;networkList&#x60; of a coin in the response * Questionnaire is
     * different for each local entity, please refer to * If getting error like &#x60;Questionnaire
     * format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;, Weight: 600
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
     * @see <a href="https://developers.binance.com/docs/wallet/travel-rule/Broker-Withdraw">Broker
     *     Withdraw (for brokers of local entities that require travel rule) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<BrokerWithdrawResponse> brokerWithdraw(
            BrokerWithdrawRequest brokerWithdrawRequest) throws ApiException {
        return travelRuleApi.brokerWithdraw(brokerWithdrawRequest);
    }

    /**
     * Deposit History (for local entities that required travel rule) (supporting network)
     * (USER_DATA) Fetch deposit history for local entities that required travel rule. * Please
     * notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time
     * interval is within * If both &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; are sent, time between &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; must Weight: 1
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId (optional)
     * @param tranId Comma(,) separated list of wallet tran Ids. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param pendingQuestionnaire true: Only return records that pending deposit questionnaire.
     *     false/not provided: return all records. (optional)
     * @param startTime (optional)
     * @param endTime (optional)
     * @param offset Default: 0 (optional)
     * @param limit min 7, max 30, default 7 (optional)
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
     * @see <a href="https://developers.binance.com/docs/wallet/travel-rule/Deposit-History">Deposit
     *     History (for local entities that required travel rule) (supporting network) (USER_DATA)
     *     Documentation</a>
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
     * Fetch address verification list (USER_DATA) Fetch address verification list Weight: 10
     *
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
     *     href="https://developers.binance.com/docs/wallet/travel-rule/address-verification-list">Fetch
     *     address verification list (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchAddressVerificationListResponse> fetchAddressVerificationList()
            throws ApiException {
        return travelRuleApi.fetchAddressVerificationList();
    }

    /**
     * Onboarded VASP list (for local entities that require travel rule) (supporting network)
     * (USER_DATA) Fetch the onboarded VASP list for local entities that required travel rule. *
     * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP
     * rate Weight: 18000 Request limit: 10 requests per second &gt; * This endpoint specifically
     * uses per second IP rate limit, user&#39;s total second level IP rate limit is 180000/second.
     * Response from the endpoint contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight
     * used by the current IP.
     *
     * @return ApiResponse&lt;OnboardedVaspListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Onboarded VASP list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/wallet/travel-rule/Onboarded-VASP-list">Onboarded
     *     VASP list (for local entities that require travel rule) (supporting network) (USER_DATA)
     *     Documentation</a>
     */
    public ApiResponse<OnboardedVaspListResponse> onboardedVaspList() throws ApiException {
        return travelRuleApi.onboardedVaspList();
    }

    /**
     * Submit Deposit Questionnaire (For local entities that require travel rule) (supporting
     * network) (USER_DATA) Submit questionnaire for brokers of local entities that require travel
     * rule. The questionnaire is only applies to transactions from un-hosted wallets or VASPs that
     * are not yet onboarded with GTR. * Questionnaire is different for each local entity, please
     * refer * If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, Weight: 600
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
     *     href="https://developers.binance.com/docs/wallet/travel-rule/deposit-provide-info">Submit
     *     Deposit Questionnaire (For local entities that require travel rule) (supporting network)
     *     (USER_DATA) Documentation</a>
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
     * onboarded with GTR. * Questionnaire is different for each local entity, please refer * If
     * getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must
     * not be blank&#x60;, Weight: 600
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
     *     href="https://developers.binance.com/docs/wallet/travel-rule/deposit-provide-info">Submit
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
     * Withdraw History (for local entities that require travel rule) (supporting network)
     * (USER_DATA) Fetch withdraw history for local entities that required travel rule. * This
     * endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate *
     * &#x60;network&#x60; may not be in the response for old withdraw. * Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within * If
     * both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between
     * &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less Weight: 18000 Request limit: 10
     * requests per second &gt; * This endpoint specifically uses per second IP rate limit,
     * user&#39;s total second level IP rate limit is 180000/second. Response from the endpoint
     * contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight used by the current IP.
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param offset Default: 0 (optional)
     * @param limit min 7, max 30, default 7 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
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
     *     href="https://developers.binance.com/docs/wallet/travel-rule/Withdraw-History">Withdraw
     *     History (for local entities that require travel rule) (supporting network) (USER_DATA)
     *     Documentation</a>
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
     * (USER_DATA) Fetch withdraw history for local entities that required travel rule. * This
     * endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate *
     * &#x60;network&#x60; may not be in the response for old withdraw. * Withdrawal made through
     * /sapi/v1/capital/withdraw/apply may not be in the response. * Please notice the default
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within * If
     * both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between
     * &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less * If withdrawOrderId is sent, time
     * between startTime and endTime must be less than 7 days. * If withdrawOrderId is sent,
     * startTime and endTime are not sent, will return last 7 days records by default. * Maximum
     * support trId,txId number is 45. * WithdrawOrderId only support 1. * If responsible does not
     * include withdrawalStatus, please input trId or txId retrieve the data. Weight: 18000 Request
     * limit: 10 requests per second &gt; * This endpoint specifically uses per second IP rate
     * limit, user&#39;s total second level IP rate limit is 180000/second. Response from the
     * endpoint contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight used by the
     * current IP.
     *
     * @param trId Comma(,) separated list of travel rule record Ids. (optional)
     * @param txId (optional)
     * @param withdrawOrderId client side id for withdrawal, if provided in POST
     *     &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. (optional)
     * @param network (optional)
     * @param coin (optional)
     * @param travelRuleStatus 0:Completed,1:Pending,2:Failed (optional)
     * @param offset Default: 0 (optional)
     * @param limit min 7, max 30, default 7 (optional)
     * @param startTime (optional)
     * @param endTime (optional)
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
     *     href="https://developers.binance.com/docs/wallet/travel-rule/Withdraw-History-V2">Withdraw
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
     * Withdraw (for local entities that require travel rule) (USER_DATA) Submit a withdrawal
     * request for local entities that required travel rule. * If &#x60;network&#x60; not send,
     * return with default network of the coin, but if the address could not match default network,
     * the withdraw will be rejected. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in
     * &#x60;networkList&#x60; of a coin in the response * Questionnaire is different for each local
     * entity, please refer to * If getting error like &#x60;Questionnaire format not valid.&#x60;
     * or &#x60;Questionnaire must not be blank&#x60;, Weight: 600
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
     * @see <a href="https://developers.binance.com/docs/wallet/travel-rule/Withdraw">Withdraw (for
     *     local entities that require travel rule) (USER_DATA) Documentation</a>
     */
    public ApiResponse<WithdrawTravelRuleResponse> withdrawTravelRule(
            WithdrawTravelRuleRequest withdrawTravelRuleRequest) throws ApiException {
        return travelRuleApi.withdrawTravelRule(withdrawTravelRuleRequest);
    }
}
