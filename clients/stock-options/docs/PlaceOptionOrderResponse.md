

# PlaceOptionOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **String** | &#x60;S&#x60; &#x3D; accepted; &#x60;P&#x60; &#x3D; processing. A failed order is always returned as an error code (see Error Code); a successful response never carries a failed status. |  [optional] |
|**orderId** | **String** | Option order ID. Omitted when &#x60;status&#x60; &#x3D; &#x60;P&#x60;; query Option Order Detail by &#x60;clientOrderId&#x60; instead. |  [optional] |
|**clientOrderId** | **String** | Echoes the supplied or server-generated client order ID. |  [optional] |



