package unit.websocketapi;

import static org.junit.Assert.assertThrows;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

import unit.MockData;

public class TestWebSocketApiRequestHandler {

    private JSONObject params;
    private static final double invalidReqId = 1.2;
    @Before
    public void init() {
        this.params = new JSONObject();
    }

    @Test
    public void testRequestWithoutWebSocketConnection() {
        assertThrows(BinanceConnectorException.class, () -> new WebSocketApiRequestHandler(null, MockData.API_KEY, MockData.HMAC_SIGNATURE_GENERATOR));
    }

    @Test
    public void testPublicRequestWithoutMandatoryParams() {
        WebSocketApiRequestHandler handler = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, MockData.API_KEY, MockData.HMAC_SIGNATURE_GENERATOR);
        assertThrows(BinanceConnectorException.class, () -> handler.publicRequest("", params));
    }

    @Test
    public void testApiRequestWithoutMandatoryParams() {
        WebSocketApiRequestHandler handler = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, MockData.API_KEY, MockData.HMAC_SIGNATURE_GENERATOR);
        assertThrows(BinanceConnectorException.class, () -> handler.apiRequest("", params));

        WebSocketApiRequestHandler handlerWithoutApiKey = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, null, MockData.HMAC_SIGNATURE_GENERATOR);
        assertThrows(BinanceConnectorException.class, () -> handlerWithoutApiKey.apiRequest("trades.historical", params));
    }

    @Test
    public void testSignedRequestWithoutMandatoryParams() {
        WebSocketApiRequestHandler handler = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, MockData.API_KEY, MockData.HMAC_SIGNATURE_GENERATOR);
        assertThrows(BinanceConnectorException.class, () -> handler.signedRequest("", params));

        WebSocketApiRequestHandler handlerWithoutApiKey = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, null, MockData.HMAC_SIGNATURE_GENERATOR);
        assertThrows(BinanceConnectorException.class, () -> handlerWithoutApiKey.signedRequest("order.test", params));

        WebSocketApiRequestHandler handlerWithoutsignGenerator = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, MockData.API_KEY, null);
        assertThrows(BinanceConnectorException.class, () -> handlerWithoutsignGenerator.signedRequest("order.test", params));
    }

    @Test
    public void testRequestWithInvalidRequestId() {
        WebSocketApiRequestHandler handler = new WebSocketApiRequestHandler(MockData.WS_CONNECTION, MockData.API_KEY, MockData.HMAC_SIGNATURE_GENERATOR);
        params.put("requestId", invalidReqId);
        assertThrows(BinanceConnectorException.class, () -> handler.publicRequest("ping", params));
    }

}

