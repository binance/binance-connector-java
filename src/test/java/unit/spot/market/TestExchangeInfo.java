package unit.spot.market;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestExchangeInfo {
    private MockWebServer mockWebServer;
    private String baseUrl;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testExchangeInfo() {
        String path = "/api/v3/exchangeInfo";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testExchangeInfoWithOneSymbol() {
        String path = "/api/v3/exchangeInfo?symbol=BNBUSD";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testExchangeInfoWithMultipleSymbol() {
        String path = String.format("/api/v3/exchangeInfo?symbols=%s",
                                    UrlBuilder.urlEncode("[\"BNBUSDT\",\"BTCUSDT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BNBUSDT");
        symbols.add("BTCUSDT");
        parameters.put("symbols", symbols);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testExchangeInfoWithOnePermission() {
        String path = String.format("/api/v3/exchangeInfo?permissions=%s",
                                    UrlBuilder.urlEncode("[\"MARGIN\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> permissions = new ArrayList<>();
        permissions.add("MARGIN");
        parameters.put("permissions", permissions);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testExchangeInfoWithMultiplePermissions() {
        String path = String.format("/api/v3/exchangeInfo?permissions=%s",
                                    UrlBuilder.urlEncode("[\"MARGIN\",\"SPOT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> permissions = new ArrayList<>();
        permissions.add("MARGIN");
        permissions.add("SPOT");
        parameters.put("permissions", permissions);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }


    @Test
    public void testExchangeInfoWithInvalidType() {
        String path = String.format("/api/v3/exchangeInfo?symbols=%s",
                                    UrlBuilder.urlEncode("[\"BNBUSDT\",\"BTCUSDT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        String[] symbols = {"BNBUSDT", "BTCUSDT"};
        parameters.put("symbols", symbols);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().exchangeInfo(parameters));
    }

    @Test
    public void testExchangeInfoPermissionsWithInvalidType() {
        String path = String.format("/api/v3/exchangeInfo?permissions=%s",
                                    UrlBuilder.urlEncode("[\"MARGIN\",\"SPOT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        String[] permissions = {"MARGIN", "SPOT"};
        parameters.put("permissions", permissions);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().exchangeInfo(parameters));
    }

    @Test
    public void testExchangeInfoWithDoubleParameter() {
        String path = String.format("/api/v3/exchangeInfo?symbols=%s",
                    UrlBuilder.urlEncode("[\"BNBUSDT\",\"BTCUSDT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BNBUSDT");
        symbols.add("BTCUSDT");

        parameters.put("symbols", symbols);
        parameters.put("symbol", "ETHUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().exchangeInfo(parameters));
    }

    @Test
    public void testExchangeInfoWithSymbolAndPermissionsParameters() {
        String path = String.format("/api/v3/exchangeInfo?symbol=%s",
                UrlBuilder.urlEncode("[\"ETHUSDT\"]"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        
        ArrayList<String> permissions = new ArrayList<>();
        permissions.add("MARGIN");
        permissions.add("SPOT");

        parameters.put("permissions", permissions);
        parameters.put("symbol", "ETHUSDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().exchangeInfo(parameters));
    }
}
