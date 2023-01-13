package examples.proxy;

import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.ProxyAuth;

import java.net.InetSocketAddress;
import java.net.Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class UnauthProxy {
    private UnauthProxy() {
    }

    private static final Logger logger = LoggerFactory.getLogger(UnauthProxy.class);
    private static final Integer proxyPort = 80;

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl();
        
        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", proxyPort));
        ProxyAuth proxy = new ProxyAuth(proxyConn, null);
        client.setProxy(proxy);
        logger.info(client.createMarket().time());

        client.unsetProxy();
        logger.info(client.createMarket().time());
    }
}
