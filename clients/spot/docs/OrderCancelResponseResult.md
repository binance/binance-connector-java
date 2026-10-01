

# OrderCancelResponseResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**origClientOrderId** | **String** | clientOrderId that was canceled |  [optional] |
|**orderId** | **Long** |  |  [optional] |
|**orderListId** | **Long** | set only for legs of an order list |  [optional] |
|**clientOrderId** | **String** | newClientOrderId from request |  [optional] |
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
|**stopPrice** | **String** | present only if stopPrice set for the order |  [optional] |
|**trailingDelta** | **Long** | present only if trailingDelta set for the order |  [optional] |
|**icebergQty** | **String** | present only if icebergQty set for the order |  [optional] |
|**strategyId** | **Long** | present only if strategyId set for the order |  [optional] |
|**strategyType** | **Long** | present only if strategyType set for the order |  [optional] |
|**selfTradePreventionMode** | **String** |  |  [optional] |
|**preventedMatchId** | **Long** | Appears only if the order expired due to STP. |  [optional] |
|**preventedQuantity** | **String** | Order quantity that expired due to STP. |  [optional] |
|**trailingTime** | **Long** | Time when the trailing order is now active and tracking price changes. |  [optional] |
|**usedSor** | **Boolean** | Field that determines whether order used SOR. |  [optional] |
|**workingFloor** | **String** | Determines whether the order is being filled by the SOR or by the order book. |  [optional] |
|**pegPriceType** | **String** | Price peg type. Only for pegged orders. |  [optional] |
|**pegOffsetType** | **String** | Price peg offset type. Only for pegged orders, if requested. |  [optional] |
|**pegOffsetValue** | **Long** | Price peg offset value. Only for pegged orders, if requested. |  [optional] |
|**peggedPrice** | **String** | Current price order is pegged at. Only for pegged orders, once determined. |  [optional] |
|**expiryReason** | **String** | Cause of the order&#39;s expiration. Appears when an order has expired. |  [optional] |
|**contingencyType** | **String** |  |  [optional] |
|**listStatusType** | **String** |  |  [optional] |
|**listOrderStatus** | **String** |  |  [optional] |
|**listClientOrderId** | **String** |  |  [optional] |
|**transactionTime** | **Long** |  |  [optional] |
|**orders** | [**List&lt;OpenOrdersCancelAllResponseResultInnerOrdersInner&gt;**](OpenOrdersCancelAllResponseResultInnerOrdersInner.md) |  |  [optional] |
|**orderReports** | [**List&lt;OpenOrdersCancelAllResponseResultInnerOrderReportsInner&gt;**](OpenOrdersCancelAllResponseResultInnerOrderReportsInner.md) | order list order&#39;s status format is the same as for individual orders. |  [optional] |



