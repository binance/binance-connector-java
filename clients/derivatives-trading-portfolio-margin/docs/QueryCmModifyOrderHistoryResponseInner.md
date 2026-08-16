

# QueryCmModifyOrderHistoryResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amendmentId** | **Long** | Order modification ID |  [optional] |
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**pair** | **String** | Pair. |  [optional] |
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**clientOrderId** | **String** | Client Order ID. |  [optional] |
|**time** | **Long** | Order modification time |  [optional] |
|**amendment** | [**QueryCmModifyOrderHistoryResponseInnerAmendment**](QueryCmModifyOrderHistoryResponseInnerAmendment.md) |  |  [optional] |



