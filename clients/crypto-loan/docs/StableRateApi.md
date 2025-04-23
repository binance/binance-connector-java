# StableRateApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCollateralRepayRateStableRate**](StableRateApi.md#checkCollateralRepayRateStableRate) | **GET** /sapi/v1/loan/repay/collateral/rate | Check Collateral Repay Rate(USER_DATA) |
| [**cryptoLoanAdjustLtv**](StableRateApi.md#cryptoLoanAdjustLtv) | **POST** /sapi/v1/loan/adjust/ltv | Crypto Loan Adjust LTV(TRADE) |
| [**cryptoLoanBorrow**](StableRateApi.md#cryptoLoanBorrow) | **POST** /sapi/v1/loan/borrow | Crypto Loan Borrow(TRADE) |
| [**cryptoLoanCustomizeMarginCall**](StableRateApi.md#cryptoLoanCustomizeMarginCall) | **POST** /sapi/v1/loan/customize/margin_call | Crypto Loan Customize Margin Call(TRADE) |
| [**cryptoLoanRepay**](StableRateApi.md#cryptoLoanRepay) | **POST** /sapi/v1/loan/repay | Crypto Loan Repay(TRADE) |
| [**getCollateralAssetsData**](StableRateApi.md#getCollateralAssetsData) | **GET** /sapi/v1/loan/collateral/data | Get Collateral Assets Data(USER_DATA) |
| [**getCryptoLoansIncomeHistory**](StableRateApi.md#getCryptoLoansIncomeHistory) | **GET** /sapi/v1/loan/income | Get Crypto Loans Income History(USER_DATA) |
| [**getLoanBorrowHistory**](StableRateApi.md#getLoanBorrowHistory) | **GET** /sapi/v1/loan/borrow/history | Get Loan Borrow History(USER_DATA) |
| [**getLoanLtvAdjustmentHistory**](StableRateApi.md#getLoanLtvAdjustmentHistory) | **GET** /sapi/v1/loan/ltv/adjustment/history | Get Loan LTV Adjustment History(USER_DATA) |
| [**getLoanOngoingOrders**](StableRateApi.md#getLoanOngoingOrders) | **GET** /sapi/v1/loan/ongoing/orders | Get Loan Ongoing Orders(USER_DATA) |
| [**getLoanRepaymentHistory**](StableRateApi.md#getLoanRepaymentHistory) | **GET** /sapi/v1/loan/repay/history | Get Loan Repayment History(USER_DATA) |
| [**getLoanableAssetsData**](StableRateApi.md#getLoanableAssetsData) | **GET** /sapi/v1/loan/loanable/data | Get Loanable Assets Data(USER_DATA) |


<a id="checkCollateralRepayRateStableRate"></a>
# **checkCollateralRepayRateStableRate**
> CheckCollateralRepayRateStableRateResponse checkCollateralRepayRateStableRate(loanCoin, collateralCoin, repayAmount, recvWindow)

Check Collateral Repay Rate(USER_DATA)

Get the the rate of collateral coin / loan coin when using collateral repay, the rate will be valid within 8 second.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Double repayAmount = 3.4D; // Double | repay amount of loanCoin
    Long recvWindow = 56L; // Long | 
    try {
      CheckCollateralRepayRateStableRateResponse result = apiInstance.checkCollateralRepayRateStableRate(loanCoin, collateralCoin, repayAmount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#checkCollateralRepayRateStableRate");
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
| **repayAmount** | **Double**| repay amount of loanCoin | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**CheckCollateralRepayRateStableRateResponse**](CheckCollateralRepayRateStableRateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Check Collateral Repay Rate |  -  |

<a id="cryptoLoanAdjustLtv"></a>
# **cryptoLoanAdjustLtv**
> CryptoLoanAdjustLtvResponse cryptoLoanAdjustLtv(cryptoLoanAdjustLtvRequest)

Crypto Loan Adjust LTV(TRADE)

Crypto Loan Adjust LTV  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    CryptoLoanAdjustLtvRequest cryptoLoanAdjustLtvRequest = new CryptoLoanAdjustLtvRequest(); // CryptoLoanAdjustLtvRequest | 
    try {
      CryptoLoanAdjustLtvResponse result = apiInstance.cryptoLoanAdjustLtv(cryptoLoanAdjustLtvRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#cryptoLoanAdjustLtv");
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
| **cryptoLoanAdjustLtvRequest** | [**CryptoLoanAdjustLtvRequest**](CryptoLoanAdjustLtvRequest.md)|  | |

### Return type

[**CryptoLoanAdjustLtvResponse**](CryptoLoanAdjustLtvResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Crypto Loan Adjust LTV |  -  |

<a id="cryptoLoanBorrow"></a>
# **cryptoLoanBorrow**
> CryptoLoanBorrowResponse cryptoLoanBorrow(cryptoLoanBorrowRequest)

Crypto Loan Borrow(TRADE)

Crypto Loan Borrow  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    CryptoLoanBorrowRequest cryptoLoanBorrowRequest = new CryptoLoanBorrowRequest(); // CryptoLoanBorrowRequest | 
    try {
      CryptoLoanBorrowResponse result = apiInstance.cryptoLoanBorrow(cryptoLoanBorrowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#cryptoLoanBorrow");
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
| **cryptoLoanBorrowRequest** | [**CryptoLoanBorrowRequest**](CryptoLoanBorrowRequest.md)|  | |

### Return type

[**CryptoLoanBorrowResponse**](CryptoLoanBorrowResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Crypto Loan Borrow |  -  |

<a id="cryptoLoanCustomizeMarginCall"></a>
# **cryptoLoanCustomizeMarginCall**
> CryptoLoanCustomizeMarginCallResponse cryptoLoanCustomizeMarginCall(cryptoLoanCustomizeMarginCallRequest)

Crypto Loan Customize Margin Call(TRADE)

Customize Margin Call  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    CryptoLoanCustomizeMarginCallRequest cryptoLoanCustomizeMarginCallRequest = new CryptoLoanCustomizeMarginCallRequest(); // CryptoLoanCustomizeMarginCallRequest | 
    try {
      CryptoLoanCustomizeMarginCallResponse result = apiInstance.cryptoLoanCustomizeMarginCall(cryptoLoanCustomizeMarginCallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#cryptoLoanCustomizeMarginCall");
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
| **cryptoLoanCustomizeMarginCallRequest** | [**CryptoLoanCustomizeMarginCallRequest**](CryptoLoanCustomizeMarginCallRequest.md)|  | |

### Return type

[**CryptoLoanCustomizeMarginCallResponse**](CryptoLoanCustomizeMarginCallResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Crypto Loan Customize Margin Call |  -  |

<a id="cryptoLoanRepay"></a>
# **cryptoLoanRepay**
> CryptoLoanRepayResponse cryptoLoanRepay(cryptoLoanRepayRequest)

Crypto Loan Repay(TRADE)

Crypto Loan Repay  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    CryptoLoanRepayRequest cryptoLoanRepayRequest = new CryptoLoanRepayRequest(); // CryptoLoanRepayRequest | 
    try {
      CryptoLoanRepayResponse result = apiInstance.cryptoLoanRepay(cryptoLoanRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#cryptoLoanRepay");
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
| **cryptoLoanRepayRequest** | [**CryptoLoanRepayRequest**](CryptoLoanRepayRequest.md)|  | |

### Return type

[**CryptoLoanRepayResponse**](CryptoLoanRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Crypto Loan Repay |  -  |

<a id="getCollateralAssetsData"></a>
# **getCollateralAssetsData**
> GetCollateralAssetsDataResponse getCollateralAssetsData(collateralCoin, vipLevel, recvWindow)

Get Collateral Assets Data(USER_DATA)

Get LTV information and collateral limit of collateral assets. The collateral limit is shown in USD value.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String collateralCoin = "collateralCoin_example"; // String | 
    Long vipLevel = 56L; // Long | Default: user's vip level. Send \"-1\" to check specified configuration
    Long recvWindow = 56L; // Long | 
    try {
      GetCollateralAssetsDataResponse result = apiInstance.getCollateralAssetsData(collateralCoin, vipLevel, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getCollateralAssetsData");
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
| **vipLevel** | **Long**| Default: user&#39;s vip level. Send \&quot;-1\&quot; to check specified configuration | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCollateralAssetsDataResponse**](GetCollateralAssetsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Collateral Assets Data |  -  |

<a id="getCryptoLoansIncomeHistory"></a>
# **getCryptoLoansIncomeHistory**
> GetCryptoLoansIncomeHistoryResponse getCryptoLoansIncomeHistory(asset, type, startTime, endTime, limit, recvWindow)

Get Crypto Loans Income History(USER_DATA)

Get Crypto Loans Income History  * If startTime and endTime are not sent, the recent 7-day data will be returned. * The max interval between startTime and endTime is 30 days.  Weight: 6000

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long type = 56L; // Long | All types will be returned by default. Enum：`borrowIn` ,`collateralSpent`, `repayAmount`, `collateralReturn`(Collateral return after repayment), `addCollateral`, `removeCollateral`, `collateralReturnAfterLiquidation`
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetCryptoLoansIncomeHistoryResponse result = apiInstance.getCryptoLoansIncomeHistory(asset, type, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getCryptoLoansIncomeHistory");
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
| **type** | **Long**| All types will be returned by default. Enum：&#x60;borrowIn&#x60; ,&#x60;collateralSpent&#x60;, &#x60;repayAmount&#x60;, &#x60;collateralReturn&#x60;(Collateral return after repayment), &#x60;addCollateral&#x60;, &#x60;removeCollateral&#x60;, &#x60;collateralReturnAfterLiquidation&#x60; | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetCryptoLoansIncomeHistoryResponse**](GetCryptoLoansIncomeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Crypto Loans Income History |  -  |

<a id="getLoanBorrowHistory"></a>
# **getLoanBorrowHistory**
> GetLoanBorrowHistoryResponse getLoanBorrowHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan Borrow History(USER_DATA)

Get Loan Borrow History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanBorrowHistoryResponse result = apiInstance.getLoanBorrowHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanBorrowHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanBorrowHistoryResponse**](GetLoanBorrowHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan Borrow History |  -  |

<a id="getLoanLtvAdjustmentHistory"></a>
# **getLoanLtvAdjustmentHistory**
> GetLoanLtvAdjustmentHistoryResponse getLoanLtvAdjustmentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan LTV Adjustment History(USER_DATA)

Get Loan LTV Adjustment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanLtvAdjustmentHistoryResponse result = apiInstance.getLoanLtvAdjustmentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanLtvAdjustmentHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanLtvAdjustmentHistoryResponse**](GetLoanLtvAdjustmentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan LTV Adjustment History |  -  |

<a id="getLoanOngoingOrders"></a>
# **getLoanOngoingOrders**
> GetLoanOngoingOrdersResponse getLoanOngoingOrders(orderId, loanCoin, collateralCoin, current, limit, recvWindow)

Get Loan Ongoing Orders(USER_DATA)

Get Loan Ongoing Orders  Weight: 300

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanOngoingOrdersResponse result = apiInstance.getLoanOngoingOrders(orderId, loanCoin, collateralCoin, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanOngoingOrders");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanOngoingOrdersResponse**](GetLoanOngoingOrdersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan Ongoing Orders |  -  |

<a id="getLoanRepaymentHistory"></a>
# **getLoanRepaymentHistory**
> GetLoanRepaymentHistoryResponse getLoanRepaymentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow)

Get Loan Repayment History(USER_DATA)

Get Loan Repayment History  * If startTime and endTime are not sent, the recent 90-day data will be returned. * The max interval between startTime and endTime is 180 days.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    Long orderId = 56L; // Long | orderId in `POST /sapi/v1/loan/borrow`
    String loanCoin = "loanCoin_example"; // String | 
    String collateralCoin = "collateralCoin_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Current querying page. Start from 1; default: 1; max: 1000
    Long limit = 56L; // Long | Default: 10; max: 100
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanRepaymentHistoryResponse result = apiInstance.getLoanRepaymentHistory(orderId, loanCoin, collateralCoin, startTime, endTime, current, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanRepaymentHistory");
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
| **orderId** | **Long**| orderId in &#x60;POST /sapi/v1/loan/borrow&#x60; | [optional] |
| **loanCoin** | **String**|  | [optional] |
| **collateralCoin** | **String**|  | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Current querying page. Start from 1; default: 1; max: 1000 | [optional] |
| **limit** | **Long**| Default: 10; max: 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanRepaymentHistoryResponse**](GetLoanRepaymentHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loan Repayment History |  -  |

<a id="getLoanableAssetsData"></a>
# **getLoanableAssetsData**
> GetLoanableAssetsDataResponse getLoanableAssetsData(loanCoin, vipLevel, recvWindow)

Get Loanable Assets Data(USER_DATA)

Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.  Weight: 400

### Example
```java
// Import classes:
import com.binance.connector.client.crypto_loan.ApiClient;
import com.binance.connector.client.crypto_loan.ApiException;
import com.binance.connector.client.crypto_loan.Configuration;
import com.binance.connector.client.crypto_loan.models.*;
import com.binance.connector.client.crypto_loan.rest.api.StableRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    StableRateApi apiInstance = new StableRateApi(defaultClient);
    String loanCoin = "loanCoin_example"; // String | 
    Long vipLevel = 56L; // Long | Default: user's vip level. Send \"-1\" to check specified configuration
    Long recvWindow = 56L; // Long | 
    try {
      GetLoanableAssetsDataResponse result = apiInstance.getLoanableAssetsData(loanCoin, vipLevel, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StableRateApi#getLoanableAssetsData");
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
| **vipLevel** | **Long**| Default: user&#39;s vip level. Send \&quot;-1\&quot; to check specified configuration | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetLoanableAssetsDataResponse**](GetLoanableAssetsDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Loanable Assets Data |  -  |

