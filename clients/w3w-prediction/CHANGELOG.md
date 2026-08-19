# Changelog

## 1.1.0 - 2026-08-17

### Added (10)

- `applyMmDeposit()` (`POST /sapi/v1/w3w/wallet/prediction/deposit/apply`)
- `applyMmWithdraw()` (`POST /sapi/v1/w3w/wallet/prediction/withdraw/apply`)
- `createOtcBlocktrade()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/create`)
- `fulfilOtcBlocktrade()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/fulfil`)
- `getOtcBlocktradeDetail()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/detail`)
- `getOtcBlocktradeEvents()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/events`)
- `getOtcReservedBalances()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/reserved-balances`)
- `listOtcBlocktrades()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/list`)
- `previewOtcBlocktrade()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/preview`)
- `removeOtcBlocktrades()` (`POST /sapi/v1/w3w/wallet/prediction/otc/blocktrade/remove`)

### Changed (10)

- Added response schema `fulfilOtcBlocktradeResponse`
- Added response schema `previewOtcBlocktradeResponse`
- Added response schema `getOtcBlocktradeDetailResponse`
- Added response schema `listOtcBlocktradesResponse`
- Added response schema `removeOtcBlocktradesResponse`
- Added response schema `getOtcBlocktradeEventsResponse`
- Added response schema `applyMmWithdrawResponse`
- Added response schema `createOtcBlocktradeResponse`
- Added response schema `getOtcReservedBalancesResponse`
- Added response schema `applyMmDepositResponse`

## 1.0.0 - 2026-06-29

- Initial release
