package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Portfolio Margin Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#portfolio-margin-endpoints">Portfolio Margin Endpoints</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class PortfolioMargin {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public PortfolioMargin(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public PortfolioMargin(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String ACCOUNT = "/sapi/v1/portfolio/account";
    /**
     * GET /sapi/v1/portfolio/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-classic-portfolio-margin-account-info-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-classic-portfolio-margin-account-info-user_data</a>
     */
    public String getAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String COLLATERAL_RATE = "/sapi/v1/portfolio/collateralRate";
    /**
     * Portfolio Margin Collateral Rate
     * <br><br>
     * GET /sapi/v1/portfolio/collateralRate
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#classic-portfolio-margin-collateral-rate-market_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#classic-portfolio-margin-collateral-rate-market_data</a>
     */
    public String collateralRate(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, COLLATERAL_RATE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String PM_LOAN = "/sapi/v1/portfolio/pmLoan";
    /**
     * Query Portfolio Margin Bankruptcy Loan Record
     * <br><br>
     * GET /sapi/v1/portfolio/pmLoan
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-classic-portfolio-margin-bankruptcy-loan-amount-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#query-classic-portfolio-margin-bankruptcy-loan-amount-user_data</a>
     */
    public String bankruptcyLoanRecord(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, PM_LOAN, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY = "/sapi/v1/portfolio/repay";
    /**
     * Repay Portfolio Margin Bankruptcy Loan
     * <br><br>
     * POST /sapi/v1/portfolio/repay
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * from -- optional/string -- SPOT or MARGIN，default SPOT<br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#classic-portfolio-margin-bankruptcy-loan-repay">
     *     https://binance-docs.github.io/apidocs/spot/en/#classic-portfolio-margin-bankruptcy-loan-repay</a>
     */
    public String repay(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REPAY, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String INTEREST_HISTORY = "/sapi/v1/portfolio/interest-history";
    /**
     * Query interest history of negative balance for portfolio margin.
     * 
     * <br><br>
     * GET /sapi/v1/portfolio/interest-history
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * startTime -- optional/long -- UTC timestamp in ms <br>
     * endTime -- optional/long -- UTC timestamp in ms <br>
     * size -- optional/integer -- Default:10 Max:100 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-classic-portfolio-margin-negative-balance-interest-history-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-classic-portfolio-margin-negative-balance-interest-history-user_data</a>
     */
    public String interestHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, INTEREST_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ASSET_INDEX_PRICE = "/sapi/v1/portfolio/asset-index-price";
    /**
     * Query Portfolio Margin Asset Index Price
     * 
     * <br><br>
     * GET /sapi/v1/portfolio/asset-index-price
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- optional/string <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#query-portfolio-margin-asset-index-price-market_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#query-portfolio-margin-asset-index-price-market_data</a>
     */
    public String assetIndexPrice(Map<String, Object> parameters) {
        return requestHandler.sendApiRequest(baseUrl, ASSET_INDEX_PRICE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String AUTO_COLLECTION = "/sapi/v1/portfolio/auto-collection";
    /**
     * Transfers all assets from Futures Account to Margin account
     * 
     * - The BNB would not be collected from UM-PM account to the Portfolio Margin account.
     * - You can only use this function 500 times per hour in a rolling manner.
     * <br><br>
     * POST /sapi/v1/portfolio/auto-collection
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#fund-auto-collection-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#fund-auto-collection-user_data</a>
     */
    public String autoCollection(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, AUTO_COLLECTION, parameters, HttpMethod.POST, showLimitUsage);
    }


    private final String ASSET_COLLECTION = "/sapi/v1/portfolio/asset-collection";
    /**
     * Transfers specific asset from Futures Account to Margin account
     * 
     * <br><br>
     * POST /sapi/v1/portfolio/asset-collection
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#fund-collection-by-asset-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#fund-collection-by-asset-user_data</a>
     */
    public String assetCollection(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, ASSET_COLLECTION, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String BNB_TRANSFER = "/sapi/v1/portfolio/bnb-transfer";
    /**
     * BNB transfer can be between Margin Account and USDM Account
     * 
     * <br><br>
     * POST /sapi/v1/portfolio/bnb-transfer
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * transferSide -- mandatory/string -- "TO_UM","FROM_UM" <br>
     * amount -- mandatory/decimal <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#bnb-transfer-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#bnb-transfer-user_data</a>
     */
    public String bnbTransfer(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "transferSide", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, BNB_TRANSFER, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String SWITCH_AUTO_REPAY_FUTURES = "/sapi/v1/portfolio/repay-futures-switch";
    /**
     * Change Auto-repay-futures Status
     * 
     * <br><br>
     * POST /sapi/v1/portfolio/repay-futures-switch
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * autoRepay -- mandatory/boolean <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#change-auto-repay-futures-status-trade">
     *      https://binance-docs.github.io/apidocs/spot/en/#change-auto-repay-futures-status-trade</a>
     */
    public String switchAutoRepayFutures(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "autoRepay");
        return requestHandler.sendSignedRequest(baseUrl, SWITCH_AUTO_REPAY_FUTURES, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String AUTO_REPAY_FUTURES_STATUS = "/sapi/v1/portfolio/repay-futures-switch";
    /**
     * Query Auto-repay-futures Status
     * 
     * <br><br>
     * GET /sapi/v1/portfolio/repay-futures-switch
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-auto-repay-futures-status-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#get-auto-repay-futures-status-user_data</a>
     */
    public String autoRepayFuturesStatus(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, AUTO_REPAY_FUTURES_STATUS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REPAY_FUTURES = "/sapi/v1/portfolio/repay-futures-negative-balance";
    /**
     * Repay futures Negative Balance
     * 
     * <br><br>
     * POST /sapi/v1/portfolio/repay-futures-negative-balance
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#repay-futures-negative-balance-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#repay-futures-negative-balance-user_data</a>
     */
    public String repayFutures(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, REPAY_FUTURES, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ASSET_LEVERAGE = "/sapi/v1/portfolio/margin-asset-leverage";
    /**
     * GET /sapi/v1/portfolio/margin-asset-leverage
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-portfolio-margin-asset-leverage-user_data">
     *      https://binance-docs.github.io/apidocs/spot/en/#get-portfolio-margin-asset-leverage-user_data</a>
     */
    public String assetLeverage() {
        return requestHandler.sendSignedRequest(baseUrl, ASSET_LEVERAGE, null, HttpMethod.GET, showLimitUsage);
    }
}
