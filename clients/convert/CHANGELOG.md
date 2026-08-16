# Changelog

## 3.0.0 - 2026-07-29

### Changed (4)

- Modified parameter `expiredType`:
  - enum added: `1_D`, `3_D`, `7_D`, `30_D`
  - affected methods:
    - `placeLimitOrder()` (`POST /sapi/v1/convert/limit/placeOrder`)
- Modified parameter `side`:
  - enum added: `BUY`, `SELL`
  - affected methods:
    - `placeLimitOrder()` (`POST /sapi/v1/convert/limit/placeOrder`)
- Modified parameter `validTime`:
  - enum added: `10s`, `30s`, `1m`
  - affected methods:
    - `sendQuoteRequest()` (`POST /sapi/v1/convert/getQuote`)
- Modified parameter `walletType`:
  - enum added: `SPOT`, `FUNDING`, `EARN`, `SPOT_FUNDING`, `FUNDING_EARN`, `SPOT_FUNDING_EARN`, `SPOT_EARN`
  - affected methods:
    - `sendQuoteRequest()` (`POST /sapi/v1/convert/getQuote`)
    - `placeLimitOrder()` (`POST /sapi/v1/convert/limit/placeOrder`)

## 2.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.|

## 2.0.0 - 2026-02-12

### Changed (1)

- Modified response for `placeLimitOrder()` (`POST /sapi/v1/convert/limit/placeOrder`):
  - property `orderId` added
  - property `status` added
  - property `inverseRatio` deleted
  - property `quoteId` deleted
  - property `ratio` deleted
  - property `toAmount` deleted
  - property `validTimestamp` deleted
  - property `fromAmount` deleted

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
