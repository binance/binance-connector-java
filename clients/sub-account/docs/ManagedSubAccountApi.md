# ManagedSubAccountApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**depositAssetsIntoTheManagedSubAccount**](ManagedSubAccountApi.md#depositAssetsIntoTheManagedSubAccount) | **POST** /sapi/v1/managed-subaccount/deposit | Deposit Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA) |
| [**getManagedSubAccountDepositAddress**](ManagedSubAccountApi.md#getManagedSubAccountDepositAddress) | **GET** /sapi/v1/managed-subaccount/deposit/address | Get Managed Sub-account Deposit Address (For Investor Master Account) (USER_DATA) |
| [**queryManagedSubAccountAssetDetails**](ManagedSubAccountApi.md#queryManagedSubAccountAssetDetails) | **GET** /sapi/v1/managed-subaccount/asset | Query Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA) |
| [**queryManagedSubAccountFuturesAssetDetails**](ManagedSubAccountApi.md#queryManagedSubAccountFuturesAssetDetails) | **GET** /sapi/v1/managed-subaccount/fetch-future-asset | Query Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA) |
| [**queryManagedSubAccountList**](ManagedSubAccountApi.md#queryManagedSubAccountList) | **GET** /sapi/v1/managed-subaccount/info | Query Managed Sub-account List (For Investor) (USER_DATA) |
| [**queryManagedSubAccountMarginAssetDetails**](ManagedSubAccountApi.md#queryManagedSubAccountMarginAssetDetails) | **GET** /sapi/v1/managed-subaccount/marginAsset | Query Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA) |
| [**queryManagedSubAccountSnapshot**](ManagedSubAccountApi.md#queryManagedSubAccountSnapshot) | **GET** /sapi/v1/managed-subaccount/accountSnapshot | Query Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA) |
| [**queryManagedSubAccountTransferLogMasterAccountInvestor**](ManagedSubAccountApi.md#queryManagedSubAccountTransferLogMasterAccountInvestor) | **GET** /sapi/v1/managed-subaccount/queryTransLogForInvestor | Query Managed Sub Account Transfer Log For Investor Master Account (USER_DATA) |
| [**queryManagedSubAccountTransferLogMasterAccountTrading**](ManagedSubAccountApi.md#queryManagedSubAccountTransferLogMasterAccountTrading) | **GET** /sapi/v1/managed-subaccount/queryTransLogForTradeParent | Query Managed Sub Account Transfer Log For Trading Team Master Account (USER_DATA) |
| [**queryManagedSubAccountTransferLogSubAccountTrading**](ManagedSubAccountApi.md#queryManagedSubAccountTransferLogSubAccountTrading) | **GET** /sapi/v1/managed-subaccount/query-trans-log | Query Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA) |
| [**withdrawlAssetsFromTheManagedSubAccount**](ManagedSubAccountApi.md#withdrawlAssetsFromTheManagedSubAccount) | **POST** /sapi/v1/managed-subaccount/withdraw | Withdrawl Assets From The Managed Sub-account (For Investor Master Account) (USER_DATA) |


<a id="depositAssetsIntoTheManagedSubAccount"></a>
# **depositAssetsIntoTheManagedSubAccount**
> DepositAssetsIntoTheManagedSubAccountResponse depositAssetsIntoTheManagedSubAccount(depositAssetsIntoTheManagedSubAccountRequest)

Deposit Assets Into The Managed Sub-account (For Investor Master Account) (USER_DATA)

Deposit Assets Into The Managed Sub-account  Weight(IP): 1  Security Type: USER_DATA  Notes: - You need to enable &#x60;Enable Spot &amp; Margin Trading&#x60; option for the api key which requests this endpoint

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    DepositAssetsIntoTheManagedSubAccountRequest depositAssetsIntoTheManagedSubAccountRequest = new DepositAssetsIntoTheManagedSubAccountRequest(); // DepositAssetsIntoTheManagedSubAccountRequest | 
    try {
      DepositAssetsIntoTheManagedSubAccountResponse result = apiInstance.depositAssetsIntoTheManagedSubAccount(depositAssetsIntoTheManagedSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#depositAssetsIntoTheManagedSubAccount");
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
| **depositAssetsIntoTheManagedSubAccountRequest** | [**DepositAssetsIntoTheManagedSubAccountRequest**](DepositAssetsIntoTheManagedSubAccountRequest.md)|  | |

### Return type

[**DepositAssetsIntoTheManagedSubAccountResponse**](DepositAssetsIntoTheManagedSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit Assets Into The Managed Sub-account |  -  |

<a id="getManagedSubAccountDepositAddress"></a>
# **getManagedSubAccountDepositAddress**
> GetManagedSubAccountDepositAddressResponse getManagedSubAccountDepositAddress(email, coin, network, amount, recvWindow)

Get Managed Sub-account Deposit Address (For Investor Master Account) (USER_DATA)

Get investor&#39;s managed sub-account deposit address.  Weight(UID): 1  Security Type: USER_DATA  Notes: - If &#x60;network&#x60; is not sent, the default &#x60;network&#x60; for the &#x60;coin&#x60; is returned. - When using &#x60;LIGHTNING&#x60;, &#x60;amount&#x60; must be provided.

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    String coin = "USDT"; // String | 
    String network = "LIGHTNING"; // String | networks can be found in `GET /sapi/v1/capital/deposit/address`
    Double amount = 1.0D; // Double | 
    Long recvWindow = 5000L; // Long | 
    try {
      GetManagedSubAccountDepositAddressResponse result = apiInstance.getManagedSubAccountDepositAddress(email, coin, network, amount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#getManagedSubAccountDepositAddress");
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
| **email** | **String**|  | |
| **coin** | **String**|  | |
| **network** | **String**| networks can be found in &#x60;GET /sapi/v1/capital/deposit/address&#x60; | [optional] |
| **amount** | **Double**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetManagedSubAccountDepositAddressResponse**](GetManagedSubAccountDepositAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Managed Sub-account Deposit Address |  -  |

<a id="queryManagedSubAccountAssetDetails"></a>
# **queryManagedSubAccountAssetDetails**
> QueryManagedSubAccountAssetDetailsResponse queryManagedSubAccountAssetDetails(email, recvWindow)

Query Managed Sub-account Asset Details (For Investor Master Account) (USER_DATA)

Query Managed Sub-account Asset Details  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryManagedSubAccountAssetDetailsResponse result = apiInstance.queryManagedSubAccountAssetDetails(email, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountAssetDetails");
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
| **email** | **String**|  | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryManagedSubAccountAssetDetailsResponse**](QueryManagedSubAccountAssetDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub-account Asset Details |  -  |

<a id="queryManagedSubAccountFuturesAssetDetails"></a>
# **queryManagedSubAccountFuturesAssetDetails**
> QueryManagedSubAccountFuturesAssetDetailsResponse queryManagedSubAccountFuturesAssetDetails(email, accountType)

Query Managed Sub-account Futures Asset Details (For Investor Master Account) (USER_DATA)

Investor can use this api to query managed sub account futures asset details  Weight(UID): 60  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    String accountType = "MARGIN"; // String | No input or input \"USDT_FUTURE\" to get UM Futures account details. Input \"COIN_FUTURE\" to get CM Futures account details.
    try {
      QueryManagedSubAccountFuturesAssetDetailsResponse result = apiInstance.queryManagedSubAccountFuturesAssetDetails(email, accountType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountFuturesAssetDetails");
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
| **email** | **String**|  | |
| **accountType** | **String**| No input or input \&quot;USDT_FUTURE\&quot; to get UM Futures account details. Input \&quot;COIN_FUTURE\&quot; to get CM Futures account details. | [optional] |

### Return type

[**QueryManagedSubAccountFuturesAssetDetailsResponse**](QueryManagedSubAccountFuturesAssetDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub-account Futures Asset Details |  -  |

<a id="queryManagedSubAccountList"></a>
# **queryManagedSubAccountList**
> QueryManagedSubAccountListResponse queryManagedSubAccountList(email, page, limit, recvWindow)

Query Managed Sub-account List (For Investor) (USER_DATA)

Get investor&#39;s managed sub-account list.  Weight(UID): 60  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryManagedSubAccountListResponse result = apiInstance.queryManagedSubAccountList(email, page, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountList");
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
| **email** | **String**|  | [optional] |
| **page** | **Long**|  | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryManagedSubAccountListResponse**](QueryManagedSubAccountListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub-account List |  -  |

<a id="queryManagedSubAccountMarginAssetDetails"></a>
# **queryManagedSubAccountMarginAssetDetails**
> QueryManagedSubAccountMarginAssetDetailsResponse queryManagedSubAccountMarginAssetDetails(email, accountType)

Query Managed Sub-account Margin Asset Details (For Investor Master Account) (USER_DATA)

Investor can use this api to query managed sub account margin asset details  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    String accountType = "MARGIN"; // String | No input or input \"MARGIN\" to get Cross Margin account details. Input \"ISOLATED_MARGIN\" to get Isolated Margin account details.
    try {
      QueryManagedSubAccountMarginAssetDetailsResponse result = apiInstance.queryManagedSubAccountMarginAssetDetails(email, accountType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountMarginAssetDetails");
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
| **email** | **String**|  | |
| **accountType** | **String**| No input or input \&quot;MARGIN\&quot; to get Cross Margin account details. Input \&quot;ISOLATED_MARGIN\&quot; to get Isolated Margin account details. | [optional] |

### Return type

[**QueryManagedSubAccountMarginAssetDetailsResponse**](QueryManagedSubAccountMarginAssetDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub-account Margin Asset Details |  -  |

<a id="queryManagedSubAccountSnapshot"></a>
# **queryManagedSubAccountSnapshot**
> QueryManagedSubAccountSnapshotResponse queryManagedSubAccountSnapshot(email, type, startTime, endTime, limit, recvWindow)

Query Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA)

Query Managed Sub-account Snapshot  Weight(IP): 2400  Security Type: USER_DATA  Notes: - The query time range must be less than 30 days. - Only data from the most recent month is supported. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are omitted, records from the last 7 days are returned by default.

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    OrderType type = OrderType.fromValue("SPOT"); // OrderType | 
    Long startTime = 1623319461670L; // Long | Query time range must be within 30 days and only supports data within the last month.
    Long endTime = 1641782889000L; // Long | If both startTime and endTime are omitted, records from the last 7 days are returned by default.
    Long limit = 10L; // Long | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryManagedSubAccountSnapshotResponse result = apiInstance.queryManagedSubAccountSnapshot(email, type, startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountSnapshot");
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
| **email** | **String**|  | |
| **type** | [**OrderType**](.md)|  | [enum: SPOT, MARGIN, FUTURES] |
| **startTime** | **Long**| Query time range must be within 30 days and only supports data within the last month. | [optional] |
| **endTime** | **Long**| If both startTime and endTime are omitted, records from the last 7 days are returned by default. | [optional] |
| **limit** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryManagedSubAccountSnapshotResponse**](QueryManagedSubAccountSnapshotResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub-account Snapshot |  -  |

<a id="queryManagedSubAccountTransferLogMasterAccountInvestor"></a>
# **queryManagedSubAccountTransferLogMasterAccountInvestor**
> QueryManagedSubAccountTransferLogMasterAccountInvestorResponse queryManagedSubAccountTransferLogMasterAccountInvestor(email, startTime, endTime, page, limit, transfers, transferFunctionAccountType)

Query Managed Sub Account Transfer Log For Investor Master Account (USER_DATA)

Query Managed Sub Account Transfer Log For Investor Master Account  Investor can use this api to query managed sub account transfer log. This endpoint is available for investor of Managed Sub-Account. A Managed Sub-Account is an account type for investors who value flexibility in asset allocation and account application, while delegating trades to a professional trading team.  Please refer to [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)  Weight(IP): 1  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    Long startTime = 1623319461670L; // Long | Start Time
    Long endTime = 1641782889000L; // Long | End Time (The start time and end time interval cannot exceed half a year)
    Long page = 1L; // Long | Page
    Long limit = 1L; // Long | 
    String transfers = "transfers_example"; // String | Transfer Direction (FROM/TO)
    TransferFunctionAccountType transferFunctionAccountType = TransferFunctionAccountType.fromValue("SPOT"); // TransferFunctionAccountType | 
    try {
      QueryManagedSubAccountTransferLogMasterAccountInvestorResponse result = apiInstance.queryManagedSubAccountTransferLogMasterAccountInvestor(email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountTransferLogMasterAccountInvestor");
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
| **email** | **String**|  | |
| **startTime** | **Long**| Start Time | |
| **endTime** | **Long**| End Time (The start time and end time interval cannot exceed half a year) | |
| **page** | **Long**| Page | |
| **limit** | **Long**|  | |
| **transfers** | **String**| Transfer Direction (FROM/TO) | [optional] |
| **transferFunctionAccountType** | [**TransferFunctionAccountType**](.md)|  | [optional] [enum: SPOT, MARGIN, ISOLATED_MARGIN, USDT_FUTURE, COIN_FUTURE] |

### Return type

[**QueryManagedSubAccountTransferLogMasterAccountInvestorResponse**](QueryManagedSubAccountTransferLogMasterAccountInvestorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub Account Transfer Log |  -  |

<a id="queryManagedSubAccountTransferLogMasterAccountTrading"></a>
# **queryManagedSubAccountTransferLogMasterAccountTrading**
> QueryManagedSubAccountTransferLogMasterAccountTradingResponse queryManagedSubAccountTransferLogMasterAccountTrading(email, startTime, endTime, page, limit, transfers, transferFunctionAccountType)

Query Managed Sub Account Transfer Log For Trading Team Master Account (USER_DATA)

Query Managed Sub Account Transfer Log For Trading Team Master Account  Trading team can use this api to query managed sub account transfer log. This endpoint is available for trading team of Managed Sub-Account. A Managed Sub-Account is an account type for investors who value flexibility in asset allocation and account application, while delegating trades to a professional trading team.  Please refer to [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)  Weight(UID): 60  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    String email = "abc@test.com"; // String | 
    Long startTime = 1623319461670L; // Long | Start Time
    Long endTime = 1641782889000L; // Long | End Time (The start time and end time interval cannot exceed half a year)
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    String transfers = "transfers_example"; // String | Transfer Direction (FROM/TO)
    TransferFunctionAccountType transferFunctionAccountType = TransferFunctionAccountType.fromValue("SPOT"); // TransferFunctionAccountType | 
    try {
      QueryManagedSubAccountTransferLogMasterAccountTradingResponse result = apiInstance.queryManagedSubAccountTransferLogMasterAccountTrading(email, startTime, endTime, page, limit, transfers, transferFunctionAccountType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountTransferLogMasterAccountTrading");
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
| **email** | **String**|  | |
| **startTime** | **Long**| Start Time | |
| **endTime** | **Long**| End Time (The start time and end time interval cannot exceed half a year) | |
| **page** | **Long**|  | |
| **limit** | **Long**|  | |
| **transfers** | **String**| Transfer Direction (FROM/TO) | [optional] |
| **transferFunctionAccountType** | [**TransferFunctionAccountType**](.md)|  | [optional] [enum: SPOT, MARGIN, ISOLATED_MARGIN, USDT_FUTURE, COIN_FUTURE] |

### Return type

[**QueryManagedSubAccountTransferLogMasterAccountTradingResponse**](QueryManagedSubAccountTransferLogMasterAccountTradingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub Account Transfer Log |  -  |

<a id="queryManagedSubAccountTransferLogSubAccountTrading"></a>
# **queryManagedSubAccountTransferLogSubAccountTrading**
> QueryManagedSubAccountTransferLogSubAccountTradingResponse queryManagedSubAccountTransferLogSubAccountTrading(startTime, endTime, page, limit, transfers, transferFunctionAccountType, recvWindow)

Query Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA)

Query Managed Sub Account Transfer Log (For Trading Team Sub Account)  Weight(UID): 60  Security Type: USER_DATA

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    Long startTime = 1623319461670L; // Long | Start Time
    Long endTime = 1641782889000L; // Long | End Time (The start time and end time interval cannot exceed half a year)
    Long page = 1L; // Long | 
    Long limit = 10L; // Long | 
    String transfers = "transfers_example"; // String | Transfer Direction (from/to)
    TransferFunctionAccountType transferFunctionAccountType = TransferFunctionAccountType.fromValue("SPOT"); // TransferFunctionAccountType | 
    Long recvWindow = 5000L; // Long | 
    try {
      QueryManagedSubAccountTransferLogSubAccountTradingResponse result = apiInstance.queryManagedSubAccountTransferLogSubAccountTrading(startTime, endTime, page, limit, transfers, transferFunctionAccountType, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#queryManagedSubAccountTransferLogSubAccountTrading");
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
| **startTime** | **Long**| Start Time | |
| **endTime** | **Long**| End Time (The start time and end time interval cannot exceed half a year) | |
| **page** | **Long**|  | |
| **limit** | **Long**|  | |
| **transfers** | **String**| Transfer Direction (from/to) | [optional] |
| **transferFunctionAccountType** | [**TransferFunctionAccountType**](.md)|  | [optional] [enum: SPOT, MARGIN, ISOLATED_MARGIN, USDT_FUTURE, COIN_FUTURE] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**QueryManagedSubAccountTransferLogSubAccountTradingResponse**](QueryManagedSubAccountTransferLogSubAccountTradingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Managed Sub Account Transfer Log |  -  |

<a id="withdrawlAssetsFromTheManagedSubAccount"></a>
# **withdrawlAssetsFromTheManagedSubAccount**
> WithdrawlAssetsFromTheManagedSubAccountResponse withdrawlAssetsFromTheManagedSubAccount(withdrawlAssetsFromTheManagedSubAccountRequest)

Withdrawl Assets From The Managed Sub-account (For Investor Master Account) (USER_DATA)

Withdrawl Assets From The Managed Sub-account  Weight(IP): 1  Security Type: USER_DATA  Notes: - Your API key must have the permission &#x60;Enable Spot &amp; Margin Trading&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.sub_account.ApiClient;
import com.binance.connector.client.sub_account.ApiException;
import com.binance.connector.client.sub_account.Configuration;
import com.binance.connector.client.sub_account.models.*;
import com.binance.connector.client.sub_account.rest.api.ManagedSubAccountApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    ManagedSubAccountApi apiInstance = new ManagedSubAccountApi(defaultClient);
    WithdrawlAssetsFromTheManagedSubAccountRequest withdrawlAssetsFromTheManagedSubAccountRequest = new WithdrawlAssetsFromTheManagedSubAccountRequest(); // WithdrawlAssetsFromTheManagedSubAccountRequest | 
    try {
      WithdrawlAssetsFromTheManagedSubAccountResponse result = apiInstance.withdrawlAssetsFromTheManagedSubAccount(withdrawlAssetsFromTheManagedSubAccountRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ManagedSubAccountApi#withdrawlAssetsFromTheManagedSubAccount");
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
| **withdrawlAssetsFromTheManagedSubAccountRequest** | [**WithdrawlAssetsFromTheManagedSubAccountRequest**](WithdrawlAssetsFromTheManagedSubAccountRequest.md)|  | |

### Return type

[**WithdrawlAssetsFromTheManagedSubAccountResponse**](WithdrawlAssetsFromTheManagedSubAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdrawl Assets From The Managed Sub-account |  -  |

