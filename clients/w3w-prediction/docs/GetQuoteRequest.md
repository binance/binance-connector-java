

# GetQuoteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletAddress** | **String** | User&#39;s prediction wallet address |  |
|**tokenId** | **String** | Prediction outcome token ID |  |
|**side** | **Side** |  |  |
|**amountIn** | **String** | Input amount in wei (18 decimals). Must be &gt; 0. For &#x60;MARKET&#x60; orders, minimum is approximately 1.5 USDT (varies by market depth). Example: &#x60;1000000000000000000&#x60; &#x3D; 1 USDT |  |
|**orderType** | **OrderType** |  |  |
|**slippageBps** | **Integer** | Slippage tolerance in basis points. Range 1–10000 |  |
|**priceLimit** | **String** | Limit price. Required when &#x60;orderType&#x3D;LIMIT&#x60;. Must be &gt; 0 |  [optional] |
|**chainId** | **String** | Chain ID. Default &#x60;56&#x60; (BSC) |  [optional] |
|**feeRateBps** | **Integer** | Fee rate in basis points. Default &#x60;200&#x60;, range 1–10000 |  [optional] |
|**fundingSource** | **FundingSource** |  |  [optional] |
|**fundTransferAmount** | **String** | Auto-transfer amount before order (wei). Must be &gt; 0 if provided |  [optional] |



