

# AccountInformationV2ResponseResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
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
|**assets** | [**List&lt;AccountInformationV2ResponseResultAssetsInner&gt;**](AccountInformationV2ResponseResultAssetsInner.md) | For assets that are quote assets, USDT/USDC/BTC |  [optional] |
|**positions** | [**List&lt;AccountInformationV2ResponseResultPositionsInner&gt;**](AccountInformationV2ResponseResultPositionsInner.md) | positions of all symbols user had position/ open orders are returned |  [optional] |



