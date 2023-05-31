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
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-trade">Margin Account/Trade Endpoint</a>
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

    private final String CROSS_MARGIN_TRANSFER = "/sapi/v1/margin/transfer";
    /**
     * Execute transfer between spot account and cross margin account.
     * <br><br>
     * POST /sapi/v1/margin/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- The asset being transferred, e.g., BTC <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * type -- mandatory/int -- 1: transfer from main account to cross margin account 2: transfer from cross margin account to main account <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-margin-account-transfer-margin">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-margin-account-transfer-margin</a>
     */
    public String crossMarginTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, CROSS_MARGIN_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String BORROW = "/sapi/v1/margin/loan";
    /**
     * Apply for a loan.
     * <br><br>
     * POST /sapi/v1/margin/loan
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * symbol -- optional/string -- isolated symbol <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-borrow-margin">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-borrow-margin</a>
     */
    public String borrow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, BORROW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REPAY = "/sapi/v1/margin/repay";
    /**
     * Repay loan for margin account.
     * <br><br>
     * POST /sapi/v1/margin/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isIsolated -- optional/string -- for isolated margin or not, "TRUE", "FALSE",default "FALSE" <br>
     * symbol -- optional/string -- isolated symbol <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-repay-margin">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-repay-margin</a>
     */
    public String repay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ASSET = "/sapi/v1/margin/asset";
    /**
     * GET /sapi/v1/margin/asset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-asset-market_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-asset-market_data</a>
     */
    public String asset(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendApiRequest(baseUrl, ASSET, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PAIR = "/sapi/v1/margin/pair";
    /**
     * GET /sapi/v1/margin/pair
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-pair-market_data">
     *    https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-pair-market_data</a>
     */
    public String pair(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendApiRequest(baseUrl, PAIR, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ASSETS = "/sapi/v1/margin/allAssets";
    /**
     * GET /sapi/v1/margin/allAssets
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-all-margin-assets-market_data">
     *    https://binance-docs.github.io/apidocs/spot/en/#get-all-margin-assets-market_data</a>
     */
    public String allAssets() {
        return requestHandler.sendApiRequest(baseUrl, ALL_ASSETS, null, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_PAIRS = "/sapi/v1/margin/allPairs";
    /**
     * GET /sapi/v1/margin/allPairs
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-all-cross-margin-pairs-market_data">
     *    https://binance-docs.github.io/apidocs/spot/en/#get-all-cross-margin-pairs-market_data</a>
     */
    public String allPairs() {
        return requestHandler.sendApiRequest(baseUrl, ALL_PAIRS, null, HttpMethod.GET, showLimitUsage);
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-priceindex-market_data">
     *    https://binance-docs.github.io/apidocs/spot/en/#query-margin-priceindex-market_data</a>
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
     * sideEffectType -- optional/enum -- NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY; default NO_SIDE_EFFECT. <br>
     * timeInForce -- optional/enum -- GTC,IOC,FOK <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-new-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-new-order-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-order-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-order-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-all-open-orders-on-a-symbol-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-all-open-orders-on-a-symbol-trade</a>
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
     * archived -- optional/string -- Default: false. Set to true for archived data from 6 months ago <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-cross-margin-transfer-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-cross-margin-transfer-history-user_data</a>
     */
    public String transferHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, TRANSFER_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_RECORD = "/sapi/v1/margin/loan";
    /**
     * GET /sapi/v1/margin/loan
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isolatedSymbol -- optional/string <br>
     * txId -- optional/long -- the tranId in POST /sapi/v1/margin/loan <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * archived -- optional/string -- Default: false. Set to true for archived data from 6 months ago <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-loan-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-loan-record-user_data</a>
     */
    public String loanRecord(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, LOAN_RECORD, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY_RECORD = "/sapi/v1/margin/repay";
    /**
     * GET /sapi/v1/margin/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * isolatedSymbol -- optional/string <br>
     * txId -- optional/long -- the tranId in POST /sapi/v1/margin/loan <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * archived -- optional/string -- Default: false. Set to true for archived data from 6 months ago <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-repay-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-repay-record-user_data</a>
     */
    public String repayRecord(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REPAY_RECORD, parameters, HttpMethod.GET, showLimitUsage);
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-interest-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-interest-history-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-force-liquidation-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-force-liquidation-record-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-account-details-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-account-details-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-order-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-order-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-open-orders-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-open-orders-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-all-orders-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-all-orders-user_data</a>
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
     * sideEffectType -- optional/enum -- NO_SIDE_EFFECT, MARGIN_BUY, AUTO_REPAY; default NO_SIDE_EFFECT. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-new-oco-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-new-oco-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-oco-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-account-cancel-oco-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-oco-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-all-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-all-oco-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-open-oco-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-open-oco-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-trade-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-account-39-s-trade-list-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-max-borrow-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-max-borrow-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-max-transfer-out-amount-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-max-transfer-out-amount-user_data</a>
     */
    public String maxTransferable(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, MAX_TRANSFERABLE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ISOLATED_TRANSFER = "/sapi/v1/margin/isolated/transfer";
    /**
     * POST /sapi/v1/margin/isolated/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- asset,such as BTC <br>
     * symbol -- mandatory/string <br>
     * transFrom -- mandatory/string -- "SPOT", "ISOLATED_MARGIN" <br>
     * transTo -- mandatory/string -- "SPOT", "ISOLATED_MARGIN" <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#isolated-margin-account-transfer-margin">
     *     https://binance-docs.github.io/apidocs/spot/en/#isolated-margin-account-transfer-margin</a>
     */
    public String isolatedTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "transFrom", String.class);
        ParameterChecker.checkParameter(parameters, "transTo", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/margin/isolated/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string -- asset,such as BTC <br>
     * symbol -- mandatory/string <br>
     * transFrom -- optional/string -- "SPOT", "ISOLATED_MARGIN" <br>
     * transTo -- optional/string -- "SPOT", "ISOLATED_MARGIN" <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Current page, default 1 <br>
     * size -- optional/decimal <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-isolated-margin-transfer-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-isolated-margin-transfer-history-user_data</a>
     */
    public String getIsolatedTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-account-info-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-account-info-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#disable-isolated-margin-account-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#disable-isolated-margin-account-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#enable-isolated-margin-account-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#enable-isolated-margin-account-trade</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-enabled-isolated-margin-account-limit-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-enabled-isolated-margin-account-limit-user_data</a>
     */
    public String getIsolatedAccountLimit(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_ACCOUNT_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ISOLATED_SYMBOL = "/sapi/v1/margin/isolated/pair";
    /**
     * GET /sapi/v1/margin/isolated/pair
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-symbol-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-symbol-user_data</a>
     */
    public String getIsolatedSymbol(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ISOLATED_SYMBOL, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ALL_ISOLATED_SYMBOL = "/sapi/v1/margin/isolated/allPairs";
    /**
     * GET /sapi/v1/margin/isolated/allPairs
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-all-isolated-margin-symbol-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-all-isolated-margin-symbol-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#toggle-bnb-burn-on-spot-trade-and-margin-interest-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#toggle-bnb-burn-on-spot-trade-and-margin-interest-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-bnb-burn-status-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-bnb-burn-status-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-margin-interest-rate-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-margin-interest-rate-history-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-fee-data-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-cross-margin-fee-data-user_data</a>
     */
    public String crossMarginData(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, CROSS_MARGIN_DATA, parameters, HttpMethod.GET, showLimitUsage);
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-fee-data-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-fee-data-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-tier-data-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-isolated-margin-tier-data-user_data</a>
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
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-current-margin-order-count-usage-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-current-margin-order-count-usage-trade</a>
     */
    public String orderRateLimit(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ORDER_RATE_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DRIBBLET = "/sapi/v1/margin/dribblet";
    /**
     * Query the historical information of user's margin account small-value asset conversion BNB.
     * <br><br>
     * GET /sapi/v1/margin/dribblet
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long -- <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#margin-dustlog-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#margin-dustlog-user_data</a>
     */
    public String dribblet(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, DRIBBLET, parameters, HttpMethod.GET, showLimitUsage);
    }
}
