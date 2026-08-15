

# KlinesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | API response code. \&quot;000000\&quot; indicates success. |  [optional] |
|**message** | **String** | Response message. |  [optional] |
|**messageDetail** | **String** | Detailed response message. |  [optional] |
|**success** | **Boolean** | Whether request is successful. |  [optional] |
|**data** | **List&lt;List&lt;KlinesResponseDataInnerInner&gt;&gt;** | Array of kline rows. Each row contains: open time, open, high, low, close, volume, close time, quote volume, trade count, taker buy base volume, taker buy quote volume, and a static 0. |  [optional] |



