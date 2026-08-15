# Changelog

## 2.0.0 - 2026-07-29

### Added (1)

#### REST API

- `fullDepth()` (`GET /bapi/defi/v1/public/alpha-trade/fullDepth`)

### Changed (1)

#### REST API

- Modified parameter `interval`:
  - enum added: `1s`, `15s`, `1m`, `3m`, `5m`, `15m`, `30m`, `1h`, `2h`, `4h`, `6h`, `8h`, `12h`, `1d`, `3d`, `1w`, `1M`
  - affected methods:
    - `klines()` (`GET /bapi/defi/v1/public/alpha-trade/klines`)

## 1.0.1 - 2026-04-30

- Update `binance/common` module to version `2.4.2`.

## 1.0.0 - 2026-01-20

- Initial release
