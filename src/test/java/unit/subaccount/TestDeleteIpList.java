package unit.subaccount;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestDeleteIpList {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final String prefix = "/";
    private final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";
    private final String apiKey = "apiKey";
    private final String secretKey = "secretKey";

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(prefix).toString();
    }

    @Test
    public void testDeleteIpListWithoutParameters() {
        String path = "/sapi/v1/sub-account/subAccountApi/ipRestriction/ipList";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.DELETE, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createSubAccount().deleteIpList(parameters));
    }

    @Test
    public void  testDeleteIpList() {
        String path = String.format("/sapi/v1/sub-account/subAccountApi/ipRestriction/ipList?email=%s&subAccountApiKey=abc&ipAddress=1.1.1.1",
                UrlBuilder.urlEncode("alice@test.com"));
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("email","alice@test.com");
        parameters.put("subAccountApiKey", "abc");
        parameters.put("ipAddress", "1.1.1.1");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.DELETE, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createSubAccount().deleteIpList(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
