package com.binance.connector.client.impl.spot;

import java.util.ArrayList;
import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Wallet Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#wallet-endpoints">Wallet Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Wallet {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Wallet(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Wallet(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String SYSTEM_STATUS = "/sapi/v1/system/status";
    /**
     * Fetch system status.
     * <br><br>
     * GET /sapi/v1/system/status
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#system-status-system">
     *     https://binance-docs.github.io/apidocs/spot/en/#system-status-system</a>
     */
    public String systemStatus() {
        return requestHandler.sendPublicRequest(baseUrl, SYSTEM_STATUS, null, HttpMethod.GET, showLimitUsage);
    }

    private final String COIN_INFO = "/sapi/v1/capital/config/getall";
    /**
     * Get information of coins (available for deposit and withdraw) for user.
     * <br><br>
     * GET /sapi/v1/capital/config/getall
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-coins-39-information-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#all-coins-39-information-user_data</a>
     */
    public String coinInfo(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COIN_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACCOUNT_SNAPSHOT = "/sapi/v1/accountSnapshot";
    /**
     * - The query time period must be less than 30 days
     * - Support query within the last one month only
     * - If startTime and endTime are both not sent, records from the last 7 days are returned by default
     * <br><br>
     * GET /sapi/v1/accountSnapshot
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- mandatory/string -- "SPOT", "MARGIN", "FUTURES" <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- min 5, max 30, default 5 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#daily-account-snapshot-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#daily-account-snapshot-user_data</a>
     */
    public String accountSnapshot(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT_SNAPSHOT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DISABLE_FAST_WITHDRAW = "/sapi/v1/account/disableFastWithdrawSwitch";
    /**
     * - This request will disable fastwithdraw switch under your account.
     * - You need to enable "trade" option for the api key which requests this endpoint.
     * <br><br>
     * POST /sapi/v1/account/disableFastWithdrawSwitch
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#disable-fast-withdraw-switch-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#disable-fast-withdraw-switch-user_data</a>
     */
    public String disableFastWithdraw(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, DISABLE_FAST_WITHDRAW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ENABLE_FAST_WITHDRAW = "/sapi/v1/account/enableFastWithdrawSwitch";
    /**
     * - This request will enable fastwithdraw switch under your account. You need to enable "trade" option for the api key which requests this endpoint.
     * - When Fast Withdraw Switch is on, transferring funds to a Binance account will be done instantly. There is no on-chain transaction, no transaction ID and no withdrawal fee.
     * <br><br>
     * POST /sapi/v1/account/enableFastWithdrawSwitch
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#enable-fast-withdraw-switch-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#enable-fast-withdraw-switch-user_data</a>
     */
    public String enableFastWithdraw(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ENABLE_FAST_WITHDRAW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String WITHDRAW = "/sapi/v1/capital/withdraw/apply";
    /**
     * Submit a withdraw request.
     * 
     * - If `network` not send, return with default network of the coin.
     * - You can get `network` and `isDefault` in `networkList` of a coin in the response of `Get /sapi/v1/capital/config/getall (HMAC SHA256)`.
     * <br><br>
     * POST /sapi/v1/capital/withdraw/apply
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * withdrawOrderId -- optional/string -- Client ID for withdraw <br>
     * network -- optional/string <br>
     * address -- mandatory/string <br>
     * addressTag -- optional/string -- Secondary address identifier for coins like XRP,XMR etc. <br>
     * amount -- mandatory/decimal <br>
     * transactionFeeFlag -- optional/boolean -- When making internal transfer, true for returning the fee to the destination account;
     *            false for returning the fee back to the departure account. Default false. <br>
     * name -- optional/string -- Description of the address. Space in name should be encoded into %20. <br>
     * walletType -- optional/int -- The wallet type for withdraw, 0-spot wallet , 1-funding wallet.Default spot wallet <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#withdraw-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#withdraw-user_data</a>
     */
    public String withdraw(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        ParameterChecker.checkParameter(parameters, "address", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, WITHDRAW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String DEPOSIT_HISTORY = "/sapi/v1/capital/deposit/hisrec";
    /**
     * Fetch deposit history.
     * 
     * - Please notice the default `startTime` and `endTime` to make sure that time interval is within 0-90 days.
     * - If both `startTime` and `endTime` are sent, time between `startTime` and `endTime` must be less than 90 days.
     * <br><br>
     * GET /sapi/v1/capital/deposit/hisrec
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- optional/string <br>
     * status -- optional/int -- 0(0:pending,6: credited but cannot withdraw, 1:success) <br>
     * startTime -- optional/long -- Default: 90 days from current timestamp <br>
     * endTime -- optional/long -- Default: present timestamp <br>
     * offset -- optional/int -- Default:0 <br>
     * limit -- optional/int -- Default:1000, Max:1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#deposit-history-supporting-network-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#deposit-history-supporting-network-user_data</a>
     */
    public String depositHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, DEPOSIT_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String WITHDRAW_HISTORY = "/sapi/v1/capital/withdraw/history";
    /**
     * Fetch withdraw history.
     * 
     * This endpoint specifically uses per second UID rate limit, user's total second level IP rate limit is 180000/second. Response from the endpoint contains header key X-SAPI-USED-UID-WEIGHT-1S, which defines weight used by the current IP.
     * 
     * - `network` may not be in the response for old withdraw.
     * - Please notice the default `startTime` and `endTime` to make sure that time interval is within 0-90 days.
     * - If both `startTime` and `endTime` are sent, time between `startTime` and `endTime` must be less than 90 days
     * - If withdrawOrderId is sent, time between startTime and endTime must be less than 7 days.
     * - If withdrawOrderId is sent, startTime and endTime are not sent, will return last 7 days records by default.
     * <br><br>
     * GET /sapi/v1/capital/withdraw/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- optional/string <br>
     * withdrawOrderId -- optional/string <br>
     * status -- optional/int -- 0(0:Email Sent,1:Cancelled 2:Awaiting Approval 3:Rejected 4:Processing 5:Failure 6:Completed) <br>
     * startTime -- optional/long -- Default: 90 days from current timestamp <br>
     * endTime -- optional/long -- Default: present timestamp <br>
     * offset -- optional/int <br>
     * limit -- optional/int -- Default:1000, Max:1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#withdraw-history-supporting-network-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#withdraw-history-supporting-network-user_data</a>
     */
    public String withdrawHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, WITHDRAW_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DEPOSIT_ADDRESS = "/sapi/v1/capital/deposit/address";
    /**
     * Fetch deposit address with network.
     * 
     * - If network is not send, return with default network of the coin.
     * - You can get network and isDefault in networkList in the response of Get /sapi/v1/capital/config/getall.
     * <br><br>
     * GET /sapi/v1/capital/deposit/address
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * network -- optional/string <br>
     * amount -- optional/decimal -- mandatory if using LIGHTNING network <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#deposit-address-supporting-network-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#deposit-address-supporting-network-user_data</a>
     */
    public String depositAddress(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, DEPOSIT_ADDRESS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DEPOSIT_ADDRESSES = "/sapi/v1/capital/deposit/address/list";
    /**
     * Fetch deposit address list with network.
     * 
     * - If network is not send, return with default network of the coin.
     * - You can get network and isDefault in networkList in the response of Get /sapi/v1/capital/config/getall.
     * <br><br>
     * GET /sapi/v1/capital/deposit/address/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * network -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#fetch-deposit-address-list-with-network-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#fetch-deposit-address-list-with-network-user_data</a>
     */
    public String depositAddresses(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, DEPOSIT_ADDRESSES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACCOUNT_STATUS = "/sapi/v1/account/status";
    /**
     * Fetch account status detail.
     * <br><br>
     * GET /sapi/v1/account/status
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#account-status-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#account-status-user_data</a>
     */
    public String accountStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String API_TRADE_STATUS = "/sapi/v1/account/apiTradingStatus";
    /**
     * Fetch account API trading status with details.
     * <br><br>
     * GET /sapi/v1/account/apiTradingStatus
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#account-api-trading-status-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#account-api-trading-status-user_data</a>
     */
    public String apiTradingStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, API_TRADE_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DUST_LOG = "/sapi/v1/asset/dribblet";
    /**
     * GET /sapi/v1/asset/dribblet
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#dustlog-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#dustlog-user_data</a>
     */
    public String dustLog(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, DUST_LOG, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BNB_CONVERTIBLE_ASSETS = "/sapi/v1/asset/dust-btc";
    /**
     * POST /sapi/v1/asset/dust-btc
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-assets-that-can-be-converted-into-bnb-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-assets-that-can-be-converted-into-bnb-user_data</a>
     */
    public String bnbConvertableAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BNB_CONVERTIBLE_ASSETS, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String DUST_TRANSFER = "/sapi/v1/asset/dust";
    /**
     * Convert dust assets to BNB.
     * <br><br>
     * POST /sapi/v1/asset/dust
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/array -- The asset being converted. For example: asset=BTC&amp;asset=USDT <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#dust-transfer-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#dust-transfer-user_data</a>
     */
    public String dustTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", ArrayList.class);
        return requestHandler.sendSignedRequest(baseUrl, DUST_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ASSET_DIVIDEND = "/sapi/v1/asset/assetDividend";
    /**
     * Query asset dividend record.
     * <br><br>
     * GET /sapi/v1/asset/assetDividend
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 20, max 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#asset-dividend-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#asset-dividend-record-user_data</a>
     */
    public String assetDividend(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ASSET_DIVIDEND, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ASSET_DETAIL = "/sapi/v1/asset/assetDetail";
    /**
     * Fetch details of assets supported on Binance.
     * 
     * - Please get network and other deposit or withdraw details from `GET /sapi/v1/capital/config/getall`.
     * <br><br>
     * GET /sapi/v1/asset/assetDetail
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#asset-detail-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#asset-detail-user_data</a>
     */
    public String assetDetail(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ASSET_DETAIL, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TRADE_FEE = "/sapi/v1/asset/tradeFee";
    /**
     * Fetch trade fee.
     * <br><br>
     * GET /sapi/v1/asset/tradeFee
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#trade-fee-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#trade-fee-user_data</a>
     */
    public String tradeFee(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, TRADE_FEE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String UNIVERSAL_TRANSFER = "/sapi/v1/asset/transfer";
    /**
     * You need to enable Permits Universal Transfer option for the api key which requests this endpoint.
     * <br><br>
     * POST /sapi/v1/asset/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- mandatory/enum -- Universal transfer type <br>
     * asset -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * fromSymbol -- optional/string <br>
     * toSymbol -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#user-universal-transfer-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#user-universal-transfer-user_data</a>
     */
    public String universalTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, UNIVERSAL_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/asset/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- mandatory/enum <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/int -- Default 1 <br>
     * size -- optional/int -- 	Default 10, Max 100 <br>
     * fromSymbol -- optional/string <br>
     * toSymbol -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-user-universal-transfer-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-user-universal-transfer-history-user_data</a>
     */
    public String queryUniversalTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, UNIVERSAL_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FUNDING_WALLET = "/sapi/v1/asset/get-funding-asset";
    /**
     * POST /sapi/v1/asset/get-funding-asset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * needBtcValuation -- optional/string -- true or false <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#funding-wallet-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#funding-wallet-user_data</a>
     */
    public String fundingWallet(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FUNDING_WALLET, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String API_PERMISSION = "/sapi/v1/account/apiRestrictions";
    /**
     * GET /sapi/v1/account/apiRestrictions
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-api-key-permission-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-api-key-permission-user_data</a>
     */
    public String apiPermission(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, API_PERMISSION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String USER_ASSET = "/sapi/v3/asset/getUserAsset";
    /**
     * Get user assets, just for positive data.
     * <br><br>
     * POST /sapi/v3/asset/getUserAsset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string -- If asset is blank, then query all positive assets user have. <br>
     * needBtcValuation -- optional/boolean -- 	Whether need btc valuation or not. <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#user-asset-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#user-asset-user_data</a>
     */
    public String getUserAsset(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, USER_ASSET, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String BUSD_CONVERT = "/sapi/v1/asset/convert-transfer";
    /**
     * Convert transfer, convert between BUSD and stablecoins.
     * 
     * - If the clientId has been used before, will not do the convert transfer, the original transfer will be returned.
     * <br><br>
     * POST /sapi/v1/asset/convert-transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * clientTranId -- mandatory/string -- The unique user-defined transaction id, min length 20 <br>
     * asset -- mandatory/string -- The current asset <br>
     * amount -- mandatory/BigDecimal -- The amount must be positive number <br>
     * targetAsset -- mandatory/string -- Target asset you want to convert <br>
     * accountType -- optional/string -- Only MAIN and CARD, default MAIN <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#busd-convert-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#busd-convert-trade</a>
     */
    public String busdConvert(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "clientTranId", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "targetAsset", String.class);

        return requestHandler.sendSignedRequest(baseUrl, BUSD_CONVERT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String BUSD_CONVERT_HISTORY = "/sapi/v1/asset/convert-transfer/queryByPage";
    /**
     * <br><br>
     * GET /sapi/v1/asset/convert-transfer/queryByPage
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * 
     * startTime -- mandatory/long -- inclusive, unit: ms <br>
     * endTime -- mandatory/long -- exclusive, unit: ms <br>
     * tranId -- optional/long -- The transaction id <br>
     * clientTranId -- optional/string -- The unique user-defined transaction id <br>
     * asset -- optional/string -- If not sent or null, deducted asset and target asset are returned. <br>
     * accountType -- optional/string -- MAIN: main account. CARD: funding account. If not sent or null, spot and card wallet will be queried. <br>
     * current -- optional/integer -- current page, default 1, the min value is 1 <br>
     * size -- optional/integer -- page size, default 10, the max value is 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#busd-convert-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#busd-convert-history-user_data</a>
     */
    public String busdConvertHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        ParameterChecker.checkParameter(parameters, "endTime", Long.class);

        return requestHandler.sendSignedRequest(baseUrl, BUSD_CONVERT_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }


    private final String CLOUD_MINING_HISTORY = "/sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage";
    /**
     * The query of Cloud-Mining payment and refund history
     * <br><br>
     * GET /sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * 
     * startTime -- mandatory/long -- inclusive, unit: ms <br>
     * endTime -- mandatory/long -- exclusive, unit: ms <br>
     * tranId -- optional/long -- The transaction id <br>
     * clientTranId -- optional/string -- The unique flag <br>
     * asset -- optional/string -- If not sent, we will query all assets. <br>
     * current -- optional/integer -- current page, default 1, the min value is 1 <br>
     * size -- optional/integer -- page size, default 10, the max value is 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-cloud-mining-payment-and-refund-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-cloud-mining-payment-and-refund-history-user_data</a>
     */
    public String cloudMiningHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        ParameterChecker.checkParameter(parameters, "endTime", Long.class);

        return requestHandler.sendSignedRequest(baseUrl, CLOUD_MINING_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BUSD_AUTO_CONVERT = "/sapi/v1/capital/contract/convertible-coins";
    /**
     * Get the stable coins set for auto-conversion to BUSD at deposit/withdrawal moments.
     * 
     * <br><br>
     * GET /sapi/v1/capital/contract/convertible-coins
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-auto-converting-stable-coins-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-auto-converting-stable-coins-user_data</a>
     */
    public String getBusdAutoConvertions() {
        return requestHandler.sendSignedRequest(baseUrl, BUSD_AUTO_CONVERT, null, HttpMethod.GET, showLimitUsage);
    }

    /**
     * Switch on/off the BUSD auto-conversion from/to a specific stable coin.
     * 
     * <br><br>
     * POST /sapi/v1/capital/contract/convertible-coins
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string -- Must be USDC, USDP or TUSD <br>
     * enable -- mandatory/boolean -- true: turn on the auto-conversion. false: turn off the auto-conversion <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#switch-on-off-busd-and-stable-coins-conversion-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#switch-on-off-busd-and-stable-coins-conversion-user_data</a>
     */
    public String switchBusdAutoConversion(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        ParameterChecker.checkParameter(parameters, "enable", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, BUSD_AUTO_CONVERT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String APPLY_ONE_CLICK_ARRIVAL_DEPOSIT = "/sapi/v1/capital/deposit/credit-apply";
    /**
     * Apply deposit credit for expired address (One click arrival)
     * 
     * <br><br>
     * POST /sapi/v1/capital/deposit/credit-apply
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * depositId -- optional/long -- Deposit record ID, priority use <br>
     * txId -- optional/string -- Deposit txId, used when depositId is not specified <br>
     * subAccountId -- optional/long <br>
     * subUserId -- optional/long <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#one-click-arrival-deposit-apply-for-expired-address-deposit-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#one-click-arrival-deposit-apply-for-expired-address-deposit-user_data</a>
     */
    public String applyOneClickArrivalDeposit(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, APPLY_ONE_CLICK_ARRIVAL_DEPOSIT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String WALLET_BALANCE = "/sapi/v1/asset/wallet/balance";
    /**
     * Query User Wallet Balance
     * 
     * <br><br>
     * GET /sapi/v1/asset/wallet/balance
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-user-wallet-balance-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-user-wallet-balance-user_data</a>
     */
    public String walletBalance(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, WALLET_BALANCE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String QUERY_USER_DELEGATION_HISTORY = "/sapi/v1/asset/custody/transfer-history";
    /**
     * Query User Delegation History
     * 
     * You need to open Enable Spot and Margin Trading permission for the API Key which requests this endpoint
     * 
     * <br><br>
     * GET /sapi/v1/asset/custody/transfer-history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string <br>
     * startTime -- mandatory/long <br>
     * endTime -- mandatory/long <br>
     * type -- optional/enum -- "Delegate" or "Undelegate"<br>
     * asset -- optional/string <br>
     * current -- optional/integer -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/integer -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-user-delegation-history-for-master-account-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-user-delegation-history-for-master-account-user_data</a>
     */
    public String delegationHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        ParameterChecker.checkParameter(parameters, "endTime", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, QUERY_USER_DELEGATION_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

}
