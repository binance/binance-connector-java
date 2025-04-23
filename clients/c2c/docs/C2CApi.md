# C2CApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getC2CTradeHistory**](C2CApi.md#getC2CTradeHistory) | **GET** /sapi/v1/c2c/orderMatch/listUserOrderHistory | Get C2C Trade History (USER_DATA) |


<a id="getC2CTradeHistory"></a>
# **getC2CTradeHistory**
> GetC2CTradeHistoryResponse getC2CTradeHistory(startTime, endTime, page, recvWindow)

Get C2C Trade History (USER_DATA)

Get C2C Trade History  * The max interval between startTime and endTime is 30 days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned. * The earliest startTime is supported on June 10, 2020 * Return up to 200 records per request.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.c2c.ApiClient;
import com.binance.connector.client.c2c.ApiException;
import com.binance.connector.client.c2c.Configuration;
import com.binance.connector.client.c2c.models.*;
import com.binance.connector.client.c2c.rest.api.C2CApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    C2CApi apiInstance = new C2CApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetC2CTradeHistoryResponse result = apiInstance.getC2CTradeHistory(startTime, endTime, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling C2CApi#getC2CTradeHistory");
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
| **page** | **Long**| Default 1 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetC2CTradeHistoryResponse**](GetC2CTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get C2C Trade History |  -  |

