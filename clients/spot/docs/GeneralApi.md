# GeneralApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exchangeInfo**](GeneralApi.md#exchangeInfo) | **POST** /exchangeInfo | Exchange information |
| [**executionRules**](GeneralApi.md#executionRules) | **POST** /executionRules | Query Execution Rules |
| [**ping**](GeneralApi.md#ping) | **POST** /ping | Test connectivity |
| [**time**](GeneralApi.md#time) | **POST** /time | Check server time |


<a id="exchangeInfo"></a>
# **exchangeInfo**
> ExchangeInfoResponse exchangeInfo(exchangeInfoRequest)

Exchange information

Query current exchange trading rules, rate limits, and symbol information.  Weight(IP): 20  Security Type: NONE  Notes: **Data Source:** Memory  **Notes:** * If the value provided to &#x60;symbol&#x60; or &#x60;symbols&#x60; do not exist, the endpoint will throw an error saying the symbol is invalid. * All parameters are optional. * Only one of &#x60;symbol&#x60;, &#x60;symbols&#x60;, &#x60;permissions&#x60; parameters can be specified. * Without parameters, &#x60;exchangeInfo&#x60; displays all symbols with &#x60;[\&quot;SPOT\&quot;, \&quot;MARGIN\&quot;, \&quot;LEVERAGED\&quot;]&#x60; permissions.   * In order to list *all* active symbols on the exchange, you need to explicitly request all permissions. * &#x60;permissions&#x60; accepts either a list of permissions, or a single permission name. E.g. &#x60;\&quot;SPOT\&quot;&#x60;.  **Examples of Symbol Permissions Interpretation from the Response:**  * &#x60;[[\&quot;A\&quot;,\&quot;B\&quot;]]&#x60; means you may place an order if your account has either permission \&quot;A\&quot; **or** permission \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;]]&#x60; means you can place an order if your account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot;. * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]]&#x60; means you can place an order if your account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot; or permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive or, so your account may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    ExchangeInfoRequest exchangeInfoRequest = new ExchangeInfoRequest(); // ExchangeInfoRequest | 
    try {
      ExchangeInfoResponse result = apiInstance.exchangeInfo(exchangeInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#exchangeInfo");
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
| **exchangeInfoRequest** | [**ExchangeInfoRequest**](ExchangeInfoRequest.md)|  | [optional] |

### Return type

[**ExchangeInfoResponse**](ExchangeInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange information |  -  |

<a id="executionRules"></a>
# **executionRules**
> ExecutionRulesResponse executionRules(executionRulesRequest)

Query Execution Rules

Query execution rules for symbols.  Weight: Parameter | Weight --- | --- &#x60;symbol&#x60; | 2 &#x60;symbols&#x60; | 2 for each &#x60;symbol&#x60;, capped at a max of 40 &#x60;symbolStatus&#x60; | 40 None | 40  Security Type: NONE  Notes: **Data Source:** Memory  **Note:** No combination of multiple parameters is allowed.

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    ExecutionRulesRequest executionRulesRequest = new ExecutionRulesRequest(); // ExecutionRulesRequest | 
    try {
      ExecutionRulesResponse result = apiInstance.executionRules(executionRulesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#executionRules");
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
| **executionRulesRequest** | [**ExecutionRulesRequest**](ExecutionRulesRequest.md)|  | [optional] |

### Return type

[**ExecutionRulesResponse**](ExecutionRulesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Query Execution Rules |  -  |

<a id="ping"></a>
# **ping**
> PingResponse ping()

Test connectivity

Test connectivity to the WebSocket API.  Note: You can use regular WebSocket ping frames to test connectivity as well, WebSocket API will respond with pong frames as soon as possible. ping request along with time is a safe way to test request-response handling in your application.  Weight(IP): 1  Security Type: NONE  Notes: **Data Source:** Memory

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    try {
      PingResponse result = apiInstance.ping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#ping");
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

[**PingResponse**](PingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Test connectivity |  -  |

<a id="time"></a>
# **time**
> TimeResponse time()

Check server time

Test connectivity to the WebSocket API and get the current server time.  Weight(IP): 1  Security Type: NONE  Notes: **Data Source:** Memory

### Example
```java
// Import classes:
import com.binance.connector.client.spot.ApiClient;
import com.binance.connector.client.spot.ApiException;
import com.binance.connector.client.spot.Configuration;
import com.binance.connector.client.spot.models.*;
import com.binance.connector.client.spot.websocket.api.api.GeneralApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    GeneralApi apiInstance = new GeneralApi(defaultClient);
    try {
      TimeResponse result = apiInstance.time();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GeneralApi#time");
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

[**TimeResponse**](TimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check server time |  -  |

