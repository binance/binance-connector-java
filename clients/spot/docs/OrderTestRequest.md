

# OrderTestRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**computeCommissionRates** | **Boolean** | Default: &#x60;false&#x60; &lt;br&gt; See [Commissions FAQ](/products/spot/faqs/commission_faq#test-order-diferences) to learn more. |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**type** | **OrderType** |  |  |
|**timeInForce** | **TimeInForce** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**quoteOrderQty** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Orders with the same &#x60;newClientOrderID&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, and &#x60;TAKE_PROFIT_LIMIT&#x60; orders. |  [optional] |
|**trailingDelta** | **Integer** | See [Trailing Stop order FAQ](/products/spot/faqs/trailing-stop-faq) |  [optional] |
|**icebergQty** | **Double** | Used with &#x60;LIMIT&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, and &#x60;TAKE_PROFIT_LIMIT&#x60; to create an iceberg order. |  [optional] |
|**strategyId** | **Long** |  |  [optional] |
|**strategyType** | **Integer** | The value cannot be less than &#x60;1000000&#x60;. |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**pegPriceType** | **PegPriceType** |  |  [optional] |
|**pegOffsetValue** | **Integer** | Price level for pegging (max: 100). See [Pegged Orders](/products/spot/faqs/pegged_orders) |  [optional] |
|**pegOffsetType** | **PegOffsetType** |  |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



