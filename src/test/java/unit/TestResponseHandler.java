package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceServerException;
import com.binance.connector.client.utils.ResponseHandler;

import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

public class TestResponseHandler {
    private MockWebServer mockWebServer;
    private Request request;
    private final String VALID_RESPONSE = "VALID";

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.request = new Request.Builder()
                .url(mockWebServer.url("/").toString())
                .addHeader("Accept", "application/json")
                .build();
    }

    @Test
    public void testHandleResponse() {
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(MockData.HTTP_STATUS_OK)
                .setBody(VALID_RESPONSE));

        String result = ResponseHandler.handleResponse(request, false, null);
        assertEquals(VALID_RESPONSE, result);
    }

    @Test
    public void testWith400JSONErrorMsg() {
        String mockErrorMsg = "{\"code\":-1000, \"msg\":\"error\"}";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(MockData.HTTP_STATUS_CLIENT_ERROR)
                .setBody(mockErrorMsg));

        BinanceClientException thrown = assertThrows(BinanceClientException.class, () -> ResponseHandler.handleResponse(request, false, null));
        assertTrue(thrown.getMessage().contains(mockErrorMsg));
    }

    @Test
    public void testWith400ErrorMsg() {
        String mockErrorMsg = "Error Message";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(MockData.HTTP_STATUS_CLIENT_ERROR)
                .setBody(mockErrorMsg));

        BinanceClientException thrown = assertThrows(BinanceClientException.class, () -> ResponseHandler.handleResponse(request, false, null));
        assertTrue(thrown.getMessage().contains(mockErrorMsg));
    }

    @Test
    public void testWith500ErrorMsg() {
        String mockErrorMsg = "Error Message";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(MockData.HTTP_STATUS_SERVER_ERROR)
                .setBody(mockErrorMsg));

        BinanceServerException thrown = assertThrows(BinanceServerException.class, () -> ResponseHandler.handleResponse(request, false, null));
        assertTrue(thrown.getMessage().contains(mockErrorMsg));
    }
}
