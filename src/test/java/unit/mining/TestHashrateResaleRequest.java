package unit.mining;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestHashrateResaleRequest {
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
    public void testHashrateResaleRequestWithoutParameters() {
        String path = "/sapi/v1/mining/hash-transfer/config";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMining().hashrateResaleRequest(parameters));
    }

    @Test
    public void testHashrateResaleRequest() {
        String path = "/sapi/v1/mining/hash-transfer/config?userName=test&algo=sha256&endDate=1234567&startDate=1234566&toPoolUser=test&hashRate=1111";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("userName","test");
        parameters.put("algo","sha256");
        parameters.put("endDate",1234567L);
        parameters.put("startDate",1234566L);
        parameters.put("toPoolUser","test");
        parameters.put("hashRate",1111L);


        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createMining().hashrateResaleRequest(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
