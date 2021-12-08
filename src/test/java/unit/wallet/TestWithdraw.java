package unit.wallet;

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

public class TestWithdraw {
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
    public void testWithdrawWithoutCoin() {
        String path = "/sapi/v1/capital/withdraw/apply?amount=0.01&address=add";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("amount", 0.01);
        parameters.put("address", "add");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        client.createWallet().withdraw(parameters);
    }

    @Test
    public void testWithdrawWithoutAmount() {
        String path = "/sapi/v1/capital/withdraw/apply?coin=BNB&address=add";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNB");
        parameters.put("address", "add");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        client.createWallet().withdraw(parameters);
    }

    @Test
    public void testWithdrawWithoutAddress() {
        String path = "/sapi/v1/capital/withdraw/apply?coin=BNB&amount=0.01";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNB");
        parameters.put("amount", 0.01);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        thrown.expect(BinanceConnectorException.class);
        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        client.createWallet().withdraw(parameters);
    }

    @Test
    public void testWithdraw() {
        String path = "/sapi/v1/capital/withdraw/apply?coin=BNB&amount=0.01&address=add";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNB");
        parameters.put("amount", 0.01);
        parameters.put("address", "add");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createWallet().withdraw(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
