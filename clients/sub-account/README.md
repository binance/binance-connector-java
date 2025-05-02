# Binance Java Sub Account Connector

[![Open Issues](https://img.shields.io/github/issues/binance/binance-connector-java)](https://github.com/binance/binance-connector-java/issues)
[![Code Style: Spotless](https://img.shields.io/badge/code%20style-spotless-ff69b4)](https://github.com/diffplug/spotless)
[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.binance/binance-sub-account)](https://central.sonatype.com/artifact/io.github.binance/binance-sub-account)
![Java Version](https://img.shields.io/badge/Java-%3E=11-brightgreen)
[![Known Vulnerabilities](https://snyk.io/test/github/binance/binance-connector-java/badge.svg)](https://snyk.io/test/github/binance/binance-connector-java)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is a client library for the Binance Sub Account API, enabling developers to interact programmatically with Binance's Sub Account trading platform. The library provides tools to trade through multiple accounts through the REST API:

- [REST API](./src/main/java/com/binance/connector/client/sub_account/rest/api)

## Table of Contents

- [Supported Features](#supported-features)
- [Installation](#installation)
- [Documentation](#documentation)
- [REST APIs](#rest-apis)
- [Testing](#testing)
- [Migration Guide](#migration-guide)
- [Contributing](#contributing)
- [License](#license)

## Supported Features

- REST API Endpoints:
  - `/sapi/v1/sub-account/*`
  - `/sapi/v2/sub-account/*`
  - `/sapi/v3/sub-account/*`
  - `/sapi/v4/sub-account/*`
  - `/sapi/v1/managed-subaccount/*`
  - `/sapi/v1/capital/*`
- Inclusion of test cases and examples for quick onboarding.

## Installation

To use this library, ensure your environment is running Java version **11** or newer.

Then add dependency to pom.xml:

```xml
<dependency>
  <groupId>io.github.binance</groupId>
  <artifactId>binance-sub-account</artifactId>
  <version>1.1.0</version>
</dependency>
```

## Documentation

For detailed information, refer to the [Binance API Documentation](https://developers.binance.com/docs/sub_account).

### REST APIs

All REST API endpoints are available through the [`rest`](./src/main/java/com/binance/connector/client/sub_account/rest) module. Note that some endpoints require authentication using your Binance API credentials.

```java
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

public static void main(String[] args) {
    ClientConfiguration clientConfiguration = SubAccountRestApiUtil.getClientConfiguration();
    SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
    signatureConfiguration.setApiKey("apiKey");
    signatureConfiguration.setPrivateKey("path/to/private.key");
    clientConfiguration.setSignatureConfiguration(signatureConfiguration);
    SubAccountRestApi api = new SubAccountRestApi(clientConfiguration);
}
```

More examples can be found in the [`examples/rest`](./../../examples/sub-account/src/main/java/com/binance/connector/client/sub_account/rest) folder.

#### Configuration Options

The REST API supports the following advanced configuration options:

- `proxy`: Proxy configuration for http client.
- `certificatePinner`: Certificate Pinner configuration for http client.
- `connectTimeout`: Timeout for requests in milliseconds (default: 1000 ms).
- `readTimeout`: Timeout for requests in milliseconds (default: 5000 ms).
- `compression`: Enable response compression (default: true).
- `retries`: Number of retry attempts for failed requests (default: 3).
- `backoff`: Delay in milliseconds between retries (default: 200 ms).
- `timeUnit`: TimeUnit to be returned by API (default MILLISECOND).
- `apiKey`: Binance API Key
- `secretKey`: Binance Secret Key, if using HMAC algorithm 
- `privateKey`: RSA or ED25519 private key for authentication.
- `privateKeyPass`: Passphrase for the private key, if encrypted.

##### Timeout

You can configure a timeout for requests in milliseconds. If the request exceeds the specified timeout, it will be aborted. See the [Timeout example](./docs/rest-api/timeout.md) for detailed usage.

##### Proxy

The REST API supports HTTP/HTTPS proxy configurations. See the [Proxy example](./docs/rest-api/proxy.md) for detailed usage.

##### Keep-Alive

Enable HTTP keep-alive for persistent connections. See the [Keep-Alive example](./docs/rest-api/keepAlive.md) for detailed usage.

##### Compression

Enable or disable response compression. See the [Compression example](./docs/rest-api/compression.md) for detailed usage.

##### Retries

Configure the number of retry attempts and delay in milliseconds between retries for failed requests. See the [Retries example](./docs/rest-api/retries.md) for detailed usage.

##### Key Pair Based Authentication

The REST API supports key pair-based authentication for secure communication. You can use `RSA` or `ED25519` keys for signing requests. See the [Key Pair Based Authentication example](./docs/rest-api/key-pair-authentication.md) for detailed usage.

##### Certificate Pinning

To enhance security, you can use certificate pinning with the `httpsAgent` option in the configuration. This ensures the client only communicates with servers using specific certificates. See the [Certificate Pinning example](./docs/rest-api/certificate-pinning.md) for detailed usage.

#### Error Handling

The REST API provides detailed error types to help you handle issues effectively:

- `ConnectorClientError`: General client error.

See the [Error Handling example](./docs/rest-api/error-handling.md) for detailed usage.

If `basePath` is not provided, it defaults to `https://api.binance.com`.

## Testing

To run the tests:

```bash
mvn -f clients/pom.xml -pl sub-account test
```

The tests cover:

- REST API endpoints
- Signature generation

## Migration Guide

If you are upgrading to the new modularized structure, refer to the [Migration Guide](./docs/rest-api/migration-guide.md) for detailed steps.

## Contributing

Contributions are welcome!

Since this repository contains auto-generated code, we encourage you to start by opening a GitHub issue to discuss your ideas or suggest improvements. This helps ensure that changes align with the project's goals and auto-generation processes.

To contribute:

1. Open a GitHub issue describing your suggestion or the bug you've identified.
2. If it's determined that changes are necessary, the maintainers will merge the changes into the main branch.

Please ensure that all tests pass if you're making a direct contribution. Submit a pull request only after discussing and confirming the change.

Thank you for your contributions!

## License

This project is licensed under the MIT License. See the [LICENSE](../../LICENSE) file for details.