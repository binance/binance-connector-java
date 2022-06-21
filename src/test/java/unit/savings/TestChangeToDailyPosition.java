package unit.savings;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.Before;
import org.junit.Test;
import unit.MockData;
import unit.MockWebServerDispatcher;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestChangeToDailyPosition {
    private MockWebServer mockWebServer;
    private String baseUrl;

    private final long lot = 1L;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testChangeToDailyPositionWithoutParameters() {
        String path = "/sapi/v1/lending/positionChanged";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createSavings().changeToDailyPosition(parameters));
    }

    @Test
    public void testChangeToDailyPosition() {
        String path = "/sapi/v1/lending/positionChanged?projectId=123&lot=1";
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("projectId", "123");
        parameters.put("lot", lot);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClientImpl client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createSavings().changeToDailyPosition(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
