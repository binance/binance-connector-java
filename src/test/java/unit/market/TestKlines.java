package unit.market;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestKlines {
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

    @Test
    public void testKlinesWithoutSymbol() {
        String path = "/api/v3/klines?interval=1m";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("interval", "1m");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().klines(parameters));
    }

    @Test
    public void testKlinesWithoutInterval() {
        String path = "/api/v3/klines?symbol=BNBUSDT";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().klines(parameters));
    }

    @Test
    public void testKlines() {
        String path = "/api/v3/klines?symbol=BNBUSDT&interval=1m";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("interval", "1m");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().klines(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }

    @Test
    public void testKlinesWithParameters() {
        String path = String.format("/api/v3/klines?symbol=BNBUSDT&interval=1m&limit=1000&startTime=%s&endTime=%s"
                                    ,startTime, endTime);
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol","BNBUSDT");
        parameters.put("interval", "1m");
        parameters.put("limit", 1000);
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(null, null, baseUrl);
        String result = client.createMarket().klines(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
