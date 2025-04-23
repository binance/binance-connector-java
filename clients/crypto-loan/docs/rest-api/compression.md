# Compression Configuration

```java
    import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
    import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = CryptoLoanRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        clientConfiguration.setCompression(false); //disable compression
        CryptoLoanRestApi api = new CryptoLoanRestApi(clientConfiguration);
    }
```