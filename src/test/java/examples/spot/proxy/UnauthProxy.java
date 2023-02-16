package examples.spot.proxy;

import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.ProxyAuth;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class UnauthProxy {
    private UnauthProxy() {
    }

    private static final Integer proxyPort = 80;

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl();
        
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        System.out.println(client.createMarket().time());

        client.unsetProxy();
        System.out.println(client.createMarket().time());
    }
}
