package unit.margin;

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

public class TestIsolatedTransfer {
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
    public void testIsolatedTransferWithoutParameters() {
        String path = "/sapi/v1/margin/isolated/transfer";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createMargin().isolatedTransfer(parameters));
    }

    @Test
    public void testIsolatedTransfer() {
        String path = "/sapi/v1/margin/isolated/transfer?asset=BNB&symbol=BNBUSDT&transFrom=SPOT&transTo=ISOLATED_MARGIN&amount=0.1";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("asset","BNB");
        parameters.put("symbol","BNBUSDT");
        parameters.put("transFrom","SPOT");
        parameters.put("transTo","ISOLATED_MARGIN");
        parameters.put("amount",0.1);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.POST, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createMargin().isolatedTransfer(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
