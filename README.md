# Binance Java Connectors

[![Build Status](https://img.shields.io/github/actions/workflow/status/binance/binance-connector-java/java.yml)](https://github.com/binance/binance-connector-java/actions)
[![Open Issues](https://img.shields.io/github/issues/binance/binance-connector-java)](https://github.com/binance/binance-connector-java/issues)
[![Code Style: Spotless](https://img.shields.io/badge/code%20style-spotless-ff69b4)](https://github.com/diffplug/spotless)
![Java Version](https://img.shields.io/badge/Java-%3E=11-brightgreen)
[![Known Vulnerabilities](https://snyk.io/test/github/binance/binance-connector-java/badge.svg)](https://snyk.io/test/github/binance/binance-connector-java)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Collection of auto-generated java connectors for Binance APIs.

## Prerequisites

Before using the connectors, ensure you have:

- **Java** (version >= 11)

## Available Connectors
- [binance-algo](clients/algo) - Algo Trading connector
- **Deprecated**: ~~[binance-auto-invest](clients/auto-invest) - Auto Invest connector~~
- [binance-c2c](clients/c2c) - C2C connector
- [binance-convert](clients/convert) - Convert connector
- [binance-copy-trading](clients/copy-trading) - Copy Trading connector
- [binance-crypto-loan](clients/crypto-loan) - Crypto Loan connector
- [binance-derivatives-trading-coin-futures](clients/derivatives-trading-coin-futures) - Derivatives Trading (COIN-M Futures) connector
- [binance-derivatives-trading-options](clients/derivatives-trading-options) - Derivatives Trading (Options) connector
- [binance-derivatives-trading-portfolio-margin](clients/derivatives-trading-portfolio-margin) - Derivatives Trading (Portfolio Margin) connector
- [binance-derivatives-trading-portfolio-margin-pro](clients/derivatives-trading-portfolio-margin-pro) - Derivatives Trading (Portfolio Margin Pro) connector
- [binance-derivatives-trading-usds-futures](clients/derivatives-trading-usds-futures) - Derivatives Trading (USDS-M Futures) connector
- [binance-dual-investment](clients/dual-investment) - Dual Investment connector
- [binance-fiat](clients/fiat) - Fiat connector
- [binance-gift-card](clients/gift-card) - Gift Card connector
- [binance-margin-trading](clients/margin-trading) - Margin Trading connector
- [binance-mining](clients/mining) - Mining connector
- [binance-nft](clients/nft) - NFT connector
- [binance-pay](clients/pay) - Pay connector
- [binance-rebate](clients/rebate) - Rebate connector
- [binance-simple-earn](clients/simple-earn) - Simple Earn connector
- [binance-spot](clients/spot) - Spot Trading connector
- [binance-staking](clients/staking) - Staking connector
- [binance-sub-account](clients/sub-account) - Sub Account connector
- [binance-vip-loan](clients/vip-loan) - VIP Loan connector
- [binance-wallet](clients/wallet) - Wallet connector

## Documentation

For detailed information, refer to the [Binance API Documentation](https://developers.binance.com).

## Installation

Each connector is published as a separate maven dependency. For example:

```xml
<dependency>
  <groupId>io.github.binance</groupId>
  <artifactId>binance-spot</artifactId>
  <version>2.0.0</version>
</dependency>
```

## Contributing

Since this repository contains auto-generated code using OpenAPI Generator, we encourage you to:

1. Open a GitHub issue to discuss your ideas or report bugs
2. Allow maintainers to implement necessary changes through the code generation process

### Types of Signature Generator
When creating REST clients (such as SpotRestApi), you use one of the following types of Signature Generator to create signatures (for SIGNED endpoints) based on your security preference:

- `HMAC` - Use of API Key and Secret Key.
```java
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setSecretKey("secretKey");

    ClientConfiguration clientConfiguration = new ClientConfiguration();
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    SpotRestApi spotRestApi = new SpotRestApi(clientConfiguration);
```

- `RSA` or `ED25519` - use of API Key and RSA/Ed25519 algorithm keys.
```java
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setPrivateKey("path/to/private.key");
    // if the private key is protected by a password
    signatureConfiguration.setPrivateKeyPass("privateKeyPass");
    
    ClientConfiguration clientConfiguration = new ClientConfiguration();
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    SpotRestApi spotRestApi = new SpotRestApi(clientConfiguration);
```

When creating WebSocket API clients (such as SpotWebSocketApi), you can follow:

- `HMAC`
```java
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setSecretKey("secretKey");

    WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    SpotWebSocketApi spotRestApi = new SpotWebSocketApi(clientConfiguration);
```

- `Ed25519` or `RSA`
```java
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setPrivateKey("path/to/private.key");
    // if the private key is protected by a password
    signatureConfiguration.setPrivateKeyPass("privateKeyPass");
    
    WebSocketClientConfiguration clientConfiguration = new WebSocketClientConfiguration();
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    SpotWebSocketApi spotRestApi = new SpotWebSocketApi(clientConfiguration);
```

## How to use WebSocket connection pool
### Websocket API
```java
    // Basic client config
    WebSocketClientConfiguration clientConfiguration = SpotWebSocketApiUtil.getClientConfiguration();
    // set usePool flag to true
    clientConfiguration.setUsePool(true);
    // Use the api
    SpotWebSocketApi spotWebSocketApi = new SpotWebSocketApi(connectionWrapper);
```

### Websocket Streams
```java
    // Basic client config
    WebSocketClientConfiguration clientConfiguration = SpotWebSocketStreamsUtil.getClientConfiguration();
    // set usePool flag to true
    clientConfiguration.setUsePool(true);
    // Use the api
    SpotWebSocketStreams api = new SpotWebSocketStreams(clientConfiguration);
```

## How to use a proxy
### Rest Api
```java
    // Basic client config
    ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
    // Create the HTTP proxy
    Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("host", 123));
    // Add the proxy to the configuration
    clientConfiguration.setProxy(proxy);
    // Create the Proxy Authenticator
    Authenticator proxyAuthenticator = new Authenticator() {
        @Override public Request authenticate(Route route, Response response) throws IOException {
            String credential = Credentials.basic("username", "password");
            return response.request().newBuilder()
                    .header("Proxy-Authorization", credential)
                    .build();
        }
    };
    // Add the proxy authenticator to the configuration
    clientConfiguration.setProxyAuthenticator(proxyAuthenticator);
    // Use with API
    SpotRestApi spotRestApi = new SpotRestApi(clientConfiguration);
```

### Websocket API
```java
    // Basic client config
    WebSocketClientConfiguration clientConfiguration = SpotWebSocketApiUtil.getClientConfiguration();
    // Create the HTTP proxy
    HttpProxy proxy = new HttpProxy("host", 123);
    // Add the proxy to the configuration
    clientConfiguration.setWebSocketProxy(proxy);
    // Create the Proxy Authentication
    BasicAuthentication basicAuthentication = new BasicAuthentication(
            URI.create("http://host:123"),
            Authentication.ANY_REALM,
            "username",
            "password"
    );
    // Add the Proxy Authentication to the configuration
    clientConfiguration.setWebSocketProxyAuthentication(basicAuthentication);
    // Use with API
    SpotWebSocketApi spotWebSocketApi = new SpotWebSocketApi(clientConfiguration);
```

### Websocket Streams
```java
    // Basic client config
    WebSocketClientConfiguration clientConfiguration = SpotWebSocketStreamsUtil.getClientConfiguration();
    // Create the HTTP proxy
    HttpProxy proxy = new HttpProxy("host", 123);
    // Add the proxy to the configuration
    clientConfiguration.setWebSocketProxy(proxy);
    // Create the Proxy Authentication
    BasicAuthentication basicAuthentication = new BasicAuthentication(
            URI.create("http://host:123"),
            Authentication.ANY_REALM,
            "username",
            "password"
    );
    // Add the Proxy Authentication to the configuration
    clientConfiguration.setWebSocketProxyAuthentication(basicAuthentication);
    // Use with API
    SpotWebSocketStreams spotWebSocketApi = new SpotWebSocketStreams(clientConfiguration);
```


## Examples
**Algo**: [Rest API](clients/algo/example_rest.md)

**C2c**: [Rest API](clients/c2c/example_rest.md)

**Convert**: [Rest API](clients/convert/example_rest.md)

**Copy Trading**: [Rest API](clients/copy-trading/example_rest.md)

**Crypto Loan**: [Rest API](clients/crypto-loan/example_rest.md)

**Derivatives Trading Coin Futures**: [Rest API](clients/derivatives-trading-coin-futures/example_rest.md) - [WebSocket API](clients/derivatives-trading-coin-futures/example_websocket_api.md) - [WebSocket Streams](clients/derivatives-trading-coin-futures/example_websocket_stream.md)

**Derivatives Trading Options**: [Rest API](clients/derivatives-trading-options/example_rest.md) - [WebSocket Streams](clients/derivatives-trading-options/example_websocket_stream.md)

**Derivatives Trading Portfolio Margin**: [Rest API](clients/derivatives-trading-portfolio-margin/example_rest.md)

**Derivatives Trading Portfolio Margin Pro**: [Rest API](clients/derivatives-trading-portfolio-margin-pro/example_rest.md)

**Derivatives Trading Usds Futures**: [Rest API](clients/derivatives-trading-usds-futures/example_rest.md) - [WebSocket API](clients/derivatives-trading-usds-futures/example_websocket_api.md) - [WebSocket Streams](clients/derivatives-trading-usds-futures/example_websocket_stream.md)

**Dual Investment**: [Rest API](clients/dual-investment/example_rest.md)

**Fiat**: [Rest API](clients/fiat/example_rest.md)

**Gift Card**: [Rest API](clients/gift-card/example_rest.md)

**Margin Trading**: [Rest API](clients/margin-trading/example_rest.md)

**Mining**: [Rest API](clients/mining/example_rest.md)

**Nft**: [Rest API](clients/nft/example_rest.md)

**Pay**: [Rest API](clients/pay/example_rest.md)

**Rebate**: [Rest API](clients/rebate/example_rest.md)

**Simple Earn**: [Rest API](clients/simple-earn/example_rest.md)

**Spot**: [Rest API](clients/spot/example_rest.md) - [WebSocket API](clients/spot/example_websocket_api.md) - [WebSocket Streams](clients/spot/example_websocket_stream.md)

**Staking**: [Rest API](clients/staking/example_rest.md)

**Sub Account**: [Rest API](clients/sub-account/example_rest.md)

**Vip Loan**: [Rest API](clients/vip-loan/example_rest.md)

**Wallet**: [Rest API](clients/wallet/example_rest.md)

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.
