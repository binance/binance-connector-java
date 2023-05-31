package unit.spot.subaccount;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.UrlBuilder;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestSubAccountUniversalTransfer {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final double amount = 1;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testUniversalTransferWithoutParameters() {
        String path = "/sapi/v1/sub-account/universalTransfer";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createSubAccount().universalTransfer(parameters));
    }

    @Test
    public void testUniversalTransfer() {
        String path = String.format("/sapi/v1/sub-account/universalTransfer?fromEmail=%s&toEmail=%s&fromAccountType=SPOT&toAccountType=USDT_FUTURE&asset=BNB&amount=1",
                UrlBuilder.urlEncode("alice@test.com"), UrlBuilder.urlEncode("bob@test.com"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("fromEmail", "alice@test.com");
        parameters.put("toEmail", "bob@test.com");
        parameters.put("fromAccountType", "SPOT");
        parameters.put("toAccountType", "USDT_FUTURE");
        parameters.put("asset", "BNB");
        parameters.put("amount", amount);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createSubAccount().universalTransfer(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
