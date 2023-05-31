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

public class TestQuerySubAccountFuturesTransfer {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final int startTime = 100001;
    private final int endTime = 100002;
    private final int page = 1;
    private final int limit = 1;
    private final int futuresType = 1;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testFuturesInternalTransferWithoutParameters() {
        String path = "/sapi/v1/sub-account/futures/internalTransfer";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createSubAccount().getFuturesInternalTransfer(parameters));
    }

    @Test
    public void testFuturesInternalTransfer() {
        String path = String.format("/sapi/v1/sub-account/futures/internalTransfer?email=%s&futuresType=1&startTime=100001&endTime=100002&page=1&limit=1",
                UrlBuilder.urlEncode("alice@test.com"));
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "alice@test.com");
        parameters.put("futuresType", futuresType);
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);
        parameters.put("page", page);
        parameters.put("limit", limit);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createSubAccount().getFuturesInternalTransfer(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
