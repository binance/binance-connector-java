

# OptionContractsResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | OCC contract symbol; usable for order placement and Option Exchange Info. |  [optional] |
|**contractType** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. |  [optional] |
|**strikePrice** | **String** | Strike price. |  [optional] |
|**multiplier** | **String** | Premium multiplier. Order cost &#x3D; price × quantity × multiplier. |  [optional] |
|**contractSize** | **Integer** | Shares delivered per contract. Equals &#x60;multiplier&#x60; for standard contracts; may differ after a corporate action. |  [optional] |
|**expirationDate** | **String** | Expiration date in &#x60;YYYY-MM-DD&#x60;, US Eastern (ET) calendar day. |  [optional] |
|**status** | **String** | Contract trading status: &#x60;OPEN_CLOSE&#x60; / &#x60;CLOSE_ONLY&#x60; / &#x60;NONE&#x60;. Omitted when the status of a contract is temporarily unavailable. See Common Definition. |  [optional] |



