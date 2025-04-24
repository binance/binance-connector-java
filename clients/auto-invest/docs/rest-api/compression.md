# Compression Configuration

```java
    import com.binance.connector.client.auto_invest.rest.AutoInvestRestApiUtil;
    import com.binance.connector.client.auto_invest.rest.api.AutoInvestRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = AutoInvestRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        clientConfiguration.setCompression(false); //disable compression
        AutoInvestRestApi api = new AutoInvestRestApi(clientConfiguration);
    }
```