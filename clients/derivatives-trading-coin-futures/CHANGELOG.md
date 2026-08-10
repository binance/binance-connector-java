# Changelog

## 8.0.1 - 2026-08-10

### Changed (20)

#### REST API

- Modified response for `allOrders()` (`GET /dapi/v1/allOrders`):
  - items: property `goodTillDate` added
  - items: property `cumQuote` added
  - items: item property `goodTillDate` added
  - items: item property `cumQuote` added

- Modified response for `usersForceOrders()` (`GET /dapi/v1/forceOrders`):
  - items: property `goodTillDate` added
  - items: property `cumQuote` added
  - items: item property `goodTillDate` added
  - items: item property `cumQuote` added

- Modified response for `accountTradeList()` (`GET /dapi/v1/userTrades`):
  - items: property `quoteQty` added
  - items: item property `quoteQty` added

- Modified response schema `accountTradeListResponse`:
  - items: property `quoteQty` added
  - items: item property `quoteQty` added
- Modified response schema `allOrdersResponse`:
  - items: property `cumQuote` added
  - items: property `goodTillDate` added
  - items: item property `cumQuote` added
  - items: item property `goodTillDate` added
- Modified response schema `usersForceOrdersResponse`:
  - items: property `goodTillDate` added
  - items: property `cumQuote` added
  - items: item property `goodTillDate` added
  - items: item property `cumQuote` added
#### WebSocket Streams

- Modified response for `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream):
  - `a`.items: minItems `0` → `2`
  - `a`.items: maxItems `null` → `2`
  - `b`.items: minItems `0` → `2`
  - `b`.items: maxItems `null` → `2`

- Modified response field `a`:
  - property `S` added
  - affected events:
    - `UserDataStreamEventsResponse`
    - `accountUpdate`
- Modified response field `a`:
  - items: minItems `0` → `2`
  - items: maxItems `null` → `2`
  - affected events:
    - `diffBookDepthStreamsResponse`
- Modified response field `b`:
  - items: minItems `0` → `2`
  - items: maxItems `null` → `2`
  - affected events:
    - `diffBookDepthStreamsResponse`

## 8.0.0 - 2026-07-29

### Added (1)

#### WebSocket Streams

- `indexPriceStream()` (`<pair>@indexPrice@<updateSpeed>` stream)

### Changed (24)

#### REST API

- Modified parameter `batchOrders`:
  - items: required added: `symbol`, `side`, `type`, `quantity`
  - items.`activationPrice`: type `string` → `number`
  - items.`callbackRate`: type `string` → `number`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`priceProtect`: enum added: `true`, `false`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: enum added: `true`, `false`
  - items.`selfTradePreventionMode`: enum removed: `NONE`
  - items.`stopPrice`: type `string` → `number`
  - items.`activationPrice`: type `string` → `number`
  - items.`callbackRate`: type `string` → `number`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`priceProtect`: enum added: `true`, `false`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: enum added: `true`, `false`
  - items.`selfTradePreventionMode`: enum removed: `NONE`
  - items.`stopPrice`: type `string` → `number`
  - affected methods:
    - `placeMultipleOrders()` (`POST /dapi/v1/batchOrders`)
- Modified parameter `batchOrders`:
  - items: required added: `symbol`, `side`, `timestamp`
  - items: property `timestamp` added
  - items.`orderId`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`quantity`: type `string` → `number`
  - items.`recvWindow`: type `string` → `integer`
  - items: item property `timestamp` added
  - items.`orderId`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`quantity`: type `string` → `number`
  - items.`recvWindow`: type `string` → `integer`
  - affected methods:
    - `modifyMultipleOrders()` (`PUT /dapi/v1/batchOrders`)
- Modified parameter `contractType`:
  - enum removed: `CURRENT_QUARTER_DELIVERING`, `NEXT_QUARTER_DELIVERING`, `PERPETUAL_DELIVERING`
  - affected methods:
    - `continuousContractKlineCandlestickData()` (`GET /dapi/v1/continuousKlines`)
    - `basis()` (`GET /futures/data/basis`)
- Modified parameter `contractType`:
  - enum removed: `CURRENT_QUARTER_DELIVERING`, `NEXT_QUARTER_DELIVERING`, `PERPETUAL_DELIVERING`
  - enum added: `ALL`
  - affected methods:
    - `openInterestStatistics()` (`GET /futures/data/openInterestHist`)
    - `takerBuySellVolume()` (`GET /futures/data/takerBuySellVol`)
- Modified parameter `incomeType`:
  - enum added: `TRANSFER`, `WELCOME_BONUS`, `FUNDING_FEE`, `REALIZED_PNL`, `COMMISSION`, `INSURANCE_CLEAR`, `DELIVERED_SETTELMENT`
  - affected methods:
    - `getIncomeHistory()` (`GET /dapi/v1/income`)
- Modified parameter `orderIdList`:
  - maxItems `null` → `10`
  - affected methods:
    - `cancelMultipleOrders()` (`DELETE /dapi/v1/batchOrders`)
- Modified parameter `origClientOrderIdList`:
  - maxItems `null` → `10`
  - affected methods:
    - `cancelMultipleOrders()` (`DELETE /dapi/v1/batchOrders`)
- Modified parameter `priceMatch`:
  - enum removed: `NONE`
  - affected methods:
    - `newOrder()` (`POST /dapi/v1/order`)
    - `modifyOrder()` (`PUT /dapi/v1/order`)
- Modified parameter `priceProtect`:
  - enum added: `true`, `false`
  - affected methods:
    - `newOrder()` (`POST /dapi/v1/order`)
- Modified parameter `reduceOnly`:
  - enum added: `true`, `false`
  - affected methods:
    - `newOrder()` (`POST /dapi/v1/order`)
- Modified parameter `type`:
  - type `string` → `integer`
  - enum removed: `LIMIT`, `MARKET`, `STOP`, `STOP_MARKET`, `TAKE_PROFIT`, `TAKE_PROFIT_MARKET`, `TRAILING_STOP_MARKET`
  - affected methods:
    - `modifyIsolatedPositionMargin()` (`POST /dapi/v1/positionMargin`)
- Modified response for `placeMultipleOrders()` (`POST /dapi/v1/batchOrders`):
  - items: property `closePosition` added
  - items: item property `closePosition` added

- Modified response for `orderBook()` (`GET /dapi/v1/depth`):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `markPriceKlineCandlestickData()` (`GET /dapi/v1/markPriceKlines`):
  - items.items: oneOf added 2 schema(s)
  - items.items: oneOf removed 2 schema(s)

#### WebSocket API

- Modified parameter `closePosition`:
  - enum added: `true`, `false`
  - affected methods:
    - `newOrder()` (`order.place` method)
- Modified parameter `priceMatch`:
  - enum removed: `NONE`
  - affected methods:
    - `modifyOrder()` (`order.modify` method)
    - `newOrder()` (`order.place` method)
- Modified parameter `priceProtect`:
  - enum added: `true`, `false`
  - affected methods:
    - `newOrder()` (`order.place` method)
- Modified parameter `reduceOnly`:
  - enum added: `true`, `false`
  - affected methods:
    - `newOrder()` (`order.place` method)
- Modified response for `queryOrder()` (`order.status` method):
  - `result`: property `cumQty` added

#### WebSocket Streams

- Modified parameter `contractType`:
  - enum added: `perpetual`, `current_quarter`, `next_quarter`
  - affected methods:
    - `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream)
