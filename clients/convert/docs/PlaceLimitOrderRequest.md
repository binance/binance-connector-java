

# PlaceLimitOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseAsset** | **String** | base asset (use the response &#x60;fromIsBase&#x60; from &#x60;GET /sapi/v1/convert/exchangeInfo&#x60; api to check which one is baseAsset ) |  |
|**quoteAsset** | **String** | quote asset |  |
|**limitPrice** | **Double** | Symbol limit price (from baseAsset to quoteAsset) |  |
|**baseAmount** | **Double** | Base asset amount. (One of &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60; is required) |  [optional] |
|**quoteAmount** | **Double** | Quote asset amount. (One of &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60; is required) |  [optional] |
|**side** | **Side** |  |  |
|**walletType** | **WalletType** |  |  [optional] |
|**expiredType** | **ExpiredType** |  |  |
|**recvWindow** | **Long** | Request validity window in milliseconds |  [optional] |



