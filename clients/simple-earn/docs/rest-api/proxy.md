# Proxy Configuration

```java
    import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
    import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;
    import okhttp3.Authenticator;
    import okhttp3.Credentials;
    import okhttp3.Request;
    import okhttp3.Response;
    import okhttp3.Route;
    
    import java.io.IOException;
    import java.net.InetSocketAddress;
    import java.net.Proxy;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = SimpleEarnRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        
        // Create the HTTP proxy
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("host", 123));
        // Add the proxy to the configuration
        clientConfiguration.setProxy(proxy);

        // Create the Proxy Authenticator
        Authenticator proxyAuthenticator = new Authenticator() {
            @Override public Request authenticate(Route route, Response response) throws IOException {
                String credential = Credentials.basic("username", "password");
                return response.request().newBuilder()
                        .header("Proxy-Authorization", credential)
                        .build();
            }
        };
        
        // Add the proxy authenticator to the configuration
        clientConfiguration.setProxyAuthenticator(proxyAuthenticator);

        SimpleEarnRestApi api = new SimpleEarnRestApi(clientConfiguration);
    }
```