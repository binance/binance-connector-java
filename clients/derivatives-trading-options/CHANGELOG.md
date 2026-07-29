# Changelog

## 9.0.0 - 2026-07-29

### Added (3)

#### REST API

- `tradfiOptionsContract()` (`POST /eapi/v1/stock/contract`)

#### WebSocket Streams

- `hour24Ticker()` (`<symbol>@optionTicker<expirationDate>` stream)
- `openInterest()` (`<underlying>@openInterest@<expirationDate>` stream)

### Changed (21)

#### REST API

- Modified parameter `currency`:
  - enum added: `USDT`
  - affected methods:
    - `accountFundingFlow()` (`GET /eapi/v1/bill`)
- Modified parameter `deltaLimit`:
  - required: `false` → `true`
  - affected methods:
    - `setMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpSet`)
- Modified parameter `frozenTimeInMilliseconds`:
  - required: `false` → `true`
  - affected methods:
    - `setMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpSet`)
- Modified parameter `interval`:
  - enum added: `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `8h`, `12h`, `1d`, `3d`, `1w`, `1M`
  - affected methods:
    - `klineCandlestickData()` (`GET /eapi/v1/klines`)
- Modified parameter `legs`:
  - items: required added: `quantity`, `symbol`, `side`, `type`
  - items: property `quantity` added
  - items: property `side` added
  - items: property `symbol` added
  - items: property `type` added
  - items: property `price` added
  - items: item property `quantity` added
  - items: item property `side` added
  - items: item property `symbol` added
  - items: item property `type` added
  - items: item property `price` added
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Modified parameter `liquidity`:
  - enum added: `MAKER`, `TAKER`
  - affected methods:
    - `newBlockTradeOrder()` (`POST /eapi/v1/block/order/create`)
- Modified parameter `orders`:
  - items: required added: `symbol`, `side`, `type`, `quantity`
  - items.`isMmp`: type `string` → `boolean`
  - items.`postOnly`: type `string` → `boolean`
  - items.`price`: type `string` → `number`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: type `string` → `boolean`
  - items.`isMmp`: type `string` → `boolean`
  - items.`postOnly`: type `string` → `boolean`
  - items.`price`: type `string` → `number`
  - items.`quantity`: type `string` → `number`
  - items.`reduceOnly`: type `string` → `boolean`
  - affected methods:
    - `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`)
- Modified parameter `qtyLimit`:
  - required: `false` → `true`
  - affected methods:
    - `setMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpSet`)
- Modified parameter `selfTradePreventionMode`:
  - enum added: `NONE`
  - affected methods:
    - `newOrder()` (`POST /eapi/v1/order`)
- Modified parameter `symbol`:
  - required: `false` → `true`
  - affected methods:
    - `accountTradeList()` (`GET /eapi/v1/userTrades`)
- Modified parameter `underlying`:
  - required: `false` → `true`
  - affected methods:
    - `getMarketMakerProtectionConfig()` (`GET /eapi/v1/mmp`)
    - `resetMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpReset`)
    - `setMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpSet`)
- Modified parameter `windowTimeInMilliseconds`:
  - required: `false` → `true`
  - affected methods:
    - `setMarketMakerProtectionConfig()` (`POST /eapi/v1/mmpSet`)
- Modified response for `cancelMultipleOptionOrders()` (`DELETE /eapi/v1/batchOrders`):
  - items: property `fee` added
  - items: item property `fee` added

- Modified response for `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`):
  - items: property `postOnly` added
  - items: property `fee` added
  - items: item property `postOnly` added
  - items: item property `fee` added

- Modified response for `orderBook()` (`GET /eapi/v1/depth`):
  - `asks`.items: minItems `0` → `2`
  - `asks`.items: maxItems `null` → `2`
  - `bids`.items: minItems `0` → `2`
  - `bids`.items: maxItems `null` → `2`

- Modified response for `exchangeInformation()` (`GET /eapi/v1/exchangeInfo`):
  - `optionSymbols`.items: property `contractType` added
  - `optionSymbols`.items: property `nakedSell` added
  - `optionSymbols`.items: property `underlyingType` added
  - `optionSymbols`.items: item property `contractType` added
  - `optionSymbols`.items: item property `nakedSell` added
  - `optionSymbols`.items: item property `underlyingType` added

- Modified response for `querySingleOrder()` (`GET /eapi/v1/order`):
  - property `postOnly` added

- Modified response for `newOrder()` (`POST /eapi/v1/order`):
  - property `postOnly` added
  - property `fee` added

#### WebSocket Streams

- Modified parameter `interval`:
  - enum added: `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `12h`, `1d`, `3d`, `1w`
  - affected methods:
    - `klineCandlestickStreams()` (`<symbol>@kline_<interval>` stream)
- Modified parameter `level`:
  - enum added: `5`, `10`, `20`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<level>@<updateSpeed>` stream)
- Modified parameter `updateSpeed`:
  - required: `false` → `true`
  - enum added: `100ms`, `500ms`
  - affected methods:
    - `partialBookDepthStreams()` (`<symbol>@depth<level>@<updateSpeed>` stream)
    - `diffBookDepthStreams()` (`<symbol>@depth@<updateSpeed>` stream)

### Removed (2)

#### WebSocket Streams

- `/<symbol>@optionTicker()` (`<symbol>@optionTicker` stream)
- `/underlying@optionOpenInterest@<expirationDate>()` (`underlying@optionOpenInterest@<expirationDate>` stream)

## 8.0.0 - 2026-05-04

- Added stop method for WebSocket

### Changed (9)

#### REST API

- Added parameter `selfTradePreventionMode`
  - affected methods:
    - `newOrder()` (`POST /eapi/v1/order`)
- Modified parameter `orders`:
  - items: property `selfTradePreventionMode` added
  - items: item property `selfTradePreventionMode` added
  - affected methods:
    - `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`)
- Modified response for `cancelMultipleOptionOrders()` (`DELETE /eapi/v1/batchOrders`):
  - items: property `selfTradePreventionMode` added
  - items: item property `selfTradePreventionMode` added

- Modified response for `placeMultipleOrders()` (`POST /eapi/v1/batchOrders`):
  - items: property `selfTradePreventionMode` added
  - items: item property `selfTradePreventionMode` added

- Modified response for `optionMarginAccountInformation()` (`GET /eapi/v1/marginAccount`):
  - property `tradeGroupId` added

- Modified response for `queryCurrentOpenOptionOrders()` (`GET /eapi/v1/openOrders`):
  - items: property `selfTradePreventionMode` added
  - items: item property `selfTradePreventionMode` added

- Modified response for `cancelOptionOrder()` (`DELETE /eapi/v1/order`):
  - property `selfTradePreventionMode` added

- Modified response for `querySingleOrder()` (`GET /eapi/v1/order`):
  - property `selfTradePreventionMode` added

- Modified response for `newOrder()` (`POST /eapi/v1/order`):
  - property `selfTradePreventionMode` added

## 7.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 6.0.0 - 2026-03-18

### Changed (1)

#### REST API

- Modified response for `cancelAllOptionOrdersOnSpecificSymbol()` (`DELETE /eapi/v1/allOpenOrders`):
  - `code`: type `integer` → `string`

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
