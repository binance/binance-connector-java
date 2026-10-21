

# GetMarketDetailResponseMarketsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketId** | **Long** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**question** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**conditionId** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**tradingStatus** | **String** |  |  [optional] |
|**tradeVolume** | **String** |  |  [optional] |
|**liquidity** | **String** |  |  [optional] |
|**decimalPrecision** | **Integer** | Price precision of the market, in decimal places. The price tick is 10 to the power of minus &#x60;decimalPrecision&#x60;, for example &#x60;2&#x60; means a tick of 0.01. A limit price that is not on the tick is truncated down |  [optional] |
|**outcomes** | [**List&lt;GetMarketDetailResponseMarketsInnerOutcomesInner&gt;**](GetMarketDetailResponseMarketsInnerOutcomesInner.md) |  |  [optional] |



