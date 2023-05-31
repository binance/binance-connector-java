package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Savings Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#savings-endpoints">Savings Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Savings {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Savings(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Savings(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String FLEXIBLE_PRODUCT = "/sapi/v1/lending/daily/product/list";
    /**
     * GET /sapi/v1/lending/daily/product/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * status -- optional/enum -- "ALL", "SUBSCRIBABLE", "UNSUBSCRIBABLE"; Default: "ALL" <br>
     * featured -- optional/string -- "ALL", "TRUE"; Default: "ALL" <br>
     * current -- optional/long -- Current query page. Default: 1, Min: 1 <br>
     * size -- optional/long -- Default: 50, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-flexible-product-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-flexible-product-list-user_data</a>
     */
    public String flexibleProducts(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_PRODUCT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PURCHASE_QUOTA = "/sapi/v1/lending/daily/userLeftQuota";
    /**
     * GET /sapi/v1/lending/daily/userLeftQuota
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-left-daily-purchase-quota-of-flexible-product-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-left-daily-purchase-quota-of-flexible-product-user_data</a>
     */
    public String purchaseQuotaFlexible(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, PURCHASE_QUOTA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PURCHASE_PRODUCT = "/sapi/v1/lending/daily/purchase";
    /**
     * POST /sapi/v1/lending/daily/purchase
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string<br>
     * amount -- mandatory/decimal<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#purchase-flexible-product-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#purchase-flexible-product-user_data</a>
     */
    public String purchaseFlexibleProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, PURCHASE_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String DAILY_REDEMPTION_QUOTA = "/sapi/v1/lending/daily/userRedemptionQuota";
    /**
     * GET /sapi/v1/lending/daily/userRedemptionQuota
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string<br>
     * type -- mandatory/enum -- "FAST", "NORMAL"<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-left-daily-redemption-quota-of-flexible-product-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-left-daily-redemption-quota-of-flexible-product-user_data</a>
     */
    public String dailyRedemptionQuota(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, DAILY_REDEMPTION_QUOTA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REDEEM_PRODUCT = "/sapi/v1/lending/daily/redeem";
    /**
     * POST /sapi/v1/lending/daily/redeem
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * productId -- mandatory/string<br>
     * amount -- mandatory/decimal<br>
     * type -- mandatory/enum -- "FAST", "NORMAL"<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#redeem-flexible-product-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#redeem-flexible-product-user_data</a>
     */
    public String redeemFlexibleProduct(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "productId", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_PRODUCT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String PRODUCT_POSTION = "/sapi/v1/lending/daily/token/position";
    /**
     * GET /sapi/v1/lending/daily/token/position
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-flexible-product-position-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-flexible-product-position-user_data</a>
     */
    public String flexibleProductPosition(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, PRODUCT_POSTION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACTIVITY_PROJECT = "/sapi/v1/lending/project/list";
    /**
     * GET /sapi/v1/lending/project/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string<br>
     * type -- mandatory/enum -- "ACTIVITY", "CUSTOMIZED_FIXED" <br>
     * status -- optional/enum -- "ALL", "SUBSCRIBABLE", "UNSUBSCRIBABLE"; default "ALL" <br>
     * isSortAsc -- optional/boolean -- default "true" <br>
     * sortBy -- optional/enum -- "START_TIME", "LOT_SIZE", "INTEREST_RATE", "DURATION"; default "START_TIME" <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10, Max:100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-fixed-and-activity-project-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-fixed-and-activity-project-list-user_data</a>
     */
    public String projectList(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ACTIVITY_PROJECT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PURCHASE_ACTIVITY = "/sapi/v1/lending/customizedFixed/purchase";
    /**
     * POST /sapi/v1/lending/customizedFixed/purchase
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * projectId -- mandatory/string <br>
     * lot -- mandatory/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#purchase-fixed-activity-project-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#purchase-fixed-activity-project-user_data</a>
     */
    public String purchaseProject(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "projectId", String.class);
        ParameterChecker.checkParameter(parameters, "lot", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, PURCHASE_ACTIVITY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String PROJECT_POSITION = "/sapi/v1/lending/project/position/list";
    /**
     * GET /sapi/v1/lending/project/position/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * projectId -- optional/string <br>
     * status -- optional/enum -- "HOLDING", "REDEEMED" <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-fixed-activity-project-position-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-fixed-activity-project-position-user_data</a>
     */
    public String projectPosition(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, PROJECT_POSITION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LENDING_ACCOUNT = "/sapi/v1/lending/union/account";
    /**
     * GET /sapi/v1/lending/union/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#lending-account-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#lending-account-user_data</a>
     */
    public String lendingAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LENDING_ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PURCHASE_RECORD = "/sapi/v1/lending/union/purchaseRecord";
    /**
     * GET /sapi/v1/lending/union/purchaseRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * lendingType -- mandatory/enum -- "DAILY" for flexible, "ACTIVITY" for activity, "CUSTOMIZED_FIXED" for fixed <br>
     * asset -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10, Max:100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-purchase-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-purchase-record-user_data</a>
     */
    public String purchaseRecord(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "lendingType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, PURCHASE_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REDEMPTION_RECORD = "/sapi/v1/lending/union/redemptionRecord";
    /**
     * GET /sapi/v1/lending/union/redemptionRecord
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * lendingType -- mandatory/enum -- "DAILY" for flexible, "ACTIVITY" for activity, "CUSTOMIZED_FIXED" for fixed <br>
     * asset -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10, Max:100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-redemption-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-redemption-record-user_data</a>
     */
    public String redemptionRecord(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "lendingType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEMPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INTEREST_HISTORY = "/sapi/v1/lending/union/interestHistory";
    /**
     * GET /sapi/v1/lending/union/interestHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * lendingType -- mandatory/enum -- "DAILY" for flexible, "ACTIVITY" for activity, "CUSTOMIZED_FIXED" for fixed<br>
     * asset -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10, Max:100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-interest-history-user_data-2">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-interest-history-user_data-2</a>
     */
    public String interestHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "lendingType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CHANGE_TO_DAILY_POSITION = "/sapi/v1/lending/positionChanged";
    /**
     * POST /sapi/v1/lending/positionChanged
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * projectId -- mandatory/string <br>
     * lot -- mandatory/long <br>
     * positionId -- optional/long -- for fixed position <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#change-fixed-activity-position-to-daily-position-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#change-fixed-activity-position-to-daily-position-user_data</a>
     */
    public String changeToDailyPosition(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "projectId", String.class);
        ParameterChecker.checkParameter(parameters, "lot", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, CHANGE_TO_DAILY_POSITION, parameters, HttpMethod.POST, showLimitUsage);
    }
}
