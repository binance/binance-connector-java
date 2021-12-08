package unit.subaccount;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

public class TestQuerySubAccountSpotTransfer {
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
    public void testSpotSummary() {
        String path = String.format("/sapi/v1/sub-account/sub/transfer/history?fromEmail=%s&toEmail=%s&startTime=100001&endTime=100002&page=1&limit=1",
                UrlBuilder.urlEncode("alice@test.com"), UrlBuilder.urlEncode("bob@test.com"));
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("fromEmail","alice@test.com");
        parameters.put("toEmail","bob@test.com");
        parameters.put("startTime",100001);
        parameters.put("endTime",100002);
        parameters.put("page",1);
        parameters.put("limit",1);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createSubAccount().spotTransferHistory(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
