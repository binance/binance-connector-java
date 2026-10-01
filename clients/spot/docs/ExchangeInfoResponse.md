

# ExchangeInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timezone** | **String** |  |  [optional] |
|**serverTime** | **Long** |  |  [optional] |
|**rateLimits** | [**List&lt;RateLimits&gt;**](RateLimits.md) | Global rate limits. See \&quot;Rate limits\&quot; section. |  [optional] |
|**exchangeFilters** | [**List&lt;ExchangeFilters&gt;**](ExchangeFilters.md) | Exchange filters are explained on the \&quot;Filters\&quot; page: All exchange filters are optional. |  [optional] |
|**symbols** | [**List&lt;ExchangeInfoResponseSymbolsInner&gt;**](ExchangeInfoResponseSymbolsInner.md) |  |  [optional] |
|**sors** | [**List&lt;ExchangeInfoResponseSorsInner&gt;**](ExchangeInfoResponseSorsInner.md) | Optional field. Present only when SOR is available. |  [optional] |



