# Changelog

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
