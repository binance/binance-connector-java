package com.binance.connector.client.impl.websocketapi;

import org.json.JSONObject;

import com.binance.connector.client.utils.JSONParser;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

/**
 * <h2>Trading Requests</h2>
 * All requests under the
 * <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#trading-requests">Trading requests</a>
 * section of the WebSocket API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketApiTrade implements WebSocketApiModule {
    private WebSocketApiRequestHandler handler;

    public WebSocketApiTrade(WebSocketApiRequestHandler handler) {  
        this.handler = handler;
    }

    /**
     * Send in a new order.<br>
     * 
     * Additional mandatory parameters (*) are determined by the new order type.<br>
     * 
     * @param symbol String
     * @param side String -- BUY or SELL
     * @param type String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * timeInForce -- optional/String <br>
     * price -- optional/double <br>
     * quantity -- optional/double <br>
     * quoteOrderQty -- optional/double <br>
     * newClientOrderId -- optional/String -- Arbitrary unique ID among open orders. Automatically generated if not sent<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL. MARKET and LIMIT orders use FULL by default, other order types default to ACK.<br>
     * stopPrice -- optional/double <br>
     * trailingDelta -- optional/int -- see https://github.com/binance/binance-spot-api-docs/blob/master/faqs/trailing-stop-faq.md<br>
     * icebergQty -- optional/double <br>
     * strategyId -- optional/int -- Arbitrary numeric value identifying the order within an order strategy.<br>
     * strategyType -- optional/int -- Arbitrary numeric value identifying the order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#place-new-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#place-new-order-trade</a>
     */
    public void newOrder(String symbol, String side, String type, JSONObject parameters) {

        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(type, String.class, "type");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "type", type);
        
        this.handler.signedRequest("order.place", parameters);
    }

    /**
     * Test order placement.<br>
     * 
     * Validates new order parameters and verifies your signature but does not send the order into the matching engine.<br>
     * Additional mandatory parameters (*) are determined by the new order type.<br>
     * 
     * @param symbol String
     * @param side String -- BUY or SELL
     * @param type String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * timeInForce -- optional/String <br>
     * price -- optional/double <br>
     * quantity -- optional/double <br>
     * quoteOrderQty -- optional/double <br>
     * newClientOrderId -- optional/String -- Arbitrary unique ID among open orders. Automatically generated if not sent<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL. MARKET and LIMIT orders use FULL by default, other order types default to ACK.<br>
     * stopPrice -- optional/double <br>
     * trailingDelta -- optional/int -- see https://github.com/binance/binance-spot-api-docs/blob/master/faqs/trailing-stop-faq.md<br>
     * icebergQty -- optional/double <br>
     * strategyId -- optional/int -- Arbitrary numeric value identifying the order within an order strategy.<br>
     * strategyType -- optional/int -- Arbitrary numeric value identifying the order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * computeCommissionRates -- optional/boolean -- Default: false.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#test-new-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#test-new-order-trade</a>
     */
    public void testNewOrder(String symbol, String side, String type, JSONObject parameters) {

        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(type, String.class, "type");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "type", type);
        
        this.handler.signedRequest("order.test", parameters);
    }

    /**
     * Check execution status of an order.<br>
     * 
     * If both orderId and origClientOrderId parameters are specified, only orderId is used and origClientOrderId is ignored.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * orderId -- optional/int -- Lookup order by orderId<br>
     * origClientOrderId -- optional/String -- Lookup order by clientOrderId<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#query-order-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#query-order-user_data</a>
     */
    public void getOrder(String symbol, JSONObject parameters) {
        ParameterChecker.checkOneOfParametersRequired(parameters, "orderId", "origClientOrderId");
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.signedRequest("order.status", parameters);
    }

    /**
     * Cancel an active order.<br>
     * 
     * If both orderId and origClientOrderId parameters are specified, only orderId is used and origClientOrderId is ignored.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * orderId -- optional/int -- Cancel order by orderId<br>
     * origClientOrderId -- optional/String -- Cancel order by clientOrderId<br>
     * newClientOrderId -- optional/String -- New ID for the canceled order. Automatically generated if not sent<br>
     * cancelRestrictions -- optional/enum -- Supported values: ONLY_NEW - Cancel will succeed if the order status is NEW. ONLY_PARTIALLY_FILLED - Cancel will succeed if order status is PARTIALLY_FILLED.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-order-trade</a>
     */
    public void cancelOrder(String symbol, JSONObject parameters) {
        ParameterChecker.checkOneOfParametersRequired(parameters, "orderId", "origClientOrderId");
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.signedRequest("order.cancel", parameters);
    }

    /**
     * Cancel an existing order and immediately place a new order instead of the canceled one.<br>
     * 
     * Similar to the order.place request, additional mandatory parameters (*) are determined by the new order type.<br>
     * If both cancelOrderId and cancelOrigClientOrderId parameters are specified, only cancelOrderId is used and cancelOrigClientOrderId is ignored.<br>
     * 
     * @param symbol String
     * @param cancelReplaceMode String -- STOP_ON_FAILURE or ALLOW_FAILURE
     * @param side String -- BUY or SELL
     * @param type String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * cancelOrderId -- optional/int -- Cancel order by orderId<br>
     * cancelOrigClientOrderId -- optional/String -- Cancel order by clientOrderId<br>
     * cancelNewClientOrderId -- optional/String -- New ID for the canceled order. Automatically generated if not sent<br>
     * timeInForce -- optional/String <br>
     * price -- optional/double <br>
     * quantity -- optional/double <br>
     * quoteOrderQty -- optional/double <br>
     * newClientOrderId -- optional/String -- Arbitrary unique ID among open orders. Automatically generated if not sent<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL. MARKET and LIMIT orders use FULL by default, other order types default to ACK.<br>
     * stopPrice -- optional/double <br>
     * trailingDelta -- optional/int -- see https://github.com/binance/binance-spot-api-docs/blob/master/faqs/trailing-stop-faq.md<br>
     * icebergQty -- optional/double <br>
     * strategyId -- optional/int -- Arbitrary numeric value identifying the order within an order strategy.<br>
     * strategyType -- optional/int -- Arbitrary numeric value identifying the order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * cancelRestrictions -- optional/enum -- Supported values: ONLY_NEW - Cancel will succeed if the order status is NEW. ONLY_PARTIALLY_FILLED - Cancel will succeed if order status is PARTIALLY_FILLED.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-and-replace-order-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-and-replace-order-trade</a>
     */
    public void cancelReplaceOrder(String symbol, String cancelReplaceMode, String side, String type, JSONObject parameters) {

        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(cancelReplaceMode, String.class, "cancelReplaceMode");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(type, String.class, "type");
        ParameterChecker.checkOneOfParametersRequired(parameters, "cancelOrderId", "cancelOrigClientOrderId");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "cancelReplaceMode", cancelReplaceMode);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "type", type);

        this.handler.signedRequest("order.cancelReplace", parameters);
    }

     /**
     * Query execution status of all open orders.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String -- If omitted, open orders for all symbols are returned<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#current-open-orders-user_data">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#current-open-orders-user_data</a>
     */
    public void getOpenOrders(JSONObject parameters) {
        this.handler.signedRequest("openOrders.status", parameters);
    }

    /**
     * Cancel all open orders on a symbol, including OCO orders. <br>
     * Cancellation reports for orders and OCOs have the same format as in order.cancel.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-open-orders-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#cancel-open-orders-trade</a>
     */
    public void cancelAllOpenOrders(String symbol, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.signedRequest("openOrders.cancelAll", parameters);
    }

    /**
     * Send in a new one-cancels-the-other (OCO) pair: LIMIT_MAKER + STOP_LOSS/STOP_LOSS_LIMIT orders (called legs), where activation of one order immediately cancels the other.
     * 
     * @param symbol String
     * @param side String -- BUY or SELL
     * @param price double -- Price for the limit order
     * @param quantity double
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * listClientOrderId -- optional/String -- Arbitrary unique ID among open OCOs. Automatically generated if not sent.<br>
     * limitClientOrderId -- optional/String -- Arbitrary unique ID among open orders for the limit order. Automatically generated if not sent.<br>
     * limitIcebergQty -- optional/double <br>
     * limitStrategyId -- optional/int -- Arbitrary numeric value identifying the limit order within an order strategy.<br>
     * limitStrategyType -- optional/int -- Arbitrary numeric value identifying the limit order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * stopPrice -- optional/double -- Either stopPrice or trailingDelta, or both must be specified <br>
     * trailingDelta -- optional/int -- see https://github.com/binance/binance-spot-api-docs/blob/master/faqs/trailing-stop-faq.md<br>
     * stopClientOrderId -- optional/String -- Arbitrary unique ID among open orders for the stop order. Automatically generated if not sent.<br>
     * stopLimitPrice -- optional/double <br>
     * stopLimitTimeInForce -- optional/String -- See order.place for available options<br>
     * stopIcebergQty -- optional/double <br>
     * stopStrategyId -- optional/int -- Arbitrary numeric value identifying the stop order within an order strategy.<br>
     * stopStrategyType -- optional/int -- Arbitrary numeric value identifying the stop order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL (default). <br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api</a>
     */
    public void newOcoOrder(String symbol, String side, double price, double quantity, JSONObject parameters) {
        ParameterChecker.checkOneOfParametersRequired(parameters, "stopPrice", "trailingDelta");
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(price, Double.class, "price");
        ParameterChecker.checkParameterType(quantity, Double.class, "quantity");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "price", price);
        parameters = JSONParser.addKeyValue(parameters, "quantity", quantity);
        
        this.handler.signedRequest("orderList.place", parameters);
    }

    /**
     * Check execution status of an OCO. <br>
     * 
     * If both origClientOrderId and orderListId parameters are specified, only origClientOrderId is used and orderListId is ignored. <br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * origClientOrderId -- optional/String -- Query OCO by listClientOrderId <br>
     * orderListId -- required/int -- Query OCO by orderListId <br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000 <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api</a>
     */
    public void getOcoOrder(JSONObject parameters) {
        ParameterChecker.checkOneOfParametersRequired(parameters, "origClientOrderId", "orderListId");
        this.handler.signedRequest("orderList.status", parameters);
    }

    /**
     * Cancel an active OCO.<br>
     * 
     * If both orderListId and listClientOrderId parameters are specified, only orderListId is used and listClientOrderId is ignored.<br>
     * Canceling an individual leg with order.cancel will cancel the entire OCO as well.<br>
     * 
     * @param symbol String
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * listClientOrderId -- optional/String -- Cancel OCO by listClientOrderId <br>
     * orderListId -- required/int -- Cancel OCO by orderListId <br>
     * newClientOrderId -- optional/String -- New ID for the canceled OCO. Automatically generated if not sent.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000 <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api</a>
     */
    public void cancelOcoOrder(String symbol, JSONObject parameters) {
        ParameterChecker.checkOneOfParametersRequired(parameters, "listClientOrderId", "orderListId");
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        
        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        this.handler.signedRequest("orderList.cancel", parameters);
    }

    /**
     * Query execution status of all open OCOs.<br>
     * 
     * If both orderListId and listClientOrderId parameters are specified, only orderListId is used and listClientOrderId is ignored.<br>
     * Canceling an individual leg with order.cancel will cancel the entire OCO as well.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000 <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api</a>
     */
    public void getOpenOcoOrders(JSONObject parameters) {
        this.handler.signedRequest("openOrderLists.status", parameters);
    }

    /**
     * Places an order using smart order routing (SOR).
     * 
     * @param symbol String
     * @param side String -- BUY or SELL
     * @param type String
     * @param quantity double
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * timeInForce -- optional/String -- Applicable only to LIMIT order type.<br>
     * price -- optional/double -- Applicable only to LIMIT order type.<br>
     * newClientOrderId -- optional/String -- Arbitrary unique ID among open orders. Automatically generated if not sent<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL. MARKET and LIMIT orders use FULL by default, other order types default to ACK.<br>
     * stopPrice -- optional/double <br>
     * icebergQty -- optional/double <br>
     * strategyId -- optional/int -- Arbitrary numeric value identifying the order within an order strategy.<br>
     * strategyType -- optional/int -- Arbitrary numeric value identifying the order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#place-new-order-using-sor-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#place-new-order-using-sor-trade</a>
     */
    public void newSorOrder(String symbol, String side, String type, double quantity, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(type, String.class, "type");
        ParameterChecker.checkParameterType(quantity, Double.class, "quantity");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "type", type);
        parameters = JSONParser.addKeyValue(parameters, "quantity", quantity);
        
        this.handler.signedRequest("sor.order.place", parameters);
    }

    /**
     * Test new order creation and signature/recvWindow using smart order routing (SOR). Creates and validates a new order but does not send it into the matching engine.
     * 
     * @param symbol String
     * @param side String -- BUY or SELL
     * @param type String
     * @param quantity double
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * timeInForce -- optional/String -- Applicable only to LIMIT order type.<br>
     * price -- optional/double -- Applicable only to LIMIT order type.<br>
     * newClientOrderId -- optional/String -- Arbitrary unique ID among open orders. Automatically generated if not sent<br>
     * newOrderRespType -- optional/String -- Select response format: ACK, RESULT, FULL. MARKET and LIMIT orders use FULL by default, other order types default to ACK.<br>
     * stopPrice -- optional/double <br>
     * icebergQty -- optional/double <br>
     * strategyId -- optional/int -- Arbitrary numeric value identifying the order within an order strategy.<br>
     * strategyType -- optional/int -- Arbitrary numeric value identifying the order strategy. Values smaller than 1000000 are reserved and cannot be used.<br>
     * selfTradePreventionMode -- optional/String -- The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE.<br>
     * computeCommissionRates -- optional/boolean -- Default: false.<br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#test-new-order-using-sor-trade">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#test-new-order-using-sor-trade</a>
     */
    public void testNewSorOrder(String symbol, String side, String type, double quantity, JSONObject parameters) {
        ParameterChecker.checkParameterType(symbol, String.class, "symbol");
        ParameterChecker.checkParameterType(side, String.class, "side");
        ParameterChecker.checkParameterType(type, String.class, "type");
        ParameterChecker.checkParameterType(quantity, Double.class, "quantity");

        parameters = JSONParser.addKeyValue(parameters, "symbol", symbol);
        parameters = JSONParser.addKeyValue(parameters, "side", side);
        parameters = JSONParser.addKeyValue(parameters, "type", type);
        parameters = JSONParser.addKeyValue(parameters, "quantity", quantity);
        
        this.handler.signedRequest("sor.order.test", parameters);
    }

}