package com.binance.connector.client.impl.websocketapi;

import org.json.JSONObject;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

/**
 * <h2>Authentication requests</h2>
 * All requests under the
 * <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#authentication-requests">Authentication requests</a>
 * section of the WebSocket API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketApiAuth implements WebSocketApiModule {
    private WebSocketApiRequestHandler handler;

    public WebSocketApiAuth(WebSocketApiRequestHandler handler) {
        this.handler = handler;
    }

    /**
     * Authenticate WebSocket connection using the provided API key.<br>
     * 
     * After calling session.logon, future requests under same connection won't send apiKey and signature parameters. <br>
     * Calling session.logon multiple times changes the current authenticated API key.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * recvWindow -- optional/int -- The value cannot be greater than 60000<br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#log-in-with-api-key-signed">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#log-in-with-api-key-signed</a>
     */
    public void logon(JSONObject parameters) {
        this.handler.signedRequest("session.logon", parameters);
        
    }

    /**
     * Query the status of the WebSocket connection, inspecting which API key (if any) is used to authorize requests.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#query-session-status">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#query-session-status</a>
     */
    public void status(JSONObject parameters) {
        this.handler.publicRequest("session.status", parameters);
        
    }

    /**
     * Forget the API key previously authenticated. If the connection is not authenticated, this request does nothing.<br>
     * 
     * Note that the WebSocket connection stays open after session.logout request.<br>
     * You can continue using the connection, but now the requests will send the apiKey and signature parameters where is needed.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#log-out-of-the-session">
     *     https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api#log-out-of-the-session</a>
     */
    public void logout(JSONObject parameters) {
        this.handler.publicRequest("session.logout", parameters);
        
    }

}