package unit.futures;

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

public class TestCalcAdjustLevel {
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
    public void testCalcAdjustLevelWithoutParameters() {
        String path = "/sapi/v2/futures/loan/calcAdjustLevel";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createFutures().calcAdjustLevel(parameters));
    }

    @Test
    public void testCalcAdjustLevel() {
        String path = "/sapi/v2/futures/loan/calcAdjustLevel?loanCoin=USDT&collateralCoin=BUSD&amount=1&direction=ADDITIONAL";
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin","USDT");
        parameters.put("collateralCoin","BUSD");
        parameters.put("amount",1);
        parameters.put("direction","ADDITIONAL");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(prefix, path, MOCK_RESPONSE, HttpMethod.GET, 200);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(apiKey, secretKey, baseUrl);
        String result = client.createFutures().calcAdjustLevel(parameters);
        assertEquals(MOCK_RESPONSE, result);
    }
}
