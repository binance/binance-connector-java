

# UserDataStreamEventsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**E** | **Long** | Event Time |  [optional] |
|**T** | **Long** | Transaction Time |  [optional] |
|**ac** | [**AccountConfigUpdateAc**](AccountConfigUpdateAc.md) |  |  [optional] |
|**ai** | [**AccountConfigUpdateAi**](AccountConfigUpdateAi.md) |  |  [optional] |
|**aLowerCase** | [**AccountUpdateA**](AccountUpdateA.md) |  |  [optional] |
|**oLowerCase** | [**OrderTradeUpdateO**](OrderTradeUpdateO.md) |  |  [optional] |
|**or** | [**ConditionalOrderTriggerRejectOr**](ConditionalOrderTriggerRejectOr.md) |  |  [optional] |
|**gu** | [**GridUpdateGu**](GridUpdateGu.md) |  |  [optional] |
|**listenKey** | **String** |  |  [optional] |
|**cw** | **String** | Cross Wallet Balance. Only pushed with crossed position margin call |  [optional] |
|**pLowerCase** | **String** | Original Price |  [optional] |
|**su** | [**StrategyUpdateSu**](StrategyUpdateSu.md) |  |  [optional] |
|**sLowerCase** | **String** | Symbol |  [optional] |
|**qLowerCase** | **String** | Original Quantity |  [optional] |
|**mLowerCase** | **Boolean** | Is this trade the maker side? |  [optional] |
|**cLowerCase** | **String** | Client Order Id |  [optional] |
|**S** | **String** | Side |  [optional] |
|**L** | **String** | Last Filled Price |  [optional] |
|**lLowerCase** | **String** | Order Last Filled Quantity |  [optional] |
|**tLowerCase** | **Long** | Trade Id |  [optional] |
|**iLowerCase** | **Long** | Order Id |  [optional] |



