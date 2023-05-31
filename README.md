# Binance Public API connector Java
[![maven](https://img.shields.io/maven-central/v/io.github.binance/binance-connector-java)](https://repo1.maven.org/maven2/io/github/binance/binance-connector-java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Code Style](https://img.shields.io/badge/code%20style-checkstyle-yellow)](https://checkstyle.org/checks.html)

This is a lightweight library that works as a connector to the [Binance public API](https://github.com/binance/binance-spot-api-docs)

- Supported APIs:
  - `/api/*`
  - `/sapi/*`
  - Spot WebSocket Market Stream
  - Spot User Data Stream
  - Spot WebSocket API

- Test cases and examples

## Installation
Replace `LATEST_VERSION` with the latest version number and paste the snippet below in `pom.xml`
```
<dependency>
    <groupId>io.github.binance</groupId>
    <artifactId>binance-connector-java</artifactId>
    <version>LATEST_VERSION</version>
</dependency>
```
Run `mvn install` where `pom.xml` is located to install the dependency.

## Documentation
[https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html](https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html)

### Run Example
The examples are located under **src/test/java/examples**.

Before running any of it, `PrivateConfig.java` must be set up correctly with `API_KEY` and` SECRET_KEY` or `PRIVATE_KEY_PATH` (if using RSA Keys).

Note that this `PrivateConfig.java` is only used for examples,
you should have your own configuration file when using the library.

### RESTful APIs

The endpoints are categorized according to the [Binance](https://binance-docs.github.io/apidocs/spot/en/#change-log) API document.
Each object corresponds to its category which will be used 
to call its respective endpoints.


| Category        |     Object       |         
| --------------- | ---------------- |
| Binance Code    | createGiftCard   | 
| BLVT            | createBlvt       | 
| BSwap           | createBswap      | 
| C2C             | createC2C        | 
| Convert         | createConvert    | 
| CryptoLoans     | createCrytoLoans | 
| Fiat            | createFiat       | 
| Futures         | createFutures    |
| Margin          | createMargin     | 
| Market          | createMarket     | 
| Mining          | createMining     | 
| NFT             | createNFT        | 
| Pay             | createPay        | 
| Portfolio Margin| createPortfolioMargin | 
| Rebate          | createRebate     |
| Savings         | createSavings    | 
| Staking         | createStaking    | 
| Sub Account     | createsubAccount | 
| Trade           | createTrade      | 
| UserData        | createUserData   | 
| Wallet          | createWallet     |

<br>

#### Market Endpoint: Exchange Information
```java
SpotClient client = new SpotClientImpl();
String result = client.createMarket().exchangeInfo();
```

#### Trade Endpoint: Testing a new order
```java
Map<String,Object> parameters = new LinkedHashMap<String,Object>();

SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

parameters.put("symbol","BTCUSDT");
parameters.put("side", "SELL");
parameters.put("type", "LIMIT");
parameters.put("timeInForce", "GTC");
parameters.put("quantity", 0.01);
parameters.put("price", 9500);

String result = client.createTrade().testNewOrder(parameters);
```

### WebSocket Stream

```java
WebSocketStreamClient wsStreamClient = new WebSocketStreamClientImpl(); // defaults to live exchange unless stated.

// Single stream
int streamID1 = wsStreamClient.aggTradeStream("btcusdt",((event) -> {
    System.out.println(event);
}));

// Combined streams
ArrayList<String> streams = new ArrayList<>();
streams.add("btcusdt@trade");
streams.add("bnbusdt@trade");

int streamID2 = wsStreamClient.combineStreams(streams, ((event) -> {
    System.out.println(event);
}));

// Close single stream
wsStreamClient.closeConnection(streamID1); //closes aggTradeStream-btcusdt
        
// Close all streams
wsStreamClient.closeAllConnections();
```

Different types of WebSocket callbacks are available. Please refer to the `src/test/java/examples/websocketstream/TradeStreamWithAllCallbacks.java` example file to explore their usage.

More examples are available at `src/test/java/examples/websocketstream` folder.

### WebSocket API

```java
RsaSignatureGenerator signatureGenerator =  new RsaSignatureGenerator("PRIVATE_KEY_PATH");
WebSocketApiClient wsApiClient = new WebSocketApiClientImpl("API_KEY", signatureGenerator); // defaults to live exchange unless stated.

// Open connection with a callback as parameter
wsApiClient.connect(((message) -> {
    System.out.println(message);
}));

JSONObject optionalParams = new JSONObject();
optionalParams.put("requestId", "request123");
optionalParams.put("quantity", 1);

wsApiClient.trade().testNewOrder("BTCUSDT", "BUY", "MARKET", optionalParams);

Thread.sleep(3000);

// Close connection
wsApiClient.close();
```

If `requestId` is empty (`""`), `null` or not sent, this library will generate a `UUID` string for it. 

Different types of WebSocket callbacks are available. Please refer to the `src/test/java/examples/websocketapi/WsApiwithAllCallbacks.java` example file to explore their usage.

More examples are available at `src/test/java/examples/websocketapi` folder.

### Testnet

While `/sapi/*` endpoints don't have testnet environment yet, `/api/*` endpoints can be tested in
[Spot Testnet](https://testnet.binance.vision/). You can use it by changing the base URL:

```java
Map<String,Object> parameters = new LinkedHashMap<>();

SpotClient client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, PrivateConfig.TESTNET_SECRET_KEY, PrivateConfig.TESTNET_URL);
String result = client.createMarket().time();
```

### Base URL

If `baseUrl` is not provided, it defaults to `api.binance.com`.<br/>
It's recommended to pass in the `baseUrl` parameter, even in production as Binance provides alternative URLs:
- `https://api1.binance.com`
- `https://api2.binance.com`
- `https://api3.binance.com`
- `https://api4.binance.com`

### Optional parameters

All parameters are read from a `Map<String, Object>` implemented data structure where `String` is the name of the parameter and `Object` is the value of the parameter. The parameters should follow their exact naming as in the API documentation.<br>
```java
Map<String,Object> parameters = new LinkedHashMap<String,Object>();

parameters.put("symbol","BTCUSDT");
parameters.put("side", "SELL");
parameters.put("type", "LIMIT");
parameters.put("timeInForce", "GTC");
parameters.put("quantity", 0.01);
parameters.put("price", 9500);
```

### Response MetaData

The Binance API server provides weight usages in the headers of each response. This value can be return by 
calling `setShowLimitUsage` and setting it to `true`.
```java
SpotClient client = new SpotClientImpl();
client.setShowLimitUsage(true);
String result = client.createMarket().time();
logger.info(result);
```
output:
```
INFO: {"data":"{"serverTime":1633434339494}","x-mbx-used-weight":"1","x-mbx-used-weight-1m":"1"}
```

### Proxy
HTTP Proxy is supported.

To set it up, call `setProxy()` with `ProxyAuth` and before submitting requests to binance:

```java
SpotClient client = new SpotClientImpl();
Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
ProxyAuth proxy = new ProxyAuth(proxyConn, null);

client.setProxy(proxy);
logger.info(client.createMarket().time());
```

For authenticated `Proxy`, define `ProxyAuth` with [`Authenticator` from `okhttp3`](https://square.github.io/okhttp/3.x/okhttp/index.html?okhttp3/Authenticator.html):

```java
SpotClient client = new SpotClientImpl();
Proxy proxyConn = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
Authenticator auth = new Authenticator() {
    public Request authenticate(Route route, Response response) throws IOException {
        if (response.request().header("Proxy-Authorization") != null) {
            return null; // Give up, we've already failed to authenticate.
          }
      
        String credential = Credentials.basic("username", "password");
        return response.request().newBuilder().header("Proxy-Authorization", credential).build();
        
    }
};
ProxyAuth proxy = new ProxyAuth(proxyConn, auth);

client.setProxy(proxy);
logger.info(client.createMarket().time());
```

To undo `Proxy`, use `unsetProxy()` before submitting requests to binance:

```java
client.unsetProxy();
logger.info(client.createMarket().time());
```

Complete examples are available at `src/test/java/examples/spot/proxy` folder.

### Logging
This connector uses [`SLF4J`](https://www.slf4j.org/) as an abstraction layer for diverse logging frameworks.

It's end-user's responsibility to select the appropriate `SLF4J` binding to use as the logger (e.g, `slf4j-jdk14` or `logback-classic`).
Otherwise, you might see the following informative output:

```shell
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

In case you want to use our custom `logback-classic`, it's available at [`binance-logback`](https://central.sonatype.com/artifact/io.github.binance/binance-logback).

If you prefer to not use a logger and suppress the `SLF4J` messages instead, you can refer to `slf4j-nop`.

### Types of Signature Generator
When creating `SpotClient`, `WebSocketStreamClient` or `WebSocketApiClient`, you use one of the following types of Signature Generator to create signatures (for SIGNED endpoints) based on your security preference:

- `HmacSignatureGenerator` - Use of API Key and Secret Key.
```java
  HmacSignatureGenerator signGenerator = new HmacSignatureGenerator("SecretKey");
  SpotClient client = new SpotClientImpl("ApiKey", signGenerator);
```

- `RsaSignatureGenerator` - Use of API Key and RSA algorithm keys.
```java
  RsaSignatureGenerator signGenerator =  new RsaSignatureGenerator("PathToPrivateKey"); 
  // or if Private Key is protected
  // RsaSignatureGenerator signGenerator = new RsaSignatureGenerator("PathToPrivateKey", "PrivateKeyPassword")
  SpotClient client = new SpotClientImpl("ApiKey", signGenerator);
```

- `Ed25519SignatureGenerator` - Use of API Key and Ed25519 algorithm keys.
```java
  Ed25519SignatureGenerator signGenerator =  new Ed25519SignatureGenerator("PathToPrivateKey");
  SpotClient client = new SpotClientImpl("ApiKey", signGenerator);
```

### Error

There are 3 types of error which may be thrown by this library.

- `BinanceConnectorException`
  - This is thrown when there is a validation error for parameters.For instance, mandatory parameter not sent. This error will be thrown before the request is sent to the server.
- `BinanceClientException`
  - This is thrown when server returns `4XX`, it's an issue from client side.
  - The error consists of these 3 objects which will help in debugging the error:
    - `httpStatusCode` - HTTP status code
    - `errorCode` - API Server's error code, e.g. `-1102`
    - `errMsg` - API Server's error message, e.g. `Unknown order sent.`
- `BinanceServerException`
  - This is thrown when server returns `5XX`, it's an issue from server side.
```java
try {
      String result = client.createTrade().newOrder(parameters);
      logger.info(result);
    } catch (BinanceConnectorException e) {
      logger.error("fullErrMessage: {}", e.getMessage(), e);
    } catch (BinanceClientException e) {
      logger.error("fullErrMessage: {} \nerrMessage: {} \nerrCode: {} \nHTTPStatusCode: {}",
      e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode(), e);
    }
```

### Test
`mvn clean test`

## Contributing

Contributions are welcome.<br/>
If you've found a bug within this project, please open an issue to discuss what you would like to change.<br/>
If it's an issue with the API, please open a topic at [Binance Developer Community](https://dev.binance.vision)
