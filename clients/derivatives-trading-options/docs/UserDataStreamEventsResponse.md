

# UserDataStreamEventsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**E** | **Long** | Event Time |  [optional] |
|**T** | **Long** | Transaction Time |  [optional] |
|**eq** | **String** | Account equity in USDT |  [optional] |
|**aeq** | **String** | Account adjusted equity in USDT |  [optional] |
|**bLowerCase** | **String** | Account wallet balance in USDT |  [optional] |
|**mLowerCase** | **String** | Event reason type |  [optional] |
|**uLowerCase** | **String** | Unrealized PnL |  [optional] |
|**iLowerCase** | **String** | Initial margin in USDT |  [optional] |
|**M** | **String** | Maintenance margin in USDT |  [optional] |
|**B** | [**List&lt;BalancePositionUpdateBInner&gt;**](BalancePositionUpdateBInner.md) | Balances |  [optional] |
|**P** | [**List&lt;BalancePositionUpdatePInner&gt;**](BalancePositionUpdatePInner.md) | Positions |  [optional] |
|**G** | [**List&lt;GreekUpdateGInner&gt;**](GreekUpdateGInner.md) |  |  [optional] |
|**listenKey** | **String** |  |  [optional] |
|**oLowerCase** | [**OrderTradeUpdateO**](OrderTradeUpdateO.md) |  |  [optional] |
|**sLowerCase** | **String** | Risk level. This feature only applies to VIP and Market Maker accounts. Risk level is re-evaluated on: funds transfer, trade fill, option expiry. |  [optional] |
|**mb** | **String** | Margin balance |  [optional] |
|**mm** | **String** | Maintenance margin |  [optional] |



