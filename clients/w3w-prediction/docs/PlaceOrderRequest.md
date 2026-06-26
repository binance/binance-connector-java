

# PlaceOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletAddress** | **String** | User&#39;s prediction wallet address |  |
|**walletId** | **String** | Wallet ID |  |
|**quoteId** | **String** | Quote ID obtained from &#x60;Get Quote&#x60; |  |
|**timeInForce** | **String** | Must match &#x60;orderType&#x60;: &#x60;FOK&#x60; for &#x60;MARKET&#x60;, &#x60;GTC&#x60; for &#x60;LIMIT&#x60; |  |
|**accountType** | **AccountType** |  |  |
|**orderType** | **OrderType** |  |  |
|**slippageBps** | **Integer** | Slippage tolerance in basis points. Range 1–10000 |  |
|**priceLimit** | **String** | Limit price. Required when &#x60;orderType&#x3D;LIMIT&#x60;. Must be &gt; 0 |  [optional] |
|**fundingSource** | **FundingSource** |  |  [optional] |
|**fundTransferAmount** | **String** | Auto-transfer amount before order (wei). Must be &gt; 0 if provided |  [optional] |



