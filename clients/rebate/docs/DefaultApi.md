# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpotRebateHistoryRecords**](DefaultApi.md#getSpotRebateHistoryRecords) | **GET** /sapi/v1/rebate/taxQuery | Get Spot Rebate History Records (USER_DATA) |


<a id="getSpotRebateHistoryRecords"></a>
# **getSpotRebateHistoryRecords**
> GetSpotRebateHistoryRecordsResponse getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow)

Get Spot Rebate History Records (USER_DATA)

Get Spot Rebate History Records  Weight(UID): 12000  Security Type: USER_DATA  Notes: - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 7 days&#39; data will be returned. - The earliest supported &#x60;startTime&#x60; is June 10, 2020. - Return up to 200 records per request.

### Example
```java
// Import classes:
import com.binance.connector.client.rebate.ApiClient;
import com.binance.connector.client.rebate.ApiException;
import com.binance.connector.client.rebate.Configuration;
import com.binance.connector.client.rebate.models.*;
import com.binance.connector.client.rebate.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long startTime = 1623319461670L; // Long | Start time in milliseconds.
    Long endTime = 1641782889000L; // Long | End time in milliseconds.
    Long page = 1L; // Long | Page number.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      GetSpotRebateHistoryRecordsResponse result = apiInstance.getSpotRebateHistoryRecords(startTime, endTime, page, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSpotRebateHistoryRecords");
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
| **startTime** | **Long**| Start time in milliseconds. | [optional] |
| **endTime** | **Long**| End time in milliseconds. | [optional] |
| **page** | **Long**| Page number. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

