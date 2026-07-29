

# NewUmConditionalOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**strategyType** | **StrategyType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**newClientStrategyId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,32}$&#x60; |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**activationPrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders. |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders. |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**goodTillDate** | **Long** | order cancel time for timeInForce &#x60;GTD&#x60;, mandatory when &#x60;timeInforce&#x60; set to &#x60;GTD&#x60;; order the timestamp only retains second-level precision, ms part will be ignored; The goodTillDate timestamp must be greater than the current time plus 600 seconds and smaller than 253402300799000Mode. It must be sent in Hedge Mode. |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



