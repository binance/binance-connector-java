package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;

/**
 * <h2>User Data Streams Endpoints</h2>
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class UserData {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public UserData(String baseUrl, String apiKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String SPOT_LISTEN_KEY = "/api/v3/userDataStream";
    /**
     * Start a new user data stream. The stream will close after 60 minutes unless a keepalive is sent.
     * If the account has an active listenKey, that listenKey will be returned and its validity will be extended for 60 minutes.
     * <br><br>
     * POST /api/v3/userDataStream
     * <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#create-a-listenkey-user_stream">
     *     https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#create-a-listenkey-user_stream</a>
     */
    public String createListenKey() {
        return requestHandler.sendApiRequest(baseUrl, SPOT_LISTEN_KEY, null, HttpMethod.POST, showLimitUsage);
    }

    /**
     * Keepalive a user data stream to prevent a time out. User data streams will close after 60 minutes.
     * It's recommended to send a ping about every 30 minutes.
     * <br><br>
     * PUT /api/v3/userDataStream
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#pingkeep-alive-a-listenkey-user_streamt">
     *     https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#pingkeep-alive-a-listenkey-user_stream</a>
     */
    public String extendListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, SPOT_LISTEN_KEY, parameters, HttpMethod.PUT, showLimitUsage);
    }

    /**
     * Close out a user data stream.
     * <br><br>
     * DELETE /api/v3/userDataStream
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#close-a-listenkey-user_stream">
     *     https://developers.binance.com/docs/binance-spot-api-docs/user-data-stream#close-a-listenkey-user_stream</a>
     */
    public String closeListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, SPOT_LISTEN_KEY, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String MARGIN_LISTEN_KEY = "/sapi/v1/userDataStream";
    /**
     * POST /sapi/v1/userDataStream
     * <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Margin-User-Data-Stream">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Margin-User-Data-Stream</a>
     */
    public String createMarginListenKey() {
        return requestHandler.sendApiRequest(baseUrl, MARGIN_LISTEN_KEY, null, HttpMethod.POST, showLimitUsage);
    }

    /**
     * PUT /sapi/v1/userDataStream
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Margin-User-Data-Stream">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Margin-User-Data-Stream</a>
     */
    public String extendMarginListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, MARGIN_LISTEN_KEY, parameters, HttpMethod.PUT, showLimitUsage);
    }

    /**
     * DELETE /sapi/v1/userDataStream
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Margin-User-Data-Stream#http-request">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Margin-User-Data-Stream#http-request</a>
     */
    public String closeMarginListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, MARGIN_LISTEN_KEY, parameters, HttpMethod.DELETE, showLimitUsage);
    }

    private final String ISOLATED_LISTEN_KEY = "/sapi/v1/userDataStream/isolated";
    /**
     * POST /sapi/v1/userDataStream/isolated
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Isolated-Margin-User-Data-Stream">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Start-Isolated-Margin-User-Data-Stream</a>
     */
    public String createIsolatedMarginListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        return requestHandler.sendApiRequest(baseUrl, ISOLATED_LISTEN_KEY, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * PUT /sapi/v1/userDataStream/isolated
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Isolated-Margin-User-Data-Stream">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Keepalive-Isolated-Margin-User-Data-Stream</a>
     */
    public String extendIsolatedMarginListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, ISOLATED_LISTEN_KEY, parameters, HttpMethod.PUT, showLimitUsage);
    }

    /**
     * DELETE /sapi/v1/userDataStream/isolated
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * symbol -- mandatory/string <br>
     * listenKey -- mandatory/string <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Isolated-Margin-User-Data-Stream#http-request">
     *     https://developers.binance.com/docs/margin_trading/trade-data-stream/Close-Isolated-Margin-User-Data-Stream#http-request</a>
     */
    public String closeIsolatedMarginListenKey(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "symbol", String.class);
        ParameterChecker.checkParameter(parameters, "listenKey", String.class);
        return requestHandler.sendApiRequest(baseUrl, ISOLATED_LISTEN_KEY, parameters, HttpMethod.DELETE, showLimitUsage);
    }
}
