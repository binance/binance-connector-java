package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>NFT Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#nft-endpoints">NFT Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class NFT {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public NFT(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public NFT(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String TRANSACTIONS = "/sapi/v1/nft/history/transactions";
    /**
     * GET /sapi/v1/pay/transactions
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * orderType -- mandatory/int -- 0: purchase order, 1: sell order, 2: royalty income,
     *            3: primary market order, 4: mint fee <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 50, Max 50 <br>
     * page -- optional/int -- Default 1 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-nft-transaction-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-nft-transaction-history-user_data</a>
     */
    public String transactionsHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "orderType", Integer.class);
        return requestHandler.sendSignedRequest(baseUrl, TRANSACTIONS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String DEPOSIT = "/sapi/v1/nft/history/deposit";
    /**
     * GET /sapi/v1/nft/history/deposit
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 50, Max 50 <br>
     * page -- optional/int -- Default 1 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-nft-deposit-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-nft-deposit-history-user_data</a>
     */
    public String depositHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, DEPOSIT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String WITHDRAW = "/sapi/v1/nft/history/withdraw";
    /**
     * GET /sapi/v1/nft/history/withdraw
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/int -- Default 50, Max 50 <br>
     * page -- optional/int -- Default 1 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-nft-withdraw-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-nft-withdraw-history-user_data</a>
     */
    public String withdrawHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, WITHDRAW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String GET_ASSET = "/sapi/v1/nft/user/getAsset";
    /**
     * GET /sapi/v1/nft/user/getAsset
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * limit -- optional/int -- Default 50, Max 50 <br>
     * page -- optional/int -- Default 1 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-nft-asset-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-nft-asset-user_data</a>
     */
    public String getAsset(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, GET_ASSET, parameters, HttpMethod.GET, showLimitUsage);
    }
}
