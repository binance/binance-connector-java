# Changelog

## 1.8.0 - 2022-07-26

### Added
- New wallet endpoint:
  - `POST /sapi/v3/asset/getUserAsset` to get user assets
- New Portfolio Margin endpoints:
  - `GET /sapi/v1/portfolio/collateralRate` to get Portfolio Margin Collateral Rate
  - `GET /sapi/v1/portfolio/pmLoan` Query Portfolio Margin Bankruptcy Loan Record
  - `POST /sapi/v1/portfolio/repay` Portfolio Margin Bankruptcy Loan Repay

## 1.7.0 - 2022-07-04

### Added
- New endpoints for Spot:
  - `GET /api/v3/ticker`
  - `POST /api/v3/order/cancelReplace`
- New websocket streams:
  - New symbol ticker streams with 1h and 4h windows: Individual symbol ticker streams
    - `<symbol>@ticker_<window-size>`
  - All market ticker streams
    - `!ticker_<window-size>@arr`
- New margin endpoint:
  - `GET /sapi/v1/margin/dribblet` to query the historical information of user's margin account small-value asset conversion BNB.
### Changed
- `GET /sapi/v1/pay/transactions`: Param names changed: startTimestamp -> startTime; endTimestamp -> endTime.

## 1.6.4 - 2022-06-21

### Changed
- Code Cleanup
  - Applied lint checks on test and example files. Conditions are similar to the main source code.

## 1.6.3 - 2022-06-08

### Changed
- Code Cleanup
  - Removed unused variables
  - Replaced deprecated unittest variable
  - Removed extra semicolon
- Remove unnecessary mandatory field for `/sapi/v1/lending/daily/token/position`

## 1.6.2 - 2022-05-27

### Changed
- `maven-checkstyle-plugin` dependencies package version changed to scope `test`
- Pumped `logback-classic` version to `1.2.11`

## 1.6.1 - 2022-05-26

### Added
- Java checkstyle to pom.xml and github actions

## 1.6.0 - 2022-05-22

### Added
- New endpoints for Staking:
  - `GET /sapi/v1/staking/productList` to get Staking product list
  - `POST /sapi/v1/staking/purchase` to stake product
  - `POST /sapi/v1/staking/redeem` to redeem product
  - `GET /sapi/v1/staking/position` to get Staking product holding position
  - `GET /sapi/v1/staking/stakingRecord` to inquiry Staking history records
  - `POST /sapi/v1/staking/setAutoStaking` to set Auto Staking function
  - `GET /sapi/v1/staking/personalLeftQuota` to inquiry Staking left quota
- New endpoint for Binance Code:
  - `GET /sapi/v1/giftcard/cryptography/rsa-public-key` to fetch RSA public key.
- Update endpoint for Binance Code:
  - `POST /sapi/v1/giftcard/redeemCode`: new optional parameter externalUid. Each external unique ID represents a unique user on the partner platform. The function helps you to identify the redemption behavior of different users.

## 1.5.0 - 2022-05-13

### Added
- `GET /sapi/v1/margin/rateLimit/order` added The endpoint will display the user's current margin order count usage for all intervals.
- `GET /sapi/v1/portfolio/account` to support query portfolio margin account info
- Information on Trailing Stops (Documentation)

### Changed
- Websocket symbol will be converted to lower case regardless of user input

## 1.4.0 - 2022-04-06

### Added
- Update endpoint for Sub-Account:
  - New endpoint `GET /sapi/v1/managed-subaccount/accountSnapshot` to support investor master account query asset snapshot of managed sub-account

### Changed
- Fixed typo in function name.
  - CloseIsloatedListenKey => CloseIsolatedMarginListenKey
  - CreateIsloatedListenKey => CreateIsolatedMarginListenKey
  - ExtendIsloatedListenKey => ExtendIsolatedMarginListenKey
  
## 1.3.0 - 2022-02-18

### Added
- Websocket status callback
- New endpoints for Binance Code, named as Gift Card to avoid technical confusion.
  - `POST /sapi/v1/giftcard/createCode` to create a Binance Code.
  - `POST /sapi/v1/giftcard/redeemCode` to redeem a Binance Code.
  - `GET /sapi/v1/giftcard/verify` to verify a Binance Code.
- New endpoint for Wallet:
  - `POST /sapi/v1/asset/dust-btc` to get assets that can be converted into BNB

## 1.2.0 - 2022-01-12

### Added
- New endpoint for Mining:

  - `GET /sapi/v1/mining/payment/uid` to get Mining account earning.
- New endpoint for BSwap:

  - `GET /sapi/v1/bswap/unclaimedRewards `to get unclaimed rewards record.
  - `POST /sapi/v1/bswap/claimRewards` to claim swap rewards or liquidity rewards.
  - `GET /sapi/v1/bswap/claimedHistory` to get history of claimed rewards.

- Update endpoint for Margin：

  - Removed out limit from `GET /sapi/v1/margin/interestRateHistory`; The max interval between startTime and endTime is 30 days.

- Update endpoints for Sub-Account:
  - New parameter `clientTranId` added in `POST /sapi/v1/sub-account/universalTransfer` and `GET /sapi/v1/sub-account/universalTransfer` to support custom transfer id

## 1.1.0 - 2021-12-10

### Changed
- log4j2 logger to logback.

## 1.0.1 - 2021-12-08

### Added
- Websocket bugfix.

## 1.0.0 - 2021-12-07

### Added
- Initial code release.
