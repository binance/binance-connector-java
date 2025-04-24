# CapitalApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**allCoinsInformation**](CapitalApi.md#allCoinsInformation) | **GET** /sapi/v1/capital/config/getall | All Coins&#39; Information (USER_DATA) |
| [**depositAddress**](CapitalApi.md#depositAddress) | **GET** /sapi/v1/capital/deposit/address | Deposit Address(supporting network) (USER_DATA) |
| [**depositHistory**](CapitalApi.md#depositHistory) | **GET** /sapi/v1/capital/deposit/hisrec | Deposit History (supporting network) (USER_DATA) |
| [**fetchDepositAddressListWithNetwork**](CapitalApi.md#fetchDepositAddressListWithNetwork) | **GET** /sapi/v1/capital/deposit/address/list | Fetch deposit address list with network(USER_DATA) |
| [**fetchWithdrawAddressList**](CapitalApi.md#fetchWithdrawAddressList) | **GET** /sapi/v1/capital/withdraw/address/list | Fetch withdraw address list (USER_DATA) |
| [**fetchWithdrawQuota**](CapitalApi.md#fetchWithdrawQuota) | **GET** /sapi/v1/capital/withdraw/quota | Fetch withdraw quota (USER_DATA) |
| [**oneClickArrivalDepositApply**](CapitalApi.md#oneClickArrivalDepositApply) | **POST** /sapi/v1/capital/deposit/credit-apply | One click arrival deposit apply (for expired address deposit) (USER_DATA) |
| [**withdraw**](CapitalApi.md#withdraw) | **POST** /sapi/v1/capital/withdraw/apply | Withdraw(USER_DATA) |
| [**withdrawHistory**](CapitalApi.md#withdrawHistory) | **GET** /sapi/v1/capital/withdraw/history | Withdraw History (supporting network) (USER_DATA) |


<a id="allCoinsInformation"></a>
# **allCoinsInformation**
> AllCoinsInformationResponse allCoinsInformation(recvWindow)

All Coins&#39; Information (USER_DATA)

Get information of coins (available for deposit and withdraw) for user.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      AllCoinsInformationResponse result = apiInstance.allCoinsInformation(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#allCoinsInformation");
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

[**AllCoinsInformationResponse**](AllCoinsInformationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Coins&#39; Information |  -  |

<a id="depositAddress"></a>
# **depositAddress**
> DepositAddressResponse depositAddress(coin, network, amount, recvWindow)

Deposit Address(supporting network) (USER_DATA)

Fetch deposit address with network.  * If &#x60;network&#x60; is not send, return with default network of the coin. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. * &#x60;amount&#x60; needs to be sent if using LIGHTNING network  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    String coin = "coin_example"; // String | `coin` refers to the parent network address format that the address is using
    String network = "network_example"; // String | 
    Double amount = 3.4D; // Double | 
    Long recvWindow = 56L; // Long | 
    try {
      DepositAddressResponse result = apiInstance.depositAddress(coin, network, amount, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#depositAddress");
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
| **coin** | **String**| &#x60;coin&#x60; refers to the parent network address format that the address is using | |
| **network** | **String**|  | [optional] |
| **amount** | **Double**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**DepositAddressResponse**](DepositAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit Address |  -  |

<a id="depositHistory"></a>
# **depositHistory**
> DepositHistoryResponse depositHistory(includeSource, coin, status, startTime, endTime, offset, limit, recvWindow, txId)

Deposit History (supporting network) (USER_DATA)

Fetch deposit history.   * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. * If both &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; are sent, time between &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; must be less than 90 days.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    Boolean includeSource = true; // Boolean | Default: `false`, return `sourceAddress`field when set to `true`
    String coin = "coin_example"; // String | 
    Long status = 56L; // Long | 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed)
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long offset = 56L; // Long | Default: 0
    Long limit = 56L; // Long | min 7, max 30, default 7
    Long recvWindow = 56L; // Long | 
    String txId = "txId_example"; // String | 
    try {
      DepositHistoryResponse result = apiInstance.depositHistory(includeSource, coin, status, startTime, endTime, offset, limit, recvWindow, txId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#depositHistory");
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
| **includeSource** | **Boolean**| Default: &#x60;false&#x60;, return &#x60;sourceAddress&#x60;field when set to &#x60;true&#x60; | [optional] |
| **coin** | **String**|  | [optional] |
| **status** | **Long**| 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed) | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **offset** | **Long**| Default: 0 | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **recvWindow** | **Long**|  | [optional] |
| **txId** | **String**|  | [optional] |

### Return type

[**DepositHistoryResponse**](DepositHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit History |  -  |

<a id="fetchDepositAddressListWithNetwork"></a>
# **fetchDepositAddressListWithNetwork**
> FetchDepositAddressListWithNetworkResponse fetchDepositAddressListWithNetwork(coin, network)

Fetch deposit address list with network(USER_DATA)

Fetch deposit address list with network.   * If network is not send, return with default network of the coin. * You can get network and isDefault in networkList in the response of &#x60;Get /sapi/v1/capital/config/getall&#x60;.  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    String coin = "coin_example"; // String | `coin` refers to the parent network address format that the address is using
    String network = "network_example"; // String | 
    try {
      FetchDepositAddressListWithNetworkResponse result = apiInstance.fetchDepositAddressListWithNetwork(coin, network);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#fetchDepositAddressListWithNetwork");
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
| **coin** | **String**| &#x60;coin&#x60; refers to the parent network address format that the address is using | |
| **network** | **String**|  | [optional] |

### Return type

[**FetchDepositAddressListWithNetworkResponse**](FetchDepositAddressListWithNetworkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch deposit address list with network |  -  |

<a id="fetchWithdrawAddressList"></a>
# **fetchWithdrawAddressList**
> FetchWithdrawAddressListResponse fetchWithdrawAddressList()

Fetch withdraw address list (USER_DATA)

Fetch withdraw address list  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    try {
      FetchWithdrawAddressListResponse result = apiInstance.fetchWithdrawAddressList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#fetchWithdrawAddressList");
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

[**FetchWithdrawAddressListResponse**](FetchWithdrawAddressListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch withdraw address list |  -  |

<a id="fetchWithdrawQuota"></a>
# **fetchWithdrawQuota**
> FetchWithdrawQuotaResponse fetchWithdrawQuota()

Fetch withdraw quota (USER_DATA)

Fetch withdraw quota  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    try {
      FetchWithdrawQuotaResponse result = apiInstance.fetchWithdrawQuota();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#fetchWithdrawQuota");
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

[**FetchWithdrawQuotaResponse**](FetchWithdrawQuotaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch withdraw quota |  -  |

<a id="oneClickArrivalDepositApply"></a>
# **oneClickArrivalDepositApply**
> OneClickArrivalDepositApplyResponse oneClickArrivalDepositApply(oneClickArrivalDepositApplyRequest)

One click arrival deposit apply (for expired address deposit) (USER_DATA)

Apply deposit credit for expired address (One click arrival)  * Params need to be in the POST body  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    OneClickArrivalDepositApplyRequest oneClickArrivalDepositApplyRequest = new OneClickArrivalDepositApplyRequest(); // OneClickArrivalDepositApplyRequest | 
    try {
      OneClickArrivalDepositApplyResponse result = apiInstance.oneClickArrivalDepositApply(oneClickArrivalDepositApplyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#oneClickArrivalDepositApply");
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
| **oneClickArrivalDepositApplyRequest** | [**OneClickArrivalDepositApplyRequest**](OneClickArrivalDepositApplyRequest.md)|  | |

### Return type

[**OneClickArrivalDepositApplyResponse**](OneClickArrivalDepositApplyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | One click arrival deposit apply |  -  |

<a id="withdraw"></a>
# **withdraw**
> WithdrawResponse withdraw(withdrawRequest)

Withdraw(USER_DATA)

Submit a withdraw request.   * If &#x60;network&#x60; not send, return with default network of the coin. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; of a coin in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;.  Weight: 900

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    WithdrawRequest withdrawRequest = new WithdrawRequest(); // WithdrawRequest | 
    try {
      WithdrawResponse result = apiInstance.withdraw(withdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#withdraw");
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
| **withdrawRequest** | [**WithdrawRequest**](WithdrawRequest.md)|  | |

### Return type

[**WithdrawResponse**](WithdrawResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdraw |  -  |

<a id="withdrawHistory"></a>
# **withdrawHistory**
> WithdrawHistoryResponse withdrawHistory(coin, withdrawOrderId, status, offset, limit, idList, startTime, endTime, recvWindow)

Withdraw History (supporting network) (USER_DATA)

Fetch withdraw history.  * &#x60;network&#x60; may not be in the response for old withdraw. * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. * If both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less than 90 days. * If &#x60;withdrawOrderId&#x60; is sent, time between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 7 days. * If &#x60;withdrawOrderId&#x60; is sent, &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, will return last 7 days records by default. * Maximum support &#x60;idList&#x60; number is 45.  Weight: 18000 Request limit: 10 requests per second

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.CapitalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    CapitalApi apiInstance = new CapitalApi(defaultClient);
    String coin = "coin_example"; // String | 
    String withdrawOrderId = "withdrawOrderId_example"; // String | 
    Long status = 56L; // Long | 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed)
    Long offset = 56L; // Long | Default: 0
    Long limit = 56L; // Long | min 7, max 30, default 7
    String idList = "idList_example"; // String | id list returned in the response of POST `/sapi/v1/capital/withdraw/apply`, separated by `,`
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      WithdrawHistoryResponse result = apiInstance.withdrawHistory(coin, withdrawOrderId, status, offset, limit, idList, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CapitalApi#withdrawHistory");
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
| **coin** | **String**|  | [optional] |
| **withdrawOrderId** | **String**|  | [optional] |
| **status** | **Long**| 0(0:Email Sent, 2:Awaiting Approval 3:Rejected 4:Processing 6:Completed) | [optional] |
| **offset** | **Long**| Default: 0 | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **idList** | **String**| id list returned in the response of POST &#x60;/sapi/v1/capital/withdraw/apply&#x60;, separated by &#x60;,&#x60; | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**WithdrawHistoryResponse**](WithdrawHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdraw History |  -  |

