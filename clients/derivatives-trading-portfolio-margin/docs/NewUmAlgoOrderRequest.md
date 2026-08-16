

# NewUmAlgoOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**algoType** | **AlgoType** |  |  |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** | Order quantity |  |
|**price** | **Double** | Order price |  [optional] |
|**triggerPrice** | **Double** | Trigger price |  [optional] |
|**workingType** | **WorkingType** |  |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**priceProtect** | **PriceProtect** |  |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**activatePrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60;, default as latest price |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60;, min 0.1, max 10 (1 &#x3D; 1%) |  [optional] |
|**clientAlgoId** | **String** | Unique id among open orders. Auto-generated if not sent |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**goodTillDate** | **Long** | Order cancel time for &#x60;GTD&#x60; timeInForce, mandatory when timeInForce is &#x60;GTD&#x60; |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



