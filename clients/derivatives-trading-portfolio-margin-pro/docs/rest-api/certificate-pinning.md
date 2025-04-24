# Certificate Pinning
```java
    import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
    import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
    import com.binance.connector.client.common.ApiException;
    import com.binance.connector.client.common.ApiResponse;
    import com.binance.connector.client.common.configuration.ClientConfiguration;
    import com.binance.connector.client.common.configuration.SignatureConfiguration;

    // Expected pinned public key (SPKI SHA-256 hash)
    // You can extract it from the certificate using openssl:
    // openssl s_client -connect your-api.com:443 </dev/null 2>/dev/null | openssl x509 -pubkey -noout | openssl pkey -pubin -outform der | openssl dgst -sha256 -binary | base64
    public static final String PINNED_PUBLIC_KEY = "YOUR-PINNED-PUBLIC-KEY";
    
    
    public static void main(String[] args) {
        ClientConfiguration clientConfiguration = DerivativesTradingPortfolioMarginProRestApiUtil.getClientConfiguration();
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setPrivateKey("path/to/private.key");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);
        
        CertificatePinner certificatePinner = new CertificatePinner.Builder()
                .add("your-api.com", PINNED_PUBLIC_KEY)
                .build();
        
        clientConfiguration.setCertificatePinner(certificatePinner);

        DerivativesTradingPortfolioMarginProRestApi api = new DerivativesTradingPortfolioMarginProRestApi(clientConfiguration);
    }
```