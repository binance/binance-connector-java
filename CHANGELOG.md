# Changelog

## 3.0.0rc2 - 2023-05-31

### Added
- Added WebSocket callbacks to `utils` directory with the aim of facilitating the transmission of various types of data from WebSocket connections (in addition to `onMessage`):  `WebSocketClosedCallback`, `WebSocketClosingCallback`, `WebSocketFailureCallback` and `WebSocketOpenCallback`.
- New endpoints for Convert:
  - `GET /sapi/v1/convert/exchangeInfo` to query for all convertible token pairs and its limits information.
  - `GET /sapi/v1/convert/assetInfo` to query supported assets quantity precision information.
  - `POST /sapi/v1/convert/getQuote` to request a quote for the provided token pairs.
  - `POST /sapi/v1/convert/acceptQuote` to accept the offered quote by quote ID.
  - `GET /sapi/v1/convert/orderStatus` to query order status by order ID.
- New endpoint for Wallet:
  - `GET /sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage` to query Cloud-Mining payment and refund history.
- New endpoint for Sub-account:
  - `POST /sapi/v2/sub-account/subAccountApi/ipRestriction` to support master account to update IP Restriction for a sub-account API key.
- Added Enums `DefaultUrls.MARKET_URL` and `DefaultUrls.MARKET_WS_URL` to be optionally used to retrieve market data.

### Removed
- The following endpoints was discontinued on January 13, 2023 6:00 AM UTC:
  - `POST /sapi/v1/sub-account/subAccountApi/ipRestriction` to support master account enable and disable IP restriction for a sub-account API Key.
  - `POST /sapi/v1/sub-account/subAccountApi/ipRestriction/ipList` to support master account add IP list for a sub-account API Key.

### Changed
- Renamed `WebSocketCallback` to `WebSocketMessageCallback` and moved it to the `utils` directory.
- Updated parameter type from `LinkedHashMap<String, Object>` to `Map<String, Object>` in certain methods to support various data structures implementing the Map interface.
- Renamed Enum `DefaultUrls.TESTNET_WSS_URL` to `DefaultUrls.TESTNET_WS_URL`.
- Improved `utils.UrlBuilder` and `utils.RequestHandler` code readability.

## 3.0.0rc1 - 2023-05-12

### Added
- Support for generating signatures using Ed25519 keys has been added.

### Changed
- Upgraded `org.json` dependency to version `20230227`.
- If `x-sapi-used-uid-weight-1m` exists, the response will list it when `setShowLimitUsage(true)` is set.
- Added `setShowLimitUsage`, `setProxy`, and `unsetProxy` methods to the `SpotClient` interface.

## 2.0.0 - 2023-05-01

### Changed
- Improved naming consistency by renaming all areas containing `Websocket` to `WebSocket`.
- Move signature generator classes under new utils subpath `utils/signaturegenerator`.

## 2.0.0rc2 - 2023-02-16

### Added
- Spot Websocket API

### Changed
- Code Cleanup
  - Renamed `WebsocketClientImpl` to `WebsocketStreamClientImpl`.
  - Grouped Rest API examples and tests under `spot` folder.

### Fixed
- Removed `logback-classic` dependency and excluded `logback.xml` to let the end-user configure the logging environment.

## 2.0.0rc1 - 2023-01-13

### Added
- HTTP Proxy support

## 1.12.0 - 2022-12-15

### Added
- New endpoints for Wallet:
  - `POST /sapi/v1/asset/convert-transfer` to convert between BUSD and stablecoins
  - `GET /sapi/v1/asset/convert-transfer/queryByPage` to query BUSD convert history
- New endpoints for Crypto Loan:
  - `GET /sapi/v1/loan/loanable/data` to get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.
  - `GET /sapi/v1/loan/collateral/data` to get LTV information and collateral limit of collateral assets. The collateral limit is shown in USD value.
  - `GET /sapi/v1/loan/repay/collateral/rate` to get the the rate of collateral coin / loan coin when using collateral repay, the rate will be valid within 8 seconds.
  - `POST /sapi/v1/loan/customize/margin_call` to customize margin call for ongoing orders only.


### Removed
- Delete endpoints for Futures Cross Collateral:
  - `POST /sapi/v1/futures/loan/borrow`
  - `POST /sapi/v1/futures/loan/repay`
  - `GET /sapi/v2/futures/loan/configs`
  - `GET /sapi/v2/futures/loan/calcAdjustLevel`
  - `GET /sapi/v2/futures/loan/calcMaxAdjustAmount`
  - `POST /sapi/v2/futures/loan/adjustCollateral`
  - `GET /sapi/v1/futures/loan/collateralRepayLimit`
  - `GET /sapi/v1/futures/loan/collateralRepay`
  - `POST /sapi/v1/futures/loan/collateralRepay`
  - `GET /sapi/v1/futures/loan/collateralRepayResult`

## 1.11.0 - 2022-11-28

### Added
- Add support for use of RSA Key to generate signatures

### Removed
- The All Book Tickers stream (!bookTicker) is removed

## 1.10.0 - 2022-10-17

### Added
- New endpoints for Crypto Loan:
  - `POST /sapi/v1/loan/borrow` to borrow Crypto Loan 
  - `GET /sapi/v1/loan/borrow/history` to get Loan Borrow History
  - `GET/sapi/v1/loan/ongoing/orders` to get Loan Ongoing Orders
  - `POST/sapi/v1/loan/repay` to repay Crypto Loan 
  - `GET/sapi/v1/loan/repay/history` to get Loan Repayment History
  - `POST/sapi/v1/loan/adjust/ltv` to adjust Crypto Loan LTV (Loan-To-Value)
  - `GET/sapi/v1/loan/ltv/adjustment/history` to get Loan LTV (Loan-To-Value) Adjustment History

### Changed
- Changes to `GET /api/v3/exchangeInfo`:
  - New optional parameter `permissions` added to display all symbols with the permissions matching the parameter provided. (eg.SPOT, MARGIN, LEVERAGED)
  - If not provided, the default value will be `["SPOT","MARGIN","LEVERAGED"]`
  - Cannot be combined with symbol or symbols
- Updated `checkstyle.xml` to also include Indentation verification 

### Fixed
- `DecimalFormat` with `Locale.ENGLISH` for requests with `Double` to have `.` as decimal separator.

## 1.9.0 - 2022-08-30

### Added
- New market endpoint:
  - `GET /api/v3/uiKlines`
- New kline interval: `1s`
- The following endpoints now support multi-symbol querying using the parameter symbols.
  - `GET /api/v3/ticker/24hr`
  - `GET /api/v3/ticker/price`
  - `GET /api/v3/ticker/bookTicker`
### Changed
- Changes to `GET /api/v3/ticker` and `GET /api/v3/ticker/24hr`
  - New optional parameter `type` added
  - Supported values for parameter `type` are `FULL` and `MINI`
    - `FULL` is the default value and the response that is currently being returned from the endpoint
    - `MINI` omits the following fields from the response: `priceChangePercent`, `weightedAvgPrice`, `bidPrice`, `bidQty`, `askPrice`, `askQty`, and `lastQty`

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

  - `GET /sapi/v1/bswap/unclaimedRewards` to get unclaimed rewards record.
  - `POST /sapi/v1/bswap/claimRewards` to claim swap rewards or liquidity rewards.
  - `GET /sapi/v1/bswap/claimedHistory` to get history of claimed rewards.

- Update endpoint for Margin: 

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
