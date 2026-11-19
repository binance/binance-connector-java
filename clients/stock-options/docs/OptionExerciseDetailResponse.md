

# OptionExerciseDetailResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tranId** | **Long** | Exercise transaction ID. |  [optional] |
|**clientOrderId** | **String** | Client ID. |  [optional] |
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**rootSymbol** | **String** | OCC root symbol. Differs from &#x60;underlyingSymbol&#x60; for contracts adjusted by a corporate action (e.g. &#x60;GOOG1&#x60;). |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**requestedQty** | **String** | Requested number of contracts. |  [optional] |
|**status** | **String** | &#x60;PROCESSING&#x60; / &#x60;SUCCESS&#x60; / &#x60;FAILED&#x60;. |  [optional] |
|**requestedTime** | **Long** | Submission time (ms). |  [optional] |
|**updateTime** | **Long** | Last update time (ms). |  [optional] |
|**optionEventId** | **String** | Settlement event ID of the option leg; can be used with Option Settlement Event Detail. |  [optional] |
|**underlyingEventId** | **String** | Settlement event ID of the underlying-share leg. |  [optional] |
|**multiplier** | **String** | Premium multiplier. Order cost &#x3D; price × quantity × multiplier. |  [optional] |
|**errorCode** | **String** | Error code on failure; one of the option business error codes in Error Code. Returned only when &#x60;status&#x60; is &#x60;FAILED&#x60;. |  [optional] |



