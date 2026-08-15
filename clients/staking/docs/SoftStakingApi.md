# SoftStakingApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSoftStakingProductList**](SoftStakingApi.md#getSoftStakingProductList) | **GET** /sapi/v1/soft-staking/list | Get Soft Staking Product List (USER_DATA) |
| [**getSoftStakingRewardsHistory**](SoftStakingApi.md#getSoftStakingRewardsHistory) | **GET** /sapi/v1/soft-staking/history/rewardsRecord | Get Soft Staking Rewards History (USER_DATA) |
| [**setSoftStaking**](SoftStakingApi.md#setSoftStaking) | **GET** /sapi/v1/soft-staking/set | Set Soft Staking (USER_DATA) |


<a id="getSoftStakingProductList"></a>
# **getSoftStakingProductList**
> GetSoftStakingProductListResponse getSoftStakingProductList(asset, current, size, recvWindow)

Get Soft Staking Product List (USER_DATA)

Get the available Soft Staking product list.  Weight(IP): 50  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SoftStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SoftStakingApi apiInstance = new SoftStakingApi(defaultClient);
    String asset = "BTC"; // String | 
    Long current = 1L; // Long | Currently querying page
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      GetSoftStakingProductListResponse result = apiInstance.getSoftStakingProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftStakingApi#getSoftStakingProductList");
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
| **current** | **Long**| Currently querying page | [optional] |
| **size** | **Long**|  | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

### Return type

[**GetSoftStakingProductListResponse**](GetSoftStakingProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Soft Staking Product List |  -  |

<a id="getSoftStakingRewardsHistory"></a>
# **getSoftStakingRewardsHistory**
> GetSoftStakingRewardsHistoryResponse getSoftStakingRewardsHistory(asset, startTime, endTime, current, size, recvWindow)

Get Soft Staking Rewards History (USER_DATA)

Get Soft Staking Rewards History  Weight(IP): 50  Security Type: USER_DATA  Notes: - The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. - If &#x60;startTime&#x60; and &#x60;endTime&#x60;   are both not sent, then the last 30 days&#39; data will be returned. - If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not   sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. - If &#x60;endTime&#x60; is sent but   &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SoftStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SoftStakingApi apiInstance = new SoftStakingApi(defaultClient);
    String asset = "BTC"; // String | 
    Long startTime = 1623319461670L; // Long | 
    Long endTime = 1641782889000L; // Long | 
    Long current = 1L; // Long | Currently querying page
    Long size = 10L; // Long | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      GetSoftStakingRewardsHistoryResponse result = apiInstance.getSoftStakingRewardsHistory(asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftStakingApi#getSoftStakingRewardsHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page | [optional] |
| **size** | **Long**|  | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

### Return type

[**GetSoftStakingRewardsHistoryResponse**](GetSoftStakingRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Soft Staking Rewards History |  -  |

<a id="setSoftStaking"></a>
# **setSoftStaking**
> SetSoftStakingResponse setSoftStaking(softStaking, recvWindow)

Set Soft Staking (USER_DATA)

Enable or disable Soft Staking.  Weight(IP): 50  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.staking.ApiClient;
import com.binance.connector.client.staking.ApiException;
import com.binance.connector.client.staking.Configuration;
import com.binance.connector.client.staking.models.*;
import com.binance.connector.client.staking.rest.api.SoftStakingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    SoftStakingApi apiInstance = new SoftStakingApi(defaultClient);
    Boolean softStaking = true; // Boolean | 
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      SetSoftStakingResponse result = apiInstance.setSoftStaking(softStaking, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftStakingApi#setSoftStaking");
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
| **softStaking** | **Boolean**|  | |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

### Return type

[**SetSoftStakingResponse**](SetSoftStakingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Soft Staking |  -  |

