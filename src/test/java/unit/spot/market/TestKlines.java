package unit.spot.market;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestKlines {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final long startTime = System.currentTimeMillis();
    private final long endTime = startTime + 1000;

    private final int limit = 1000;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testKlinesWithoutSymbol() {
        String path = "/api/v3/klines?interval=1m";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("interval", "1m");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().klines(parameters));
    }

    @Test
    public void testKlinesWithoutInterval() {
        String path = "/api/v3/klines?symbol=BNBUSDT";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().klines(parameters));
    }

    @Test
    public void testKlines() {
        String path = "/api/v3/klines?symbol=BNBUSDT&interval=1m";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("interval", "1m");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().klines(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testKlinesWithParameters() {
        String path = String.format("/api/v3/klines?symbol=BNBUSDT&interval=1m&limit=1000&startTime=%s&endTime=%s", startTime, endTime);
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("interval", "1m");
        parameters.put("limit", limit);
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().klines(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
