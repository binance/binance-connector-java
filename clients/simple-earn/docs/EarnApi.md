# EarnApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFlexibleSubscriptionPreview**](EarnApi.md#getFlexibleSubscriptionPreview) | **GET** /sapi/v1/simple-earn/flexible/subscriptionPreview | Get Flexible Subscription Preview(USER_DATA) |
| [**getLockedSubscriptionPreview**](EarnApi.md#getLockedSubscriptionPreview) | **GET** /sapi/v1/simple-earn/locked/subscriptionPreview | Get Locked Subscription Preview(USER_DATA) |
| [**redeemFlexibleProduct**](EarnApi.md#redeemFlexibleProduct) | **POST** /sapi/v1/simple-earn/flexible/redeem | Redeem Flexible Product(TRADE) |
| [**redeemLockedProduct**](EarnApi.md#redeemLockedProduct) | **POST** /sapi/v1/simple-earn/locked/redeem | Redeem Locked Product(TRADE) |
| [**setFlexibleAutoSubscribe**](EarnApi.md#setFlexibleAutoSubscribe) | **POST** /sapi/v1/simple-earn/flexible/setAutoSubscribe | Set Flexible Auto Subscribe(USER_DATA) |
| [**setLockedAutoSubscribe**](EarnApi.md#setLockedAutoSubscribe) | **POST** /sapi/v1/simple-earn/locked/setAutoSubscribe | Set Locked Auto Subscribe(USER_DATA) |
| [**setLockedProductRedeemOption**](EarnApi.md#setLockedProductRedeemOption) | **POST** /sapi/v1/simple-earn/locked/setRedeemOption | Set Locked Product Redeem Option(USER_DATA) |
| [**subscribeFlexibleProduct**](EarnApi.md#subscribeFlexibleProduct) | **POST** /sapi/v1/simple-earn/flexible/subscribe | Subscribe Flexible Product(TRADE) |
| [**subscribeLockedProduct**](EarnApi.md#subscribeLockedProduct) | **POST** /sapi/v1/simple-earn/locked/subscribe | Subscribe Locked Product(TRADE) |


<a id="getFlexibleSubscriptionPreview"></a>
# **getFlexibleSubscriptionPreview**
> GetFlexibleSubscriptionPreviewResponse getFlexibleSubscriptionPreview(productId, amount, recvWindow)

Get Flexible Subscription Preview(USER_DATA)

Get Flexible Subscription Preview  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    String productId = "productId_example"; // String | 
    Double amount = 3.4D; // Double | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleSubscriptionPreviewResponse result = apiInstance.getFlexibleSubscriptionPreview(productId, amount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#getFlexibleSubscriptionPreview");
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
| **productId** | **String**|  | |
| **amount** | **Double**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleSubscriptionPreviewResponse**](GetFlexibleSubscriptionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Subscription Preview |  -  |

<a id="getLockedSubscriptionPreview"></a>
# **getLockedSubscriptionPreview**
> GetLockedSubscriptionPreviewResponse getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow)

Get Locked Subscription Preview(USER_DATA)

Get Locked Subscription Preview  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    String projectId = "projectId_example"; // String | 
    Double amount = 3.4D; // Double | 
    Boolean autoSubscribe = true; // Boolean | true or false, default true.
    Long recvWindow = 56L; // Long | 
    try {
      GetLockedSubscriptionPreviewResponse result = apiInstance.getLockedSubscriptionPreview(projectId, amount, autoSubscribe, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#getLockedSubscriptionPreview");
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
| **projectId** | **String**|  | |
| **amount** | **Double**|  | |
| **autoSubscribe** | **Boolean**| true or false, default true. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLockedSubscriptionPreviewResponse**](GetLockedSubscriptionPreviewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Locked Subscription Preview |  -  |

<a id="redeemFlexibleProduct"></a>
# **redeemFlexibleProduct**
> RedeemFlexibleProductResponse redeemFlexibleProduct(redeemFlexibleProductRequest)

Redeem Flexible Product(TRADE)

Redeem Flexible Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    RedeemFlexibleProductRequest redeemFlexibleProductRequest = new RedeemFlexibleProductRequest(); // RedeemFlexibleProductRequest | 
    try {
      RedeemFlexibleProductResponse result = apiInstance.redeemFlexibleProduct(redeemFlexibleProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#redeemFlexibleProduct");
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
| **redeemFlexibleProductRequest** | [**RedeemFlexibleProductRequest**](RedeemFlexibleProductRequest.md)|  | |

### Return type

[**RedeemFlexibleProductResponse**](RedeemFlexibleProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem Flexible Product |  -  |

<a id="redeemLockedProduct"></a>
# **redeemLockedProduct**
> RedeemLockedProductResponse redeemLockedProduct(redeemLockedProductRequest)

Redeem Locked Product(TRADE)

Redeem Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1/3s per account

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    RedeemLockedProductRequest redeemLockedProductRequest = new RedeemLockedProductRequest(); // RedeemLockedProductRequest | 
    try {
      RedeemLockedProductResponse result = apiInstance.redeemLockedProduct(redeemLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#redeemLockedProduct");
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
| **redeemLockedProductRequest** | [**RedeemLockedProductRequest**](RedeemLockedProductRequest.md)|  | |

### Return type

[**RedeemLockedProductResponse**](RedeemLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem Locked Product |  -  |

<a id="setFlexibleAutoSubscribe"></a>
# **setFlexibleAutoSubscribe**
> SetFlexibleAutoSubscribeResponse setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest)

Set Flexible Auto Subscribe(USER_DATA)

Set Flexible Auto Subscribe  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    SetFlexibleAutoSubscribeRequest setFlexibleAutoSubscribeRequest = new SetFlexibleAutoSubscribeRequest(); // SetFlexibleAutoSubscribeRequest | 
    try {
      SetFlexibleAutoSubscribeResponse result = apiInstance.setFlexibleAutoSubscribe(setFlexibleAutoSubscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#setFlexibleAutoSubscribe");
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
| **setFlexibleAutoSubscribeRequest** | [**SetFlexibleAutoSubscribeRequest**](SetFlexibleAutoSubscribeRequest.md)|  | |

### Return type

[**SetFlexibleAutoSubscribeResponse**](SetFlexibleAutoSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Flexible Auto Subscribe |  -  |

<a id="setLockedAutoSubscribe"></a>
# **setLockedAutoSubscribe**
> SetLockedAutoSubscribeResponse setLockedAutoSubscribe(setLockedAutoSubscribeRequest)

Set Locked Auto Subscribe(USER_DATA)

Set locked auto subscribe  Weight: 150

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    SetLockedAutoSubscribeRequest setLockedAutoSubscribeRequest = new SetLockedAutoSubscribeRequest(); // SetLockedAutoSubscribeRequest | 
    try {
      SetLockedAutoSubscribeResponse result = apiInstance.setLockedAutoSubscribe(setLockedAutoSubscribeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#setLockedAutoSubscribe");
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
| **setLockedAutoSubscribeRequest** | [**SetLockedAutoSubscribeRequest**](SetLockedAutoSubscribeRequest.md)|  | |

### Return type

[**SetLockedAutoSubscribeResponse**](SetLockedAutoSubscribeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Locked Auto Subscribe |  -  |

<a id="setLockedProductRedeemOption"></a>
# **setLockedProductRedeemOption**
> SetLockedProductRedeemOptionResponse setLockedProductRedeemOption(setLockedProductRedeemOptionRequest)

Set Locked Product Redeem Option(USER_DATA)

Set redeem option for Locked product  Weight: 50

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    SetLockedProductRedeemOptionRequest setLockedProductRedeemOptionRequest = new SetLockedProductRedeemOptionRequest(); // SetLockedProductRedeemOptionRequest | 
    try {
      SetLockedProductRedeemOptionResponse result = apiInstance.setLockedProductRedeemOption(setLockedProductRedeemOptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#setLockedProductRedeemOption");
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
| **setLockedProductRedeemOptionRequest** | [**SetLockedProductRedeemOptionRequest**](SetLockedProductRedeemOptionRequest.md)|  | |

### Return type

[**SetLockedProductRedeemOptionResponse**](SetLockedProductRedeemOptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Locked Product Redeem Option |  -  |

<a id="subscribeFlexibleProduct"></a>
# **subscribeFlexibleProduct**
> SubscribeFlexibleProductResponse subscribeFlexibleProduct(subscribeFlexibleProductRequest)

Subscribe Flexible Product(TRADE)

Subscribe Flexible Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    SubscribeFlexibleProductRequest subscribeFlexibleProductRequest = new SubscribeFlexibleProductRequest(); // SubscribeFlexibleProductRequest | 
    try {
      SubscribeFlexibleProductResponse result = apiInstance.subscribeFlexibleProduct(subscribeFlexibleProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#subscribeFlexibleProduct");
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
| **subscribeFlexibleProductRequest** | [**SubscribeFlexibleProductRequest**](SubscribeFlexibleProductRequest.md)|  | |

### Return type

[**SubscribeFlexibleProductResponse**](SubscribeFlexibleProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe Flexible Product |  -  |

<a id="subscribeLockedProduct"></a>
# **subscribeLockedProduct**
> SubscribeLockedProductResponse subscribeLockedProduct(subscribeLockedProductRequest)

Subscribe Locked Product(TRADE)

Subscribe Locked Product  * You need to open &#x60;Enable Spot &amp; Margin Trading&#x60; permission for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.simple_earn.ApiClient;
import com.binance.connector.client.simple_earn.ApiException;
import com.binance.connector.client.simple_earn.Configuration;
import com.binance.connector.client.simple_earn.models.*;
import com.binance.connector.client.simple_earn.rest.api.EarnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    EarnApi apiInstance = new EarnApi(defaultClient);
    SubscribeLockedProductRequest subscribeLockedProductRequest = new SubscribeLockedProductRequest(); // SubscribeLockedProductRequest | 
    try {
      SubscribeLockedProductResponse result = apiInstance.subscribeLockedProduct(subscribeLockedProductRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarnApi#subscribeLockedProduct");
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
| **subscribeLockedProductRequest** | [**SubscribeLockedProductRequest**](SubscribeLockedProductRequest.md)|  | |

### Return type

[**SubscribeLockedProductResponse**](SubscribeLockedProductResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe Locked Product |  -  |

