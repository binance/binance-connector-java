

# CancelMarginAccountAllOpenOrdersOnASymbolResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**origClientOrderId** | **String** | Orig Client Order ID. |  [optional] |
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**orderListId** | **Long** | Order List ID. |  [optional] |
|**clientOrderId** | **String** | Client Order ID. |  [optional] |
|**price** | **String** | Price. |  [optional] |
|**origQty** | **String** | Orig Qty. |  [optional] |
|**executedQty** | **String** | Executed Qty. |  [optional] |
|**cummulativeQuoteQty** | **String** | Cummulative Quote Qty. |  [optional] |
|**status** | **String** | Enum：completed，processing |  [optional] |
|**timeInForce** | **String** | Time In Force. |  [optional] |
|**type** | **String** | Normal order type after trigger if appliable |  [optional] |
|**side** | **String** | Side. |  [optional] |
|**contingencyType** | **String** | Contingency Type. |  [optional] |
|**listStatusType** | **String** | List Status Type. |  [optional] |
|**listOrderStatus** | **String** | List Order Status. |  [optional] |
|**listClientOrderId** | **String** | List Client Order ID. |  [optional] |
|**transactionTime** | **Long** | Transaction Time. |  [optional] |
|**orders** | [**List&lt;CancelMarginAccountAllOpenOrdersOnASymbolResponseInnerOrdersInner&gt;**](CancelMarginAccountAllOpenOrdersOnASymbolResponseInnerOrdersInner.md) | Orders. |  [optional] |
|**orderReports** | [**List&lt;CancelMarginAccountAllOpenOrdersOnASymbolResponseInnerOrderReportsInner&gt;**](CancelMarginAccountAllOpenOrdersOnASymbolResponseInnerOrderReportsInner.md) | Order Reports. |  [optional] |



