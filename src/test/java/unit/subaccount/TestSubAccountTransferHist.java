package unit.subaccount;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.impl.SpotClientImpl;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import unit.MockWebServerDispatcher;

public class TestSubAccountTransferHist {
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
    public void testTransferHist() {
        String path = "/sapi/v1/sub-account/transfer/subUserHistory?asset=BNB&type=1&startTime=100001&endTime=100002&limit=1";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("asset","BNB");
        parameters.put("type",1);
        parameters.put("startTime",100001);
        parameters.put("endTime",100002);
        parameters.put("limit",1);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createSubAccount().transferHistory(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
