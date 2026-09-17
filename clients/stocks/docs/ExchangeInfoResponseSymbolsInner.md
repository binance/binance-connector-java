

# ExchangeInfoResponseSymbolsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | US-equity ticker, e.g. &#x60;AAPL&#x60;. |  [optional] |
|**tradability** | **String** | Trading direction allowed — one of &#x60;BUY_SELL&#x60; / &#x60;BUY&#x60; / &#x60;SELL&#x60; / &#x60;NONE&#x60;. |  [optional] |
|**tradabilityUpdateTime** | **Long** | Last time the &#x60;tradability&#x60; value was updated (ms epoch). |  [optional] |
|**overnightSupported** | **Boolean** | Whether the symbol supports overnight trading. |  [optional] |
|**fractionable** | **Boolean** | Whether fractional shares are supported during the regular session. |  [optional] |
|**fractionableEh** | **Boolean** | Whether fractional shares are supported during extended hours. |  [optional] |
|**extendedSession** | **Boolean** | Whether extended-session trading is enabled. |  [optional] |
|**maxNumOrders** | **Integer** | Maximum number of open orders a user may have for this symbol. |  [optional] |
|**stepSize** | **String** | Lot size — minimum increment for &#x60;quantity&#x60;. |  [optional] |
|**multiplierUp** | **String** | Upper price multiplier limit relative to reference. |  [optional] |
|**multiplierDown** | **String** | Lower price multiplier limit relative to reference. |  [optional] |
|**minQty** | **String** | Minimum allowed &#x60;quantity&#x60;. |  [optional] |
|**maxQty** | **String** | Maximum allowed &#x60;quantity&#x60;. |  [optional] |
|**minNotional** | **String** | Minimum order notional (USD). |  [optional] |
|**maxNotional** | **String** | Maximum order notional (USD). |  [optional] |
|**listingTime** | **Long** | Listing timestamp (ms epoch). |  [optional] |
|**delistingTime** | **Long** | Scheduled delisting timestamp (ms epoch); &#x60;null&#x60; if not scheduled for delisting. |  [optional] |



