# Changelog

## 7.0.0 - 2026-07-29

### Added (4)

#### REST API

- `exitSpecialKeyMode()` (`POST /sapi/v1/margin/exit-special-key-mode`)
- `liquidationLoanRepay()` (`POST /sapi/v1/margin/liquidation-loan/repay`)
- `queryLiquidationLoan()` (`GET /sapi/v1/margin/liquidation-loan`)
- `queryLiquidationLoanRepayHistory()` (`GET /sapi/v1/margin/liquidation-loan/repay-history`)

### Changed (29)

#### REST API

- Added parameter `trailingDelta`
  - affected methods:
    - `marginAccountNewOrder()` (`POST /sapi/v1/margin/order`)
- Modified parameter `assetNames`:
  - type `array` → `string`
  - affected methods:
    - `smallLiabilityExchange()` (`POST /sapi/v1/margin/exchange-small-liability`)
- Modified parameter `isIsolated`:
  - enum added: `TRUE`, `FALSE`
  - affected methods:
    - `queryMarginAccountsAllOco()` (`GET /sapi/v1/margin/allOrderList`)
    - `queryMarginAccountsAllOrders()` (`GET /sapi/v1/margin/allOrders`)
    - `queryPreventedMatches()` (`GET /sapi/v1/margin/myPreventedMatches`)
    - `queryMarginAccountsTradeList()` (`GET /sapi/v1/margin/myTrades`)
    - `queryMarginAccountsOpenOco()` (`GET /sapi/v1/margin/openOrderList`)
    - `marginAccountCancelAllOpenOrdersOnASymbol()` (`DELETE /sapi/v1/margin/openOrders`)
    - `queryMarginAccountsOpenOrders()` (`GET /sapi/v1/margin/openOrders`)
    - `marginAccountCancelOrder()` (`DELETE /sapi/v1/margin/order`)
    - `queryMarginAccountsOrder()` (`GET /sapi/v1/margin/order`)
    - `marginAccountNewOrder()` (`POST /sapi/v1/margin/order`)
    - `marginAccountNewOco()` (`POST /sapi/v1/margin/order/oco`)
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
    - `marginAccountCancelOco()` (`DELETE /sapi/v1/margin/orderList`)
    - `queryMarginAccountsOco()` (`GET /sapi/v1/margin/orderList`)
    - `queryCurrentMarginOrderCountUsage()` (`GET /sapi/v1/margin/rateLimit/order`)
- Modified parameter `isIsolated`:
  - enum added: `TRUE`, `FALSE`
  - affected methods:
    - `marginAccountBorrowRepay()` (`POST /sapi/v1/margin/borrow-repay`)
- Modified parameter `isIsolated`:
  - type `boolean` → `string`
  - enum added: `TRUE`, `FALSE`
  - affected methods:
    - `getFutureHourlyInterestRate()` (`GET /sapi/v1/margin/next-hourly-interest-rate`)
