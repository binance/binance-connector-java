package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Simple Earn Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/simple_earn/Introduction">Simple Earn Endpoints</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class SimpleEarn {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public SimpleEarn(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public SimpleEarn(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String FLEXIBLE_PRODUCT_LIST = "/sapi/v1/simple-earn/flexible/list";
    /**
     * Get available Simple Earn flexible product list
     * <br><br>
     * GET /sapi/v1/simple-earn/flexible/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Flexible-Product-List">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Flexible-Product-List</a>
     */
    public String flexibleProductList(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_PRODUCT_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_PRODUCT_LIST = "/sapi/v1/simple-earn/locked/list";
    /**
     * GET /sapi/v1/simple-earn/locked/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Locked-Product-List">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Simple-Earn-Locked-Product-List</a>
     */
    public String lockedProductList(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_PRODUCT_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUBSCRIBE_FLEXIBLE_PRODUCT = "/sapi/v1/simple-earn/flexible/subscribe";
    /**
     * POST /sapi/v1/simple-earn/flexible/subscribe
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * autoSubscribe -- optional/boolean -- true or false, default true. <br>
     * sourceAccount -- optional/enum -- SPOT,FUND,ALL, default SPOT <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Subscribe-Flexible-Product">
     *      https://developers.binance.com/docs/simple_earn/earn/Subscribe-Flexible-Product</a>
     */
    public String subscribeFlexibleProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUBSCRIBE_FLEXIBLE_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUBSCRIBE_LOCKED_PRODUCT = "/sapi/v1/simple-earn/locked/subscribe";
    /**
     * POST /sapi/v1/simple-earn/locked/subscribe
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * projectId -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * autoSubscribe -- optional/boolean -- true or false, default true. <br>
     * sourceAccount -- optional/enum -- SPOT,FUND,ALL, default SPOT <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Subscribe-Locked-Product">
     *      https://developers.binance.com/docs/simple_earn/earn/Subscribe-Locked-Product</a>
     */
    public String subscribeLockedProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "projectId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUBSCRIBE_LOCKED_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REDEEM_FLEXIBLE_PRODUCT = "/sapi/v1/simple-earn/flexible/redeem";
    /**
     * POST /sapi/v1/simple-earn/flexible/redeem
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * redeemAll -- optional/boolean -- true or false, default to false <br>
     * amount -- optional/decimal -- if redeemAll is false, amount is mandatory <br>
     * destAccount -- optional/enum -- SPOT,FUND,ALL, default SPOT <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Redeem-Flexible-Product">
     *      https://developers.binance.com/docs/simple_earn/earn/Redeem-Flexible-Product</a>
     */
    public String redeemFlexibleProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_FLEXIBLE_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REDEEM_LOCKED_PRODUCT = "/sapi/v1/simple-earn/locked/redeem";
    /**
     * POST /sapi/v1/simple-earn/locked/redeem
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * positionId -- mandatory/string -- 1234 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Redeem-Locked-Product">
     *      https://developers.binance.com/docs/simple_earn/earn/Redeem-Locked-Product</a>
     */
    public String redeemLockedProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "positionId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_LOCKED_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_PRODUCT_POSITION = "/sapi/v1/simple-earn/flexible/position";
    /**
     * GET /sapi/v1/simple-earn/flexible/position
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * productId -- optional/string <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Product-Position">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Product-Position</a>
     */
    public String flexibleProductPosition(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_PRODUCT_POSITION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_PRODUCT_POSITION = "/sapi/v1/simple-earn/locked/position";
    /**
     * GET /sapi/v1/simple-earn/locked/position
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * positionId -- optional/string <br>
     * projectId -- optional/string <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Locked-Product-Position">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Locked-Product-Position</a>
     */
    public String lockedProductPosition(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_PRODUCT_POSITION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SIMPLE_ACCOUNT = "/sapi/v1/simple-earn/account";
    /**
     * GET /sapi/v1/simple-earn/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Simple-Account">
     *      https://developers.binance.com/docs/simple_earn/account/Simple-Account</a>
     */
    public String simpleAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SIMPLE_ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_SUBSCRIPTION_RECORD = "/sapi/v1/simple-earn/flexible/history/subscriptionRecord";
    /**
     * GET /sapi/v1/simple-earn/flexible/history/subscriptionRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- optional/string <br>
     * purchaseId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Subscription-Record">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Subscription-Record</a>
     */
    public String flexibleSubscriptionRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_SUBSCRIPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_SUBSCRIPTION_RECORD = "/sapi/v1/simple-earn/locked/history/subscriptionRecord";
    /**
     * GET /sapi/v1/simple-earn/locked/history/subscriptionRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * purchaseId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Subscription-Record">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Locked-Subscription-Record</a>
     */
    public String lockedSubscriptionRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_SUBSCRIPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_REDEMPTION_RECORD = "/sapi/v1/simple-earn/flexible/history/redemptionRecord";
    /**
     * GET /sapi/v1/simple-earn/flexible/history/redemptionRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- optional/string <br>
     * redeemId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Redemption-Record">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Redemption-Record</a>
     */
    public String flexibleRedemptionRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_REDEMPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_REDEMPTION_RECORD = "/sapi/v1/simple-earn/locked/history/redemptionRecord";
    /**
     * GET /sapi/v1/simple-earn/locked/history/redemptionRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * positionId -- optional/string <br>
     * redeemId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Redemption-Record">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Locked-Redemption-Record</a>
     */
    public String lockedRedemptionRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_REDEMPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_REWARDS_HISTORY = "/sapi/v1/simple-earn/flexible/history/rewardsRecord";
    /**
     * GET /sapi/v1/simple-earn/flexible/history/rewardsRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * type -- mandatory/enum -- "BONUS", "REALTIME", "REWARDS" <br>
     * current -- optional/long -- Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Rewards-History">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Flexible-Rewards-History</a>
     */
    public String flexibleRewardsHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_REWARDS_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_REWARDS_HISTORY = "/sapi/v1/simple-earn/locked/history/rewardsRecord";
    /**
     * GET /sapi/v1/simple-earn/locked/history/rewardsRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * positionId -- optional/string <br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Currently querying the page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Locked-Rewards-History">
     *     https://developers.binance.com/docs/simple_earn/history/Get-Locked-Rewards-History</a>
     */
    public String lockedRewardsHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_REWARDS_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SET_FLEXIBLE_AUTO_SUBSCRIBE = "/sapi/v1/simple-earn/flexible/setAutoSubscribe";
    /**
     * POST /sapi/v1/simple-earn/flexible/setAutoSubscribe
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * autoSubscribe -- mandatory/boolean -- true or false <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Set-Flexible-Auto-Subscribe">
     *      https://developers.binance.com/docs/simple_earn/earn/Set-Flexible-Auto-Subscribe</a>
     */
    public String setFlexibleAutoSubscribe(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkParameter(parameters, "autoSubscribe", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, SET_FLEXIBLE_AUTO_SUBSCRIBE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SET_LOCKED_AUTO_SUBSCRIBE = "/sapi/v1/simple-earn/locked/setAutoSubscribe";
    /**
     * POST /sapi/v1/simple-earn/locked/setAutoSubscribe
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * positionId -- mandatory/string <br>
     * autoSubscribe -- mandatory/boolean -- true or false <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Set-Locked-Auto-Subscribe">
     *      https://developers.binance.com/docs/simple_earn/earn/Set-Locked-Auto-Subscribe</a>
     */
    public String setLockedAutoSubscribe(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "positionId", String.class);
        ParameterChecker.checkParameter(parameters, "autoSubscribe", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, SET_LOCKED_AUTO_SUBSCRIBE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_PERSONAL_LEFT_QUOTA = "/sapi/v1/simple-earn/flexible/personalLeftQuota";
    /**
     * GET /sapi/v1/simple-earn/flexible/personalLeftQuota
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Personal-Left-Quota">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Flexible-Personal-Left-Quota</a>
     */
    public String flexiblePersonalLeftQuota(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_PERSONAL_LEFT_QUOTA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_PERSONAL_LEFT_QUOTA = "/sapi/v1/simple-earn/locked/personalLeftQuota";
    /**
     * GET /sapi/v1/simple-earn/locked/personalLeftQuota
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * projectId -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/account/Get-Locked-Personal-Left-Quota">
     *      https://developers.binance.com/docs/simple_earn/account/Get-Locked-Personal-Left-Quota</a>
     */
    public String lockedPersonalLeftQuota(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "projectId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_PERSONAL_LEFT_QUOTA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_SUBSCRIPTION_PREVIEW = "/sapi/v1/simple-earn/flexible/subscriptionPreview";
    /**
     * GET /sapi/v1/simple-earn/flexible/subscriptionPreview
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Get-Flexible-Subscription-Preview">
     *      https://developers.binance.com/docs/simple_earn/earn/Get-Flexible-Subscription-Preview</a>
     */
    public String flexibleSubscriptionPreview(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_SUBSCRIPTION_PREVIEW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOCKED_SUBSCRIPTION_PREVIEW = "/sapi/v1/simple-earn/locked/subscriptionPreview";
    /**
     * GET /sapi/v1/simple-earn/locked/subscriptionPreview
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * projectId -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * autoSubscribe -- optional/boolean -- true or false, default true. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/earn/Get-Locked-Subscription-Preview">
     *      https://developers.binance.com/docs/simple_earn/earn/Get-Locked-Subscription-Preview</a>
     */
    public String lockedSubscriptionPreview(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "projectId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, LOCKED_SUBSCRIPTION_PREVIEW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String RATE_HISTORY = "/sapi/v1/simple-earn/flexible/history/rateHistory";
    /**
     * GET /sapi/v1/simple-earn/flexible/history/rateHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Rate-History">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Rate-History</a>
     */
    public String rateHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, RATE_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_RECORD = "/sapi/v1/simple-earn/flexible/history/collateralRecord";
    /**
     * GET /sapi/v1/simple-earn/flexible/history/collateralRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/simple_earn/history/Get-Collateral-Record">
     *      https://developers.binance.com/docs/simple_earn/history/Get-Collateral-Record</a>
     */
    public String collateralRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }
}
