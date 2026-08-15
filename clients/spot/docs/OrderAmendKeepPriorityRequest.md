

# OrderAmendKeepPriorityRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Client-generated request identifier. |  [optional] |
|**symbol** | **String** |  |  |
|**orderId** | **Long** | &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent |  [optional] |
|**origClientOrderId** | **String** | &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent |  [optional] |
|**newClientOrderId** | **String** | The new client order ID for the order after being amended. &lt;br&gt; If not sent, one will be randomly generated. &lt;br&gt; It is possible to reuse the current clientOrderId by sending it as the &#x60;newClientOrderId&#x60;. |  [optional] |
|**newQty** | **Double** | &#x60;newQty&#x60; must be greater than 0 and less than the order&#39;s quantity. |  |
|**recvWindow** | **Double** | Supports up to three decimal places of precision (e.g., 6000.346) so that microseconds may be specified. |  [optional] |



