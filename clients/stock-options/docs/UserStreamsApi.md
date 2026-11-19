# UserStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderReportV2Stream**](UserStreamsApi.md#orderReportV2Stream) | **POST** /&lt;listenKey&gt;@orderReportV2 | Order Report V2 Stream |


<a id="orderReportV2Stream"></a>
# **orderReportV2Stream**
> OrderReportV2StreamResponse orderReportV2Stream(orderReportV2StreamRequest)

Order Report V2 Stream

Real-time push of the user&#39;s order updates. Option orders are pushed on &#x60;orderReportV2&#x60;, **not** on &#x60;orderReport&#x60;.  &#x60;orderReportV2&#x60; carries both US stock and US stock option orders; tell them apart with the &#x60;ac&#x60; field. To process option orders only, subscribe to &#x60;orderReportV2&#x60; and handle events where &#x60;ac&#x60; &#x3D; &#x60;us_option&#x60;.  A push is sent once when an open order changes (&#x60;x&#x60; &#x3D; &#x60;ORDER_UPDATE&#x60;) and once when it reaches a terminal state (&#x60;x&#x60; &#x3D; &#x60;ORDER_TERMINAL&#x60;). Pushes are best-effort: a failed push is not retried, events while the &#x60;listenKey&#x60; is invalid are not replayed, and an order never pushed in an open state (e.g. rejected immediately) may not get a terminal push. After reconnecting, call Current Open Option Orders for a full snapshot first. Fill-level details are not pushed; use Option Order Detail or Option Trade History.  For expiration-day auto-liquidation orders by the broker (&#x60;o&#x60; &#x3D; &#x60;market&#x60;), &#x60;p&#x60;, &#x60;b&#x60;, &#x60;q&#x60;, &#x60;tc&#x60;, &#x60;u&#x60;, &#x60;ct&#x60;, &#x60;sp&#x60; and &#x60;ed&#x60; may be &#x60;null&#x60;; get contract details from Option Exchange Info by &#x60;os&#x60;.  Prerequisite: obtain a &#x60;listenKey&#x60; via the Listen Key endpoint first.

### Example
```java
// Import classes:
import com.binance.connector.client.stock_options.ApiClient;
import com.binance.connector.client.stock_options.ApiException;
import com.binance.connector.client.stock_options.Configuration;
import com.binance.connector.client.stock_options.models.*;
import com.binance.connector.client.stock_options.websocket.stream.api.UserStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserStreamsApi apiInstance = new UserStreamsApi(defaultClient);
    OrderReportV2StreamRequest orderReportV2StreamRequest = new OrderReportV2StreamRequest(); // OrderReportV2StreamRequest | 
    try {
      OrderReportV2StreamResponse result = apiInstance.orderReportV2Stream(orderReportV2StreamRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserStreamsApi#orderReportV2Stream");
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
| **orderReportV2StreamRequest** | [**OrderReportV2StreamRequest**](OrderReportV2StreamRequest.md)|  | |

### Return type

[**OrderReportV2StreamResponse**](OrderReportV2StreamResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order Report V2 Stream |  -  |

