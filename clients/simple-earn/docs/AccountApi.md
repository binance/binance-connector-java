# AccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFlexiblePersonalLeftQuota**](AccountApi.md#getFlexiblePersonalLeftQuota) | **GET** /sapi/v1/simple-earn/flexible/personalLeftQuota | Get Flexible Personal Left Quota(USER_DATA) |
| [**getFlexibleProductPosition**](AccountApi.md#getFlexibleProductPosition) | **GET** /sapi/v1/simple-earn/flexible/position | Get Flexible Product Position(USER_DATA) |
| [**getLockedPersonalLeftQuota**](AccountApi.md#getLockedPersonalLeftQuota) | **GET** /sapi/v1/simple-earn/locked/personalLeftQuota | Get Locked Personal Left Quota(USER_DATA) |
| [**getLockedProductPosition**](AccountApi.md#getLockedProductPosition) | **GET** /sapi/v1/simple-earn/locked/position | Get Locked Product Position |
| [**getSimpleEarnFlexibleProductList**](AccountApi.md#getSimpleEarnFlexibleProductList) | **GET** /sapi/v1/simple-earn/flexible/list | Get Simple Earn Flexible Product List(USER_DATA) |
| [**getSimpleEarnLockedProductList**](AccountApi.md#getSimpleEarnLockedProductList) | **GET** /sapi/v1/simple-earn/locked/list | Get Simple Earn Locked Product List(USER_DATA) |
| [**simpleAccount**](AccountApi.md#simpleAccount) | **GET** /sapi/v1/simple-earn/account | Simple Account(USER_DATA) |


<a id="getFlexiblePersonalLeftQuota"></a>
# **getFlexiblePersonalLeftQuota**
> GetFlexiblePersonalLeftQuotaResponse getFlexiblePersonalLeftQuota(productId, recvWindow)

Get Flexible Personal Left Quota(USER_DATA)

Get Flexible Personal Left Quota  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String productId = "productId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexiblePersonalLeftQuotaResponse result = apiInstance.getFlexiblePersonalLeftQuota(productId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getFlexiblePersonalLeftQuota");
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
| **productId** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexiblePersonalLeftQuotaResponse**](GetFlexiblePersonalLeftQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Personal Left Quota |  -  |

<a id="getFlexibleProductPosition"></a>
# **getFlexibleProductPosition**
> GetFlexibleProductPositionResponse getFlexibleProductPosition(asset, productId, current, size, recvWindow)

Get Flexible Product Position(USER_DATA)

Get Flexible Product Position  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    String productId = "productId_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleProductPositionResponse result = apiInstance.getFlexibleProductPosition(asset, productId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getFlexibleProductPosition");
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
| **asset** | **String**|  | [optional] |
| **productId** | **String**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleProductPositionResponse**](GetFlexibleProductPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Product Position |  -  |

<a id="getLockedPersonalLeftQuota"></a>
# **getLockedPersonalLeftQuota**
> GetLockedPersonalLeftQuotaResponse getLockedPersonalLeftQuota(projectId, recvWindow)

Get Locked Personal Left Quota(USER_DATA)

Get Locked Personal Left Quota  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedPersonalLeftQuotaResponse result = apiInstance.getLockedPersonalLeftQuota(projectId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getLockedPersonalLeftQuota");
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
| **projectId** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedPersonalLeftQuotaResponse**](GetLockedPersonalLeftQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Personal Left Quota |  -  |

<a id="getLockedProductPosition"></a>
# **getLockedProductPosition**
> GetLockedProductPositionResponse getLockedProductPosition(asset, positionId, projectId, current, size, recvWindow)

Get Locked Product Position

Get Locked Product Position  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    String positionId = "positionId_example"; // String | 
    String projectId = "projectId_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedProductPositionResponse result = apiInstance.getLockedProductPosition(asset, positionId, projectId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getLockedProductPosition");
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
| **asset** | **String**|  | [optional] |
| **positionId** | **String**|  | [optional] |
| **projectId** | **String**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedProductPositionResponse**](GetLockedProductPositionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Product Position |  -  |

<a id="getSimpleEarnFlexibleProductList"></a>
# **getSimpleEarnFlexibleProductList**
> GetSimpleEarnFlexibleProductListResponse getSimpleEarnFlexibleProductList(asset, current, size, recvWindow)

Get Simple Earn Flexible Product List(USER_DATA)

Get available Simple Earn flexible product list  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSimpleEarnFlexibleProductListResponse result = apiInstance.getSimpleEarnFlexibleProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getSimpleEarnFlexibleProductList");
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
| **asset** | **String**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSimpleEarnFlexibleProductListResponse**](GetSimpleEarnFlexibleProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Simple Earn Flexible Product List |  -  |

<a id="getSimpleEarnLockedProductList"></a>
# **getSimpleEarnLockedProductList**
> GetSimpleEarnLockedProductListResponse getSimpleEarnLockedProductList(asset, current, size, recvWindow)

Get Simple Earn Locked Product List(USER_DATA)

Get Simple Earn Locked Product List  * Get available Simple Earn locked product list  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSimpleEarnLockedProductListResponse result = apiInstance.getSimpleEarnLockedProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getSimpleEarnLockedProductList");
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
| **asset** | **String**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetSimpleEarnLockedProductListResponse**](GetSimpleEarnLockedProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Simple Earn Locked Product List |  -  |

<a id="simpleAccount"></a>
# **simpleAccount**
> SimpleAccountResponse simpleAccount(recvWindow)

Simple Account(USER_DATA)

Simple Account query  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      SimpleAccountResponse result = apiInstance.simpleAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#simpleAccount");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**SimpleAccountResponse**](SimpleAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Simple Account |  -  |

