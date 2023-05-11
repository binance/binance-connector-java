package examples.spot.proxy;

import java.net.InetSocketAddress;
import java.net.Proxy;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.ProxyAuth;

public final class UnauthProxy {
    private UnauthProxy() {
    }

    private static final Integer proxyPort = 80;

    public static void main(String[] args) {
        SpotClient client = new SpotClientImpl();
        
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        System.out.println(client.createMarket().time());

        client.unsetProxy();
        System.out.println(client.createMarket().time());
    }
}
