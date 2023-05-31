package unit.spot.trade;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestGetOcoOrders {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final long startTime = System.currentTimeMillis();
    private final long endTime = startTime + 1000;

    private final int fromId = 123;
    private final int limit = 10;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testGetOcoOrdersWithoutParams() {
        String path = "/api/v3/allOrderList";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createTrade().getOCOOrders(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testGetOcoOrdersWithParams() {
        String path = String.format("/api/v3/allOrderList?fromId=123&startTime=%s&endTime=%s&limit=10", startTime, endTime);
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("fromId", fromId);
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);
        parameters.put("limit", limit);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createTrade().getOCOOrders(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
