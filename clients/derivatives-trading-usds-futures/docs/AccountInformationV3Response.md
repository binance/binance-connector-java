

# AccountInformationV3Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**totalInitialMargin** | **String** | Total initial margin requirement. USDT only in single-asset mode; the sum of USD value of all cross positions/open order initial margin in multi-assets mode. |  [optional] |
|**totalMaintMargin** | **String** | Total maintenance margin requirement. USDT only in single-asset mode; the sum of USD value of all cross positions maintenance margin in multi-assets mode. |  [optional] |
|**totalWalletBalance** | **String** | Total wallet balance. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**totalUnrealizedProfit** | **String** | Total unrealized profit. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**totalMarginBalance** | **String** | Total margin balance. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**totalPositionInitialMargin** | **String** | Initial margin required for positions. USDT only in single-asset mode; the sum of USD value of all cross positions initial margin in multi-assets mode. |  [optional] |
|**totalOpenOrderInitialMargin** | **String** | Initial margin required for open orders. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**totalCrossWalletBalance** | **String** | Cross wallet balance. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**totalCrossUnPnl** | **String** | Unrealized PnL for cross positions. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**availableBalance** | **String** | Available balance. USDT only in single-asset mode; USD-denominated in multi-assets mode. |  [optional] |
|**maxWithdrawAmount** | **String** | Maximum transferable/withdrawable amount. USDT only in single-asset mode; a maximum virtual USD amount in multi-assets mode. |  [optional] |
|**assets** | [**List&lt;AccountInformationV3ResponseAssetsInner&gt;**](AccountInformationV3ResponseAssetsInner.md) | Asset-level account details. |  [optional] |
|**positions** | [**List&lt;AccountInformationV3ResponsePositionsInner&gt;**](AccountInformationV3ResponsePositionsInner.md) | Position details for symbols. |  [optional] |



