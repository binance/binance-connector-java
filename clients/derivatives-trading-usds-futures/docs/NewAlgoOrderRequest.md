

# NewAlgoOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id. |  [optional] |
|**algoType** | **AlgoType** |  |  |
|**symbol** | **String** | Symbol. |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** | Cannot be sent with &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;(Close-All) |  [optional] |
|**price** | **Double** | Price. |  [optional] |
|**triggerPrice** | **Double** | Trigger Price. |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**closePosition** | **ClosePosition** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**activatePrice** | **Double** | Used with TRAILING_STOP_MARKET orders, default as the latest price(supporting different workingType) |  [optional] |
|**callbackRate** | **Double** | Used with TRAILING_STOP_MARKET orders |  [optional] |
|**clientAlgoId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**goodTillDate** | **Long** | order cancel time for timeInForce &#x60;GTD&#x60;, mandatory when &#x60;timeInforce&#x60; set to &#x60;GTD&#x60;; order the timestamp only retains second-level precision, ms part will be ignored; The goodTillDate timestamp must be greater than the current time plus 600 seconds and smaller than 253402300799000 |  [optional] |
|**recvWindow** | **Long** | Recv Window. |  [optional] |



