

# TestOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**quantity** | **Double** | Cannot be sent with &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60;(Close-All) |  [optional] |
|**price** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**closePosition** | **ClosePosition** |  |  [optional] |
|**activationPrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders, default as the latest price(supporting different &#x60;workingType&#x60;) |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders |  [optional] |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**goodTillDate** | **Long** | order cancel time for timeInForce &#x60;GTD&#x60;, mandatory when &#x60;timeInforce&#x60; set to &#x60;GTD&#x60;; order the timestamp only retains second-level precision, ms part will be ignored; The goodTillDate timestamp must be greater than the current time plus 600 seconds and smaller than 253402300799000 |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



