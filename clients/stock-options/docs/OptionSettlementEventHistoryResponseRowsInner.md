

# OptionSettlementEventHistoryResponseRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Event ID; use it with Option Settlement Event Detail. |  [optional] |
|**eventType** | **String** | &#x60;EXERCISE&#x60; / &#x60;ASSIGNMENT&#x60; / &#x60;EXPIRY&#x60;. |  [optional] |
|**status** | **String** | Event status. Only settled events are returned, so the value is always &#x60;Completed&#x60;. |  [optional] |
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**contracts** | **String** | Number of contracts, **signed**: positive for long, negative for short. (Option Settlement Event Detail returns the absolute value.) |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**shareDelta** | **String** | Net change in underlying shares (signed). Not returned for &#x60;EXPIRY&#x60; events, or for events on adjusted contracts that deliver more than one stock (see &#x60;deliverables&#x60;). |  [optional] |
|**deliverables** | [**List&lt;OptionSettlementEventHistoryResponseRowsInnerDeliverablesInner&gt;**](OptionSettlementEventHistoryResponseRowsInnerDeliverablesInner.md) | Assets actually delivered. Empty array when nothing is delivered. |  [optional] |
|**eventTime** | **Long** | Event time (ms). |  [optional] |