- Modified parameter `interval`:
  - enum added: `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `8h`, `12h`, `1d`, `3d`, `1w`, `1M`
  - affected methods:
    - `indexKlineCandlestickStreams()` (`<pair>@indexPriceKline_<interval>` stream)
    - `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream)
    - `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream)
    - `markPriceKlineCandlestickStreams()` (`<symbol>@markPriceKline_<interval>` stream)
- Modified parameter `levels`:
  - type `integer` → `string`
  - enum added: `5`, `10`, `20`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream)
- Modified parameter `updateSpeed`:
  - enum added: `1s`
  - affected methods:
    - `markPriceOfAllSymbolsOfAPair()` (`<pair>@markPrice@<updateSpeed>` stream)
    - `markPriceStream()` (`<symbol>@markPrice@<updateSpeed>` stream)
- Modified parameter `updateSpeed`:
  - enum added: `100ms`, `500ms`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream)
    - `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream)

### Removed (1)

#### WebSocket Streams

- `/<pair>@indexPrice()` (`<pair>@indexPrice` stream)

## 7.1.1 - 2026-05-04

- Added stop method for WebSocket

## 7.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 7.0.0 - 2026-03-18

### Changed (1)

#### REST API

- Modified response for `exchangeInformation()` (`GET /dapi/v1/exchangeInfo`):
  - `symbols`.items: property `orderTypes` added
  - `symbols`.items: property `OrderType` deleted
  - `symbols`.items: item property `orderTypes` added
  - `symbols`.items: item property `OrderType` deleted

## 6.0.0 - 2026-02-12

### Changed (2)

#### REST API

- Modified response for `cancelMultipleOrders()` (`DELETE /dapi/v1/batchOrders`):
  - items: property `pair` added
  - items: item property `pair` added

- Modified response for `currentAllOpenOrders()` (`GET /dapi/v1/openOrders`):
  - items: property `pair` added
  - items: item property `pair` added

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
