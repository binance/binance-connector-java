

# RpiDiffBookDepthStreamsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eLowerCase** | **String** | Event type |  [optional] |
|**E** | **Long** | Event time |  [optional] |
|**T** | **Long** | Transaction time |  [optional] |
|**sLowerCase** | **String** | Symbol |  [optional] |
|**U** | **Long** | First update ID in event |  [optional] |
|**uLowerCase** | **Long** | Final update ID in event |  [optional] |
|**pu** | **Long** | Final update Id in last stream(ie &#x60;u&#x60; in last stream) |  [optional] |
|**bLowerCase** | **List&lt;List&lt;String&gt;&gt;** | Bids to be updated |  [optional] |
|**aLowerCase** | **List&lt;List&lt;String&gt;&gt;** | Asks to be updated |  [optional] |
|**ps** | **String** | (After CM migration) Pair symbol |  [optional] |
|**st** | **Integer** | (After CM migration) Symbol type: 1 &#x3D; UM, 2 &#x3D; CM |  [optional] |



