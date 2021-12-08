package unit;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.RequestBuilder;
import okhttp3.Request;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestRequestBuilder {
    private final String fullUrl = "http://www.test.com/url/path?key1=value1&key2=value2&key3=value3";
    private final String apiKey = "apiKey";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testPublicPostMethod() {
        Request request = RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.POST);
        assertEquals(request.method(), HttpMethod.POST.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testPublicGetMethod() {
        Request request = RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.GET);
        assertEquals(request.method(), HttpMethod.GET.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testPublicPutMethod() {
        Request request = RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.PUT);
        assertEquals(request.method(), HttpMethod.PUT.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testPublicDeleteMethod() {
        Request request = RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.DELETE);
        assertEquals(request.method(), HttpMethod.DELETE.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testPublicInvalidMethod() {
        thrown.expect(BinanceConnectorException.class);
        thrown.expectMessage("Invalid HTTP method: ");

        RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.INVALID);
    }

    @Test
    public void testPublicInvalidUrl() {
        String invalidUrl = "invalid";
        thrown.expect(BinanceConnectorException.class);
        thrown.expectMessage("Invalid URL: ");

        RequestBuilder.buildPublicRequest(invalidUrl, HttpMethod.POST);
    }

    @Test
    public void testApiKeyPostMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.POST, apiKey);
        assertEquals(request.method(), HttpMethod.POST.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyGetMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.GET, apiKey);
        assertEquals(request.method(), HttpMethod.GET.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyPutMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.PUT, apiKey);
        assertEquals(request.method(), HttpMethod.PUT.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyDeleteMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.DELETE, apiKey);
        assertEquals(request.method(), HttpMethod.DELETE.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyInvalidMethod() {
        thrown.expect(BinanceConnectorException.class);
        thrown.expectMessage("Invalid HTTP method: ");

        RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.INVALID, apiKey);
    }

    @Test
    public void testApiKeyInvalidUrl() {
        String invalidUrl = "invalid";
        thrown.expect(BinanceConnectorException.class);
        thrown.expectMessage("Invalid URL: ");

        RequestBuilder.buildApiKeyRequest(invalidUrl, HttpMethod.POST, apiKey);
    }

    @Test
    public void testWebSocketUrl() {
        Request request = RequestBuilder.buildWebsocketRequest(fullUrl);
        assertEquals(request.url().toString(), fullUrl);
    }
}
