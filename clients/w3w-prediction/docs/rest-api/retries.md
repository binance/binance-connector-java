# Retries Configuration

```java
    import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
    import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = W3WPredictionRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        
        // Retry up to 5 times
        clientConfiguration.setRetries(5);
        // 500ms between retries
        clientConfiguration.setBackOff(500);

        W3WPredictionRestApi api = new W3WPredictionRestApi(clientConfiguration);
    }
```