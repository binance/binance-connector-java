

# PredictionOrderBookByMarketIdResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**msgType** | **String** | Message type, always &#x60;orderbook&#x60;. |  [optional] |
|**marketId** | **Long** | Market ID of this order book, the same &#x60;markets[].marketId&#x60; used by the REST API. |  [optional] |
|**updateTimestampMs** | **Long** | Quote update time in milliseconds (UTC). Messages for the same market may arrive out of order, so discard anything older than the snapshot you already have. |  [optional] |
|**asks** | **List&lt;List&lt;BigDecimal&gt;&gt;** | Ask levels sorted by price **ascending**, usually the top 50 or fewer; an empty array means no asks. Values may carry floating-point noise (e.g. &#x60;6865.999999999999&#x60;), so round them before display. |  [optional] |
|**bids** | **List&lt;List&lt;BigDecimal&gt;&gt;** | Bid levels sorted by price **descending**, usually the top 50 or fewer; an empty array means no bids. Values may carry floating-point noise (e.g. &#x60;6865.999999999999&#x60;), so round them before display. |  [optional] |



