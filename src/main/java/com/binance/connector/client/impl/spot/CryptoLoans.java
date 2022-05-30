package com.binance.connector.client.impl.spot;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestHandler;

import java.util.LinkedHashMap;

/**
 * <h2>Crypto Loans Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#crypto-loans-endpoints">Crypto Loans Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class CryptoLoans {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public CryptoLoans(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, secretKey);
        this.showLimitUsage = showLimitUsage;
    }

    private final String LOAN_INCOME = "/sapi/v1/loan/income";
    /**
     * GET /sapi/v1/loan/income
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * asset -- mandatory/string <br>
     * type -- optional/string -- All types will be returned by default. Enum：borrowIn ,collateralSpent, repayAmount, collateralReturn(Collateral return after repayment), addCollateral, removeCollateral, collateralReturnAfterLiquidation <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- default 20, max 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-crypto-loans-income-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-crypto-loans-income-history-user_data</a>
     */
    public String loanIncome(LinkedHashMap<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        return requestHandler.sendSignedRequest(baseUrl, LOAN_INCOME, parameters, HttpMethod.GET, showLimitUsage);
    }
}
