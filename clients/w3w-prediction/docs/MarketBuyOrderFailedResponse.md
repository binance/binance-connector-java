

# MarketBuyOrderFailedResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**pushId** | **String** | Unique ID of this push. Use it to remove duplicates. |  [optional] |
|**amount** | **String** | Original order amount in USDT — **not** actually charged. Rounded down to 2 decimals; shown as &#x60;&lt;0.01&#x60; if smaller. |  [optional] |
|**topic** | **String** | Market title, cut to 12 characters with &#x60;..&#x60; added when longer; empty if unavailable. |  [optional] |