- Modified parameter `pendingAboveTimeInForce`:
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `pendingAboveType`:
  - enum added: `LIMIT_MAKER`, `STOP_LOSS`, `STOP_LOSS_LIMIT`
  - affected methods:
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `pendingBelowTimeInForce`:
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `pendingBelowType`:
  - enum added: `LIMIT_MAKER`, `STOP_LOSS`, `STOP_LOSS_LIMIT`
  - affected methods:
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `pendingSide`:
  - enum added: `BUY`, `SELL`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `pendingTimeInForce`:
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
- Modified parameter `pendingType`:
  - enum added: `LIMIT`, `MARKET`, `STOP_LOSS`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT`, `TAKE_PROFIT_LIMIT`, `LIMIT_MAKER`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
- Modified parameter `permissionMode`:
  - enum added: `TRADE`, `READ`
  - affected methods:
    - `createSpecialKey()` (`POST /sapi/v1/margin/apiKey`)
- Modified parameter `selfTradePreventionMode`:
  - enum added: `EXPIRE_TAKER`, `EXPIRE_MAKER`, `EXPIRE_BOTH`, `NONE`
  - affected methods:
    - `marginAccountNewOrder()` (`POST /sapi/v1/margin/order`)
    - `marginAccountNewOco()` (`POST /sapi/v1/margin/order/oco`)
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `sideEffectType`:
  - enum added: `NO_SIDE_EFFECT`, `MARGIN_BUY`, `AUTO_REPAY`, `AUTO_BORROW_REPAY`
  - affected methods:
    - `marginAccountNewOrder()` (`POST /sapi/v1/margin/order`)
    - `marginAccountNewOco()` (`POST /sapi/v1/margin/order/oco`)
- Modified parameter `sideEffectType`:
  - enum added: `NO_SIDE_EFFECT`, `MARGIN_BUY`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `stopLimitTimeInForce`:
  - enum added: `GTC`, `FOK`, `IOC`
  - affected methods:
    - `marginAccountNewOco()` (`POST /sapi/v1/margin/order/oco`)
- Modified parameter `symbol`:
  - required: `true` → `false`
  - affected methods:
    - `marginAccountBorrowRepay()` (`POST /sapi/v1/margin/borrow-repay`)
- Modified parameter `type`:
  - enum added: `MARGIN`, `ISOLATED`
  - affected methods:
    - `queryMarginAvailableInventory()` (`GET /sapi/v1/margin/available-inventory`)
    - `marginManualLiquidation()` (`POST /sapi/v1/margin/manual-liquidation`)
- Modified parameter `type`:
  - enum added: `BORROW`, `REPAY`
  - affected methods:
    - `queryBorrowRepayRecordsInMarginAccount()` (`GET /sapi/v1/margin/borrow-repay`)
    - `marginAccountBorrowRepay()` (`POST /sapi/v1/margin/borrow-repay`)
- Modified parameter `type`:
  - enum added: `TRANSFER`, `BORROW`, `REPAY`, `BUY_INCOME`, `BUY_EXPENSE`, `SELL_INCOME`, `SELL_EXPENSE`, `TRADING_COMMISSION`, `BUY_LIQUIDATION`, `SELL_LIQUIDATION`, `REPAY_LIQUIDATION`, `OTHER_LIQUIDATION`, `LIQUIDATION_FEE`, `SMALL_BALANCE_CONVERT`, `COMMISSION_RETURN`, `SMALL_CONVERT`
  - affected methods:
    - `queryCrossIsolatedMarginCapitalFlow()` (`GET /sapi/v1/margin/capital-flow`)
- Modified parameter `type`:
  - enum added: `LIMIT`, `MARKET`, `STOP_LOSS`, `STOP_LOSS_LIMIT`, `TAKE_PROFIT`, `TAKE_PROFIT_LIMIT`, `LIMIT_MAKER`
  - affected methods:
    - `marginAccountNewOrder()` (`POST /sapi/v1/margin/order`)
- Modified parameter `type`:
  - enum added: `ROLL_IN`, `ROLL_OUT`
  - affected methods:
    - `getCrossMarginTransferHistory()` (`GET /sapi/v1/margin/transfer`)
- Modified parameter `workingSide`:
  - enum added: `BUY`, `SELL`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `workingTimeInForce`:
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
- Modified parameter `workingTimeInForce`:
  - enum added: `GTC`, `IOC`, `FOK`
  - affected methods:
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified parameter `workingType`:
  - enum added: `LIMIT`, `LIMIT_MAKER`
  - affected methods:
    - `marginAccountNewOto()` (`POST /sapi/v1/margin/order/oto`)
    - `marginAccountNewOtoco()` (`POST /sapi/v1/margin/order/otoco`)
- Modified response for `queryMarginAvailableInventory()` (`GET /sapi/v1/margin/available-inventory`):
  - `assets`: property `MATIC` deleted
  - `assets`: property `SHIB` deleted
  - `assets`: property `STPT` deleted
  - `assets`: property `TVK` deleted

- Modified response for `queryCrossIsolatedMarginCapitalFlow()` (`GET /sapi/v1/margin/capital-flow`):
  - items: property `note` added
  - items: item property `note` added

## 6.1.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 6.1.0 - 2026-02-12

### Added (2)

#### REST API

- `getMarginRestrictedAssets()` (`GET /sapi/v1/margin/restricted-asset`)
- `queryPreventedMatches()` (`GET /sapi/v1/margin/myPreventedMatches`)

## 6.0.0 - 2026-02-12

### Added (1)

#### REST API

- `getMarginAssetRiskBasedLiquidationRatio()` (`GET /sapi/v1/margin/risk-based-liquidation-ratio`)

## 5.0.0 - 2025-12-16

### Removed (6)

#### REST API

- `closeIsolatedMarginUserDataStream()` (`DELETE /sapi/v1/userDataStream/isolated`)
- `closeMarginUserDataStream()` (`DELETE /sapi/v1/userDataStream`)
- `keepaliveIsolatedMarginUserDataStream()` (`PUT /sapi/v1/userDataStream/isolated`)
- `keepaliveMarginUserDataStream()` (`PUT /sapi/v1/userDataStream`)
- `startIsolatedMarginUserDataStream()` (`POST /sapi/v1/userDataStream/isolated`)
- `startMarginUserDataStream()` (`POST /sapi/v1/userDataStream`)

## 4.0.0 - 2025-09-22

### Added (1)

#### REST API

- `getLimitPricePairs()` (`GET /sapi/v1/margin/limit-price-pairs`)

## 3.0.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 3.0.0 - 2025-07-16

### Added (1)

- Support Risk and Trade Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 2.0.0 - 2025-07-08

### Added (1)

- `getListSchedule()` (`GET /sapi/v1/margin/list-schedule`)
- Added `customHeaders` configuration.

### Changed (1)

- Update `binance/common` module to version `1.3.0`.

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
