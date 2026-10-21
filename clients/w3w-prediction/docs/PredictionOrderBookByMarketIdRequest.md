

# PredictionOrderBookByMarketIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**marketId** | **String** | Market ID to subscribe to — the &#x60;marketId&#x60; inside &#x60;markets[]&#x60; returned by &#x60;market/list&#x60; or &#x60;market/detail&#x60;. It is **not** &#x60;marketTopicId&#x60; and **not** &#x60;externalId&#x60;. A wrong id is never rejected: subscribing with &#x60;marketTopicId&#x60;, &#x60;externalId&#x60;, or with a closed or resolved market returns the same successful &#x60;COMMAND&#x60; reply as a correct id and then pushes nothing at all, so a stream that stays silent is far more likely a wrong id than a broken connection. |  [optional] |



