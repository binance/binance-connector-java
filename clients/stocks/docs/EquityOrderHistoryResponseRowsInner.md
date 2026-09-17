

# EquityOrderHistoryResponseRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Equity order id. |  [optional] |
|**symbol** | **String** | US-equity ticker. |  [optional] |
|**quote** | **String** | Quote asset (e.g. &#x60;USDC&#x60;). |  [optional] |
|**side** | **String** | &#x60;BUY&#x60; / &#x60;SELL&#x60;. |  [optional] |
|**orderType** | **String** | &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. |  [optional] |
|**limitPrice** | **String** | Limit price (USD). Non-null for &#x60;LIMIT&#x60; orders, &#x60;null&#x60; for &#x60;MARKET&#x60;. |  [optional] |
|**avgFilledPrice** | **String** | Average fill price (USD). &#x60;null&#x60; until the first fill. For &#x60;MARKET&#x60; orders this is the only meaningful price field. |  [optional] |
|**qty** | **String** | Requested quantity. &#x60;null&#x60; for &#x60;BUY MARKET&#x60; (use &#x60;notional&#x60; instead). |  [optional] |
|**notional** | **String** | Requested notional. Non-null for &#x60;BUY MARKET&#x60;; &#x60;null&#x60; otherwise. |  [optional] |
|**filledQty** | **String** | Cumulative filled quantity. |  [optional] |
|**filledTotal** | **String** | Cumulative filled notional. Populated only for &#x60;BUY MARKET&#x60;. |  [optional] |
|**fee** | **String** | Total commission fee (USD). |  [optional] |
|**session** | **String** | Trading session the order was placed under: &#x60;RTH&#x60; / &#x60;EXTENDED&#x60; / &#x60;24H&#x60;. &#x60;null&#x60; for &#x60;MARKET&#x60; orders. |  [optional] |
|**status** | **String** | Order lifecycle status — one of &#x60;NEW&#x60; / &#x60;ACCEPTED&#x60; / &#x60;PARTIALLY_FILLED&#x60; / &#x60;FILLED&#x60; / &#x60;CANCELED&#x60; / &#x60;EXPIRED&#x60; / &#x60;REJECTED&#x60;. |  [optional] |
|**createdAt** | **Long** | Order creation time (ms epoch). |  [optional] |
|**updatedAt** | **Long** | Last update time (ms epoch). |  [optional] |



