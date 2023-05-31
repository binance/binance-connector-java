package unit.spot.mining;

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

public class TestHashrateResaleList {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final int pageIndex = 1;
    private final int pageSize = 1;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testHashrateResaleList() {
        String path = "/sapi/v1/mining/hash-transfer/config/details/list?pageIndex=1&pageSize=1";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("pageIndex", pageIndex);
        parameters.put("pageSize", pageSize);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createMining().hashrateResaleList(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
