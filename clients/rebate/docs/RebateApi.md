# RebateApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpotRebateHistoryRecords**](RebateApi.md#getSpotRebateHistoryRecords) | **GET** /sapi/v1/rebate/taxQuery | Get Spot Rebate History Records (USER_DATA) |


<a id="getSpotRebateHistoryRecords"></a>
# **getSpotRebateHistoryRecords**
> GetSpotRebateHistoryRecordsResponse getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow)

Get Spot Rebate History Records (USER_DATA)

Get Spot Rebate History Records  * The max interval between startTime and endTime is 30 days. * If startTime and endTime are not sent, the recent 7 days&#39; data will be returned. * The earliest startTime is supported on June 10, 2020 * Return up to 200 records per request.  Weight: 12000

### Example
```java
// Import classes:
import com.binance.connector.client.rebate.ApiClient;
import com.binance.connector.client.rebate.ApiException;
import com.binance.connector.client.rebate.Configuration;
import com.binance.connector.client.rebate.models.*;
import com.binance.connector.client.rebate.rest.api.RebateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RebateApi apiInstance = new RebateApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long page = 56L; // Long | Default 1
    Long recvWindow = 56L; // Long | 
    try {
      GetSpotRebateHistoryRecordsResponse result = apiInstance.getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RebateApi#getSpotRebateHistoryRecords");
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

[**GetSpotRebateHistoryRecordsResponse**](GetSpotRebateHistoryRecordsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Spot Rebate History Records |  -  |

