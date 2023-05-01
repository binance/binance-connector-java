package com.binance.connector.client.impl.websocketapi;

import org.json.JSONObject;

import com.binance.connector.client.utils.JSONParser;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

/**
 * <h2>User Data Stream Requests</h2>
 * All requests under the
 * <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#user-data-stream-requests">User Data Stream requests</a>
 * section of the WebSocket API documentation will be implemented in this class.
 * <br>
 * Response will be returned as callback.
 */
public class WebSocketApiUserDataStream {
    
    private WebSocketApiRequestHandler handler;

    public WebSocketApiUserDataStream(WebSocketApiRequestHandler handler) {
        this.handler = handler;
    }

    /**
     * Start a new user data stream.<br>
     * 
     * The response will output a listen key that can be subscribed through on the WebSocket stream afterwards.<br>
     * 
     * Note: the stream will close in 60 minutes unless userDataStream.ping requests are sent regularly.<br>
     * 
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#start-user-data-stream-user_stream">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#start-user-data-stream-user_stream</a>
     */
    public void userDataStreamStart(JSONObject parameters) {
        this.handler.apiRequest("userDataStream.start", parameters);
    }

    /**
     * Ping a user data stream to keep it alive.<br>
     * 
     * User data streams close automatically after 60 minutes, even if you're listening to them on WebSocket Streams.<br>
     * In order to keep the stream open, you have to regularly send pings using the userDataStream.ping request.<br>
     * It is recommended to send a ping once every 30 minutes.<br>
     * 
     * Note: the stream will close in 60 minutes unless userDataStream.ping requests are sent regularly.<br>
     * 
     * @param listenKey -- required/String <br>
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#ping-user-data-stream-user_stream">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#ping-user-data-stream-user_stream</a>
     */
    public void userDataStreamPing(String listenKey, JSONObject parameters) {
        ParameterChecker.checkParameterType(listenKey, String.class, "listenKey");
        parameters = JSONParser.addKeyValue(parameters, "listenKey", listenKey);
        this.handler.apiRequest("userDataStream.ping", parameters);
    }

    /**
     * Explicitly stop and close the user data stream.<br>
     * 
     * @param listenKey -- required/String <br>
     * @param parameters JSONObject composed by key-value pairs:
     * <br><br>
     * requestId -- optional/String or int <br>
     * 
     * @see <a href="https://binance-docs.github.io/apidocs/websocket_api/en/#stop-user-data-stream-user_stream">
     *     https://binance-docs.github.io/apidocs/websocket_api/en/#stop-user-data-stream-user_stream</a>
     */
    public void userDataStreamStop(String listenKey, JSONObject parameters) {
        ParameterChecker.checkParameterType(listenKey, String.class, "listenKey");
        parameters = JSONParser.addKeyValue(parameters, "listenKey", listenKey);
        this.handler.apiRequest("userDataStream.stop", parameters);
    }
}
