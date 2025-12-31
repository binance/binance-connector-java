# Changelog

## 8.0.0 - 2025-12-31

### Added (4)

#### REST API

- `orderListOpo()` (`POST /api/v3/orderList/opo`)
- `orderListOpoco()` (`POST /api/v3/orderList/opoco`)

#### WebSocket API

- `orderListPlaceOpo()` (`orderList.place.opo` method)
- `orderListPlaceOpoco()` (`orderList.place.opoco` method)

### Changed (6)

#### REST API

- Added parameter `symbolStatus`
  - affected methods:
    - `depth()` (`GET /api/v3/depth`)
    - `ticker()` (`GET /api/v3/ticker`)
    - `ticker24hr()` (`GET /api/v3/ticker/24hr`)
    - `tickerBookTicker()` (`GET /api/v3/ticker/bookTicker`)
    - `tickerPrice()` (`GET /api/v3/ticker/price`)
    - `tickerTradingDay()` (`GET /api/v3/ticker/tradingDay`)
- Modified response for `exchangeInfo()` (`GET /api/v3/exchangeInfo`):
  - `symbols`.items: property `opoAllowed` added
  - `symbols`.items: item property `opoAllowed` added

- Marked `orderOco()` (`POST /api/v3/order/oco`) as deprecated.

#### WebSocket API

- Added parameter `symbolStatus`
  - affected methods:
    - `depth()` (`depth` method)
    - `ticker()` (`ticker` method)
    - `ticker24hr()` (`ticker.24hr` method)
    - `tickerBook()` (`ticker.book` method)
    - `tickerPrice()` (`ticker.price` method)
    - `tickerTradingDay()` (`ticker.tradingDay` method)
- Modified response for `exchangeInfo()` (`exchangeInfo` method):
  - `result`.`symbols`.items: property `opoAllowed` added
  - `result`.`symbols`.items: item property `opoAllowed` added

- Marked `orderListPlace()` (`orderList.place` method) as deprecated.

### Removed (7)

#### REST API

- `deleteUserDataStream()` (`DELETE /api/v3/userDataStream`)
- `newUserDataStream()` (`POST /api/v3/userDataStream`)
- `putUserDataStream()` (`PUT /api/v3/userDataStream`)

#### WebSocket API

- `/userDataStream.ping()` (`userDataStream.ping` method)
- `/userDataStream.start()` (`userDataStream.start` method)
- `/userDataStream.stop()` (`userDataStream.stop` method)

#### WebSocket Streams

- `/!ticker@arr()` (`!ticker@arr` stream)

## 7.0.0 - 2025-10-21

### Added (2)

#### REST API

- `myFilters()` (`GET /api/v3/myFilters`)

#### WebSocket API

- `myFilters()` (`myFilters` method)

### Changed (25)

#### REST API

