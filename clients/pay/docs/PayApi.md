# PayApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayTradeHistory**](PayApi.md#getPayTradeHistory) | **GET** /sapi/v1/pay/transactions | Get Pay Trade History |


<a id="getPayTradeHistory"></a>
# **getPayTradeHistory**
> GetPayTradeHistoryResponse getPayTradeHistory(startTime, endTime, limit, recvWindow)

Get Pay Trade History

Get Pay Trade History  * If startTime and endTime are not sent, the recent 90 days&#39; data will be returned. * The max interval between startTime and endTime is 90 days. * Support for querying orders within the last 18 months. * For payerInfo and receiverInfo，there are different return values in different orderTypes. * Sender&#39;s perspective when orderType is C2C * payerInfo : binanceId * receiverInfo : name, binanceId/accountId/email/countryCode/phoneNumber/mobileCode (based on user input) * Receiver&#39;s perspective when orderType is C2C * payerInfo : name * receiverInfo : binanceId * Sender&#39;s perspective when orderType is CRYPTO_BOX * payerInfo : binanceId * receiverInfo : name(the value is always \&quot;Crypto Box\&quot;) * Receiver&#39;s perspective when orderType is CRYPTO_BOX * payerInfo : name * receiverInfo : binanceId * Sender&#39;s perspective when orderType is PAY * payerInfo : binanceId * receiverInfo : name * Receiver&#39;s perspective when orderType is PAY * payerInfo : name * receiverInfo : binanceId, name * Sender&#39;s perspective when orderType is PAY_REFUND * payerInfo : binanceId, name * receiverInfo : name, accountId * Receiver&#39;s perspective when orderType is PAY_REFUND * payerInfo : name * receiverInfo :  binanceId * Sender&#39;s perspective when orderType is PAYOUT * payerInfo : binanceId, name * receiverInfo : name, accountId * Receiver&#39;s perspective when orderType is PAYOUT * payerInfo : name * receiverInfo :  binanceId * Receiver&#39;s perspective when orderType is CRYPTO_BOX_RF * payerInfo : name(the value is always \&quot;Crypto Box\&quot;) * receiverInfo : binanceId * Sender&#39;s perspective when orderType is REMITTANCE * payerInfo : binanceId * receiverInfo : name, institutionName, cardNumber, digitalWalletId  Weight: 3000

### Example
```java
// Import classes:
import com.binance.connector.client.pay.ApiClient;
import com.binance.connector.client.pay.ApiException;
import com.binance.connector.client.pay.Configuration;
import com.binance.connector.client.pay.models.*;
import com.binance.connector.client.pay.rest.api.PayApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    PayApi apiInstance = new PayApi(defaultClient);
    Long startTime = 56L; // Long | 
    Long endTime = 56L; // Long | 
    Long limit = 56L; // Long | default 100, max 100
    Long recvWindow = 56L; // Long | 
    try {
      GetPayTradeHistoryResponse result = apiInstance.getPayTradeHistory(startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayApi#getPayTradeHistory");
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
| **limit** | **Long**| default 100, max 100 | [optional] |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**GetPayTradeHistoryResponse**](GetPayTradeHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Pay Trade History |  -  |

