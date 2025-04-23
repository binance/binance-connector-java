# TransferApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrossMarginTransferHistory**](TransferApi.md#getCrossMarginTransferHistory) | **GET** /sapi/v1/margin/transfer | Get Cross Margin Transfer History (USER_DATA) |
| [**queryMaxTransferOutAmount**](TransferApi.md#queryMaxTransferOutAmount) | **GET** /sapi/v1/margin/maxTransferable | Query Max Transfer-Out Amount (USER_DATA) |


<a id="getCrossMarginTransferHistory"></a>
# **getCrossMarginTransferHistory**
> GetCrossMarginTransferHistoryResponse getCrossMarginTransferHistory(asset, type, startTime, endTime, current, size, isolatedSymbol, recvWindow)

Get Cross Margin Transfer History (USER_DATA)

Get Cross Margin Transfer History  * Response in descending order * The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 30 days. * Returns data for last 7 days by default  Weight: 1(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String asset = "asset_example"; // String | 
    String type = "type_example"; // String | Transfer Type: ROLL_IN, ROLL_OUT
    Long startTime = 56L; // Long | 只支持查询最近90天的数据
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    String isolatedSymbol = "isolatedSymbol_example"; // String | isolated symbol
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      GetCrossMarginTransferHistoryResponse result = apiInstance.getCrossMarginTransferHistory(asset, type, startTime, endTime, current, size, isolatedSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#getCrossMarginTransferHistory");
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
| **asset** | **String**|  | [optional] |
| **type** | **String**| Transfer Type: ROLL_IN, ROLL_OUT | [optional] |
| **startTime** | **Long**| 只支持查询最近90天的数据 | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
| **isolatedSymbol** | **String**| isolated symbol | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**GetCrossMarginTransferHistoryResponse**](GetCrossMarginTransferHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Cross Margin Transfer History |  -  |

<a id="queryMaxTransferOutAmount"></a>
# **queryMaxTransferOutAmount**
> QueryMaxTransferOutAmountResponse queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow)

Query Max Transfer-Out Amount (USER_DATA)

Query Max Transfer-Out Amount  * If isolatedSymbol is not sent, crossed margin data will be sent.  Weight: 50(IP)

### Example
```java
// Import classes:
import com.binance.connector.client.margin_trading.ApiClient;
import com.binance.connector.client.margin_trading.ApiException;
import com.binance.connector.client.margin_trading.Configuration;
import com.binance.connector.client.margin_trading.models.*;
import com.binance.connector.client.margin_trading.rest.api.TransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TransferApi apiInstance = new TransferApi(defaultClient);
    String asset = "asset_example"; // String | 
    String isolatedSymbol = "isolatedSymbol_example"; // String | isolated symbol
    Long recvWindow = 56L; // Long | No more than 60000
    try {
      QueryMaxTransferOutAmountResponse result = apiInstance.queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransferApi#queryMaxTransferOutAmount");
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
| **asset** | **String**|  | |
| **isolatedSymbol** | **String**| isolated symbol | [optional] |
| **recvWindow** | **Long**| No more than 60000 | [optional] |

### Return type

[**QueryMaxTransferOutAmountResponse**](QueryMaxTransferOutAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Max Transfer-Out Amount |  -  |

