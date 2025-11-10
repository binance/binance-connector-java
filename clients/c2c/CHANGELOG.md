# Changelog

## 2.0.0 - 2025-11-10

### Changed (4)

- Added parameter `endTimestamp`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Added parameter `startTimestamp`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Deleted parameter `endTime`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Deleted parameter `startTime`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)

## 1.2.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 1.2.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
