

# FullDepthResponseData

Order book data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastUpdateId** | **Long** | Last order book update ID. |  [optional] |
|**symbol** | **String** | Trading pair symbol. |  [optional] |
|**bids** | **List&lt;List&lt;String&gt;&gt;** | Bid orders. Each entry is [price, quantity]. |  [optional] |
|**asks** | **List&lt;List&lt;String&gt;&gt;** | Ask orders. Each entry is [price, quantity]. |  [optional] |
|**E** | **Long** | Event time in milliseconds. |  [optional] |
|**T** | **Long** | Transaction time in milliseconds. |  [optional] |



