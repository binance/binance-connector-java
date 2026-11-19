

# OptionSettlementEventDetailResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventId** | **String** | Event ID; use it with Option Settlement Event Detail. |  [optional] |
|**eventType** | **String** | &#x60;EXERCISE&#x60; / &#x60;ASSIGNMENT&#x60; / &#x60;EXPIRY&#x60;. |  [optional] |
|**status** | **String** | Event status. Only settled events are returned, so the value is always &#x60;Completed&#x60;. |  [optional] |
|**symbol** | **String** | OCC option contract symbol. |  [optional] |
|**underlyingSymbol** | **String** | Underlying US-equity ticker. |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**contracts** | **String** | Number of contracts, **absolute value** (unsigned), unlike the history endpoint. |  [optional] |
|**expirationDate** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day. Convert in &#x60;America/New_York&#x60; and take the date part (see General Info). |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**shareDelta** | **String** | Net change in underlying shares (signed). Not returned for &#x60;EXPIRY&#x60; events, or for events on adjusted contracts that deliver more than one stock (see &#x60;deliverables&#x60;). |  [optional] |
|**deliverables** | [**List&lt;OptionSettlementEventHistoryResponseRowsInnerDeliverablesInner&gt;**](OptionSettlementEventHistoryResponseRowsInnerDeliverablesInner.md) | Assets actually delivered. Empty array when nothing is delivered. |  [optional] |
|**eventTime** | **Long** | Time the settlement record was created (ms). |  [optional] |
|**settlementKind** | **String** | Settlement method: &#x60;PHYSICAL&#x60; (physical delivery) / &#x60;CASH&#x60; (cash settlement) / &#x60;MIXED&#x60; (both). Not returned for &#x60;EXPIRY&#x60; events. |  [optional] |
|**underlyingPrice** | **String** | Reference price of the underlying when the event was generated, for display only; it is not used in the settlement calculation. Not returned if unavailable. |  [optional] |
|**cashDirection** | **String** | Cash direction: &#x60;DEBIT&#x60; / &#x60;CREDIT&#x60;. Not returned for &#x60;EXPIRY&#x60; events. |  [optional] |
|**amount** | **String** | Net cash amount (absolute value); see &#x60;cashDirection&#x60; for the direction. Not returned for &#x60;EXPIRY&#x60; events. |  [optional] |
|**collateralRelease** | [**List&lt;OptionSettlementEventDetailResponseCollateralReleaseInner&gt;**](OptionSettlementEventDetailResponseCollateralReleaseInner.md) | Only for &#x60;EXPIRY&#x60; events on short positions (covered call / cash-secured put): collateral released back to the user, e.g. the cash of a cash-secured put (strike × contracts × multiplier). |  [optional] |
|**updatedTime** | **Long** | Last update time (ms). |  [optional] |



