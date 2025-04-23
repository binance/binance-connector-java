# AccountApi

All URIs are relative to *https://fapi.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bnbTransfer**](AccountApi.md#bnbTransfer) | **POST** /sapi/v1/portfolio/bnb-transfer | BNB transfer(USER_DATA) |
| [**changeAutoRepayFuturesStatus**](AccountApi.md#changeAutoRepayFuturesStatus) | **POST** /sapi/v1/portfolio/repay-futures-switch | Change Auto-repay-futures Status(TRADE) |
| [**fundAutoCollection**](AccountApi.md#fundAutoCollection) | **POST** /sapi/v1/portfolio/auto-collection | Fund Auto-collection(USER_DATA) |
| [**fundCollectionByAsset**](AccountApi.md#fundCollectionByAsset) | **POST** /sapi/v1/portfolio/asset-collection | Fund Collection by Asset(USER_DATA) |
| [**getAutoRepayFuturesStatus**](AccountApi.md#getAutoRepayFuturesStatus) | **GET** /sapi/v1/portfolio/repay-futures-switch | Get Auto-repay-futures Status(USER_DATA) |
| [**getPortfolioMarginProAccountBalance**](AccountApi.md#getPortfolioMarginProAccountBalance) | **GET** /sapi/v1/portfolio/balance | Get Portfolio Margin Pro Account Balance(USER_DATA) |
| [**getPortfolioMarginProAccountInfo**](AccountApi.md#getPortfolioMarginProAccountInfo) | **GET** /sapi/v1/portfolio/account | Get Portfolio Margin Pro Account Info(USER_DATA) |
| [**getPortfolioMarginProSpanAccountInfo**](AccountApi.md#getPortfolioMarginProSpanAccountInfo) | **GET** /sapi/v2/portfolio/account | Get Portfolio Margin Pro SPAN Account Info(USER_DATA) |
| [**getTransferableEarnAssetBalanceForPortfolioMargin**](AccountApi.md#getTransferableEarnAssetBalanceForPortfolioMargin) | **GET** /sapi/v1/portfolio/earn-asset-balance | Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA) |
| [**mintBfusdForPortfolioMargin**](AccountApi.md#mintBfusdForPortfolioMargin) | **POST** /sapi/v1/portfolio/mint | Mint BFUSD for Portfolio Margin(TRADE) |
| [**portfolioMarginProBankruptcyLoanRepay**](AccountApi.md#portfolioMarginProBankruptcyLoanRepay) | **POST** /sapi/v1/portfolio/repay | Portfolio Margin Pro Bankruptcy Loan Repay |
| [**queryPortfolioMarginProBankruptcyLoanAmount**](AccountApi.md#queryPortfolioMarginProBankruptcyLoanAmount) | **GET** /sapi/v1/portfolio/pmLoan | Query Portfolio Margin Pro Bankruptcy Loan Amount(USER_DATA) |
| [**queryPortfolioMarginProBankruptcyLoanRepayHistory**](AccountApi.md#queryPortfolioMarginProBankruptcyLoanRepayHistory) | **GET** /sapi/v1/portfolio/pmLoan-history | Query Portfolio Margin Pro Bankruptcy Loan Repay History(USER_DATA) |
| [**queryPortfolioMarginProNegativeBalanceInterestHistory**](AccountApi.md#queryPortfolioMarginProNegativeBalanceInterestHistory) | **GET** /sapi/v1/portfolio/interest-history | Query Portfolio Margin Pro Negative Balance Interest History(USER_DATA) |
| [**redeemBfusdForPortfolioMargin**](AccountApi.md#redeemBfusdForPortfolioMargin) | **POST** /sapi/v1/portfolio/redeem | Redeem BFUSD for Portfolio Margin(TRADE) |
| [**repayFuturesNegativeBalance**](AccountApi.md#repayFuturesNegativeBalance) | **POST** /sapi/v1/portfolio/repay-futures-negative-balance | Repay futures Negative Balance(USER_DATA) |
| [**transferLdusdtForPortfolioMargin**](AccountApi.md#transferLdusdtForPortfolioMargin) | **POST** /sapi/v1/portfolio/earn-asset-balance | Transfer LDUSDT for Portfolio Margin(TRADE) |


<a id="bnbTransfer"></a>
# **bnbTransfer**
> BnbTransferResponse bnbTransfer(bnbTransferRequest)

BNB transfer(USER_DATA)

BNB transfer can be between Margin Account and USDM Account   * You can only use this function 2 times per 10 minutes in a rolling manner  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

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

Change Auto-repay-futures Status(TRADE)

Change Auto-repay-futures Status  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

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

<a id="fundAutoCollection"></a>
# **fundAutoCollection**
> FundAutoCollectionResponse fundAutoCollection(fundAutoCollectionRequest)

Fund Auto-collection(USER_DATA)

Transfers all assets from Futures Account to Margin account  * The BNB would not be collected from UM-PM account to the Portfolio Margin account. * You can only use this function 500 times per hour in a rolling manner.  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

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
| **fundAutoCollectionRequest** | [**FundAutoCollectionRequest**](FundAutoCollectionRequest.md)|  | |

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

Fund Collection by Asset(USER_DATA)

Transfers specific asset from Futures Account to Margin account  * The BNB transfer is not be supported  Weight: 60

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
    defaultClient.setBasePath("https://fapi.binance.com");

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

Get Auto-repay-futures Status(USER_DATA)

Query Auto-repay-futures Status  Weight: 30

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
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

<a id="getPortfolioMarginProAccountBalance"></a>
# **getPortfolioMarginProAccountBalance**
> GetPortfolioMarginProAccountBalanceResponse getPortfolioMarginProAccountBalance(asset, recvWindow)

Get Portfolio Margin Pro Account Balance(USER_DATA)

Query Portfolio Margin Pro account balance  Weight: 20

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long recvWindow = 56L; // Long | 
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

Get Portfolio Margin Pro Account Info(USER_DATA)

Get Portfolio Margin Pro Account Info  Weight: 5

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
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

Get Portfolio Margin Pro SPAN Account Info(USER_DATA)

Get Portfolio Margin Pro SPAN Account Info (For Portfolio Margin Pro SPAN users only)  Weight: 5

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
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

Get transferable earn asset balance for all types of Portfolio Margin account  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | `LDUSDT` only
    String transferType = "transferType_example"; // String | `EARN_TO_FUTURE` /`FUTURE_TO_EARN`
    Long recvWindow = 56L; // Long | 
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
| **transferType** | **String**| &#x60;EARN_TO_FUTURE&#x60; /&#x60;FUTURE_TO_EARN&#x60; | |
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

<a id="mintBfusdForPortfolioMargin"></a>
# **mintBfusdForPortfolioMargin**
> MintBfusdForPortfolioMarginResponse mintBfusdForPortfolioMargin(mintBfusdForPortfolioMarginRequest)

Mint BFUSD for Portfolio Margin(TRADE)

Mint BFUSD for all types of Portfolio Margin account  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    MintBfusdForPortfolioMarginRequest mintBfusdForPortfolioMarginRequest = new MintBfusdForPortfolioMarginRequest(); // MintBfusdForPortfolioMarginRequest | 
    try {
      MintBfusdForPortfolioMarginResponse result = apiInstance.mintBfusdForPortfolioMargin(mintBfusdForPortfolioMarginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#mintBfusdForPortfolioMargin");
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
| **mintBfusdForPortfolioMarginRequest** | [**MintBfusdForPortfolioMarginRequest**](MintBfusdForPortfolioMarginRequest.md)|  | |

### Return type

[**MintBfusdForPortfolioMarginResponse**](MintBfusdForPortfolioMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Mint BFUSD for Portfolio Margin |  -  |

<a id="portfolioMarginProBankruptcyLoanRepay"></a>
# **portfolioMarginProBankruptcyLoanRepay**
> PortfolioMarginProBankruptcyLoanRepayResponse portfolioMarginProBankruptcyLoanRepay(portfolioMarginProBankruptcyLoanRepayRequest)

Portfolio Margin Pro Bankruptcy Loan Repay

Repay Portfolio Margin Pro Bankruptcy Loan  Weight: 3000

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
    defaultClient.setBasePath("https://fapi.binance.com");

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
| **portfolioMarginProBankruptcyLoanRepayRequest** | [**PortfolioMarginProBankruptcyLoanRepayRequest**](PortfolioMarginProBankruptcyLoanRepayRequest.md)|  | |

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

Query Portfolio Margin Pro Bankruptcy Loan Amount(USER_DATA)

Query Portfolio Margin Pro Bankruptcy Loan Amount  * If there’s no classic portfolio margin bankruptcy loan, the amount would be 0  Weight: 500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long recvWindow = 56L; // Long | 
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
> QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse queryPortfolioMarginProBankruptcyLoanRepayHistory(startTime, endTime, current, size, recvWindow)

Query Portfolio Margin Pro Bankruptcy Loan Repay History(USER_DATA)

Query repay history of pmloan for portfolio margin pro.  * &#x60;startTime&#x60; and &#x60;endTime&#x60; cannot be longer than 360 days * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 30 days by default. * If &#x60;startTime&#x60;is sent and &#x60;endTime&#x60; is not sent, return records of [startTime, startTime+30d]. * If &#x60;startTime&#x60; is not sent and &#x60;endTime&#x60; is sent, return records of [endTime-30d, endTime].  Weight: 500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long current = 56L; // Long | Currently querying page. Start from 1. Default:1
    Long size = 56L; // Long | Default:10 Max:100
    Long recvWindow = 56L; // Long | 
    try {
      QueryPortfolioMarginProBankruptcyLoanRepayHistoryResponse result = apiInstance.queryPortfolioMarginProBankruptcyLoanRepayHistory(startTime, endTime, current, size, recvWindow);
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **current** | **Long**| Currently querying page. Start from 1. Default:1 | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
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

Query Portfolio Margin Pro Negative Balance Interest History(USER_DATA)

Query interest history of negative balance for portfolio margin.  Weight: 50

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    String asset = "asset_example"; // String | 
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long size = 56L; // Long | Default:10 Max:100
    Long recvWindow = 56L; // Long | 
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
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **size** | **Long**| Default:10 Max:100 | [optional] |
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

<a id="redeemBfusdForPortfolioMargin"></a>
# **redeemBfusdForPortfolioMargin**
> RedeemBfusdForPortfolioMarginResponse redeemBfusdForPortfolioMargin(redeemBfusdForPortfolioMarginRequest)

Redeem BFUSD for Portfolio Margin(TRADE)

Redeem BFUSD for all types of Portfolio Margin account  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    RedeemBfusdForPortfolioMarginRequest redeemBfusdForPortfolioMarginRequest = new RedeemBfusdForPortfolioMarginRequest(); // RedeemBfusdForPortfolioMarginRequest | 
    try {
      RedeemBfusdForPortfolioMarginResponse result = apiInstance.redeemBfusdForPortfolioMargin(redeemBfusdForPortfolioMarginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#redeemBfusdForPortfolioMargin");
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
| **redeemBfusdForPortfolioMarginRequest** | [**RedeemBfusdForPortfolioMarginRequest**](RedeemBfusdForPortfolioMarginRequest.md)|  | |

### Return type

[**RedeemBfusdForPortfolioMarginResponse**](RedeemBfusdForPortfolioMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem BFUSD for Portfolio Margin |  -  |

<a id="repayFuturesNegativeBalance"></a>
# **repayFuturesNegativeBalance**
> RepayFuturesNegativeBalanceResponse repayFuturesNegativeBalance(repayFuturesNegativeBalanceRequest)

Repay futures Negative Balance(USER_DATA)

Repay futures Negative Balance  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

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
| **repayFuturesNegativeBalanceRequest** | [**RepayFuturesNegativeBalanceRequest**](RepayFuturesNegativeBalanceRequest.md)|  | |

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

<a id="transferLdusdtForPortfolioMargin"></a>
# **transferLdusdtForPortfolioMargin**
> TransferLdusdtForPortfolioMarginResponse transferLdusdtForPortfolioMargin(transferLdusdtForPortfolioMarginRequest)

Transfer LDUSDT for Portfolio Margin(TRADE)

Transfer LDUSDT as collateral for all types of Portfolio Margin account  Weight: 1500

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
    defaultClient.setBasePath("https://fapi.binance.com");

    AccountApi apiInstance = new AccountApi(defaultClient);
    TransferLdusdtForPortfolioMarginRequest transferLdusdtForPortfolioMarginRequest = new TransferLdusdtForPortfolioMarginRequest(); // TransferLdusdtForPortfolioMarginRequest | 
    try {
      TransferLdusdtForPortfolioMarginResponse result = apiInstance.transferLdusdtForPortfolioMargin(transferLdusdtForPortfolioMarginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#transferLdusdtForPortfolioMargin");
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
| **transferLdusdtForPortfolioMarginRequest** | [**TransferLdusdtForPortfolioMarginRequest**](TransferLdusdtForPortfolioMarginRequest.md)|  | |

### Return type

[**TransferLdusdtForPortfolioMarginResponse**](TransferLdusdtForPortfolioMarginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Transfer LDUSDT for Portfolio Margin |  -  |

