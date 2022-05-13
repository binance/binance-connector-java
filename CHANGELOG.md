# Changelog

## 1.5.0 - 2022-05-13

### Added
- GET /sapi/v1/margin/rateLimit/order added The endpoint will display the user's current margin order count usage for all intervals.
- GET /sapi/v1/portfolio/account to support query portfolio margin account info
- Information on Trailing Stops (Documentation)

### Changed
- Websocket symbol will be converted to lower case regardless of user input

## 1.4.0 - 2022-04-06

### Added
- Update endpoint for Sub-Account:
  - New endpoint GET /sapi/v1/managed-subaccount/accountSnapshot to support investor master account query asset snapshot of managed sub-account

### Changed
- Fixed typo in function name.
  - CloseIsloatedListenKey => CloseIsolatedMarginListenKey
  - CreateIsloatedListenKey => CreateIsolatedMarginListenKey
  - ExtendIsloatedListenKey => ExtendIsolatedMarginListenKey
  
## 1.3.0 - 2022-02-18

### Added
- Websocket status callback
- New endpoints for Binance Code, named as Gift Card to avoid technical confusion.
  - POST /sapi/v1/giftcard/createCode to create a Binance Code.
  - POST /sapi/v1/giftcard/redeemCode to redeem a Binance Code.
  - GET /sapi/v1/giftcard/verify to verify a Binance Code.
- New endpoint for Wallet:
  - POST /sapi/v1/asset/dust-btc to get assets that can be converted into BNB

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