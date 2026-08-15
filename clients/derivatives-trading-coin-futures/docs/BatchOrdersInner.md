

# BatchOrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol |  |
|**side** | [**SideEnum**](#SideEnum) |  |  |
|**positionSide** | [**PositionSideEnum**](#PositionSideEnum) | Default &#x60;BOTH&#x60; for One-way Mode ; &#x60;LONG&#x60; or &#x60;SHORT&#x60; for Hedge Mode. It must be sent with Hedge Mode. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | **After CM migration, stop-type values (&#x60;STOP&#x60;, &#x60;STOP_MARKET&#x60;, &#x60;TAKE_PROFIT&#x60;, &#x60;TAKE_PROFIT_MARKET&#x60;, &#x60;TRAILING_STOP_MARKET&#x60;) are no longer accepted on a per-element basis and will return element-level &#x60;-4120&#x60;. Use the new &#x60;/dapi/v1/algoOrder&#x60; endpoint instead.** |  |
|**timeInForce** | [**TimeInForceEnum**](#TimeInForceEnum) |  |  [optional] |
|**quantity** | **Double** | quantity measured by contract number |  |
|**reduceOnly** | [**ReduceOnlyEnum**](#ReduceOnlyEnum) |  |  [optional] |
|**price** | **Double** | Order price |  [optional] |
|**newClientOrderId** | **String** | A unique id among open orders. Automatically generated if not sent. Can only be string following the rule: &#x60;^[\\.A-Z\\:/a-z0-9_-]{1,36}$&#x60; |  [optional] |
|**stopPrice** | **Double** | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**activationPrice** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders, default as the latest price(supporting different &#x60;workingType&#x60;) |  [optional] |
|**callbackRate** | **Double** | Used with &#x60;TRAILING_STOP_MARKET&#x60; orders, min 0.1, max 4 where 1 for 1% |  [optional] |
|**workingType** | [**WorkingTypeEnum**](#WorkingTypeEnum) |  |  [optional] |
|**priceProtect** | [**PriceProtectEnum**](#PriceProtectEnum) | Used with &#x60;STOP/STOP_MARKET&#x60; or &#x60;TAKE_PROFIT/TAKE_PROFIT_MARKET&#x60; orders. |  [optional] |
|**newOrderRespType** | [**NewOrderRespTypeEnum**](#NewOrderRespTypeEnum) |  |  [optional] |
|**priceMatch** | [**PriceMatchEnum**](#PriceMatchEnum) | only avaliable for &#x60;LIMIT&#x60;/&#x60;STOP&#x60;/&#x60;TAKE_PROFIT&#x60; order; can&#39;t be passed together with &#x60;price&#x60; |  [optional] |
|**selfTradePreventionMode** | [**SelfTradePreventionModeEnum**](#SelfTradePreventionModeEnum) | &#x60;EXPIRE_TAKER&#x60;:expire taker order when STP triggers/ &#x60;EXPIRE_MAKER&#x60;:expire taker order when STP triggers/ &#x60;EXPIRE_BOTH&#x60;:expire both orders when STP triggers |  [optional] |



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



## Enum: ReduceOnlyEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: WorkingTypeEnum

| Name | Value |
|---- | -----|
| MARK_PRICE | &quot;MARK_PRICE&quot; |
| CONTRACT_PRICE | &quot;CONTRACT_PRICE&quot; |



## Enum: PriceProtectEnum

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
| EXPIRE_TAKER | &quot;EXPIRE_TAKER&quot; |
| EXPIRE_MAKER | &quot;EXPIRE_MAKER&quot; |
| EXPIRE_BOTH | &quot;EXPIRE_BOTH&quot; |



