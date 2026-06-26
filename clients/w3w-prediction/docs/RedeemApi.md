# RedeemApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchRedeem**](RedeemApi.md#batchRedeem) | **POST** /sapi/v1/w3w/wallet/prediction/batch-redeem | Batch Redeem |
| [**getRedeemStatus**](RedeemApi.md#getRedeemStatus) | **GET** /sapi/v1/w3w/wallet/prediction/redeem/status | Get Redeem Status |


<a id="batchRedeem"></a>
# **batchRedeem**
> BatchRedeemResponse batchRedeem(batchRedeemRequest)

Batch Redeem

Redeem one or more settled prediction tokens on-chain to claim winnings. Requires SAS authorization.  Weight(IP): 200  Security Type: TRADE

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.RedeemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RedeemApi apiInstance = new RedeemApi(defaultClient);
    BatchRedeemRequest batchRedeemRequest = new BatchRedeemRequest(); // BatchRedeemRequest | 
    try {
      BatchRedeemResponse result = apiInstance.batchRedeem(batchRedeemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedeemApi#batchRedeem");
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
| **batchRedeemRequest** | [**BatchRedeemRequest**](BatchRedeemRequest.md)|  | |

### Return type

[**BatchRedeemResponse**](BatchRedeemResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch Redeem |  -  |

<a id="getRedeemStatus"></a>
# **getRedeemStatus**
> GetRedeemStatusResponse getRedeemStatus(walletAddress, txHash, recvWindow)

Get Redeem Status

Query the on-chain transaction status of a previously submitted redeem request.  Weight(IP): 200  Security Type: USER_DATA  Response Notes: - Status values:    | Value       | Description                                  |   | ----------- | -------------------------------------------- |   | &#x60;PENDING&#x60;   | Transaction submitted, awaiting confirmation |   | &#x60;CONFIRMED&#x60; | Transaction confirmed on-chain               |   | &#x60;FAILED&#x60;    | Transaction failed                           |   | &#x60;NOT_FOUND&#x60; | Transaction hash not found                   |

### Example
```java
// Import classes:
import com.binance.connector.client.w3w_prediction.ApiClient;
import com.binance.connector.client.w3w_prediction.ApiException;
import com.binance.connector.client.w3w_prediction.Configuration;
import com.binance.connector.client.w3w_prediction.models.*;
import com.binance.connector.client.w3w_prediction.rest.api.RedeemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    RedeemApi apiInstance = new RedeemApi(defaultClient);
    String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c"; // String | User's prediction wallet address
    String txHash = "0xabc123def456789abcdef123456789abcdef123456789abcdef123456789abcd"; // String | Redeem transaction hash
    Long recvWindow = 5000L; // Long | Request validity window in milliseconds
    try {
      GetRedeemStatusResponse result = apiInstance.getRedeemStatus(walletAddress, txHash, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RedeemApi#getRedeemStatus");
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
| **walletAddress** | **String**| User&#39;s prediction wallet address | |
| **txHash** | **String**| Redeem transaction hash | |
| **recvWindow** | **Long**| Request validity window in milliseconds | [optional] |

### Return type

[**GetRedeemStatusResponse**](GetRedeemStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Redeem Status |  -  |

