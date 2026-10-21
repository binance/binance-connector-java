# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**comAnnouncementEn**](DefaultApi.md#comAnnouncementEn) | **POST** /com_announcement_en |  |


<a id="comAnnouncementEn"></a>
# **comAnnouncementEn**
> ComAnnouncementEnResponse comAnnouncementEn()



Receive push notifications hen Binance publishes announcements in English (language code: en).

### Example
```java
// Import classes:
import com.binance.connector.client.cms.ApiClient;
import com.binance.connector.client.cms.ApiException;
import com.binance.connector.client.cms.Configuration;
import com.binance.connector.client.cms.models.*;
import com.binance.connector.client.cms.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      ComAnnouncementEnResponse result = apiInstance.comAnnouncementEn();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#comAnnouncementEn");
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

[**ComAnnouncementEnResponse**](ComAnnouncementEnResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Binance announcements in English (language code: en) |  -  |

