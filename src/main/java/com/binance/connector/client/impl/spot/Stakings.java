package com.binance.connector.client.impl.spot;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.RequestHandler;

import java.util.LinkedHashMap;

/**
 * <h2>Stakings Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#staking-endpoints">Stakings Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Stakings {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Stakings(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, secretKey);
        this.showLimitUsage = showLimitUsage;
    }

    private final String PRODUCT_LIST = "/sapi/v1/staking/productList";
    /**
     * GET /sapi/v1/staking/productList
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * product -- mandatory/enum -- "STAKING", "F_DEFI", "L_DEFI"<br>
     * asset -- optional/string -- "ALL", "TRUE"; Default: "ALL" <br>
     * current -- optional/long -- Current query page. Default: 1, Min: 1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-staking-product-list-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-staking-product-list-user_data</a>
     */
    public String productList(LinkedHashMap<String,Object> parameters) {
        ParameterChecker.checkParameter(parameters, "product", String.class);
        return requestHandler.sendSignedRequest(baseUrl, PRODUCT_LIST, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String POSITION = "/sapi/v1/staking/position";
    /**
     * GET /sapi/v1/staking/position
     * <br>
     * @param
     * parameters LinkedHashedMap of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * product -- mandatory/enum -- "STAKING", "F_DEFI", "L_DEFI"<br>
     * productId -- optional/enum<br>
     * asset -- optional/string -- "ALL", "TRUE"; Default: "ALL" <br>
     * current -- optional/long -- Current query page. Default: 1, Min: 1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-staking-product-position-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-staking-product-position-user_data</a>
     */
    public String position(LinkedHashMap<String,Object> parameters) {
        ParameterChecker.checkParameter(parameters, "product", String.class);
        return requestHandler.sendSignedRequest(baseUrl, POSITION, parameters, HttpMethod.GET, showLimitUsage);
    }
}
