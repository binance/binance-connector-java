# Changelog

## 4.0.0 - 2025-12-16

### Changed (1)

#### WebSocket Streams

- Modified response for `userData()` method:
  - removed `M` from `Executionreport`

## 3.0.0 - 2025-09-22

### Changed (2)

#### REST API

- Modified response for `marginMaxBorrow()` (`GET /papi/v1/margin/maxBorrowable`):
    - `amount`: type `number` → `string`
    - `borrowLimit`: type `integer` → `string`

- Modified response for `newMarginOrder()` (`POST /papi/v1/margin/order`):
    - `marginBuyBorrowAmount`: type `integer` → `string`

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

## 1.2.0 - 2025-06-24

### Changed (1)

- Update `binance/common` module to version `1.2.1`.
- Fixed cases where the response can be an object or an array

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release