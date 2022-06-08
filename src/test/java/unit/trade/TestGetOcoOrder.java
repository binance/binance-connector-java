package unit.trade;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestGetOcoOrder {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final String prefix = "/";
    private final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";
    private final String apiKey = "apiKey";
    private final String secretKey = "secretKey";

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(prefix).toString();
    }

    @Test
    public void testGetOcoOrderWithoutId() {
        String path = "/api/v3/orderList";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 400);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        assertThrows(BinanceClientException.class, () -> client.createTrade().getOCOOrder(parameters));
    }

    @Test
    public void testCancelOpenOrders() {
        String path = "/api/v3/orderList?symbol=BNBUSDT&orderListId=123&origClientOrderId=456&recvWindow=1000";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("orderListId",123);
        parameters.put("origClientOrderId",456);
        parameters.put("recvWindow",1000);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createTrade().getOCOOrder(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
