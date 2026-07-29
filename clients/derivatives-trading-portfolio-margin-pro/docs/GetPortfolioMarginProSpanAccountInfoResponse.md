

# GetPortfolioMarginProSpanAccountInfoResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uniMMR** | **String** | uni MMR. |  [optional] |
|**accountEquity** | **String** | Account equity, unit：USD |  [optional] |
|**actualEquity** | **String** | Actual equity, unit：USD |  [optional] |
|**accountMaintMargin** | **String** | Account maintenance margin, unit：USD |  [optional] |
|**riskUnitMMList** | [**List&lt;GetPortfolioMarginProSpanAccountInfoResponseRiskUnitMMListInner&gt;**](GetPortfolioMarginProSpanAccountInfoResponseRiskUnitMMListInner.md) |  |  [optional] |
|**marginMM** | **String** | margin MM. |  [optional] |
|**otherMM** | **String** | other MM. |  [optional] |
|**accountStatus** | **String** | Classic Portfolio margin account status:\&quot;NORMAL\&quot;, \&quot;MARGIN_CALL\&quot;, \&quot;SUPPLY_MARGIN\&quot;, \&quot;REDUCE_ONLY\&quot;, \&quot;ACTIVE_LIQUIDATION\&quot;, \&quot;FORCE_LIQUIDATION\&quot;, \&quot;BANKRUPTED\&quot; |  [optional] |
|**accountType** | **String** | PM_1 for classic PM, PM_2 for PM, PM_3 for PM Pro(SPAN) |  [optional] |



