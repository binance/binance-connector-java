

# PlaceEquityOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | Acknowledgement code: &#x60;S&#x60; &#x3D; accepted, &#x60;F&#x60; &#x3D; failed. Not an order lifecycle status — to poll lifecycle, call &#x60;/order/detail&#x60; or &#x60;/order/history&#x60;. |  [optional] |
|**orderId** | **String** | Order id (UUID). |  [optional] |
|**clientOrderId** | **String** | Echoes the supplied or server-generated client order id. |  [optional] |



