# Changelog

## 2.0.1 - 2025-08-20

- Inject session log on and log out method names.
- Auto re-logon after reconnect.

## 2.0.0 - 2025-08-07

- authNames param as Set instead of array of String.

## 1.4.0 - 2025-07-17

- Handle streams through WebSocket API 

## 1.3.0 - 2025-07-08

- Support custom headers for REST API requests (`customHeaders` option on `ClientConfiguration`).
- Added `messageMaxSize` configuration for websocket.
- Added getter for `RateLimits` in `ApiResponse`.

## 1.2.0 - 2025-05-13

- Add proxy authentication for websocket.

## 1.1.0 - 2025-05-02

- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release.