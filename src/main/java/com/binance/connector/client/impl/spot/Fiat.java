package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Fiat Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#fiat-endpoints">Fiat Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Fiat {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Fiat(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Fiat(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String ORDERS = "/sapi/v1/fiat/orders";
    /**
     * GET /sapi/v1/fiat/orders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * transactionType -- mandatory/string -- 0-deposit,1-withdraw <br>
     * beginTime -- optional/long <br>
     * endTime -- optional/long <br>
     * page -- optional/int -- default 1 <br>
     * rows -- optional/int -- default 100, max 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-fiat-deposit-withdraw-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-fiat-deposit-withdraw-history-user_data</a>
     */
    public String orders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "transactionType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PAYMENTS = "/sapi/v1/fiat/payments";
    /**
     * GET /sapi/v1/fiat/payments
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * transactionType -- mandatory/string -- 0-buy,1-sell <br>
     * beginTime -- optional/long <br>
     * endTime -- optional/long <br>
     * page -- optional/int -- default 1 <br>
     * rows -- optional/int -- default 100, max 500 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-fiat-payments-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-fiat-payments-history-user_data</a>
     */
    public String payments(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "transactionType", String.class);
        return requestHandler.sendSignedRequest(baseUrl, PAYMENTS, parameters, HttpMethod.GET, showLimitUsage);
    }
}
