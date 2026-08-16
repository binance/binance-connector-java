

# MarginAccountNewOcoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**listClientOrderId** | **String** | A unique Id for the entire orderList |  [optional] |
|**side** | **Side** |  |  |
|**quantity** | **Double** |  |  |
|**limitClientOrderId** | **String** | A unique Id for the limit order |  [optional] |
|**price** | **Double** |  |  |
|**limitIcebergQty** | **Double** |  |  [optional] |
|**stopClientOrderId** | **String** | A unique Id for the stop loss/stop loss limit leg |  [optional] |
|**stopPrice** | **Double** |  |  |
|**stopLimitPrice** | **Double** | If provided, stopLimitTimeInForce is required. |  [optional] |
|**stopIcebergQty** | **Double** |  |  [optional] |
|**stopLimitTimeInForce** | **StopLimitTimeInForce** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**sideEffectType** | **SideEffectType** |  |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



