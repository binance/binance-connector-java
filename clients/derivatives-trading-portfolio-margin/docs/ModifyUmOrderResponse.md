

# ModifyUmOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**status** | **String** | Enum：completed，processing |  [optional] |
|**clientOrderId** | **String** | Client Order ID. |  [optional] |
|**modifyId** | **Long** | user-defined modification identifier, only returned if provided in the request |  [optional] |
|**price** | **String** | Price. |  [optional] |
|**avgPrice** | **String** | Avg Price. |  [optional] |
|**origQty** | **String** | Orig Qty. |  [optional] |
|**executedQty** | **String** | Executed Qty. |  [optional] |
|**cumQty** | **String** | Cum Qty. |  [optional] |
|**cumQuote** | **String** | Cum Quote. |  [optional] |
|**timeInForce** | **String** | Time In Force. |  [optional] |
|**type** | **String** | Normal order type after trigger if appliable |  [optional] |
|**reduceOnly** | **Boolean** | Reduce Only. |  [optional] |
|**side** | **String** | Side. |  [optional] |
|**positionSide** | **String** | BOTH means that it is the position of One-way Mode |  [optional] |
|**origType** | **String** | Orig Type. |  [optional] |
|**selfTradePreventionMode** | **String** | self trading preventation mode |  [optional] |
|**goodTillDate** | **Long** | order pre-set auot cancel time for TIF GTD order |  [optional] |
|**updateTime** | **Long** | last update time |  [optional] |
|**priceMatch** | **String** | Price Match. |  [optional] |



