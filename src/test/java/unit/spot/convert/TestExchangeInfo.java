package unit.spot.convert;

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

public class TestExchangeInfo {
    private MockWebServer mockWebServer;
    private String baseUrl;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testExchangeInfoWithoutParameters() {
        String path = "/sapi/v1/convert/exchangeInfo";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result =  client.createConvert().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }

    @Test
    public void testExchangeInfoWithParameters() {
        String path = "/sapi/v1/convert/exchangeInfo?fromAsset=BTC&toAsset=USDT";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("fromAsset", "BTC");
        parameters.put("toAsset", "USDT");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(baseUrl);
        String result =  client.createConvert().exchangeInfo(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
