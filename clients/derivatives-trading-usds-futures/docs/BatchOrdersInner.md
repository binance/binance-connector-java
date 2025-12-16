

# BatchOrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** |  |  [optional] |
|**origClientOrderId** | **String** |  |  [optional] |
|**symbol** | **String** |  |  [optional] |
|**side** | [**SideEnum**](#SideEnum) |  |  [optional] |
|**quantity** | **String** |  |  [optional] |
|**price** | **String** |  |  [optional] |
|**priceMatch** | [**PriceMatchEnum**](#PriceMatchEnum) |  |  [optional] |
|**recvWindow** | **String** |  |  [optional] |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| BUY | &quot;BUY&quot; |
| SELL | &quot;SELL&quot; |



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



