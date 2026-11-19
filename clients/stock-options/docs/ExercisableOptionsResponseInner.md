

# ExercisableOptionsResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**rootSymbol** | **String** | OCC root symbol. Differs from &#x60;underlyingSymbol&#x60; for contracts adjusted by a corporate action (e.g. &#x60;GOOG1&#x60;). |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**multiplier** | **String** | Premium multiplier. Order cost &#x3D; price × quantity × multiplier. |  [optional] |
|**positionQty** | **String** | Total contracts held. |  [optional] |
|**availableQty** | **String** | Contracts available to exercise; the upper limit for Submit Option Exercise. |  [optional] |
|**deliverables** | [**List&lt;OptionExchangeInfoResponseSymbolsInnerDeliverablesInner&gt;**](OptionExchangeInfoResponseSymbolsInnerDeliverablesInner.md) | What one contract delivers on exercise / assignment. |  [optional] |



