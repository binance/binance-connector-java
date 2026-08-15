

# AllOrdersResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**orderId** | **Long** |  |  [optional] |
|**orderListId** | **Long** | Unless it&#39;s part of an order list, value will be -1 |  [optional] |
|**clientOrderId** | **String** |  |  [optional] |
|**price** | **String** |  |  [optional] |
|**origQty** | **String** |  |  [optional] |
|**executedQty** | **String** |  |  [optional] |
|**cummulativeQuoteQty** | **String** |  |  [optional] |
|**status** | **String** |  |  [optional] |
|**timeInForce** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**side** | **String** |  |  [optional] |
|**stopPrice** | **String** | Appears for STOP_LOSS, TAKE_PROFIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT orders. |  [optional] |
|**icebergQty** | **String** | Appears only if the parameter icebergQty was sent in the request. |  [optional] |
|**time** | **Long** |  |  [optional] |
|**updateTime** | **Long** |  |  [optional] |
|**isWorking** | **Boolean** |  |  [optional] |
|**origQuoteOrderQty** | **String** |  |  [optional] |
|**workingTime** | **Long** |  |  [optional] |
|**selfTradePreventionMode** | **String** |  |  [optional] |
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



