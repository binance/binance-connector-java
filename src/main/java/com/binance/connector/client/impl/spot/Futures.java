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
     * asset -- optional/string -- The asset being transferred, e.g. USDT <br>
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

    private final String HISTORICAL_DATA = "/sapi/v1/futures/histDataLink";
    /**
     * GET /sapi/v1/futures/histDataLink
     * 
     * - The span between startTime and endTime can't be more than 7 days
     * - The downloand link will be valid for 1 day
     * - Only VIP user can query this endpoint
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string -- symbol name, e.g. BTCUSDT or BTCUSD_PERP <br>
     * dataType -- mandatory/enum -- "T_DEPTH" for ticklevel orderbook data, "S_DEPTH" for orderbook snapshot data <br>
     * startTime -- mandatory/long <br>
     * endTime -- mandatory/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-future-ticklevel-orderbook-historical-data-download-link-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-future-ticklevel-orderbook-historical-data-download-link-user_data</a>
     */
    public String futuresOrderBookHistory(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "dataType", String.class);
        ParameterChecker.checkParameter(parameters, "startTime", Long.class);
        ParameterChecker.checkParameter(parameters, "endTime", Long.class);
        return requestHandler.sendSignedRequest(baseUrl, HISTORICAL_DATA, parameters, HttpMethod.GET, showLimitUsage);
    }
}
