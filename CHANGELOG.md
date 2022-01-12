# Changelog

## 1.2.0 - 2022-01-12

### Added
- New endpoint for Mining:

  - GET /sapi/v1/mining/payment/uid to get Mining account earning.
- New endpoint for BSwap:

  - GET /sapi/v1/bswap/unclaimedRewards to get unclaimed rewards record.
  - POST /sapi/v1/bswap/claimRewards to claim swap rewards or liquidity rewards.
  - GET /sapi/v1/bswap/claimedHistory to get history of claimed rewards.

- Update endpoint for Margin：

  - Removed out limit from GET /sapi/v1/margin/interestRateHistory; The max interval between startTime and endTime is 30 days.

- Update endpoints for Sub-Account:
  - New parameter clientTranId added in POST /sapi/v1/sub-account/universalTransfer and GET /sapi/v1/sub-account/universalTransfer to support custom transfer id

## 1.1.0 - 2021-12-10

### Changed
- log4j2 logger to logback.

## 1.0.1 - 2021-12-08

### Added
- Websocket bugfix.

## 1.0.0 - 2021-12-07

### Added
- Initial code release.