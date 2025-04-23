

# OrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**reduceOnly** | **Boolean** |  |  [optional] |
|**postOnly** | **Boolean** |  |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**clientOrderId** | **String** |  |  [optional] |
|**isMmp** | **Boolean** |  |  [optional] |



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



## Enum: NewOrderRespTypeEnum

| Name | Value |
|---- | -----|
| ACK | &quot;ACK&quot; |
| RESULT | &quot;RESULT&quot; |



