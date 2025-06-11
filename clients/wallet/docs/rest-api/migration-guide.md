# Migration Guide: Binance Wallet Connector Modularization

With the transition to a modularized structure, the Binance Connector has been split into separate NPM libraries, each focusing on a distinct product (e.g., Auto Invest, Futures, etc.). 

---

## Key Changes

1. **Package Name**:  
   The modularised Wallet Connector has been moved to a new package:

   **Old:**
```xml
<dependency>
  <groupId>io.github.binance</groupId>
  <artifactId>binance-connector-java</artifactId>
  <version>3.0.5</version>
</dependency>
```
   **New:**
```xml
<dependency>
  <groupId>io.github.binance</groupId>
  <artifactId>binance-wallet</artifactId>
  <version>2.0.0</version>
</dependency>
```

2**Imports**:  
   Update your import paths.

   **Old:**

```java
import com.binance.connector.client.SpotClient;
```

   **New:**

```java
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
```

4. **Configuration and Client Initialization**:  
   The new structure keeps the existing configuration options but modularized clients into `WalletRestApi`.

   **Old:**

```java
SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
String result = client.<givenMethod>(parameters);
System.out.println(result);
```


   **New:**

```java
 ClientConfiguration clientConfiguration = AlgoRestApiUtil.getClientConfiguration();
 SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
 signatureConfiguration.setApiKey("apiKey");
 signatureConfiguration.setPrivateKey("path/to/private.key");
 clientConfiguration.setSignatureConfiguration(signatureConfiguration);
 
 WalletRestApi api = new WalletRestApi(clientConfiguration);
```

5. **Examples and Documentation**:  
   Updated examples can be found in the new repository folders:
    - REST API: `examples/wallet/`

---

## Migration Steps

### 1. Replace the maven dependency

Replace the maven dependency:

```xml
 <dependency>
     <groupId>io.github.binance</groupId>
     <artifactId>binance-connector-java</artifactId>
     <version>3.0.5</version>
 </dependency>
```

by:

```xml
 <dependency>
     <groupId>io.github.binance</groupId>
     <artifactId>binance-wallet</artifactId>
     <version>2.0.0</version>
 </dependency>
```

### 3. Update Import Paths

Replace all occurrences of:

```java
import com.binance.connector.client.SpotClient;
```

With:

```java
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
```

### 4. Update Client Initialization

Adjust your code to use the modularized structure. For example:

**Old:**

```java
SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
```

**New:**

```java
 ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
 SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
 signatureConfiguration.setApiKey("apiKey");
 signatureConfiguration.setPrivateKey("path/to/private.key");
 clientConfiguration.setSignatureConfiguration(signatureConfiguration);
 clientConfiguration.setCompression(false); //disable compression
 WalletRestApi api = new WalletRestApi(clientConfiguration);
```

### 5. Test and Verify

Run your application to ensure everything works as expected. Refer to the new documentation for any advanced features or configuration options.

---

## Additional Notes

- **Future Modular Packages**: Similar packages for other products (e.g., Wallet, Staking) will follow this pattern.

For more details, refer to the updated [README](../../README.md) and [Examples](../../../../examples/).