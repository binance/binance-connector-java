

# NewOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id. |  [optional] |
|**symbol** | **String** | Symbol. |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**price** | **Double** | Price. |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**goodTillDate** | **Long** | order cancel time for timeInForce &#x60;GTD&#x60;, mandatory when &#x60;timeInforce&#x60; set to &#x60;GTD&#x60;; order the timestamp only retains second-level precision, ms part will be ignored; The goodTillDate timestamp must be greater than the current time plus 600 seconds and smaller than 253402300799000 |  [optional] |
|**recvWindow** | **Long** | Recv Window. |  [optional] |



