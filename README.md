# Binance Public API connector Java
[![maven](https://img.shields.io/maven-central/v/io.github.binance/binance-connector-java)](https://repo1.maven.org/maven2/io/github/binance/binance-connector-java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Code Style](https://img.shields.io/badge/code%20style-checkstyle-yellow)](https://checkstyle.org/checks.html)

This is a lightweight library that works as a connector to the [Binance public API](https://github.com/binance/binance-spot-api-docs).

It supports the following APIs:
  - `/api/*` endpoints;
  - `/sapi/*` endpoints;
  - Spot WebSocket Market Stream;
  - Spot User Data Stream;
  - Spot WebSocket API;

Additionally, it includes test cases and examples.

## Documentation
[https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html](https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html)

## Getting Started
### Maven
Copy and paste the following dependency snippet into your `pom.xml` file, replacing `LATEST_VERSION` with the most [recent version](https://mvnrepository.com/artifact/io.github.binance/binance-connector-java) available:
```
<dependency>
    <groupId>io.github.binance</groupId>
    <artifactId>binance-connector-java</artifactId>
    <version>LATEST_VERSION</version>
</dependency>
```
Next, install the dependency by executing `mvn install` in the directory where your `pom.xml` is located.

### Gradle
Copy and paste the following dependency snippet into your `build.gradle` file, replacing `LATEST_VERSION` with the most [recent version](https://mvnrepository.com/artifact/io.github.binance/binance-connector-java) available:
```
implementation 'io.github.binance:binance-connector-java:LATEST_VERSION'
```

Make sure to add the Jitpack repository to the `repositories` section of your `build.gradle` file:
```
maven { url 'https://jitpack.io' }
```
Next, install the dependency by executing `gradle dependencies` in the directory where your `build.gradle` is located.

## Examples
The examples are located under **src/test/java/examples**. Before running any of it, `PrivateConfig.java` must be set up correctly with `API_KEY` and` SECRET_KEY` or `PRIVATE_KEY_PATH` (if using RSA Keys).

Note that this `PrivateConfig.java` is only used for examples, you should have your own configuration file when using the library.

### REST APIs

#### Market Endpoint: Exchange Information
```java
SpotClient client = new SpotClientImpl();
Map<String, Object> parameters = new LinkedHashMap<>();
String result = client.createMarket().exchangeInfo(parameters);
```

#### Trade Endpoint: Testing a new order
```java
SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

Map<String,Object> parameters = new LinkedHashMap<String,Object>();
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

### WebSocket API
```java
RsaSignatureGenerator signatureGenerator =  new RsaSignatureGenerator("PRIVATE_KEY_PATH");
WebSocketApiClient wsApiClient = new WebSocketApiClientImpl("API_KEY", signatureGenerator); // defaults to live exchange unless stated

// Open connection with a callback as parameter
wsApiClient.connect(((message) -> {
System.out.println(message);
}));

JSONObject optionalParams = new JSONObject();
optionalParams.put("requestId", "request123");
optionalParams.put("quantity", 1);

wsApiClient.trade().testNewOrder("BTCUSDT", "BUY", "MARKET", optionalParams);

Thread.sleep(60000);

// Close connection
wsApiClient.close();
```

If `requestId` is empty (`""`), `null` or not sent, this library will generate a `UUID` string for it. 

Different types of WebSocket callbacks are available. Please refer to the `src/test/java/examples/websocketapi/WsApiwithAllCallbacks.java` example file to explore their usage.

## Features
### Testnet
While `/sapi/*` endpoints do not yet have a testnet environment, `/api/*` endpoints can be tested on the [Spot Testnet](https://testnet.binance.vision/).
You can use it by changing the base URL:

```java
Map<String,Object> parameters = new LinkedHashMap<>();

SpotClient client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, PrivateConfig.TESTNET_SECRET_KEY, PrivateConfig.TESTNET_URL);
String result = client.createMarket().time();
```

### Base URL
If `baseUrl` is not provided, it defaults to `api.binance.com`.

It's recommended to pass in the `baseUrl` parameter, even in production as Binance provides alternative URLs:
- `https://api1.binance.com`
- `https://api2.binance.com`
- `https://api3.binance.com`
- `https://api4.binance.com`

### Optional parameters
Parameters can be set in any implementation of `Map<String, Object>` interface, where `String` represents the parameter name and `Object` the parameter value. These parameters should have the same naming as in the API doc."

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
The Binance API server provides weight usages in the headers of each response, which can be returned if you set `setShowLimitUsage(true)`.
```java
SpotClient client = new SpotClientImpl();
client.setShowLimitUsage(true);
String result = client.createMarket().time();
logger.info(result);
```
Output:
```
INFO: {"data":"{"serverTime":1633434339494}","x-mbx-used-weight":"1","x-mbx-used-weight-1m":"1"}
```

### Proxy
To set HTTP Proxy, call `setProxy()` with `ProxyAuth` and before submitting requests:

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

To undo `Proxy`, use `unsetProxy()` before submitting requests:
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

## Errors

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

## Test Cases
`mvn clean test`

## Contribution
Contributions are welcome!

If you've found a bug within this project, please open an issue to discuss what you would like to change.

If it's an issue with the API itself, you can submit on the [Binance Developer Community](https://dev.binance.vision)
