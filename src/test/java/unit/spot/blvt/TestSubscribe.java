package unit.spot.blvt;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockData;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestSubscribe {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final double cost = 1;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }
    @Test
    public void testSubscribeWithoutParameters() {
        String path = "/sapi/v1/blvt/subscribe";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createBlvt().subscribe(parameters));
    }

    @Test
    public void testSubscribe() {
        String path = "/sapi/v1/blvt/subscribe?tokenName=USDT&cost=1";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("tokenName", "USDT");
        parameters.put("cost", cost);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createBlvt().subscribe(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
