package unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.RequestBuilder;

import okhttp3.Request;

public class TestRequestBuilder {
    private final String fullUrl = "http://www.test.com/url/path?key1=value1&key2=value2&key3=value3";

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
        BinanceConnectorException thrown = assertThrows(BinanceConnectorException.class, () -> RequestBuilder.buildPublicRequest(fullUrl, HttpMethod.INVALID));
        assertTrue(thrown.getMessage().contains("Invalid HTTP method: "));
    }

    @Test
    public void testPublicInvalidUrl() {
        String invalidUrl = "invalid";

        BinanceConnectorException thrown = assertThrows(BinanceConnectorException.class, () -> RequestBuilder.buildPublicRequest(invalidUrl, HttpMethod.POST));
        assertTrue(thrown.getMessage().contains("Invalid URL: "));
    }

    @Test
    public void testApiKeyPostMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.POST, MockData.API_KEY);
        assertEquals(request.method(), HttpMethod.POST.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyGetMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.GET, MockData.API_KEY);
        assertEquals(request.method(), HttpMethod.GET.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyPutMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.PUT, MockData.API_KEY);
        assertEquals(request.method(), HttpMethod.PUT.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyDeleteMethod() {
        Request request = RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.DELETE, MockData.API_KEY);
        assertEquals(request.method(), HttpMethod.DELETE.toString());
        assertEquals(request.url().toString(), fullUrl);
    }

    @Test
    public void testApiKeyInvalidMethod() {
        BinanceConnectorException thrown = assertThrows(BinanceConnectorException.class, () -> RequestBuilder.buildApiKeyRequest(fullUrl, HttpMethod.INVALID, MockData.API_KEY));
        assertTrue(thrown.getMessage().contains("Invalid HTTP method: "));
    }

    @Test
    public void testApiKeyInvalidUrl() {
        String invalidUrl = "invalid";

        BinanceConnectorException thrown = assertThrows(BinanceConnectorException.class, () -> RequestBuilder.buildApiKeyRequest(invalidUrl, HttpMethod.POST, MockData.API_KEY));
        assertTrue(thrown.getMessage().contains("Invalid URL: "));
    }

    @Test
    public void testWebSocketUrl() {
        Request request = RequestBuilder.buildWebSocketRequest(fullUrl);
        assertEquals(request.url().toString(), fullUrl);
    }
}
