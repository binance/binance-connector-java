# Changelog

## 3.0.0 - 2026-02-12

### Added (2)

- `getVIPLoanAccruedInterest()` (`GET /sapi/v1/loan/vip/accruedInterest`)
- `getVIPLoanInterestRateHistory()` (`GET /sapi/v1/loan/vip/interestRateHistory`)

### Changed (1)

- Modified response for `getVIPLoanOngoingOrders()` (`GET /sapi/v1/loan/vip/ongoing/orders`):
  - `rows`.items: property `loanRate` added
  - `rows`.items: item property `loanRate` added

## 2.0.0 - 2025-09-22

### Changed (1)

- Added parameter `loanTerm`
    - affected methods:
        - `vipLoanBorrow()` (`POST /sapi/v1/loan/vip/borrow`)

## 1.2.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 1.2.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
