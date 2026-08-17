# UserStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderReportStream**](UserStreamsApi.md#orderReportStream) | **POST** /&lt;listenKey&gt;@orderReport | Order Report Stream |


<a id="orderReportStream"></a>
# **orderReportStream**
> OrderReportStreamResponse orderReportStream(orderReportStreamRequest)

Order Report Stream

Real-time push of the authenticated user&#39;s order state transitions — both open-state updates (&#x60;ORDER_UPDATE&#x60;) and terminal-state notifications (&#x60;ORDER_TERMINAL&#x60;). Prerequisite: obtain a &#x60;listenKey&#x60; via the Listen Key endpoint first.

### Example
```java
// Import classes:
import com.binance.connector.client.stocks.ApiClient;
import com.binance.connector.client.stocks.ApiException;
import com.binance.connector.client.stocks.Configuration;
import com.binance.connector.client.stocks.models.*;
import com.binance.connector.client.stocks.websocket.stream.api.UserStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserStreamsApi apiInstance = new UserStreamsApi(defaultClient);
    OrderReportStreamRequest orderReportStreamRequest = new OrderReportStreamRequest(); // OrderReportStreamRequest | 
    try {
      OrderReportStreamResponse result = apiInstance.orderReportStream(orderReportStreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserStreamsApi#orderReportStream");
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
| **orderReportStreamRequest** | [**OrderReportStreamRequest**](OrderReportStreamRequest.md)|  | |

### Return type

[**OrderReportStreamResponse**](OrderReportStreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Report Stream |  -  |

