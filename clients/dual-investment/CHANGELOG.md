# Changelog

## 3.0.0 - 2026-07-29

### Changed (6)

- Added parameter `autoCompoundPlan`
  - affected methods:
    - `changeAutoCompoundStatus()` (`POST /sapi/v1/dci/product/auto_compound/edit-status`)
- Deleted parameter `AutoCompoundPlan`
  - affected methods:
    - `changeAutoCompoundStatus()` (`POST /sapi/v1/dci/product/auto_compound/edit-status`)
- Modified parameter `autoCompoundPlan`:
  - enum added: `NONE`, `STANDARD`, `ADVANCED`
  - affected methods:
    - `subscribeDualInvestmentProducts()` (`POST /sapi/v1/dci/product/subscribe`)
- Modified parameter `optionType`:
  - enum added: `CALL`, `PUT`
  - affected methods:
    - `getDualInvestmentProductList()` (`GET /sapi/v1/dci/product/list`)
- Modified parameter `status`:
  - enum added: `PENDING`, `PURCHASE_SUCCESS`, `SETTLED`, `PURCHASE_FAIL`, `REFUNDING`, `REFUND_SUCCESS`, `SETTLING`
  - affected methods:
    - `getDualInvestmentPositions()` (`GET /sapi/v1/dci/product/positions`)
- Modified response for `getDualInvestmentPositions()` (`GET /sapi/v1/dci/product/positions`):
  - `list`.items: property `subscriptionTime` added
  - `list`.items: item property `subscriptionTime` added

## 2.1.2 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 2.1.1 - 2025-08-07

- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-05-28

### Changed (1)

- Marked as signed the following endpoints:
  - `GET /sapi/v1/dci/product/list`

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
