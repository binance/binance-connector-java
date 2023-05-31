package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>C2C Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#c2c-endpoints">C2C Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class C2C {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public C2C(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public C2C(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String LIST_ORDER_HISTORY = "/sapi/v1/c2c/orderMatch/listUserOrderHistory";
    /**
     * GET /sapi/v1/c2c/orderMatch/listUserOrderHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * tradeType -- mandatory/string -- BUY, SELL <br>
     * startTimestamp -- optional/long <br>
     * endTimestamp -- optional/long <br>
     * page -- optional/int -- default 1 <br>
     * rows -- optional/int -- default 100, max 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-c2c-trade-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-c2c-trade-history-user_data</a>
     */
    public String listUserOrderHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "tradeType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, LIST_ORDER_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }
}
