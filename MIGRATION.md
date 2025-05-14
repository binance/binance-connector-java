# **Migration Guide: Transition from Monolithic Binance Connector**

With the move towards modularization, Binance connectors are now split into smaller, product-specific libraries. This guide explains how to migrate from the monolithic `binance-connector-java` for Spot and `binance-futures-connector-java` for Futures to the new modular connectors.

## **Overview of Changes**

| Feature | Monolithic Connector | Modular Connector                                                 |
|---------|----------------------|-------------------------------------------------------------------|
| Package Name | `binance-connector-java`, `binance-futures-connector-java` | `binance-<product>`                                |
| API Coverage | All Binance APIs | Individual APIs (Spot, Futures, Wallet, Algo Trading, Mining etc.) |
| Imports | Single package import | Separate package per product                                      |
| Code Structure | One large client | Smaller, focused clients                                          |

## **Migration Steps**

### **Step 1: Replace maven dependencies**

If you were using the old connector, remove it from your project:
```xml
    <dependency>
        <groupId>io.github.binance</groupId>
        <artifactId>binance-connector-java</artifactId>
        <version>3.0.5</version>
    </dependency>
```
or
```xml
    <dependency>
        <groupId>io.github.binance</groupId>
        <artifactId>binance-futures-connector-java</artifactId>
        <version>3.0.5</version>
    </dependency>
```
And replace it with the new connector(s):
For Spot (Spot package):
```xml
    <dependency>
        <groupId>io.github.binance</groupId>
        <artifactId>binance-spot</artifactId>
        <version>2.0.0</version>
    </dependency>
```

For Futures (COIN-M Futures package):

```xml
    <dependency>
        <groupId>io.github.binance</groupId>
        <artifactId>binance-derivatives-trading-coin-futures</artifactId>
        <version>1.2.0</version>
    </dependency>
```

### **Step 3: Update Imports**

Update your import paths:

**Old (Spot):**

```java
import com.binance.connector.client.SpotClient;
```

**New (Spot):**

```java
import com.binance.connector.client.spot.rest.api.SpotRestApi;
```

**Old (CMFutures):**

```java
import com.binance.connector.futures.client.impl.CMFuturesClientImpl;
```

**New (COIN-M Futures):**

```java
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
```

### **Step 4: Update Client Initialization**

The new structure introduces a more modular approach to client initialization.

**Old (Spot - Monolithic Connector):**

```java
    SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
    Map<String, Object> parameters = new LinkedHashMap<>();
    String result = client.createTrade().account(parameters);
    System.out.println(result);
```

**New (Spot - Modular Connector):**

```java
    ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setPrivateKey("path/to/private.key");
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);

    SpotRestApi api = new SpotRestApi(clientConfiguration);
    
    Boolean omitZeroBalances = true;
    Long recvWindow = 5000L;
    ApiResponse<GetAccountResponse> response = api.getAccount(omitZeroBalances, recvWindow);
    System.out.println(response.getData());
```

**Old (Futures - Monolithic Connector):**

```java
    CMFuturesClientImpl client = new CMFuturesClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
    LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
    String result = client.account().accountInformation(parameters);
    System.out.println(result);
```

**New (Futures - Modular Connector):**

```java
    ClientConfiguration clientConfiguration = DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setPrivateKey("path/to/private.key");
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    DerivativesTradingCoinFuturesRestApi api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);

    Long recvWindow = 5000L;
    ApiResponse<AccountInformationResponse> response = getApi().accountInformation(recvWindow);
    System.out.println(response.getData());
```

### **Step 5: Check for API Differences**

Some function names or response structures may have changed. Refer to the modular connector's documentation for details.

## **Backward Compatibility**

- If a modular connector is **not yet available** for your use case, continue using the monolithic connector (`binance-futures-connector-java`, or `binance-connector-java`).
- The monolithic connector will remain available, but it is **recommended** to migrate when modular versions are released.

---

## **FAQs**

### **What if my product does not have a modular connector yet?**

You can continue using the monolithic connector until the modular version is released.

### **Will the monolithic connector still receive updates?**

Critical bug fixes will be provided, but feature updates will focus on the modular connectors.

### **Where can I find more examples?**

Check the modular connector's documentation for detailed examples.