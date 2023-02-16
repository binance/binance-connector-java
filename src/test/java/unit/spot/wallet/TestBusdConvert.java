package unit.spot.wallet;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockData;
import unit.MockWebServerDispatcher;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestBusdConvert {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final BigDecimal amount = new BigDecimal(1);
    private final double wrongAmountType = 0.01;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testBusdConverWithWrongParamType() {
        String path = "/sapi/v1/asset/convert-transfer";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("clientTranId", "118263407119");
        parameters.put("asset", "BUSD");
        parameters.put("amount", wrongAmountType);
        parameters.put("targetAsset", "USDC");
        parameters.put("accountType", "MAIN");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createWallet().busdConvert(parameters));
    }

    @Test
    public void testBusdConverWithoutMandatoryParam() {
        String path = "/sapi/v1/asset/convert-transfer";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("clientTranId", "118263407119");
        parameters.put("amount", amount);
        parameters.put("targetAsset", "USDC");
        parameters.put("accountType", "MAIN");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createWallet().busdConvert(parameters));
    }

    @Test
    public void testBusdConvert() {
        String path = "/sapi/v1/asset/convert-transfer";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("clientTranId", "118263407119");
        parameters.put("asset", "BUSD");
        parameters.put("amount", amount);
        parameters.put("targetAsset", "USDC");
        parameters.put("accountType", "MAIN");

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createWallet().busdConvert(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
