

# OrderListOpoRequest


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
|**workingPrice** | **Double** | Price for the working order. |  |
|**workingQuantity** | **Double** | Sets the quantity for the working order. |  |
|**workingIcebergQty** | **Double** | This can only be used if &#x60;workingTimeInForce&#x60; is &#x60;GTC&#x60;, or if &#x60;workingType&#x60; is &#x60;LIMIT_MAKER&#x60;. |  [optional] |
|**workingTimeInForce** | **WorkingTimeInForce** |  |  [optional] |
|**workingStrategyId** | **Long** | Arbitrary numeric value identifying the working order within an order strategy. |  [optional] |
|**workingStrategyType** | **Integer** | Arbitrary numeric value identifying the working order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**workingPegPriceType** | **WorkingPegPriceType** |  |  [optional] |
|**workingPegOffsetType** | **WorkingPegOffsetType** |  |  [optional] |
|**workingPegOffsetValue** | **Integer** |  |  [optional] |
|**pendingType** | **PendingType** |  |  |
|**pendingSide** | **PendingSide** |  |  |
|**pendingClientOrderId** | **String** | Arbitrary unique ID among open orders for the pending order. Automatically generated if not sent. |  [optional] |
|**pendingPrice** | **Double** | Price for the pending order. |  [optional] |
|**pendingStopPrice** | **Double** | Stop price for the pending order. |  [optional] |
|**pendingTrailingDelta** | **Double** | Trailing delta for the pending order. |  [optional] |
|**pendingIcebergQty** | **Double** | This can only be used if &#x60;pendingTimeInForce&#x60; is &#x60;GTC&#x60; or if &#x60;pendingType&#x60; is &#x60;LIMIT_MAKER&#x60;. |  [optional] |
|**pendingTimeInForce** | **PendingTimeInForce** |  |  [optional] |
|**pendingStrategyId** | **Long** | Arbitrary numeric value identifying the pending order within an order strategy. |  [optional] |
|**pendingStrategyType** | **Integer** | Arbitrary numeric value identifying the pending order strategy. Values smaller than &#x60;1000000&#x60; are reserved and cannot be used. |  [optional] |
|**pendingPegPriceType** | **PendingPegPriceType** |  |  [optional] |
|**pendingPegOffsetType** | **PendingPegOffsetType** |  |  [optional] |
|**pendingPegOffsetValue** | **Integer** |  |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



