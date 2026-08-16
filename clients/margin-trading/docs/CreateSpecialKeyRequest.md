

# CreateSpecialKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiName** | **String** |  |  |
|**symbol** | **String** |  |  [optional] |
|**ip** | **String** | Can be added in batches, separated by commas. Max 30 for an API key |  [optional] |
|**publicKey** | **String** | 1. If publicKey is inputted it will create an RSA or Ed25519 key.  2. Need to be encoded to URL-encoded format |  [optional] |
|**permissionMode** | **PermissionMode** |  |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



