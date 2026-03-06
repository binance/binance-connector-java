# MarketMakerEndpointsApi

All URIs are relative to *https://eapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoCancelAllOpenOrders**](MarketMakerEndpointsApi.md#autoCancelAllOpenOrders) | **POST** /eapi/v1/countdownCancelAllHeartBeat | Auto-Cancel All Open Orders (Kill-Switch) Heartbeat (TRADE) |
| [**getAutoCancelAllOpenOrders**](MarketMakerEndpointsApi.md#getAutoCancelAllOpenOrders) | **GET** /eapi/v1/countdownCancelAll | Get Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) |
| [**getMarketMakerProtectionConfig**](MarketMakerEndpointsApi.md#getMarketMakerProtectionConfig) | **GET** /eapi/v1/mmp | Get Market Maker Protection Config (TRADE) |
| [**resetMarketMakerProtectionConfig**](MarketMakerEndpointsApi.md#resetMarketMakerProtectionConfig) | **POST** /eapi/v1/mmpReset | Reset Market Maker Protection Config (TRADE) |
| [**setAutoCancelAllOpenOrders**](MarketMakerEndpointsApi.md#setAutoCancelAllOpenOrders) | **POST** /eapi/v1/countdownCancelAll | Set Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE) |
| [**setMarketMakerProtectionConfig**](MarketMakerEndpointsApi.md#setMarketMakerProtectionConfig) | **POST** /eapi/v1/mmpSet | Set Market Maker Protection Config (TRADE) |


<a id="autoCancelAllOpenOrders"></a>
# **autoCancelAllOpenOrders**
> AutoCancelAllOpenOrdersResponse autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest)

Auto-Cancel All Open Orders (Kill-Switch) Heartbeat (TRADE)

This endpoint resets the time from which the countdown will begin to the time this messaged is received.  It should be called repeatedly as heartbeats.  Multiple heartbeats can be updated at once by specifying the underlying symbols as a list (ex. BTCUSDT,ETHUSDT) in the underlyings parameter.  * The response will only include underlying symbols where the heartbeat has been successfully updated.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    AutoCancelAllOpenOrdersRequest autoCancelAllOpenOrdersRequest = new AutoCancelAllOpenOrdersRequest(); // AutoCancelAllOpenOrdersRequest | 
    try {
      AutoCancelAllOpenOrdersResponse result = apiInstance.autoCancelAllOpenOrders(autoCancelAllOpenOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#autoCancelAllOpenOrders");
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
| **autoCancelAllOpenOrdersRequest** | [**AutoCancelAllOpenOrdersRequest**](AutoCancelAllOpenOrdersRequest.md)|  | |

### Return type

[**AutoCancelAllOpenOrdersResponse**](AutoCancelAllOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Auto-Cancel All Open Orders |  -  |

<a id="getAutoCancelAllOpenOrders"></a>
# **getAutoCancelAllOpenOrders**
> GetAutoCancelAllOpenOrdersResponse getAutoCancelAllOpenOrders(underlying, recvWindow)

Get Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE)

This endpoint returns the auto-cancel parameters for each underlying symbol. Note only active auto-cancel parameters will be returned, if countdownTime is set to 0 (ie. countdownTime has been turned off), the underlying symbol and corresponding countdownTime parameter will not be returned in the response.  * countdownTime &#x3D; 0 means the function is disabled.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    String underlying = "underlying_example"; // String | underlying, e.g BTCUSDT
    Long recvWindow = 56L; // Long | 
    try {
      GetAutoCancelAllOpenOrdersResponse result = apiInstance.getAutoCancelAllOpenOrders(underlying, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#getAutoCancelAllOpenOrders");
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
| **underlying** | **String**| underlying, e.g BTCUSDT | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetAutoCancelAllOpenOrdersResponse**](GetAutoCancelAllOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Auto-Cancel All Open Orders |  -  |

<a id="getMarketMakerProtectionConfig"></a>
# **getMarketMakerProtectionConfig**
> GetMarketMakerProtectionConfigResponse getMarketMakerProtectionConfig(underlying, recvWindow)

Get Market Maker Protection Config (TRADE)

Get config for MMP.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    String underlying = "underlying_example"; // String | underlying, e.g BTCUSDT
    Long recvWindow = 56L; // Long | 
    try {
      GetMarketMakerProtectionConfigResponse result = apiInstance.getMarketMakerProtectionConfig(underlying, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#getMarketMakerProtectionConfig");
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
| **underlying** | **String**| underlying, e.g BTCUSDT | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetMarketMakerProtectionConfigResponse**](GetMarketMakerProtectionConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Market Maker Protection Config |  -  |

<a id="resetMarketMakerProtectionConfig"></a>
# **resetMarketMakerProtectionConfig**
> ResetMarketMakerProtectionConfigResponse resetMarketMakerProtectionConfig(resetMarketMakerProtectionConfigRequest)

Reset Market Maker Protection Config (TRADE)

Reset MMP, start MMP order again.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    ResetMarketMakerProtectionConfigRequest resetMarketMakerProtectionConfigRequest = new ResetMarketMakerProtectionConfigRequest(); // ResetMarketMakerProtectionConfigRequest | 
    try {
      ResetMarketMakerProtectionConfigResponse result = apiInstance.resetMarketMakerProtectionConfig(resetMarketMakerProtectionConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#resetMarketMakerProtectionConfig");
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
| **resetMarketMakerProtectionConfigRequest** | [**ResetMarketMakerProtectionConfigRequest**](ResetMarketMakerProtectionConfigRequest.md)|  | |

### Return type

[**ResetMarketMakerProtectionConfigResponse**](ResetMarketMakerProtectionConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Reset Market Maker Protection Config |  -  |

<a id="setAutoCancelAllOpenOrders"></a>
# **setAutoCancelAllOpenOrders**
> SetAutoCancelAllOpenOrdersResponse setAutoCancelAllOpenOrders(setAutoCancelAllOpenOrdersRequest)

Set Auto-Cancel All Open Orders (Kill-Switch) Config (TRADE)

This endpoint sets the parameters of the auto-cancel feature which cancels all open orders (both market maker protection and non market maker protection order types) of the underlying symbol at the end of the specified countdown time period if no heartbeat message is sent.  After the countdown time period, all open orders will be cancelled and new orders will be rejected with error code -2010 until either a heartbeat message is sent or the auto-cancel feature is turned off by setting countdownTime to 0.   * This rest endpoint sets up the parameters to cancel your open orders in case of an outage or disconnection. * Example usage: Call this endpoint with a countdownTime value of 10000 (10 seconds) to turn on the auto-cancel feature. If the corresponding countdownCancelAllHeartBeat endpoint is not called within 10 seconds with the specified underlying symbol, all open orders of the specified symbol will be automatically canceled. If this endpoint is called with an countdownTime of 0, the countdown timer will be stopped. * The system will check all countdowns approximately every 1000 milliseconds, **please note that sufficient redundancy should be considered when using this function**. We do not recommend setting the countdown time to be too precise or too small.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    SetAutoCancelAllOpenOrdersRequest setAutoCancelAllOpenOrdersRequest = new SetAutoCancelAllOpenOrdersRequest(); // SetAutoCancelAllOpenOrdersRequest | 
    try {
      SetAutoCancelAllOpenOrdersResponse result = apiInstance.setAutoCancelAllOpenOrders(setAutoCancelAllOpenOrdersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#setAutoCancelAllOpenOrders");
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
| **setAutoCancelAllOpenOrdersRequest** | [**SetAutoCancelAllOpenOrdersRequest**](SetAutoCancelAllOpenOrdersRequest.md)|  | |

### Return type

[**SetAutoCancelAllOpenOrdersResponse**](SetAutoCancelAllOpenOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Auto-Cancel All Open Orders |  -  |

<a id="setMarketMakerProtectionConfig"></a>
# **setMarketMakerProtectionConfig**
> SetMarketMakerProtectionConfigResponse setMarketMakerProtectionConfig(setMarketMakerProtectionConfigRequest)

Set Market Maker Protection Config (TRADE)

Set config for MMP. Market Maker Protection(MMP) is a set of protection mechanism for option market maker, this mechanism is able to prevent mass trading in short period time. Once market maker&#39;s account branches the threshold, the Market Maker Protection will be triggered. When Market Maker Protection triggers, all the current MMP orders will be canceled, new MMP orders will be rejected. Market maker can use this time to reevaluate market and modify order price.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_options.ApiClient;
import com.binance.connector.client.derivatives_trading_options.ApiException;
import com.binance.connector.client.derivatives_trading_options.Configuration;
import com.binance.connector.client.derivatives_trading_options.models.*;
import com.binance.connector.client.derivatives_trading_options.rest.api.MarketMakerEndpointsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eapi.binance.com");

    MarketMakerEndpointsApi apiInstance = new MarketMakerEndpointsApi(defaultClient);
    SetMarketMakerProtectionConfigRequest setMarketMakerProtectionConfigRequest = new SetMarketMakerProtectionConfigRequest(); // SetMarketMakerProtectionConfigRequest | 
    try {
      SetMarketMakerProtectionConfigResponse result = apiInstance.setMarketMakerProtectionConfig(setMarketMakerProtectionConfigRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketMakerEndpointsApi#setMarketMakerProtectionConfig");
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
| **setMarketMakerProtectionConfigRequest** | [**SetMarketMakerProtectionConfigRequest**](SetMarketMakerProtectionConfigRequest.md)|  | |

### Return type

[**SetMarketMakerProtectionConfigResponse**](SetMarketMakerProtectionConfigResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Market Maker Protection Config |  -  |

