package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Sub-Account Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#sub-account-endpoints">Sub-Account Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class SubAccount {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public SubAccount(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }
    
    public SubAccount(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String CREATE_SUB = "/sapi/v1/sub-account/virtualSubAccount";
    /**
     * POST /sapi/v1/sub-account/virtualSubAccount
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * subAccountString -- mandatory/string -- Please input a string. We will create a virtual email using that string for you to register <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#create-a-virtual-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#create-a-virtual-sub-account-for-master-account</a>
     */
    public String createVirtualSubAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "subAccountString", String.class);
        return requestHandler.sendSignedRequest(baseUrl, CREATE_SUB, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String QUERY_SUB_LIST = "/sapi/v1/sub-account/list";
    /**
     * GET /sapi/v1/sub-account/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- optional/string <br>
     * isFreeze -- optional/string -- true or false <br>
     * page -- optional/int -- Default value: 1 <br>
     * limit -- optional/int -- Default value: 1, Max value: 200 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-list-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-list-for-master-account</a>
     */
    public String subAccountList(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, QUERY_SUB_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String QUERY_SPOT_TRANSFER_HIST = "/sapi/v1/sub-account/sub/transfer/history";
    /**
     * GET /sapi/v1/sub-account/sub/transfer/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromEmail -- optional/string <br>
     * toEmail -- optional/string -- true or false <br>
     * startTime -- optional/long <br>
     * endTime	 -- optional/long <br>
     * page -- optional/int -- Default value: 1 <br>
     * limit -- optional/int -- Default value: 1, Max value: 200 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-spot-asset-transfer-history-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-spot-asset-transfer-history-for-master-account</a>
     */
    public String spotTransferHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, QUERY_SPOT_TRANSFER_HIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FUTURES_TRANSFER = "/sapi/v1/sub-account/futures/internalTransfer";
    /**
     * GET /sapi/v1/sub-account/futures/internalTransfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string <br>
     * futuresType -- mandatory/long -- 1:USDT-margined Futures,2: Coin-margined Futures <br>
     * startTime -- optional/long <br>
     * endTime	 -- optional/long <br>
     * page -- optional/int -- Default value: 1 <br>
     * limit -- optional/int -- Default value: 1, Max value: 200 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-futures-asset-transfer-history-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-futures-asset-transfer-history-for-master-account</a>
     */
    public String getFuturesInternalTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "futuresType", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
    }

    /**
     * POST /sapi/v1/sub-account/futures/internalTransfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromEmail -- mandatory/string -- Sender email <br>
     * toEmail -- mandatory/string -- Recipient email <br>
     * futuresType -- mandatory/long -- 1:USDT-margined Futures,2: Coin-margined Futures <br>
     * asset -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#sub-account-futures-asset-transfer-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#sub-account-futures-asset-transfer-for-master-account</a>
     */
    public String futuresInternalTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "fromEmail", String.class);
        ParameterChecker.checkParameter(parameters, "toEmail", String.class);
        ParameterChecker.checkParameter(parameters, "futuresType", Integer.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_ACC_ASSETS = "/sapi/v3/sub-account/assets";
    /**
     * Fetch sub-account assets.
     * <br><br>
     * GET /sapi/v3/sub-account/assets
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#sub-account-futures-asset-transfer-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#sub-account-futures-asset-transfer-for-master-account</a>
     */
    public String assets(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_ASSETS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SPOT_ASSET_SUMMARY = "/sapi/v1/sub-account/spotSummary";
    /**
     * Get BTC valued asset summary of subaccounts.
     * <br><br>
     * GET /sapi/v1/sub-account/spotSummary
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- optional/string -- Sub account email <br>
     * page -- optional/long -- default 1 <br>
     * size -- optional/long -- default 10, max 20 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-spot-assets-summary-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-sub-account-spot-assets-summary-for-master-account</a>
     */
    public String spotAccountSummary(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SPOT_ASSET_SUMMARY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_DEPOSIT_ADDRESS = "/sapi/v1/capital/deposit/subAddress";
    /**
     * Fetch sub-account deposit address.
     * <br><br>
     * GET /sapi/v1/capital/deposit/subAddress
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub account email <br>
     * coin -- mandatory/string <br>
     * network -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-deposit-address-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-deposit-address-for-master-account</a>
     */
    public String depositAddress(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_DEPOSIT_ADDRESS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_DEPOSIT_HISTORY = "/sapi/v1/capital/deposit/subHisrec";
    /**
     * Fetch sub-account deposit history.
     * <br><br>
     * GET /sapi/v1/capital/deposit/subHisrec
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub account email <br>
     * coin -- optional/string <br>
     * status -- optional/int -- 0(0:pending,6: credited but cannot withdraw, 1:success) <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int <br>
     * offset -- optional/int -- default:0 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-deposit-history-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-deposit-history-for-master-account</a>
     */
    public String depositHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_DEPOSIT_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ACC_STATUS = "/sapi/v1/sub-account/status";
    /**
     * GET /sapi/v1/sub-account/status
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- optional/string -- Sub account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-39-s-status-on-margin-futures-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-sub-account-39-s-status-on-margin-futures-for-master-account</a>
     */
    public String accountStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ENABLE_MARGIN = "/sapi/v1/sub-account/margin/enable";
    /**
     * POST /sapi/v1/sub-account/margin/enable
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#enable-margin-for-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#enable-margin-for-sub-account-for-master-account</a>
     */
    public String enableMargin(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ENABLE_MARGIN, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_ACC_MARGIN = "/sapi/v1/sub-account/margin/account";
    /**
     * GET /sapi/v1/sub-account/margin/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-margin-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-margin-account-for-master-account</a>
     */
    public String marginAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_MARGIN, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ACC_MARGIN_SUMMARY = "/sapi/v1/sub-account/margin/accountSummary";
    /**
     * GET /sapi/v1/sub-account/margin/accountSummary
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-margin-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-margin-account-for-master-account</a>
     */
    public String marginAccountSummary(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_MARGIN_SUMMARY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ENABLE_FUTURES = "/sapi/v1/sub-account/futures/enable";
    /**
     * POST /sapi/v1/sub-account/futures/enable
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#enable-futures-for-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#enable-futures-for-sub-account-for-master-account</a>
     */
    public String enableFutures(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ENABLE_FUTURES, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_ACC_FUTURES = "/sapi/v1/sub-account/futures/account";
    /**
     * GET /sapi/v1/sub-account/futures/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-futures-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-futures-account-for-master-account</a>
     */
    public String futuresAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_FUTURES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ACC_FUTURES_SUMMARY = "/sapi/v1/sub-account/futures/accountSummary";
    /**
     * GET /sapi/v1/sub-account/futures/accountSummary
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-futures-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-futures-account-for-master-account</a>
     */
    public String futuresAccountSummary(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_FUTURES_SUMMARY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ACC_POSITION_RISK = "/sapi/v1/sub-account/futures/positionRisk";
    /**
     * GET /sapi/v1/sub-account/futures/positionRisk
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-Account email <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-futures-position-risk-of-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-futures-position-risk-of-sub-account-for-master-account</a>
     */
    public String futuresPositionRisk(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_POSITION_RISK, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ACC_FUTURES_TRANSFER = "/sapi/v1/sub-account/futures/transfer";
    /**
     * POST /sapi/v1/sub-account/futures/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-Account email <br>
     * asset -- mandatory/string -- The asset being transferred, e.g., USDT <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * type -- mandatory/int -- 1: transfer from subaccount's spot account to its USDT-margined futures account
     *            2: transfer from subaccount's USDT-margined futures account to its spot account
     *            3: transfer from subaccount's spot account to its COIN-margined futures account
     *            4:transfer from subaccount's COIN-margined futures account to its spot account <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#futures-transfer-for-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#futures-transfer-for-sub-account-for-master-account</a>
     */
    public String futuresTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_FUTURES_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_ACC_MARGIN_TRANSFER = "/sapi/v1/sub-account/margin/transfer";
    /**
     * POST /sapi/v1/sub-account/margin/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-Account email <br>
     * asset -- mandatory/string -- The asset being transferred, e.g., USDT <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * type -- mandatory/int -- 1: transfer from subaccount's spot account to margin account
     *                          2: transfer from subaccount's margin account to its spot account <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-transfer-for-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-transfer-for-sub-account-for-master-account</a>
     */
    public String marginTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_ACC_MARGIN_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_TO_SUB = "/sapi/v1/sub-account/transfer/subToSub";
    /**
     * POST /sapi/v1/sub-account/transfer/subToSub
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * toEmail -- mandatory/string -- Sub-Account email <br>
     * asset -- mandatory/string -- The asset being transferred, e.g., USDT <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#transfer-to-sub-account-of-same-master-for-sub-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#transfer-to-sub-account-of-same-master-for-sub-account</a>
     */
    public String subAccountToSubAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "toEmail", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUB_TO_SUB, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_TO_MASTER = "/sapi/v1/sub-account/transfer/subToMaster";
    /**
     * POST /sapi/v1/sub-account/transfer/subToMaster
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- The asset being transferred, e.g., USDT <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#transfer-to-master-for-sub-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#transfer-to-master-for-sub-account</a>
     */
    public String subAccountToMaster(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUB_TO_MASTER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUB_TRANSFER_HIST = "/sapi/v1/sub-account/transfer/subUserHistory";
    /**
     * GET /sapi/v1/sub-account/transfer/subUserHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string -- If not sent, result of all assets will be returned <br>
     * type -- optional/int -- 	1: transfer in, 2: transfer out <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#sub-account-transfer-history-for-sub-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#sub-account-transfer-history-for-sub-account</a>
     */
    public String transferHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUB_TRANSFER_HIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_UNIVERSAL_TRANSFER = "/sapi/v1/sub-account/universalTransfer";
    /**
     * POST /sapi/v1/sub-account/universalTransfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromEmail -- optional/string <br>
     * toEmail -- optional/string <br>
     * fromAccountType -- mandatory/string -- "SPOT","USDT_FUTURE","COIN_FUTURE" <br>
     * toAccountType -- mandatory/string -- "SPOT","USDT_FUTURE","COIN_FUTURE" <br>
     * clientTranId -- optional/string -- Must be unique <br>
     * asset -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#universal-transfer-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#universal-transfer-for-master-account</a>
     */
    public String universalTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "fromAccountType", String.class);
        ParameterChecker.checkParameter(parameters, "toAccountType", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUB_UNIVERSAL_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/sub-account/universalTransfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromEmail -- optional/string <br>
     * toEmail -- optional/string <br>
     * clientTranId -- optional/string -- Must be unique <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * page -- optional/int -- Default 1 <br>
     * limit -- optional/int -- Default 500, Max 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-universal-transfer-history-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-universal-transfer-history-for-master-account</a>
     */
    public String queryUniversalTransfer(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUB_UNIVERSAL_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_FUTURES_ACCOUNT_V2 = "/sapi/v2/sub-account/futures/account";
    /**
     * GET /sapi/v2/sub-account/futures/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * futuresType -- mandatory/int -- 1:USDT Margined Futures, 2:COIN Margined Futures <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-futures-account-v2-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-detail-on-sub-account-39-s-futures-account-v2-for-master-account</a>
     */
    public String futuresAccountV2(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "futuresType", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_FUTURES_ACCOUNT_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_FUTURES_ACCOUNT_SUMMARY_V2 = "/sapi/v2/sub-account/futures/accountSummary";
    /**
     * GET /sapi/v2/sub-account/futures/accountSummary
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * futuresType -- mandatory/int -- 1:USDT Margined Futures, 2:COIN Margined Futures <br>
     * page -- optional/int -- 	default:1 <br>
     * limit -- optional/int -- default:10, max:20 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-futures-account-v2-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-summary-of-sub-account-39-s-futures-account-v2-for-master-account</a>
     */
    public String futuresAccountSummaryV2(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "futuresType", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_FUTURES_ACCOUNT_SUMMARY_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_FUTURES_POSITION_RISK_V2 = "/sapi/v2/sub-account/futures/positionRisk";
    /**
     * GET /sapi/v2/sub-account/futures/positionRisk
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * futuresType -- mandatory/int -- 1:USDT Margined Futures, 2:COIN Margined Futures <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-futures-position-risk-of-sub-account-v2-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-futures-position-risk-of-sub-account-v2-for-master-account</a>
     */
    public String futuresPositionRiskV2(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "futuresType", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, SUB_FUTURES_POSITION_RISK_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ENABLE_LEVERAGE = "/sapi/v1/sub-account/blvt/enable";
    /**
     * GET /sapi/v2/sub-account/futures/positionRisk
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * enableBlvt -- mandatory/boolean -- Only true for now <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#enable-leverage-token-for-sub-account-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#enable-leverage-token-for-sub-account-for-master-account</a>
     */
    public String enableLeverageToken(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "enableBlvt", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, ENABLE_LEVERAGE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String IP_RESTRICTION = "/sapi/v1/sub-account/subAccountApi/ipRestriction";
    /**
     * GET /sapi/v1/sub-account/subAccountApi/ipRestriction
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * subAccountApiKey -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-ip-restriction-for-a-sub-account-api-key-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-ip-restriction-for-a-sub-account-api-key-for-master-account</a>
     */
    public String getIpRestriction(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "subAccountApiKey", String.class);
        return requestHandler.sendSignedRequest(baseUrl, IP_RESTRICTION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String IP_LIST = "/sapi/v1/sub-account/subAccountApi/ipRestriction/ipList";
    /**
     * DELETE /sapi/v1/sub-account/subAccountApi/ipRestriction/ipList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * subAccountApiKey -- mandatory/string <br>
     * ipAddress -- mandatory/string -- Can be added in batches, separated by commas <br>
     * thirdPartyName -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#delete-ip-list-for-a-sub-account-api-key-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#delete-ip-list-for-a-sub-account-api-key-for-master-account</a>
     */
    public String deleteIpList(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "subAccountApiKey", String.class);
        ParameterChecker.checkParameter(parameters, "ipAddress", String.class);
        return requestHandler.sendSignedRequest(baseUrl, IP_LIST, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String MANAGED_SUB_DEPOSIT = "/sapi/v1/managed-subaccount/deposit";
    /**
     * POST /sapi/v1/managed-subaccount/deposit
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * toEmail -- mandatory/string <br>
     * asset -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#deposit-assets-into-the-managed-sub-account-for-investor-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#deposit-assets-into-the-managed-sub-account-for-investor-master-account</a>
     */
    public String managedSubDeposit(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "toEmail", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, MANAGED_SUB_DEPOSIT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String MANAGED_SUB_DETAILS = "/sapi/v1/managed-subaccount/asset";
    /**
     * GET /sapi/v1/managed-subaccount/asset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-managed-sub-account-asset-details-for-investor-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-managed-sub-account-asset-details-for-investor-master-account</a>
     */
    public String managedSubDetails(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MANAGED_SUB_DETAILS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String MANAGED_SUB_WITHDRAW = "/sapi/v1/managed-subaccount/withdraw";
    /**
     * POST /sapi/v1/managed-subaccount/withdraw
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromEmail -- mandatory/string <br>
     * asset -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * transferDate -- optional/decimal -- Withdrawals is automatically occur on the transfer date(UTC0).
     *                                     If a date is not selected, the withdrawal occurs right now <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#withdrawl-assets-from-the-managed-sub-account-for-investor-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#withdrawl-assets-from-the-managed-sub-account-for-investor-master-account</a>
     */
    public String managedSubWithdraw(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "fromEmail", String.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, MANAGED_SUB_WITHDRAW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String MANAGED_SUB_SNAPSHOT = "/sapi/v1/managed-subaccount/accountSnapshot";
    /**
     * GET /sapi/v1/managed-subaccount/accountSnapshot
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string <br>
     * type -- mandatory/string -- "SPOT", "MARGIN"(Cross), "FUTURES"(UM) <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- int/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-managed-sub-account-snapshot-for-investor-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-managed-sub-account-snapshot-for-investor-master-account</a>
     */
    public String managedSubAccountSnapshot(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MANAGED_SUB_SNAPSHOT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String IP_RESTRICTION_V2 = "/sapi/v2/sub-account/subAccountApi/ipRestriction";
    /**
     * POST /sapi/v2/sub-account/subAccountApi/ipRestriction
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * email -- mandatory/string -- Sub-account email <br>
     * subAccountApiKey -- mandatory/string <br>
     * status -- mandatory/string -- IP Restriction status. 1 = IP Unrestricted. 2 = Restrict access to trusted IPs only.<br>
     * ipAddress -- optional/string -- Insert static IP in batch, separated by commas. <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#add-ip-restriction-for-sub-account-api-key-for-master-account">
     *     https://binance-docs.github.io/apidocs/spot/en/#add-ip-restriction-for-sub-account-api-key-for-master-account</a>
     */
    public String updateIpRestriction(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "email", String.class);
        ParameterChecker.checkParameter(parameters, "subAccountApiKey", String.class);
        ParameterChecker.checkParameter(parameters, "status", String.class);
        return requestHandler.sendSignedRequest(baseUrl, IP_RESTRICTION_V2, parameters, HttpMethod.POST, showLimitUsage);
    }
}
