# TravelRuleApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brokerWithdraw**](TravelRuleApi.md#brokerWithdraw) | **POST** /sapi/v1/localentity/broker/withdraw/apply | Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA) |
| [**depositHistoryTravelRule**](TravelRuleApi.md#depositHistoryTravelRule) | **GET** /sapi/v1/localentity/deposit/history | Deposit History (for local entities that required travel rule) (supporting network) (USER_DATA) |
| [**fetchAddressVerificationList**](TravelRuleApi.md#fetchAddressVerificationList) | **GET** /sapi/v1/addressVerify/list | Fetch address verification list (USER_DATA) |
| [**onboardedVaspList**](TravelRuleApi.md#onboardedVaspList) | **GET** /sapi/v1/localentity/vasp | Onboarded VASP list (for local entities that require travel rule) (supporting network) (USER_DATA) |
| [**submitDepositQuestionnaire**](TravelRuleApi.md#submitDepositQuestionnaire) | **PUT** /sapi/v1/localentity/broker/deposit/provide-info | Submit Deposit Questionnaire (For local entities that require travel rule) (supporting network) (USER_DATA) |
| [**submitDepositQuestionnaireTravelRule**](TravelRuleApi.md#submitDepositQuestionnaireTravelRule) | **PUT** /sapi/v1/localentity/deposit/provide-info | Submit Deposit Questionnaire (For local entities that require travel rule) (supporting network) (USER_DATA) |
| [**withdrawHistoryV1**](TravelRuleApi.md#withdrawHistoryV1) | **GET** /sapi/v1/localentity/withdraw/history | Withdraw History (for local entities that require travel rule) (supporting network) (USER_DATA) |
| [**withdrawHistoryV2**](TravelRuleApi.md#withdrawHistoryV2) | **GET** /sapi/v2/localentity/withdraw/history | Withdraw History V2 (for local entities that require travel rule) (supporting network) (USER_DATA) |
| [**withdrawTravelRule**](TravelRuleApi.md#withdrawTravelRule) | **POST** /sapi/v1/localentity/withdraw/apply | Withdraw (for local entities that require travel rule) (USER_DATA) |


<a id="brokerWithdraw"></a>
# **brokerWithdraw**
> BrokerWithdrawResponse brokerWithdraw(brokerWithdrawRequest)

Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA)

Submit a withdrawal request for brokers of local entities that required travel rule.  * If &#x60;network&#x60; not send, return with default network of the coin, but if the address could not match default network, the withdraw will be rejected. * You can get &#x60;network&#x60; in &#x60;networkList&#x60; of a coin in the response * Questionnaire is different for each local entity, please refer to * If getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;,  Weight: 600

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    BrokerWithdrawRequest brokerWithdrawRequest = new BrokerWithdrawRequest(); // BrokerWithdrawRequest | 
    try {
      BrokerWithdrawResponse result = apiInstance.brokerWithdraw(brokerWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#brokerWithdraw");
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
| **brokerWithdrawRequest** | [**BrokerWithdrawRequest**](BrokerWithdrawRequest.md)|  | |

### Return type

[**BrokerWithdrawResponse**](BrokerWithdrawResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Broker Withdraw |  -  |

<a id="depositHistoryTravelRule"></a>
# **depositHistoryTravelRule**
> DepositHistoryTravelRuleResponse depositHistoryTravelRule(trId, txId, tranId, network, coin, travelRuleStatus, pendingQuestionnaire, startTime, endTime, offset, limit)

Deposit History (for local entities that required travel rule) (supporting network) (USER_DATA)

Fetch deposit history for local entities that required travel rule.  * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within * If both &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; are sent, time between &#x60;&#x60;startTime&#x60;&#x60; and &#x60;&#x60;endTime&#x60;&#x60; must  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    String trId = "trId_example"; // String | Comma(,) separated list of travel rule record Ids.
    String txId = "txId_example"; // String | 
    String tranId = "tranId_example"; // String | Comma(,) separated list of wallet tran Ids.
    String network = "network_example"; // String | 
    String coin = "coin_example"; // String | 
    Long travelRuleStatus = 56L; // Long | 0:Completed,1:Pending,2:Failed
    Boolean pendingQuestionnaire = true; // Boolean | true: Only return records that pending deposit questionnaire. false/not provided: return all records.
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long offset = 56L; // Long | Default: 0
    Long limit = 56L; // Long | min 7, max 30, default 7
    try {
      DepositHistoryTravelRuleResponse result = apiInstance.depositHistoryTravelRule(trId, txId, tranId, network, coin, travelRuleStatus, pendingQuestionnaire, startTime, endTime, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#depositHistoryTravelRule");
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
| **trId** | **String**| Comma(,) separated list of travel rule record Ids. | [optional] |
| **txId** | **String**|  | [optional] |
| **tranId** | **String**| Comma(,) separated list of wallet tran Ids. | [optional] |
| **network** | **String**|  | [optional] |
| **coin** | **String**|  | [optional] |
| **travelRuleStatus** | **Long**| 0:Completed,1:Pending,2:Failed | [optional] |
| **pendingQuestionnaire** | **Boolean**| true: Only return records that pending deposit questionnaire. false/not provided: return all records. | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **offset** | **Long**| Default: 0 | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |

### Return type

[**DepositHistoryTravelRuleResponse**](DepositHistoryTravelRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit History |  -  |

<a id="fetchAddressVerificationList"></a>
# **fetchAddressVerificationList**
> FetchAddressVerificationListResponse fetchAddressVerificationList()

Fetch address verification list (USER_DATA)

Fetch address verification list  Weight: 10

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    try {
      FetchAddressVerificationListResponse result = apiInstance.fetchAddressVerificationList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#fetchAddressVerificationList");
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

[**FetchAddressVerificationListResponse**](FetchAddressVerificationListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch address verification list |  -  |

<a id="onboardedVaspList"></a>
# **onboardedVaspList**
> OnboardedVaspListResponse onboardedVaspList()

Onboarded VASP list (for local entities that require travel rule) (supporting network) (USER_DATA)

Fetch the onboarded VASP list for local entities that required travel rule.  * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate  Weight: 18000 Request limit: 10 requests per second &gt; * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate limit is 180000/second. Response from the endpoint contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight used by the current IP.

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    try {
      OnboardedVaspListResponse result = apiInstance.onboardedVaspList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#onboardedVaspList");
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

[**OnboardedVaspListResponse**](OnboardedVaspListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Onboarded VASP list |  -  |

<a id="submitDepositQuestionnaire"></a>
# **submitDepositQuestionnaire**
> SubmitDepositQuestionnaireResponse submitDepositQuestionnaire(submitDepositQuestionnaireRequest)

Submit Deposit Questionnaire (For local entities that require travel rule) (supporting network) (USER_DATA)

Submit questionnaire for brokers of local entities that require travel rule. The questionnaire is only applies to transactions from un-hosted wallets or VASPs that are not yet onboarded with GTR.  * Questionnaire is different for each local entity, please refer * If getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;,  Weight: 600

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    SubmitDepositQuestionnaireRequest submitDepositQuestionnaireRequest = new SubmitDepositQuestionnaireRequest(); // SubmitDepositQuestionnaireRequest | 
    try {
      SubmitDepositQuestionnaireResponse result = apiInstance.submitDepositQuestionnaire(submitDepositQuestionnaireRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitDepositQuestionnaire");
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
| **submitDepositQuestionnaireRequest** | [**SubmitDepositQuestionnaireRequest**](SubmitDepositQuestionnaireRequest.md)|  | |

### Return type

[**SubmitDepositQuestionnaireResponse**](SubmitDepositQuestionnaireResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Submit Deposit Questionnaire |  -  |

<a id="submitDepositQuestionnaireTravelRule"></a>
# **submitDepositQuestionnaireTravelRule**
> SubmitDepositQuestionnaireTravelRuleResponse submitDepositQuestionnaireTravelRule(submitDepositQuestionnaireTravelRuleRequest)

Submit Deposit Questionnaire (For local entities that require travel rule) (supporting network) (USER_DATA)

Submit questionnaire for local entities that require travel rule. The questionnaire is only applies to transactions from unhosted wallets or VASPs that are not yet onboarded with GTR.  * Questionnaire is different for each local entity, please refer * If getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;,  Weight: 600

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    SubmitDepositQuestionnaireTravelRuleRequest submitDepositQuestionnaireTravelRuleRequest = new SubmitDepositQuestionnaireTravelRuleRequest(); // SubmitDepositQuestionnaireTravelRuleRequest | 
    try {
      SubmitDepositQuestionnaireTravelRuleResponse result = apiInstance.submitDepositQuestionnaireTravelRule(submitDepositQuestionnaireTravelRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitDepositQuestionnaireTravelRule");
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
| **submitDepositQuestionnaireTravelRuleRequest** | [**SubmitDepositQuestionnaireTravelRuleRequest**](SubmitDepositQuestionnaireTravelRuleRequest.md)|  | |

### Return type

[**SubmitDepositQuestionnaireTravelRuleResponse**](SubmitDepositQuestionnaireTravelRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Submit Deposit Questionnaire |  -  |

<a id="withdrawHistoryV1"></a>
# **withdrawHistoryV1**
> WithdrawHistoryV1Response withdrawHistoryV1(trId, txId, withdrawOrderId, network, coin, travelRuleStatus, offset, limit, startTime, endTime, recvWindow)

Withdraw History (for local entities that require travel rule) (supporting network) (USER_DATA)

Fetch withdraw history for local entities that required travel rule.  * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate * &#x60;network&#x60; may not be in the response for old withdraw. * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within * If both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less  Weight: 18000 Request limit: 10 requests per second &gt; * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate limit is 180000/second. Response from the endpoint contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight used by the current IP.

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    String trId = "trId_example"; // String | Comma(,) separated list of travel rule record Ids.
    String txId = "txId_example"; // String | 
    String withdrawOrderId = "withdrawOrderId_example"; // String | client side id for withdrawal, if provided in POST `/sapi/v1/capital/withdraw/apply`, can be used here for query.
    String network = "network_example"; // String | 
    String coin = "coin_example"; // String | 
    Long travelRuleStatus = 56L; // Long | 0:Completed,1:Pending,2:Failed
    Long offset = 56L; // Long | Default: 0
    Long limit = 56L; // Long | min 7, max 30, default 7
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      WithdrawHistoryV1Response result = apiInstance.withdrawHistoryV1(trId, txId, withdrawOrderId, network, coin, travelRuleStatus, offset, limit, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#withdrawHistoryV1");
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
| **trId** | **String**| Comma(,) separated list of travel rule record Ids. | [optional] |
| **txId** | **String**|  | [optional] |
| **withdrawOrderId** | **String**| client side id for withdrawal, if provided in POST &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. | [optional] |
| **network** | **String**|  | [optional] |
| **coin** | **String**|  | [optional] |
| **travelRuleStatus** | **Long**| 0:Completed,1:Pending,2:Failed | [optional] |
| **offset** | **Long**| Default: 0 | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**WithdrawHistoryV1Response**](WithdrawHistoryV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdraw History |  -  |

<a id="withdrawHistoryV2"></a>
# **withdrawHistoryV2**
> WithdrawHistoryV2Response withdrawHistoryV2(trId, txId, withdrawOrderId, network, coin, travelRuleStatus, offset, limit, startTime, endTime, recvWindow)

Withdraw History V2 (for local entities that require travel rule) (supporting network) (USER_DATA)

Fetch withdraw history for local entities that required travel rule.  * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate * &#x60;network&#x60; may not be in the response for old withdraw. * Withdrawal made through /sapi/v1/capital/withdraw/apply may not be in the response. * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within * If both &#x60;startTime&#x60; and &#x60;endTime&#x60;are sent, time between &#x60;startTime&#x60;and &#x60;endTime&#x60;must be less * If withdrawOrderId is sent, time between startTime and endTime must be less than 7 days. * If withdrawOrderId is sent, startTime and endTime are not sent, will return last 7 days records by default. * Maximum support trId,txId number is 45. * WithdrawOrderId only support 1. * If responsible does not include withdrawalStatus, please input trId or txId retrieve the data.  Weight: 18000 Request limit: 10 requests per second &gt; * This endpoint specifically uses per second IP rate limit, user&#39;s total second level IP rate limit is 180000/second. Response from the endpoint contains header key X-SAPI-USED-IP-WEIGHT-1S, which defines weight used by the current IP.

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    String trId = "trId_example"; // String | Comma(,) separated list of travel rule record Ids.
    String txId = "txId_example"; // String | 
    String withdrawOrderId = "withdrawOrderId_example"; // String | client side id for withdrawal, if provided in POST `/sapi/v1/capital/withdraw/apply`, can be used here for query.
    String network = "network_example"; // String | 
    String coin = "coin_example"; // String | 
    Long travelRuleStatus = 56L; // Long | 0:Completed,1:Pending,2:Failed
    Long offset = 56L; // Long | Default: 0
    Long limit = 56L; // Long | min 7, max 30, default 7
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long recvWindow = 56L; // Long | 
    try {
      WithdrawHistoryV2Response result = apiInstance.withdrawHistoryV2(trId, txId, withdrawOrderId, network, coin, travelRuleStatus, offset, limit, startTime, endTime, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#withdrawHistoryV2");
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
| **trId** | **String**| Comma(,) separated list of travel rule record Ids. | [optional] |
| **txId** | **String**|  | [optional] |
| **withdrawOrderId** | **String**| client side id for withdrawal, if provided in POST &#x60;/sapi/v1/capital/withdraw/apply&#x60;, can be used here for query. | [optional] |
| **network** | **String**|  | [optional] |
| **coin** | **String**|  | [optional] |
| **travelRuleStatus** | **Long**| 0:Completed,1:Pending,2:Failed | [optional] |
| **offset** | **Long**| Default: 0 | [optional] |
| **limit** | **Long**| min 7, max 30, default 7 | [optional] |
| **startTime** | **Long**|  | [optional] |
| **endTime** | **Long**|  | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**WithdrawHistoryV2Response**](WithdrawHistoryV2Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdraw History V2 |  -  |

<a id="withdrawTravelRule"></a>
# **withdrawTravelRule**
> WithdrawTravelRuleResponse withdrawTravelRule(withdrawTravelRuleRequest)

Withdraw (for local entities that require travel rule) (USER_DATA)

Submit a withdrawal request for local entities that required travel rule.  * If &#x60;network&#x60; not send, return with default network of the coin, but if the address could not match default network, the withdraw will be rejected. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; of a coin in the response * Questionnaire is different for each local entity, please refer to * If getting error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;,  Weight: 600

### Example
```java
// Import classes:
import com.binance.connector.client.wallet.ApiClient;
import com.binance.connector.client.wallet.ApiException;
import com.binance.connector.client.wallet.Configuration;
import com.binance.connector.client.wallet.models.*;
import com.binance.connector.client.wallet.rest.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    TravelRuleApi apiInstance = new TravelRuleApi(defaultClient);
    WithdrawTravelRuleRequest withdrawTravelRuleRequest = new WithdrawTravelRuleRequest(); // WithdrawTravelRuleRequest | 
    try {
      WithdrawTravelRuleResponse result = apiInstance.withdrawTravelRule(withdrawTravelRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#withdrawTravelRule");
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
| **withdrawTravelRuleRequest** | [**WithdrawTravelRuleRequest**](WithdrawTravelRuleRequest.md)|  | |

### Return type

[**WithdrawTravelRuleResponse**](WithdrawTravelRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Withdraw |  -  |

