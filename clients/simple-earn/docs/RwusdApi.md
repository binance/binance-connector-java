# RwusdApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRwusdAccount**](RwusdApi.md#getRwusdAccount) | **GET** /sapi/v1/rwusd/account | Get RWUSD Account (USER_DATA) |
| [**getRwusdQuotaDetails**](RwusdApi.md#getRwusdQuotaDetails) | **GET** /sapi/v1/rwusd/quota | Get RWUSD Quota Details (USER_DATA) |
| [**getRwusdRateHistory**](RwusdApi.md#getRwusdRateHistory) | **GET** /sapi/v1/rwusd/history/rateHistory | Get RWUSD Rate History (USER_DATA) |
| [**getRwusdRedemptionHistory**](RwusdApi.md#getRwusdRedemptionHistory) | **GET** /sapi/v1/rwusd/history/redemptionHistory | Get RWUSD Redemption History (USER_DATA) |
| [**getRwusdRewardsHistory**](RwusdApi.md#getRwusdRewardsHistory) | **GET** /sapi/v1/rwusd/history/rewardsHistory | Get RWUSD Rewards History (USER_DATA) |
| [**getRwusdSubscriptionHistory**](RwusdApi.md#getRwusdSubscriptionHistory) | **GET** /sapi/v1/rwusd/history/subscriptionHistory | Get RWUSD subscription history(USER_DATA) |
| [**redeemRwusd**](RwusdApi.md#redeemRwusd) | **POST** /sapi/v1/rwusd/redeem | Redeem RWUSD(TRADE) |
| [**subscribeRwusd**](RwusdApi.md#subscribeRwusd) | **POST** /sapi/v1/rwusd/subscribe | Subscribe RWUSD(TRADE) |


<a id="getRwusdAccount"></a>
# **getRwusdAccount**
> GetRwusdAccountResponse getRwusdAccount(recvWindow)

Get RWUSD Account (USER_DATA)

Get RWUSD account information.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdAccountResponse result = apiInstance.getRwusdAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdAccount");
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

[**GetRwusdAccountResponse**](GetRwusdAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD Account |  -  |

<a id="getRwusdQuotaDetails"></a>
# **getRwusdQuotaDetails**
> GetRwusdQuotaDetailsResponse getRwusdQuotaDetails(recvWindow)

Get RWUSD Quota Details (USER_DATA)

Get RWUSD quota details including subscription quota, fast redemption quota, and standard redemption quota.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdQuotaDetailsResponse result = apiInstance.getRwusdQuotaDetails(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdQuotaDetails");
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

[**GetRwusdQuotaDetailsResponse**](GetRwusdQuotaDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD Quota Details |  -  |

<a id="getRwusdRateHistory"></a>
# **getRwusdRateHistory**
> GetRwusdRateHistoryResponse getRwusdRateHistory(startTime, endTime, current, size, recvWindow)

Get RWUSD Rate History (USER_DATA)

Get RWUSD rate history sorted by descending order.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdRateHistoryResponse result = apiInstance.getRwusdRateHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdRateHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetRwusdRateHistoryResponse**](GetRwusdRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD Rate History |  -  |

<a id="getRwusdRedemptionHistory"></a>
# **getRwusdRedemptionHistory**
> GetRwusdRedemptionHistoryResponse getRwusdRedemptionHistory(startTime, endTime, current, size, recvWindow)

Get RWUSD Redemption History (USER_DATA)

Get RWUSD redemption history.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdRedemptionHistoryResponse result = apiInstance.getRwusdRedemptionHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdRedemptionHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetRwusdRedemptionHistoryResponse**](GetRwusdRedemptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD Redemption History |  -  |

<a id="getRwusdRewardsHistory"></a>
# **getRwusdRewardsHistory**
> GetRwusdRewardsHistoryResponse getRwusdRewardsHistory(startTime, endTime, current, size, recvWindow)

Get RWUSD Rewards History (USER_DATA)

Get RWUSD rewards history.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdRewardsHistoryResponse result = apiInstance.getRwusdRewardsHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdRewardsHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetRwusdRewardsHistoryResponse**](GetRwusdRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD Rewards History |  -  |

<a id="getRwusdSubscriptionHistory"></a>
# **getRwusdSubscriptionHistory**
> GetRwusdSubscriptionHistoryResponse getRwusdSubscriptionHistory(asset, startTime, endTime, current, size, recvWindow)

Get RWUSD subscription history(USER_DATA)

Get RWUSD subscription history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time advanced by one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying the page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10, Max:100
    Long recvWindow = 56L; // Long | 
    try {
      GetRwusdSubscriptionHistoryResponse result = apiInstance.getRwusdSubscriptionHistory(asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#getRwusdSubscriptionHistory");
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying the page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10, Max:100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetRwusdSubscriptionHistoryResponse**](GetRwusdSubscriptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get RWUSD subscription history |  -  |

<a id="redeemRwusd"></a>
# **redeemRwusd**
> RedeemRwusdResponse redeemRwusd(redeemRwusdRequest)

Redeem RWUSD(TRADE)

Redeem RWUSD to USDC  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    RedeemRwusdRequest redeemRwusdRequest = new RedeemRwusdRequest(); // RedeemRwusdRequest | 
    try {
      RedeemRwusdResponse result = apiInstance.redeemRwusd(redeemRwusdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#redeemRwusd");
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
| **redeemRwusdRequest** | [**RedeemRwusdRequest**](RedeemRwusdRequest.md)|  | |

### Return type

[**RedeemRwusdResponse**](RedeemRwusdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem RWUSD |  -  |

<a id="subscribeRwusd"></a>
# **subscribeRwusd**
> SubscribeRwusdResponse subscribeRwusd(subscribeRwusdRequest)

Subscribe RWUSD(TRADE)

Subscribe RWUSD  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.RwusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RwusdApi apiInstance = new RwusdApi(defaultClient);
    SubscribeRwusdRequest subscribeRwusdRequest = new SubscribeRwusdRequest(); // SubscribeRwusdRequest | 
    try {
      SubscribeRwusdResponse result = apiInstance.subscribeRwusd(subscribeRwusdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RwusdApi#subscribeRwusd");
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
| **subscribeRwusdRequest** | [**SubscribeRwusdRequest**](SubscribeRwusdRequest.md)|  | |

### Return type

[**SubscribeRwusdResponse**](SubscribeRwusdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe RWUSD |  -  |

