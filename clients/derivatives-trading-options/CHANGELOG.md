# Changelog

## 5.0.0 - 2025-12-16

### Changed (2)

#### REST API

- Modified parameter `orders`:
  - items.`isMmp`: type `boolean` → `string`
  - items.`postOnly`: type `boolean` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`reduceOnly`: type `boolean` → `string`
  - items.`isMmp`: type `boolean` → `string`
  - items.`postOnly`: type `boolean` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`reduceOnly`: type `boolean` → `string`
  - affected methods:
    - `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`)
#### WebSocket Streams

- Modified response for `tradeStreams()` (`<symbol>@trade` stream):
  - `t`: type `integer` → `string`

## 4.0.0 - 2025-10-21

### Changed (17)

#### REST API

- Deleted parameter `limit`
  - affected methods:
    - `queryCurrentOpenOptionOrders()` (`GET /eapi/v1/openOrders`)
- Deleted parameter `price`
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Deleted parameter `quantity`
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Deleted parameter `side`
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Deleted parameter `symbol`
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Modified parameter `orders`:
  - affected methods:
    - `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`)
- Modified parameter `side`:
  - affected methods:
    - `newOrder()` (`POST /eapi/v1/order`)

- Modified response for `orderBook()` (`GET /eapi/v1/depth`):

#### WebSocket Streams

- Modified response for `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream):

- Modified response for `indexPriceStreams()` (`<symbol>@index` stream):

- Modified response for `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream):

- Modified response for `ticker24Hour()` (`<symbol>@ticker` stream):

- Modified response for `tradeStreams()` (`<symbol>@trade` stream):

- Modified response for `markPrice()` (`<underlyingAsset>@markPrice` stream):

- Modified response for `openInterest()` (`<underlyingAsset>@openInterest@<expirationDate>` stream):

- Modified response for `ticker24HourByUnderlyingAssetAndExpirationData()` (`<underlyingAsset>@ticker@<expirationDate>` stream):

- Modified response for `newSymbolInfo()` (`option_pair` stream):

## 3.0.0 - 2025-09-22

### Changed (4)

#### REST API

- Modified response for `exchangeInformation()` method (`GET /eapi/v1/exchangeInfo`):
    - `optionSymbols`: item property `liquidationFeeRate` added

- Modified response for `optionMarginAccountInformation()` method (`GET /eapi/v1/marginAccount`):
    - `asset`: item property `adjustedEquity` added
    - `asset`: item property `lpProfit` deleted

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

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
