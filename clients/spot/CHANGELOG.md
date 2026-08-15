# Changelog

## 11.0.0 - 2026-07-29

### Changed (76)

#### REST API

- Modified parameter `cancelRestrictions`:
  - enum removed: `NEW`, `PARTIALLY_FILLED`
  - affected methods:
    - `deleteOrder()` (`DELETE /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
- Modified parameter `newOrderRespType`:
  - enum removed: `MARKET`, `LIMIT`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderOco()` (`POST /api/v3/order/oco`)
    - `orderTest()` (`POST /api/v3/order/test`)
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
    - `orderListOpo()` (`POST /api/v3/orderList/opo`)
    - `orderListOpoco()` (`POST /api/v3/orderList/opoco`)
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
    - `sorOrder()` (`POST /api/v3/sor/order`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Modified parameter `pegOffsetType`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Modified parameter `pegPriceType`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Modified parameter `permissions`:
  - items: enum added: `SPOT`, `MARGIN`, `LEVERAGED`, `TRD_GRP_002`, `TRD_GRP_003`, `TRD_GRP_004`, `TRD_GRP_005`, `TRD_GRP_006`, `TRD_GRP_007`, `TRD_GRP_008`, `TRD_GRP_009`, `TRD_GRP_010`, `TRD_GRP_011`, `TRD_GRP_012`, `TRD_GRP_013`, `TRD_GRP_014`, `TRD_GRP_015`, `TRD_GRP_016`, `TRD_GRP_017`, `TRD_GRP_018`, `TRD_GRP_019`, `TRD_GRP_020`, `TRD_GRP_021`, `TRD_GRP_022`, `TRD_GRP_023`, `TRD_GRP_024`, `TRD_GRP_025`
  - affected methods:
    - `exchangeInfo()` (`GET /api/v3/exchangeInfo`)
- Modified parameter `selfTradePreventionMode`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderOco()` (`POST /api/v3/order/oco`)
    - `orderTest()` (`POST /api/v3/order/test`)
    - `orderListOco()` (`POST /api/v3/orderList/oco`)
    - `orderListOpo()` (`POST /api/v3/orderList/opo`)
    - `orderListOpoco()` (`POST /api/v3/orderList/opoco`)
    - `orderListOto()` (`POST /api/v3/orderList/oto`)
    - `orderListOtoco()` (`POST /api/v3/orderList/otoco`)
    - `sorOrder()` (`POST /api/v3/sor/order`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Modified parameter `symbolStatus`:
  - enum removed: `END_OF_DAY`, `NON_REPRESENTABLE`
  - affected methods:
    - `depth()` (`GET /api/v3/depth`)
    - `exchangeInfo()` (`GET /api/v3/exchangeInfo`)
    - `executionRules()` (`GET /api/v3/executionRules`)
    - `referencePriceCalculation()` (`GET /api/v3/referencePrice/calculation`)
    - `tickerBookTicker()` (`GET /api/v3/ticker/bookTicker`)
    - `tickerPrice()` (`GET /api/v3/ticker/price`)
    - `tickerTradingDay()` (`GET /api/v3/ticker/tradingDay`)
- Modified parameter `symbolStatus`:
  - enum removed: `END_OF_DAY`, `NON_REPRESENTABLE`
  - affected methods:
    - `ticker()` (`GET /api/v3/ticker`)
    - `ticker24hr()` (`GET /api/v3/ticker/24hr`)
- Modified parameter `timeInForce`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
    - `sorOrder()` (`POST /api/v3/sor/order`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Modified parameter `type`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `newOrder()` (`POST /api/v3/order`)
    - `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`)
    - `orderTest()` (`POST /api/v3/order/test`)
- Modified parameter `type`:
  - enum removed: `STOP_LOSS`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT`, `TAKE_PROFIT_LIMIT`, `LIMIT_MAKER`, `NON_REPRESENTABLE`
  - affected methods:
    - `sorOrder()` (`POST /api/v3/sor/order`)
    - `sorOrderTest()` (`POST /api/v3/sor/order/test`)
- Modified parameter `windowSize`:
  - enum added: `7d`
  - affected methods:
    - `ticker()` (`GET /api/v3/ticker`)
- Modified response for `allOrders()` (`GET /api/v3/allOrders`):
  - items: property `preventedQuantity` added
  - items: property `strategyId` added
  - items: property `trailingTime` added
  - items: property `peggedPrice` added
  - items: property `pegPriceType` added
  - items: property `pegOffsetValue` added
  - items: property `strategyType` added
  - items: property `usedSor` added
  - items: property `expiryReason` added
  - items: property `workingFloor` added
  - items: property `pegOffsetType` added
  - items: property `trailingDelta` added
  - items: property `preventedMatchId` added
  - items: item property `preventedQuantity` added
  - items: item property `strategyId` added
  - items: item property `trailingTime` added
  - items: item property `peggedPrice` added
  - items: item property `pegPriceType` added
  - items: item property `pegOffsetValue` added
  - items: item property `strategyType` added
  - items: item property `usedSor` added
  - items: item property `expiryReason` added
  - items: item property `workingFloor` added
  - items: item property `pegOffsetType` added
  - items: item property `trailingDelta` added
  - items: item property `preventedMatchId` added

- Modified response for `depth()` (`GET /api/v3/depth`):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `exchangeInfo()` (`GET /api/v3/exchangeInfo`):
  - property `sors` added
  - `exchangeFilters`.items: oneOf modified
  - `symbols`.items.`filters`.items: oneOf modified
  - `symbols`.items.`filters`.items: oneOf modified

- Modified response for `klines()` (`GET /api/v3/klines`):
  - items.items: oneOf added 2 schema(s)
  - items.items: oneOf removed 2 schema(s)

- Modified response for `myFilters()` (`GET /api/v3/myFilters`):
  - `assetFilters`.items: oneOf modified
  - `exchangeFilters`.items: oneOf modified
  - `symbolFilters`.items: oneOf modified

- Modified response for `getOpenOrders()` (`GET /api/v3/openOrders`):
  - items: property `strategyId` added
  - items: property `trailingTime` added
  - items: property `usedSor` added
  - items: property `workingFloor` added
  - items: property `pegOffsetType` added
  - items: property `preventedMatchId` added
  - items: property `peggedPrice` added
  - items: property `trailingDelta` added
  - items: property `pegPriceType` added
  - items: property `preventedQuantity` added
  - items: property `strategyType` added
  - items: property `expiryReason` added
  - items: property `pegOffsetValue` added
  - items: item property `strategyId` added
  - items: item property `trailingTime` added
  - items: item property `usedSor` added
  - items: item property `workingFloor` added
  - items: item property `pegOffsetType` added
  - items: item property `preventedMatchId` added
  - items: item property `peggedPrice` added
  - items: item property `trailingDelta` added
  - items: item property `pegPriceType` added
  - items: item property `preventedQuantity` added
  - items: item property `strategyType` added
  - items: item property `expiryReason` added
  - items: item property `pegOffsetValue` added

- Modified response for `deleteOrder()` (`DELETE /api/v3/order`):
  - property `pegOffsetType` added
  - property `strategyId` added
  - property `stopPrice` added
  - property `workingFloor` added
  - property `preventedQuantity` added
  - property `pegOffsetValue` added
  - property `preventedMatchId` added
  - property `strategyType` added
  - property `pegPriceType` added
  - property `peggedPrice` added
  - property `trailingTime` added
  - property `usedSor` added
  - property `icebergQty` added
  - property `trailingDelta` added
  - property `expiryReason` added

- Modified response for `getOrder()` (`GET /api/v3/order`):
  - property `preventedMatchId` added
  - property `workingFloor` added
  - property `preventedQuantity` added
  - property `trailingDelta` added
  - property `trailingTime` added
  - property `usedSor` added
  - property `strategyType` added
  - property `expiryReason` added
  - property `peggedPrice` added
  - property `pegOffsetType` added
  - property `pegOffsetValue` added
  - property `pegPriceType` added
  - property `strategyId` added

- Modified response for `orderAmendKeepPriority()` (`PUT /api/v3/order/amend/keepPriority`):
  - `amendedOrder`: property `expiryReason` added
  - `amendedOrder`: property `peggedPrice` added
  - `amendedOrder`: property `trailingDelta` added
  - `amendedOrder`: property `pegOffsetValue` added
  - `amendedOrder`: property `pegPriceType` added
  - `amendedOrder`: property `strategyType` added
  - `amendedOrder`: property `strategyId` added
  - `amendedOrder`: property `workingFloor` added
  - `amendedOrder`: property `trailingTime` added
  - `amendedOrder`: property `pegOffsetType` added
  - `amendedOrder`: property `preventedQuantity` added
  - `amendedOrder`: property `stopPrice` added
  - `amendedOrder`: property `icebergQty` added
  - `amendedOrder`: property `usedSor` added
  - `amendedOrder`: property `preventedMatchId` added

- Modified response for `orderCancelReplace()` (`POST /api/v3/order/cancelReplace`):
  - property `code` deleted
  - property `data` deleted
  - property `msg` deleted
  - `cancelResponse`: property `pegOffsetValue` added
  - `cancelResponse`: property `pegPriceType` added
  - `cancelResponse`: property `workingFloor` added
  - `cancelResponse`: property `trailingTime` added
  - `cancelResponse`: property `preventedMatchId` added
  - `cancelResponse`: property `trailingDelta` added
  - `cancelResponse`: property `peggedPrice` added
  - `cancelResponse`: property `preventedQuantity` added
  - `cancelResponse`: property `usedSor` added
  - `cancelResponse`: property `strategyId` added
  - `cancelResponse`: property `stopPrice` added
  - `cancelResponse`: property `strategyType` added
  - `cancelResponse`: property `icebergQty` added
  - `cancelResponse`: property `expiryReason` added
  - `cancelResponse`: property `pegOffsetType` added
  - `newOrderResponse`: property `usedSor` added
  - `newOrderResponse`: property `pegOffsetType` added
  - `newOrderResponse`: property `workingFloor` added
  - `newOrderResponse`: property `preventedQuantity` added
  - `newOrderResponse`: property `trailingDelta` added
  - `newOrderResponse`: property `pegPriceType` added
  - `newOrderResponse`: property `strategyId` added
  - `newOrderResponse`: property `trailingTime` added
  - `newOrderResponse`: property `preventedMatchId` added
  - `newOrderResponse`: property `expiryReason` added
  - `newOrderResponse`: property `icebergQty` added
  - `newOrderResponse`: property `peggedPrice` added
  - `newOrderResponse`: property `strategyType` added
  - `newOrderResponse`: property `pegOffsetValue` added
  - `newOrderResponse`: property `stopPrice` added
  - `newOrderResponse`.`fills`.items: type `string` → `object`
  - `newOrderResponse`.`fills`.items: property `tradeId` added
  - `newOrderResponse`.`fills`.items: property `commission` added
  - `newOrderResponse`.`fills`.items: property `commissionAsset` added
  - `newOrderResponse`.`fills`.items: property `price` added
  - `newOrderResponse`.`fills`.items: property `qty` added
  - `newOrderResponse`.`fills`.items: item property `tradeId` added
  - `newOrderResponse`.`fills`.items: item property `commission` added
  - `newOrderResponse`.`fills`.items: item property `commissionAsset` added
  - `newOrderResponse`.`fills`.items: item property `price` added
  - `newOrderResponse`.`fills`.items: item property `qty` added

- Modified response for `deleteOrderList()` (`DELETE /api/v3/orderList`):
  - `orderReports`.items: property `icebergQty` added
  - `orderReports`.items: property `trailingDelta` added
  - `orderReports`.items: property `workingFloor` added
  - `orderReports`.items: property `pegPriceType` added
  - `orderReports`.items: property `preventedQuantity` added
  - `orderReports`.items: property `strategyId` added
  - `orderReports`.items: property `trailingTime` added
  - `orderReports`.items: property `pegOffsetType` added
  - `orderReports`.items: property `peggedPrice` added
  - `orderReports`.items: property `preventedMatchId` added
  - `orderReports`.items: property `strategyType` added
  - `orderReports`.items: property `pegOffsetValue` added
  - `orderReports`.items: property `expiryReason` added
  - `orderReports`.items: property `usedSor` added
  - `orderReports`.items: property `selfTradePreventionMode` deleted
  - `orderReports`.items: item property `icebergQty` added
  - `orderReports`.items: item property `trailingDelta` added
  - `orderReports`.items: item property `workingFloor` added
  - `orderReports`.items: item property `pegPriceType` added
  - `orderReports`.items: item property `preventedQuantity` added
  - `orderReports`.items: item property `strategyId` added
  - `orderReports`.items: item property `trailingTime` added
  - `orderReports`.items: item property `pegOffsetType` added
  - `orderReports`.items: item property `peggedPrice` added
  - `orderReports`.items: item property `preventedMatchId` added
  - `orderReports`.items: item property `strategyType` added
  - `orderReports`.items: item property `pegOffsetValue` added
  - `orderReports`.items: item property `expiryReason` added
  - `orderReports`.items: item property `usedSor` added
  - `orderReports`.items: item property `selfTradePreventionMode` deleted

- Modified response for `orderListOpo()` (`POST /api/v3/orderList/opo`):
  - `orderReports`.items: property `workingFloor` added
  - `orderReports`.items: property `trailingTime` added
  - `orderReports`.items: property `pegOffsetValue` added
  - `orderReports`.items: property `preventedMatchId` added
  - `orderReports`.items: property `trailingDelta` added
  - `orderReports`.items: property `pegPriceType` added
  - `orderReports`.items: property `preventedQuantity` added
  - `orderReports`.items: property `strategyId` added
  - `orderReports`.items: property `strategyType` added
  - `orderReports`.items: property `pegOffsetType` added
  - `orderReports`.items: property `icebergQty` added
  - `orderReports`.items: property `expiryReason` added
  - `orderReports`.items: property `peggedPrice` added
  - `orderReports`.items: property `usedSor` added
  - `orderReports`.items: property `stopPrice` added
  - `orderReports`.items: item property `workingFloor` added
  - `orderReports`.items: item property `trailingTime` added
  - `orderReports`.items: item property `pegOffsetValue` added
  - `orderReports`.items: item property `preventedMatchId` added
  - `orderReports`.items: item property `trailingDelta` added
  - `orderReports`.items: item property `pegPriceType` added
  - `orderReports`.items: item property `preventedQuantity` added
  - `orderReports`.items: item property `strategyId` added
  - `orderReports`.items: item property `strategyType` added
  - `orderReports`.items: item property `pegOffsetType` added
  - `orderReports`.items: item property `icebergQty` added
  - `orderReports`.items: item property `expiryReason` added
  - `orderReports`.items: item property `peggedPrice` added
  - `orderReports`.items: item property `usedSor` added
  - `orderReports`.items: item property `stopPrice` added

- Modified response for `orderListOpoco()` (`POST /api/v3/orderList/opoco`):
  - `orderReports`.items: property `preventedMatchId` added
  - `orderReports`.items: property `expiryReason` added
  - `orderReports`.items: property `icebergQty` added
  - `orderReports`.items: property `peggedPrice` added
  - `orderReports`.items: property `usedSor` added
  - `orderReports`.items: property `pegOffsetValue` added
  - `orderReports`.items: property `trailingDelta` added
  - `orderReports`.items: property `pegPriceType` added
  - `orderReports`.items: property `pegOffsetType` added
  - `orderReports`.items: property `workingFloor` added
  - `orderReports`.items: property `strategyId` added
  - `orderReports`.items: property `preventedQuantity` added
  - `orderReports`.items: property `trailingTime` added
  - `orderReports`.items: property `strategyType` added
  - `orderReports`.items: item property `preventedMatchId` added
  - `orderReports`.items: item property `expiryReason` added
  - `orderReports`.items: item property `icebergQty` added
  - `orderReports`.items: item property `peggedPrice` added
  - `orderReports`.items: item property `usedSor` added
  - `orderReports`.items: item property `pegOffsetValue` added
  - `orderReports`.items: item property `trailingDelta` added
  - `orderReports`.items: item property `pegPriceType` added
  - `orderReports`.items: item property `pegOffsetType` added
  - `orderReports`.items: item property `workingFloor` added
  - `orderReports`.items: item property `strategyId` added
  - `orderReports`.items: item property `preventedQuantity` added
  - `orderReports`.items: item property `trailingTime` added
  - `orderReports`.items: item property `strategyType` added

- Modified response for `orderListOto()` (`POST /api/v3/orderList/oto`):
  - `orderReports`.items: property `workingFloor` added
  - `orderReports`.items: property `pegOffsetType` added
  - `orderReports`.items: property `icebergQty` added
  - `orderReports`.items: property `pegOffsetValue` added
  - `orderReports`.items: property `trailingDelta` added
  - `orderReports`.items: property `pegPriceType` added
  - `orderReports`.items: property `stopPrice` added
  - `orderReports`.items: property `peggedPrice` added
  - `orderReports`.items: property `expiryReason` added
  - `orderReports`.items: property `strategyType` added
  - `orderReports`.items: property `preventedQuantity` added
  - `orderReports`.items: property `trailingTime` added
  - `orderReports`.items: property `strategyId` added
  - `orderReports`.items: property `usedSor` added
  - `orderReports`.items: property `preventedMatchId` added
  - `orderReports`.items: item property `workingFloor` added
  - `orderReports`.items: item property `pegOffsetType` added
  - `orderReports`.items: item property `icebergQty` added
  - `orderReports`.items: item property `pegOffsetValue` added
  - `orderReports`.items: item property `trailingDelta` added
  - `orderReports`.items: item property `pegPriceType` added
  - `orderReports`.items: item property `stopPrice` added
  - `orderReports`.items: item property `peggedPrice` added
  - `orderReports`.items: item property `expiryReason` added
  - `orderReports`.items: item property `strategyType` added
  - `orderReports`.items: item property `preventedQuantity` added
  - `orderReports`.items: item property `trailingTime` added
  - `orderReports`.items: item property `strategyId` added
  - `orderReports`.items: item property `usedSor` added
  - `orderReports`.items: item property `preventedMatchId` added

- Modified response for `orderListOtoco()` (`POST /api/v3/orderList/otoco`):
  - `orderReports`.items: property `icebergQty` added
  - `orderReports`.items: property `preventedMatchId` added
  - `orderReports`.items: property `strategyId` added
  - `orderReports`.items: property `strategyType` added
  - `orderReports`.items: property `trailingTime` added
  - `orderReports`.items: property `pegPriceType` added
  - `orderReports`.items: property `workingFloor` added
  - `orderReports`.items: property `peggedPrice` added
  - `orderReports`.items: property `preventedQuantity` added
  - `orderReports`.items: property `usedSor` added
  - `orderReports`.items: property `pegOffsetType` added
  - `orderReports`.items: property `pegOffsetValue` added
  - `orderReports`.items: property `trailingDelta` added
  - `orderReports`.items: property `expiryReason` added
  - `orderReports`.items: item property `icebergQty` added
  - `orderReports`.items: item property `preventedMatchId` added
  - `orderReports`.items: item property `strategyId` added
  - `orderReports`.items: item property `strategyType` added
  - `orderReports`.items: item property `trailingTime` added
  - `orderReports`.items: item property `pegPriceType` added
  - `orderReports`.items: item property `workingFloor` added
  - `orderReports`.items: item property `peggedPrice` added
  - `orderReports`.items: item property `preventedQuantity` added
  - `orderReports`.items: item property `usedSor` added
  - `orderReports`.items: item property `pegOffsetType` added
  - `orderReports`.items: item property `pegOffsetValue` added
  - `orderReports`.items: item property `trailingDelta` added
  - `orderReports`.items: item property `expiryReason` added

- Modified response for `ticker()` (`GET /api/v3/ticker`):
  - oneOf modified

- Modified response for `ticker24hr()` (`GET /api/v3/ticker/24hr`):
  - oneOf modified

- Modified response for `tickerBookTicker()` (`GET /api/v3/ticker/bookTicker`):
  - oneOf modified

- Modified response for `tickerPrice()` (`GET /api/v3/ticker/price`):
  - oneOf modified

- Modified response for `tickerTradingDay()` (`GET /api/v3/ticker/tradingDay`):
  - oneOf modified

- Modified response for `uiKlines()` (`GET /api/v3/uiKlines`):
  - items.items: oneOf added 2 schema(s)
  - items.items: oneOf removed 2 schema(s)

- Marked `orderOco()` (`POST /api/v3/order/oco`) as deprecated.

#### WebSocket API

- Modified parameter `cancelRestrictions`:
  - enum removed: `NEW`, `PARTIALLY_FILLED`
  - affected methods:
    - `orderCancel()` (`order.cancel` method)
    - `orderCancelReplace()` (`order.cancelReplace` method)
- Modified parameter `newOrderRespType`:
  - enum removed: `MARKET`, `LIMIT`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
    - `orderListPlace()` (`orderList.place` method)
    - `orderListPlaceOco()` (`orderList.place.oco` method)
    - `orderListPlaceOpo()` (`orderList.place.opo` method)
    - `orderListPlaceOpoco()` (`orderList.place.opoco` method)
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
    - `sorOrderPlace()` (`sor.order.place` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `pegOffsetType`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Modified parameter `pegPriceType`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Modified parameter `selfTradePreventionMode`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
    - `orderListPlace()` (`orderList.place` method)
    - `orderListPlaceOco()` (`orderList.place.oco` method)
    - `orderListPlaceOpo()` (`orderList.place.opo` method)
    - `orderListPlaceOpoco()` (`orderList.place.opoco` method)
    - `orderListPlaceOto()` (`orderList.place.oto` method)
    - `orderListPlaceOtoco()` (`orderList.place.otoco` method)
    - `sorOrderPlace()` (`sor.order.place` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `symbolStatus`:
  - enum removed: `END_OF_DAY`, `NON_REPRESENTABLE`
  - affected methods:
    - `depth()` (`depth` method)
    - `exchangeInfo()` (`exchangeInfo` method)
    - `executionRules()` (`executionRules` method)
    - `ticker()` (`ticker` method)
    - `ticker24hr()` (`ticker.24hr` method)
    - `tickerBook()` (`ticker.book` method)
    - `tickerPrice()` (`ticker.price` method)
    - `tickerTradingDay()` (`ticker.tradingDay` method)
- Modified parameter `symbolStatus`:
  - enum removed: `END_OF_DAY`, `NON_REPRESENTABLE`
  - affected methods:
    - `referencePriceCalculation()` (`referencePrice.calculation` method)
- Modified parameter `timeInForce`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
    - `sorOrderPlace()` (`sor.order.place` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `type`:
  - enum removed: `NON_REPRESENTABLE`
  - affected methods:
    - `orderCancelReplace()` (`order.cancelReplace` method)
    - `orderPlace()` (`order.place` method)
    - `orderTest()` (`order.test` method)
- Modified parameter `type`:
  - enum removed: `STOP_LOSS`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT`, `TAKE_PROFIT_LIMIT`, `LIMIT_MAKER`, `NON_REPRESENTABLE`
  - affected methods:
    - `sorOrderPlace()` (`sor.order.place` method)
    - `sorOrderTest()` (`sor.order.test` method)
- Modified parameter `windowSize`:
  - enum added: `7d`
  - affected methods:
    - `ticker()` (`ticker` method)
- Modified response for `allOrders()` (`allOrders` method):
  - `result`.items: property `pegOffsetType` added
  - `result`.items: property `pegPriceType` added
  - `result`.items: property `trailingTime` added
  - `result`.items: property `expiryReason` added
  - `result`.items: property `strategyType` added
  - `result`.items: property `strategyId` added
  - `result`.items: property `workingFloor` added
  - `result`.items: property `pegOffsetValue` added
  - `result`.items: property `peggedPrice` added
  - `result`.items: property `trailingDelta` added
  - `result`.items: property `usedSor` added
  - `result`.items: item property `pegOffsetType` added
  - `result`.items: item property `pegPriceType` added
  - `result`.items: item property `trailingTime` added
  - `result`.items: item property `expiryReason` added
  - `result`.items: item property `strategyType` added
  - `result`.items: item property `strategyId` added
  - `result`.items: item property `workingFloor` added
  - `result`.items: item property `pegOffsetValue` added
  - `result`.items: item property `peggedPrice` added
  - `result`.items: item property `trailingDelta` added
  - `result`.items: item property `usedSor` added

- Modified response for `depth()` (`depth` method):
  - `result`.`asks`.items: minItems `0` → `2`
  - `result`.`asks`.items: maxItems `null` → `2`
  - `result`.`bids`.items: minItems `0` → `2`
  - `result`.`bids`.items: maxItems `null` → `2`

- Modified response for `exchangeInfo()` (`exchangeInfo` method):
  - property `sors` added
  - property `symbols` added
  - property `timezone` added
  - property `exchangeFilters` added
  - property `serverTime` added
  - property `status` deleted
  - property `id` deleted
  - property `result` deleted

- Modified response for `klines()` (`klines` method):
  - `result`.items: minItems `0` → `12`
  - `result`.items: maxItems `null` → `12`
  - `result`.items.items: oneOf added 2 schema(s)
  - `result`.items.items: oneOf removed 2 schema(s)

- Modified response for `myFilters()` (`myFilters` method):
  - property `assetFilters` added
  - property `exchangeFilters` added
  - property `symbolFilters` added
  - property `id` deleted
  - property `result` deleted
  - property `status` deleted

- Modified response for `openOrdersCancelAll()` (`openOrders.cancelAll` method):
  - `result`.items: property `workingFloor` added
  - `result`.items: property `preventedMatchId` added
  - `result`.items: property `preventedQuantity` added
  - `result`.items: property `usedSor` added
  - `result`.items: property `pegPriceType` added
  - `result`.items: property `peggedPrice` added
  - `result`.items: property `expiryReason` added
  - `result`.items: property `pegOffsetValue` added
  - `result`.items: property `pegOffsetType` added
  - `result`.items.`orderReports`.items: property `icebergQty` added
  - `result`.items.`orderReports`.items: property `pegOffsetValue` added
  - `result`.items.`orderReports`.items: property `pegPriceType` added
  - `result`.items.`orderReports`.items: property `workingFloor` added
  - `result`.items.`orderReports`.items: property `preventedMatchId` added
  - `result`.items.`orderReports`.items: property `trailingDelta` added
  - `result`.items.`orderReports`.items: property `expiryReason` added
  - `result`.items.`orderReports`.items: property `pegOffsetType` added
  - `result`.items.`orderReports`.items: property `peggedPrice` added
  - `result`.items.`orderReports`.items: property `preventedQuantity` added
  - `result`.items.`orderReports`.items: property `strategyId` added
  - `result`.items.`orderReports`.items: property `strategyType` added
  - `result`.items.`orderReports`.items: property `trailingTime` added
  - `result`.items.`orderReports`.items: property `usedSor` added
  - `result`.items.`orderReports`.items: item property `icebergQty` added
  - `result`.items.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.items.`orderReports`.items: item property `pegPriceType` added
  - `result`.items.`orderReports`.items: item property `workingFloor` added
  - `result`.items.`orderReports`.items: item property `preventedMatchId` added
  - `result`.items.`orderReports`.items: item property `trailingDelta` added
  - `result`.items.`orderReports`.items: item property `expiryReason` added
  - `result`.items.`orderReports`.items: item property `pegOffsetType` added
  - `result`.items.`orderReports`.items: item property `peggedPrice` added
  - `result`.items.`orderReports`.items: item property `preventedQuantity` added
  - `result`.items.`orderReports`.items: item property `strategyId` added
  - `result`.items.`orderReports`.items: item property `strategyType` added
  - `result`.items.`orderReports`.items: item property `trailingTime` added
  - `result`.items.`orderReports`.items: item property `usedSor` added
  - `result`.items: item property `workingFloor` added
  - `result`.items: item property `preventedMatchId` added
  - `result`.items: item property `preventedQuantity` added
  - `result`.items: item property `usedSor` added
  - `result`.items: item property `pegPriceType` added
  - `result`.items: item property `peggedPrice` added
  - `result`.items: item property `expiryReason` added
  - `result`.items: item property `pegOffsetValue` added
  - `result`.items: item property `pegOffsetType` added
  - `result`.items.`orderReports`.items: property `icebergQty` added
  - `result`.items.`orderReports`.items: property `pegOffsetValue` added
  - `result`.items.`orderReports`.items: property `pegPriceType` added
  - `result`.items.`orderReports`.items: property `workingFloor` added
  - `result`.items.`orderReports`.items: property `preventedMatchId` added
  - `result`.items.`orderReports`.items: property `trailingDelta` added
  - `result`.items.`orderReports`.items: property `expiryReason` added
  - `result`.items.`orderReports`.items: property `pegOffsetType` added
  - `result`.items.`orderReports`.items: property `peggedPrice` added
  - `result`.items.`orderReports`.items: property `preventedQuantity` added
  - `result`.items.`orderReports`.items: property `strategyId` added
  - `result`.items.`orderReports`.items: property `strategyType` added
  - `result`.items.`orderReports`.items: property `trailingTime` added
  - `result`.items.`orderReports`.items: property `usedSor` added
  - `result`.items.`orderReports`.items: item property `icebergQty` added
  - `result`.items.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.items.`orderReports`.items: item property `pegPriceType` added
  - `result`.items.`orderReports`.items: item property `workingFloor` added
  - `result`.items.`orderReports`.items: item property `preventedMatchId` added
  - `result`.items.`orderReports`.items: item property `trailingDelta` added
  - `result`.items.`orderReports`.items: item property `expiryReason` added
  - `result`.items.`orderReports`.items: item property `pegOffsetType` added
  - `result`.items.`orderReports`.items: item property `peggedPrice` added
  - `result`.items.`orderReports`.items: item property `preventedQuantity` added
  - `result`.items.`orderReports`.items: item property `strategyId` added
  - `result`.items.`orderReports`.items: item property `strategyType` added
  - `result`.items.`orderReports`.items: item property `trailingTime` added
  - `result`.items.`orderReports`.items: item property `usedSor` added

- Modified response for `openOrdersStatus()` (`openOrders.status` method):
  - `result`.items: property `strategyId` added
  - `result`.items: property `usedSor` added
  - `result`.items: property `strategyType` added
  - `result`.items: property `pegOffsetType` added
  - `result`.items: property `preventedMatchId` added
  - `result`.items: property `trailingDelta` added
  - `result`.items: property `preventedQuantity` added
  - `result`.items: property `trailingTime` added
  - `result`.items: property `pegPriceType` added
  - `result`.items: property `expiryReason` added
  - `result`.items: property `peggedPrice` added
  - `result`.items: property `workingFloor` added
  - `result`.items: property `pegOffsetValue` added
  - `result`.items: item property `strategyId` added
  - `result`.items: item property `usedSor` added
  - `result`.items: item property `strategyType` added
  - `result`.items: item property `pegOffsetType` added
  - `result`.items: item property `preventedMatchId` added
  - `result`.items: item property `trailingDelta` added
  - `result`.items: item property `preventedQuantity` added
  - `result`.items: item property `trailingTime` added
  - `result`.items: item property `pegPriceType` added
  - `result`.items: item property `expiryReason` added
  - `result`.items: item property `peggedPrice` added
  - `result`.items: item property `workingFloor` added
  - `result`.items: item property `pegOffsetValue` added

- Modified response for `orderAmendKeepPriority()` (`order.amend.keepPriority` method):
  - `result`.`amendedOrder`: property `trailingTime` added
  - `result`.`amendedOrder`: property `peggedPrice` added
  - `result`.`amendedOrder`: property `stopPrice` added
  - `result`.`amendedOrder`: property `usedSor` added
  - `result`.`amendedOrder`: property `preventedQuantity` added
  - `result`.`amendedOrder`: property `trailingDelta` added
  - `result`.`amendedOrder`: property `preventedMatchId` added
  - `result`.`amendedOrder`: property `strategyType` added
  - `result`.`amendedOrder`: property `workingFloor` added
  - `result`.`amendedOrder`: property `expiryReason` added
  - `result`.`amendedOrder`: property `pegPriceType` added
  - `result`.`amendedOrder`: property `strategyId` added
  - `result`.`amendedOrder`: property `pegOffsetType` added
  - `result`.`amendedOrder`: property `icebergQty` added
  - `result`.`amendedOrder`: property `pegOffsetValue` added

- Modified response for `orderCancel()` (`order.cancel` method):
  - `result`: property `workingFloor` added
  - `result`: property `usedSor` added
  - `result`: property `trailingTime` added
  - `result`: property `pegOffsetType` added
  - `result`: property `pegPriceType` added
  - `result`: property `peggedPrice` added
  - `result`: property `expiryReason` added
  - `result`: property `preventedMatchId` added
  - `result`: property `pegOffsetValue` added
  - `result`: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `usedSor` added

- Modified response for `orderCancelReplace()` (`order.cancelReplace` method):
  - `result`.`cancelResponse`: property `pegPriceType` added
  - `result`.`cancelResponse`: property `stopPrice` added
  - `result`.`cancelResponse`: property `strategyType` added
  - `result`.`cancelResponse`: property `workingFloor` added
  - `result`.`cancelResponse`: property `expiryReason` added
  - `result`.`cancelResponse`: property `pegOffsetType` added
  - `result`.`cancelResponse`: property `peggedPrice` added
  - `result`.`cancelResponse`: property `preventedMatchId` added
  - `result`.`cancelResponse`: property `pegOffsetValue` added
  - `result`.`cancelResponse`: property `trailingTime` added
  - `result`.`cancelResponse`: property `usedSor` added
  - `result`.`cancelResponse`: property `strategyId` added
  - `result`.`cancelResponse`: property `trailingDelta` added
  - `result`.`cancelResponse`: property `icebergQty` added
  - `result`.`cancelResponse`: property `preventedQuantity` added
  - `result`.`newOrderResponse`: property `icebergQty` added
  - `result`.`newOrderResponse`: property `peggedPrice` added
  - `result`.`newOrderResponse`: property `trailingTime` added
  - `result`.`newOrderResponse`: property `pegOffsetType` added
  - `result`.`newOrderResponse`: property `strategyType` added
  - `result`.`newOrderResponse`: property `pegPriceType` added
  - `result`.`newOrderResponse`: property `usedSor` added
  - `result`.`newOrderResponse`: property `preventedMatchId` added
  - `result`.`newOrderResponse`: property `preventedQuantity` added
  - `result`.`newOrderResponse`: property `pegOffsetValue` added
  - `result`.`newOrderResponse`: property `strategyId` added
  - `result`.`newOrderResponse`: property `stopPrice` added
  - `result`.`newOrderResponse`: property `trailingDelta` added
  - `result`.`newOrderResponse`: property `expiryReason` added
  - `result`.`newOrderResponse`: property `workingFloor` added

- Modified response for `orderPlace()` (`order.place` method):
  - `result`: property `pegOffsetValue` added
  - `result`: property `strategyId` added
  - `result`: property `trailingDelta` added
  - `result`: property `stopPrice` added
  - `result`: property `pegOffsetType` added
  - `result`: property `pegPriceType` added
  - `result`: property `trailingTime` added
  - `result`: property `preventedMatchId` added
  - `result`: property `strategyType` added
  - `result`: property `workingFloor` added
  - `result`: property `usedSor` added
  - `result`: property `expiryReason` added
  - `result`: property `icebergQty` added
  - `result`: property `preventedQuantity` added
  - `result`: property `peggedPrice` added

- Modified response for `orderStatus()` (`order.status` method):
  - `result`: property `peggedPrice` added
  - `result`: property `pegOffsetType` added
  - `result`: property `pegOffsetValue` added
  - `result`: property `expiryReason` added
  - `result`: property `usedSor` added
  - `result`: property `pegPriceType` added
  - `result`: property `workingFloor` added

- Modified response for `orderListCancel()` (`orderList.cancel` method):
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added

- Modified response for `orderListPlace()` (`orderList.place` method):
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `workingFloor` added

- Modified response for `orderListPlaceOco()` (`orderList.place.oco` method):
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `expiryReason` added

- Modified response for `orderListPlaceOpo()` (`orderList.place.opo` method):
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `stopPrice` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `stopPrice` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `trailingDelta` added

- Modified response for `orderListPlaceOpoco()` (`orderList.place.opoco` method):
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added

- Modified response for `orderListPlaceOto()` (`orderList.place.oto` method):
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `stopPrice` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `stopPrice` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `trailingTime` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `expiryReason` added

- Modified response for `orderListPlaceOtoco()` (`orderList.place.otoco` method):
  - `result`.`orderReports`.items: property `pegOffsetType` added
  - `result`.`orderReports`.items: property `workingFloor` added
  - `result`.`orderReports`.items: property `icebergQty` added
  - `result`.`orderReports`.items: property `strategyId` added
  - `result`.`orderReports`.items: property `pegPriceType` added
  - `result`.`orderReports`.items: property `expiryReason` added
  - `result`.`orderReports`.items: property `pegOffsetValue` added
  - `result`.`orderReports`.items: property `peggedPrice` added
  - `result`.`orderReports`.items: property `strategyType` added
  - `result`.`orderReports`.items: property `trailingDelta` added
  - `result`.`orderReports`.items: property `usedSor` added
  - `result`.`orderReports`.items: property `preventedQuantity` added
  - `result`.`orderReports`.items: property `preventedMatchId` added
  - `result`.`orderReports`.items: property `trailingTime` added
  - `result`.`orderReports`.items: item property `pegOffsetType` added
  - `result`.`orderReports`.items: item property `workingFloor` added
  - `result`.`orderReports`.items: item property `icebergQty` added
  - `result`.`orderReports`.items: item property `strategyId` added
  - `result`.`orderReports`.items: item property `pegPriceType` added
  - `result`.`orderReports`.items: item property `expiryReason` added
  - `result`.`orderReports`.items: item property `pegOffsetValue` added
  - `result`.`orderReports`.items: item property `peggedPrice` added
  - `result`.`orderReports`.items: item property `strategyType` added
  - `result`.`orderReports`.items: item property `trailingDelta` added
  - `result`.`orderReports`.items: item property `usedSor` added
  - `result`.`orderReports`.items: item property `preventedQuantity` added
  - `result`.`orderReports`.items: item property `preventedMatchId` added
  - `result`.`orderReports`.items: item property `trailingTime` added

- Modified response for `referencePrice()` (`referencePrice` method):
  - property `rateLimits` added

- Modified response for `referencePriceCalculation()` (`referencePrice.calculation` method):
  - property `rateLimits` added

- Modified response for `sorOrderPlace()` (`sor.order.place` method):
  - `result`.items: property `preventedQuantity` added
  - `result`.items: property `strategyId` added
  - `result`.items: property `pegOffsetValue` added
  - `result`.items: property `peggedPrice` added
  - `result`.items: property `icebergQty` added
  - `result`.items: property `pegPriceType` added
  - `result`.items: property `trailingTime` added
  - `result`.items: property `trailingDelta` added
  - `result`.items: property `expiryReason` added
  - `result`.items: property `preventedMatchId` added
  - `result`.items: property `pegOffsetType` added
  - `result`.items: property `stopPrice` added
  - `result`.items: property `strategyType` added
  - `result`.items: item property `preventedQuantity` added
  - `result`.items: item property `strategyId` added
  - `result`.items: item property `pegOffsetValue` added
  - `result`.items: item property `peggedPrice` added
  - `result`.items: item property `icebergQty` added
  - `result`.items: item property `pegPriceType` added
  - `result`.items: item property `trailingTime` added
  - `result`.items: item property `trailingDelta` added
  - `result`.items: item property `expiryReason` added
  - `result`.items: item property `preventedMatchId` added
  - `result`.items: item property `pegOffsetType` added
  - `result`.items: item property `stopPrice` added
  - `result`.items: item property `strategyType` added

- Modified response for `ticker()` (`ticker` method):
  - oneOf modified

- Modified response for `ticker24hr()` (`ticker.24hr` method):
  - oneOf modified

- Modified response for `tickerBook()` (`ticker.book` method):
  - oneOf modified

- Modified response for `tickerPrice()` (`ticker.price` method):
  - oneOf modified

- Modified response for `uiKlines()` (`uiKlines` method):
  - `result`.items: minItems `0` → `12`
  - `result`.items: maxItems `null` → `12`
  - `result`.items.items: oneOf added 2 schema(s)
  - `result`.items.items: oneOf removed 2 schema(s)

- Marked `orderListPlace()` (`orderList.place` method) as deprecated.

#### WebSocket Streams

- Modified parameter `updateSpeed`:
  - enum added: `100ms`
  - affected methods:
    - `partialBookDepth()` (`<symbol>@depth<levels>@<updateSpeed>` stream)
    - `diffBookDepth()` (`<symbol>@depth@<updateSpeed>` stream)
- Modified response for `partialBookDepth()` (`<symbol>@depth<levels>@<updateSpeed>` stream):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `diffBookDepth()` (`<symbol>@depth@<updateSpeed>` stream):
  - `a`.items: minItems `0` → `2`
  - `a`.items: maxItems `null` → `2`
  - `b`.items: minItems `0` → `2`
  - `b`.items: maxItems `null` → `2`

## 10.1.1 - 2026-05-04

- Added stop method for WebSocket

### Changed (1)

#### WebSocket API

- Modified response for `referencePrice()` (`referencePrice` method):
  - `result`: property `code` added
  - `result`: property `msg` added

## 10.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 10.0.0 - 2026-03-18

### Added (7)

#### REST API

- `executionRules()` (`GET /api/v3/executionRules`)
- `referencePrice()` (`GET /api/v3/referencePrice`)
- `referencePriceCalculation()` (`GET /api/v3/referencePrice/calculation`)

#### WebSocket API

- `executionRules()` (`executionRules` method)
- `referencePrice()` (`referencePrice` method)
- `referencePriceCalculation()` (`referencePrice.calculation` method)

#### WebSocket Streams

- `referencePrice()` (`<symbol>@referencePrice` stream)

## 9.0.0 - 2026-02-12

### Added (1)

#### WebSocket API

- `orderAmendKeepPriority()` (`order.amend.keepPriority` method)

### Changed (1)

#### WebSocket API

- Added parameter `recvWindow`
  - affected methods:
    - `userDataStreamSubscribeSignature()` (`userDataStream.subscribe.signature` method)

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
