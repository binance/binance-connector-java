package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Margin Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/margin_trading/Introduction">Margin Account/Trade Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Margin {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Margin(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Margin(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String BORROW_REPAY = "/sapi/v1/margin/borrow-repay";
    /**
     * POST /sapi/v1/margin/borrow-repay
     * <br>
     * @param 
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the param
     * <br><br>
     * asset -- mandatory/string <br>
     * isIsolated -- mandatory/string - TRUE for Isolated Margin, FALSE for Cross Margin, Default FALSE <br>
     * symbol -- mandatory/string - Only for Isolated margin <br>
     * amount -- mandatory/string <br>
     * type -- mandatory/string - BORROW or REPAY <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Margin-Account-Borrow-Repay">
     *     https://developers.binance.com/docs/margin_trading/borrow-and-repay/Margin-Account-Borrow-Repay</a>
     */
    public String borrowRepay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkParameter(parameters, "isIsolated", String.class);
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "amount", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, BORROW_REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/margin/borrow-repay
     * <br>
     * @param 
     * parameters Map of String,Object pair
     *           where String is the name of the parameter and Object is the value of the param
     * <br><br>
     * type -- mandatory/string - BORROW or REPAY <br>
     * asset -- optional/string <br>
     * isolatedSymbol -- optional/string - Symbol in Isolated Margin <br>
     * txId -- optional/long - tranId in POST /sapi/v1/margin/loan <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long - Current querying page. Start from 1. Default:1 <br>
     * size -- optional/long - Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Borrow-Repay">
     * https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Borrow-Repay</a>
     */
    public String getBorrowRepay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, BORROW_REPAY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ASSETS = "/sapi/v1/margin/allAssets";
    /**
     * GET /sapi/v1/margin/allAssets
     * <br>
     * @param 
     * parameters Map of String,Object pair
     *           where String is the name of the parameter and Object is the value of the param
     * <br><br>
     * asset -- optional/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Margin-Assets">
     *    https://developers.binance.com/docs/margin_trading/market-data/Get-All-Margin-Assets</a>
     */
    public String allAssets(Map<String, Object> parameters) {
        return requestHandler.sendApiRequest(baseUrl, ALL_ASSETS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_PAIRS = "/sapi/v1/margin/allPairs";
    /**
     * GET /sapi/v1/margin/allPairs
     * <br>
     * @param 
     * parameters Map of String,Object pair
     *           where String is the name of the parameter and Object is the value of the param
     * <br><br>
     * symbol -- optional/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Cross-Margin-Pairs">
     *    https://developers.binance.com/docs/margin_trading/market-data/Get-All-Cross-Margin-Pairs</a>
     */
    public String allPairs(Map<String, Object> parameters) {
        return requestHandler.sendApiRequest(baseUrl, ALL_PAIRS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PRICE_INDEX = "/sapi/v1/margin/priceIndex";
    /**
     * GET /sapi/v1/margin/priceIndex
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Query-Margin-PriceIndex">
     *    https://developers.binance.com/docs/margin_trading/market-data/Query-Margin-PriceIndex</a>
     */
    public String priceIndex(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendApiRequest(baseUrl, PRICE_INDEX, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ORDER = "/sapi/v1/margin/order";
    /**
     * Post a new order for margin account.
     * <br><br>
     * POST /sapi/v1/margin/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * side -- mandatory/enum <br>
     * type -- mandatory/enum <br>
     * quantity -- optional/decimal <br>
     * quoteOrderQty -- optional/decimal <br>
     * price -- optional/decimal <br>
     * stopPrice -- optional/decimal -- Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. <br>
     * newClientOrderId -- optional/string -- A unique id among open orders. Automatically generated if not sent. <br>
     * icebergQty -- optional/decimal -- Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. <br>
     * newOrderRespType -- optional/enum -- Set the response JSON. ACK, RESULT, or FULL; MARKET and LIMIT order types default to FULL, all other orders default to ACK. <br>
     * sideEffectType -- optional/enum -- NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY, AUTO_BORROW_REPAY; default NO_SIDE_EFFECT. <br>
     * timeInForce -- optional/enum -- GTC,IOC,FOK <br>
     * selfTradePreventionMode -- optional/enum -- The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE <br>
     * autoRepayAtCancel -- optional/boolean -- Only for when it's a MARGIN_BUY or AUTO_BORROW_REPAY. Default: true (debt generated by the order needs to be repaid after cancellation.) <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-Order">
     *     https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-Order</a>
     */
    public String newOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * Cancel an active order for margin account.
     * <br><br>
     * DELETE /sapi/v1/margin/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * orderId -- optional/long <br>
     * origClientOrderId -- optional/string <br>
     * newClientOrderId -- optional/string -- Used to uniquely identify this cancel. Automatically generated by default. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-Order">
     *     https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-Order</a>
     */
    public String cancelOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String OPEN_ORDERS = "/sapi/v1/margin/openOrders";
    /**
     * Cancels all active orders on a symbol for margin account.
     * This includes OCO orders.
     * <br><br>
     * DELETE /sapi/v1/margin/openOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE, default "FALSE" <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-All-Open-Orders">
     *     https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-All-Open-Orders</a>
     */
    public String cancelOpenOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, OPEN_ORDERS, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String TRANSFER_HISTORY = "/sapi/v1/margin/transfer";
    /**
     * GET /sapi/v1/margin/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * type -- optional/string -- Transfer Type: ROLL_IN, ROLL_OUT <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * isolatedSymbol -- optional/string -- Symbol in Isolated Margin <br>
     * archived -- optional/string -- Default: false. Set to true for archived data from 6 months ago <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/transfer/Get-Cross-Margin-Transfer-History">
     *     https://developers.binance.com/docs/margin_trading/transfer/Get-Cross-Margin-Transfer-History</a>
     */
    public String transferHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, TRANSFER_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INTEREST_HISTORY = "/sapi/v1/margin/interestHistory";
    /**
     * GET /sapi/v1/margin/interestHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * isolatedSymbol -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * archived -- optional/string -- Default: false. Set to true for archived data from 6 months ago <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-Interest-History">
     *     https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-Interest-History</a>
     */
    public String interestHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FORCE_LIQUIDATION_RECORD = "/sapi/v1/margin/forceLiquidationRec";
    /**
     * GET /sapi/v1/margin/forceLiquidationRec
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * isolatedSymbol -- optional/string <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Get-Force-Liquidation-Record">
     *     https://developers.binance.com/docs/margin_trading/trade/Get-Force-Liquidation-Record</a>
     */
    public String forceLiquidationRec(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FORCE_LIQUIDATION_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ACCOUNT = "/sapi/v1/margin/account";
    /**
     * GET /sapi/v1/margin/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Account-Details">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Account-Details</a>
     */
    public String account(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    /**
     * GET /sapi/v1/margin/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * orderId -- optional/long <br>
     * origClientOrderId -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Order">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Order</a>
     */
    public String getOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER, parameters, HttpMethod.GET, showLimitUsage);
    }

    /**
     * GET /sapi/v1/margin/openOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-Orders">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-Orders</a>
     */
    public String getOpenOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, OPEN_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ORDERS = "/sapi/v1/margin/allOrders";
    /**
     * GET /sapi/v1/margin/allOrders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * orderId -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 500; max 500. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-All-Orders">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-All-Orders</a>
     */
    public String getAllOrders(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ALL_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String OCO_ORDER = "/sapi/v1/margin/order/oco";
    /**
     * Send in a new OCO for a margin account.
     * <br><br>
     * POST /sapi/v1/margin/order/oco
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * listClientOrderId -- optional/string -- A unique Id for the entire orderList <br>
     * side -- mandatory/enum <br>
     * quantity -- mandatory/decimal <br>
     * limitClientOrderId -- optional/string -- A unique Id for the limit order <br>
     * price -- mandatory/decimal <br>
     * limitIcebergQty -- optional/decimal <br>
     * stopClientOrderId -- optional/string -- A unique Id for the stop loss/stop loss limit leg <br>
     * stopPrice -- optional/decimal -- Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. <br>
     * stopLimitPrice -- optional/decimal -- If provided, stopLimitTimeInForce is required. <br>
     * stopIcebergQty -- optional/enum -- NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY; default NO_SIDE_EFFECT. <br>
     * stopLimitTimeInForce -- optional/enum -- GTC,IOC,FOK <br>
     * newOrderRespType -- optional/enum -- Set the response JSON. <br>
     * sideEffectType -- optional/enum -- NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY, AUTO_BORROW_REPAY; default NO_SIDE_EFFECT. <br>
     * selfTradePreventionMode -- optional/enum -- The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE <br>
     * autoRepayAtCancel -- optional/boolean -- Only for when it's a MARGIN_BUY or AUTO_BORROW_REPAY. Default: true (debt generated by the order needs to be repaid after cancellation.) <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OCO">
     *     https://developers.binance.com/docs/margin_trading/trade/Margin-Account-New-OCO</a>
     */
    public String ocoOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "side", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        ParameterChecker.checkRequiredParameter(parameters, "price");
        ParameterChecker.checkRequiredParameter(parameters, "stopPrice");
        return requestHandler.sendSignedRequest(baseUrl, OCO_ORDER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ORDER_LIST = "/sapi/v1/margin/orderList";
    /**
     * Cancel an entire Order List for a margin account.
     * <br><br>
     * DELETE /sapi/v1/margin/orderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE", default "FALSE" <br>
     * orderListId -- optional/long -- Either orderListId or listClientOrderId must be provided <br>
     * listClientOrderId -- optional/string -- Either orderListId or listClientOrderId must be provided<br>
     * newClientOrderId -- optional/string -- Used to uniquely identify this cancel. Automatically generated by default <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-OCO">
     *     https://developers.binance.com/docs/margin_trading/trade/Margin-Account-Cancel-OCO</a>
     */
    public String cancelOcoOrder(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ORDER_LIST, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    /**
     * Retrieves a specific OCO based on provided optional parameters.
     * <br><br>
     * GET /sapi/v1/margin/orderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- mandatory for isolated margin, not supported for cross margin <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * orderListId -- optional/long -- Either orderListId or listClientOrderId must be provided <br>
     * listClientOrderId -- optional/string -- Either orderListId or listClientOrderId must be provided<br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-OCO">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-OCO</a>
     */
    public String getOcoOrder(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ORDER_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String GET_ALL_OCO = "/sapi/v1/margin/allOrderList";
    /**
     * Retrieves all OCO for a specific margin account based on provided optional parameters.
     * <br><br>
     * GET /sapi/v1/margin/allOrderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- mandatory for isolated margin, not supported for cross margin <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * fromId -- optional/long -- If supplied, neither startTime or endTime can be provided <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default Value: 500; Max Value: 1000 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-All-OCO">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-All-OCO</a>
     */
    public String getAllOcoOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, GET_ALL_OCO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String GET_OPEN_OCO = "/sapi/v1/margin/openOrderList";
    /**
     * GET /sapi/v1/margin/openOrderList
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string -- mandatory for isolated margin, not supported for cross margin <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE", default "FALSE" <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-OCO">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Open-OCO</a>
     */
    public String getOcoOpenOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, GET_OPEN_OCO, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String MY_TRADES = "/sapi/v1/margin/myTrades";
    /**
     * GET /sapi/v1/margin/myTrades
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- mandatory for isolated margin, not supported for cross margin <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE,default "FALSE" <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * fromId -- optional/long -- TradeId to fetch from. Default gets most recent trades. <br>
     * limit -- optional/int -- Default Value: 500; Max Value: 1000 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Trade-List">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Margin-Account-Trade-List</a>
     */
    public String trades(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MY_TRADES, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String MAX_BORROW = "/sapi/v1/margin/maxBorrowable";
    /**
     * GET /sapi/v1/margin/maxBorrowable
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE,default "FALSE" <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Max-Borrow">
     *     https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Max-Borrow</a>
     */
    public String maxBorrow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MAX_BORROW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String MAX_TRANSFERABLE = "/sapi/v1/margin/maxTransferable";
    /**
     * GET /sapi/v1/margin/maxTransferable
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE,default "FALSE" <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/transfer/Query-Max-Transfer-Out-Amount">
     *     https://developers.binance.com/docs/margin_trading/transfer/Query-Max-Transfer-Out-Amount</a>
     */
    public String maxTransferable(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MAX_TRANSFERABLE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ISOLATED_ACCOUNT = "/sapi/v1/margin/isolated/account";
    /**
     * GET /sapi/v1/margin/isolated/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbols -- optional/string -- Max 5 symbols can be sent; separated by ",". e.g. "BTCUSDT,BNBUSDT,ADAUSDT" <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Account-Info">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Account-Info</a>
     */
    public String isolatedAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    /**
     * DELETE /sapi/v1/margin/isolated/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Disable-Isolated-Margin-Account">
     *     https://developers.binance.com/docs/margin_trading/account/Disable-Isolated-Margin-Account</a>
     */
    public String disableIsolatedAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_ACCOUNT, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    /**
     * Enable isolated margin account for a specific symbol.
     * <br><br>
     * POST /sapi/v1/margin/isolated/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Enable-Isolated-Margin-Account">
     *     https://developers.binance.com/docs/margin_trading/account/Enable-Isolated-Margin-Account</a>
     */
    public String enableIsolatedAccount(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_ACCOUNT, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ISOLATED_ACCOUNT_LIMIT = "/sapi/v1/margin/isolated/accountLimit";
    /**
     * Query enabled isolated margin account limit.
     * <br><br>
     * GET /sapi/v1/margin/isolated/accountLimit
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Enabled-Isolated-Margin-Account-Limit">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Enabled-Isolated-Margin-Account-Limit</a>
     */
    public String getIsolatedAccountLimit(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_ACCOUNT_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ISOLATED_SYMBOL = "/sapi/v1/margin/isolated/allPairs";
    /**
     * GET /sapi/v1/margin/isolated/allPairs
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Get-All-Isolated-Margin-Symbol">
     *     https://developers.binance.com/docs/margin_trading/market-data/Get-All-Isolated-Margin-Symbol</a>
     */
    public String getAllIsolatedSymbols(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ALL_ISOLATED_SYMBOL, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BNB_BURN = "/sapi/v1/bnbBurn";
    /**
     * POST /sapi/v1/bnbBurn
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * spotBNBBurn -- optional/string -- "true" or "false"; Determines whether to use BNB to pay for trading fees on SPOT <br>
     * interestBNBBurn -- optional/string -- "true" or "false"; Determines whether to use BNB to pay for margin loan's interest  <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Toggle-BNB-Burn-On-Spot-Trade-And-Margin-Interest">
     *     https://developers.binance.com/docs/margin_trading/account/Toggle-BNB-Burn-On-Spot-Trade-And-Margin-Interest</a>
     */
    public String bnbBurn(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BNB_BURN, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/bnbBurn
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Get-BNB-Burn-Status">
     *     https://developers.binance.com/docs/margin_trading/account/Get-BNB-Burn-Status</a>
     */
    public String getBnbBurn(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BNB_BURN, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INTEREST_RATE_HIST = "/sapi/v1/margin/interestRateHistory";
    /**
     * GET /sapi/v1/margin/interestRateHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- asset,such as BTC <br>
     * vipLevel -- optional/int -- Default: user's vip level <br>
     * startTime -- optional/long -- Default: 7 days ago <br>
     * endTime -- optional/long -- Default: present. Maximum range: 3 months. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Margin-Interest-Rate-History">
     *     https://developers.binance.com/docs/margin_trading/borrow-and-repay/Query-Margin-Interest-Rate-History</a>
     */
    public String interestRateHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_RATE_HIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CROSS_MARGIN_DATA = "/sapi/v1/margin/crossMarginData";
    /**
     * Get cross margin fee data collection with any vip level or user's current specific data as https://www.binance.com/en/margin-fee.
     * <br><br>
     * GET /sapi/v1/margin/crossMarginData
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * vipLevel -- optional/int -- 	User's current specific margin data will be returned if vipLevel is omitted <br>
     * coin -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Fee-Data">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Cross-Margin-Fee-Data</a>
     */
    public String crossMarginData(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, CROSS_MARGIN_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CROSS_MARGIN_COLLATERAL_RATIO = "/sapi/v1/margin/crossMarginCollateralRatio";
    /**
     * Get cross margin collateral ratio
     * 
     * <br><br>
     * GET /sapi/v1/margin/crossMarginCollateralRatio
     * <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Cross-margin-collateral-ratio">
     *     https://developers.binance.com/docs/margin_trading/market-data/Cross-margin-collateral-ratio</a>
     */
    public String crossMarginCollateralRatio() {
        return requestHandler.sendApiRequest(baseUrl, CROSS_MARGIN_COLLATERAL_RATIO, null, HttpMethod.GET, showLimitUsage);
    }

    private final String ADJUST_CROSS_MARGIN_MAX_LEVERAGE = "/sapi/v1/margin/max-leverage";
    /**
     * Adjust cross margin max leverage
     *
     * <br><br>
     * POST /sapi/v1/margin/max-leverage
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * maxLeverage -- mandatory/integer -- Can only adjust to 3, 5 or 10. Example: maxLeverage=10 for Cross Margin Pro, maxLeverage = 5 or 3 for Cross Margin Classic <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Adjust-Cross-Margin-Max-Leverage">
     *     https://developers.binance.com/docs/margin_trading/account/Adjust-Cross-Margin-Max-Leverage</a>
     */
    public String adjustCrossMarginMaxLeverage(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "maxLeverage", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, ADJUST_CROSS_MARGIN_MAX_LEVERAGE, parameters, HttpMethod.POST, showLimitUsage);
    }
    
    private final String ISOLATED_MARGIN_DATA = "/sapi/v1/margin/isolatedMarginData";
    /**
     * Get isolated margin fee data collection with any vip level or user's current specific data as https://www.binance.com/en/margin-fee.
     * <br><br>
     * GET /sapi/v1/margin/isolatedMarginData
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * vipLevel -- optional/int -- 	User's current specific margin data will be returned if vipLevel is omitted <br>
     * symbol -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Fee-Data">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Isolated-Margin-Fee-Data</a>
     */
    public String isolatedMarginData(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_MARGIN_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ISOLATED_MARGIN_TIER = "/sapi/v1/margin/isolatedMarginTier";
    /**
     * Get isolated margin tier data collection with any tier as https://www.binance.com/en/margin-data.
     * <br><br>
     * GET /sapi/v1/margin/isolatedMarginTier
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * tier -- optional/string -- All margin tier data will be returned if tier is omitted <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Query-Isolated-Margin-Tier-Data">
     *     https://developers.binance.com/docs/margin_trading/market-data/Query-Isolated-Margin-Tier-Data</a>
     */
    public String isolatedMarginTier(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_MARGIN_TIER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ORDER_RATE_LIMIT = "/sapi/v1/margin/rateLimit/order";
    /**
     * Displays the user's current margin order count usage for all intervals.
     * <br><br>
     * GET /sapi/v1/margin/rateLimit/order
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE", default "FALSE" <br>
     * symbol -- optional/string -- isolated symbol, mandatory for isolated margin <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Query-Current-Margin-Order-Count-Usage">
     *     https://developers.binance.com/docs/margin_trading/trade/Query-Current-Margin-Order-Count-Usage</a>
     */
    public String orderRateLimit(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ORDER_RATE_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String AVAILABLE_INVENTORY = "/sapi/v1/margin/available-inventory";
    /**
     * Get the available margin inventory
     * <br><br>
     * GET /sapi/v1/margin/available-inventory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- mandatory/string -- MARGIN, ISOLATED<br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Query-margin-avaliable-inventory">
     *     https://developers.binance.com/docs/margin_trading/market-data/Query-margin-avaliable-inventory</a>
     */
    public String availableInventory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "type", String.class);
        return requestHandler.sendSignedRequest(baseUrl, AVAILABLE_INVENTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CAPITAL_FLOW = "/sapi/v1/margin/capital-flow";
    /**
     * Get cross or isolated margin capital flow
     * 
     * <br><br>
     * GET /sapi/v1/margin/capital-flow
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * symbol -- optional/string -- Required when querying isolated margin data <br>
     * type -- optional/string -- MARGIN, ISOLATED <br>
     * startTime -- optional/long -- Only supports querying the data of the last 90 days <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * fromId -- optional/long -- If fromId is set, the data with "id" above "fromId" will be returned. Otherwise the latest data will be returned <br>
     * limit -- optional/long -- The number of data items returned each time is limited. Default 500; Max 1000. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Query-Cross-Isolated-Margin-Capital-Flow">
     *     https://developers.binance.com/docs/margin_trading/account/Query-Cross-Isolated-Margin-Capital-Flow</a>
     */
    public String capitalFlow(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, CAPITAL_FLOW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DELIST_SCHEDULE = "/sapi/v1/margin/delist-schedule";
    /**
     * Get tokens or symbols delist schedule for cross margin and isolated margin
     * 
     * <br><br>
     * GET /sapi/v1/margin/delist-schedule
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Get-Delist-Schedule">
     *     https://developers.binance.com/docs/margin_trading/market-data/Get-Delist-Schedule</a>
     */
    public String delistSchedule(Map<String, Object> parameters) {
        return requestHandler.sendApiRequest(baseUrl, DELIST_SCHEDULE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String NEXT_HOURLY_INTEREST_RATE = "/sapi/v1/margin/next-hourly-interest-rate";
    /**
     * Get the next hourly interest estimation
     * 
     * <br><br>
     * GET /sapi/v1/margin/next-hourly-interest-rate
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * assets -- mandatory/string -- List of assets, separated by commas, up to 20 <br>
     * isIsolated -- mandatory/boolean -- Whether it's for isolated margin or not: "TRUE", "FALSE" <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-a-future-hourly-interest-rate">
     *     https://developers.binance.com/docs/margin_trading/borrow-and-repay/Get-a-future-hourly-interest-rate</a>
     */
    public String nextHourlyInterestRate(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "assets", String.class);
        ParameterChecker.checkParameter(parameters, "isIsolated", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, NEXT_HOURLY_INTEREST_RATE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SMALL_LIABILITY_ASSETS = "/sapi/v1/margin/exchange-small-liability";
    /**
     * Query the assets suitable for small liability exchanges.
     * 
     * <br><br>
     * GET /sapi/v1/margin/exchange-small-liability
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-Coin-List">
     *     https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-Coin-List</a>
     */
    public String smallLiabilityAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SMALL_LIABILITY_ASSETS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String EXCHANGE_SMALL_LIABILITY = "/sapi/v1/margin/exchange-small-liability";
    /**
     * Convert cross margin assets with low liability value
     * 
     * <br><br>
     * POST /sapi/v1/margin/exchange-small-liability
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * assetNames - mandatory/array -- List of asset names. Example: assetNames = BTC,ETH <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Small-Liability-Exchange">
     *     https://developers.binance.com/docs/margin_trading/trade/Small-Liability-Exchange</a>
     */
    public String exchangeSmallLiability(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "assetNames");
        return requestHandler.sendSignedRequest(baseUrl, EXCHANGE_SMALL_LIABILITY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SMALL_LIABILITY_EXCHANGE_HISTORY = "/sapi/v1/margin/exchange-small-liability-history";
    /**
     * Get the conversion history of low liabilities
     * 
     * <br><br>
     * GET /sapi/v1/margin/exchange-small-liability-history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * current -- mandatory/int -- Current querying page. Start from 1. Default:1 <br>
     * size --mandatory/int -- Default:10 Max:100 <br>
     * startTime -- optional/long -- Default: 30 days from current timestamp <br>
     * endTime -- optional/long -- Default: present timestamp <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-History">
     *     https://developers.binance.com/docs/margin_trading/trade/Get-Small-Liability-Exchange-History</a>
     */
    public String smallLiabilityExchangeHistory(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "current");
        ParameterChecker.checkRequiredParameter(parameters, "size");
        return requestHandler.sendSignedRequest(baseUrl, SMALL_LIABILITY_EXCHANGE_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LEVERAGE_BRACKET = "/sapi/v1/margin/leverageBracket";
    /**
     * Get the liability assets leverage bracket in Cross Margin Pro Mode
     * 
     * <br><br>
     * GET /sapi/v1/margin/leverageBracket
     * <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/market-data/Query-Liability-Coin-Leverage-Bracket-in-Cross-Margin-Pro-Mode">
     *      https://developers.binance.com/docs/margin_trading/market-data/Query-Liability-Coin-Leverage-Bracket-in-Cross-Margin-Pro-Mode</a>
     */
    public String leverageBracket() {
        return requestHandler.sendApiRequest(baseUrl, LEVERAGE_BRACKET, null, HttpMethod.GET, showLimitUsage);
    }

  
    private final String TRADE_COEFF = "/sapi/v1/margin/tradeCoeff";
    /**
     * Get personal margin level information
     * 
     * <br><br>
     * GET /sapi/v1/margin/tradeCoeff
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/account/Get-Summary-Of-Margin-Account">
     *      https://developers.binance.com/docs/margin_trading/account/Get-Summary-Of-Margin-Account</a>
     */
    public String tradeCoeff(Map<String, Object> parameters) {
        return requestHandler.sendApiRequest(baseUrl, TRADE_COEFF, parameters, HttpMethod.GET, showLimitUsage);
    }  
}
