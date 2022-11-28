package com.binance.connector.client.impl.spot;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.SignatureGenerator;
import java.util.LinkedHashMap;

/**
 * <h2>BLVT Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#blvt-endpoints">BLVT Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Blvt {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Blvt(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey));
        this.showLimitUsage = showLimitUsage;
    }

    public Blvt(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator);
        this.showLimitUsage = showLimitUsage;
    }

    private final String BLVT_INFO = "/sapi/v1/blvt/tokenInfo";
    /**
     * GET /sapi/v1/blvt/tokenInfo
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- optional/string -- BTCDOWN, BTCUP <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-blvt-info-market_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-blvt-info-market_data</a>
     */
    public String blvtInfo(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendWithApiKeyRequest(baseUrl, BLVT_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUBSCRIBE = "/sapi/v1/blvt/subscribe";
    /**
     * POST /sapi/v1/blvt/subscribe
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- mandatory/string -- BTCDOWN, BTCUP <br>
     * cost -- mandatory/decimal -- spot balance <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#subscribe-blvt-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#subscribe-blvt-user_data</a>
     */
    public String subscribe(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "tokenName", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "cost");
        return requestHandler.sendSignedRequest(baseUrl, SUBSCRIBE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SUBSCRIPTION_RECORD = "/sapi/v1/blvt/subscribe/record";
    /**
     * GET /sapi/v1/blvt/subscribe/record
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- optional/string -- BTCDOWN, BTCUP <br>
     * id -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- default 1000, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-subscription-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-subscription-record-user_data</a>
     */
    public String subscriptionRecord(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SUBSCRIPTION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REDEEM = "/sapi/v1/blvt/redeem";
    /**
     * POST /sapi/v1/blvt/redeem
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- mandatory/string -- BTCDOWN, BTCUP <br>
     * amount -- mandatory/decimal -- spot balance <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#redeem-blvt-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#redeem-blvt-user_data</a>
     */
    public String redeem(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "tokenName", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, REDEEM, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REDEEM_RECORD = "/sapi/v1/blvt/redeem/record";
    /**
     * GET /sapi/v1/blvt/redeem/record
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- optional/string -- BTCDOWN, BTCUP <br>
     * id -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- default 1000, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-redemption-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-redemption-record-user_data</a>
     */
    public String redeemRecord(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String USER_LIMIT = "/sapi/v1/blvt/userLimit";
    /**
     * GET /sapi/v1/blvt/userLimit
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tokenName -- optional/string -- BTCDOWN, BTCUP <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-blvt-user-limit-info-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-blvt-user-limit-info-user_data</a>
     */
    public String userLimit(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, USER_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }
}
