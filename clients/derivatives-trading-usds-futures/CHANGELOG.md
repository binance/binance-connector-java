# Changelog

## 12.0.1 - 2026-08-10

### Changed (26)

#### REST API

- Modified response for `allOrders()` (`GET /fapi/v1/allOrders`):
  - items: property `pair` added
  - items: property `cumBase` added
  - items: item property `pair` added
  - items: item property `cumBase` added

- Modified response for `usersForceOrders()` (`GET /fapi/v1/forceOrders`):
  - items: property `pair` added
  - items: property `cumBase` added
  - items: item property `pair` added
  - items: item property `cumBase` added

- Modified response for `accountTradeList()` (`GET /fapi/v1/userTrades`):
  - items: property `baseQty` added
  - items: property `marginAsset` added
  - items: property `pair` added
  - items: item property `baseQty` added
  - items: item property `marginAsset` added
  - items: item property `pair` added

- Modified response schema `accountTradeListResponse`:
  - items: property `baseQty` added
  - items: property `marginAsset` added
  - items: property `pair` added
  - items: item property `baseQty` added
  - items: item property `marginAsset` added
  - items: item property `pair` added
- Modified response schema `allOrdersResponse`:
  - items: property `pair` added
  - items: property `cumBase` added
  - items: item property `pair` added
  - items: item property `cumBase` added
- Modified response schema `usersForceOrdersResponse`:
  - items: property `pair` added
  - items: property `cumBase` added
  - items: item property `pair` added
  - items: item property `cumBase` added
#### WebSocket Streams

