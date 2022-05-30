package com.binance.connector.client.impl.spot;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.RequestHandler;

import java.util.LinkedHashMap;

public class PortfolioMargin {
    /**
     * <h2>Portfolio Margin Endpoints</h2>
     * All endpoints under the
     * <a href="https://binance-docs.github.io/apidocs/spot/en/#portfolio-margin-endpoints">PortfolioMargin Endpoint</a>
     * section of the API documentation will be implemented in this class.
     * <br>
     * Response will be returned in <i>String format</i>.
     */
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public PortfolioMargin(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, secretKey);
        this.showLimitUsage = showLimitUsage;
    }

    private final String ACCOUNT = "/sapi/v1/portfolio/account";
    /**
     * GET /sapi/v1/portfolio/account
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-portfolio-margin-account-info-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-portfolio-margin-account-info-user_data</a>
     */
    public String getAccount(LinkedHashMap<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }
}
