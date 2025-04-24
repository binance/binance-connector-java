# Compression Configuration

```java
    import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
    import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = SimpleEarnRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        clientConfiguration.setCompression(false); //disable compression
        SimpleEarnRestApi api = new SimpleEarnRestApi(clientConfiguration);
    }
```