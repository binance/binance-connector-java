package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Trade Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#spot-account-trade">Spot Account/Trade Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Trade {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Trade(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }
    
    public Trade(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String TEST_NEW_ORDER = "/api/v3/order/test";
    /**
     * Test new order creation and signature/recvWindow long.
     * Creates and validates a new order but does not send it into the matching engine.
     * <br><br>
     * POST /api/v3/order/test
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * side -- mandatory/enum <br>
     * type -- mandatory/enum <br>
     * timeInForce -- optional/enum <br>
     * quantity -- optional/decimal <br>
     * quoteOrderQty -- optional/decimal <br>
     * price -- optional/decimal <br>
     * newClientOrderId -- optional/string <br>
     * stopPrice -- optional/decimal <br>
     * icebergQty -- optional/decimal <br>
     * trailingDelta -- optional/long <br>
     * newOrderRespType -- optional/enum <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#test-new-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#test-new-order-trade</a>
     */
    public String testNewOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, TEST_NEW_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ORDER = "/api/v3/order";
    /**
     * Send in a new order.
     * <br><br>
     * POST /api/v3/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * side -- mandatory/enum <br>
     * type -- mandatory/enum <br>
     * timeInForce -- optional/enum <br>
     * quantity -- optional/decimal <br>
     * quoteOrderQty -- optional/decimal <br>
     * price -- optional/decimal <br>
     * newClientOrderId -- optional/string <br>
     * stopPrice -- optional/decimal <br>
     * icebergQty -- optional/decimal <br>
     * trailingDelta -- optional/long <br>
     * newOrderRespType -- optional/enum <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#new-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#new-order-trade</a>
     */
    public String newOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * Cancel an active order.
     * <br><br>
     * DELETE /api/v3/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * orderId -- optional/long <br>
     * origClientOrderId -- optional/string <br>
     * newClientOrderId -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cancel-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#cancel-order-trade</a>
     */
    public String cancelOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String ALL_OPEN_ORDERS = "/api/v3/openOrders";
    /**
     * Cancels all active orders on a symbol.
     * This includes OCO orders.
     * <br><br>
     * DELETE /api/v3/openOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cancel-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#cancel-order-trade</a>
     */
    public String cancelOpenOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ALL_OPEN_ORDERS, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    /**
     * Check an order's status.
     * <br><br>
     * GET /api/v3/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * orderId -- optional/long <br>
     * origClientOrderId -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-order-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-order-user_data</a>
     */
    public String getOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CANCEL_REPLACE = "/api/v3/order/cancelReplace";
    /**
     * Cancels an existing order and places a new order on the same symbol.<br>
     * Filters are evaluated before the cancel order is placed.<br>
     * If the new order placement is successfully sent to the engine, the order count will increase by 1.
     * <br><br>
     * POST /api/v3/order/cancelReplace
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * side -- mandatory/enum <br>
     * type -- mandatory/enum <br>
     * cancelReplaceMode -- mandatory/enum -- The allowed values are: STOP_ON_FAILURE - If the cancel request fails, the new order placement will not be attempted. ALLOW_FAILURES - new order placement will be attempted even if cancel request fails. <br>
     * timeInForce -- optional/enum <br>
     * quantity -- optional/decimal <br>
     * quoteOrderQty -- optional/decimal <br>
     * price -- optional/decimal <br>
     * cancelNewClientOrderId -- optional/string <br>
     * cancelOrigClientOrderId -- optional/string -- Either the cancelOrigClientOrderId or cancelOrderId must be provided. If both are provided, cancelOrderId takes precedence. <br>
     * cancelOrderId -- optional/long -- Either the cancelOrigClientOrderId or cancelOrderId must be provided. If both are provided, cancelOrderId takes precedence. <br>
     * newClientOrderId -- optional/string -- Used to identify the new order. <br>
     * stopPrice -- optional/decimal <br>
     * icebergQty -- optional/decimal <br>
     * trailingDelta -- optional/long <br>
     * newOrderRespType -- optional/enum <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cancel-an-existing-order-and-send-a-new-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#cancel-an-existing-order-and-send-a-new-order-trade</a>
     */
    public String cancelReplace(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkParameter(parameters, "cancelReplaceMode", String.class);
        return requestHandler.sendSignedRequest(baseUrl, CANCEL_REPLACE, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * Get all open orders on a symbol. Careful when accessing this with no symbol.
     * <br><br>
     * GET /api/v3/openOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#current-open-orders-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#current-open-orders-user_data</a>
     */
    public String getOpenOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ALL_OPEN_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ORDERS = "/api/v3/allOrders";
    /**
     * Get all account orders; active, canceled, or filled.
     * <br><br>
     * GET /api/v3/allOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * orderId -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#all-orders-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#all-orders-user_data</a>
     */
    public String getOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ALL_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String OCO_ORDER = "/api/v3/order/oco";
    /**
     * Send in a new OCO.
     * <br><br>
     * POST /api/v3/order/oco
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * listClientOrderId -- optional/string <br>
     * side -- mandatory/enum <br>
     * quantity -- mandatory/decimal <br>
     * limitClientOrderId -- optional/string <br>
     * price -- mandatory/decimal <br>
     * limitIcebergQty -- optional/decimal <br>
     * trailingDelta -- optional/long <br>
     * stopClientOrderId -- optional/string <br>
     * stopPrice -- mandatory/decimal <br>
     * stopLimitPrice -- optional/decimal <br>
     * stopIcebergQty -- optional/decimal <br>
     * stopLimitTimeInForce -- optional/enum <br>
     * newOrderRespType -- optional/enum <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#new-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#new-order-trade</a>
     */
    public String ocoOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        ParameterChecker.checkRequiredParameter(parameters, "price");
        ParameterChecker.checkRequiredParameter(parameters, "stopPrice");
        return requestHandler.sendSignedRequest(baseUrl, OCO_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String OCO_LIST = "/api/v3/orderList";
    /**
     * Cancel an entire Order List.
     * <br><br>
     * DELETE /api/v3/orderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * orderListId -- optional/string <br>
     * listClientOrderId -- optional/string <br>
     * newClientOrderId -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cancel-oco-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#cancel-oco-trade</a>
     */
    public String cancelOCO(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, OCO_LIST, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    /**
     * Retrieves a specific OCO based on provided optional parameters
     * <br><br>
     * GET /api/v3/orderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderListId -- optional/string <br>
     * origClientOrderId -- optional/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-oco-user_data</a>
     */
    public String getOCOOrder(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, OCO_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_OCO_LIST = "/api/v3/allOrderList";
    /**
     * Retrieves all OCO based on provided optional parameters
     * <br><br>
     * GET /api/v3/allOrderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * fromId -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-oco-user_data</a>
     */
    public String getOCOOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ALL_OCO_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_OPEN_OCO_LIST = "/api/v3/openOrderList";
    /**
     * GET /api/v3/openOrderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-open-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-open-oco-user_data</a>
     */
    public String getOpenOCOOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ALL_OPEN_OCO_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACCOUNT_INFO = "/api/v3/account";
    /**
     * Get current account information.
     * <br><br>
     * GET /api/v3/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#account-information-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#account-information-user_data</a>
     */
    public String account(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT_INFO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACCOUNT_TRADES = "/api/v3/myTrades";
    /**
     * Get trades for a specific account and symbol.
     * <br><br>
     * GET /api/v3/myTrades
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * orderId -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * fromId -- optional/long <br>
     * limit -- optional/int <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#account-trade-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#account-trade-list-user_data</a>
     */
    public String myTrades(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT_TRADES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String RATE_LIMIT = "/api/v3/rateLimit/order";
    /**
     * Displays the user's current order count usage for all intervals.
     * <br><br>
     * GET /api/v3/rateLimit/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-current-order-count-usage-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-current-order-count-usage-trade</a>
     */
    public String rateLimitOrder(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, RATE_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }
}
