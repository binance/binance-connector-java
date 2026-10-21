# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchClaimPartiallySucceeded**](DefaultApi.md#batchClaimPartiallySucceeded) | **POST** /web3_prediction_pm_claim_partial_success | Batch claim partially succeeded |
| [**fundTransferFailed**](DefaultApi.md#fundTransferFailed) | **POST** /web3_prediction_pm_transfer_fail | Fund transfer failed |
| [**fundTransferSucceeded**](DefaultApi.md#fundTransferSucceeded) | **POST** /web3_prediction_pm_transfer_success | Fund transfer succeeded |
| [**limitOrderFullyFilled**](DefaultApi.md#limitOrderFullyFilled) | **POST** /web3_prediction_pm_limit_order_filled | Limit order fully filled |
| [**limitOrderPartiallyFilled**](DefaultApi.md#limitOrderPartiallyFilled) | **POST** /web3_prediction_pm_limit_order_partial_fill | Limit order partially filled |
| [**limitOrderSubmissionFailed**](DefaultApi.md#limitOrderSubmissionFailed) | **POST** /web3_prediction_pm_limit_submit_fail | Limit order submission failed |
| [**limitOrderSubmittedSuccessfully**](DefaultApi.md#limitOrderSubmittedSuccessfully) | **POST** /web3_prediction_pm_limit_submit_success | Limit order submitted successfully |
| [**marketBuyOrderFailed**](DefaultApi.md#marketBuyOrderFailed) | **POST** /web3_prediction_pm_market_buy_fail | Market buy order failed / expired |
| [**marketBuyOrderFullyFilled**](DefaultApi.md#marketBuyOrderFullyFilled) | **POST** /web3_prediction_pm_market_buy_success | Market buy order fully filled |
| [**marketResolutionNotification**](DefaultApi.md#marketResolutionNotification) | **POST** /web3_prediction_pm_market_close | Market resolution notification |
| [**marketSellOrderFailedExpired**](DefaultApi.md#marketSellOrderFailedExpired) | **POST** /web3_prediction_pm_market_sell_fail | Market sell order failed / expired |
| [**marketSellOrderFullyFilled**](DefaultApi.md#marketSellOrderFullyFilled) | **POST** /web3_prediction_pm_market_sell_success | Market sell order fully filled |
| [**predictionOrderBookByMarketId**](DefaultApi.md#predictionOrderBookByMarketId) | **POST** /web3_prediction_orderbook_&lt;marketId&gt; | Prediction Order Book by marketId |
| [**rewardClaimFailed**](DefaultApi.md#rewardClaimFailed) | **POST** /web3_prediction_pm_claim_fail | Reward claim failed |
| [**rewardClaimSucceeded**](DefaultApi.md#rewardClaimSucceeded) | **POST** /web3_prediction_pm_claim_success | Reward claim succeeded |


<a id="batchClaimPartiallySucceeded"></a>
# **batchClaimPartiallySucceeded**
> BatchClaimPartiallySucceededResponse batchClaimPartiallySucceeded()

Batch claim partially succeeded

Pushed when only part of a batch claim succeeds. Only &#x60;pushId&#x60; is included — call the REST API for details.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      BatchClaimPartiallySucceededResponse result = apiInstance.batchClaimPartiallySucceeded();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#batchClaimPartiallySucceeded");
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

[**BatchClaimPartiallySucceededResponse**](BatchClaimPartiallySucceededResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="fundTransferFailed"></a>
# **fundTransferFailed**
> FundTransferFailedResponse fundTransferFailed()

Fund transfer failed

Pushed when a fund transfer fails.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      FundTransferFailedResponse result = apiInstance.fundTransferFailed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fundTransferFailed");
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

[**FundTransferFailedResponse**](FundTransferFailedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="fundTransferSucceeded"></a>
# **fundTransferSucceeded**
> FundTransferSucceededResponse fundTransferSucceeded()

Fund transfer succeeded

Pushed when a fund transfer into or out of the prediction wallet succeeds. The direction and the token are not included (currently USDT only).  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      FundTransferSucceededResponse result = apiInstance.fundTransferSucceeded();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#fundTransferSucceeded");
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

[**FundTransferSucceededResponse**](FundTransferSucceededResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="limitOrderFullyFilled"></a>
# **limitOrderFullyFilled**
> LimitOrderFullyFilledResponse limitOrderFullyFilled()

Limit order fully filled

Pushed when a **limit order** is fully filled.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      LimitOrderFullyFilledResponse result = apiInstance.limitOrderFullyFilled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#limitOrderFullyFilled");
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

[**LimitOrderFullyFilledResponse**](LimitOrderFullyFilledResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="limitOrderPartiallyFilled"></a>
# **limitOrderPartiallyFilled**
> LimitOrderPartiallyFilledResponse limitOrderPartiallyFilled()

Limit order partially filled

Pushed on each new partial fill of a **limit order**. One order can be pushed several times, so always remove duplicates by &#x60;pushId&#x60;.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      LimitOrderPartiallyFilledResponse result = apiInstance.limitOrderPartiallyFilled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#limitOrderPartiallyFilled");
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

[**LimitOrderPartiallyFilledResponse**](LimitOrderPartiallyFilledResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="limitOrderSubmissionFailed"></a>
# **limitOrderSubmissionFailed**
> LimitOrderSubmissionFailedResponse limitOrderSubmissionFailed()

Limit order submission failed

Pushed when a **limit order** is rejected when placed. No &#x60;amount&#x60; is included.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      LimitOrderSubmissionFailedResponse result = apiInstance.limitOrderSubmissionFailed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#limitOrderSubmissionFailed");
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

[**LimitOrderSubmissionFailedResponse**](LimitOrderSubmissionFailedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="limitOrderSubmittedSuccessfully"></a>
# **limitOrderSubmittedSuccessfully**
> LimitOrderSubmittedSuccessfullyResponse limitOrderSubmittedSuccessfully()

Limit order submitted successfully

Pushed when the user&#39;s **limit order** is successfully placed on the order book.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      LimitOrderSubmittedSuccessfullyResponse result = apiInstance.limitOrderSubmittedSuccessfully();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#limitOrderSubmittedSuccessfully");
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

[**LimitOrderSubmittedSuccessfullyResponse**](LimitOrderSubmittedSuccessfullyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="marketBuyOrderFailed"></a>
# **marketBuyOrderFailed**
> MarketBuyOrderFailedResponse marketBuyOrderFailed()

Market buy order failed / expired

Pushed when the user&#39;s **market buy order** fails or expires.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      MarketBuyOrderFailedResponse result = apiInstance.marketBuyOrderFailed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketBuyOrderFailed");
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

[**MarketBuyOrderFailedResponse**](MarketBuyOrderFailedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="marketBuyOrderFullyFilled"></a>
# **marketBuyOrderFullyFilled**
> MarketBuyOrderFullyFilledResponse marketBuyOrderFullyFilled()

Market buy order fully filled

Pushed when the user&#39;s **market buy order** is fully filled.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      MarketBuyOrderFullyFilledResponse result = apiInstance.marketBuyOrderFullyFilled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketBuyOrderFullyFilled");
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

[**MarketBuyOrderFullyFilledResponse**](MarketBuyOrderFullyFilledResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="marketResolutionNotification"></a>
# **marketResolutionNotification**
> MarketResolutionNotificationResponse marketResolutionNotification()

Market resolution notification

Pushed when a market is resolved, to every user holding a position in it, win or lose. No amount or outcome is included — call the REST API for the user&#39;s profit and loss.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      MarketResolutionNotificationResponse result = apiInstance.marketResolutionNotification();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketResolutionNotification");
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

[**MarketResolutionNotificationResponse**](MarketResolutionNotificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="marketSellOrderFailedExpired"></a>
# **marketSellOrderFailedExpired**
> MarketSellOrderFailedExpiredResponse marketSellOrderFailedExpired()

Market sell order failed / expired

Pushed when the user&#39;s **market sell order** fails or expires.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      MarketSellOrderFailedExpiredResponse result = apiInstance.marketSellOrderFailedExpired();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketSellOrderFailedExpired");
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

[**MarketSellOrderFailedExpiredResponse**](MarketSellOrderFailedExpiredResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="marketSellOrderFullyFilled"></a>
# **marketSellOrderFullyFilled**
> MarketSellOrderFullyFilledResponse marketSellOrderFullyFilled()

Market sell order fully filled

Pushed when the user&#39;s **market sell order** is fully filled.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      MarketSellOrderFullyFilledResponse result = apiInstance.marketSellOrderFullyFilled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#marketSellOrderFullyFilled");
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

[**MarketSellOrderFullyFilledResponse**](MarketSellOrderFullyFilledResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="predictionOrderBookByMarketId"></a>
# **predictionOrderBookByMarketId**
> PredictionOrderBookByMarketIdResponse predictionOrderBookByMarketId(predictionOrderBookByMarketIdRequest)

Prediction Order Book by marketId

Order book (bid/ask) updates for one market. Only active markets are pushed.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PredictionOrderBookByMarketIdRequest predictionOrderBookByMarketIdRequest = new PredictionOrderBookByMarketIdRequest(); // PredictionOrderBookByMarketIdRequest | 
    try {
      PredictionOrderBookByMarketIdResponse result = apiInstance.predictionOrderBookByMarketId(predictionOrderBookByMarketIdRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#predictionOrderBookByMarketId");
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
| **predictionOrderBookByMarketIdRequest** | [**PredictionOrderBookByMarketIdRequest**](PredictionOrderBookByMarketIdRequest.md)|  | |

### Return type

[**PredictionOrderBookByMarketIdResponse**](PredictionOrderBookByMarketIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="rewardClaimFailed"></a>
# **rewardClaimFailed**
> RewardClaimFailedResponse rewardClaimFailed()

Reward claim failed

Pushed when a claim fails completely — a single claim, or every item of a batch. For a batch, only the first failed item&#39;s amount and outcome are included.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      RewardClaimFailedResponse result = apiInstance.rewardClaimFailed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rewardClaimFailed");
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

[**RewardClaimFailedResponse**](RewardClaimFailedResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

<a id="rewardClaimSucceeded"></a>
# **rewardClaimSucceeded**
> RewardClaimSucceededResponse rewardClaimSucceeded()

Reward claim succeeded

Pushed when a claim fully succeeds — a single claim, or every item of a batch. Only the total is reported; no market title or outcome is included.  Update Speed: Real-time

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.websocket.stream.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      RewardClaimSucceededResponse result = apiInstance.rewardClaimSucceeded();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#rewardClaimSucceeded");
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

[**RewardClaimSucceededResponse**](RewardClaimSucceededResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prediction Stream response |  -  |

