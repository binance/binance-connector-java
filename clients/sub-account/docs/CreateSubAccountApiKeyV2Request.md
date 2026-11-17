

# CreateSubAccountApiKeyV2Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Sub-account email |  |
|**apiName** | **String** | API Key name |  |
|**status** | **Long** | IP restriction status. 1 &#x3D; unrestricted, 2 &#x3D; restricted to trusted IPs, 3 &#x3D; third-party IP restriction |  |
|**canTrade** | **Boolean** | Spot &amp; Margin trading permission, default false |  [optional] |
|**canMarginLoanRepay** | **Boolean** | Margin borrow/repay permission, default false |  [optional] |
|**canFuturesTrade** | **Boolean** | Futures trading permission, default false |  [optional] |
|**canUniversalTransfer** | **Boolean** | Universal transfer permission, default false |  [optional] |
|**canVanillaOptions** | **Boolean** | Vanilla options permission, default false |  [optional] |
|**canFixApiTrading** | **Boolean** | FIX API Trading permission. Only supported for API Keys using an Ed25519 public key. Setting it to &#x60;true&#x60; for any other key type returns &#x60;-9000&#x60; &#x60;Unsupported operation&#x60; |  [optional] |
|**canFixApiReading** | **Boolean** | FIX API Reading permission. Only supported for API Keys using an Ed25519 public key. Setting it to &#x60;true&#x60; for any other key type returns &#x60;-9000&#x60; &#x60;Unsupported operation&#x60; |  [optional] |
|**ipAddress** | **String** | Required when status&#x3D;2. IP address list, max 500 chars |  [optional] |
|**thirdPartyName** | **String** | Required when status&#x3D;3. Third-party name |  [optional] |
|**publicKey** | **String** | RSA or Ed25519 public key (optional). Must be sent in the request body; it is rejected if passed in the URL query string |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



