

# OrderListOtocoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**listClientOrderId** | **String** | Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;workingClientOrderId&#x60; and the &#x60;pendingClientOrderId&#x60;. |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**workingType** | **WorkingType** |  |  |
|**workingSide** | **WorkingSide** |  |  |
|**workingClientOrderId** | **String** | Arbitrary unique ID among open orders for the working order. Automatically generated if not sent. |  [optional] |
|**workingPrice** | **Double** |  |  |
|**workingQuantity** | **Double** | Sets the quantity for the working order. |  |
|**workingIcebergQty** | **Double** | This can only be used if &#x60;workingTimeInForce&#x60; is &#x60;GTC&#x60;, or if &#x60;workingType&#x60; is &#x60;LIMIT_MAKER&#x60;. |  [optional] |
|**workingTimeInForce** | **WorkingTimeInForce** |  |  [optional] |
|**workingStrategyId** | **Long** | Arbitrary numeric value identifying the working order within an order strategy. |  [optional] |
|**workingStrategyType** | **Integer** | Arbitrary numeric value identifying the working order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**workingPegPriceType** | **WorkingPegPriceType** |  |  [optional] |
|**workingPegOffsetType** | **WorkingPegOffsetType** |  |  [optional] |
|**workingPegOffsetValue** | **Integer** |  |  [optional] |
|**pendingSide** | **PendingSide** |  |  |
|**pendingQuantity** | **Double** | Sets the quantity for the pending orders. |  |
|**pendingAboveType** | **PendingAboveType** |  |  |
|**pendingAboveClientOrderId** | **String** | Arbitrary unique ID among open orders for the pending above order. Automatically generated if not sent. |  [optional] |
|**pendingAbovePrice** | **Double** | Can be used if &#x60;pendingAboveType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, or &#x60;TAKE_PROFIT_LIMIT&#x60; to specify the limit price. |  [optional] |
|**pendingAboveStopPrice** | **Double** | Can be used if &#x60;pendingAboveType&#x60; is &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60;. |  [optional] |
|**pendingAboveTrailingDelta** | **Double** | See [Trailing Stop order FAQ](/products/spot/faqs/trailing-stop-faq) |  [optional] |
|**pendingAboveIcebergQty** | **Double** | This can only be used if &#x60;pendingAboveTimeInForce&#x60; is &#x60;GTC&#x60; or if &#x60;pendingAboveType&#x60; is &#x60;LIMIT_MAKER&#x60;. |  [optional] |
|**pendingAboveTimeInForce** | **PendingAboveTimeInForce** |  |  [optional] |
|**pendingAboveStrategyId** | **Long** | Arbitrary numeric value identifying the pending above order within an order strategy. |  [optional] |
|**pendingAboveStrategyType** | **Integer** | Arbitrary numeric value identifying the pending above order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**pendingAbovePegPriceType** | **PendingAbovePegPriceType** |  |  [optional] |
|**pendingAbovePegOffsetType** | **PendingAbovePegOffsetType** |  |  [optional] |
|**pendingAbovePegOffsetValue** | **Integer** |  |  [optional] |
|**pendingBelowType** | **PendingBelowType** |  |  [optional] |
|**pendingBelowClientOrderId** | **String** | Arbitrary unique ID among open orders for the pending below order. Automatically generated if not sent. |  [optional] |
|**pendingBelowPrice** | **Double** | Can be used if &#x60;pendingBelowType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60; or &#x60;TAKE_PROFIT_LIMIT&#x60; to specify the limit price. |  [optional] |
|**pendingBelowStopPrice** | **Double** | Can be used if &#x60;pendingBelowType&#x60; is &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60;. Either &#x60;pendingBelowStopPrice&#x60; or &#x60;pendingBelowTrailingDelta&#x60; or both, must be specified. |  [optional] |
|**pendingBelowTrailingDelta** | **Double** | See [Trailing Stop order FAQ](/products/spot/faqs/trailing-stop-faq) |  [optional] |
|**pendingBelowIcebergQty** | **Double** | This can only be used if &#x60;pendingBelowTimeInForce&#x60; is &#x60;GTC&#x60;, or if &#x60;pendingBelowType&#x60; is &#x60;LIMIT_MAKER&#x60;. |  [optional] |
|**pendingBelowTimeInForce** | **PendingBelowTimeInForce** |  |  [optional] |
|**pendingBelowStrategyId** | **Long** | Arbitrary numeric value identifying the pending below order within an order strategy. |  [optional] |
|**pendingBelowStrategyType** | **Integer** | Arbitrary numeric value identifying the pending below order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**pendingBelowPegPriceType** | **PendingBelowPegPriceType** |  |  [optional] |
|**pendingBelowPegOffsetType** | **PendingBelowPegOffsetType** |  |  [optional] |
|**pendingBelowPegOffsetValue** | **Integer** |  |  [optional] |
|**recvWindow** | **Double** | The value cannot be greater than &#x60;60000&#x60;. Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



