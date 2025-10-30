# BfusdApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBfusdAccount**](BfusdApi.md#getBfusdAccount) | **GET** /sapi/v1/bfusd/account | Get BFUSD Account (USER_DATA) |
| [**getBfusdQuotaDetails**](BfusdApi.md#getBfusdQuotaDetails) | **GET** /sapi/v1/bfusd/quota | Get BFUSD Quota Details (USER_DATA) |
| [**getBfusdRateHistory**](BfusdApi.md#getBfusdRateHistory) | **GET** /sapi/v1/bfusd/history/rateHistory | Get BFUSD Rate History (USER_DATA) |
| [**getBfusdRedemptionHistory**](BfusdApi.md#getBfusdRedemptionHistory) | **GET** /sapi/v1/bfusd/history/redemptionHistory | Get BFUSD Redemption History (USER_DATA) |
| [**getBfusdRewardsHistory**](BfusdApi.md#getBfusdRewardsHistory) | **GET** /sapi/v1/bfusd/history/rewardsHistory | Get BFUSD Rewards History (USER_DATA) |
| [**getBfusdSubscriptionHistory**](BfusdApi.md#getBfusdSubscriptionHistory) | **GET** /sapi/v1/bfusd/history/subscriptionHistory | Get BFUSD subscription history(USER_DATA) |
| [**redeemBfusd**](BfusdApi.md#redeemBfusd) | **POST** /sapi/v1/bfusd/redeem | Redeem BFUSD(TRADE) |
| [**subscribeBfusd**](BfusdApi.md#subscribeBfusd) | **POST** /sapi/v1/bfusd/subscribe | Subscribe BFUSD(TRADE) |


<a id="getBfusdAccount"></a>
# **getBfusdAccount**
> GetBfusdAccountResponse getBfusdAccount(recvWindow)

Get BFUSD Account (USER_DATA)

Get BFUSD account information.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdAccountResponse result = apiInstance.getBfusdAccount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdAccount");
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
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdAccountResponse**](GetBfusdAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD Account |  -  |

<a id="getBfusdQuotaDetails"></a>
# **getBfusdQuotaDetails**
> GetBfusdQuotaDetailsResponse getBfusdQuotaDetails(recvWindow)

Get BFUSD Quota Details (USER_DATA)

Get BFUSD quota details including fast redemption quota and standard redemption quota.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdQuotaDetailsResponse result = apiInstance.getBfusdQuotaDetails(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdQuotaDetails");
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
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdQuotaDetailsResponse**](GetBfusdQuotaDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD Quota Details |  -  |

<a id="getBfusdRateHistory"></a>
# **getBfusdRateHistory**
> GetBfusdRateHistoryResponse getBfusdRateHistory(startTime, endTime, current, size, recvWindow)

Get BFUSD Rate History (USER_DATA)

Get BFUSD rate history sorted by descending order.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Starts from 1. Default: 1
    Long size = 56L; // Long | Number of results per page. Default: 10, Max: 100
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdRateHistoryResponse result = apiInstance.getBfusdRateHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdRateHistory");
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
| **current** | **Long**| Currently querying page. Starts from 1. Default: 1 | [optional] |
| **size** | **Long**| Number of results per page. Default: 10, Max: 100 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdRateHistoryResponse**](GetBfusdRateHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD Rate History |  -  |

<a id="getBfusdRedemptionHistory"></a>
# **getBfusdRedemptionHistory**
> GetBfusdRedemptionHistoryResponse getBfusdRedemptionHistory(startTime, endTime, current, size, recvWindow)

Get BFUSD Redemption History (USER_DATA)

Get BFUSD redemption history.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Starts from 1. Default: 1
    Long size = 56L; // Long | Number of results per page. Default: 10, Max: 100
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdRedemptionHistoryResponse result = apiInstance.getBfusdRedemptionHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdRedemptionHistory");
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
| **current** | **Long**| Currently querying page. Starts from 1. Default: 1 | [optional] |
| **size** | **Long**| Number of results per page. Default: 10, Max: 100 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdRedemptionHistoryResponse**](GetBfusdRedemptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD Redemption History |  -  |

<a id="getBfusdRewardsHistory"></a>
# **getBfusdRewardsHistory**
> GetBfusdRewardsHistoryResponse getBfusdRewardsHistory(startTime, endTime, current, size, recvWindow)

Get BFUSD Rewards History (USER_DATA)

Get BFUSD rewards history.  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time minus one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Starts from 1. Default: 1
    Long size = 56L; // Long | Number of results per page. Default: 10, Max: 100
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdRewardsHistoryResponse result = apiInstance.getBfusdRewardsHistory(startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdRewardsHistory");
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
| **current** | **Long**| Currently querying page. Starts from 1. Default: 1 | [optional] |
| **size** | **Long**| Number of results per page. Default: 10, Max: 100 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdRewardsHistoryResponse**](GetBfusdRewardsHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD Rewards History |  -  |

<a id="getBfusdSubscriptionHistory"></a>
# **getBfusdSubscriptionHistory**
> GetBfusdSubscriptionHistoryResponse getBfusdSubscriptionHistory(asset, startTime, endTime, current, size, recvWindow)

Get BFUSD subscription history(USER_DATA)

Get BFUSD subscription history  * The time between &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 6 months. * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, &#x60;endTime&#x60; will default to current time, and results from &#x60;startTime&#x60; onward will be returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, &#x60;startTime&#x60; defaults to the current time advanced by one month, and data between &#x60;startTime&#x60; and &#x60;endTime&#x60; will be returned.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    String asset = "asset_example"; // String | USDC or USDT
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Starts from 1. Default: 1
    Long size = 56L; // Long | Number of results per page. Default: 10, Max: 100
    Long recvWindow = 56L; // Long | The value cannot be greater than 60000 (ms)
    try {
      GetBfusdSubscriptionHistoryResponse result = apiInstance.getBfusdSubscriptionHistory(asset, startTime, endTime, current, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#getBfusdSubscriptionHistory");
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
| **current** | **Long**| Currently querying page. Starts from 1. Default: 1 | [optional] |
| **size** | **Long**| Number of results per page. Default: 10, Max: 100 | [optional] |
| **recvWindow** | **Long**| The value cannot be greater than 60000 (ms) | [optional] |

### Return type

[**GetBfusdSubscriptionHistoryResponse**](GetBfusdSubscriptionHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get BFUSD subscription history |  -  |

<a id="redeemBfusd"></a>
# **redeemBfusd**
> RedeemBfusdResponse redeemBfusd(redeemBfusdRequest)

Redeem BFUSD(TRADE)

Redeem BFUSD to USDT  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    RedeemBfusdRequest redeemBfusdRequest = new RedeemBfusdRequest(); // RedeemBfusdRequest | 
    try {
      RedeemBfusdResponse result = apiInstance.redeemBfusd(redeemBfusdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#redeemBfusd");
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
| **redeemBfusdRequest** | [**RedeemBfusdRequest**](RedeemBfusdRequest.md)|  | |

### Return type

[**RedeemBfusdResponse**](RedeemBfusdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem BFUSD |  -  |

<a id="subscribeBfusd"></a>
# **subscribeBfusd**
> SubscribeBfusdResponse subscribeBfusd(subscribeBfusdRequest)

Subscribe BFUSD(TRADE)

Subscribe BFUSD  * You need to open Enable Spot &amp; Margin Trading permission for the API Key which requests this endpoint.  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.BfusdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    BfusdApi apiInstance = new BfusdApi(defaultClient);
    SubscribeBfusdRequest subscribeBfusdRequest = new SubscribeBfusdRequest(); // SubscribeBfusdRequest | 
    try {
      SubscribeBfusdResponse result = apiInstance.subscribeBfusd(subscribeBfusdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BfusdApi#subscribeBfusd");
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
| **subscribeBfusdRequest** | [**SubscribeBfusdRequest**](SubscribeBfusdRequest.md)|  | |

### Return type

[**SubscribeBfusdResponse**](SubscribeBfusdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe BFUSD |  -  |

