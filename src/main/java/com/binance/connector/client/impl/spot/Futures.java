package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

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

    public Futures(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Futures(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String FUTURES_TRANSFER = "/sapi/v1/futures/transfer";
    /**
     * Execute transfer between spot account and futures account.
     * <br><br>
     * POST /sapi/v1/futures/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String futuresTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        ParameterChecker.checkParameter(parameters, "type", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * GET /sapi/v1/futures/transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String futuresTransferHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, FUTURES_TRANSFER, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String BORROW_HISTORY = "/sapi/v1/futures/loan/borrow/history";
    /**
     * GET /sapi/v1/futures/loan/borrow/history
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String borrowHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, BORROW_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY_HISTORY = "/sapi/v1/futures/loan/repay/history";
    /**
     * GET /sapi/v1/futures/loan/repay/history
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String repayHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REPAY_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String WALLET = "/sapi/v2/futures/loan/wallet";
    /**
     * GET /sapi/v2/futures/loan/wallet
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-wallet-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#cross-collateral-wallet-user_data</a>
     */
    public String loanWallet(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, WALLET, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ADJUST_COLLATERAL_HISTORY = "/sapi/v1/futures/loan/adjustCollateral/history";
    /**
     * GET /sapi/v1/futures/loan/adjustCollateral/history
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String adjustCollateralHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ADJUST_COLLATERAL_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LIQUIDATION_HISTORY = "/sapi/v1/futures/loan/liquidationHistory";
    /**
     * GET /sapi/v1/futures/loan/liquidationHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String liquidationHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDATION_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String INTEREST_HISTORY = "/sapi/v1/futures/loan/interestHistory";
    /**
     * GET /sapi/v1/futures/loan/interestHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
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
    public String interestHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }
}
