

# OrderStatusResponseResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**orderId** | **Long** |  |  [optional] |
|**orderListId** | **Long** | Present only for orders that belong to an order list. |  [optional] |
|**clientOrderId** | **String** |  |  [optional] |
|**price** | **String** |  |  [optional] |
|**origQty** | **String** |  |  [optional] |
|**executedQty** | **String** |  |  [optional] |
|**origQuoteOrderQty** | **String** | Always present. Zero if the order type does not use &#x60;quoteOrderQty&#x60;. |  [optional] |
|**cummulativeQuoteQty** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**timeInForce** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**side** | **String** |  |  [optional] |
|**stopPrice** | **String** | Always present. Zero if the order type does not use &#x60;stopPrice&#x60;. |  [optional] |
|**trailingDelta** | **Long** | Present only if &#x60;trailingDelta&#x60; was set on the order. |  [optional] |
|**trailingTime** | **Long** | Present only if &#x60;trailingDelta&#x60; was set on the order. |  [optional] |
|**icebergQty** | **String** | Always present. Zero for non-iceberg orders. |  [optional] |
|**time** | **Long** | Order placement time. |  [optional] |
|**updateTime** | **Long** | Time of the last update to the order. |  [optional] |
|**isWorking** | **Boolean** |  |  [optional] |
|**workingTime** | **Long** |  |  [optional] |
|**strategyId** | **Long** | Present only if &#x60;strategyId&#x60; was set on the order. |  [optional] |
|**strategyType** | **Long** | Present only if &#x60;strategyType&#x60; was set on the order. |  [optional] |
|**selfTradePreventionMode** | **String** |  |  [optional] |
|**preventedMatchId** | **Long** | Present only if the order expired due to STP. |  [optional] |
|**preventedQuantity** | **String** | Present only if the order expired due to STP. |  [optional] |
|**usedSor** | **Boolean** | Field that determines whether order used SOR. |  [optional] |
|**workingFloor** | **String** | Determines whether the order is being filled by the SOR or by the order book. |  [optional] |
|**pegPriceType** | **String** | Price peg type. Only for pegged orders. |  [optional] |
|**pegOffsetType** | **String** | Price peg offset type. Only for pegged orders, if requested. |  [optional] |
|**pegOffsetValue** | **Long** | Price peg offset value. Only for pegged orders, if requested. |  [optional] |
|**peggedPrice** | **String** | Current price order is pegged at. Only for pegged orders, once determined. |  [optional] |
|**expiryReason** | **String** | Cause of the order&#39;s expiration. Appears when an order has expired. |  [optional] |



