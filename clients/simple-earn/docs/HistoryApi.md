# HistoryApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCollateralRecord**](HistoryApi.md#getCollateralRecord) | **GET** /sapi/v1/simple-earn/flexible/history/collateralRecord | Get Collateral Record(USER_DATA) |
| [**getFlexibleRedemptionRecord**](HistoryApi.md#getFlexibleRedemptionRecord) | **GET** /sapi/v1/simple-earn/flexible/history/redemptionRecord | Get Flexible Redemption Record(USER_DATA) |
| [**getFlexibleRewardsHistory**](HistoryApi.md#getFlexibleRewardsHistory) | **GET** /sapi/v1/simple-earn/flexible/history/rewardsRecord | Get Flexible Rewards History(USER_DATA) |
| [**getFlexibleSubscriptionRecord**](HistoryApi.md#getFlexibleSubscriptionRecord) | **GET** /sapi/v1/simple-earn/flexible/history/subscriptionRecord | Get Flexible Subscription Record(USER_DATA) |
| [**getLockedRedemptionRecord**](HistoryApi.md#getLockedRedemptionRecord) | **GET** /sapi/v1/simple-earn/locked/history/redemptionRecord | Get Locked Redemption Record(USER_DATA) |
| [**getLockedRewardsHistory**](HistoryApi.md#getLockedRewardsHistory) | **GET** /sapi/v1/simple-earn/locked/history/rewardsRecord | Get Locked Rewards History(USER_DATA) |
| [**getLockedSubscriptionRecord**](HistoryApi.md#getLockedSubscriptionRecord) | **GET** /sapi/v1/simple-earn/locked/history/subscriptionRecord | Get Locked Subscription Record(USER_DATA) |
| [**getRateHistory**](HistoryApi.md#getRateHistory) | **GET** /sapi/v1/simple-earn/flexible/history/rateHistory | Get Rate History(USER_DATA) |


<a id="getCollateralRecord"></a>
# **getCollateralRecord**
> GetCollateralRecordResponse getCollateralRecord(productId, startTime, endTime, current, size, recvWindow)

Get Collateral Record(USER_DATA)

Get Collateral Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 30 days. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String productId = "productId_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetCollateralRecordResponse result = apiInstance.getCollateralRecord(productId, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getCollateralRecord");
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
| **productId** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCollateralRecordResponse**](GetCollateralRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Collateral Record |  -  |

<a id="getFlexibleRedemptionRecord"></a>
# **getFlexibleRedemptionRecord**
> GetFlexibleRedemptionRecordResponse getFlexibleRedemptionRecord(productId, redeemId, asset, startTime, endTime, current, size, recvWindow)

Get Flexible Redemption Record(USER_DATA)

Get Flexible Redemption Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String productId = "productId_example"; // String | 
    String redeemId = "redeemId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleRedemptionRecordResponse result = apiInstance.getFlexibleRedemptionRecord(productId, redeemId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getFlexibleRedemptionRecord");
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
| **productId** | **String**|  | [optional] |
| **redeemId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleRedemptionRecordResponse**](GetFlexibleRedemptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Redemption Record |  -  |

<a id="getFlexibleRewardsHistory"></a>
# **getFlexibleRewardsHistory**
> GetFlexibleRewardsHistoryResponse getFlexibleRewardsHistory(type, productId, asset, startTime, endTime, current, size, recvWindow)

Get Flexible Rewards History(USER_DATA)

Get Flexible Rewards History  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String type = "type_example"; // String | `Bonus` - Bonus tiered APR, `REALTIME` Real-time APR, `REWARDS` Historical rewards,`ALL`(set to default)
    String productId = "productId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleRewardsHistoryResponse result = apiInstance.getFlexibleRewardsHistory(type, productId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getFlexibleRewardsHistory");
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
| **type** | **String**| &#x60;Bonus&#x60; - Bonus tiered APR, &#x60;REALTIME&#x60; Real-time APR, &#x60;REWARDS&#x60; Historical rewards,&#x60;ALL&#x60;(set to default) | |
| **productId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleRewardsHistoryResponse**](GetFlexibleRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Rewards History |  -  |

<a id="getFlexibleSubscriptionRecord"></a>
# **getFlexibleSubscriptionRecord**
> GetFlexibleSubscriptionRecordResponse getFlexibleSubscriptionRecord(productId, purchaseId, asset, startTime, endTime, current, size, recvWindow)

Get Flexible Subscription Record(USER_DATA)

Get Flexible Subscription Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String productId = "productId_example"; // String | 
    String purchaseId = "purchaseId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleSubscriptionRecordResponse result = apiInstance.getFlexibleSubscriptionRecord(productId, purchaseId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getFlexibleSubscriptionRecord");
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
| **productId** | **String**|  | [optional] |
| **purchaseId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleSubscriptionRecordResponse**](GetFlexibleSubscriptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Subscription Record |  -  |

<a id="getLockedRedemptionRecord"></a>
# **getLockedRedemptionRecord**
> GetLockedRedemptionRecordResponse getLockedRedemptionRecord(positionId, redeemId, asset, startTime, endTime, current, size, recvWindow)

Get Locked Redemption Record(USER_DATA)

Get Locked Redemption Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String redeemId = "redeemId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedRedemptionRecordResponse result = apiInstance.getLockedRedemptionRecord(positionId, redeemId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getLockedRedemptionRecord");
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
| **positionId** | **String**|  | [optional] |
| **redeemId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedRedemptionRecordResponse**](GetLockedRedemptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Redemption Record |  -  |

<a id="getLockedRewardsHistory"></a>
# **getLockedRewardsHistory**
> GetLockedRewardsHistoryResponse getLockedRewardsHistory(positionId, asset, startTime, endTime, current, size, recvWindow)

Get Locked Rewards History(USER_DATA)

Get Locked Rewards History  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedRewardsHistoryResponse result = apiInstance.getLockedRewardsHistory(positionId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getLockedRewardsHistory");
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
| **positionId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedRewardsHistoryResponse**](GetLockedRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Rewards History |  -  |

<a id="getLockedSubscriptionRecord"></a>
# **getLockedSubscriptionRecord**
> GetLockedSubscriptionRecordResponse getLockedSubscriptionRecord(purchaseId, asset, startTime, endTime, current, size, recvWindow)

Get Locked Subscription Record(USER_DATA)

Get Locked Subscription Record  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String purchaseId = "purchaseId_example"; // String | 
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedSubscriptionRecordResponse result = apiInstance.getLockedSubscriptionRecord(purchaseId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getLockedSubscriptionRecord");
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
| **purchaseId** | **String**|  | [optional] |
| **asset** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedSubscriptionRecordResponse**](GetLockedSubscriptionRecordResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Subscription Record |  -  |

<a id="getRateHistory"></a>
# **getRateHistory**
> GetRateHistoryResponse getRateHistory(productId, aprPeriod, startTime, endTime, current, size, recvWindow)

Get Rate History(USER_DATA)

Get Rate History  * The time between startTime and endTime cannot be longer than 1 year. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.HistoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    HistoryApi apiInstance = new HistoryApi(defaultClient);
    String productId = "productId_example"; // String | 
    String aprPeriod = "aprPeriod_example"; // String | \"DAY\",\"YEAR\",default\"DAY\"
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetRateHistoryResponse result = apiInstance.getRateHistory(productId, aprPeriod, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HistoryApi#getRateHistory");
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
| **aprPeriod** | **String**| \&quot;DAY\&quot;,\&quot;YEAR\&quot;,default\&quot;DAY\&quot; | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetRateHistoryResponse**](GetRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Rate History |  -  |

