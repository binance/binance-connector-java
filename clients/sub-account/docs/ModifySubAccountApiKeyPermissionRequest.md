

# ModifySubAccountApiKeyPermissionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Sub-account email |  |
|**subAccountApiKey** | **String** | Sub-account API Key |  |
|**canTrade** | **Boolean** | Spot &amp; Margin trading permission |  [optional] |
|**canMarginLoanRepay** | **Boolean** | Margin borrow/repay permission |  [optional] |
|**canFuturesTrade** | **Boolean** | Futures trading permission |  [optional] |
|**canUniversalTransfer** | **Boolean** | Universal transfer permission |  [optional] |
|**canVanillaOptions** | **Boolean** | Vanilla options permission |  [optional] |
|**canFixApiTrading** | **Boolean** | FIX API Trading permission. If omitted, the existing value is unchanged. Only supported for API Keys using an Ed25519 public key. Setting it to &#x60;true&#x60; for any other key type returns &#x60;-9000&#x60; &#x60;Unsupported operation&#x60; |  [optional] |
|**canFixApiReading** | **Boolean** | FIX API Reading permission. If omitted, the existing value is unchanged. Only supported for API Keys using an Ed25519 public key. Setting it to &#x60;true&#x60; for any other key type returns &#x60;-9000&#x60; &#x60;Unsupported operation&#x60; |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



