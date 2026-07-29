

# OrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**side** | [**SideEnum**](#SideEnum) |  |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**quantity** | **Double** | Order Quantity |  |
|**price** | **Double** | Order Price |  [optional] |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**reduceOnly** | **Boolean** |  |  [optional] |
|**postOnly** | **Boolean** |  |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**clientOrderId** | **String** | User-defined order ID cannot be repeated in pending orders |  [optional] |
|**isMmp** | **Boolean** | is market maker protection order |  [optional] |
|**selfTradePreventionMode** | [**SelfTradePreventionModeEnum**](#SelfTradePreventionModeEnum) | EXPIRE_TAKER:expire taker order when STP triggers/ EXPIRE_MAKER:expire maker order when STP triggers/ EXPIRE_BOTH:expire both orders when STP triggers; Default EXPIRE_MAKER |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIMIT | &quot;LIMIT&quot; |



## Enum: TimeInForceEnum

| Name | Value |
|---- | -----|
| GTC | &quot;GTC&quot; |
| IOC | &quot;IOC&quot; |
| FOK | &quot;FOK&quot; |
| GTX | &quot;GTX&quot; |



## Enum: NewOrderRespTypeEnum

| Name | Value |
|---- | -----|
| ACK | &quot;ACK&quot; |
| RESULT | &quot;RESULT&quot; |



## Enum: SelfTradePreventionModeEnum

| Name | Value |
|---- | -----|
| EXPIRE_TAKER | &quot;EXPIRE_TAKER&quot; |
| EXPIRE_MAKER | &quot;EXPIRE_MAKER&quot; |
| EXPIRE_BOTH | &quot;EXPIRE_BOTH&quot; |



