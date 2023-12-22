package unit.spot.autoinvest;

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

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestRedeemIndexPlan {
    private MockWebServer mockWebServer;
    private String baseUrl;
    
    private static final long indexId = 123456;
    private static final Integer redemptionPercentage = 10;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }

    @Test
    public void testRedeemIndexPlanWithoutParameters() {
        String path = "/sapi/v1/lending/auto-invest/redeem";
        Map<String, Object> parameters = new LinkedHashMap<>();

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        assertThrows(BinanceConnectorException.class, () -> client.createAutoInvest().redeemIndexPlan(parameters));
    }
    
    @Test
    public void testRedeemIndexPlan() {
        String path = "/sapi/v1/lending/auto-invest/redeem?indexId=123456&redemptionPercentage=10";
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("indexId", indexId);
        parameters.put("redemptionPercentage", redemptionPercentage);

        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, path, MockData.MOCK_RESPONSE, HttpMethod.POST, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        SpotClient client = new SpotClientImpl(MockData.API_KEY, MockData.SECRET_KEY, baseUrl);
        String result = client.createAutoInvest().redeemIndexPlan(parameters);
        assertEquals(MockData.MOCK_RESPONSE, result);
    }
}
