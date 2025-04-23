# Compression Configuration

```java
    import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
    import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = DualInvestmentRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        clientConfiguration.setCompression(false); //disable compression
        DualInvestmentRestApi api = new DualInvestmentRestApi(clientConfiguration);
    }
```