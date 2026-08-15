

# QueryAllUmConditionalOrdersResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newClientStrategyId** | **String** | New Client Strategy ID. |  [optional] |
|**strategyId** | **Long** | Strategy ID. |  [optional] |
|**strategyStatus** | **String** | Strategy Status. |  [optional] |
|**strategyType** | **String** | Strategy Type. |  [optional] |
|**origQty** | **String** | Orig Qty. |  [optional] |
|**price** | **String** | Price. |  [optional] |
|**reduceOnly** | **Boolean** | Reduce Only. |  [optional] |
|**side** | **String** | Side. |  [optional] |
|**positionSide** | **String** | BOTH means that it is the position of One-way Mode |  [optional] |
|**stopPrice** | **String** | please ignore when order type is TRAILING_STOP_MARKET |  [optional] |
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**status** | **String** | Normal order status after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**bookTime** | **Long** | order time |  [optional] |
|**updateTime** | **Long** | last update time |  [optional] |
|**triggerTime** | **Long** | Trigger Time. |  [optional] |
|**timeInForce** | **String** | Time In Force. |  [optional] |
|**type** | **String** | Normal order type after trigger if appliable |  [optional] |
|**activatePrice** | **String** | activation price, only return with TRAILING_STOP_MARKET order |  [optional] |
|**priceRate** | **String** | callback rate, only return with TRAILING_STOP_MARKET order |  [optional] |
|**selfTradePreventionMode** | **String** | self trading preventation mode |  [optional] |
|**goodTillDate** | **Long** | order pre-set auot cancel time for TIF GTD order |  [optional] |
|**priceMatch** | **String** | Price Match. |  [optional] |



