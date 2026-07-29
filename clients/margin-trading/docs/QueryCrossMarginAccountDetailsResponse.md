

# QueryCrossMarginAccountDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **Boolean** | True means margin account created , false means margin account not created. |  [optional] |
|**borrowEnabled** | **Boolean** | borrow Enabled. |  [optional] |
|**marginLevel** | **String** | margin Level. |  [optional] |
|**collateralMarginLevel** | **String** | collateral Margin Level. |  [optional] |
|**totalAssetOfBtc** | **String** | total Asset Of Btc. |  [optional] |
|**totalLiabilityOfBtc** | **String** | total Liability Of Btc. |  [optional] |
|**totalNetAssetOfBtc** | **String** | total Net Asset Of Btc. |  [optional] |
|**totalCollateralValueInUSDT** | **String** | Total Collateral Value In USDT. |  [optional] |
|**totalOpenOrderLossInUSDT** | **String** | total Open Order Loss In USDT. |  [optional] |
|**tradeEnabled** | **Boolean** | trade Enabled. |  [optional] |
|**transferInEnabled** | **Boolean** | transfer In Enabled. |  [optional] |
|**transferOutEnabled** | **Boolean** | transfer Out Enabled. |  [optional] |
|**accountType** | **String** | // MARGIN_1 for Cross Margin Classic, MARGIN_2 for Cross Margin Pro |  [optional] |
|**userAssets** | [**List&lt;QueryCrossMarginAccountDetailsResponseUserAssetsInner&gt;**](QueryCrossMarginAccountDetailsResponseUserAssetsInner.md) | user Assets list. |  [optional] |



