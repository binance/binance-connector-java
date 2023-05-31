package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Convert Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#convert-endpoints">Convert Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Convert {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Convert(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Convert(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String TRADE_FLOW = "/sapi/v1/convert/tradeFlow";
    /**
     * GET /sapi/v1/convert/tradeFlow
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- mandatory/long <br>
     * endTime -- mandatory/long <br>
     * limit -- optional/int -- Default 100, Max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-convert-trade-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-convert-trade-history-user_data</a>
     */
    public String tradeFlow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        ParameterChecker.checkParameter(parameters, "endTime", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, TRADE_FLOW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String EXCHANGE_INFO = "/sapi/v1/convert/exchangeInfo";
    /**
     * GET /sapi/v1/convert/exchangeInfo
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromAsset -- optional/string <br>
     * toAsset -- optional/string <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#list-all-convert-pairs">
     *     https://binance-docs.github.io/apidocs/spot/en/#list-all-convert-pairs</a>
     */
    public String exchangeInfo(Map<String, Object> parameters) {
        return requestHandler.sendPublicRequest(baseUrl, EXCHANGE_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ASSET_QUANTITY_PRECISION = "/sapi/v1/convert/assetInfo";
    /**
     * GET /sapi/v1/convert/assetInfo
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-order-quantity-precision-per-asset-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-order-quantity-precision-per-asset-user_data</a>
     */
    public String assetQuantityPrecision(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ASSET_QUANTITY_PRECISION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String QUOTE_INQUIRY = "/sapi/v1/convert/getQuote";
    /**
     * POST /sapi/v1/convert/getQuote
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromAsset -- mandatory/string <br>
     * toAsset -- mandatory/string <br>
     * fromAmount -- optional/double -- Send either fromAmount or toAmount<br>
     * toAmount -- optional/double -- Send either fromAmount or toAmount<br>
     * walletType -- optional/string -- SPOT or FUNDING. Default is SPOT <br>
     * validTime -- optional/string -- 10s, 30s, 1m, 2m, default 10s <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#send-quote-request-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#send-quote-request-user_data</a>
     */
    public String quoteInquiry(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "fromAsset", String.class);
        ParameterChecker.checkParameter(parameters, "toAsset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, QUOTE_INQUIRY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ACCEPT_QUOTE = "/sapi/v1/convert/acceptQuote";
    /**
     * POST /sapi/v1/convert/acceptQuote
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteId -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#accept-quote-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#accept-quote-trade</a>
     */
    public String acceptQuote(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "quoteId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ACCEPT_QUOTE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ORDER_STATUS = "/sapi/v1/convert/orderStatus";
    /**
     * GET /sapi/v1/convert/orderStatus
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteId -- optional/string <br>
     * quoteId -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#order-status-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#order-status-user_data</a>
     */
    public String orderStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ORDER_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }
}
