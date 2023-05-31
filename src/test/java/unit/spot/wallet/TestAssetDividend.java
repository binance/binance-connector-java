package unit.spot.wallet;

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

public class TestAssetDividend {
    private MockWebServer mockWebServer;
    private String baseUrl;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testAssetDividend() {
        String path = "/sapi/v1/asset/assetDividend?asset=BNB&startTime=1591063000087&endTime=1591063000087&limit=10";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "BNB");
        parameters.put("startTime", "1591063000087");
        parameters.put("endTime", "1591063000087");
        parameters.put("limit", "10");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createWallet().assetDividend(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
