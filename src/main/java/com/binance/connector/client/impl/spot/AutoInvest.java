package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Auto-Invest Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#auto-invest-endpoints">Auto-Invest Endpoints</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class AutoInvest {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public AutoInvest(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public AutoInvest(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String TARGET_ASSET_LIST = "/sapi/v1/lending/auto-invest/target-asset/list";
    /**
     * GET /sapi/v1/lending/auto-invest/target-asset/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * targetAsset -- optional/string <br>
     * size -- optional/long -- Default:8 Max:100 <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-target-asset-list-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#get-target-asset-list-user_data</a>
     */
    public String targetAssetList(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, TARGET_ASSET_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String TARGET_ASSET_ROI_LIST = "/sapi/v1/lending/auto-invest/target-asset/roi/list";
    /**
     * ROI return list for target asset
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/target-asset/roi/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * targetAsset -- mandatory/string <br>
     * hisRoiType -- mandatory/enum -- FIVE_YEAR,THREE_YEAR,ONE_YEAR,SIX_MONTH,THREE_MONTH,SEVEN_DAY <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-target-asset-roi-data-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#get-target-asset-roi-data-user_data</a>
     */
    public String targetAssetRoiList(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "targetAsset", String.class);
        ParameterChecker.checkParameter(parameters, "hisRoiType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, TARGET_ASSET_ROI_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_SOURCE_AND_TARGET_ASSETS = "/sapi/v1/lending/auto-invest/all/asset";
    /**
     * Query all source assets and target assets
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/all/asset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-all-source-asset-and-target-asset-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-all-source-asset-and-target-asset-user_data</a>
     */
    public String allSourceAndTargetAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ALL_SOURCE_AND_TARGET_ASSETS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SOURCE_ASSET_LIST = "/sapi/v1/lending/auto-invest/source-asset/list";
    /**
     * Query Source Asset to be used for investment
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/source-asset/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * targetAsset -- optional/string -- Example: BTC,ETH,BNB <br>
     * indexId -- optional/long <br>
     * usageType -- mandatory/string -- "RECURRING", "ONE_TIME" <br>
     * flexibleAllowedToUse -- optional/boolean <br>
     * sourceType -- optional/enum -- MAIN_SITE for Binance user,TR for Binance Turkey user <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-source-asset-list-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-source-asset-list-user_data</a>
     */
    public String sourceAssetList(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "usageType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SOURCE_ASSET_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CHANGE_PLAN_STATUS = "/sapi/v1/lending/auto-invest/plan/edit-status";
    /**
     * Change Plan Status
     * <br><br>
     * POST /sapi/v1/lending/auto-invest/plan/edit-status
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * planId -- mandatory/long <br>
     * status -- mandatory/enum -- "ONGOING","PAUSED","REMOVED"<br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#change-plan-status-trade">
     *      https://binance-docs.github.io/apidocs/spot/en/#change-plan-status-trade</a>
     */
    public String changePlanStatus(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "planId", Long.class);
        ParameterChecker.checkParameter(parameters, "status", String.class);
        return requestHandler.sendPublicRequest(baseUrl, CHANGE_PLAN_STATUS, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String PLANS = "/sapi/v1/lending/auto-invest/plan/list";
    /**
     * Query plan lists
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/plan/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * planType -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-list-of-plans-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#get-list-of-plans-user_data</a>
     */
    public String plansList(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "planType", String.class);
        return requestHandler.sendPublicRequest(baseUrl, PLANS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String HOLDING_PLAN = "/sapi/v1/lending/auto-invest/plan/id";
    /**
     * Query holding details of the plan
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/plan/id
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * planId -- optional/long <br>
     * requestId -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-holding-details-of-the-plan-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-holding-details-of-the-plan-user_data</a>
     */
    public String holdingPlan(Map<String, Object> parameters) {
        return requestHandler.sendPublicRequest(baseUrl, HOLDING_PLAN, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PLAN_SUBSCRIPTIONS_HISTORY = "/sapi/v1/lending/auto-invest/history/list";
    /**
     * Query the transaction history of plan subscriptions
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/history/list
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * planId -- optional/long <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * targetAsset -- optional/string <br>
     * planType -- optional/enum <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-subscription-transaction-history-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-subscription-transaction-history-user_data</a>
     */
    public String planSubsHistory(Map<String, Object> parameters) {
        return requestHandler.sendPublicRequest(baseUrl, PLAN_SUBSCRIPTIONS_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INDEX_INFO = "/sapi/v1/lending/auto-invest/index/info";
    /**
     * Query index details
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/index/info
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * indexId -- mandatory/long <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-index-details-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-index-details-user_data</a>
     */
    public String indexInfo(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "indexId", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, INDEX_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INDEX_USER_SUMMARY = "/sapi/v1/lending/auto-invest/index/user-summary";
    /**
     * Details on users Index-Linked plan position details
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/index/user-summary
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * indexId -- mandatory/long <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-index-linked-plan-position-details-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-index-linked-plan-position-details-user_data</a>
     */
    public String userIndexPlans(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "indexId", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, INDEX_USER_SUMMARY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ONE_TIME_TRANSACTION = "/sapi/v1/lending/auto-invest/one-off";
    /**
     * One time transaction
     * 
     * <br><br>
     * POST /sapi/v1/lending/auto-invest/one-off
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * sourceType -- mandatory/string -- "MAIN_SITE" for Binance,"TR" for Binance Turkey<br>
     * requestId -- optional/string -- If not null, must follow sourceType + unique string, e.g: TR12354859<br>
     * subscriptionAmount -- mandatory/decimal <br>
     * sourceAsset -- mandatory/string <br>
     * flexibleAllowedToUse -- optional/boolean -- true/false；true: using flexible wallet<br>
     * planId -- optional/long -- portfolio plan's Id<br>
     * indexId -- optional/long <br>
     * details -- optional/arraylist --  The "PortfolioDetail" class contains 2 fields: "targetAsset" and "percentage". <br>
     *                                   The sum of all the "PortfolioDetail" percentages in the Array should be 100. <br>
     *                                   "details" example:<br>
     *                                      details[0].targetAsset=BTC, details[0].percentage=60 <br>
     *                                      details[1].targetAsset=ETH, details[1].percentage=40 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#one-time-transaction-trade">
     *      https://binance-docs.github.io/apidocs/spot/en/#one-time-transaction-trade</a>
     */
    public String submitOneTimeTransaction(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "sourceType", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "subscriptionAmount");
        ParameterChecker.checkParameter(parameters, "sourceAsset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ONE_TIME_TRANSACTION, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ONE_TIME_TRANSACTION_STATUS = "/sapi/v1/lending/auto-invest/one-off/status";
    /**
     * Transaction status for one-time transaction
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/one-off/status
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * transactionId -- mandatory/long -- portfolio plan's Id<br>
     * requestId -- optional/string -- transactionId and requestId cannot be empty at the same time <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-one-time-transaction-status-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-one-time-transaction-status-user_data</a>
     */
    public String oneTimeTransactionStatus(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "transactionId", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, ONE_TIME_TRANSACTION_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REDEEM_INDEX_PLAN = "/sapi/v1/lending/auto-invest/redeem";
    /**
     * To redeem index-Linked plan holdings
     * 
     * <br><br>
     * POST /sapi/v1/lending/auto-invest/redeem
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * indexId -- mandatory/long -- portfolio plan's Id <br>
     * requestId -- optional/string -- transactionId and requestId cannot be empty at the same time <br>
     * redemptionPercentage -- mandatory/long -- user redeem percentage,10/20/100. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-redemption-trade">
     *      https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-redemption-trade</a>
     */
    public String redeemIndexPlan(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "indexId", Long.class);
        ParameterChecker.checkParameter(parameters, "redemptionPercentage", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_INDEX_PLAN, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String INDEX_LINKED_PLAN_REDEMPTION_HISTORY = "/sapi/v1/lending/auto-invest/redeem/history";
    /**
     * Get the history of Index Linked Plan Redemption transactions
     * 
     * Max 30 day difference between startTime and endTime
     * If no startTime and endTime, default to show past 30 day records
     * 
     * <br><br>
     * GET /sapi/v1/lending/auto-invest/redeem/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * requestId -- mandatory/long <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * asset -- optional/string <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-redemption-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-redemption-user_data</a>
     */
    public String indexPlanRedeemHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "requestId", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, INDEX_LINKED_PLAN_REDEMPTION_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INDEX_LINKED_PLAN_REBALANCE_DETAILS = "/sapi/v1/lending/auto-invest/rebalance/history";
    /**
     * GET /sapi/v1/lending/auto-invest/rebalance/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-rebalance-details-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#index-linked-plan-rebalance-details-user_data</a>
     */
    public String indexPlanRebalanceInfo(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, INDEX_LINKED_PLAN_REBALANCE_DETAILS, parameters, HttpMethod.GET, showLimitUsage);
    }
}
