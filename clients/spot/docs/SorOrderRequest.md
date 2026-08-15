

# SorOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**quantity** | **Double** |  |  |
|**price** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent.&lt;br/&gt; Orders with the same &#x60;newClientOrderID&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected. |  [optional] |
|**strategyId** | **Long** |  |  [optional] |
|**strategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**icebergQty** | **Double** | Used with &#x60;LIMIT&#x60; to create an iceberg order. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Double** | The value cannot be greater than &#x60;60000&#x60;. &lt;br&gt; Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



