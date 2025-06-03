# ApiManagementApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addIpRestrictionForSubAccountApiKey**](ApiManagementApi.md#addIpRestrictionForSubAccountApiKey) | **POST** /sapi/v2/sub-account/subAccountApi/ipRestriction | Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA) |
| [**deleteIpListForASubAccountApiKey**](ApiManagementApi.md#deleteIpListForASubAccountApiKey) | **DELETE** /sapi/v1/sub-account/subAccountApi/ipRestriction/ipList | Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA) |
| [**getIpRestrictionForASubAccountApiKey**](ApiManagementApi.md#getIpRestrictionForASubAccountApiKey) | **GET** /sapi/v1/sub-account/subAccountApi/ipRestriction | Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA) |


<a id="addIpRestrictionForSubAccountApiKey"></a>
# **addIpRestrictionForSubAccountApiKey**
> AddIpRestrictionForSubAccountApiKeyResponse addIpRestrictionForSubAccountApiKey(addIpRestrictionForSubAccountApiKeyRequest)

Add IP Restriction for Sub-Account API key (For Master Account) (USER_DATA)

Add IP Restriction for Sub-Account API key  * You need to enable Enable Spot &amp; Margin Trading option for the api key which requests this endpoint  Weight: 3000

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

<a id="deleteIpListForASubAccountApiKey"></a>
# **deleteIpListForASubAccountApiKey**
> DeleteIpListForASubAccountApiKeyResponse deleteIpListForASubAccountApiKey(email, subAccountApiKey, ipAddress, recvWindow)

Delete IP List For a Sub-account API Key (For Master Account) (USER_DATA)

Delete IP List For a Sub-account API Key  * You need to enable Enable Spot &amp; Margin Trading option for the api key which requests this endpoint  Weight: 3000

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
    String email = "email_example"; // String | [Sub-account email](#email-address)
    String subAccountApiKey = "subAccountApiKey_example"; // String | 
    String ipAddress = "ipAddress_example"; // String | IPs to be deleted. Can be added in batches, separated by commas
    Long recvWindow = 56L; // Long | 
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
| **email** | **String**| [Sub-account email](#email-address) | |
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

<a id="getIpRestrictionForASubAccountApiKey"></a>
# **getIpRestrictionForASubAccountApiKey**
> GetIpRestrictionForASubAccountApiKeyResponse getIpRestrictionForASubAccountApiKey(email, subAccountApiKey, recvWindow)

Get IP Restriction for a Sub-account API Key (For Master Account) (USER_DATA)

Get IP Restriction for a Sub-account API Key  Weight: 3000

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
    String email = "email_example"; // String | [Sub-account email](#email-address)
    String subAccountApiKey = "subAccountApiKey_example"; // String | 
    Long recvWindow = 56L; // Long | 
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
| **email** | **String**| [Sub-account email](#email-address) | |
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

