

# OrderOcoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**listClientOrderId** | **String** | A unique Id for the entire orderList |  [optional] |
|**side** | **Side** |  |  |
|**quantity** | **Double** |  |  |
|**limitClientOrderId** | **String** | A unique Id for the limit order |  [optional] |
|**price** | **Double** |  |  |
|**limitStrategyId** | **Long** |  |  [optional] |
|**limitStrategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**limitIcebergQty** | **Double** | Used to make the &#x60;LIMIT_MAKER&#x60; leg an iceberg order. |  [optional] |
|**trailingDelta** | **Long** |  |  [optional] |
|**stopClientOrderId** | **String** | A unique Id for the stop loss/stop loss limit leg |  [optional] |
|**stopPrice** | **Double** |  |  |
|**stopStrategyId** | **Long** |  |  [optional] |
|**stopStrategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**stopLimitPrice** | **Double** | If provided, &#x60;stopLimitTimeInForce&#x60; is required. |  [optional] |
|**stopIcebergQty** | **Double** | Used with &#x60;STOP_LOSS_LIMIT&#x60; leg to make an iceberg order. |  [optional] |
|**stopLimitTimeInForce** | **StopLimitTimeInForce** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Double** | The value cannot be greater than &#x60;60000&#x60;. &lt;br&gt; Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



