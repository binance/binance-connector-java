

# SubmitOptionExerciseResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tranId** | **Long** | Exercise transaction ID; use it to query Option Exercise Detail. |  [optional] |
|**clientOrderId** | **String** | Echoes the supplied or server-generated client ID. |  [optional] |
|**status** | **String** | &#x60;PROCESSING&#x60; on a first successful submission. When replayed with the same &#x60;clientOrderId&#x60;, the current status of the original exercise (&#x60;PROCESSING&#x60; / &#x60;SUCCESS&#x60;) is returned. |  [optional] |



