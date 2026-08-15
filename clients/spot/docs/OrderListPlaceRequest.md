

# OrderListPlaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**price** | **Double** |  |  |
|**quantity** | **Double** |  |  |
|**listClientOrderId** | **String** | A unique Id for the entire orderList |  [optional] |
|**limitClientOrderId** | **String** | A unique Id for the limit order |  [optional] |
|**limitIcebergQty** | **Double** | Used to make the &#x60;LIMIT_MAKER&#x60; leg an iceberg order. |  [optional] |
|**limitStrategyId** | **Long** |  |  [optional] |
|**limitStrategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**stopPrice** | **Double** |  |  [optional] |
|**trailingDelta** | **Integer** |  |  [optional] |
|**stopClientOrderId** | **String** | A unique Id for the stop loss/stop loss limit leg |  [optional] |
|**stopLimitPrice** | **Double** | If provided, &#x60;stopLimitTimeInForce&#x60; is required. |  [optional] |
|**stopLimitTimeInForce** | **StopLimitTimeInForce** |  |  [optional] |
|**stopIcebergQty** | **Double** | Used with &#x60;STOP_LOSS_LIMIT&#x60; leg to make an iceberg order. |  [optional] |
|**stopStrategyId** | **Long** |  |  [optional] |
|**stopStrategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



