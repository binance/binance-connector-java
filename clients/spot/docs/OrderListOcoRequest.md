

# OrderListOcoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**listClientOrderId** | **String** | Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;aboveClientOrderId&#x60; and the &#x60;belowClientOrderId&#x60;. |  [optional] |
|**side** | **Side** |  |  |
|**quantity** | **Double** | Quantity for both orders of the order list. |  |
|**aboveType** | **AboveType** |  |  |
|**aboveClientOrderId** | **String** | Arbitrary unique ID among open orders for the above order. Automatically generated if not sent. |  [optional] |
|**aboveIcebergQty** | **Long** | Note that this can only be used if &#x60;aboveTimeInForce&#x60; is &#x60;GTC&#x60;. |  [optional] |
|**abovePrice** | **Double** | Can be used if &#x60;aboveType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, or &#x60;TAKE_PROFIT_LIMIT&#x60; to specify the limit price. |  [optional] |
|**aboveStopPrice** | **Double** | Can be used if &#x60;aboveType&#x60; is &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60;. Either &#x60;aboveStopPrice&#x60; or &#x60;aboveTrailingDelta&#x60; or both, must be specified. |  [optional] |
|**aboveTrailingDelta** | **Long** | See [Trailing Stop order FAQ](/products/spot/faqs/trailing-stop-faq) |  [optional] |
|**aboveTimeInForce** | **AboveTimeInForce** |  |  [optional] |
|**aboveStrategyId** | **Long** | Arbitrary numeric value identifying the above order within an order strategy. |  [optional] |
|**aboveStrategyType** | **Integer** | Arbitrary numeric value identifying the above order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**abovePegPriceType** | **AbovePegPriceType** |  |  [optional] |
|**abovePegOffsetType** | **AbovePegOffsetType** |  |  [optional] |
|**abovePegOffsetValue** | **Integer** |  |  [optional] |
|**belowType** | **BelowType** |  |  |
|**belowClientOrderId** | **String** | Arbitrary unique ID among open orders for the below order. Automatically generated if not sent. |  [optional] |
|**belowIcebergQty** | **Long** | Note that this can only be used if &#x60;belowTimeInForce&#x60; is &#x60;GTC&#x60;. |  [optional] |
|**belowPrice** | **Double** | Can be used if &#x60;belowType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;LIMIT_MAKER&#x60;, or &#x60;TAKE_PROFIT_LIMIT&#x60; to specify the limit price. |  [optional] |
|**belowStopPrice** | **Double** | Can be used if &#x60;belowType&#x60; is &#x60;STOP_LOSS&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_LIMIT&#x60;. Either &#x60;belowStopPrice&#x60; or &#x60;belowTrailingDelta&#x60; or both, must be specified. |  [optional] |
|**belowTrailingDelta** | **Long** | See [Trailing Stop order FAQ](/products/spot/faqs/trailing-stop-faq) |  [optional] |
|**belowTimeInForce** | **BelowTimeInForce** |  |  [optional] |
|**belowStrategyId** | **Long** | Arbitrary numeric value identifying the below order within an order strategy. |  [optional] |
|**belowStrategyType** | **Integer** | Arbitrary numeric value identifying the below order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**belowPegPriceType** | **BelowPegPriceType** |  |  [optional] |
|**belowPegOffsetType** | **BelowPegOffsetType** |  |  [optional] |
|**belowPegOffsetValue** | **Integer** |  |  [optional] |
|**newOrderRespType** | **NewOrderRespType** |  |  [optional] |
|**selfTradePreventionMode** | **SelfTradePreventionMode** |  |  [optional] |
|**recvWindow** | **Double** | The value cannot be greater than &#x60;60000&#x60;. Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



