

# OrderPlaceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**quoteOrderQty** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent.&lt;br/&gt; Orders with the same &#x60;newClientOrderID&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, and &#x60;TAKE_PROFIT_LIMIT&#x60; orders. |  [optional] |
|**trailingDelta** | **Integer** | See Trailing Stop order FAQ |  [optional] |
|**icebergQty** | **Double** | Used with &#x60;LIMIT&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, and &#x60;TAKE_PROFIT_LIMIT&#x60; to create an iceberg order. |  [optional] |
|**strategyId** | **Long** |  |  [optional] |
|**strategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**pegPriceType** | **PegPriceType** |  |  [optional] |
|**pegOffsetValue** | **Integer** | Price level to peg the price to (max: 100). See Pegged Orders Info |  [optional] |
|**pegOffsetType** | **PegOffsetType** |  |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



