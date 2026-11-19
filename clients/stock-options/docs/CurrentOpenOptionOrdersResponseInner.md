

# CurrentOpenOptionOrdersResponseInner


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
|**quoteAsset** | **String** | Quote asset. |  [optional] |
|**side** | **String** | &#x60;BUY&#x60; / &#x60;SELL&#x60;. |  [optional] |
|**orderType** | **String** | Order type: &#x60;LIMIT&#x60;; &#x60;MARKET&#x60; for orders placed by the broker&#39;s automatic liquidation on the expiration date. |  [optional] |
|**limitPrice** | **String** | Limit price (premium per share). |  [optional] |
|**qty** | **String** | Order quantity (contracts). |  [optional] |
|**filledQty** | **String** | Cumulative filled quantity (contracts). |  [optional] |
|**filledNotional** | **String** | Cumulative filled amount. |  [optional] |
|**totalCost** | **String** | Amount locked from the wallet when the order was placed (a snapshot, not updated after fills or cancellation): premium plus fees for buy-to-open and for buy-to-close of a covered call; for buy-to-close of a cash-secured put, only the shortfall remaining after the released collateral (usually &#x60;0&#x60;); the collateral for sell-to-open (number of shares for a covered call, cash for a cash-secured put); &#x60;0&#x60; for sell-to-close. Not returned for broker automatic liquidation orders. |  [optional] |
|**filledPercent** | **String** | Fill progress percentage (0–100). |  [optional] |
|**status** | **String** | Order status: &#x60;NEW&#x60; / &#x60;PENDING_NEW&#x60; / &#x60;ACCEPTED&#x60; / &#x60;PARTIALLY_FILLED&#x60; / &#x60;PENDING_CANCEL&#x60; / &#x60;PENDING_REPLACE&#x60;. |  [optional] |
|**createdAt** | **Long** | Creation time (ms). |  [optional] |
|**updatedAt** | **Long** | Last update time (ms). |  [optional] |



