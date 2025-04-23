# FlexibleRateApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCollateralRepayRate**](FlexibleRateApi.md#checkCollateralRepayRate) | **GET** /sapi/v2/loan/flexible/repay/rate | Check Collateral Repay Rate (USER_DATA) |
| [**flexibleLoanAdjustLtv**](FlexibleRateApi.md#flexibleLoanAdjustLtv) | **POST** /sapi/v2/loan/flexible/adjust/ltv | Flexible Loan Adjust LTV(TRADE) |
| [**flexibleLoanBorrow**](FlexibleRateApi.md#flexibleLoanBorrow) | **POST** /sapi/v2/loan/flexible/borrow | Flexible Loan Borrow(TRADE) |
| [**flexibleLoanCollateralRepayment**](FlexibleRateApi.md#flexibleLoanCollateralRepayment) | **POST** /sapi/v2/loan/flexible/repay/collateral | Flexible Loan Collateral Repayment (TRADE) |
| [**flexibleLoanRepay**](FlexibleRateApi.md#flexibleLoanRepay) | **POST** /sapi/v2/loan/flexible/repay | Flexible Loan Repay(TRADE) |
| [**getFlexibleLoanAssetsData**](FlexibleRateApi.md#getFlexibleLoanAssetsData) | **GET** /sapi/v2/loan/flexible/loanable/data | Get Flexible Loan Assets Data(USER_DATA) |
| [**getFlexibleLoanBorrowHistory**](FlexibleRateApi.md#getFlexibleLoanBorrowHistory) | **GET** /sapi/v2/loan/flexible/borrow/history | Get Flexible Loan Borrow History(USER_DATA) |
| [**getFlexibleLoanCollateralAssetsData**](FlexibleRateApi.md#getFlexibleLoanCollateralAssetsData) | **GET** /sapi/v2/loan/flexible/collateral/data | Get Flexible Loan Collateral Assets Data(USER_DATA) |
| [**getFlexibleLoanLiquidationHistory**](FlexibleRateApi.md#getFlexibleLoanLiquidationHistory) | **GET** /sapi/v2/loan/flexible/liquidation/history | Get Flexible Loan Liquidation History (USER_DATA) |
| [**getFlexibleLoanLtvAdjustmentHistory**](FlexibleRateApi.md#getFlexibleLoanLtvAdjustmentHistory) | **GET** /sapi/v2/loan/flexible/ltv/adjustment/history | Get Flexible Loan LTV Adjustment History(USER_DATA) |
| [**getFlexibleLoanOngoingOrders**](FlexibleRateApi.md#getFlexibleLoanOngoingOrders) | **GET** /sapi/v2/loan/flexible/ongoing/orders | Get Flexible Loan Ongoing Orders(USER_DATA) |
| [**getFlexibleLoanRepaymentHistory**](FlexibleRateApi.md#getFlexibleLoanRepaymentHistory) | **GET** /sapi/v2/loan/flexible/repay/history | Get Flexible Loan Repayment History(USER_DATA) |


<a id="checkCollateralRepayRate"></a>
# **checkCollateralRepayRate**
> CheckCollateralRepayRateResponse checkCollateralRepayRate(loanCoin, collateralCoin, recvWindow)

Check Collateral Repay Rate (USER_DATA)

 Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      CheckCollateralRepayRateResponse result = apiInstance.checkCollateralRepayRate(loanCoin, collateralCoin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#checkCollateralRepayRate");
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
| **loanCoin** | **String**|  | |
| **collateralCoin** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CheckCollateralRepayRateResponse**](CheckCollateralRepayRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Collateral Repay Rate |  -  |

<a id="flexibleLoanAdjustLtv"></a>
# **flexibleLoanAdjustLtv**
> FlexibleLoanAdjustLtvResponse flexibleLoanAdjustLtv(flexibleLoanAdjustLtvRequest)

Flexible Loan Adjust LTV(TRADE)

Flexible Loan Adjust LTV  * API Key needs Spot &amp; Margin Trading permission for this endpoint  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    FlexibleLoanAdjustLtvRequest flexibleLoanAdjustLtvRequest = new FlexibleLoanAdjustLtvRequest(); // FlexibleLoanAdjustLtvRequest | 
    try {
      FlexibleLoanAdjustLtvResponse result = apiInstance.flexibleLoanAdjustLtv(flexibleLoanAdjustLtvRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#flexibleLoanAdjustLtv");
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
| **flexibleLoanAdjustLtvRequest** | [**FlexibleLoanAdjustLtvRequest**](FlexibleLoanAdjustLtvRequest.md)|  | |

### Return type

[**FlexibleLoanAdjustLtvResponse**](FlexibleLoanAdjustLtvResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flexible Loan Adjust LTV |  -  |

<a id="flexibleLoanBorrow"></a>
# **flexibleLoanBorrow**
> FlexibleLoanBorrowResponse flexibleLoanBorrow(flexibleLoanBorrowRequest)

Flexible Loan Borrow(TRADE)

Borrow Flexible Loan   * Only available for master account * You can customize LTV by entering loanAmount and collateralAmount.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    FlexibleLoanBorrowRequest flexibleLoanBorrowRequest = new FlexibleLoanBorrowRequest(); // FlexibleLoanBorrowRequest | 
    try {
      FlexibleLoanBorrowResponse result = apiInstance.flexibleLoanBorrow(flexibleLoanBorrowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#flexibleLoanBorrow");
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
| **flexibleLoanBorrowRequest** | [**FlexibleLoanBorrowRequest**](FlexibleLoanBorrowRequest.md)|  | |

### Return type

[**FlexibleLoanBorrowResponse**](FlexibleLoanBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flexible Loan Borrow |  -  |

<a id="flexibleLoanCollateralRepayment"></a>
# **flexibleLoanCollateralRepayment**
> FlexibleLoanCollateralRepaymentResponse flexibleLoanCollateralRepayment(flexibleLoanCollateralRepaymentRequest)

Flexible Loan Collateral Repayment (TRADE)

 Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    FlexibleLoanCollateralRepaymentRequest flexibleLoanCollateralRepaymentRequest = new FlexibleLoanCollateralRepaymentRequest(); // FlexibleLoanCollateralRepaymentRequest | 
    try {
      FlexibleLoanCollateralRepaymentResponse result = apiInstance.flexibleLoanCollateralRepayment(flexibleLoanCollateralRepaymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#flexibleLoanCollateralRepayment");
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
| **flexibleLoanCollateralRepaymentRequest** | [**FlexibleLoanCollateralRepaymentRequest**](FlexibleLoanCollateralRepaymentRequest.md)|  | |

### Return type

[**FlexibleLoanCollateralRepaymentResponse**](FlexibleLoanCollateralRepaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flexible Loan Collateral Repayment |  -  |

<a id="flexibleLoanRepay"></a>
# **flexibleLoanRepay**
> FlexibleLoanRepayResponse flexibleLoanRepay(flexibleLoanRepayRequest)

Flexible Loan Repay(TRADE)

Flexible Loan Repay   * repayAmount is mandatory even fullRepayment &#x3D; FALSE  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    FlexibleLoanRepayRequest flexibleLoanRepayRequest = new FlexibleLoanRepayRequest(); // FlexibleLoanRepayRequest | 
    try {
      FlexibleLoanRepayResponse result = apiInstance.flexibleLoanRepay(flexibleLoanRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#flexibleLoanRepay");
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
| **flexibleLoanRepayRequest** | [**FlexibleLoanRepayRequest**](FlexibleLoanRepayRequest.md)|  | |

### Return type

[**FlexibleLoanRepayResponse**](FlexibleLoanRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Flexible Loan Repay |  -  |

<a id="getFlexibleLoanAssetsData"></a>
# **getFlexibleLoanAssetsData**
> GetFlexibleLoanAssetsDataResponse getFlexibleLoanAssetsData(loanCoin, recvWindow)

Get Flexible Loan Assets Data(USER_DATA)

Get interest rate and borrow limit of flexible loanable assets. The borrow limit is shown in USD value.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanAssetsDataResponse result = apiInstance.getFlexibleLoanAssetsData(loanCoin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanAssetsData");
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
| **loanCoin** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanAssetsDataResponse**](GetFlexibleLoanAssetsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Assets Data |  -  |

<a id="getFlexibleLoanBorrowHistory"></a>
# **getFlexibleLoanBorrowHistory**
> GetFlexibleLoanBorrowHistoryResponse getFlexibleLoanBorrowHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Flexible Loan Borrow History(USER_DATA)

Get Flexible Loan Borrow History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanBorrowHistoryResponse result = apiInstance.getFlexibleLoanBorrowHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanBorrowHistory");
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
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanBorrowHistoryResponse**](GetFlexibleLoanBorrowHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Borrow History |  -  |

<a id="getFlexibleLoanCollateralAssetsData"></a>
# **getFlexibleLoanCollateralAssetsData**
> GetFlexibleLoanCollateralAssetsDataResponse getFlexibleLoanCollateralAssetsData(collateralCoin, recvWindow)

Get Flexible Loan Collateral Assets Data(USER_DATA)

Get LTV information and collateral limit of flexible loan&#39;s collateral assets. The collateral limit is shown in USD value.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String collateralCoin = "collateralCoin_example"; // String | 
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanCollateralAssetsDataResponse result = apiInstance.getFlexibleLoanCollateralAssetsData(collateralCoin, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanCollateralAssetsData");
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
| **collateralCoin** | **String**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanCollateralAssetsDataResponse**](GetFlexibleLoanCollateralAssetsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Collateral Assets Data |  -  |

<a id="getFlexibleLoanLiquidationHistory"></a>
# **getFlexibleLoanLiquidationHistory**
> GetFlexibleLoanLiquidationHistoryResponse getFlexibleLoanLiquidationHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Flexible Loan Liquidation History (USER_DATA)

 Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanLiquidationHistoryResponse result = apiInstance.getFlexibleLoanLiquidationHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanLiquidationHistory");
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
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanLiquidationHistoryResponse**](GetFlexibleLoanLiquidationHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Liquidation History |  -  |

<a id="getFlexibleLoanLtvAdjustmentHistory"></a>
# **getFlexibleLoanLtvAdjustmentHistory**
> GetFlexibleLoanLtvAdjustmentHistoryResponse getFlexibleLoanLtvAdjustmentHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Flexible Loan LTV Adjustment History(USER_DATA)

Get Flexible Loan LTV Adjustment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanLtvAdjustmentHistoryResponse result = apiInstance.getFlexibleLoanLtvAdjustmentHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanLtvAdjustmentHistory");
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
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanLtvAdjustmentHistoryResponse**](GetFlexibleLoanLtvAdjustmentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan LTV Adjustment History |  -  |

<a id="getFlexibleLoanOngoingOrders"></a>
# **getFlexibleLoanOngoingOrders**
> GetFlexibleLoanOngoingOrdersResponse getFlexibleLoanOngoingOrders(loanCoin, collateralCoin, current, limit, recvWindow)

Get Flexible Loan Ongoing Orders(USER_DATA)

Get Flexible Loan Ongoing Orders  Weight: 300

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanOngoingOrdersResponse result = apiInstance.getFlexibleLoanOngoingOrders(loanCoin, collateralCoin, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanOngoingOrders");
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
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanOngoingOrdersResponse**](GetFlexibleLoanOngoingOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Ongoing Orders |  -  |

<a id="getFlexibleLoanRepaymentHistory"></a>
# **getFlexibleLoanRepaymentHistory**
> GetFlexibleLoanRepaymentHistoryResponse getFlexibleLoanRepaymentHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Flexible Loan Repayment History(USER_DATA)

Get Flexible Loan Repayment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.FlexibleRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    FlexibleRateApi apiInstance = new FlexibleRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetFlexibleLoanRepaymentHistoryResponse result = apiInstance.getFlexibleLoanRepaymentHistory(loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlexibleRateApi#getFlexibleLoanRepaymentHistory");
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
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetFlexibleLoanRepaymentHistoryResponse**](GetFlexibleLoanRepaymentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Flexible Loan Repayment History |  -  |