- Modified response for `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream):
  - `a`.items: minItems `0` → `2`
  - `a`.items: maxItems `null` → `2`
  - `b`.items: minItems `0` → `2`
  - `b`.items: maxItems `null` → `2`

- Modified response for `rpiDiffBookDepthStreams()` (`<symbol>@rpiDepth@500ms` stream):
  - `a`.items: minItems `0` → `2`
  - `a`.items: maxItems `null` → `2`
  - `b`.items: minItems `0` → `2`
  - `b`.items: maxItems `null` → `2`

- Modified response field `a`:
  - property `S` added
  - affected events:
    - `UserDataStreamEventsResponse`
    - `accountUpdate`
- Modified response field `o`:
  - property `ia` added
  - affected events:
    - `UserDataStreamEventsResponse`
    - `algoUpdate`
- Modified response field `a`:
  - items: minItems `0` → `2`
  - items: maxItems `null` → `2`
  - affected events:
    - `diffBookDepthStreamsResponse`
    - `rpiDiffBookDepthStreamsResponse`
- Modified response field `b`:
  - items: minItems `0` → `2`
  - items: maxItems `null` → `2`
  - affected events:
    - `diffBookDepthStreamsResponse`
    - `rpiDiffBookDepthStreamsResponse`

## 12.0.0 - 2026-07-29

### Changed (56)

#### REST API

- Modified parameter `algoType`:
  - enum added: `CONDITIONAL`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- Modified parameter `batchOrders`:
  - items.`goodTillDate`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: enum added: `true`, `false`
  - items.`selfTradePreventionMode`: enum added: `NONE`
  - items.`type`: enum added: `LIMIT`, `MARKET`, `STOP`, `STOP_MARKET`, `TAKE_PROFIT`, `TAKE_PROFIT_MARKET`, `TRAILING_STOP_MARKET`
  - items.`goodTillDate`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: enum added: `true`, `false`
  - items.`selfTradePreventionMode`: enum added: `NONE`
  - items.`type`: enum added: `LIMIT`, `MARKET`, `STOP`, `STOP_MARKET`, `TAKE_PROFIT`, `TAKE_PROFIT_MARKET`, `TRAILING_STOP_MARKET`
  - affected methods:
    - `placeMultipleOrders()` (`POST /fapi/v1/batchOrders`)
- Modified parameter `batchOrders`:
  - items: property `timestamp` added
  - items.`orderId`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`quantity`: type `string` → `number`
  - items.`recvWindow`: type `string` → `integer`
  - items.`stopPrice`: type `string` → `number`
  - items: item property `timestamp` added
  - items.`orderId`: type `string` → `integer`
  - items.`price`: type `string` → `number`
  - items.`priceMatch`: enum removed: `NONE`
  - items.`quantity`: type `string` → `number`
  - items.`recvWindow`: type `string` → `integer`
  - items.`stopPrice`: type `string` → `number`
  - affected methods:
    - `modifyMultipleOrders()` (`PUT /fapi/v1/batchOrders`)
- Modified parameter `closePosition`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `contractType`:
  - enum removed: `CURRENT_MONTH`, `NEXT_MONTH`, `PERPETUAL_DELIVERING`
  - enum added: `TRADIFI_PERPETUAL`
  - affected methods:
    - `continuousContractKlineCandlestickData()` (`GET /fapi/v1/continuousKlines`)
- Modified parameter `contractType`:
  - enum removed: `CURRENT_MONTH`, `NEXT_MONTH`, `PERPETUAL_DELIVERING`
  - affected methods:
    - `basis()` (`GET /futures/data/basis`)
- Modified parameter `incomeType`:
  - enum added: `TRANSFER`, `WELCOME_BONUS`, `REALIZED_PNL`, `FUNDING_FEE`, `COMMISSION`, `INSURANCE_CLEAR`, `REFERRAL_KICKBACK`, `COMMISSION_REBATE`, `API_REBATE`, `CONTEST_REWARD`, `CROSS_COLLATERAL_TRANSFER`, `OPTIONS_PREMIUM_FEE`, `OPTIONS_SETTLE_PROFIT`, `INTERNAL_TRANSFER`, `AUTO_EXCHANGE`, `DELIVERED_SETTELMENT`, `COIN_SWAP_DEPOSIT`, `COIN_SWAP_WITHDRAW`, `POSITION_LIMIT_INCREASE_FEE`, `STRATEGY_UMFUTURES_TRANSFER`, `FEE_RETURN`, `BFUSD_REWARD`
  - affected methods:
    - `getIncomeHistory()` (`GET /fapi/v1/income`)
- Modified parameter `interval`:
  - enum removed: `1s`
  - affected methods:
    - `continuousContractKlineCandlestickData()` (`GET /fapi/v1/continuousKlines`)
    - `indexPriceKlineCandlestickData()` (`GET /fapi/v1/indexPriceKlines`)
    - `klineCandlestickData()` (`GET /fapi/v1/klines`)
    - `markPriceKlineCandlestickData()` (`GET /fapi/v1/markPriceKlines`)
    - `premiumIndexKlineData()` (`GET /fapi/v1/premiumIndexKlines`)
- Modified parameter `orderIdList`:
  - maxLength `null` → `10`
  - affected methods:
    - `cancelMultipleOrders()` (`DELETE /fapi/v1/batchOrders`)
- Modified parameter `origClientOrderIdList`:
  - maxLength `null` → `10`
  - affected methods:
    - `cancelMultipleOrders()` (`DELETE /fapi/v1/batchOrders`)
- Modified parameter `positionSide`:
  - enum removed: `BOTH`, `LONG`, `SHORT`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `newOrder()` (`POST /fapi/v1/order`)
    - `modifyIsolatedPositionMargin()` (`POST /fapi/v1/positionMargin`)
- Modified parameter `priceMatch`:
  - enum removed: `NONE`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `newOrder()` (`POST /fapi/v1/order`)
    - `modifyOrder()` (`PUT /fapi/v1/order`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `priceProtect`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `reduceOnly`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `newOrder()` (`POST /fapi/v1/order`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `selfTradePreventionMode`:
  - enum added: `NONE`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `type`:
  - enum added: `LIMIT`, `MARKET`, `STOP`, `STOP_MARKET`, `TAKE_PROFIT`, `TAKE_PROFIT_MARKET`, `TRAILING_STOP_MARKET`
  - affected methods:
    - `newAlgoOrder()` (`POST /fapi/v1/algoOrder`)
- Modified parameter `type`:
  - enum added: `LIMIT`, `MARKET`, `STOP`, `STOP_MARKET`, `TAKE_PROFIT`, `TAKE_PROFIT_MARKET`, `TRAILING_STOP_MARKET`
  - affected methods:
    - `newOrder()` (`POST /fapi/v1/order`)
    - `testOrder()` (`POST /fapi/v1/order/test`)
- Modified parameter `type`:
  - type `string` → `integer`
  - affected methods:
    - `modifyIsolatedPositionMargin()` (`POST /fapi/v1/positionMargin`)
- Modified parameter `type`:
  - type `integer` → `string`
  - affected methods:
    - `getPositionMarginChangeHistory()` (`GET /fapi/v1/positionMargin/history`)
- Modified response for `orderBook()` (`GET /fapi/v1/depth`):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `queryInsuranceFundBalanceSnapshot()` (`GET /fapi/v1/insuranceBalance`):
  - oneOf modified

- Modified response for `notionalAndLeverageBrackets()` (`GET /fapi/v1/leverageBracket`):
  - oneOf modified

- Modified response for `queryOrder()` (`GET /fapi/v1/order`):
  - property `selfTradePreventionMode` added
  - property `goodTillDate` added
  - property `priceMatch` added

- Modified response for `markPrice()` (`GET /fapi/v1/premiumIndex`):
  - oneOf modified

- Modified response for `rpiOrderBook()` (`GET /fapi/v1/rpiDepth`):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `adlRisk()` (`GET /fapi/v1/symbolAdlRisk`):
  - oneOf modified

- Modified response for `ticker24hrPriceChangeStatistics()` (`GET /fapi/v1/ticker/24hr`):
  - oneOf modified

- Modified response for `symbolOrderBookTicker()` (`GET /fapi/v1/ticker/bookTicker`):
  - oneOf modified

- Modified response for `symbolPriceTicker()` (`GET /fapi/v1/ticker/price`):
  - oneOf modified

- Modified response for `symbolPriceTickerV2()` (`GET /fapi/v2/ticker/price`):
  - oneOf modified

- Modified response for `longShortRatio()` (`GET /futures/data/globalLongShortAccountRatio`):
  - items.`timestamp`: type `string` → `integer`
  - items.`timestamp`: type `string` → `integer`

- Modified response for `openInterestStatistics()` (`GET /futures/data/openInterestHist`):
  - items.`timestamp`: type `string` → `integer`
  - items.`timestamp`: type `string` → `integer`

- Modified response for `takerBuySellVolume()` (`GET /futures/data/takerlongshortRatio`):
  - items.`timestamp`: type `string` → `integer`
  - items.`timestamp`: type `string` → `integer`

- Modified response for `topTraderLongShortRatioAccounts()` (`GET /futures/data/topLongShortAccountRatio`):
  - items.`timestamp`: type `string` → `integer`
  - items.`timestamp`: type `string` → `integer`

- Modified response for `topTraderLongShortRatioPositions()` (`GET /futures/data/topLongShortPositionRatio`):
  - items.`timestamp`: type `string` → `integer`
  - items.`timestamp`: type `string` → `integer`

- Marked `symbolPriceTicker()` (`GET /fapi/v1/ticker/price`) as deprecated.

#### WebSocket API

- Modified parameter `algoType`:
  - enum added: `CONDITIONAL`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `closePosition`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `priceMatch`:
  - enum removed: `NONE`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
    - `modifyOrder()` (`order.modify` method)
    - `newOrder()` (`order.place` method)
- Modified parameter `priceProtect`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `reduceOnly`:
  - enum added: `true`, `false`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
    - `newOrder()` (`order.place` method)
- Modified parameter `selfTradePreventionMode`:
  - enum added: `NONE`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `selfTradePreventionMode`:
  - enum added: `NONE`
  - affected methods:
    - `newOrder()` (`order.place` method)
- Modified parameter `timeInForce`:
  - enum removed: `GTX`, `GTD`, `RPI`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `type`:
  - enum added: `STOP_MARKET`, `TAKE_PROFIT_MARKET`, `STOP`, `TAKE_PROFIT`, `TRAILING_STOP_MARKET`
  - affected methods:
    - `newAlgoOrder()` (`algoOrder.place` method)
- Modified parameter `type`:
  - enum added: `LIMIT`, `MARKET`
  - affected methods:
    - `newOrder()` (`order.place` method)
- Modified response for `orderBook()` (`depth` method):
  - property `asks` added
  - property `bids` added
  - `result`: property `asks` deleted
  - `result`: property `bids` deleted

- Modified response for `queryOrder()` (`order.status` method):
  - `result`: property `selfTradePreventionMode` added
  - `result`: property `goodTillDate` added
  - `result`: property `priceMatch` added

- Modified response for `symbolOrderBookTicker()` (`ticker.book` method):
  - oneOf modified

- Modified response for `symbolPriceTicker()` (`ticker.price` method):
  - oneOf modified

#### WebSocket Streams

- Modified parameter `contractType`:
  - enum added: `perpetual`, `current_quarter`, `next_quarter`, `tradifi_perpetual`
  - affected methods:
    - `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream)
