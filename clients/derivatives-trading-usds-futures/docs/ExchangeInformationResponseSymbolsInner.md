

# ExchangeInformationResponseSymbolsInner

symbols.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Symbol. |  [optional] |
|**pair** | **String** | Pair. |  [optional] |
|**contractType** | **String** | Contract Type. |  [optional] |
|**deliveryDate** | **Long** | Delivery Date. |  [optional] |
|**onboardDate** | **Long** | Onboard Date. |  [optional] |
|**status** | **String** | Status. |  [optional] |
|**maintMarginPercent** | **String** | ignore |  [optional] |
|**requiredMarginPercent** | **String** | ignore |  [optional] |
|**baseAsset** | **String** | Base Asset. |  [optional] |
|**quoteAsset** | **String** | Quote Asset. |  [optional] |
|**marginAsset** | **String** | Margin Asset. |  [optional] |
|**pricePrecision** | **Long** | please do not use it as tickSize |  [optional] |
|**quantityPrecision** | **Long** | please do not use it as stepSize |  [optional] |
|**baseAssetPrecision** | **Long** | Base Asset Precision. |  [optional] |
|**quotePrecision** | **Long** | Quote Precision. |  [optional] |
|**underlyingType** | **String** |  |  [optional] |
|**underlyingSubType** | **List&lt;String&gt;** |  |  [optional] |
|**settlePlan** | **Long** |  |  [optional] |
|**triggerProtect** | **String** | threshold for algo order with \&quot;priceProtect\&quot; |  [optional] |
|**filters** | [**List&lt;ExchangeInformationResponseSymbolsInnerFiltersInner&gt;**](ExchangeInformationResponseSymbolsInnerFiltersInner.md) |  |  [optional] |
|**orderTypes** | **List&lt;String&gt;** |  |  [optional] |
|**timeInForce** | **List&lt;String&gt;** | Time In Force. |  [optional] |
|**liquidationFee** | **String** | liquidation fee rate |  [optional] |
|**marketTakeBound** | **String** | the max price difference rate( from mark price) a market order can make |  [optional] |



