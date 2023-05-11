package unit.spot.proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.junit.Before;
import org.junit.Test;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.ProxyAuth;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockWebServer;
import unit.MockData;
import unit.MockWebServerDispatcher;

public class TestHttpProxy {
    private MockWebServer mockWebServer;
    private String baseUrl;
    private final Integer proxyPort = 1234;

    @Before
    public void init() {
        this.mockWebServer = new MockWebServer();
        this.baseUrl = mockWebServer.url(MockData.PREFIX).toString();
    }


    @Test
    public void testHttpProxyWithRefusedConnection() {
        SpotClient client = new SpotClientImpl(baseUrl);
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);

        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());
    }

    @Test
    public void testHttpProxyWithUnknownHost() {
        SpotClient client = new SpotClientImpl(baseUrl);
        Proxy proxyConn =  new Proxy(Proxy.Type.HTTP, new InetSocketAddress("address", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);

        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());
    }

    @Test
    public void testNullProxyToWithProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        // Request without Proxy
        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().time();
        assertEquals(MockData.MOCK_RESPONSE, result);

        // Request with Proxy
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());
    }

    @Test
    public void testNullProxyToNoProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);

        // Request without Proxy
        SpotClient client = new SpotClientImpl(baseUrl);
        String result = client.createMarket().time();
        assertEquals(MockData.MOCK_RESPONSE, result);

        // Request with Proxy.NO_PROXY
        ProxyAuth noProxy = new ProxyAuth(Proxy.NO_PROXY, null);
        client.setProxy(noProxy);
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());
    }

    @Test
    public void testWithProxyToNullProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);
        SpotClient client = new SpotClientImpl(baseUrl);

        // Request with Proxy
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());

        // Request without Proxy
        client.unsetProxy();
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());
    }

    @Test
    public void testWithProxyToNoProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);
        SpotClient client = new SpotClientImpl(baseUrl);

        // Request with Proxy
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());

        // Request with Proxy.NO_PROXY
        ProxyAuth noProxy = new ProxyAuth(Proxy.NO_PROXY, null);
        client.setProxy(noProxy);
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());
    }

    @Test
    public void testNoProxyToNullProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);
        SpotClient client = new SpotClientImpl(baseUrl);

        // Request with Proxy.NO_PROXY
        ProxyAuth noProxy = new ProxyAuth(Proxy.NO_PROXY, null);
        client.setProxy(noProxy);
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());

        // Request without Proxy
        client.unsetProxy();
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());
        
    }
    
    @Test
    public void testNoProxyToWithProxy() {
        Dispatcher dispatcher = MockWebServerDispatcher.getDispatcher(MockData.PREFIX, "/api/v3/time", MockData.MOCK_RESPONSE, HttpMethod.GET, MockData.HTTP_STATUS_OK);
        mockWebServer.setDispatcher(dispatcher);
        SpotClient client = new SpotClientImpl(baseUrl);

        // Request with Proxy.NO_PROXY
        ProxyAuth noProxy = new ProxyAuth(Proxy.NO_PROXY, null);
        client.setProxy(noProxy);
        assertEquals(MockData.MOCK_RESPONSE, client.createMarket().time());

        // Request with Proxy
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        assertThrows(BinanceConnectorException.class, () -> client.createMarket().time());
    }
}
