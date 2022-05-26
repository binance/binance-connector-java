package com.binance.connector.client.impl.spot;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestHandler;
import java.util.LinkedHashMap;

/**
 * <h2>Futures Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#futures-endpoints">Futures Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Futures {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Futures(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, secretKey);
        this.showLimitUsage = showLimitUsage;
    }

    private final String FUTURES_TRANSFER = "/sapi/v1/futures/transfer";
    /**
     * Execute transfer between spot account and futures account.
     * <br><br>
     * POST /sapi/v1/futures/transfer
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- The asset being transferred, e.g. USDT <br>
     * amount -- mandatory/decimal -- The amount to be transferred <br>
     * type -- mandatory/int -- 1: transfer from spot account to USDT-M futures account.
     * 2: transfer from USDT-M futures account to spot account.
     * 3: transfer from spot account to COIN-M futures account.
     * 4: transfer from COIN-M futures account to spot account. <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#new-future-account-transfer-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#new-future-account-transfer-user_data</a>
     */
    public String futuresTransfer(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/futures/transfer
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string -- The asset being transferred, e.g. USDT <br>
     * startTime -- mandatory/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default:10 Max:100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-future-account-transaction-history-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-future-account-transaction-history-list-user_data</a>
     */
    public String futuresTransferHistory(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BORROW = "/sapi/v1/futures/loan/borrow";
    /**
     * POST /sapi/v1/futures/loan/borrow
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * amount -- mandatory/decimal -- when collateralAmount is empty <br>
     * collateralCoin -- mandatory/string <br>
     * collateralAmount -- mandatory/decimal -- when amount is empty <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#borrow-for-cross-collateral-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#borrow-for-cross-collateral-trade</a>
     */
    public String borrow(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BORROW, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String BORROW_HISTORY = "/sapi/v1/futures/loan/borrow/history";
    /**
     * GET /sapi/v1/futures/loan/borrow/history
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- default 500, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-borrow-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-borrow-history-user_data</a>
     */
    public String borrowHistory(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BORROW_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY = "/sapi/v1/futures/loan/repay";
    /**
     * POST /sapi/v1/futures/loan/repay
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#repay-for-cross-collateral-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#repay-for-cross-collateral-trade</a>
     */
    public String repay(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REPAY_HISTORY = "/sapi/v1/futures/loan/repay/history";
    /**
     * GET /sapi/v1/futures/loan/repay/history
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- default 500, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-repayment-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-repayment-history-user_data</a>
     */
    public String repayHistory(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REPAY_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String WALLET = "/sapi/v2/futures/loan/wallet";
    /**
     * GET /sapi/v2/futures/loan/wallet
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-wallet-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-wallet-user_data</a>
     */
    public String loanWallet(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, WALLET, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LOAN_CONFIGS = "/sapi/v2/futures/loan/configs";
    /**
     * GET /sapi/v2/futures/loan/configs
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-information-v2-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-information-v2-user_data</a>
     */
    public String loanConfigs(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LOAN_CONFIGS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CALCU_ADJUST_LEVEL = "/sapi/v2/futures/loan/calcAdjustLevel";
    /**
     * GET /sapi/v2/futures/loan/calcAdjustLevel
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * direction -- mandatory/enum -- "ADDITIONAL", "REDUCED" <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#calculate-rate-after-adjust-cross-collateral-ltv-v2-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#calculate-rate-after-adjust-cross-collateral-ltv-v2-user_data</a>
     */
    public String calcAdjustLevel(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "direction", String.class);
        return requestHandler.sendSignedRequest(baseUrl, CALCU_ADJUST_LEVEL, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CALCU_MAX_ADJUST_AMOUNT = "/sapi/v2/futures/loan/calcMaxAdjustAmount";
    /**
     * GET /sapi/v2/futures/loan/calcMaxAdjustAmount
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-max-amount-for-adjust-cross-collateral-ltv-v2-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-max-amount-for-adjust-cross-collateral-ltv-v2-user_data</a>
     */
    public String calcMaxAdjustAmount(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, CALCU_MAX_ADJUST_AMOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ADJUST_COLLATERAL = "/sapi/v2/futures/loan/adjustCollateral";
    /**
     * POST /sapi/v2/futures/loan/adjustCollateral
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * amount -- mandatory/decimal <br>
     * direction -- mandatory/enum -- "ADDITIONAL", "REDUCED" <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#calculate-rate-after-adjust-cross-collateral-ltv-v2-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#calculate-rate-after-adjust-cross-collateral-ltv-v2-user_data</a>
     */
    public String adjustCollateral(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "loanCoin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "direction", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ADJUST_COLLATERAL, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ADJUST_COLLATERAL_HISTORY = "/sapi/v1/futures/loan/adjustCollateral/history";
    /**
     * GET /sapi/v1/futures/loan/adjustCollateral/history
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- default 500, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#adjust-cross-collateral-ltv-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#adjust-cross-collateral-ltv-history-user_data</a>
     */
    public String adjustCollateralHistory(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ADJUST_COLLATERAL_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LIQUIDATION_HISTORY = "/sapi/v1/futures/loan/liquidationHistory";
    /**
     * GET /sapi/v1/futures/loan/liquidationHistory
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * loanCoin -- optional/string <br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- default 500, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-liquidation-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-liquidation-history-user_data</a>
     */
    public String liquidationHistory(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDATION_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_REPAY_LIMIT = "/sapi/v1/futures/loan/collateralRepayLimit";
    /**
     * Check the maximum and minimum limit when repay with collateral.
     * <br><br>
     * GET /sapi/v1/futures/loan/collateralRepayLimit
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#check-collateral-repay-limit-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#check-collateral-repay-limit-user_data</a>
     */
    public String collateralRepayLimit(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_REPAY_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_REPAY = "/sapi/v1/futures/loan/collateralRepay";
    /**
     * Get quote before repay with collateral is mandatory, the quote will be valid within 25 seconds.
     * <br><br>
     * GET /sapi/v1/futures/loan/collateralRepay
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * coin -- mandatory/string <br>
     * collateralCoin -- mandatory/string <br>
     * amount -- mandatory/decimal -- repay amount <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-collateral-repay-quote-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-collateral-repay-quote-user_data</a>
     */
    public String collateralRepayQuote(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "coin", String.class);
        ParameterChecker.checkParameter(parameters, "collateralCoin", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_REPAY, parameters, HttpMethod.GET, showLimitUsage);
    }

    /**
     * Repay with collateral. Get quote before repay with collateral is mandatory, the quote will be valid within 25 seconds.
     * <br><br>
     * POST /sapi/v1/futures/loan/collateralRepay
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteId -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#repay-with-collateral-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#repay-with-collateral-user_data</a>
     */
    public String collateralRepay(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "quoteId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String COLLATERAL_REPAY_RESULT = "/sapi/v1/futures/loan/collateralRepayResult";
    /**
     * Check collateral repayment result.
     * <br><br>
     * GET /sapi/v1/futures/loan/collateralRepayResult
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteId -- mandatory/string <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#collateral-repayment-result-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#collateral-repayment-result-user_data</a>
     */
    public String collateralRepayResult(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "quoteId", String.class);
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_REPAY_RESULT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INTEREST_HISTORY = "/sapi/v1/futures/loan/interestHistory";
    /**
     * GET /sapi/v1/futures/loan/interestHistory
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * collateralCoin -- optional/string <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * limit -- optional/long -- default 500, max 1000 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-interest-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-interest-history-user_data</a>
     */
    public String interestHistory(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }
}
