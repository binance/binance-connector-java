package unit.market;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unit.MockWebServerDispatcher;

public class TestAggTrades {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final long startTime = System.currentTimeMillis();
    private final long endTime = startTime + 1000;
    private final String prefix = "/";
    private final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(prefix).toString();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testAggTradesWithoutSymbol() {
        String path = "/api/v3/aggTrades";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        client.createMarket().aggTrades(parameters);
    }

    @Test
    public void testAggTrades() {
        String path = "/api/v3/aggTrades?symbol=BNBUSDT";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().aggTrades(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }

    @Test
    public void testTradesWithLimit() {
        String path = "/api/v3/aggTrades?symbol=BNBUSDT&limit=1000";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("limit", 1000);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().aggTrades(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }

    @Test
    public void testTradesWithFromId() {
        String path = "/api/v3/aggTrades?symbol=BNBUSDT&fromId=1000";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("fromId", 1000);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().aggTrades(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }

    @Test
    public void testTradesWithTimestamp() {
        String path = String.format("/api/v3/aggTrades?symbol=BNBUSDT&startTime=%s&endTime=%s",startTime, endTime);
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        parameters.put("symbol","BNBUSDT");
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().aggTrades(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
