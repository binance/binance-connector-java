package unit;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.utils.RequestBuilder;
import com.binance.connector.client.utils.WebSocketConnection;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

import okhttp3.Request;

public final class MockData {
    private static final int intValue2 = 2;
    public static final int HTTP_STATUS_OK = 200;
    public static final int HTTP_STATUS_CLIENT_ERROR = 400;
    public static final int HTTP_STATUS_SERVER_ERROR = 502;
    public static final String PREFIX = "/";
    public static final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";
    public static final String API_KEY = "apiKey";
    public static final String SECRET_KEY = "secretKey";
    public static final Map<String, Object> MOCK_PARAMETERS = new LinkedHashMap<String, Object>() {{
            put("key1", "value1");
            put("key2", intValue2);
        }};
    public static final HmacSignatureGenerator HMAC_SIGNATURE_GENERATOR = new HmacSignatureGenerator(SECRET_KEY);
    public static final WebSocketOpenCallback noopOpenCallback = msg -> { };
    public static final WebSocketMessageCallback noopMessageCallback = msg -> { };
    public static final WebSocketClosingCallback noopClosingCallback = (code, reason) -> { };
    public static final WebSocketClosedCallback noopClosedCallback = (code, reason) -> { };
    public static final WebSocketFailureCallback noopFailureCallback = (throwable, response) -> { };
    public static final String WS_BASE_URL = "wss://base.url";
    public static final Request WS_REQUEST = RequestBuilder.buildWebSocketRequest(WS_BASE_URL);
    public static final WebSocketConnection WS_CONNECTION = new WebSocketConnection(noopOpenCallback, noopMessageCallback, noopClosingCallback, noopClosedCallback, noopFailureCallback, WS_REQUEST, null);
    public static final String WS_ID = "websocketId";
    private MockData() {
    }
}
