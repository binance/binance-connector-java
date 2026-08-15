

# DeleteOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**orderId** | **Long** |  |  [optional] |
|**orderListId** | **Long** | Unless it&#39;s part of an order list, value will be -1 |  [optional] |
|**origClientOrderId** | **String** |  |  [optional] |
|**clientOrderId** | **String** |  |  [optional] |
|**transactTime** | **Long** |  |  [optional] |
|**price** | **String** |  |  [optional] |
|**origQty** | **String** |  |  [optional] |
|**executedQty** | **String** |  |  [optional] |
|**origQuoteOrderQty** | **String** |  |  [optional] |
|**cummulativeQuoteQty** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**timeInForce** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**side** | **String** |  |  [optional] |
|**selfTradePreventionMode** | **String** |  |  [optional] |
|**icebergQty** | **String** | Quantity for the iceberg order. Appears only if the parameter &#x60;icebergQty&#x60; was sent in the request. |  [optional] |
|**preventedMatchId** | **Long** | When used together with &#x60;symbol&#x60;, can be used to query a prevented match. Appears only if the order expired due to STP. |  [optional] |
|**preventedQuantity** | **String** | Order quantity that expired due to STP. Appears only if the order expired due to STP. |  [optional] |
|**stopPrice** | **String** | Price when the algorithmic order will be triggered. Appears for &#x60;STOP_LOSS&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;STOP_LOSS_LIMIT&#x60;, and &#x60;TAKE_PROFIT_LIMIT&#x60; orders. |  [optional] |
|**strategyId** | **Long** | Can be used to label an order that&#39;s part of an order strategy. Appears if the parameter was populated in the request. |  [optional] |
|**strategyType** | **Long** | Can be used to label an order that is using an order strategy. Appears if the parameter was populated in the request. |  [optional] |
|**trailingDelta** | **Long** | Delta price change required before order activation. Appears for trailing stop orders. |  [optional] |
|**trailingTime** | **Long** | Time when the trailing order becomes active and starts tracking price changes. Appears only for trailing stop orders. |  [optional] |
|**usedSor** | **Boolean** | Indicates whether the order used SOR. Appears when placing orders using SOR. |  [optional] |
|**workingFloor** | **String** | Indicates whether the order is being filled by SOR or by the order book to which it was submitted. Appears when placing orders using SOR. |  [optional] |
|**pegPriceType** | **String** | Price peg type. Only for pegged orders. |  [optional] |
|**pegOffsetType** | **String** | Price peg offset type. Only for pegged orders, if requested. |  [optional] |
|**pegOffsetValue** | **Long** | Price peg offset value. Only for pegged orders, if requested. |  [optional] |
|**peggedPrice** | **String** | Current price the order is pegged at. Only for pegged orders, once determined. |  [optional] |
|**expiryReason** | **String** | Cause of the order&#39;s expiration. Returned when an order has expired. |  [optional] |



