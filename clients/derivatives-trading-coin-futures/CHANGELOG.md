# Changelog

## 5.0.0 - 2025-12-16

### Changed (1)

#### REST API

- Modified parameter `batchOrders`:
  - items.`orderId`: type `integer` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`recvWindow`: type `integer` → `string`
  - items.`orderId`: type `integer` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`recvWindow`: type `integer` → `string`
  - affected methods:
    - `modifyMultipleOrders()` (`PUT /dapi/v1/batchOrders`)

## 4.0.0 - 2025-10-21

### Changed (23)

#### REST API

- Modified response for `compressedAggregateTradesList()` (`GET /dapi/v1/aggTrades`):

- Modified response for `orderBook()` (`GET /dapi/v1/depth`):

- Modified response for `getFundingRateInfo()` (`GET /dapi/v1/fundingInfo`):

- Modified response for `queryOrder()` (`GET /dapi/v1/order`):
  - property `positionSide` added

#### WebSocket Streams

- Modified response for `allBookTickersStream()` (`!bookTicker` stream):

- Modified response for `contractInfoStream()` (`!contractInfo` stream):

- Modified response for `allMarketLiquidationOrderStreams()` (`!forceOrder@arr` stream):

- Modified response for `allMarketMiniTickersStream()` (`!miniTicker@arr` stream):

- Modified response for `allMarketTickersStreams()` (`!ticker@arr` stream):

- Modified response for `indexPriceStream()` (`<pair>@indexPrice@<updateSpeed>` stream):

- Modified response for `indexKlineCandlestickStreams()` (`<pair>@indexPriceKline_<interval>` stream):

- Modified response for `markPriceOfAllSymbolsOfAPair()` (`<pair>@markPrice@<updateSpeed>` stream):

- Modified response for `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream):

- Modified response for `aggregateTradeStreams()` (`<symbol>@aggTrade` stream):

- Modified response for `individualSymbolBookTickerStreams()` (`<symbol>@bookTicker` stream):

- Modified response for `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream):

- Modified response for `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream):

- Modified response for `liquidationOrderStreams()` (`<symbol>@forceOrder` stream):

- Modified response for `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream):

- Modified response for `markPriceStream()` (`<symbol>@markPrice@<updateSpeed>` stream):

- Modified response for `markPriceKlineCandlestickStreams()` (`<symbol>@markPriceKline_<interval>` stream):

- Modified response for `individualSymbolMiniTickerStream()` (`<symbol>@miniTicker` stream):

- Modified response for `individualSymbolTickerStreams()` (`<symbol>@ticker` stream):

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
