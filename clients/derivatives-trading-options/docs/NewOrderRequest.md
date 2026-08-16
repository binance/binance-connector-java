

# NewOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**type** | **OrderType** |  |  |
|**quantity** | **Double** | Order Quantity |  |
|**price** | **Double** | Order Price |  [optional] |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**reduceOnly** | **Boolean** |  |  [optional] |
|**postOnly** | **Boolean** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**clientOrderId** | **String** | User-defined order ID cannot be repeated in pending orders |  [optional] |
|**isMmp** | **Boolean** | is market maker protection order |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



