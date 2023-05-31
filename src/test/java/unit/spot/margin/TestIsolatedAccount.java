package unit.spot.margin;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestIsolatedAccount {
    private MockWebServer mockWebServer;
    private String baseUrl;
    
    private final int endTime = 12345679;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }


    @Test
    public void testIsolatedAccount() {
        String path = String.format("/sapi/v1/margin/isolated/account?symbols=%s",
                UrlBuilder.urlEncode("BNBUSDT,BTCUSDT"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbols", "BNBUSDT,BTCUSDT");
        parameters.put("endTime", endTime);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createMargin().isolatedAccount(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
