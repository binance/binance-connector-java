# DefaultApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayTradeHistory**](DefaultApi.md#getPayTradeHistory) | **GET** /sapi/v1/pay/transactions | Get Pay Trade History |


<a id="getPayTradeHistory"></a>
# **getPayTradeHistory**
> GetPayTradeHistoryResponse getPayTradeHistory(startTime, endTime, limit, recvWindow)

Get Pay Trade History

Get Pay Trade History  Weight(UID): 3000  Notes: - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 90 days&#39; data will be returned. - The max interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 90 days. - Support for querying orders within the last 18 months. - &#x60;payerInfo&#x60; and &#x60;receiverInfo&#x60; return different fields in different &#x60;orderType&#x60; values:   - C2C sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name, binanceId/accountId/email/countryCode/phoneNumber/mobileCode&#x60; (based on user input).   - C2C receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;.   - CRYPTO_BOX sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60; (always &#x60;\&quot;Crypto Box\&quot;&#x60;).   - CRYPTO_BOX receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;.   - PAY sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60;.   - PAY receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId, name&#x60;.   - PAY_REFUND sender: &#x60;payerInfo&#x3D;binanceId, name&#x60;; &#x60;receiverInfo&#x3D;name, accountId&#x60;.   - PAY_REFUND receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;.   - PAYOUT sender: &#x60;payerInfo&#x3D;binanceId, name&#x60;; &#x60;receiverInfo&#x3D;name, accountId&#x60;.   - PAYOUT receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;.   - CRYPTO_BOX_RF receiver: &#x60;payerInfo&#x3D;name&#x60; (always &#x60;\&quot;Crypto Box\&quot;&#x60;); &#x60;receiverInfo&#x3D;binanceId&#x60;.   - REMITTANCE sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name, institutionName, cardNumber, digitalWalletId&#x60;.

### Example
```java
// Import classes:
import com.binance.connector.client.pay.ApiClient;
import com.binance.connector.client.pay.ApiException;
import com.binance.connector.client.pay.Configuration;
import com.binance.connector.client.pay.models.*;
import com.binance.connector.client.pay.rest.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Long startTime = 1623319461670L; // Long | Start time in milliseconds.
    Long endTime = 1641782889000L; // Long | End time in milliseconds.
    Long limit = 100L; // Long | Number of records to return.
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds.
    try {
      GetPayTradeHistoryResponse result = apiInstance.getPayTradeHistory(startTime, endTime, limit, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPayTradeHistory");
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
| **startTime** | **Long**| Start time in milliseconds. | [optional] |
| **endTime** | **Long**| End time in milliseconds. | [optional] |
| **limit** | **Long**| Number of records to return. | [optional] |
| **recvWindow** | **Long**| Request validity window in milliseconds. | [optional] |

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

