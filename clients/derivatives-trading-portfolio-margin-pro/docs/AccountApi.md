# AccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bnbTransfer**](AccountApi.md#bnbTransfer) | **POST** /sapi/v1/portfolio/bnb-transfer | BNB transfer (USER_DATA) |
| [**changeAutoRepayFuturesStatus**](AccountApi.md#changeAutoRepayFuturesStatus) | **POST** /sapi/v1/portfolio/repay-futures-switch | Change Auto-repay-futures Status (TRADE) |
| [**deleteMarginCallLevel**](AccountApi.md#deleteMarginCallLevel) | **DELETE** /sapi/v1/portfolio/margin-call-level | Delete Margin Call Level (USER_DATA) |
| [**fundAutoCollection**](AccountApi.md#fundAutoCollection) | **POST** /sapi/v1/portfolio/auto-collection | Fund Auto-collection (USER_DATA) |
| [**fundCollectionByAsset**](AccountApi.md#fundCollectionByAsset) | **POST** /sapi/v1/portfolio/asset-collection | Fund Collection by Asset (USER_DATA) |
| [**getAutoRepayFuturesStatus**](AccountApi.md#getAutoRepayFuturesStatus) | **GET** /sapi/v1/portfolio/repay-futures-switch | Get Auto-repay-futures Status (USER_DATA) |
| [**getDeltaModeStatus**](AccountApi.md#getDeltaModeStatus) | **GET** /sapi/v1/portfolio/delta-mode | Get Delta Mode Status (USER_DATA) |
| [**getMarginCallLevel**](AccountApi.md#getMarginCallLevel) | **GET** /sapi/v1/portfolio/margin-call-level | Get Margin Call Level (USER_DATA) |
| [**getPortfolioMarginProAccountBalance**](AccountApi.md#getPortfolioMarginProAccountBalance) | **GET** /sapi/v1/portfolio/balance | Get Portfolio Margin Pro Account Balance (USER_DATA) |
| [**getPortfolioMarginProAccountInfo**](AccountApi.md#getPortfolioMarginProAccountInfo) | **GET** /sapi/v1/portfolio/account | Get Portfolio Margin Pro Account Info (USER_DATA) |
| [**getPortfolioMarginProSpanAccountInfo**](AccountApi.md#getPortfolioMarginProSpanAccountInfo) | **GET** /sapi/v2/portfolio/account | Get Portfolio Margin Pro SPAN Account Info (USER_DATA) |
| [**getTransferableEarnAssetBalanceForPortfolioMargin**](AccountApi.md#getTransferableEarnAssetBalanceForPortfolioMargin) | **GET** /sapi/v1/portfolio/earn-asset-balance | Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) |
| [**portfolioMarginProBankruptcyLoanRepay**](AccountApi.md#portfolioMarginProBankruptcyLoanRepay) | **POST** /sapi/v1/portfolio/repay | Portfolio Margin Pro Bankruptcy Loan Repay (TRADE) |
| [**queryPortfolioMarginProBankruptcyLoanAmount**](AccountApi.md#queryPortfolioMarginProBankruptcyLoanAmount) | **GET** /sapi/v1/portfolio/pmLoan | Query Portfolio Margin Pro Bankruptcy Loan Amount (USER_DATA) |
| [**queryPortfolioMarginProBankruptcyLoanRepayHistory**](AccountApi.md#queryPortfolioMarginProBankruptcyLoanRepayHistory) | **GET** /sapi/v1/portfolio/pmloan-history | Query Portfolio Margin Pro Bankruptcy Loan Repay History (USER_DATA) |
| [**queryPortfolioMarginProNegativeBalanceInterestHistory**](AccountApi.md#queryPortfolioMarginProNegativeBalanceInterestHistory) | **GET** /sapi/v1/portfolio/interest-history | Query Portfolio Margin Pro Negative Balance Interest History (USER_DATA) |
| [**repayFuturesNegativeBalance**](AccountApi.md#repayFuturesNegativeBalance) | **POST** /sapi/v1/portfolio/repay-futures-negative-balance | Repay futures Negative Balance (USER_DATA) |
| [**setMarginCallLevel**](AccountApi.md#setMarginCallLevel) | **POST** /sapi/v1/portfolio/margin-call-level | Set Margin Call Level (USER_DATA) |
| [**switchDeltaMode**](AccountApi.md#switchDeltaMode) | **POST** /sapi/v1/portfolio/delta-mode | Switch Delta Mode (TRADE) |
| [**transferLdusdtRwusdForPortfolioMargin**](AccountApi.md#transferLdusdtRwusdForPortfolioMargin) | **POST** /sapi/v1/portfolio/earn-asset-transfer | Transfer LDUSDT/RWUSD for Portfolio Margin (TRADE) |


<a id="bnbTransfer"></a>
# **bnbTransfer**
> BnbTransferResponse bnbTransfer(bnbTransferRequest)

BNB transfer (USER_DATA)

BNB transfer can be between Margin Account and USDM Account  Weight(IP): 1500  Security Type: USER_DATA  Notes: - You can only use this function 2 times per 10 minutes in a rolling manner

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    BnbTransferRequest bnbTransferRequest = new BnbTransferRequest(); // BnbTransferRequest | 
    try {
      BnbTransferResponse result = apiInstance.bnbTransfer(bnbTransferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#bnbTransfer");
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
| **bnbTransferRequest** | [**BnbTransferRequest**](BnbTransferRequest.md)|  | |

### Return type

[**BnbTransferResponse**](BnbTransferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | BNB transfer |  -  |

<a id="changeAutoRepayFuturesStatus"></a>
# **changeAutoRepayFuturesStatus**
> ChangeAutoRepayFuturesStatusResponse changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest)

Change Auto-repay-futures Status (TRADE)

Change Auto-repay-futures Status  Weight(IP): 1500  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    ChangeAutoRepayFuturesStatusRequest changeAutoRepayFuturesStatusRequest = new ChangeAutoRepayFuturesStatusRequest(); // ChangeAutoRepayFuturesStatusRequest | 
    try {
      ChangeAutoRepayFuturesStatusResponse result = apiInstance.changeAutoRepayFuturesStatus(changeAutoRepayFuturesStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#changeAutoRepayFuturesStatus");
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
| **changeAutoRepayFuturesStatusRequest** | [**ChangeAutoRepayFuturesStatusRequest**](ChangeAutoRepayFuturesStatusRequest.md)|  | |

### Return type

[**ChangeAutoRepayFuturesStatusResponse**](ChangeAutoRepayFuturesStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Change Auto-repay-futures Status |  -  |

<a id="deleteMarginCallLevel"></a>
# **deleteMarginCallLevel**
> DeleteMarginCallLevelResponse deleteMarginCallLevel(recvWindow)

Delete Margin Call Level (USER_DATA)

Delete the margin call level for a Portfolio Margin account.  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      DeleteMarginCallLevelResponse result = apiInstance.deleteMarginCallLevel(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#deleteMarginCallLevel");
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

[**DeleteMarginCallLevelResponse**](DeleteMarginCallLevelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Delete Margin Call Level |  -  |

<a id="fundAutoCollection"></a>
# **fundAutoCollection**
> FundAutoCollectionResponse fundAutoCollection(fundAutoCollectionRequest)

Fund Auto-collection (USER_DATA)

Transfers all assets from Futures Account to Margin account  Weight(IP): 1500  Security Type: USER_DATA  Notes: - The BNB would not be collected from UM-PM account to the Portfolio Margin account. - You can only use this function 500 times per hour in a rolling manner.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FundAutoCollectionRequest fundAutoCollectionRequest = new FundAutoCollectionRequest(); // FundAutoCollectionRequest | 
    try {
      FundAutoCollectionResponse result = apiInstance.fundAutoCollection(fundAutoCollectionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#fundAutoCollection");
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
| **fundAutoCollectionRequest** | [**FundAutoCollectionRequest**](FundAutoCollectionRequest.md)|  | [optional] |

### Return type

[**FundAutoCollectionResponse**](FundAutoCollectionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Auto-collection |  -  |

<a id="fundCollectionByAsset"></a>
# **fundCollectionByAsset**
> FundCollectionByAssetResponse fundCollectionByAsset(fundCollectionByAssetRequest)

Fund Collection by Asset (USER_DATA)

Transfers specific asset from Futures Account to Margin account  Weight(IP): 60  Security Type: USER_DATA  Notes: - The BNB transfer is not be supported

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    FundCollectionByAssetRequest fundCollectionByAssetRequest = new FundCollectionByAssetRequest(); // FundCollectionByAssetRequest | 
    try {
      FundCollectionByAssetResponse result = apiInstance.fundCollectionByAsset(fundCollectionByAssetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#fundCollectionByAsset");
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
| **fundCollectionByAssetRequest** | [**FundCollectionByAssetRequest**](FundCollectionByAssetRequest.md)|  | |

### Return type

[**FundCollectionByAssetResponse**](FundCollectionByAssetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Collection by Asset |  -  |

<a id="getAutoRepayFuturesStatus"></a>
# **getAutoRepayFuturesStatus**
> GetAutoRepayFuturesStatusResponse getAutoRepayFuturesStatus(recvWindow)

Get Auto-repay-futures Status (USER_DATA)

Query Auto-repay-futures Status  Weight(IP): 30  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      GetAutoRepayFuturesStatusResponse result = apiInstance.getAutoRepayFuturesStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getAutoRepayFuturesStatus");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetAutoRepayFuturesStatusResponse**](GetAutoRepayFuturesStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Auto-repay-futures Status |  -  |

<a id="getDeltaModeStatus"></a>
# **getDeltaModeStatus**
> GetDeltaModeStatusResponse getDeltaModeStatus(recvWindow)

Get Delta Mode Status (USER_DATA)

Query the Delta mode status of current account.  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      GetDeltaModeStatusResponse result = apiInstance.getDeltaModeStatus(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getDeltaModeStatus");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetDeltaModeStatusResponse**](GetDeltaModeStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Delta Mode Status |  -  |

<a id="getMarginCallLevel"></a>
# **getMarginCallLevel**
> GetMarginCallLevelResponse getMarginCallLevel(recvWindow)

Get Margin Call Level (USER_DATA)

Get the margin call level for a Portfolio Margin account.  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetMarginCallLevelResponse result = apiInstance.getMarginCallLevel(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getMarginCallLevel");
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

[**GetMarginCallLevelResponse**](GetMarginCallLevelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Margin Call Level |  -  |

<a id="getPortfolioMarginProAccountBalance"></a>
# **getPortfolioMarginProAccountBalance**
> GetPortfolioMarginProAccountBalanceResponse getPortfolioMarginProAccountBalance(asset, recvWindow)

Get Portfolio Margin Pro Account Balance (USER_DATA)

Query Portfolio Margin Pro account balance  Weight(IP): 20  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "BTC"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetPortfolioMarginProAccountBalanceResponse result = apiInstance.getPortfolioMarginProAccountBalance(asset, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getPortfolioMarginProAccountBalance");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetPortfolioMarginProAccountBalanceResponse**](GetPortfolioMarginProAccountBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Portfolio Margin Pro Account Balance |  -  |

<a id="getPortfolioMarginProAccountInfo"></a>
# **getPortfolioMarginProAccountInfo**
> GetPortfolioMarginProAccountInfoResponse getPortfolioMarginProAccountInfo(recvWindow)

Get Portfolio Margin Pro Account Info (USER_DATA)

Get Portfolio Margin Pro Account Info  Weight(UID): 5  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      GetPortfolioMarginProAccountInfoResponse result = apiInstance.getPortfolioMarginProAccountInfo(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getPortfolioMarginProAccountInfo");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetPortfolioMarginProAccountInfoResponse**](GetPortfolioMarginProAccountInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Portfolio Margin Pro Account Info |  -  |

<a id="getPortfolioMarginProSpanAccountInfo"></a>
# **getPortfolioMarginProSpanAccountInfo**
> GetPortfolioMarginProSpanAccountInfoResponse getPortfolioMarginProSpanAccountInfo(recvWindow)

Get Portfolio Margin Pro SPAN Account Info (USER_DATA)

Get Portfolio Margin Pro SPAN Account Info (For Portfolio Margin Pro SPAN users only)  Weight(IP): 5  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      GetPortfolioMarginProSpanAccountInfoResponse result = apiInstance.getPortfolioMarginProSpanAccountInfo(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getPortfolioMarginProSpanAccountInfo");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetPortfolioMarginProSpanAccountInfoResponse**](GetPortfolioMarginProSpanAccountInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Portfolio Margin Pro SPAN Account Info |  -  |

<a id="getTransferableEarnAssetBalanceForPortfolioMargin"></a>
# **getTransferableEarnAssetBalanceForPortfolioMargin**
> GetTransferableEarnAssetBalanceForPortfolioMarginResponse getTransferableEarnAssetBalanceForPortfolioMargin(asset, transferType, recvWindow)

Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA)

Get transferable earn asset balance for all types of Portfolio Margin account  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "LDUSDT"; // String | `LDUSDT` only
    TransferType transferType = TransferType.fromValue("EARN_TO_FUTURE"); // TransferType | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetTransferableEarnAssetBalanceForPortfolioMarginResponse result = apiInstance.getTransferableEarnAssetBalanceForPortfolioMargin(asset, transferType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#getTransferableEarnAssetBalanceForPortfolioMargin");
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
| **asset** | **String**| &#x60;LDUSDT&#x60; only | |
| **transferType** | [**TransferType**](.md)|  | [enum: EARN_TO_FUTURE, FUTURE_TO_EARN] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetTransferableEarnAssetBalanceForPortfolioMarginResponse**](GetTransferableEarnAssetBalanceForPortfolioMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Transferable Earn Asset Balance for Portfolio Margin |  -  |

<a id="portfolioMarginProBankruptcyLoanRepay"></a>
# **portfolioMarginProBankruptcyLoanRepay**
> PortfolioMarginProBankruptcyLoanRepayResponse portfolioMarginProBankruptcyLoanRepay(portfolioMarginProBankruptcyLoanRepayRequest)

Portfolio Margin Pro Bankruptcy Loan Repay (TRADE)

Repay Portfolio Margin Pro Bankruptcy Loan  Weight(UID): 3000  Security Type: TRADE  Notes: - Please note that the API Key has enabled Spot &amp; Margin Trading permissions to access this endpoint.

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    PortfolioMarginProBankruptcyLoanRepayRequest portfolioMarginProBankruptcyLoanRepayRequest = new PortfolioMarginProBankruptcyLoanRepayRequest(); // PortfolioMarginProBankruptcyLoanRepayRequest | 
    try {
      PortfolioMarginProBankruptcyLoanRepayResponse result = apiInstance.portfolioMarginProBankruptcyLoanRepay(portfolioMarginProBankruptcyLoanRepayRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#portfolioMarginProBankruptcyLoanRepay");
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
| **portfolioMarginProBankruptcyLoanRepayRequest** | [**PortfolioMarginProBankruptcyLoanRepayRequest**](PortfolioMarginProBankruptcyLoanRepayRequest.md)|  | [optional] |

### Return type

[**PortfolioMarginProBankruptcyLoanRepayResponse**](PortfolioMarginProBankruptcyLoanRepayResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Pro Bankruptcy Loan Repay |  -  |

<a id="queryPortfolioMarginProBankruptcyLoanAmount"></a>
# **queryPortfolioMarginProBankruptcyLoanAmount**
> QueryPortfolioMarginProBankruptcyLoanAmountResponse queryPortfolioMarginProBankruptcyLoanAmount(recvWindow)

Query Portfolio Margin Pro Bankruptcy Loan Amount (USER_DATA)

Query Portfolio Margin Pro Bankruptcy Loan Amount  Weight(UID): 500  Security Type: USER_DATA  Notes: - If there’s no classic portfolio margin bankruptcy loan, the amount would be 0

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 5000L; // Long | 
    try {
      QueryPortfolioMarginProBankruptcyLoanAmountResponse result = apiInstance.queryPortfolioMarginProBankruptcyLoanAmount(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryPortfolioMarginProBankruptcyLoanAmount");
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
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryPortfolioMarginProBankruptcyLoanAmountResponse**](QueryPortfolioMarginProBankruptcyLoanAmountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Pro Bankruptcy Loan Amount |  -  |

<a id="queryPortfolioMarginProBankruptcyLoanRepayHistory"></a>
# **queryPortfolioMarginProBankruptcyLoanRepayHistory**
> QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse queryPortfolioMarginProBankruptcyLoanRepayHistory(startTime, endTime, size, current, recvWindow)

Query Portfolio Margin Pro Bankruptcy Loan Repay History (USER_DATA)

Query repay history of pmloan for portfolio margin pro.  Weight(IP): 500  Security Type: USER_DATA  Notes: - &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 360 days - If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 30 days by default. - If &#x60;startTime&#x60;is sent and &#x60;endTime&#x60; is not sent, return records of [startTime, startTime+30d]. - If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of [endTime-30d, endTime].

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long size = 10L; // Long | Number of results returned.
    Long current = 1L; // Long | Currently querying page. Start from 1.
    Long recvWindow = 5000L; // Long | 
    try {
      QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse result = apiInstance.queryPortfolioMarginProBankruptcyLoanRepayHistory(startTime, endTime, size, current, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryPortfolioMarginProBankruptcyLoanRepayHistory");
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
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **size** | **Long**| Number of results returned. | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse**](QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Pro Bankruptcy Loan Repay History |  -  |

<a id="queryPortfolioMarginProNegativeBalanceInterestHistory"></a>
# **queryPortfolioMarginProNegativeBalanceInterestHistory**
> QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse queryPortfolioMarginProNegativeBalanceInterestHistory(asset, startTime, endTime, size, recvWindow)

Query Portfolio Margin Pro Negative Balance Interest History (USER_DATA)

Query interest history of negative balance for portfolio margin.  Weight(IP): 50  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "USDT"; // String | 
    Long startTime = 1623319461670L; // Long | Start time
    Long endTime = 1641782889000L; // Long | End time
    Long size = 10L; // Long | Number of results returned.
    Long recvWindow = 5000L; // Long | 
    try {
      QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse result = apiInstance.queryPortfolioMarginProNegativeBalanceInterestHistory(asset, startTime, endTime, size, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#queryPortfolioMarginProNegativeBalanceInterestHistory");
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
| **startTime** | **Long**| Start time | [optional] |
| **endTime** | **Long**| End time | [optional] |
| **size** | **Long**| Number of results returned. | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse**](QueryPortfolioMarginProNegativeBalanceInterestHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Portfolio Margin Pro Negative Balance Interest History |  -  |

<a id="repayFuturesNegativeBalance"></a>
# **repayFuturesNegativeBalance**
> RepayFuturesNegativeBalanceResponse repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest)

Repay futures Negative Balance (USER_DATA)

Repay futures Negative Balance  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    RepayFuturesNegativeBalanceRequest repayFuturesNegativeBalanceRequest = new RepayFuturesNegativeBalanceRequest(); // RepayFuturesNegativeBalanceRequest | 
    try {
      RepayFuturesNegativeBalanceResponse result = apiInstance.repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#repayFuturesNegativeBalance");
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
| **repayFuturesNegativeBalanceRequest** | [**RepayFuturesNegativeBalanceRequest**](RepayFuturesNegativeBalanceRequest.md)|  | [optional] |

### Return type

[**RepayFuturesNegativeBalanceResponse**](RepayFuturesNegativeBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Repay futures Negative Balance |  -  |

<a id="setMarginCallLevel"></a>
# **setMarginCallLevel**
> SetMarginCallLevelResponse setMarginCallLevel(setMarginCallLevelRequest)

Set Margin Call Level (USER_DATA)

Set the margin call level for a Portfolio Margin account. When the account&#39;s uniMMR drops to the specified level, a notification will be sent via email and SMS.  Weight(IP): 1500  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    SetMarginCallLevelRequest setMarginCallLevelRequest = new SetMarginCallLevelRequest(); // SetMarginCallLevelRequest | 
    try {
      SetMarginCallLevelResponse result = apiInstance.setMarginCallLevel(setMarginCallLevelRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#setMarginCallLevel");
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
| **setMarginCallLevelRequest** | [**SetMarginCallLevelRequest**](SetMarginCallLevelRequest.md)|  | |

### Return type

[**SetMarginCallLevelResponse**](SetMarginCallLevelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set Margin Call Level |  -  |

<a id="switchDeltaMode"></a>
# **switchDeltaMode**
> SwitchDeltaModeResponse switchDeltaMode(switchDeltaModeRequest)

Switch Delta Mode (TRADE)

Switch the Delta mode for existing PM PRO / PM RETAIL accounts.  Weight(IP): 1500  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    SwitchDeltaModeRequest switchDeltaModeRequest = new SwitchDeltaModeRequest(); // SwitchDeltaModeRequest | 
    try {
      SwitchDeltaModeResponse result = apiInstance.switchDeltaMode(switchDeltaModeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#switchDeltaMode");
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
| **switchDeltaModeRequest** | [**SwitchDeltaModeRequest**](SwitchDeltaModeRequest.md)|  | |

### Return type

[**SwitchDeltaModeResponse**](SwitchDeltaModeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Switch Delta Mode |  -  |

<a id="transferLdusdtRwusdForPortfolioMargin"></a>
# **transferLdusdtRwusdForPortfolioMargin**
> TransferLdusdtRwusdForPortfolioMarginResponse transferLdusdtRwusdForPortfolioMargin(transferLdusdtRwusdForPortfolioMarginRequest)

Transfer LDUSDT/RWUSD for Portfolio Margin (TRADE)

Transfer LDUSDT/RWUSD as collateral for all types of Portfolio Margin account  Weight(UID): 1500  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiClient;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.ApiException;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.Configuration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.models.*;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.AccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    TransferLdusdtRwusdForPortfolioMarginRequest transferLdusdtRwusdForPortfolioMarginRequest = new TransferLdusdtRwusdForPortfolioMarginRequest(); // TransferLdusdtRwusdForPortfolioMarginRequest | 
    try {
      TransferLdusdtRwusdForPortfolioMarginResponse result = apiInstance.transferLdusdtRwusdForPortfolioMargin(transferLdusdtRwusdForPortfolioMarginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#transferLdusdtRwusdForPortfolioMargin");
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
| **transferLdusdtRwusdForPortfolioMarginRequest** | [**TransferLdusdtRwusdForPortfolioMarginRequest**](TransferLdusdtRwusdForPortfolioMarginRequest.md)|  | |

### Return type

[**TransferLdusdtRwusdForPortfolioMarginResponse**](TransferLdusdtRwusdForPortfolioMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transfer LDUSDT/RWUSD for Portfolio Margin |  -  |

