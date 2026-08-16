

# DepositHistoryTravelRuleResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trId** | **Long** |  |  [optional] |
|**tranId** | **Long** |  |  [optional] |
|**amount** | **String** |  |  [optional] |
|**coin** | **String** |  |  [optional] |
|**network** | **String** |  |  [optional] |
|**depositStatus** | **Long** |  |  [optional] |
|**travelRuleStatus** | **Long** |  |  [optional] |
|**travelRuleStatusV2** | **String** | Overall travel rule verification status (GTR + sanctions screening combined). \&quot;PASSED\&quot;: verification complete, deposit released. \&quot;PENDING\&quot;: verification in progress, deposit frozen. \&quot;REJECTED\&quot;: verification failed. |  [optional] |
|**address** | **String** |  |  [optional] |
|**addressTag** | **String** |  |  [optional] |
|**txId** | **String** |  |  [optional] |
|**insertTime** | **Long** |  |  [optional] |
|**completeTime** | **Long** | Timestamp when the deposit was fully completed/credited (epoch ms). |  [optional] |
|**transferType** | **Long** |  |  [optional] |
|**confirmTimes** | **String** |  |  [optional] |
|**requireQuestionnaire** | **Boolean** |  |  [optional] |
|**questionnaire** | **String** |  |  [optional] |



