# OthersApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSymbolsDelistScheduleForSpot**](OthersApi.md#getSymbolsDelistScheduleForSpot) | **GET** /sapi/v1/spot/delist-schedule | Get symbols delist schedule for spot (MARKET_DATA) |
| [**systemStatus**](OthersApi.md#systemStatus) | **GET** /sapi/v1/system/status | System Status (System) |


<a id="getSymbolsDelistScheduleForSpot"></a>
# **getSymbolsDelistScheduleForSpot**
> GetSymbolsDelistScheduleForSpotResponse getSymbolsDelistScheduleForSpot(recvWindow)

Get symbols delist schedule for spot (MARKET_DATA)

Get symbols delist schedule for spot  Weight: 100

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.OthersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OthersApi apiInstance = new OthersApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      GetSymbolsDelistScheduleForSpotResponse result = apiInstance.getSymbolsDelistScheduleForSpot(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OthersApi#getSymbolsDelistScheduleForSpot");
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

[**GetSymbolsDelistScheduleForSpotResponse**](GetSymbolsDelistScheduleForSpotResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get symbols delist schedule for spot |  -  |

<a id="systemStatus"></a>
# **systemStatus**
> SystemStatusResponse systemStatus()

System Status (System)

Fetch system status.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.OthersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    OthersApi apiInstance = new OthersApi(defaultClient);
    try {
      SystemStatusResponse result = apiInstance.systemStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OthersApi#systemStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SystemStatusResponse**](SystemStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | System Status |  -  |

