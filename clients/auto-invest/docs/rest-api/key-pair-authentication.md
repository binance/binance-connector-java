# Key Pair Based Authentication

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
        signatureConfiguration.setPrivateKey("path/to/private.key"); // Provide the private key directly as a string or specify the path to a private key file (e.g., '/path/to/private_key.pem')
        signatureConfiguration.setPrivateKeyPass("your_passphrase"); // Optional: Required if the private key is encrypted
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        AutoInvestRestApi api = new AutoInvestRestApi(clientConfiguration);
    }
```