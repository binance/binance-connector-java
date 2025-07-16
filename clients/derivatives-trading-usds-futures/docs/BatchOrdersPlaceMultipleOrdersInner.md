

# BatchOrdersPlaceMultipleOrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) |  |  [optional] |
|**positionSide** | [**PositionSideEnum**](#PositionSideEnum) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**reduceOnly** | **String** |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** |  |  [optional] |
|**stopPrice** | **Double** |  |  [optional] |
|**activationPrice** | **Double** |  |  [optional] |
|**callbackRate** | **Double** |  |  [optional] |
|**workingType** | [**WorkingTypeEnum**](#WorkingTypeEnum) |  |  [optional] |
|**priceProtect** | **String** |  |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**priceMatch** | [**PriceMatchEnum**](#PriceMatchEnum) |  |  [optional] |
|**selfTradePreventionMode** | [**SelfTradePreventionModeEnum**](#SelfTradePreventionModeEnum) |  |  [optional] |
|**goodTillDate** | **Long** |  |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



## Enum: PositionSideEnum

| Name | Value |
|---- | -----|
| BOTH | &quot;BOTH&quot; |
| LONG | &quot;LONG&quot; |
| SHORT | &quot;SHORT&quot; |



## Enum: TimeInForceEnum

| Name | Value |
|---- | -----|
| GTC | &quot;GTC&quot; |
| IOC | &quot;IOC&quot; |
| FOK | &quot;FOK&quot; |
| GTX | &quot;GTX&quot; |
| GTD | &quot;GTD&quot; |



## Enum: WorkingTypeEnum

| Name | Value |
|---- | -----|
| MARK_PRICE | &quot;MARK_PRICE&quot; |
| CONTRACT_PRICE | &quot;CONTRACT_PRICE&quot; |



## Enum: NewOrderRespTypeEnum

| Name | Value |
|---- | -----|
| ACK | &quot;ACK&quot; |
| RESULT | &quot;RESULT&quot; |



## Enum: PriceMatchEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| OPPONENT | &quot;OPPONENT&quot; |
| OPPONENT_5 | &quot;OPPONENT_5&quot; |
| OPPONENT_10 | &quot;OPPONENT_10&quot; |
| OPPONENT_20 | &quot;OPPONENT_20&quot; |
| QUEUE | &quot;QUEUE&quot; |
| QUEUE_5 | &quot;QUEUE_5&quot; |
| QUEUE_10 | &quot;QUEUE_10&quot; |
| QUEUE_20 | &quot;QUEUE_20&quot; |



## Enum: SelfTradePreventionModeEnum

| Name | Value |
|---- | -----|
| EXPIRE_TAKER | &quot;EXPIRE_TAKER&quot; |
| EXPIRE_BOTH | &quot;EXPIRE_BOTH&quot; |
| EXPIRE_MAKER | &quot;EXPIRE_MAKER&quot; |



