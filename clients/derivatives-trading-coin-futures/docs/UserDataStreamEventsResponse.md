

# UserDataStreamEventsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**E** | **Long** | Event Time |  [optional] |
|**T** | **Long** | Transaction Time |  [optional] |
|**ac** | [**AccountConfigUpdateAc**](AccountConfigUpdateAc.md) |  |  [optional] |
|**iLowerCase** | **String** | Account Alias |  [optional] |
|**aLowerCase** | [**AccountUpdateA**](AccountUpdateA.md) |  |  [optional] |
|**gu** | [**GridUpdateGu**](GridUpdateGu.md) |  |  [optional] |
|**listenKey** | **String** |  |  [optional] |
|**cw** | **String** | Cross Wallet Balance. Only pushed with crossed position margin call |  [optional] |
|**pLowerCase** | [**List&lt;MarginCallPInner&gt;**](MarginCallPInner.md) | Position(s) of Margin Call |  [optional] |
|**oLowerCase** | [**OrderTradeUpdateO**](OrderTradeUpdateO.md) |  |  [optional] |
|**su** | [**StrategyUpdateSu**](StrategyUpdateSu.md) |  |  [optional] |



