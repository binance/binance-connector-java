# ConvertApi

All URIs are relative to *https://fapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acceptTheOfferedQuote**](ConvertApi.md#acceptTheOfferedQuote) | **POST** /fapi/v1/convert/acceptQuote | Accept the offered quote (USER_DATA) |
| [**listAllConvertPairs**](ConvertApi.md#listAllConvertPairs) | **GET** /fapi/v1/convert/exchangeInfo | List All Convert Pairs |
| [**orderStatus**](ConvertApi.md#orderStatus) | **GET** /fapi/v1/convert/orderStatus | Order status (USER_DATA) |
| [**sendQuoteRequest**](ConvertApi.md#sendQuoteRequest) | **POST** /fapi/v1/convert/getQuote | Send Quote Request (USER_DATA) |


<a id="acceptTheOfferedQuote"></a>
# **acceptTheOfferedQuote**
> AcceptTheOfferedQuoteResponse acceptTheOfferedQuote(acceptTheOfferedQuoteRequest)

Accept the offered quote (USER_DATA)

Accept the offered quote by quote ID.  Weight(IP): 200  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.ConvertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    ConvertApi apiInstance = new ConvertApi(defaultClient);
    AcceptTheOfferedQuoteRequest acceptTheOfferedQuoteRequest = new AcceptTheOfferedQuoteRequest(); // AcceptTheOfferedQuoteRequest | 
    try {
      AcceptTheOfferedQuoteResponse result = apiInstance.acceptTheOfferedQuote(acceptTheOfferedQuoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertApi#acceptTheOfferedQuote");
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
| **acceptTheOfferedQuoteRequest** | [**AcceptTheOfferedQuoteRequest**](AcceptTheOfferedQuoteRequest.md)|  | |

### Return type

[**AcceptTheOfferedQuoteResponse**](AcceptTheOfferedQuoteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Accept the offered quote |  -  |

<a id="listAllConvertPairs"></a>
# **listAllConvertPairs**
> ListAllConvertPairsResponse listAllConvertPairs(fromAsset, toAsset)

List All Convert Pairs

Query for all convertible token pairs and the tokens’ respective upper/lower limits  Weight(IP): 20  Notes: - User needs to supply either or both of the input parameter - If not defined for both fromAsset and toAsset, only partial token pairs will be returned - Asset BNFCR is only available to convert for MICA region users.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.ConvertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    ConvertApi apiInstance = new ConvertApi(defaultClient);
    String fromAsset = "BTC"; // String | User spends coin
    String toAsset = "USDT"; // String | User receives coin
    try {
      ListAllConvertPairsResponse result = apiInstance.listAllConvertPairs(fromAsset, toAsset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertApi#listAllConvertPairs");
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
| **fromAsset** | **String**| User spends coin | [optional] |
| **toAsset** | **String**| User receives coin | [optional] |

### Return type

[**ListAllConvertPairsResponse**](ListAllConvertPairsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List All Convert Pairs |  -  |

<a id="orderStatus"></a>
# **orderStatus**
> OrderStatusResponse orderStatus(orderId, quoteId)

Order status (USER_DATA)

Query order status by order ID.  Weight(IP): 50  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.ConvertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    ConvertApi apiInstance = new ConvertApi(defaultClient);
    String orderId = "933256278426274400"; // String | Either orderId or quoteId is required
    String quoteId = "1"; // String | Either orderId or quoteId is required
    try {
      OrderStatusResponse result = apiInstance.orderStatus(orderId, quoteId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertApi#orderStatus");
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
| **orderId** | **String**| Either orderId or quoteId is required | [optional] |
| **quoteId** | **String**| Either orderId or quoteId is required | [optional] |

### Return type

[**OrderStatusResponse**](OrderStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order status |  -  |

<a id="sendQuoteRequest"></a>
# **sendQuoteRequest**
> SendQuoteRequestResponse sendQuoteRequest(sendQuoteRequestRequest)

Send Quote Request (USER_DATA)

Request a quote for the requested token pairs  Weight: 50(IP) 360/hour, 500/day  Security Type: USER_DATA  Notes: - Either fromAmount or toAmount should be sent - &#x60;quoteId&#x60; will be returned only if you have enough funds to convert

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_usds_futures.ApiClient;
import com.binance.connector.client.derivatives_trading_usds_futures.ApiException;
import com.binance.connector.client.derivatives_trading_usds_futures.Configuration;
import com.binance.connector.client.derivatives_trading_usds_futures.models.*;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.ConvertApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fapi.binance.com");

    ConvertApi apiInstance = new ConvertApi(defaultClient);
    SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest(); // SendQuoteRequestRequest | 
    try {
      SendQuoteRequestResponse result = apiInstance.sendQuoteRequest(sendQuoteRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertApi#sendQuoteRequest");
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
| **sendQuoteRequestRequest** | [**SendQuoteRequestRequest**](SendQuoteRequestRequest.md)|  | |

### Return type

[**SendQuoteRequestResponse**](SendQuoteRequestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Send Quote Request |  -  |

