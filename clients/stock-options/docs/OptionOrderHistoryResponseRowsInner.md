

# OptionOrderHistoryResponseRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Option order ID. |  [optional] |
|**clientOrderId** | **String** | Client order ID. |  [optional] |
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**rootSymbol** | **String** | OCC root symbol. Differs from &#x60;underlyingSymbol&#x60; for contracts adjusted by a corporate action (e.g. &#x60;GOOG1&#x60;). |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**multiplier** | **String** | Premium multiplier. Order cost &#x3D; price × quantity × multiplier. |  [optional] |
|**positionIntent** | **String** | Position intent: &#x60;BUY_TO_OPEN&#x60; / &#x60;SELL_TO_CLOSE&#x60; / &#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;. |  [optional] |
|**autoLiquidation** | **Boolean** | &#x60;true&#x60; if the order was initiated by the broker&#39;s automatic liquidation rather than by the user. |  [optional] |
|**quote** | **String** | Quote asset (named &#x60;quoteAsset&#x60; in Current Open Option Orders). |  [optional] |
|**side** | **String** | &#x60;BUY&#x60; / &#x60;SELL&#x60;. |  [optional] |
|**orderType** | **String** | Order type: &#x60;LIMIT&#x60;; &#x60;MARKET&#x60; for orders placed by the broker&#39;s automatic liquidation on the expiration date. |  [optional] |
|**limitPrice** | **String** | Limit price (premium per share). Returned as reported by the broker regardless of order type; not returned for &#x60;MARKET&#x60; orders, which have no limit price. |  [optional] |
|**avgFilledPrice** | **String** | Average fill price (premium per share) as reported by the broker, returned for all order types. Not returned if the order has no fills. |  [optional] |
|**qty** | **String** | Order quantity (contracts). |  [optional] |
|**filledQty** | **String** | Cumulative filled quantity (contracts). |  [optional] |
|**filledTotal** | **String** | Cumulative filled amount. |  [optional] |
|**fee** | **String** | Cumulative fees &#x3D; &#x60;commission&#x60; + &#x60;sec&#x60; + &#x60;taf&#x60; + &#x60;cat&#x60; + &#x60;orf&#x60; + &#x60;occ&#x60; (excluding &#x60;platformFee&#x60;). Fees are returned at the order level only; individual fills carry no fee. |  [optional] |
|**status** | **String** | Order status, e.g. &#x60;FILLED&#x60; / &#x60;PARTIALLY_FILLED&#x60; / &#x60;CANCELED&#x60; / &#x60;EXPIRED&#x60; / &#x60;REJECTED&#x60;. |  [optional] |
|**createdAt** | **Long** | Creation time (ms). |  [optional] |
|**updatedAt** | **Long** | Last update time (ms). |  [optional] |



