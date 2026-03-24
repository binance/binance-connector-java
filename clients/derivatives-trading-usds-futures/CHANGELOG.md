# Changelog

## 10.0.0 - 2026-03-18

### Changed (5)

#### REST API

- Modified response for `exchangeInformation()` (`GET /fapi/v1/exchangeInfo`):
  - `symbols`.items: property `orderTypes` added
  - `symbols`.items: property `OrderType` deleted
  - `symbols`.items: item property `orderTypes` added
  - `symbols`.items: item property `OrderType` deleted

- Modified response for `cancelOrder()` (`DELETE /fapi/v1/order`):
  - property `avgPrice` added

- Modified response for `queryOrder()` (`GET /fapi/v1/order`):
  - property `executedQty` added
  - property `priceProtect` added
  - property `priceRate` added
  - property `type` added
  - property `workingType` added
  - property `side` added
  - property `time` added
  - property `timeInForce` added
  - property `clientOrderId` added
  - property `stopPrice` added
  - property `reduceOnly` added
  - property `cumQuote` added
  - property `price` added
  - property `closePosition` added
  - property `symbol` added
  - property `positionSide` added
  - property `origType` added
  - property `avgPrice` added
  - property `origQty` added
  - property `updateTime` added
  - property `activatePrice` added
  - property `orderId` added
  - property `result` deleted
  - property `id` deleted
  - `status`: type `integer` → `string`

#### WebSocket Streams

- Modified response for `markPriceStreamForAllMarket()` (`!markPrice@arr@<updateSpeed>` stream):
  - items: property `ap` added
  - items: item property `ap` added

- Modified response for `markPriceStream()` (`<symbol>@markPrice@<updateSpeed>` stream):
  - property `ap` added

## 9.0.0 - 2026-02-12

### Changed (20)

#### REST API

- Added parameter `activatePrice`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- Added parameter `algoId`
  - affected methods:
    - `cancelAlgoOrder()` (`DELETE /fapi/v1/algoOrder`)
- Added parameter `clientAlgoId`
  - affected methods:
    - `cancelAlgoOrder()` (`DELETE /fapi/v1/algoOrder`)
- Added parameter `newOrderRespType`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- Deleted parameter `activationPrice`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- Deleted parameter `algoid`
  - affected methods:
    - `cancelAlgoOrder()` (`DELETE /fapi/v1/algoOrder`)
- Deleted parameter `clientalgoid`
  - affected methods:
    - `cancelAlgoOrder()` (`DELETE /fapi/v1/algoOrder`)
- Modified parameter `batchOrders`:
  - items: property `stopPrice` added
  - items: item property `stopPrice` added
  - affected methods:
    - `modifyMultipleOrders()` (`PUT /fapi/v1/batchOrders`)
- Modified response for `placeMultipleOrders()` (`POST /fapi/v1/batchOrders`):
  - items: property `closePosition` added
  - items: item property `closePosition` added

- Modified response for `queryOrder()` (`GET /fapi/v1/order`):
  - property `id` added
  - property `result` added
  - property `updateTime` deleted
  - property `priceRate` deleted
  - property `orderId` deleted
  - property `type` deleted
  - property `goodTillDate` deleted
  - property `origQty` deleted
  - property `origType` deleted
  - property `closePosition` deleted
  - property `time` deleted
  - property `timeInForce` deleted
  - property `priceMatch` deleted
  - property `workingType` deleted
  - property `activatePrice` deleted
  - property `executedQty` deleted
  - property `selfTradePreventionMode` deleted
  - property `reduceOnly` deleted
  - property `side` deleted
  - property `price` deleted
  - property `clientOrderId` deleted
  - property `stopPrice` deleted
  - property `symbol` deleted
  - property `cumQuote` deleted
  - property `priceProtect` deleted
  - property `avgPrice` deleted
  - property `positionSide` deleted
  - `status`: type `string` → `integer`

- Modified response for `symbolConfiguration()` (`GET /fapi/v1/symbolConfig`):
  - items.`isAutoAddMargin`: type `string` → `boolean`
  - items.`isAutoAddMargin`: type `string` → `boolean`

#### WebSocket API

- Added parameter `activatePrice`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Added parameter `algoId`
  - affected methods:
    - `cancelAlgoOrder()` (`algoOrder.cancel` method)
- Added parameter `clientAlgoId`
  - affected methods:
    - `cancelAlgoOrder()` (`algoOrder.cancel` method)
- Added parameter `newOrderRespType`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Deleted parameter `activationPrice`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Deleted parameter `algoid`
  - affected methods:
    - `cancelAlgoOrder()` (`algoOrder.cancel` method)
- Deleted parameter `clientalgoid`
  - affected methods:
    - `cancelAlgoOrder()` (`algoOrder.cancel` method)
- Modified response for `positionInformationV2()` (`v2/account.position` method):
  - `result`.items: property `unRealizedProfit` added
  - `result`.items: property `unrealizedProfit` deleted
  - `result`.items: item property `unRealizedProfit` added
  - `result`.items: item property `unrealizedProfit` deleted

#### WebSocket Streams

- Modified response for `aggregateTradeStreams()` (`<symbol>@aggTrade` stream):
  - property `nq` added

## 8.0.0 - 2026-01-06

### Changed (3)

#### WebSocket API

- Added parameter `activatePrice`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Deleted parameter `activationPrice`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
#### WebSocket Streams

- Modified response for `aggregateTradeStreams()` (`<symbol>@aggTrade` stream):
  - property `nq` added

## 7.0.0 - 2025-12-16

### Added (14)

#### REST API