- Modified parameter `interval`:
  - enum added: `1s`, `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `8h`, `12h`, `1d`, `3d`, `1w`, `1M`
  - affected methods:
    - `continuousContractKlineCandlestickStreams()` (`<pair>_<contractType>@continuousKline_<interval>` stream)
- Modified parameter `interval`:
  - enum added: `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `8h`, `12h`, `1d`, `3d`, `1w`, `1M`
  - affected methods:
    - `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream)
- Modified parameter `levels`:
  - type `integer` → `string`
  - enum added: `5`, `10`, `20`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream)
- Modified parameter `updateSpeed`:
  - enum added: `1s`
  - affected methods:
    - `markPriceStreamForAllMarket()` (`!markPrice@arr@<updateSpeed>` stream)
    - `markPriceStream()` (`<symbol>@markPrice@<updateSpeed>` stream)
- Modified parameter `updateSpeed`:
  - enum added: `100ms`, `500ms`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<levels>@<updateSpeed>` stream)
    - `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream)

## 11.0.0 - 2026-05-04

- Added stop method for WebSocket

### Changed (3)

#### REST API

- Deleted parameter `page`
  - affected methods:
    - `queryAllAlgoOrders()` (`GET /fapi/v1/allAlgoOrders`)
- Modified parameter `interval`:
  - enum added: `1s`
  - affected methods:
    - `continuousContractKlineCandlestickData()` (`GET /fapi/v1/continuousKlines`)
    - `indexPriceKlineCandlestickData()` (`GET /fapi/v1/indexPriceKlines`)
    - `klineCandlestickData()` (`GET /fapi/v1/klines`)
    - `markPriceKlineCandlestickData()` (`GET /fapi/v1/markPriceKlines`)
    - `premiumIndexKlineData()` (`GET /fapi/v1/premiumIndexKlines`)
- Modified parameter `limit`:
  - required: `true` → `false`
  - affected methods:
    - `basis()` (`GET /futures/data/basis`)

## 10.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

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
