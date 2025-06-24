# Changelog

## 3.0.0 - 2025-06-12

### Changed (2)

#### REST API

- Fixed cases where the response can be an object or an array
- rateLimits to be unified as a single object
- Modified response for `exchangeInfo()` method (`GET /api/v3/exchangeInfo`):
  - `symbols`: item property `amendAllowed` added
  - `symbols`: item property `allowAmend` deleted


#### WebSocket API

- Modified response for `exchangeInfo()` method (`POST /exchangeInfo`):
  - `result`.`symbols`: item property `amendAllowed` added
  - `result`.`symbols`: item property `allowAmend` deleted

## 2.0.0 - 2025-05-14

- Updated response types.
- Updated request parameters to correctly specify their required status.

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
