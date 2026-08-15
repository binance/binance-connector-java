

# NewOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** | Quantity measured by contract number, Cannot be sent with &#x60;closePosition&#x60;&#x3D;&#x60;true&#x60; |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**closePosition** | **ClosePosition** |  |  [optional] |
|**activationPrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders, default as the latest price(supporting different workingType) |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders, min 0.1, max 10 where 1 for 1% |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



