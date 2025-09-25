# Changelog

## 3.0.0 - 2025-09-22

### Added (8)

- `getRwusdAccount()` (`GET /sapi/v1/rwusd/account`)
- `getRwusdQuotaDetails()` (`GET /sapi/v1/rwusd/quota`)
- `getRwusdRateHistory()` (`GET /sapi/v1/rwusd/history/rateHistory`)
- `getRwusdRedemptionHistory()` (`GET /sapi/v1/rwusd/history/redemptionHistory`)
- `getRwusdRewardsHistory()` (`GET /sapi/v1/rwusd/history/rewardsHistory`)
- `getRwusdSubscriptionHistory()` (`GET /sapi/v1/rwusd/history/subscriptionHistory`)
- `redeemRwusd()` (`POST /sapi/v1/rwusd/redeem`)
- `subscribeRwusd()` (`POST /sapi/v1/rwusd/subscribe`)

### Changed (3)

- Modified parameter `amount`:
  - affected methods:
    - `subscribeFlexibleProduct()` (`POST /sapi/v1/simple-earn/flexible/subscribe`)
    - `getFlexibleSubscriptionPreview()` (`GET /sapi/v1/simple-earn/flexible/subscriptionPreview`)
    - `subscribeLockedProduct()` (`POST /sapi/v1/simple-earn/locked/subscribe`)
    - `getLockedSubscriptionPreview()` (`GET /sapi/v1/simple-earn/locked/subscriptionPreview`)
- Modified parameter `asset`:
  - affected methods:
    - `getFlexibleRedemptionRecord()` (`GET /sapi/v1/simple-earn/flexible/history/redemptionRecord`)
    - `getFlexibleRewardsHistory()` (`GET /sapi/v1/simple-earn/flexible/history/rewardsRecord`)
    - `getFlexibleSubscriptionRecord()` (`GET /sapi/v1/simple-earn/flexible/history/subscriptionRecord`)
    - `getSimpleEarnFlexibleProductList()` (`GET /sapi/v1/simple-earn/flexible/list`)
    - `getFlexibleProductPosition()` (`GET /sapi/v1/simple-earn/flexible/position`)
    - `getLockedRedemptionRecord()` (`GET /sapi/v1/simple-earn/locked/history/redemptionRecord`)
    - `getLockedRewardsHistory()` (`GET /sapi/v1/simple-earn/locked/history/rewardsRecord`)
    - `getLockedSubscriptionRecord()` (`GET /sapi/v1/simple-earn/locked/history/subscriptionRecord`)
    - `getSimpleEarnLockedProductList()` (`GET /sapi/v1/simple-earn/locked/list`)
    - `getLockedProductPosition()` (`GET /sapi/v1/simple-earn/locked/position`)
- Modified parameter `type`:
  - affected methods:
    - `getFlexibleRewardsHistory()` (`GET /sapi/v1/simple-earn/flexible/history/rewardsRecord`)

## 2.1.1 - 2025-08-07
- Update `binance/common` module to version `2.0.0`.
- Add `Content-Type` header only if there is a body.

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-05-28

### Changed (2)

- Added parameter `recvWindow`
  - affected methods:
    - `getFlexibleRedemptionRecord()` (`GET /sapi/v1/simple-earn/flexible/history/redemptionRecord`)
- Marked as signed the following endpoints:
  - `GET /sapi/v1/simple-earn/locked/position`

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
