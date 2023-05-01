package com.binance.connector.client.impl.websocketapi;

import org.json.JSONObject;

import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

/**
 * <h2>General Requests</h2>
 * All requests under the
 * <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#general-info">General requests</a>
 * section of the WebSocket API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketApiGeneral {
    private WebSocketApiRequestHandler handler;

    public WebSocketApiGeneral(WebSocketApiRequestHandler handler) {
        this.handler = handler;
    }

    /**
     * Test connectivity to the WebSocket API.<br>
     * Note:<br>
     * You can use regular WebSocket ping frames to test connectivity as well, WebSocket API will respond with pong frames as soon as possible.<br>
     * ping request along with time is a safe way to test request-response handling in your application.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#test-connectivity">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#test-connectivity</a>
     */
    public void ping(JSONObject parameters) {
        this.handler.publicRequest("ping", parameters);
    }

    /**
     * Test connectivity to the WebSocket API and get the current server time.
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#check-server-time">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#check-server-time</a>
     */
    public void serverTime(JSONObject parameters) {
        this.handler.publicRequest("time", parameters);
    }

    /**
     * Query current exchange trading rules, rate limits, and symbol information.<br>
     * 
     * Notes:<br>
     * Without parameters, exchangeInfo displays all symbols with ["SPOT, "MARGIN", "LEVERAGED"] permissions.<br>
     * In order to list all active symbols on the exchange, you need to explicitly request all permissions.<br>
     * <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#enum-definitions">Available Permissions</a>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * symbol -- optional/String <br>
     * symbols -- optional/Array of String <br>
     * permissions -- optional/Array of String  <br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#exchange-information">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#exchange-information</a>
     */
    public void exchangeInfo(JSONObject parameters) {
        ParameterChecker.checkOnlyOneOfParameters(parameters, "symbol", "symbols", "permissions");
        this.handler.publicRequest("exchangeInfo", parameters);
    }

}
