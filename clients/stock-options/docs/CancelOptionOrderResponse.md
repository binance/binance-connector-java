

# CancelOptionOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Echoes the order ID in the request. |  [optional] |
|**status** | **String** | Always &#x60;S&#x60;, meaning the cancel request was accepted upstream. A failed cancellation (e.g. order not found or already filled) is returned as an error code (&#x60;486xxx&#x60;). |  [optional] |



