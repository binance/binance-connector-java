# Changelog

## 4.0.0 - 2026-02-12

### Added (3)

- `dustConvert()` (`POST /sapi/v1/asset/dust-convert/convert`)
- `dustConvertibleAssets()` (`POST /sapi/v1/asset/dust-convert/query-convertible-assets`)
- `submitDepositQuestionnaireV2()` (`PUT /sapi/v2/localentity/deposit/provide-info`)

### Changed (6)

- Added parameter `accountType`
  - affected methods:
    - `dustlog()` (`GET /sapi/v1/asset/dribblet`)
- Added parameter `asset`
  - affected methods:
    - `assetDetail()` (`GET /sapi/v1/asset/assetDetail`)
- Modified parameter `depositId`:
  - type `string` → `integer`
  - affected methods:
    - `submitDepositQuestionnaire()` (`PUT /sapi/v1/localentity/broker/deposit/provide-info`)
- Modified response for `assetDividendRecord()` (`GET /sapi/v1/asset/assetDividend`):
  - `rows`.items: property `direction` added
  - `rows`.items: item property `direction` added

- Modified response for `withdrawHistoryV1()` (`GET /sapi/v1/localentity/withdraw/history`):
  - items: property `addressTag` deleted
  - items: item property `addressTag` deleted

- Modified response for `withdrawHistoryV2()` (`GET /sapi/v2/localentity/withdraw/history`):
  - items: property `addressTag` deleted
  - items: item property `addressTag` deleted

## 3.0.0 - 2025-09-22

### Changed (1)

- Modified response for `depositHistory()` (`GET /sapi/v1/capital/deposit/hisrec`):
    - item property `travelRuleStatus` added
- Modified response for `allCoinsInformation()` (`GET /sapi/v1/capital/config/getall`):
    - `networkList`: item property `withdrawTag` added

## 2.1.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-06-11

### Added (1)

- `fetchAddressVerificationList()` (`GET /sapi/v1/addressVerify/list`)

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
