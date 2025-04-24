# Proxy Configuration

```java
    import com.binance.connector.client.c2c.rest.C2cRestApiUtil;
    import com.binance.connector.client.c2c.rest.api.C2cRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = C2cRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        
        // Create the HTTP proxy
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("host", 123));
        // Add the proxy to the configuration
        clientConfiguration.setProxy(proxy);

        C2cRestApi api = new C2cRestApi(clientConfiguration);
    }
```