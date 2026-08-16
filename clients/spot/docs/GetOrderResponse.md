

# GetOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | symbol. |  [optional] |
|**orderId** | **Long** | order Id. |  [optional] |
|**orderListId** | **Long** | This field will always have a value of -1 if not an order list. |  [optional] |
|**clientOrderId** | **String** | client Order Id. |  [optional] |
|**price** | **String** | price. |  [optional] |
|**origQty** | **String** | orig Qty. |  [optional] |
|**executedQty** | **String** | executed Qty. |  [optional] |
|**origQuoteOrderQty** | **String** | orig Quote Order Qty. |  [optional] |
|**cummulativeQuoteQty** | **String** | cummulative Quote Qty. |  [optional] |
|**status** | **String** | status. |  [optional] |
|**timeInForce** | **String** | time In Force. |  [optional] |
|**type** | **String** | type. |  [optional] |
|**side** | **String** | side. |  [optional] |
|**stopPrice** | **String** | Appears for STOP_LOSS, TAKE_PROFIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT orders. |  [optional] |
|**icebergQty** | **String** | Appears only if the parameter icebergQty was sent in the request. |  [optional] |
|**time** | **Long** | time. |  [optional] |
|**updateTime** | **Long** | update Time. |  [optional] |
|**isWorking** | **Boolean** | is Working. |  [optional] |
|**workingTime** | **Long** | working Time. |  [optional] |
|**selfTradePreventionMode** | **String** | self Trade Prevention Mode. |  [optional] |
|**preventedMatchId** | **Long** | Appears only if the order expired due to STP. |  [optional] |
|**preventedQuantity** | **String** | Order quantity that expired due to STP. |  [optional] |
|**strategyId** | **Long** | Appears only if the strategyId parameter was provided upon order placement. |  [optional] |
|**strategyType** | **Long** | Appears only if the strategyType parameter was provided upon order placement. |  [optional] |
|**trailingDelta** | **Long** | Delta price change required before order activation. |  [optional] |
|**trailingTime** | **Long** | Time when the trailing order is now active and tracking price changes. |  [optional] |
|**usedSor** | **Boolean** | Field that determines whether order used SOR. |  [optional] |
|**workingFloor** | **String** | Determines whether the order is being filled by the SOR or by the order book. |  [optional] |
|**pegPriceType** | **String** | Price peg type. Only for pegged orders. |  [optional] |
|**pegOffsetType** | **String** | Price peg offset type. Only for pegged orders, if requested. |  [optional] |
|**pegOffsetValue** | **Long** | Price peg offset value. Only for pegged orders, if requested. |  [optional] |
|**peggedPrice** | **String** | Current price order is pegged at. Only for pegged orders, once determined. |  [optional] |
|**expiryReason** | **String** | Cause of the order&#39;s expiration. Appears when an order has expired. |  [optional] |



