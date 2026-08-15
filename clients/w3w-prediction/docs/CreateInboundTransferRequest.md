

# CreateInboundTransferRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **String** | Wallet ID |  |
|**walletAddress** | **String** | User&#39;s prediction wallet address |  |
|**fromTokenAmount** | **String** | Transfer amount in wei (18 decimals). Must be &gt; 0. Example: &#x60;1000000000000000000&#x60; &#x3D; 1 USDT |  |
|**accountType** | **AccountType** |  |  |
|**fromToken** | **String** | Source token symbol. Default &#x60;USDT&#x60; |  [optional] |
|**toToken** | **String** | Destination token symbol. Default &#x60;USDT&#x60; |  [optional] |
|**chainId** | **String** | Chain ID. Default &#x60;56&#x60; (BSC) |  [optional] |



