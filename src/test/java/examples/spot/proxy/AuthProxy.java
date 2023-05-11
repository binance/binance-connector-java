package examples.spot.proxy;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.ProxyAuth;

import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;


public final class AuthProxy {
    
    private AuthProxy() {

    }
    
    private static final Integer proxyPort = 3128;

    public static void main(String[] args) throws IOException { 
        SpotClient client = new SpotClientImpl();

        Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1",  proxyPort));
        Authenticator auth = new Authenticator() {
            public Request authenticate(Route route, Response response) throws IOException {
                // Reactive Authentication
                if (response.request().header("Proxy-Authorization") != null) {
                    return null; // Give up, we've already failed to authenticate.
                }
              
                String credential = Credentials.basic("username", "password");
                return response.request().newBuilder().header("Proxy-Authorization", credential).build();
               
            }
        };

        ProxyAuth proxy = new ProxyAuth(proxyConn, auth);

        client.setProxy(proxy);
        System.out.println(client.createMarket().time());
    }
}