

# OptionExchangeInfoResponseSymbolsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**rootSymbol** | **String** | OCC root symbol. Differs from &#x60;underlyingSymbol&#x60; for contracts adjusted by a corporate action (e.g. &#x60;GOOG1&#x60;). |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**status** | **String** | Contract trading status: &#x60;OPEN_CLOSE&#x60; / &#x60;CLOSE_ONLY&#x60; / &#x60;NONE&#x60;. Omitted when the status of a contract is temporarily unavailable. See Common Definition. |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**multiplier** | **String** | Premium multiplier. Order cost &#x3D; price × quantity × multiplier. &#x60;100&#x60; for standard contracts. |  [optional] |
|**contractSize** | **Integer** | Shares delivered per contract. Equals &#x60;multiplier&#x60; for standard contracts; may differ after a corporate action. |  [optional] |
|**tickSize** | **String** | Minimum price increment. |  [optional] |
|**stepSize** | **String** | Quantity increment (contracts). |  [optional] |
|**minQty** | **String** | Minimum order quantity (contracts). |  [optional] |
|**maxQty** | **String** | Maximum order quantity (contracts). |  [optional] |
|**minNotional** | **String** | Minimum order notional (&#x60;price&#x60; × &#x60;quantity&#x60; × &#x60;multiplier&#x60;), excluding fees. |  [optional] |
|**maxNotional** | **String** | Maximum order notional (&#x60;price&#x60; × &#x60;quantity&#x60; × &#x60;multiplier&#x60;), excluding fees. |  [optional] |
|**optionsLateClose** | **Boolean** | Whether options on this underlying close 15 minutes later: &#x60;true&#x60; means 16:15 ET, otherwise 16:00 ET (both move earlier accordingly on early-close days). |  [optional] |
|**pennyProgram** | **Boolean** | Penny Program indicator. Omitted when unknown. |  [optional] |
|**deliverables** | [**List&lt;OptionExchangeInfoResponseSymbolsInnerDeliverablesInner&gt;**](OptionExchangeInfoResponseSymbolsInnerDeliverablesInner.md) | What one contract delivers on exercise / assignment. |  [optional] |



