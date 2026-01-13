

# OrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**quantity** | **String** |  |  [optional] |
|**price** | **String** |  |  [optional] |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**reduceOnly** | **String** |  |  [optional] |
|**postOnly** | **String** |  |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**clientOrderId** | **String** |  |  [optional] |
|**isMmp** | **String** |  |  [optional] |



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



