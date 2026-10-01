

# PlaceOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletAddress** | **String** | User&#39;s prediction wallet address. Must be a valid address owned by the calling UID — a well-formed address not owned by the UID and a malformed (non-address) value both return the same generic &#x60;-3026&#x60;. An empty string instead returns &#x60;-1102&#x60; naming the field. |  |
|**walletId** | **String** | Wallet ID |  |
|**quoteId** | **String** | Quote ID obtained from &#x60;Get Quote&#x60; |  |
|**timeInForce** | **String** | Must match &#x60;orderType&#x60;: &#x60;FOK&#x60; for &#x60;MARKET&#x60;, &#x60;GTC&#x60; for &#x60;LIMIT&#x60; |  |
|**accountType** | **AccountType** |  |  |
|**orderType** | **OrderType** |  |  |
|**slippageBps** | **Integer** | Slippage tolerance in basis points. Range 1–10000 |  |
|**priceLimit** | **String** | Limit price. Required when &#x60;orderType&#x3D;LIMIT&#x60;, must be &gt; 0. Omitting it when &#x60;orderType&#x3D;LIMIT&#x60; returns a generic &#x60;-3026&#x60; (no field name in the message). |  [optional] |
|**fundingSource** | **FundingSource** |  |  [optional] |
|**fundTransferAmount** | **String** | Auto-transfer amount before order (wei). Must be &gt; 0 if provided |  [optional] |



