

# SorOrderPlaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**quantity** | **Double** |  |  |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent.&lt;br/&gt; Orders with the same &#x60;newClientOrderID&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**icebergQty** | **Double** | Used with &#x60;LIMIT&#x60; to create an iceberg order. |  [optional] |
|**strategyId** | **Long** |  |  [optional] |
|**strategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



