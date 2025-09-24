# FlexibleLockedApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCollateralRecord**](FlexibleLockedApi.md#getCollateralRecord) | **GET** /sapi/v1/simple-earn/flexible/history/collateralRecord | Get Collateral Record(USER_DATA) |
| [**getFlexiblePersonalLeftQuota**](FlexibleLockedApi.md#getFlexiblePersonalLeftQuota) | **GET** /sapi/v1/simple-earn/flexible/personalLeftQuota | Get Flexible Personal Left Quota(USER_DATA) |
| [**getFlexibleProductPosition**](FlexibleLockedApi.md#getFlexibleProductPosition) | **GET** /sapi/v1/simple-earn/flexible/position | Get Flexible Product Position(USER_DATA) |
| [**getFlexibleRedemptionRecord**](FlexibleLockedApi.md#getFlexibleRedemptionRecord) | **GET** /sapi/v1/simple-earn/flexible/history/redemptionRecord | Get Flexible Redemption Record(USER_DATA) |
| [**getFlexibleRewardsHistory**](FlexibleLockedApi.md#getFlexibleRewardsHistory) | **GET** /sapi/v1/simple-earn/flexible/history/rewardsRecord | Get Flexible Rewards History(USER_DATA) |
| [**getFlexibleSubscriptionPreview**](FlexibleLockedApi.md#getFlexibleSubscriptionPreview) | **GET** /sapi/v1/simple-earn/flexible/subscriptionPreview | Get Flexible Subscription Preview(USER_DATA) |
| [**getFlexibleSubscriptionRecord**](FlexibleLockedApi.md#getFlexibleSubscriptionRecord) | **GET** /sapi/v1/simple-earn/flexible/history/subscriptionRecord | Get Flexible Subscription Record(USER_DATA) |
| [**getLockedPersonalLeftQuota**](FlexibleLockedApi.md#getLockedPersonalLeftQuota) | **GET** /sapi/v1/simple-earn/locked/personalLeftQuota | Get Locked Personal Left Quota(USER_DATA) |
| [**getLockedProductPosition**](FlexibleLockedApi.md#getLockedProductPosition) | **GET** /sapi/v1/simple-earn/locked/position | Get Locked Product Position |
| [**getLockedRedemptionRecord**](FlexibleLockedApi.md#getLockedRedemptionRecord) | **GET** /sapi/v1/simple-earn/locked/history/redemptionRecord | Get Locked Redemption Record(USER_DATA) |
| [**getLockedRewardsHistory**](FlexibleLockedApi.md#getLockedRewardsHistory) | **GET** /sapi/v1/simple-earn/locked/history/rewardsRecord | Get Locked Rewards History(USER_DATA) |
| [**getLockedSubscriptionPreview**](FlexibleLockedApi.md#getLockedSubscriptionPreview) | **GET** /sapi/v1/simple-earn/locked/subscriptionPreview | Get Locked Subscription Preview(USER_DATA) |
| [**getLockedSubscriptionRecord**](FlexibleLockedApi.md#getLockedSubscriptionRecord) | **GET** /sapi/v1/simple-earn/locked/history/subscriptionRecord | Get Locked Subscription Record(USER_DATA) |
| [**getRateHistory**](FlexibleLockedApi.md#getRateHistory) | **GET** /sapi/v1/simple-earn/flexible/history/rateHistory | Get Rate History(USER_DATA) |
| [**getSimpleEarnFlexibleProductList**](FlexibleLockedApi.md#getSimpleEarnFlexibleProductList) | **GET** /sapi/v1/simple-earn/flexible/list | Get Simple Earn Flexible Product List(USER_DATA) |
| [**getSimpleEarnLockedProductList**](FlexibleLockedApi.md#getSimpleEarnLockedProductList) | **GET** /sapi/v1/simple-earn/locked/list | Get Simple Earn Locked Product List(USER_DATA) |
| [**redeemFlexibleProduct**](FlexibleLockedApi.md#redeemFlexibleProduct) | **POST** /sapi/v1/simple-earn/flexible/redeem | Redeem Flexible Product(TRADE) |
| [**redeemLockedProduct**](FlexibleLockedApi.md#redeemLockedProduct) | **POST** /sapi/v1/simple-earn/locked/redeem | Redeem Locked Product(TRADE) |
| [**setFlexibleAutoSubscribe**](FlexibleLockedApi.md#setFlexibleAutoSubscribe) | **POST** /sapi/v1/simple-earn/flexible/setAutoSubscribe | Set Flexible Auto Subscribe(USER_DATA) |
| [**setLockedAutoSubscribe**](FlexibleLockedApi.md#setLockedAutoSubscribe) | **POST** /sapi/v1/simple-earn/locked/setAutoSubscribe | Set Locked Auto Subscribe(USER_DATA) |
| [**setLockedProductRedeemOption**](FlexibleLockedApi.md#setLockedProductRedeemOption) | **POST** /sapi/v1/simple-earn/locked/setRedeemOption | Set Locked Product Redeem Option(USER_DATA) |
| [**simpleAccount**](FlexibleLockedApi.md#simpleAccount) | **GET** /sapi/v1/simple-earn/account | Simple Account(USER_DATA) |
| [**subscribeFlexibleProduct**](FlexibleLockedApi.md#subscribeFlexibleProduct) | **POST** /sapi/v1/simple-earn/flexible/subscribe | Subscribe Flexible Product(TRADE) |
| [**subscribeLockedProduct**](FlexibleLockedApi.md#subscribeLockedProduct) | **POST** /sapi/v1/simple-earn/locked/subscribe | Subscribe Locked Product(TRADE) |


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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
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
      System.err.println("Exception when calling FlexibleLockedApi#getCollateralRecord");
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String productId = "productId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexiblePersonalLeftQuotaResponse result = apiInstance.getFlexiblePersonalLeftQuota(productId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexiblePersonalLeftQuota");
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    String productId = "productId_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleProductPositionResponse result = apiInstance.getFlexibleProductPosition(asset, productId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexibleProductPosition");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String productId = "productId_example"; // String | 
    String redeemId = "redeemId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleRedemptionRecordResponse result = apiInstance.getFlexibleRedemptionRecord(productId, redeemId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexibleRedemptionRecord");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String type = "type_example"; // String | `BONUS` - Bonus tiered APR, `REALTIME` Real-time APR, `REWARDS` Historical rewards,`ALL`(set to default)
    String productId = "productId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleRewardsHistoryResponse result = apiInstance.getFlexibleRewardsHistory(type, productId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexibleRewardsHistory");
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
| **type** | **String**| &#x60;BONUS&#x60; - Bonus tiered APR, &#x60;REALTIME&#x60; Real-time APR, &#x60;REWARDS&#x60; Historical rewards,&#x60;ALL&#x60;(set to default) | |
| **productId** | **String**|  | [optional] |
| **asset** | **String**| USDC or USDT | [optional] |
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

<a id="getFlexibleSubscriptionPreview"></a>
# **getFlexibleSubscriptionPreview**
> GetFlexibleSubscriptionPreviewResponse getFlexibleSubscriptionPreview(productId, amount, recvWindow)

Get Flexible Subscription Preview(USER_DATA)

Get Flexible Subscription Preview  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String productId = "productId_example"; // String | 
    Double amount = 3.4D; // Double | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleSubscriptionPreviewResponse result = apiInstance.getFlexibleSubscriptionPreview(productId, amount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexibleSubscriptionPreview");
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
| **amount** | **Double**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleSubscriptionPreviewResponse**](GetFlexibleSubscriptionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Subscription Preview |  -  |

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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String productId = "productId_example"; // String | 
    String purchaseId = "purchaseId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleSubscriptionRecordResponse result = apiInstance.getFlexibleSubscriptionRecord(productId, purchaseId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getFlexibleSubscriptionRecord");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedPersonalLeftQuotaResponse result = apiInstance.getLockedPersonalLeftQuota(projectId, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedPersonalLeftQuota");
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    String positionId = "positionId_example"; // String | 
    String projectId = "projectId_example"; // String | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedProductPositionResponse result = apiInstance.getLockedProductPosition(asset, positionId, projectId, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedProductPosition");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String redeemId = "redeemId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedRedemptionRecordResponse result = apiInstance.getLockedRedemptionRecord(positionId, redeemId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedRedemptionRecord");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String positionId = "positionId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedRewardsHistoryResponse result = apiInstance.getLockedRewardsHistory(positionId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedRewardsHistory");
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
| **asset** | **String**| USDC or USDT | [optional] |
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

<a id="getLockedSubscriptionPreview"></a>
# **getLockedSubscriptionPreview**
> GetLockedSubscriptionPreviewResponse getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow)

Get Locked Subscription Preview(USER_DATA)

Get Locked Subscription Preview  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Double amount = 3.4D; // Double | 
    Boolean autoSubscribe = true; // Boolean | true or false, default true.
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedSubscriptionPreviewResponse result = apiInstance.getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedSubscriptionPreview");
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
| **amount** | **Double**|  | |
| **autoSubscribe** | **Boolean**| true or false, default true. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedSubscriptionPreviewResponse**](GetLockedSubscriptionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Subscription Preview |  -  |

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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String purchaseId = "purchaseId_example"; // String | 
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedSubscriptionRecordResponse result = apiInstance.getLockedSubscriptionRecord(purchaseId, asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getLockedSubscriptionRecord");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
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
      System.err.println("Exception when calling FlexibleLockedApi#getRateHistory");
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSimpleEarnFlexibleProductListResponse result = apiInstance.getSimpleEarnFlexibleProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getSimpleEarnFlexibleProductList");
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
| **asset** | **String**| USDC or USDT | [optional] |
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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetSimpleEarnLockedProductListResponse result = apiInstance.getSimpleEarnLockedProductList(asset, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#getSimpleEarnLockedProductList");
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
| **asset** | **String**| USDC or USDT | [optional] |
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

<a id="redeemFlexibleProduct"></a>
# **redeemFlexibleProduct**
> RedeemFlexibleProductResponse redeemFlexibleProduct(redeemFlexibleProductRequest)

Redeem Flexible Product(TRADE)

Redeem Flexible Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    RedeemFlexibleProductRequest redeemFlexibleProductRequest = new RedeemFlexibleProductRequest(); // RedeemFlexibleProductRequest | 
    try {
      RedeemFlexibleProductResponse result = apiInstance.redeemFlexibleProduct(redeemFlexibleProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#redeemFlexibleProduct");
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
| **redeemFlexibleProductRequest** | [**RedeemFlexibleProductRequest**](RedeemFlexibleProductRequest.md)|  | |

### Return type

[**RedeemFlexibleProductResponse**](RedeemFlexibleProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem Flexible Product |  -  |

<a id="redeemLockedProduct"></a>
# **redeemLockedProduct**
> RedeemLockedProductResponse redeemLockedProduct(redeemLockedProductRequest)

Redeem Locked Product(TRADE)

Redeem Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1/3s per account

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    RedeemLockedProductRequest redeemLockedProductRequest = new RedeemLockedProductRequest(); // RedeemLockedProductRequest | 
    try {
      RedeemLockedProductResponse result = apiInstance.redeemLockedProduct(redeemLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#redeemLockedProduct");
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
| **redeemLockedProductRequest** | [**RedeemLockedProductRequest**](RedeemLockedProductRequest.md)|  | |

### Return type

[**RedeemLockedProductResponse**](RedeemLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem Locked Product |  -  |

<a id="setFlexibleAutoSubscribe"></a>
# **setFlexibleAutoSubscribe**
> SetFlexibleAutoSubscribeResponse setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest)

Set Flexible Auto Subscribe(USER_DATA)

Set Flexible Auto Subscribe  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    SetFlexibleAutoSubscribeRequest setFlexibleAutoSubscribeRequest = new SetFlexibleAutoSubscribeRequest(); // SetFlexibleAutoSubscribeRequest | 
    try {
      SetFlexibleAutoSubscribeResponse result = apiInstance.setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#setFlexibleAutoSubscribe");
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
| **setFlexibleAutoSubscribeRequest** | [**SetFlexibleAutoSubscribeRequest**](SetFlexibleAutoSubscribeRequest.md)|  | |

### Return type

[**SetFlexibleAutoSubscribeResponse**](SetFlexibleAutoSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Flexible Auto Subscribe |  -  |

<a id="setLockedAutoSubscribe"></a>
# **setLockedAutoSubscribe**
> SetLockedAutoSubscribeResponse setLockedAutoSubscribe(setLockedAutoSubscribeRequest)

Set Locked Auto Subscribe(USER_DATA)

Set locked auto subscribe  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    SetLockedAutoSubscribeRequest setLockedAutoSubscribeRequest = new SetLockedAutoSubscribeRequest(); // SetLockedAutoSubscribeRequest | 
    try {
      SetLockedAutoSubscribeResponse result = apiInstance.setLockedAutoSubscribe(setLockedAutoSubscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#setLockedAutoSubscribe");
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
| **setLockedAutoSubscribeRequest** | [**SetLockedAutoSubscribeRequest**](SetLockedAutoSubscribeRequest.md)|  | |

### Return type

[**SetLockedAutoSubscribeResponse**](SetLockedAutoSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Locked Auto Subscribe |  -  |

<a id="setLockedProductRedeemOption"></a>
# **setLockedProductRedeemOption**
> SetLockedProductRedeemOptionResponse setLockedProductRedeemOption(setLockedProductRedeemOptionRequest)

Set Locked Product Redeem Option(USER_DATA)

Set redeem option for Locked product  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    SetLockedProductRedeemOptionRequest setLockedProductRedeemOptionRequest = new SetLockedProductRedeemOptionRequest(); // SetLockedProductRedeemOptionRequest | 
    try {
      SetLockedProductRedeemOptionResponse result = apiInstance.setLockedProductRedeemOption(setLockedProductRedeemOptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#setLockedProductRedeemOption");
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
| **setLockedProductRedeemOptionRequest** | [**SetLockedProductRedeemOptionRequest**](SetLockedProductRedeemOptionRequest.md)|  | |

### Return type

[**SetLockedProductRedeemOptionResponse**](SetLockedProductRedeemOptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Locked Product Redeem Option |  -  |

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
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      SimpleAccountResponse result = apiInstance.simpleAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#simpleAccount");
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

<a id="subscribeFlexibleProduct"></a>
# **subscribeFlexibleProduct**
> SubscribeFlexibleProductResponse subscribeFlexibleProduct(subscribeFlexibleProductRequest)

Subscribe Flexible Product(TRADE)

Subscribe Flexible Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    SubscribeFlexibleProductRequest subscribeFlexibleProductRequest = new SubscribeFlexibleProductRequest(); // SubscribeFlexibleProductRequest | 
    try {
      SubscribeFlexibleProductResponse result = apiInstance.subscribeFlexibleProduct(subscribeFlexibleProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#subscribeFlexibleProduct");
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
| **subscribeFlexibleProductRequest** | [**SubscribeFlexibleProductRequest**](SubscribeFlexibleProductRequest.md)|  | |

### Return type

[**SubscribeFlexibleProductResponse**](SubscribeFlexibleProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe Flexible Product |  -  |

<a id="subscribeLockedProduct"></a>
# **subscribeLockedProduct**
> SubscribeLockedProductResponse subscribeLockedProduct(subscribeLockedProductRequest)

Subscribe Locked Product(TRADE)

Subscribe Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.FlexibleLockedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleLockedApi apiInstance = new FlexibleLockedApi(defaultClient);
    SubscribeLockedProductRequest subscribeLockedProductRequest = new SubscribeLockedProductRequest(); // SubscribeLockedProductRequest | 
    try {
      SubscribeLockedProductResponse result = apiInstance.subscribeLockedProduct(subscribeLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleLockedApi#subscribeLockedProduct");
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
| **subscribeLockedProductRequest** | [**SubscribeLockedProductRequest**](SubscribeLockedProductRequest.md)|  | |

### Return type

[**SubscribeLockedProductResponse**](SubscribeLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe Locked Product |  -  |

