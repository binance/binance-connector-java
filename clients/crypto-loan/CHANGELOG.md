# Changelog

## 5.0.0 - 2026-07-29

### Changed (3)

- Modified parameter `direction`:
  - enum added: `ADDITIONAL`, `REDUCED`
  - affected methods:
    - `flexibleLoanAdjustLtv()` (`POST /sapi/v2/loan/flexible/adjust/ltv`)
- Modified parameter `repaymentType`:
  - enum added: `1`, `2`
  - affected methods:
    - `flexibleLoanRepay()` (`POST /sapi/v2/loan/flexible/repay`)
- Modified parameter `type`:
  - enum added: `borrowIn`, `collateralSpent`, `repayAmount`, `collateralReturn`, `addCollateral`, `removeCollateral`, `collateralReturnAfterLiquidation`
  - affected methods:
    - `getCryptoLoansIncomeHistory()` (`GET /sapi/v1/loan/income`)

### Removed (1)

- `checkCollateralRepayRateStableRate()` (`GET /sapi/v1/loan/repay/collateral/rate`)

## 4.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 4.0.0 - 2026-02-12

### Added (1)

- `getFlexibleLoanInterestRateHistory()` (`GET /sapi/v2/loan/interestRateHistory`)

## 3.0.0 - 2025-09-22

### Changed (2)

- Added parameter `collateralAmount`
    - affected methods:
        - `flexibleLoanBorrow()` (`POST /sapi/v2/loan/flexible/borrow`)
- Added parameter `loanAmount`
    - affected methods:
        - `flexibleLoanBorrow()` (`POST /sapi/v2/loan/flexible/borrow`)

## 2.1.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-06-02

### Removed (8)

- `flexibleLoanCollateralRepayment()` (`POST /sapi/v2/loan/flexible/repay/collateral`)
- `cryptoLoanAdjustLtv()` (`POST /sapi/v1/loan/adjust/ltv`)
- `cryptoLoanBorrow()` (`POST /sapi/v1/loan/borrow`)
- `cryptoLoanCustomizeMarginCall()` (`POST /sapi/v1/loan/customize/margin_call`)
- `cryptoLoanRepay()` (`POST /sapi/v1/loan/repay`)
- `getCollateralAssetsData()` (`GET /sapi/v1/loan/collateral/data`)
- `getLoanOngoingOrders()` (`GET /sapi/v1/loan/ongoing/orders`)
- `getLoanableAssetsData()` (`GET /sapi/v1/loan/loanable/data`)

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
