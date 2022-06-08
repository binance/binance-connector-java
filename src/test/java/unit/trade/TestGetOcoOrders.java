package unit.trade;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class TestGetOcoOrders {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final String prefix = "/";
    private final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";
    private final String apiKey = "apiKey";
    private final String secretKey = "secretKey";
    private final long startTime = System.currentTimeMillis();
    private final long endTime = startTime + 1000;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(prefix).toString();
    }

    @Test
    public void testGetOcoOrdersWithoutParams() {
        String path = "/api/v3/allOrderList";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createTrade().getOCOOrders(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }

    @Test
    public void testGetOcoOrdersWithParams() {
        String path = String.format("/api/v3/allOrderList?fromId=123&startTime=%s&endTime=%s&limit=10", startTime, endTime);
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("fromId",123);
        parameters.put("startTime",startTime);
        parameters.put("endTime",endTime);
        parameters.put("limit",10);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createTrade().getOCOOrders(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
