# Changelog

## 2.0.0 - 2026-07-29

### Changed (4)

- Modified parameter `clientAlgoId`:
  - minLength `0` → `32`
  - maxLength `null` → `32`
  - affected methods:
    - `timeWeightedAveragePriceFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderTwap`)
    - `volumeParticipationFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderVp`)
    - `timeWeightedAveragePriceSpotAlgo()` (`POST /sapi/v1/algo/spot/newOrderTwap`)
- Modified parameter `positionSide`:
  - enum added: `BOTH`, `LONG`, `SHORT`
  - affected methods:
    - `timeWeightedAveragePriceFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderTwap`)
    - `volumeParticipationFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderVp`)
- Modified parameter `side`:
  - enum added: `BUY`, `SELL`
  - affected methods:
    - `queryHistoricalAlgoOrdersFutureAlgo()` (`GET /sapi/v1/algo/futures/historicalOrders`)
    - `timeWeightedAveragePriceFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderTwap`)
    - `volumeParticipationFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderVp`)
    - `queryHistoricalAlgoOrdersSpotAlgo()` (`GET /sapi/v1/algo/spot/historicalOrders`)
    - `timeWeightedAveragePriceSpotAlgo()` (`POST /sapi/v1/algo/spot/newOrderTwap`)
- Modified parameter `urgency`:
  - enum added: `LOW`, `MEDIUM`, `HIGH`
  - affected methods:
    - `volumeParticipationFutureAlgo()` (`POST /sapi/v1/algo/futures/newOrderVp`)

## 1.2.2 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

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
