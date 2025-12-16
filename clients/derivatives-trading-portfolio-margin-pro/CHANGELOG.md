# Changelog

## 5.0.0 - 2025-12-16

### Removed (2)

#### REST API

- `mintBfusdForPortfolioMargin()` (`POST /sapi/v1/portfolio/mint`)
- `redeemBfusdForPortfolioMargin()` (`POST /sapi/v1/portfolio/redeem`)

## 4.0.0 - 2025-10-21

### Changed (2)

#### REST API

- Modified response for `mintBfusdForPortfolioMargin()` (`POST /sapi/v1/portfolio/mint`):
  - property `mintRate` added
  - property `rate` deleted

- Modified response for `redeemBfusdForPortfolioMargin()` (`POST /sapi/v1/portfolio/redeem`):
  - property `redeemRate` added
  - property `rate` deleted

## 3.0.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 3.0.0 - 2025-07-16

### Added (1)

- Support User Data Streams.

### Changed (1)

- Update `binance/common` module to version `1.4.0`.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-05-26

### Changed (1)

- `queryPortfolioMarginProBankruptcyLoanRepayHistory()` (`GET /sapi/v1/portfolio/pmLoan-history` has been updated to `GET /sapi/v1/portfolio/pmloan-history`)
- Marked as signed the following endpoints:
    - `POST /sapi/v1/portfolio/repay`

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
