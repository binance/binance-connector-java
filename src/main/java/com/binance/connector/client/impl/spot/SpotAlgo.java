package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Spot Algo Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/algo/change-log">Spot Algo Endpoints</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class SpotAlgo {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public SpotAlgo(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public SpotAlgo(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String TWAP_ORDER = "/sapi/v1/algo/spot/newOrderTwap";
    /**
     * Place a new spot TWAP order with Algo service.
     * 
     * <br><br>
     * POST /sapi/v1/algo/spot/newOrderTwap
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- Trading symbol, e.g. BNBUSDT <br>
     * side -- mandatory/enum <br>
     * quantity -- mandatory/decimal -- Quantity of base asset; The notional (quantity * last price(base asset)) must be more than the equivalent of 1,000 USDT and less than the equivalent of 100,000 USDT. <br>
     * duration -- mandatory/long -- Duration for TWAP orders in seconds. [300, 86400]<br>
     * clientAlgoId -- optional/string -- A unique id among Algo orders (length should be 32 characters)， If it is not sent, we will give default value. <br>
     * limitPrice -- optional/decimal -- Limit price of the order; If it is not sent, will place order by market price by default. <br>
     * stpMode -- optional/enum -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Time-Weighted-Average-Price-New-Order">
     *      https://developers.binance.com/docs/algo/spot-algo/Time-Weighted-Average-Price-New-Order</a>
     */
    public String twapOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        ParameterChecker.checkParameter(parameters, "duration", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, TWAP_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String CANCEL_ORDER = "/sapi/v1/algo/spot/order";
    /**
     * Cancel an open TWAP order
     * 
     * <br><br>
     * DELETE /sapi/v1/algo/spot/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * algoId -- mandatory/long <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Cancel-Algo-Order">
     *      https://developers.binance.com/docs/algo/spot-algo/Cancel-Algo-Order</a>
     */
    public String cancelOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "algoId", Long.class);
        return requestHandler.sendPublicRequest(baseUrl, CANCEL_ORDER, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String OPEN_ORDERS = "/sapi/v1/algo/spot/openOrders";
    /**
     * Get all open SPOT TWAP orders
     * 
     * <br><br>
     * GET /sapi/v1/algo/spot/openOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Query-Current-Algo-Open-Orders">
     *      https://developers.binance.com/docs/algo/spot-algo/Query-Current-Algo-Open-Orders</a>
     */
    public String getOpenOrders(Map<String, Object> parameters) {
        return requestHandler.sendPublicRequest(baseUrl, OPEN_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String HISTORICAL_ORDERS = "/sapi/v1/algo/spot/historicalOrders";
    /**
     * Get all historical SPOT TWAP orders
     * 
     * <br><br>
     * GET /sapi/v1/algo/spot/historicalOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- Trading symbol, e.g. BNBUSDT <br>
     * side -- optional/enum <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * page -- optional/int -- Default 1 <br>
     * pageSize -- optional/int -- MIN 1, MAX 100; Default 100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Query-Historical-Algo-Orders">
     *      https://developers.binance.com/docs/algo/spot-algo/Query-Historical-Algo-Orders</a>
     */
    public String getHistoricalOrders(Map<String, Object> parameters) {
        return requestHandler.sendPublicRequest(baseUrl, HISTORICAL_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SUB_ORDERS = "/sapi/v1/algo/spot/subOrders";
    /**
     * Get respective sub orders for a specified algoId
     * 
     * <br><br>
     * GET /sapi/v1/algo/spot/subOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * algoId -- mandatory/long <br>
     * page -- optional/int -- Default 1 <br>
     * pageSize -- optional/int -- MIN 1, MAX 100; Default 100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/algo/spot-algo/Query-Sub-Orders">
     *      https://developers.binance.com/docs/algo/spot-algo/Query-Sub-Orders</a>
     */
    public String getSubOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "algoId", Long.class);
        return requestHandler.sendPublicRequest(baseUrl, SUB_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }
}
