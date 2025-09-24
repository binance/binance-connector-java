# Changelog

## 3.0.0 - 2025-09-22

### Changed (1)

#### REST API

- Modified response for `exchangeInformation()` method (`GET /dapi/v1/exchangeInfo`):
    - `symbols`.`filters`.`multiplierDecimal`: type `integer` → `string`

## 2.0.1 - 2025-08-07
- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.0.0 - 2025-07-16

### Added (1)

- Support User Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 1.3.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.
- Added `messageMaxSize` configuration for websocket.

## 1.2.1 - 2025-06-24

### Changed (1)

- Fixed cases where the response can be an object or an array

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release