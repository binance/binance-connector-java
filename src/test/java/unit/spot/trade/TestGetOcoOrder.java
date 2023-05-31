package unit.spot.trade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.impl.SpotClientImpl;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestGetOcoOrder {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final int orderListId = 123;
    private final int origClientOrderId = 456;
    private final int recvWindow = 1000;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testGetOcoOrderWithoutId() {
        String path = "/api/v3/orderList";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_CLIENT_ERROR);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceClientException.class, () -> client.createTrade().getOCOOrder(parameters));
    }

    @Test
    public void testCancelOpenOrders() {
        String path = "/api/v3/orderList?symbol=BNBUSDT&orderListId=123&origClientOrderId=456&recvWindow=1000";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("orderListId", orderListId);
        parameters.put("origClientOrderId", origClientOrderId);
        parameters.put("recvWindow", recvWindow);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createTrade().getOCOOrder(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
