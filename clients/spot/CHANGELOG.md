# Changelog

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
