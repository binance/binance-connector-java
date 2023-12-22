package unit.spot.margin;

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

public class TestSmallLiabilityExchangeHistory {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final int current = 1;
    private final int size = 10;
    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testSmallLiabilityExchangeHistoryWithoutParameters() {
        String path = "/sapi/v1/margin/exchange-small-liability-history";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMargin().smallLiabilityExchangeHistory(parameters));
    }
    
    @Test
    public void testSmallLiabilityExchangeHistory() {
        String path = "/sapi/v1/margin/exchange-small-liability-history?current=1&size=10";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("current", current);
        parameters.put("size", size);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createMargin().smallLiabilityExchangeHistory(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
