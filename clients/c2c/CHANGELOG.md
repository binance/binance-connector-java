# Changelog

## 3.0.0 - 2026-05-04

### Changed (1)

- Modified response for `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`):
  - property `unitPrice` added
  - property `payMethodName` added
  - property `fiatSymbol` added
  - property `fiat` added
  - property `commission` added
  - property `takerCommissionRate` added
  - property `orderStatus` added
  - property `takerAmount` added
  - property `additionalKycVerify` added
  - property `counterPartNickName` added
  - property `createTime` added
  - property `advNo` added
  - property `asset` added
  - property `totalPrice` added
  - property `tradeType` added
  - property `takerCommission` added
  - property `amount` added
  - property `orderNumber` added
  - property `code` deleted
  - property `data` deleted
  - property `message` deleted
  - property `success` deleted
  - property `total` deleted

## 2.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 2.0.0 - 2025-12-16

### Changed (6)

- Added parameter `endTimestamp`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Added parameter `rows`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Added parameter `startTimestamp`
  - affected methods:
    - `getC2CTradeHistory()` (`GET /sapi/v1/c2c/orderMatch/listUserOrderHistory`)
- Added parameter `tradeType`
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
