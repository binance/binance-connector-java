# Retries Configuration

```java
    import com.binance.connector.client.copy_trading.rest.CopyTradingRestApiUtil;
    import com.binance.connector.client.copy_trading.rest.api.CopyTradingRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = CopyTradingRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        
        // Connect timeout of 500ms
        clientConfiguration.setConnectTimeout(500);
        // Read timeout of 1s
        clientConfiguration.setReadTimeout(1000);

        CopyTradingRestApi api = new CopyTradingRestApi(clientConfiguration);
    }
```