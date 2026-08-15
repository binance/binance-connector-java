

# ExchangeInformationResponseSymbolsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**List&lt;ExchangeInformationResponseSymbolsInnerFiltersInner&gt;**](ExchangeInformationResponseSymbolsInnerFiltersInner.md) | Trading filters and constraints. |  [optional] |
|**orderTypes** | **List&lt;String&gt;** | Supported order types. |  [optional] |
|**timeInForce** | **List&lt;String&gt;** | Time in force |  [optional] |
|**liquidationFee** | **String** | liquidation fee rate |  [optional] |
|**marketTakeBound** | **String** | the max price difference rate( from mark price) a market order can make |  [optional] |
|**symbol** | **String** | Trading symbol |  [optional] |
|**pair** | **String** | Pair |  [optional] |
|**contractType** | **String** | Contract type. |  [optional] |
|**deliveryDate** | **Long** | Delivery timestamp. |  [optional] |
|**onboardDate** | **Long** | Onboard timestamp. |  [optional] |
|**contractStatus** | **String** | Contract status. |  [optional] |
|**contractSize** | **Long** | Contract size. |  [optional] |
|**quoteAsset** | **String** | Quote asset symbol. |  [optional] |
|**baseAsset** | **String** | Base asset symbol. |  [optional] |
|**marginAsset** | **String** | Margin asset. |  [optional] |
|**pricePrecision** | **Long** | please do not use it as tickSize |  [optional] |
|**quantityPrecision** | **Long** | please do not use it as stepSize |  [optional] |
|**baseAssetPrecision** | **Long** | Base asset precision. |  [optional] |
|**quotePrecision** | **Long** | Quote asset precision. |  [optional] |
|**equalQtyPrecision** | **Long** | ignore |  [optional] |
|**triggerProtect** | **String** | threshold for algo order with \&quot;priceProtect\&quot; |  [optional] |
|**maintMarginPercent** | **String** | ignore |  [optional] |
|**requiredMarginPercent** | **String** | ignore |  [optional] |
|**underlyingType** | **String** | Underlying asset type. |  [optional] |
|**underlyingSubType** | **List&lt;String&gt;** | Underlying asset sub-type. |  [optional] |



