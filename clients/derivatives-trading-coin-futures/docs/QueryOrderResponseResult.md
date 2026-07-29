

# QueryOrderResponseResult

Indicates that combined is set to true.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **Long** | Sub-order ID |  [optional] |
|**symbol** | **String** | Trading symbol |  [optional] |
|**pair** | **String** | Pair |  [optional] |
|**status** | **String** | Enum：completed，processing |  [optional] |
|**clientOrderId** | **String** | Client order ID. |  [optional] |
|**price** | **String** | Latest token price. |  [optional] |
|**avgPrice** | **String** | Average execution price |  [optional] |
|**origQty** | **String** | Original order quantity |  [optional] |
|**executedQty** | **String** | Executed quantity |  [optional] |
|**cumQty** | **String** | Cumulative filled quantity. |  [optional] |
|**cumBase** | **String** | Cumulative base asset amount. |  [optional] |
|**timeInForce** | **String** | Time in force |  [optional] |
|**type** | **String** | Order type. |  [optional] |
|**reduceOnly** | **Boolean** | Whether the order is reduce-only. |  [optional] |
|**closePosition** | **Boolean** | if Close-All |  [optional] |
|**side** | **String** | Trading side |  [optional] |
|**positionSide** | **String** | Position side |  [optional] |
|**stopPrice** | **String** | please ignore when order type is TRAILING_STOP_MARKET |  [optional] |
|**workingType** | **String** | Stop trigger price type. |  [optional] |
|**priceProtect** | **Boolean** | if conditional order trigger is protected |  [optional] |
|**origType** | **String** | Original order type. |  [optional] |
|**selfTradePreventionMode** | **String** | self trading preventation mode |  [optional] |
|**time** | **Long** | Time |  [optional] |
|**updateTime** | **Long** | update time |  [optional] |
|**priceMatch** | **String** | price match mode |  [optional] |



