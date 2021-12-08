package unit.subaccount;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unit.MockWebServerDispatcher;

public class TestSubAccountFuturesInternalTransfer {
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

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFuturesInternalTransWithoutParameters() {
        String path = "/sapi/v1/sub-account/futures/internalTransfer";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        client.createSubAccount().futuresInternalTransfer(parameters);
    }

    @Test
    public void testFuturesInternalTrans() {
        String path = String.format("/sapi/v1/sub-account/futures/internalTransfer?fromEmail=%s&toEmail=%s&futuresType=1&asset=BNB&amount=1",
                UrlBuilder.urlEncode("alice@test.com"), UrlBuilder.urlEncode("bob@test.com"));
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("fromEmail","alice@test.com");
        parameters.put("toEmail","bob@test.com");
        parameters.put("futuresType",1);
        parameters.put("asset","BNB");
        parameters.put("amount",1);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createSubAccount().futuresInternalTransfer(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
