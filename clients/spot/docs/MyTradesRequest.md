

# MyTradesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**symbol** | **String** |  |  |
|**orderId** | **Long** | This can only be used in combination with &#x60;symbol&#x60;. |  [optional] |
|**startTime** | **Long** | Timestamp in ms |  [optional] |
|**endTime** | **Long** | Timestamp in ms |  [optional] |
|**fromId** | **Integer** | First trade ID to query |  [optional] |
|**limit** | **Integer** | Default: 500; Maximum: 1000 |  [optional] |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



