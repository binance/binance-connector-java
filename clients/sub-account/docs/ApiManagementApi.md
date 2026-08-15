# ApiManagementApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addIpRestrictionForSubAccountApiKey**](ApiManagementApi.md#addIpRestrictionForSubAccountApiKey) | **POST** /sapi/v2/sub-account/subAccountApi/ipRestriction | Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA) |
| [**createSubAccountApiKey**](ApiManagementApi.md#createSubAccountApiKey) | **POST** /sapi/v1/sub-account/subAccountApi | Create Sub-account API Key (For Master Account) (USER_DATA) |
| [**deleteIpListForASubAccountApiKey**](ApiManagementApi.md#deleteIpListForASubAccountApiKey) | **DELETE** /sapi/v1/sub-account/subAccountApi/ipRestriction/ipList | Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA) |
| [**deleteSubAccountApiKey**](ApiManagementApi.md#deleteSubAccountApiKey) | **DELETE** /sapi/v1/sub-account/subAccountApi | Delete Sub-account API Key (For Master Account) (USER_DATA) |
| [**getIpRestrictionForASubAccountApiKey**](ApiManagementApi.md#getIpRestrictionForASubAccountApiKey) | **GET** /sapi/v1/sub-account/subAccountApi/ipRestriction | Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA) |
| [**modifySubAccountApiKeyPermission**](ApiManagementApi.md#modifySubAccountApiKeyPermission) | **POST** /sapi/v1/sub-account/subAccountApiPermission | Modify Sub-account API Key Permission (For Master Account) (USER_DATA) |
| [**querySubAccountApiKey**](ApiManagementApi.md#querySubAccountApiKey) | **GET** /sapi/v1/sub-account/subAccountApi | Query Sub-account API Key (For Master Account) (USER_DATA) |


<a id="addIpRestrictionForSubAccountApiKey"></a>
# **addIpRestrictionForSubAccountApiKey**
> AddIpRestrictionForSubAccountApiKeyResponse addIpRestrictionForSubAccountApiKey(addIpRestrictionForSubAccountApiKeyRequest)

Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA)

Add IP Restriction for Sub-Account API key  Weight(UID): 3000  Security Type: USER_DATA  Notes: - You need to enable Enable Spot &amp; Margin Trading option for the api key which requests this endpoint

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    AddIpRestrictionForSubAccountApiKeyRequest addIpRestrictionForSubAccountApiKeyRequest = new AddIpRestrictionForSubAccountApiKeyRequest(); // AddIpRestrictionForSubAccountApiKeyRequest | 
    try {
      AddIpRestrictionForSubAccountApiKeyResponse result = apiInstance.addIpRestrictionForSubAccountApiKey(addIpRestrictionForSubAccountApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#addIpRestrictionForSubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addIpRestrictionForSubAccountApiKeyRequest** | [**AddIpRestrictionForSubAccountApiKeyRequest**](AddIpRestrictionForSubAccountApiKeyRequest.md)|  | |

### Return type

[**AddIpRestrictionForSubAccountApiKeyResponse**](AddIpRestrictionForSubAccountApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Add IP Restriction for Sub-Account API key |  -  |

<a id="createSubAccountApiKey"></a>
# **createSubAccountApiKey**
> CreateSubAccountApiKeyResponse createSubAccountApiKey(createSubAccountApiKeyRequest)

Create Sub-account API Key (For Master Account) (USER_DATA)

Create a new API Key for a sub-account.  Weight(UID): 3000  Security Type: USER_DATA  Notes: - &#x60;status&#x3D;2&#x60; requires &#x60;ipAddress&#x60; - &#x60;status&#x3D;3&#x60; requires &#x60;thirdPartyName&#x60; - Asset Sub Account is not supported - The caller must pass the KYC IP restriction check

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    CreateSubAccountApiKeyRequest createSubAccountApiKeyRequest = new CreateSubAccountApiKeyRequest(); // CreateSubAccountApiKeyRequest | 
    try {
      CreateSubAccountApiKeyResponse result = apiInstance.createSubAccountApiKey(createSubAccountApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#createSubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createSubAccountApiKeyRequest** | [**CreateSubAccountApiKeyRequest**](CreateSubAccountApiKeyRequest.md)|  | |

### Return type

[**CreateSubAccountApiKeyResponse**](CreateSubAccountApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create Sub-account API Key |  -  |

<a id="deleteIpListForASubAccountApiKey"></a>
# **deleteIpListForASubAccountApiKey**
> DeleteIpListForASubAccountApiKeyResponse deleteIpListForASubAccountApiKey(email, subAccountApiKey, ipAddress, recvWindow)

Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA)

Delete IP List For a Sub-account API Key  Weight(UID): 3000  Security Type: USER_DATA  Notes: - You need to enable Enable Spot &amp; Margin Trading option for the api key which requests this endpoint

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    String email = "123@test.com"; // String | 
    String subAccountApiKey = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf"; // String | 
    String ipAddress = "69.210.67.14"; // String | IPs to be deleted. Can be added in batches, separated by commas
    Long recvWindow = 5000L; // Long | 
    try {
      DeleteIpListForASubAccountApiKeyResponse result = apiInstance.deleteIpListForASubAccountApiKey(email, subAccountApiKey, ipAddress, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#deleteIpListForASubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**|  | |
| **subAccountApiKey** | **String**|  | |
| **ipAddress** | **String**| IPs to be deleted. Can be added in batches, separated by commas | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**DeleteIpListForASubAccountApiKeyResponse**](DeleteIpListForASubAccountApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete IP List For a Sub-account API Key |  -  |

<a id="deleteSubAccountApiKey"></a>
# **deleteSubAccountApiKey**
> Object deleteSubAccountApiKey(email, subAccountApiKey, recvWindow)

Delete Sub-account API Key (For Master Account) (USER_DATA)

Delete an API Key of a sub-account.  Weight(UID): 3000  Security Type: USER_DATA  Notes: - Asset Sub Account is not supported - The caller must pass the KYC IP restriction check

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    String email = "123@test.com"; // String | Sub-account email
    String subAccountApiKey = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf"; // String | The sub-account API Key to be deleted
    Long recvWindow = 5000L; // Long | 
    try {
      Object result = apiInstance.deleteSubAccountApiKey(email, subAccountApiKey, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#deleteSubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Sub-account email | |
| **subAccountApiKey** | **String**| The sub-account API Key to be deleted | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Sub-account API Key |  -  |

<a id="getIpRestrictionForASubAccountApiKey"></a>
# **getIpRestrictionForASubAccountApiKey**
> GetIpRestrictionForASubAccountApiKeyResponse getIpRestrictionForASubAccountApiKey(email, subAccountApiKey, recvWindow)

Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA)

Get IP Restriction for a Sub-account API Key  Weight(UID): 3000  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    String email = "123@test.com"; // String | 
    String subAccountApiKey = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetIpRestrictionForASubAccountApiKeyResponse result = apiInstance.getIpRestrictionForASubAccountApiKey(email, subAccountApiKey, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#getIpRestrictionForASubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**|  | |
| **subAccountApiKey** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetIpRestrictionForASubAccountApiKeyResponse**](GetIpRestrictionForASubAccountApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get IP Restriction for a Sub-account API Key |  -  |

<a id="modifySubAccountApiKeyPermission"></a>
# **modifySubAccountApiKeyPermission**
> ModifySubAccountApiKeyPermissionResponse modifySubAccountApiKeyPermission(modifySubAccountApiKeyPermissionRequest)

Modify Sub-account API Key Permission (For Master Account) (USER_DATA)

Modify the trading permissions of a sub-account API Key.  Weight(UID): 3000  Security Type: USER_DATA  Notes: - Portfolio Margin Retail User is not supported - Asset Sub Account is not supported - The caller must pass the KYC IP restriction check

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    ModifySubAccountApiKeyPermissionRequest modifySubAccountApiKeyPermissionRequest = new ModifySubAccountApiKeyPermissionRequest(); // ModifySubAccountApiKeyPermissionRequest | 
    try {
      ModifySubAccountApiKeyPermissionResponse result = apiInstance.modifySubAccountApiKeyPermission(modifySubAccountApiKeyPermissionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#modifySubAccountApiKeyPermission");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **modifySubAccountApiKeyPermissionRequest** | [**ModifySubAccountApiKeyPermissionRequest**](ModifySubAccountApiKeyPermissionRequest.md)|  | |

### Return type

[**ModifySubAccountApiKeyPermissionResponse**](ModifySubAccountApiKeyPermissionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Modify Sub-account API Key Permission |  -  |

<a id="querySubAccountApiKey"></a>
# **querySubAccountApiKey**
> QuerySubAccountApiKeyResponse querySubAccountApiKey(email, subAccountApiKey, page, size, recvWindow)

Query Sub-account API Key (For Master Account) (USER_DATA)

Query the API Key list of a sub-account.  Weight(UID): 3000  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ApiManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);
    String email = "123@test.com"; // String | Sub-account email
    String subAccountApiKey = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf"; // String | Specify an API Key for exact match
    Long page = 1L; // Long | Page number, default 1, minimum 1
    Long size = 30L; // Long | Page size, default 30, maximum 100
    Long recvWindow = 5000L; // Long | 
    try {
      QuerySubAccountApiKeyResponse result = apiInstance.querySubAccountApiKey(email, subAccountApiKey, page, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#querySubAccountApiKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Sub-account email | |
| **subAccountApiKey** | **String**| Specify an API Key for exact match | [optional] |
| **page** | **Long**| Page number, default 1, minimum 1 | [optional] |
| **size** | **Long**| Page size, default 30, maximum 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QuerySubAccountApiKeyResponse**](QuerySubAccountApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Sub-account API Key |  -  |

