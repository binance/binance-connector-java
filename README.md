# Binance Public API connector Java
[![maven](https://img.shields.io/maven-central/v/io.github.binance/binance-connector-java)](https://repo1.maven.org/maven2/io/github/binance/binance-connector-java/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is a lightweight library that works as a connector to the [Binance public API](https://github.com/binance/binance-spot-api-docs)

- Supported APIs:
  - `/api/*`
  - `/sapi/*`
  - Spot Websocket Market Stream
  - Spot User Data Stream
- Test cases and examples

## Installation
Replace `LASTEST_VERSION` with the latest version number and paste the snippet below in `pom.xml`
```
<dependency>
    <groupId>io.github.binance</groupId>
    <artifactId>binance-connector-java</artifactId>
    <version>LASTEST_VERSION</version>
</dependency>
```
Run `mvn install` where `pom.xml` is located to install the dependency.

## Documentation
[https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html](https://www.javadoc.io/doc/io.github.binance/binance-connector-java/latest/index.html)

### Run Example
The examples are located under **src/test/java/examples**. Before running the examples,
set up your **API_KEY** and **SECRET_KEY** in `PrivateConfig.java`. This configuration file is only used for examples,
you should reconfigure the API_KEY and SECRET_KEY when using the library.

### RESTful APIs

The endpoints are categorized according to the [Binance](https://binance-docs.github.io/apidocs/spot/en/#change-log) API document.
Each object corresponds to its category which will be used 
to call its respective endpoints.


| Category        |     Object       |         
| --------------- | ---------------- |
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
| Rebate          | createRebate     |
| Savings         | createSavings    | 
| Sub Account     | createsubAccount | 
| Trade           | createTrade      | 
| UserData        | createUserData   | 
| Wallet          | createWallet     |

<br>

#### Market Endpoint: Exchange Information
```java
SpotClientImpl client = new SpotClientImpl();
String result = client.createMarket().exchangeInfo();
```

#### Trade Endpoint: Testing a new order
```java
LinkedHashMap<String,Object> parameters = new LinkedHashMap<String,Object>();

SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

parameters.put("symbol","BTCUSDT");
parameters.put("side", "SELL");
parameters.put("type", "LIMIT");
parameters.put("timeInForce", "GTC");
parameters.put("quantity", 0.01);
parameters.put("price", 9500);

String result = client.createTrade().testNewOrder(parameters);
```

### Testnet

While `/sapi/*` endpoints don't have testnet environment yet, `/api/*` endpoints can be tested in
[Spot Testnet](https://testnet.binance.vision/). You can use it by changing the base URL:

```java
LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

SpotClientImpl client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, PrivateConfig.TESTNET_SECRET_KEY, PrivateConfig.TESTNET_URL);
String result = client.createMarket().time();
```

### Base URL

If `baseUrl` is not provided, it defaults to `api.binance.com`.<br/>
It's recommended to pass in the `baseUrl` parameter, even in production as Binance provides alternative URLs
in case of performance issues:
- `https://api1.binance.com`
- `https://api2.binance.com`
- `https://api3.binance.com`

### Optional parameters

All parameters are read from a `LinkedHashMap<String,Object>` object where `String` is the
name of the parameter and `Object` is the value of the parameter. The parameters should follow their exact naming as in the API documentation.<br>
```java
LinkedHashMap<String,Object> parameters = new LinkedHashMap<String,Object>();

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
SpotClientImpl client = new SpotClientImpl();
client.setShowLimitUsage(true);
String result = client.createMarket().time();
logger.log(Level.INFO, result);
```
output:
```
INFO: {"data":"{"serverTime":1633434339494}","x-mbx-used-weight":"1","x-mbx-used-weight-1m":"1"}
```
### Logging

`ch.qos.logback` is used for logging in this connector. The configuration xml file can be found under
`src/main/resources`.

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
    String result = client.createTrade().account(parameters);
    logger.log(Level.INFO, result);
}
catch (BinanceConnectorException e) {
    logger.log(Level.SEVERE, String.format("fullErrMessage: %s", e.getMessage()));
}
catch (BinanceClientException e) {
    logger.log(Level.SEVERE, String.format("fullErrMessage: %s \nerrMessage: %s \nerrCode: %s \nHTTPStatusCode: %s",
            e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode()));
}
```

### Websocket

```java
WebsocketClientImpl client = new WebsocketClientImpl(); // defaults to production envrionment unless stated,
int streamID1 = client.aggTradeStream("btcusdt",((event) -> {
    System.out.println(event);
}));

//Combining Streams
ArrayList<String> streams = new ArrayList<>();
streams.add("btcusdt@trade");
streams.add("bnbusdt@trade");

int streamID2 = client.combineStreams(streams, ((event) -> {
    System.out.println(event);
}));

//Listening to User Data Stream
int streamID3 = client.listenUserStream(listenKey, ((event) -> {
  System.out.println(event);
}));

//Closing a single stream
client.closeConnection(streamID1); //closes aggTradeStream-btcusdt
        
//Closing all streams
client.closeAllConnections();
```
More websocket examples are available in the `test/examples` folder


### Test
`mvn clean test`

## Contributing

Contributions are welcome.<br/>
If you've found a bug within this project, please open an issue to discuss what you would like to change.<br/>
If it's an issue with the API, please open a topic at [Binance Developer Community](https://dev.binance.vision)
