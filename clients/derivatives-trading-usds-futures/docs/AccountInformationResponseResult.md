

# AccountInformationResponseResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeTier** | **Long** | account commission tier |  [optional] |
|**canTrade** | **Boolean** | if can trade |  [optional] |
|**canDeposit** | **Boolean** | if can transfer in asset |  [optional] |
|**canWithdraw** | **Boolean** | if can transfer out asset |  [optional] |
|**updateTime** | **Long** | reserved property, please ignore |  [optional] |
|**multiAssetsMargin** | **Boolean** |  |  [optional] |
|**tradeGroupId** | **Long** |  |  [optional] |
|**totalInitialMargin** | **String** | total initial margin required with current mark price (useless with isolated positions), only for USDT asset |  [optional] |
|**totalMaintMargin** | **String** | the sum of USD value of all cross positions maintenance margin |  [optional] |
|**totalWalletBalance** | **String** | total wallet balance, only for USDT asset |  [optional] |
|**totalUnrealizedProfit** | **String** | total unrealized profit, only for USDT asset |  [optional] |
|**totalMarginBalance** | **String** | total margin balance, only for USDT asset |  [optional] |
|**totalPositionInitialMargin** | **String** | initial margin required for positions with current mark price, only for USDT asset |  [optional] |
|**totalOpenOrderInitialMargin** | **String** | initial margin required for open orders with current mark price, only for USDT asset |  [optional] |
|**totalCrossWalletBalance** | **String** | crossed wallet balance, only for USDT asset |  [optional] |
|**totalCrossUnPnl** | **String** | unrealized profit of crossed positions, only for USDT asset |  [optional] |
|**availableBalance** | **String** | available balance, only for USDT asset |  [optional] |
|**maxWithdrawAmount** | **String** | maximum amount for transfer out, only for USDT asset |  [optional] |
|**assets** | [**List&lt;AccountInformationResponseResultAssetsInner&gt;**](AccountInformationResponseResultAssetsInner.md) |  |  [optional] |
|**positions** | [**List&lt;AccountInformationResponseResultPositionsInner&gt;**](AccountInformationResponseResultPositionsInner.md) | positions of all symbols in the market are returned |  [optional] |



