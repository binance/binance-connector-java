package unit;

import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceServerException;
import com.binance.connector.client.utils.ResponseHandler;
import okhttp3.Request;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestResponseHandler {
    private MockWebServer mockWebServer;
    private Request request;
    private final String VALID_RESPONSE = "VALID";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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
                .setResponseCode(200)
                .setBody(VALID_RESPONSE));

        String result = ResponseHandler.handleResponse(request, false);
        assertEquals(VALID_RESPONSE, result);
    }

    @Test
    public void testWith400JSONErrorMsg() {
        String mockErrorMsg = "{\"code\":-1000, \"msg\":\"error\"}";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(400)
                .setBody(mockErrorMsg));

        thrown.expect(BinanceClientException.class);
        thrown.expectMessage(mockErrorMsg);
        ResponseHandler.handleResponse(request, false);
    }

    @Test
    public void testWith400ErrorMsg() {
        String mockErrorMsg = "Error Message";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(400)
                .setBody(mockErrorMsg));

        thrown.expect(BinanceClientException.class);
        thrown.expectMessage(mockErrorMsg);
        ResponseHandler.handleResponse(request, false);
    }

    @Test
    public void testWith500ErrorMsg() {
        String mockErrorMsg = "Error Message";
        mockWebServer.enqueue(new MockResponse()
                .addHeader("Content-Type", "application/json; charset=utf-8")
                .setResponseCode(502)
                .setBody(mockErrorMsg));

        thrown.expect(BinanceServerException.class);
        thrown.expectMessage(mockErrorMsg);
        ResponseHandler.handleResponse(request, false);
    }
}
