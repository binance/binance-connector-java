package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Crypto Loans Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/crypto_loan/Introduction">Crypto Loans Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class CryptoLoans {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public CryptoLoans(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public CryptoLoans(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String LOAN_INCOME = "/sapi/v1/loan/income";
    /**
     * GET /sapi/v1/loan/income
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * type -- optional/string -- All types will be returned by default. Enum: borrowIn, collateralSpent, repayAmount, collateralReturn(Collateral return after repayment), addCollateral, removeCollateral, collateralReturnAfterLiquidation <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- default 20, max 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Get-Crypto-Loans-Income-History">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Get-Crypto-Loans-Income-History</a>
     */
    public String loanIncome(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, LOAN_INCOME, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_BORROW = "/sapi/v1/loan/borrow";
    /**
     * POST /sapi/v1/loan/borrow
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * loanTerm -- mandatory/int -- 7/14/30/90/180 days <br>
     * loanAmount -- optional/decimal -- Mandatory when collateralAmount is empty <br>
     * collateralAmount	-- optional/decimal -- Mandatory when loanAmount is empty <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Borrow">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Borrow</a>
     */
    public String loanBorrow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkParameter(parameters, "loanTerm", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, LOAN_BORROW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LOAN_BORROW_HISTORY = "/sapi/v1/loan/borrow/history";
    /**
     * GET /sapi/v1/loan/borrow/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- orderId in POST /sapi/v1/loan/borrow <br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current	-- optional/long -- Current querying page. Start from 1; default: 1; max: 1000 <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Borrow-History">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Borrow-History</a>
     */
    public String loanBorrowHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOAN_BORROW_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_ONGOING_ORDERS = "/sapi/v1/loan/ongoing/orders";
    /**
     * GET /sapi/v1/loan/ongoing/orders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- orderId in POST /sapi/v1/loan/borrow <br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * current	-- optional/long -- Current querying page. Start from 1; default: 1; max: 1000 <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Ongoing-Orders">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Ongoing-Orders</a>
     */
    public String loanOngoingOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOAN_ONGOING_ORDERS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_REPAY = "/sapi/v1/loan/repay";
    /**
     * POST /sapi/v1/loan/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- mandatory/long <br>
     * amount -- mandatory/decimal <br>
     * type -- optional/int -- Default: 1. 1 for "repay with borrowed coin"; 2 for "repay with collateral" <br>
     * collateralReturn	-- optional/boolean -- 	Default: TRUE. TRUE: Return extra collateral to spot account; FALSE: Keep extra collateral in the order <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Repay">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Repay</a>
     */
    public String loanRepay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "orderId", Long.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, LOAN_REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LOAN_REPAY_HISTORY = "/sapi/v1/loan/repay/history";
    /**
     * GET /sapi/v1/loan/repay/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long <br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current	-- optional/long -- Current querying page. Start from 1; default: 1; max: 1000 <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Repayment-History">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-Repayment-History</a>
     */
    public String loanRepayHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOAN_REPAY_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_ADJUST_LTV = "/sapi/v1/loan/adjust/ltv";
    /**
     * POST /sapi/v1/loan/adjust/ltv
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- mandatory/long <br>
     * amount -- mandatory/decimal <br>
     * direction -- optional/enum -- "ADDITIONAL", "REDUCED" <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Adjust-LTV">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Adjust-LTV</a>
     */
    public String loanAdjustLTV(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "orderId", Long.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, LOAN_ADJUST_LTV, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LOAN_ADJUST_LTV_HISTORY = "/sapi/v1/loan/ltv/adjustment/history";
    /**
     * GET /sapi/v1/loan/ltv/adjustment/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long <br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current	-- optional/long -- Current querying page. Start from 1; default: 1; max: 1000 <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-LTV-Adjustment-History">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/user-information/Get-Loan-LTV-Adjustment-History</a>
     */
    public String loanAdjustLTVHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOAN_ADJUST_LTV_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOANABLE_ASSETS_DATA = "/sapi/v1/loan/loanable/data";
    /**
     * GET /sapi/v1/loan/loanable/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string <br>
     * vipLevel -- optional/int -- Default: user's VIP level. In case there's specific configuration, send "-1"<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/vip_loan/market-data/Get-Loanable-Assets-Data">
     *     https://developers.binance.com/docs/vip_loan/market-data/Get-Loanable-Assets-Data</a>
     */
    public String loanAssetsData(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOANABLE_ASSETS_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_ASSETS_DATA = "/sapi/v1/loan/collateral/data";
    /**
     * GET /sapi/v1/loan/collateral/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * collateralCoin -- optional/string <br>
     * vipLevel -- optional/int -- Default: user's VIP level. In case there's specific configuration, send "-1"<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Get-Collateral-Assets-Data">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Get-Collateral-Assets-Data</a>
     */
    public String collateralAssetsData(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_ASSETS_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_REPAY_RATE = "/sapi/v1/loan/repay/collateral/rate";
    /**
     * GET /sapi/v1/loan/repay/collateral/rate
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * repayAmount -- mandatory/decimal -- repay amount of loanCoin<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Check-Collateral-Repay-Rate">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/market-data/Check-Collateral-Repay-Rate</a>
     */
    public String collateralRepayRate(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "repayAmount");
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_REPAY_RATE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CUSTOMIZE_MARGIN_CALL = "/sapi/v1/loan/customize/margin_call";
    /**
     * GET /sapi/v1/loan/customize/margin_call
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderId -- optional/long -- Mandatory when collateralCoin is empty. Send either orderId or collateralCoin, if both parameters are sent, take orderId only. <br>
     * collateralCoin -- optional/string -- Mandatory when orderId is empty. Send either orderId or collateralCoin, if both parameters are sent, take orderId only.<br>
     * marginCall -- mandatory/decimal<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Customize-Margin-Call">
     *     https://developers.binance.com/docs/crypto_loan/stable-rate/trade/Crypto-Loan-Customize-Margin-Call</a>
     */
    public String customizeMarginCall(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "marginCall");
        return requestHandler.sendSignedRequest(baseUrl, CUSTOMIZE_MARGIN_CALL, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_BORROW_V2 = "/sapi/v2/loan/flexible/borrow";
    /**
     * POST /sapi/v2/loan/flexible/borrow
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string -- Coin loaned. <br>
     * loanAmount -- optional/decimal -- Loan amount. Mandatory when collateralAmount is empty. <br>
     * collateralCoin -- mandatory/string -- Coin used as collateral. <br>
     * collateralAmount -- optional/decimal -- Mandatory when loanAmount is empty. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/trade</a>
     */
    public String flexibleLoanBorrow(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_BORROW_V2, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_ONGOING_ORDERS_V2 = "/sapi/v2/loan/flexible/ongoing/orders";
    /**
     * GET /sapi/v2/loan/flexible/ongoing/orders
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned. <br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * current -- optional/long -- Current querying page. Start from 1; default: 1; max: 1000; <br>
     * limit -- optional/long -- Default: 10; max: 100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Ongoing-Orders">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Ongoing-Orders</a>
     */
    public String flexibleLoanOngoingOrders(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_ONGOING_ORDERS_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_BORROW_HISTORY_V2 = "/sapi/v2/loan/flexible/borrow/history";
    /**
     * GET /sapi/v2/loan/flexible/borrow/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1; default: 1; max: 1000; <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Borrow-History">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Borrow-History</a>
     */
    public String flexibleLoanBorrowHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_BORROW_HISTORY_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_REPAY_V2 = "/sapi/v2/loan/flexible/repay";
    /**
     * POST /sapi/v2/loan/flexible/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string -- Coin loaned <br>
     * collateralCoin -- mandatory/string -- Coin used as collateral <br>
     * repayAmount -- mandatory/decimal -- repay amount of loanCoin <br>
     * collateralReturn -- optional/boolean -- Default: TRUE. TRUE: Return extra collateral to earn account; FALSE: Keep extra collateral in the order, and lower LTV.<br>
     * fullRepayment -- optional/boolean -- Default: FALSE. TRUE: Full repayment; FALSE: Partial repayment, based on loanAmount. <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Repay">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Repay</a>
     */
    public String flexibleLoanRepay(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "repayAmount");
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_REPAY_V2, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_REPAY_HISTORY_V2 = "/sapi/v2/loan/flexible/repay/history";
    /**
     * GET /sapi/v2/loan/flexible/repay/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1; default: 1; max: 1000; <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Repayment-History">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information/Get-Flexible-Loan-Repayment-History</a>
     */
    public String flexibleLoanRepayHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_REPAY_HISTORY_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_ADJUST_LTV_V2 = "/sapi/v2/loan/flexible/adjust/ltv";
    /**
     * POST /sapi/v2/loan/flexible/adjust/ltv
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string -- Coin loaned <br>
     * collateralCoin -- mandatory/string -- Coin used as collateral <br>
     * adjustmentAmount -- mandatory/decimal <br>
     * direction -- mandatory/enum -- "ADDITIONAL", "REDUCED"<br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Adjust-LTV">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/trade/Flexible-Loan-Adjust-LTV</a>
     */
    public String flexibleLoanAdjustLtv(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "adjustmentAmount");
        ParameterChecker.checkParameter(parameters, "direction", String.class);
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_ADJUST_LTV_V2, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_LTV_ADJUST_HISTORY_V2 = "/sapi/v2/loan/flexible/ltv/adjustment/history";
    /**
     * GET /sapi/v2/loan/flexible/ltv/adjustment/history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * current -- optional/long -- Current querying page. Start from 1. Default:1 Max:1000 <br>
     * limit -- optional/long -- Default: 10; max: 100; <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/user-information</a>
     */
    public String flexibleLoanLtvAdjustHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_LTV_ADJUST_HISTORY_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_ASSETS_V2 = "/sapi/v2/loan/flexible/loanable/data";
    /**
     * Get interest rate and borrow limit of flexible loanable assets. The borrow limit is shown in USD value.
     * 
     * <br><br>
     * GET /sapi/v2/loan/flexible/loanable/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string -- Coin loaned <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data/Get-Flexible-Loan-Assets-Data">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data/Get-Flexible-Loan-Assets-Data</a>
     */
    public String flexibleLoanAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_ASSETS_V2, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String FLEXIBLE_LOAN_COLLATERAL_ASSETS_V2 = "/sapi/v2/loan/flexible/collateral/data";
    /**
     * Get LTV information and collateral limit of flexible loan's collateral assets. The collateral limit is shown in USD value.
     * 
     * <br><br>
     * GET /sapi/v2/loan/flexible/collateral/data
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * collateralCoin -- optional/string -- Coin used as collateral <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data">
     *      https://developers.binance.com/docs/crypto_loan/flexible-rate/market-data</a>
     */
    public String flexibleLoanCollateralAssets(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, FLEXIBLE_LOAN_COLLATERAL_ASSETS_V2, parameters, HttpMethod.GET, showLimitUsage);
    }
}
