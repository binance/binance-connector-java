

# NewCmConditionalOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**strategyType** | **StrategyType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**reduceOnly** | **String** | \&quot;true\&quot; or \&quot;false\&quot;. default \&quot;false\&quot;. Cannot be sent in Hedge Mode |  [optional] |
|**price** | **Double** |  |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**newClientStrategyId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**activationPrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders. |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders. |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



