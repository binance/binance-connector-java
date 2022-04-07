package unit.userdata;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unit.MockWebServerDispatcher;

public class TestCreateIsolatedMarginListenKey {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final String prefix = "/";
    private final String MOCK_RESPONSE = "{\"listenKey\": \"value_1\", \"key_2\": \"value_2\"}";
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
    public void testCreateIsolatedListenKeyWithoutParameters() {
        String path = "/sapi/v1/userDataStream/isolated";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        client.createUserData().createIsolatedMarginListenKey(parameters);
    }

    @Test
    public void testCreateIsolatedListenKey() {
        String path = "/sapi/v1/userDataStream/isolated?symbol=BNBUSDT&listenKey=test";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("listenKey","test");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createUserData().createIsolatedMarginListenKey(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
