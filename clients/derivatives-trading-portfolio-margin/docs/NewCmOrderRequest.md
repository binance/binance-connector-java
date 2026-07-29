

# NewCmOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** | Place amount |  [optional] |
|**reduceOnly** | **ReduceOnly** |  |  [optional] |
|**price** | **Double** | Order price |  [optional] |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,32}$&#x60; |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



