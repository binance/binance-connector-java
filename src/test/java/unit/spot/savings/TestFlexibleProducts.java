package unit.spot.savings;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestFlexibleProducts {
    private MockWebServer mockWebServer;
    private String baseUrl;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testFlexibleProducts() {
        String path = "/sapi/v1/lending/daily/product/list?status=ALL&featured=ALL";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("status", "ALL");
        parameters.put("featured", "ALL");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createSavings().flexibleProducts(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
