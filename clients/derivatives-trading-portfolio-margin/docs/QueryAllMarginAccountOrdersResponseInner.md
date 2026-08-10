

# QueryAllMarginAccountOrdersResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientOrderId** | **String** | Client Order ID. |  [optional] |
|**cummulativeQuoteQty** | **String** | Cummulative Quote Qty. |  [optional] |
|**executedQty** | **String** | Executed Qty. |  [optional] |
|**icebergQty** | **String** | Iceberg Qty. |  [optional] |
|**isWorking** | **Boolean** | Is Working. |  [optional] |
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**origQty** | **String** | Orig Qty. |  [optional] |
|**price** | **String** | Price. |  [optional] |
|**side** | **String** | Side. |  [optional] |
|**status** | **String** | Status. |  [optional] |
|**stopPrice** | **String** | please ignore when order type is TRAILING_STOP_MARKET |  [optional] |
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**time** | **Long** | Event time. |  [optional] |
|**timeInForce** | **String** | Time In Force. |  [optional] |
|**type** | **String** | Normal order type after trigger if appliable |  [optional] |
|**updateTime** | **Long** | last update time |  [optional] |
|**accountId** | **Long** | Account ID. |  [optional] |
|**selfTradePreventionMode** | **String** | self trading preventation mode |  [optional] |
|**preventedMatchId** | **String** | Prevented Match ID. |  [optional] |
|**preventedQuantity** | **String** | Prevented Quantity. |  [optional] |



