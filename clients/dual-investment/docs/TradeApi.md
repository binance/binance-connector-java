# TradeApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeAutoCompoundStatus**](TradeApi.md#changeAutoCompoundStatus) | **POST** /sapi/v1/dci/product/auto_compound/edit-status | Change Auto-Compound status (USER_DATA) |
| [**checkDualInvestmentAccounts**](TradeApi.md#checkDualInvestmentAccounts) | **GET** /sapi/v1/dci/product/accounts | Check Dual Investment accounts (USER_DATA) |
| [**getDualInvestmentPositions**](TradeApi.md#getDualInvestmentPositions) | **GET** /sapi/v1/dci/product/positions | Get Dual Investment positions (USER_DATA) |
| [**subscribeDualInvestmentProducts**](TradeApi.md#subscribeDualInvestmentProducts) | **POST** /sapi/v1/dci/product/subscribe | Subscribe Dual Investment products (USER_DATA) |


<a id="changeAutoCompoundStatus"></a>
# **changeAutoCompoundStatus**
> ChangeAutoCompoundStatusResponse changeAutoCompoundStatus(changeAutoCompoundStatusRequest)

Change Auto-Compound status (USER_DATA)

Change Auto-Compound status  Weight(IP): 1  Security Type: USER_DATA  Notes: - 15:31 ~ 16:00 UTC+8: This function is disabled.

### Example
```java
// Import classes:
import com.binance.connector.client.dual_investment.ApiClient;
import com.binance.connector.client.dual_investment.ApiException;
import com.binance.connector.client.dual_investment.Configuration;
import com.binance.connector.client.dual_investment.models.*;
import com.binance.connector.client.dual_investment.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    ChangeAutoCompoundStatusRequest changeAutoCompoundStatusRequest = new ChangeAutoCompoundStatusRequest(); // ChangeAutoCompoundStatusRequest | 
    try {
      ChangeAutoCompoundStatusResponse result = apiInstance.changeAutoCompoundStatus(changeAutoCompoundStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#changeAutoCompoundStatus");
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
| **changeAutoCompoundStatusRequest** | [**ChangeAutoCompoundStatusRequest**](ChangeAutoCompoundStatusRequest.md)|  | |

### Return type

[**ChangeAutoCompoundStatusResponse**](ChangeAutoCompoundStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Auto-Compound status |  -  |

<a id="checkDualInvestmentAccounts"></a>
# **checkDualInvestmentAccounts**
> CheckDualInvestmentAccountsResponse checkDualInvestmentAccounts(recvWindow)

Check Dual Investment accounts (USER_DATA)

Check Dual Investment accounts  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.dual_investment.ApiClient;
import com.binance.connector.client.dual_investment.ApiException;
import com.binance.connector.client.dual_investment.Configuration;
import com.binance.connector.client.dual_investment.models.*;
import com.binance.connector.client.dual_investment.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      CheckDualInvestmentAccountsResponse result = apiInstance.checkDualInvestmentAccounts(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#checkDualInvestmentAccounts");
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
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**CheckDualInvestmentAccountsResponse**](CheckDualInvestmentAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Dual Investment accounts |  -  |

<a id="getDualInvestmentPositions"></a>
# **getDualInvestmentPositions**
> GetDualInvestmentPositionsResponse getDualInvestmentPositions(status, pageSize, pageIndex, recvWindow)

Get Dual Investment positions (USER_DATA)

Get Dual Investment positions (batch)  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.dual_investment.ApiClient;
import com.binance.connector.client.dual_investment.ApiException;
import com.binance.connector.client.dual_investment.Configuration;
import com.binance.connector.client.dual_investment.models.*;
import com.binance.connector.client.dual_investment.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    Status status = Status.fromValue("PENDING"); // Status | `PENDING`: Products are purchasing, will give results later; `PURCHASE_SUCCESS`: purchase successfully; `SETTLED`: Products are finish settling; `PURCHASE_FAIL`: fail to purchase; `REFUNDING`: refund ongoing; `REFUND_SUCCESS`: refund to spot account successfully; `SETTLING`: Products are settling. If don't fill this field, will response all the position status.
    Long pageSize = 10L; // Long | Number of records per page
    Long pageIndex = 1L; // Long | Page index
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetDualInvestmentPositionsResponse result = apiInstance.getDualInvestmentPositions(status, pageSize, pageIndex, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#getDualInvestmentPositions");
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
| **status** | [**Status**](.md)| &#x60;PENDING&#x60;: Products are purchasing, will give results later; &#x60;PURCHASE_SUCCESS&#x60;: purchase successfully; &#x60;SETTLED&#x60;: Products are finish settling; &#x60;PURCHASE_FAIL&#x60;: fail to purchase; &#x60;REFUNDING&#x60;: refund ongoing; &#x60;REFUND_SUCCESS&#x60;: refund to spot account successfully; &#x60;SETTLING&#x60;: Products are settling. If don&#39;t fill this field, will response all the position status. | [optional] [enum: PENDING, PURCHASE_SUCCESS, SETTLED, PURCHASE_FAIL, REFUNDING, REFUND_SUCCESS, SETTLING] |
| **pageSize** | **Long**| Number of records per page | [optional] |
| **pageIndex** | **Long**| Page index | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**GetDualInvestmentPositionsResponse**](GetDualInvestmentPositionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Dual Investment positions |  -  |

<a id="subscribeDualInvestmentProducts"></a>
# **subscribeDualInvestmentProducts**
> SubscribeDualInvestmentProductsResponse subscribeDualInvestmentProducts(subscribeDualInvestmentProductsRequest)

Subscribe Dual Investment products (USER_DATA)

Subscribe Dual Investment products  Weight(IP): 1  Security Type: USER_DATA  Notes: - Failed messages:   - Products are not available. This means APR changed to a lower value, or the order is unavailable.   - Failed. This means system or network errors.

### Example
```java
// Import classes:
import com.binance.connector.client.dual_investment.ApiClient;
import com.binance.connector.client.dual_investment.ApiException;
import com.binance.connector.client.dual_investment.Configuration;
import com.binance.connector.client.dual_investment.models.*;
import com.binance.connector.client.dual_investment.rest.api.TradeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TradeApi apiInstance = new TradeApi(defaultClient);
    SubscribeDualInvestmentProductsRequest subscribeDualInvestmentProductsRequest = new SubscribeDualInvestmentProductsRequest(); // SubscribeDualInvestmentProductsRequest | 
    try {
      SubscribeDualInvestmentProductsResponse result = apiInstance.subscribeDualInvestmentProducts(subscribeDualInvestmentProductsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeApi#subscribeDualInvestmentProducts");
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
| **subscribeDualInvestmentProductsRequest** | [**SubscribeDualInvestmentProductsRequest**](SubscribeDualInvestmentProductsRequest.md)|  | |

### Return type

[**SubscribeDualInvestmentProductsResponse**](SubscribeDualInvestmentProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Subscribe Dual Investment products |  -  |

