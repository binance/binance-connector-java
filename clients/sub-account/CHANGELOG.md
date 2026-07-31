# Changelog

## 7.0.0 - 2026-07-29

### Changed (1)

- Modified response for `querySubAccountApiKey()` (`GET /sapi/v1/sub-account/subAccountApi`):
  - property `rows` added
  - property `list` deleted

## 6.0.0 - 2026-07-29

### Added (4)

- `createSubAccountApiKey()` (`POST /sapi/v1/sub-account/subAccountApi`)
- `deleteSubAccountApiKey()` (`DELETE /sapi/v1/sub-account/subAccountApi`)
- `modifySubAccountApiKeyPermission()` (`POST /sapi/v1/sub-account/subAccountApiPermission`)
- `querySubAccountApiKey()` (`GET /sapi/v1/sub-account/subAccountApi`)

### Changed (6)

- Modified parameter `fromAccountType`:
  - enum added: `SPOT`, `USDT_FUTURE`, `COIN_FUTURE`, `MARGIN`, `ISOLATED_MARGIN`
  - affected methods:
    - `universalTransfer()` (`POST /sapi/v1/sub-account/universalTransfer`)
- Modified parameter `productType`:
  - enum added: `UM`
  - affected methods:
    - `movePositionForSubAccount()` (`POST /sapi/v1/sub-account/futures/move-position`)
- Modified parameter `status`:
  - type `string` → `integer`
  - affected methods:
    - `addIpRestrictionForSubAccountApiKey()` (`POST /sapi/v2/sub-account/subAccountApi/ipRestriction`)
- Modified parameter `toAccountType`:
  - enum added: `SPOT`, `USDT_FUTURE`, `COIN_FUTURE`, `MARGIN`, `ISOLATED_MARGIN`
  - affected methods:
    - `universalTransfer()` (`POST /sapi/v1/sub-account/universalTransfer`)
- Modified parameter `transferFunctionAccountType`:
  - enum added: `SPOT`, `MARGIN`, `ISOLATED_MARGIN`, `USDT_FUTURE`, `COIN_FUTURE`
  - affected methods:
    - `queryManagedSubAccountTransferLogSubAccountTrading()` (`GET /sapi/v1/managed-subaccount/query-trans-log`)
    - `queryManagedSubAccountTransferLogMasterAccountInvestor()` (`GET /sapi/v1/managed-subaccount/queryTransLogForInvestor`)
    - `queryManagedSubAccountTransferLogMasterAccountTrading()` (`GET /sapi/v1/managed-subaccount/queryTransLogForTradeParent`)
- Modified parameter `type`:
  - enum added: `SPOT`, `MARGIN`, `FUTURES`
  - affected methods:
    - `queryManagedSubAccountSnapshot()` (`GET /sapi/v1/managed-subaccount/accountSnapshot`)

## 5.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 5.0.0 - 2026-02-12

### Changed (2)

- Added parameter `limit`
  - affected methods:
    - `getSummaryOfSubAccountsFuturesAccount()` (`GET /sapi/v1/sub-account/futures/accountSummary`)
- Added parameter `page`
  - affected methods:
    - `getSummaryOfSubAccountsFuturesAccount()` (`GET /sapi/v1/sub-account/futures/accountSummary`)

## 4.0.0 - 2025-10-21

### Changed (2)

- Modified parameter `email`:
  - required: `true` → `false`
  - affected methods:
    - `querySubAccountTransactionStatistics()` (`GET /sapi/v1/sub-account/transaction-statistics`)
- Modified parameter `orderArgs`:
  - item property `quantity` added
  - item property `symbol` added
  - item property `positionSide` added
  - affected methods:
    - `movePositionForSubAccount()` (`POST /sapi/v1/sub-account/futures/move-position`)

## 3.0.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 3.0.0 - 2025-07-08

### Added (1)

- Added `customHeaders` configuration.

### Changed (1)

- Update `binance/common` module to version `1.3.0`.

### Removed (2)

- `enableLeverageTokenForSubAccount()` (`POST /sapi/v1/sub-account/blvt/enable`)
- `enableMarginForSubAccount()` (`POST /sapi/v1/sub-account/margin/enable`)

## 2.0.0 - 2025-05-26

### Changed (2)

- Modified parameter `ipAddress` for the following methods:
  - `addIpRestrictionForSubAccountApiKey()` (`POST /sapi/v2/sub-account/subAccountApi/ipRestriction`)
  - `deleteIpListForASubAccountApiKey()` (`DELETE /sapi/v1/sub-account/subAccountApi/ipRestriction/ipList`)
- Fields `subUserId` and `remark` added to the response of `/sapi/v1/sub-account/list`

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
