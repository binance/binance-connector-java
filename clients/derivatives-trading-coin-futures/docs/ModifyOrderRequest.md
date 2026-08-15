

# ModifyOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**orderId** | **Long** |  |  [optional] |
|**origClientOrderId** | **String** |  |  [optional] |
|**symbol** | **String** |  |  |
|**side** | **Side** |  |  |
|**quantity** | **Double** | Order quantity, cannot be sent with &#x60;closePosition&#x3D;true&#x60; |  |
|**price** | **Double** |  |  |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**modifyId** | **Long** | User-defined modification identifier, returned as-is in the response. Optional; not validated for uniqueness. |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



