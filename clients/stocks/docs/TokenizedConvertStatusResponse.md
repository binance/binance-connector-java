

# TokenizedConvertStatusResponse

Empty object `{}` when no record matches.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**underlyingAsset** | **String** | Underlying US-equity ticker, e.g. &#x60;AAPL&#x60;. |  [optional] |
|**underlyingAssetAmount** | **String** | Quantity of the underlying asset involved. |  [optional] |
|**tokenizedAsset** | **String** | Tokenized asset, e.g. &#x60;AAPLB&#x60;. |  [optional] |
|**tokenizedAssetAmount** | **String** | Quantity of the tokenized asset involved. |  [optional] |
|**issuerRequestId** | **String** | Echoes the requested id. |  [optional] |
|**convertType** | **String** | &#x60;MINT&#x60; or &#x60;REDEEM&#x60;. |  [optional] |
|**status** | **String** | Convert status: &#x60;P&#x60; &#x3D; processing, &#x60;S&#x60; &#x3D; success, &#x60;F&#x60; &#x3D; failed. |  [optional] |
|**createdAt** | **Long** | Creation time (ms epoch). |  [optional] |
|**updatedAt** | **Long** | Last update time (ms epoch). |  [optional] |