- `adlRisk()` (`GET /fapi/v1/symbolAdlRisk`)
- `cancelAlgoOrder()` (`DELETE /fapi/v1/algoOrder`)
- `cancelAllAlgoOpenOrders()` (`DELETE /fapi/v1/algoOpenOrders`)
- `currentAllAlgoOpenOrders()` (`GET /fapi/v1/openAlgoOrders`)
- `futuresTradfiPerpsContract()` (`POST /fapi/v1/stock/contract`)
- `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- `queryAlgoOrder()` (`GET /fapi/v1/algoOrder`)
- `queryAllAlgoOrders()` (`GET /fapi/v1/allAlgoOrders`)
- `rpiOrderBook()` (`GET /fapi/v1/rpiDepth`)
- `tradingSchedule()` (`GET /fapi/v1/tradingSchedule`)

#### WebSocket API

- `cancelAlgoOrder()` (`algoOrder.cancel` method)
- `newAlgoOrder()` (`algoOrder.place` method)

#### WebSocket Streams

- `rpiDiffBookDepthStreams()` (`<symbol>@rpiDepth@500ms` stream)
- `tradingSessionStream()` (`tradingSession` stream)

### Changed (8)

#### REST API

- Modified parameter `batchOrders`:
  - items.`activationPrice`: type `number` → `string`
  - items.`callbackRate`: type `number` → `string`
  - items.`goodTillDate`: type `integer` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`stopPrice`: type `number` → `string`
  - items.`timeInForce`: enum added: `RPI`
  - items.`activationPrice`: type `number` → `string`
  - items.`callbackRate`: type `number` → `string`
  - items.`goodTillDate`: type `integer` → `string`
  - items.`price`: type `number` → `string`
  - items.`quantity`: type `number` → `string`
  - items.`stopPrice`: type `number` → `string`
  - items.`timeInForce`: enum added: `RPI`
  - affected methods:
    - `placeMultipleOrders()` (`POST /fapi/v1/batchOrders`)
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
    - `modifyMultipleOrders()` (`PUT /fapi/v1/batchOrders`)
- Modified parameter `timeInForce`:
  - enum added: `RPI`
  - affected methods:
    - `newOrder()` (`POST /fapi/v1/order`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified response for `userCommissionRate()` (`GET /fapi/v1/commissionRate`):
  - property `rpiCommissionRate` added

- Modified response for `oldTradesLookup()` (`GET /fapi/v1/historicalTrades`):
  - items: property `isRPITrade` added
  - items: item property `isRPITrade` added

- Modified response for `recentTradesList()` (`GET /fapi/v1/trades`):
  - items: property `isRPITrade` added
  - items: item property `isRPITrade` added

- Marked `symbolPriceTicker()` (`GET /fapi/v1/ticker/price`) as deprecated.

#### WebSocket API

- Modified parameter `timeInForce`:
  - enum added: `RPI`
  - affected methods:
    - `newOrder()` (`order.place` method)

## 6.0.0 - 2025-10-21

### Changed (21)

#### REST API

- Modified response for `compressedAggregateTradesList()` (`GET /fapi/v1/aggTrades`):

- Modified response for `orderBook()` (`GET /fapi/v1/depth`):

#### WebSocket API

- Modified response for `orderBook()` (`depth` method):

#### WebSocket Streams

- Modified response for `multiAssetsModeAssetIndex()` (`!assetIndex@arr` stream):

- Modified response for `allBookTickersStream()` (`!bookTicker` stream):

- Modified response for `contractInfoStream()` (`!contractInfo` stream):

- Modified response for `allMarketLiquidationOrderStreams()` (`!forceOrder@arr` stream):

- Modified response for `markPriceStreamForAllMarket()` (`!markPrice@arr@<updateSpeed>` stream):

- Modified response for `allMarketMiniTickersStream()` (`!miniTicker@arr` stream):

- Modified response for `allMarketTickersStreams()` (`!ticker@arr` stream):

- Modified response for `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream):

- Modified response for `aggregateTradeStreams()` (`<symbol>@aggTrade` stream):

- Modified response for `individualSymbolBookTickerStreams()` (`<symbol>@bookTicker` stream):

- Modified response for `compositeIndexSymbolInformationStreams()` (`<symbol>@compositeIndex` stream):

- Modified response for `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream):

- Modified response for `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream):

- Modified response for `liquidationOrderStreams()` (`<symbol>@forceOrder` stream):

- Modified response for `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream):

- Modified response for `markPriceStream()` (`<symbol>@markPrice@<updateSpeed>` stream):

- Modified response for `individualSymbolMiniTickerStream()` (`<symbol>@miniTicker` stream):

- Modified response for `individualSymbolTickerStreams()` (`<symbol>@ticker` stream):

## 5.0.0 - 2025-09-22

### Changed (1)

#### REST API

- Modified response for `accountInformationV3()` method (`GET /fapi/v3/account`):
  - `assets`: item property `marginAvailable` deleted

## 4.0.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 4.0.0 - 2025-07-16

### Added (1)

- Support User Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 3.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.
- Added `messageMaxSize` configuration for websocket.

## 3.0.0 - 2025-06-24

### Changed (1)

#### REST API

- Modified response for `exchangeInformation()` method (`GET /fapi/v1/exchangeInfo`):
    - `assets`.`autoAssetExchange`: type `integer` → `string`
    - `symbols`.`filters`.`multiplierDecimal`: type `integer` → `string`
- Fixed cases where the response can be an object or an array

## 2.0.0 - 2025-06-02

### Removed (1)

#### REST API

- `historicalBlvtNavKlineCandlestick()` (`GET /fapi/v1/lvtKlines`)

### Changed (1)

#### REST API

- Add `price` and `weight` to `constituents` object.

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
