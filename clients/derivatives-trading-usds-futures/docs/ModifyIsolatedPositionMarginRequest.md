

# ModifyIsolatedPositionMarginRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** |  |  |
|**positionSide** | **String** | Default &#x60;BOTH&#x60; for One-way Mode ; &#x60;LONG&#x60; or &#x60;SHORT&#x60; for Hedge Mode. It must be sent with Hedge Mode. |  [optional] |
|**amount** | **Double** | Margin asset |  |
|**type** | **Integer** | 1: Add position margin，2: Reduce position margin |  |
|**recvWindow** | **Long** |  |  [optional] |



