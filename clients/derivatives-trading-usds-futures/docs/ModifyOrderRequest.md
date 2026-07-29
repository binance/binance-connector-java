

# ModifyOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Id. |  [optional] |
|**orderId** | **Long** | Order Id. |  [optional] |
|**origClientOrderId** | **String** | Orig Client Order Id. |  [optional] |
|**symbol** | **String** | Symbol. |  |
|**side** | **Side** |  |  |
|**quantity** | **Double** | Order quantity, cannot be sent with &#x60;closePosition&#x3D;true&#x60; |  |
|**price** | **Double** | Price. |  |
|**priceMatch** | **PriceMatch** |  |  [optional] |
|**modifyId** | **Long** | User-defined modification identifier, returned as-is in the response. Optional; not validated for uniqueness. |  [optional] |
|**recvWindow** | **Long** | Recv Window. |  [optional] |



