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
