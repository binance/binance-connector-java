

# OptionTradeHistoryResponseRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**executionId** | **String** | Execution ID. |  [optional] |
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
|**quote** | **String** | Quote asset. |  [optional] |
|**side** | **String** | &#x60;BUY&#x60; / &#x60;SELL&#x60;. |  [optional] |
|**orderType** | **String** | Order type: &#x60;LIMIT&#x60;; &#x60;MARKET&#x60; for orders placed by the broker&#39;s automatic liquidation on the expiration date. |  [optional] |
|**price** | **String** | Fill price (premium per share). |  [optional] |
|**qty** | **String** | Fill quantity (contracts). |  [optional] |
|**total** | **String** | Fill amount (price × qty × multiplier), excluding fees. |  [optional] |
|**executionAt** | **Long** | Execution time (ms). |  [optional] |
|**updatedAt** | **Long** | Update time (ms). |  [optional] |
|**settlementDate** | **Long** | Millisecond timestamp of 14:00 ET on the settlement date. Returned for sell fills only. |  [optional] |



