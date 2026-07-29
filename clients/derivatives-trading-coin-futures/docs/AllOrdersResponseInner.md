

# AllOrdersResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**avgPrice** | **String** | Average execution price |  [optional] |
|**clientOrderId** | **String** | Client order ID. |  [optional] |
|**cumBase** | **String** | Cumulative base asset amount. |  [optional] |
|**executedQty** | **String** | Executed quantity |  [optional] |
|**orderId** | **Long** | Sub-order ID |  [optional] |
|**origQty** | **String** | Original order quantity |  [optional] |
|**origType** | **String** | Original order type. |  [optional] |
|**price** | **String** | Latest token price. |  [optional] |
|**reduceOnly** | **Boolean** | Whether the order is reduce-only. |  [optional] |
|**side** | **String** | Trading side |  [optional] |
|**positionSide** | **String** | Position side |  [optional] |
|**status** | **String** | Enum：completed，processing |  [optional] |
|**stopPrice** | **String** | please ignore when order type is TRAILING_STOP_MARKET |  [optional] |
|**closePosition** | **Boolean** | if Close-All |  [optional] |
|**symbol** | **String** | Trading symbol |  [optional] |
|**pair** | **String** | Pair |  [optional] |
|**time** | **Long** | Time |  [optional] |
|**timeInForce** | **String** | Time in force |  [optional] |
|**type** | **String** | Order type. |  [optional] |
|**activatePrice** | **String** | activation price, only return with TRAILING_STOP_MARKET order |  [optional] |
|**priceRate** | **String** | callback rate, only return with TRAILING_STOP_MARKET order |  [optional] |
|**updateTime** | **Long** | update time |  [optional] |
|**workingType** | **String** | Stop trigger price type. |  [optional] |
|**priceProtect** | **Boolean** | if conditional order trigger is protected |  [optional] |
|**priceMatch** | **String** | price match mode |  [optional] |
|**selfTradePreventionMode** | **String** | self trading preventation mode |  [optional] |



