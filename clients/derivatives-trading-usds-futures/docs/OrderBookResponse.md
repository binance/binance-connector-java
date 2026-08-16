

# OrderBookResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | **Long** |  |  [optional] |
|**result** | [**OrderBookResponseResult**](OrderBookResponseResult.md) |  |  [optional] |
|**bids** | **List&lt;List&lt;String&gt;&gt;** | Bid orders. Each entry is [price, quantity]. |  [optional] |
|**asks** | **List&lt;List&lt;String&gt;&gt;** | Ask orders. Each entry is [price, quantity]. |  [optional] |
|**rateLimits** | [**List&lt;OrderBookResponseRateLimitsInner&gt;**](OrderBookResponseRateLimitsInner.md) |  |  [optional] |