- Modified parameter `aboveTimeInForce`:
  - type `number` → `string`
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Modified parameter `belowTimeInForce`:
  - enum removed: `belowType`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT_LIMIT`
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Modified parameter `recvWindow`:
  - type `integer` → `number`
  - format `int64` → `float`
  - affected methods:
    - `getAccount()` (`GET /api/v3/account`)
    - `allOrderList()` (`GET /api/v3/allOrderList`)
    - `allOrders()` (`GET /api/v3/allOrders`)
    - `myAllocations()` (`GET /api/v3/myAllocations`)
    - `myPreventedMatches()` (`GET /api/v3/myPreventedMatches`)
    - `myTrades()` (`GET /api/v3/myTrades`)
    - `openOrderList()` (`GET /api/v3/openOrderList`)
    - `deleteOpenOrders()` (`DELETE /api/v3/openOrders`)
    - `getOpenOrders()` (`GET /api/v3/openOrders`)
    - `deleteOrder()` (`DELETE /api/v3/order`)
    - `getOrder()` (`GET /api/v3/order`)
    - `newOrder()` (`POST /api/v3/order`)
    - `orderAmendKeepPriority()` (`PUT /api/v3/order/amend/keepPriority`)
    - `orderAmendments()` (`GET /api/v3/order/amendments`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderOco()` (`POST /api/v3/order/oco`)
    - `orderTest()` (`POST /api/v3/order/test`)
    - `deleteOrderList()` (`DELETE /api/v3/orderList`)
    - `getOrderList()` (`GET /api/v3/orderList`)
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
    - `rateLimitOrder()` (`GET /api/v3/rateLimit/order`)
    - `sorOrder()` (`POST /api/v3/sor/order`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Modified parameter `stopLimitTimeInForce`:
  - affected methods:
    - `orderOco()` (`POST /api/v3/order/oco`)

- Modified response for `aggTrades()` (`GET /api/v3/aggTrades`):

- Modified response for `exchangeInfo()` (`GET /api/v3/exchangeInfo`):
  - `exchangeFilters`: item property `maxQty` deleted
  - `exchangeFilters`: item property `maxTrailingAboveDelta` deleted
  - `exchangeFilters`: item property `maxTrailingBelowDelta` deleted
  - `exchangeFilters`: item property `maxNumOrderLists` deleted
  - `exchangeFilters`: item property `limit` deleted
  - `exchangeFilters`: item property `bidMultiplierUp` deleted
  - `exchangeFilters`: item property `applyMinToMarket` deleted
  - `exchangeFilters`: item property `minNotional` deleted
  - `exchangeFilters`: item property `minTrailingBelowDelta` deleted
  - `exchangeFilters`: item property `stepSize` deleted
  - `exchangeFilters`: item property `multiplierDown` deleted
  - `exchangeFilters`: item property `tickSize` deleted
  - `exchangeFilters`: item property `maxNumAlgoOrders` deleted
  - `exchangeFilters`: item property `filterType` deleted
  - `exchangeFilters`: item property `maxPrice` deleted
  - `exchangeFilters`: item property `multiplierUp` deleted
  - `exchangeFilters`: item property `minTrailingAboveDelta` deleted
  - `exchangeFilters`: item property `askMultiplierDown` deleted
  - `exchangeFilters`: item property `minQty` deleted
  - `exchangeFilters`: item property `avgPriceMins` deleted
  - `exchangeFilters`: item property `maxPosition` deleted
  - `exchangeFilters`: item property `bidMultiplierDown` deleted
  - `exchangeFilters`: item property `minPrice` deleted
  - `exchangeFilters`: item property `maxNumOrderAmends` deleted
  - `exchangeFilters`: item property `applyMaxToMarket` deleted
  - `exchangeFilters`: item property `maxNumIcebergOrders` deleted
  - `exchangeFilters`: item property `applyToMarket` deleted
  - `exchangeFilters`: item property `maxNotional` deleted
  - `exchangeFilters`: item property `askMultiplierUp` deleted
  - `exchangeFilters`: item property `maxNumOrders` deleted
  - `symbols`.`filters`: item property `minPrice` deleted
  - `symbols`.`filters`: item property `limit` deleted
  - `symbols`.`filters`: item property `maxTrailingBelowDelta` deleted
  - `symbols`.`filters`: item property `maxNumAlgoOrders` deleted
  - `symbols`.`filters`: item property `maxPrice` deleted
  - `symbols`.`filters`: item property `avgPriceMins` deleted
  - `symbols`.`filters`: item property `maxTrailingAboveDelta` deleted
  - `symbols`.`filters`: item property `maxPosition` deleted
  - `symbols`.`filters`: item property `stepSize` deleted
  - `symbols`.`filters`: item property `applyMaxToMarket` deleted
  - `symbols`.`filters`: item property `applyToMarket` deleted
  - `symbols`.`filters`: item property `minNotional` deleted
  - `symbols`.`filters`: item property `multiplierUp` deleted
  - `symbols`.`filters`: item property `maxNotional` deleted
  - `symbols`.`filters`: item property `maxNumOrderAmends` deleted
  - `symbols`.`filters`: item property `multiplierDown` deleted
  - `symbols`.`filters`: item property `maxNumOrders` deleted
  - `symbols`.`filters`: item property `maxQty` deleted
  - `symbols`.`filters`: item property `askMultiplierDown` deleted
  - `symbols`.`filters`: item property `bidMultiplierDown` deleted
  - `symbols`.`filters`: item property `minTrailingBelowDelta` deleted
  - `symbols`.`filters`: item property `askMultiplierUp` deleted
  - `symbols`.`filters`: item property `tickSize` deleted
  - `symbols`.`filters`: item property `bidMultiplierUp` deleted
  - `symbols`.`filters`: item property `maxNumIcebergOrders` deleted
  - `symbols`.`filters`: item property `minTrailingAboveDelta` deleted
  - `symbols`.`filters`: item property `applyMinToMarket` deleted
  - `symbols`.`filters`: item property `filterType` deleted
  - `symbols`.`filters`: item property `maxNumOrderLists` deleted
  - `symbols`.`filters`: item property `minQty` deleted

#### WebSocket API

- Modified parameter `aboveTimeInForce`:
  - type `number` → `string`
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Modified parameter `belowTimeInForce`:
  - enum removed: `belowType`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT_LIMIT`
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Modified parameter `recvWindow`:
  - type `integer` → `number`
  - format `int64` → `float`
  - affected methods:
    - `accountRateLimitsOrders()` (`account.rateLimits.orders` method)
    - `accountStatus()` (`account.status` method)
    - `allOrderLists()` (`allOrderLists` method)
    - `allOrders()` (`allOrders` method)
    - `myAllocations()` (`myAllocations` method)
    - `myPreventedMatches()` (`myPreventedMatches` method)
    - `myTrades()` (`myTrades` method)
    - `openOrderListsStatus()` (`openOrderLists.status` method)
    - `openOrdersCancelAll()` (`openOrders.cancelAll` method)
    - `openOrdersStatus()` (`openOrders.status` method)
    - `orderAmendKeepPriority()` (`order.amend.keepPriority` method)
    - `orderAmendments()` (`order.amendments` method)
    - `orderCancel()` (`order.cancel` method)
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderStatus()` (`order.status` method)
    - `orderTest()` (`order.test` method)
    - `orderListCancel()` (`orderList.cancel` method)
    - `orderListPlace()` (`orderList.place` method)
    - `orderListPlaceOco()` (`orderList.place.oco` method)
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
    - `orderListStatus()` (`orderList.status` method)
    - `sessionLogon()` (`session.logon` method)
    - `sorOrderPlace()` (`sor.order.place` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `stopLimitTimeInForce`:
  - affected methods:
    - `orderListPlace()` (`orderList.place` method)

- Modified response for `exchangeInfo()` (`exchangeInfo` method):
  - `result`.`exchangeFilters`: item property `stepSize` deleted
  - `result`.`exchangeFilters`: item property `maxNumIcebergOrders` deleted
  - `result`.`exchangeFilters`: item property `applyToMarket` deleted
  - `result`.`exchangeFilters`: item property `minNotional` deleted
  - `result`.`exchangeFilters`: item property `maxNumAlgoOrders` deleted
  - `result`.`exchangeFilters`: item property `askMultiplierUp` deleted
  - `result`.`exchangeFilters`: item property `avgPriceMins` deleted
  - `result`.`exchangeFilters`: item property `askMultiplierDown` deleted
  - `result`.`exchangeFilters`: item property `maxQty` deleted
  - `result`.`exchangeFilters`: item property `maxPrice` deleted
  - `result`.`exchangeFilters`: item property `minPrice` deleted
  - `result`.`exchangeFilters`: item property `maxNumOrderAmends` deleted
  - `result`.`exchangeFilters`: item property `maxPosition` deleted
  - `result`.`exchangeFilters`: item property `multiplierUp` deleted
  - `result`.`exchangeFilters`: item property `maxTrailingAboveDelta` deleted
  - `result`.`exchangeFilters`: item property `tickSize` deleted
  - `result`.`exchangeFilters`: item property `multiplierDown` deleted
  - `result`.`exchangeFilters`: item property `applyMaxToMarket` deleted
  - `result`.`exchangeFilters`: item property `bidMultiplierUp` deleted
  - `result`.`exchangeFilters`: item property `maxNotional` deleted
  - `result`.`exchangeFilters`: item property `maxNumOrders` deleted
  - `result`.`exchangeFilters`: item property `minQty` deleted
  - `result`.`exchangeFilters`: item property `minTrailingBelowDelta` deleted
  - `result`.`exchangeFilters`: item property `filterType` deleted
  - `result`.`exchangeFilters`: item property `bidMultiplierDown` deleted
  - `result`.`exchangeFilters`: item property `maxNumOrderLists` deleted
  - `result`.`exchangeFilters`: item property `limit` deleted
  - `result`.`exchangeFilters`: item property `maxTrailingBelowDelta` deleted
  - `result`.`exchangeFilters`: item property `minTrailingAboveDelta` deleted
  - `result`.`exchangeFilters`: item property `applyMinToMarket` deleted
  - `result`.`symbols`.`filters`: item property `applyMinToMarket` deleted
  - `result`.`symbols`.`filters`: item property `maxNumOrderLists` deleted
  - `result`.`symbols`.`filters`: item property `multiplierUp` deleted
  - `result`.`symbols`.`filters`: item property `bidMultiplierUp` deleted
  - `result`.`symbols`.`filters`: item property `maxNumAlgoOrders` deleted
  - `result`.`symbols`.`filters`: item property `maxPrice` deleted
  - `result`.`symbols`.`filters`: item property `minQty` deleted
  - `result`.`symbols`.`filters`: item property `minTrailingBelowDelta` deleted
  - `result`.`symbols`.`filters`: item property `applyMaxToMarket` deleted
  - `result`.`symbols`.`filters`: item property `maxTrailingAboveDelta` deleted
  - `result`.`symbols`.`filters`: item property `avgPriceMins` deleted
  - `result`.`symbols`.`filters`: item property `limit` deleted
  - `result`.`symbols`.`filters`: item property `maxNumOrderAmends` deleted
  - `result`.`symbols`.`filters`: item property `maxNumIcebergOrders` deleted
  - `result`.`symbols`.`filters`: item property `minTrailingAboveDelta` deleted
  - `result`.`symbols`.`filters`: item property `minNotional` deleted
  - `result`.`symbols`.`filters`: item property `maxQty` deleted
  - `result`.`symbols`.`filters`: item property `stepSize` deleted
  - `result`.`symbols`.`filters`: item property `minPrice` deleted
  - `result`.`symbols`.`filters`: item property `maxTrailingBelowDelta` deleted
  - `result`.`symbols`.`filters`: item property `multiplierDown` deleted
  - `result`.`symbols`.`filters`: item property `bidMultiplierDown` deleted
  - `result`.`symbols`.`filters`: item property `askMultiplierUp` deleted
  - `result`.`symbols`.`filters`: item property `tickSize` deleted
  - `result`.`symbols`.`filters`: item property `maxNumOrders` deleted
  - `result`.`symbols`.`filters`: item property `maxPosition` deleted
  - `result`.`symbols`.`filters`: item property `filterType` deleted
  - `result`.`symbols`.`filters`: item property `applyToMarket` deleted
  - `result`.`symbols`.`filters`: item property `askMultiplierDown` deleted
  - `result`.`symbols`.`filters`: item property `maxNotional` deleted

- Modified response for `tradesAggregate()` (`trades.aggregate` method):

#### WebSocket Streams

- Modified response for `allMiniTicker()` (`!miniTicker@arr` stream):

- Modified response for `allTicker()` (`!ticker@arr` stream):

- Modified response for `allMarketRollingWindowTicker()` (`!ticker_<windowSize>@arr` stream):

- Modified response for `aggTrade()` (`<symbol>@aggTrade` stream):

- Modified response for `avgPrice()` (`<symbol>@avgPrice` stream):

- Modified response for `bookTicker()` (`<symbol>@bookTicker` stream):

- Modified response for `diffBookDepth()` (`<symbol>@depth@<updateSpeed>` stream):

- Modified response for `kline()` (`<symbol>@kline_<interval>` stream):

- Modified response for `klineOffset()` (`<symbol>@kline_<interval>@+08:00` stream):

- Modified response for `miniTicker()` (`<symbol>@miniTicker` stream):

- Modified response for `ticker()` (`<symbol>@ticker` stream):

- Modified response for `rollingWindowTicker()` (`<symbol>@ticker_<windowSize>` stream):

- Modified response for `trade()` (`<symbol>@trade` stream):

## 6.0.0 - 2025-08-21

### Added (2)

#### WebSocket API

- `sessionSubscriptions()` (`session.subscriptions` method)
- `userDataStreamSubscribeSignature()` (`userDataStream.subscribe.signature` method)

### Changed (82)

- Update `binance/common` module to version `2.0.1`.

#### REST API

- Added parameter `abovePegOffsetType`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `abovePegOffsetValue`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `abovePegPriceType`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `belowPegOffsetType`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `belowPegOffsetValue`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `belowPegPriceType`
  - affected methods:
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
- Added parameter `icebergQty`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `newClientOrderId`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `newOrderRespType`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `pegOffsetType`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Added parameter `pegOffsetValue`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Added parameter `pegPriceType`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Added parameter `pendingAbovePegOffsetType`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingAbovePegOffsetValue`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingAbovePegPriceType`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingBelowPegOffsetType`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingBelowPegOffsetValue`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingBelowPegPriceType`
  - affected methods:
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `pendingPegOffsetType`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
- Added parameter `pendingPegOffsetValue`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
- Added parameter `pendingPegPriceType`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
- Added parameter `price`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `quantity`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `recvWindow`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `selfTradePreventionMode`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `side`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `strategyId`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `strategyType`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `symbol`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `timeInForce`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `type`
  - affected methods:
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Added parameter `workingPegOffsetType`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `workingPegOffsetValue`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Added parameter `workingPegPriceType`
  - affected methods:
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
- Modified parameter `computeCommissionRates`:
  - affected methods:
    - `orderTest()` (`POST /api/v3/order/test`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)

- Modified response for `accountCommission()` method (`GET /api/v3/account/commission`):
  - property `specialCommission` added

- Modified response for `exchangeInfo()` method (`GET /api/v3/exchangeInfo`):
  - `exchangeFilters`: item property `maxNumOrderAmends` added
  - `exchangeFilters`: item property `maxNumOrderLists` added
  - `symbols`: item property `pegInstructionsAllowed` added
  - `symbols`.`filters`: item property `maxNumOrderAmends` added
  - `symbols`.`filters`: item property `maxNumOrderLists` added

- Modified response for `orderTest()` method (`POST /api/v3/order/test`):
  - property `specialCommissionForOrder` added

#### WebSocket API

- Added parameter `abovePegOffsetType`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `abovePegOffsetValue`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `abovePegPriceType`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `belowPegOffsetType`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `belowPegOffsetValue`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `belowPegPriceType`
  - affected methods:
    - `orderListPlaceOco()` (`orderList.place.oco` method)
- Added parameter `icebergQty`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `newClientOrderId`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `newOrderRespType`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `pegOffsetType`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Added parameter `pegOffsetValue`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Added parameter `pegPriceType`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Added parameter `pendingAbovePegOffsetType`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingAbovePegOffsetValue`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingAbovePegPriceType`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingBelowPegOffsetType`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingBelowPegOffsetValue`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingBelowPegPriceType`
  - affected methods:
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `pendingPegOffsetType`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
- Added parameter `pendingPegOffsetValue`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
- Added parameter `pendingPegPriceType`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
- Added parameter `price`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `quantity`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `quoteOrderQty`
  - affected methods:
    - `orderTest()` (`order.test` method)
- Added parameter `recvWindow`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `selfTradePreventionMode`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `side`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `stopPrice`
  - affected methods:
    - `orderTest()` (`order.test` method)
- Added parameter `strategyId`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `strategyType`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `subscriptionId`
  - affected methods:
    - `userDataStreamUnsubscribe()` (`userDataStream.unsubscribe` method)
- Added parameter `symbol`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `timeInForce`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `trailingDelta`
  - affected methods:
    - `orderTest()` (`order.test` method)
- Added parameter `type`
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Added parameter `workingPegOffsetType`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `workingPegOffsetValue`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Added parameter `workingPegPriceType`
  - affected methods:
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
- Modified parameter `cancelOrderId`:
  - format `int32` → `int64`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
- Modified parameter `computeCommissionRates`:
  - affected methods:
    - `orderTest()` (`order.test` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `orderId`:
  - format `int32` → `int64`
  - affected methods:
    - `allOrders()` (`allOrders` method)
    - `myTrades()` (`myTrades` method)
    - `orderCancel()` (`order.cancel` method)
    - `orderStatus()` (`order.status` method)

- Modified response for `accountCommission()` method (`POST /account.commission`):
  - `result`: property `specialCommission` added

- Modified response for `exchangeInfo()` method (`POST /exchangeInfo`):
  - `result`.`exchangeFilters`: item property `maxNumOrderLists` added
  - `result`.`exchangeFilters`: item property `maxNumOrderAmends` added
  - `result`.`symbols`: item property `pegInstructionsAllowed` added
  - `result`.`symbols`.`filters`: item property `maxNumOrderLists` added
  - `result`.`symbols`.`filters`: item property `maxNumOrderAmends` added

- Modified response for `orderTest()` method (`POST /order.test`):
  - `result`: property `specialCommissionForOrder` added

## 5.0.1 - 2025-08-07

### Changed (2)

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 5.0.0 - 2025-07-24

### Changed (4)

#### REST API

- Added missing parameters to `orderTest()` (`POST /api/v3/order/test`)

#### WebSocket API

- Added missing parameters to `orderTest()`

- Modified parameter `cancelOrderId`:
  - format `Integer` → `Long`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
- Modified parameter `orderId`:
  - format `Integer` → `Long`
  - affected methods:
    - `allOrders()` (`allOrders` method)
    - `myTrades()` (`myTrades` method)
    - `orderCancel()` (`order.cancel` method)
    - `orderStatus()` (`order.status` method)

## 4.0.0 - 2025-07-16

### Added (1)

- Support User Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 3.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.
- Added `messageMaxSize` configuration for websocket.

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
