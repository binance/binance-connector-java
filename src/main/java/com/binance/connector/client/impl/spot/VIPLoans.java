package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>VIPLoans Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#vip-loans-endpoints">VIP Loans Endpoints</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class VIPLoans {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public VIPLoans(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public VIPLoans(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String ONGOING_ORDERS = "/sapi/v1/loan/vip/ongoing/orders";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/ongoing/orders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- Order ID <br>
     * collateralAccountId -- optional/long <br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * current -- optional/long -- Current querying page. Start from 1, Default:1, Max:1000<br>
     * limit -- optional/long -- Default 10; max 100. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-vip-loan-ongoing-orders-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-vip-loan-ongoing-orders-user_data</a>
     */
    public String ongoingOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ONGOING_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY = "/sapi/v1/loan/vip/repay";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * POST /sapi/v1/loan/vip/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- mandatory/long -- Order ID <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#vip-loan-repay-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#vip-loan-repay-trade</a>
     */
    public String repay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "orderId", Long.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REPAYMENT_HISTORY = "/sapi/v1/loan/vip/repay/history";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/repay/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- Order ID <br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1, Default:1, Max:1000<br>
     * limit -- optional/long -- Default 10; max 100. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-vip-loan-repayment-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-vip-loan-repayment-history-user_data</a>
     */
    public String repaymentHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REPAYMENT_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String RENEW = "/sapi/v1/loan/vip/renew";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * POST /sapi/v1/loan/vip/renew
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- mandatory/long -- Order ID <br>
     * loanTerm -- optional/int -- 30/60 days <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#vip-loan-renew-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#vip-loan-renew-trade</a>
     */
    public String renew(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "orderId", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, RENEW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String COLLATERAL_ACCOUNT = "/sapi/v1/loan/vip/collateral/account";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/collateral/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- Order ID <br>
     * collateralAccountId -- optional/long <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#check-locked-value-of-vip-collateral-account-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#check-locked-value-of-vip-collateral-account-user_data</a>
     */
    public String collateralAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BORROW = "/sapi/v1/loan/vip/borrow";
    /**
     * VIP loan is available for VIP users only.
     * 
     * <br><br>
     * POST /sapi/v1/loan/vip/borrow
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanAccountId -- mandatory/long <br>
     * loanCoin -- mandatory/string -- Coin loaned <br>
     * loanAmount -- mandatory/decimal <br>
     * collateralAccountId -- mandatory/string -- Multiple split by ',' <br>
     * collateralCoin -- mandatory/string -- Multiple split by ',' <br>
     * isFlexibleRate -- mandatory/boolean -- TRUE : flexible rate; FALSE: fixed rate. Default: TRUE.<br>
     * loanTerm -- optional/integer -- Mandatory for fixed rate. Optional for fixed interest rate. Eg: 30/60 days <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#vip-loan-borrow-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#vip-loan-borrow-trade</a>
     */
    public String borrow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanAccountId", Long.class);
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "loanAmount");
        ParameterChecker.checkParameter(parameters, "collateralAccountId", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkParameter(parameters, "isFlexibleRate", Boolean.class);
        return requestHandler.sendSignedRequest(baseUrl, BORROW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LOANABLE_ASSETS = "/sapi/v1/loan/vip/loanable/data";
    /**
     * Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/loanable/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * vipLevel -- optional/integer -- Defaults to user's vip level <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-loanable-assets-data-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-loanable-assets-data-user_data</a>
     */
    public String loanableAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOANABLE_ASSETS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_ASSET_DATA = "/sapi/v1/loan/vip/collateral/data";
    /**
     * Get Collateral Asset Data
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/collateral/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * collateralCoin -- optional/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-collateral-asset-data-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-collateral-asset-data-user_data</a>
     */
    public String collateralAsset(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_ASSET_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ORDER_STATUS = "/sapi/v1/loan/vip/request/data";
    /**
     * Get order status
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/request/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 <br>
     * limit -- optional/long -- Default 10; max 100. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-application-status-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-application-status-user_data</a>
     */
    public String orderStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ORDER_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BORROW_INTEREST_RATE = "/sapi/v1/loan/vip/request/interestRate";
    /**
     * Get Borrow Interest Rate 
     * 
     * <br><br>
     * GET /sapi/v1/loan/vip/request/interestRate
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string -- Max 10 assets, Multiple split by "," <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-borrow-interest-rate-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-borrow-interest-rate-user_data</a>
     */
    public String borrowInterestRate(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, BORROW_INTEREST_RATE, parameters, HttpMethod.GET, showLimitUsage);
    }
}
