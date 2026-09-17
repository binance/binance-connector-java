

# EquityOrderDetailResponse

Top-level fields mirror an order row from `/order/history` (orderId, symbol, quote, side, orderType, limitPrice, avgFilledPrice, qty, notional, filledQty, filledTotal, fee, session, status, createdAt, updatedAt), plus a `trades` array. `clientOrderId` is present only in Order Detail, not in Order History.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Equity order id. |  [optional] |
|**clientOrderId** | **String** | Client-supplied order id. Present only in Order Detail, not in Order History. |  [optional] |
|**symbol** | **String** | US-equity ticker. |  [optional] |
|**quote** | **String** | Quote asset. |  [optional] |
|**side** | **String** | &#x60;BUY&#x60; / &#x60;SELL&#x60;. |  [optional] |
|**orderType** | **String** | &#x60;MARKET&#x60; / &#x60;LIMIT&#x60;. |  [optional] |
|**limitPrice** | **String** | Limit price (USD). Non-null for &#x60;LIMIT&#x60;, &#x60;null&#x60; for &#x60;MARKET&#x60;. |  [optional] |
|**avgFilledPrice** | **String** | Average fill price (USD). Only present when the order has at least one fill. |  [optional] |
|**qty** | **String** | Requested quantity. |  [optional] |
|**notional** | **String** | Requested notional. |  [optional] |
|**filledQty** | **String** | Cumulative filled quantity. |  [optional] |
|**filledTotal** | **String** | Cumulative filled notional. |  [optional] |
|**fee** | **String** | Total commission fee (USD). |  [optional] |
|**session** | **String** | Trading session. |  [optional] |
|**status** | **String** | Order lifecycle status. |  [optional] |
|**createdAt** | **Long** | Order creation time (ms epoch). |  [optional] |
|**updatedAt** | **Long** | Last update time (ms epoch). |  [optional] |
|**trades** | [**List&lt;EquityOrderDetailResponseTradesInner&gt;**](EquityOrderDetailResponseTradesInner.md) | Trade executions for this order, most recent first. Empty array when no fills. |  [optional] |



