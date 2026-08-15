

# BatchOrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) |  |  [optional] |
|**positionSide** | [**PositionSideEnum**](#PositionSideEnum) | Default &#x60;BOTH&#x60; for One-way Mode; &#x60;LONG&#x60; or &#x60;SHORT&#x60; for Hedge Mode. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**quantity** | **Double** |  |  [optional] |
|**reduceOnly** | [**ReduceOnlyEnum**](#ReduceOnlyEnum) |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**newClientOrderId** | **String** |  |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**priceMatch** | [**PriceMatchEnum**](#PriceMatchEnum) | only avaliable for LIMIT/STOP/TAKE_PROFIT order; Can&#39;t be passed together with price |  [optional] |
|**selfTradePreventionMode** | [**SelfTradePreventionModeEnum**](#SelfTradePreventionModeEnum) | EXPIRE_TAKER:expire taker order when STP triggers/ EXPIRE_MAKER:expire taker order when STP triggers/ EXPIRE_BOTH:expire both orders when STP triggers; default NONE |  [optional] |
|**goodTillDate** | **Long** | Auto-cancel time for &#x60;GTD&#x60; orders. |  [optional] |



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



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| LIMIT | &quot;LIMIT&quot; |
| MARKET | &quot;MARKET&quot; |
| STOP | &quot;STOP&quot; |
| STOP_MARKET | &quot;STOP_MARKET&quot; |
| TAKE_PROFIT | &quot;TAKE_PROFIT&quot; |
| TAKE_PROFIT_MARKET | &quot;TAKE_PROFIT_MARKET&quot; |
| TRAILING_STOP_MARKET | &quot;TRAILING_STOP_MARKET&quot; |



## Enum: TimeInForceEnum

| Name | Value |
|---- | -----|
| GTC | &quot;GTC&quot; |
| IOC | &quot;IOC&quot; |
| FOK | &quot;FOK&quot; |
| GTX | &quot;GTX&quot; |
| GTD | &quot;GTD&quot; |
| RPI | &quot;RPI&quot; |



## Enum: ReduceOnlyEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: NewOrderRespTypeEnum

| Name | Value |
|---- | -----|
| ACK | &quot;ACK&quot; |
| RESULT | &quot;RESULT&quot; |



## Enum: PriceMatchEnum

| Name | Value |
|---- | -----|
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
| NONE | &quot;NONE&quot; |
| EXPIRE_TAKER | &quot;EXPIRE_TAKER&quot; |
| EXPIRE_BOTH | &quot;EXPIRE_BOTH&quot; |
| EXPIRE_MAKER | &quot;EXPIRE_MAKER&quot; |



