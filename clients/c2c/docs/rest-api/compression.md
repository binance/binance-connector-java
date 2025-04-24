# Compression Configuration

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
        clientConfiguration.setCompression(false); //disable compression
        C2cRestApi api = new C2cRestApi(clientConfiguration);
    }
```