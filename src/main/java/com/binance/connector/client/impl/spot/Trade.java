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
 * <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#trading-endpoints">Spot Account/Trade Endpoint</a>
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
     * In addition to all parameters accepted by POST /api/v3/order, the following optional parameters are also accepted: <br>
     * computeCommissionRates -- optional/boolean -- Default: false <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#test-new-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#test-new-order-trade</a>
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
     * newClientOrderId -- optional/string -- A unique id among open orders. Automatically generated if not sent.<br>
     * strategyId -- optional/int <br>
     * strategyType -- optional/int -- The value cannot be less than 1000000.<br>
     * stopPrice -- optional/decimal -- Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.<br>
     * trailingDelta -- optional/long -- Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.<br>
     * icebergQty -- optional/decimal -- Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order.<br>
     * newOrderRespType -- optional/enum -- Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK.<br>
     * selfTradePrevention -- optional/enum -- 	The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>s
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#new-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#new-order-trade</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-trade</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-trade</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-order-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-order-user_data</a>
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
     * stopStrategyId -- optional/int <br>
     * stopStrategyType -- optional/int -- The value cannot be less than 1000000.<br>
     * stopPrice -- optional/decimal <br>
     * icebergQty -- optional/decimal <br>
     * trailingDelta -- optional/long <br>
     * newOrderRespType -- optional/enum -- Allowed values: ACK, RESULT, FULL. MARKET and LIMIT orders types default to FULL; all other orders default to ACK<br>
     * selfTradePreventionMode -- optional/enum -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * cancelRestrictions -- optional/enum -- Supported values: ONLY_NEW - Cancel will succeed if the order status is NEW. ONLY_PARTIALLY_FILLED - Cancel will succeed if order status is PARTIALLY_FILLED.<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-an-existing-order-and-send-a-new-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-an-existing-order-and-send-a-new-order-trade</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#current-open-orders-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#current-open-orders-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#all-orders-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#all-orders-user_data</a>
     */
    public String getOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ALL_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-list-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#cancel-order-list-trade</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-order-lists-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-order-lists-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-all-order-lists-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-all-order-lists-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-open-order-lists-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-open-order-lists-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#account-information-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#account-information-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#account-trade-list-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#account-trade-list-user_data</a>
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
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-current-order-count-usage-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-current-order-count-usage-trade</a>
     */
    public String rateLimitOrder(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, RATE_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PREVENTED_MATCHES = "/api/v3/myPreventedMatches";
    /**
     * Displays the list of orders that were expired because of STP.
     * 
     * These are the combinations supported:
     * 
     * * symbol + preventedMatchId
     * * symbol + orderId
     * * symbol + orderId + fromPreventedMatchId (limit will default to 500)
     * * symbol + orderId + fromPreventedMatchId + limit
     * 
     * <br><br>
     * GET /api/v3/myPreventedMatches
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * preventedMatchId -- optional/long <br>
     * orderId -- optional/long -- Order id <br>
     * fromPreventedMatchId -- optional/long <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-prevented-matches-user_data">
     *      https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-prevented-matches-user_data</a>
     */
    public String preventedMatches(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, PREVENTED_MATCHES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SOR_ALLOCATIONS = "/api/v3/myAllocations";
    /**
     * Retrieves allocations resulting from SOR order placement.
     * 
     * 
     * Supported parameter combinations:
     * Parameters 	                          Response
     * symbol 	                              allocations from oldest to newest
     * symbol + startTime 	                  oldest allocations since startTime
     * symbol + endTime 	                    newest allocations until endTime
     * symbol + startTime + endTime 	        allocations within the time range
     * symbol + fromAllocationId 	          allocations by allocation ID
     * symbol + orderId 	                    allocations related to an order starting with oldest
     * symbol + orderId + fromAllocationId 	allocations related to an order by allocation ID
     * 
     * Note: The time between startTime and endTime can't be longer than 24 hours.
     * <br><br>
     * GET /api/v3/myAllocations
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- Trading symbol, e.g. BNBUSDT <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * fromAllocationId -- optional/int <br>
     * limit -- optional/int -- Default 500; max 1000. <br>
     * orderId -- optional/long -- Order id <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-allocations-user_data">
     *      https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-allocations-user_data</a>
     */
    public String sorAllocations(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, SOR_ALLOCATIONS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COMMISSION = "/api/v3/account/commission";
    /**
     * Get current account commission rates.
     * <br><br>
     * GET /api/v3/account/commission
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-commission-rates-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/rest-api#query-commission-rates-user_data</a>
     */
    public String commission(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, COMMISSION, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SOR_ORDER = "/api/v3/sor/order";
    /**
     * Places an order using smart order routing (SOR).
     * 
     * <br><br>
     * POST /api/v3/sor/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- Trading symbol, e.g. BNBUSDT <br>
     * side -- mandatory/enum <br>
     * type -- mandatory/enum -- only supports LIMIT and MARKET orders <br>
     * timeInForce -- optional/enum -- Order time in force <br>
     * quantity -- mandatory/decimal <br>
     * price -- optional/decimal <br>
     * newClientOrderId -- optional/string -- Used to uniquely identify this cancel. Automatically generated by default <br>
     * strategyId -- optional/int <br>
     * strategyType -- optional/int -- The value cannot be less than 1000000. <br>
     * icebergQty -- optional/decimal -- Used with LIMIT to create an iceberg order. <br>
     * newOrderRespType -- optional/enum -- Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. <br>
     * selfTradePreventionMode -- optional/enum -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/testnet/rest-api#new-order-using-sor-trade">
     *      https://developers.binance.com/docs/binance-spot-api-docs/testnet/rest-api#new-order-using-sor-trade</a>
     */
    public String sorOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        return requestHandler.sendSignedRequest(baseUrl, SOR_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String TEST_SOR_ORDER = "/api/v3/sor/order/test";
    /**
     * Test new order creation and signature/recvWindow using smart order routing (SOR).
     * Creates and validates a new order but does not send it into the matching engine.
     * <br><br>
     * POST /api/v3/sor/order/test
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * In addition to all parameters accepted by POST /api/v3/sor/order, the following optional parameters are also accepted: <br>
     * computeCommissionRates -- optional/boolean -- Default: false <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/testnet/rest-api#test-new-order-using-sor-trade">
     *      https://developers.binance.com/docs/binance-spot-api-docs/testnet/rest-api#test-new-order-using-sor-trade</a>
     */
    public String testSorOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        return requestHandler.sendSignedRequest(baseUrl, TEST_SOR_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }
}
