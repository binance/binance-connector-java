# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getC2CTradeHistory**](DefaultApi.md#getC2CTradeHistory) | **GET** /sapi/v1/c2c/orderMatch/listUserOrderHistory | Get C2C Trade History (USER_DATA) |


<a id="getC2CTradeHistory"></a>
# **getC2CTradeHistory**
> GetC2CTradeHistoryResponse getC2CTradeHistory(tradeType, startTimestamp, endTimestamp, page, rows)

Get C2C Trade History (USER_DATA)

Get C2C Trade History  Weight(IP): 1  Security Type: USER_DATA  Notes: - The max interval between &#x60;startTimestamp&#x60; and &#x60;endTimestamp&#x60; is 30 days. - If &#x60;startTimestamp&#x60; and &#x60;endTimestamp&#x60; are not sent, the recent 30 days&#39; data is returned. - You can only view data from the past 6 months. For all C2C orders, check &#x60;https://c2c.binance.com/en/fiatOrder&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.c2c.ApiClient;
import com.binance.connector.client.c2c.ApiException;
import com.binance.connector.client.c2c.Configuration;
import com.binance.connector.client.c2c.models.*;
import com.binance.connector.client.c2c.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TradeType tradeType = TradeType.fromValue("BUY"); // TradeType | Trade side filter
    Long startTimestamp = 1770736694138L; // Long | 
    Long endTimestamp = 1770736694138L; // Long | 
    Long page = 1L; // Long | Page number
    Long rows = 100L; // Long | Number of records per page
    try {
      GetC2CTradeHistoryResponse result = apiInstance.getC2CTradeHistory(tradeType, startTimestamp, endTimestamp, page, rows);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getC2CTradeHistory");
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
| **tradeType** | [**TradeType**](.md)| Trade side filter | [optional] [enum: BUY, SELL] |
| **startTimestamp** | **Long**|  | [optional] |
| **endTimestamp** | **Long**|  | [optional] |
| **page** | **Long**| Page number | [optional] |
| **rows** | **Long**| Number of records per page | [optional] |

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

