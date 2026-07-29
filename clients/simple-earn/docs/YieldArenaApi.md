# YieldArenaApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getYieldArenaActivities**](YieldArenaApi.md#getYieldArenaActivities) | **GET** /sapi/v1/earn/arena/activities | Get Yield Arena Activities (USER_DATA) |


<a id="getYieldArenaActivities"></a>
# **getYieldArenaActivities**
> GetYieldArenaActivitiesResponse getYieldArenaActivities(lang, recvWindow)

Get Yield Arena Activities (USER_DATA)

Get the list of Earn Yield Arena giveaway activities currently available to the user.  Weight(IP): 150  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.YieldArenaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    YieldArenaApi apiInstance = new YieldArenaApi(defaultClient);
    String lang = "en"; // String | Locale tag for `title` and `description` (e.g. `en`, `zh-CN`, `pt-BR`). Default: `en`. If the value is missing, malformed, or has no translation configured, content is returned in `en`.
    Long recvWindow = 5000L; // Long | 
    try {
      GetYieldArenaActivitiesResponse result = apiInstance.getYieldArenaActivities(lang, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YieldArenaApi#getYieldArenaActivities");
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
| **lang** | **String**| Locale tag for &#x60;title&#x60; and &#x60;description&#x60; (e.g. &#x60;en&#x60;, &#x60;zh-CN&#x60;, &#x60;pt-BR&#x60;). Default: &#x60;en&#x60;. If the value is missing, malformed, or has no translation configured, content is returned in &#x60;en&#x60;. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetYieldArenaActivitiesResponse**](GetYieldArenaActivitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Yield Arena Activities |  -  |

