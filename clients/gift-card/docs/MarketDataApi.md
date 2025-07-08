# MarketDataApi

All URIs are relative to *https://api.binance.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createADualTokenGiftCard**](MarketDataApi.md#createADualTokenGiftCard) | **POST** /sapi/v1/giftcard/buyCode | Create a dual-token gift card(fixed value, discount feature)(TRADE) |
| [**createASingleTokenGiftCard**](MarketDataApi.md#createASingleTokenGiftCard) | **POST** /sapi/v1/giftcard/createCode | Create a single-token gift card (USER_DATA) |
| [**fetchRsaPublicKey**](MarketDataApi.md#fetchRsaPublicKey) | **GET** /sapi/v1/giftcard/cryptography/rsa-public-key | Fetch RSA Public Key(USER_DATA) |
| [**fetchTokenLimit**](MarketDataApi.md#fetchTokenLimit) | **GET** /sapi/v1/giftcard/buyCode/token-limit | Fetch Token Limit(USER_DATA) |
| [**redeemABinanceGiftCard**](MarketDataApi.md#redeemABinanceGiftCard) | **POST** /sapi/v1/giftcard/redeemCode | Redeem a Binance Gift Card(USER_DATA) |
| [**verifyBinanceGiftCardByGiftCardNumber**](MarketDataApi.md#verifyBinanceGiftCardByGiftCardNumber) | **GET** /sapi/v1/giftcard/verify | Verify Binance Gift Card by Gift Card Number(USER_DATA) |


<a id="createADualTokenGiftCard"></a>
# **createADualTokenGiftCard**
> CreateADualTokenGiftCardResponse createADualTokenGiftCard(createADualTokenGiftCardRequest)

Create a dual-token gift card(fixed value, discount feature)(TRADE)

* This API is for creating a dual-token ( stablecoin-denominated) Binance Gift Card. You may create a gift card using USDT as baseToken, that is redeemable to another designated token (faceToken). For example, you can create a fixed-value BTC gift card and pay with 100 USDT plus 1 USDT fee. This gift card can keep the value fixed at 100 USDT before redemption, and will be redeemable to BTC equivalent to 100 USDT upon redemption. * Once successfully created, the amount of baseToken (e.g. USDT) in the fixed-value gift card along with the fee would be deducted from your funding wallet.   * To get started with, please make sure: * You have a Binance account * You have passed KYB * You have a sufﬁcient balance(Gift Card amount and fee amount) in your Binance funding wallet * You need Enable Withdrawals for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    CreateADualTokenGiftCardRequest createADualTokenGiftCardRequest = new CreateADualTokenGiftCardRequest(); // CreateADualTokenGiftCardRequest | 
    try {
      CreateADualTokenGiftCardResponse result = apiInstance.createADualTokenGiftCard(createADualTokenGiftCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#createADualTokenGiftCard");
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
| **createADualTokenGiftCardRequest** | [**CreateADualTokenGiftCardRequest**](CreateADualTokenGiftCardRequest.md)|  | |

### Return type

[**CreateADualTokenGiftCardResponse**](CreateADualTokenGiftCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a dual-token gift card |  -  |

<a id="createASingleTokenGiftCard"></a>
# **createASingleTokenGiftCard**
> CreateASingleTokenGiftCardResponse createASingleTokenGiftCard(createASingleTokenGiftCardRequest)

Create a single-token gift card (USER_DATA)

This API is for creating a Binance Gift Card.  To get started with, please make sure:  * You have a Binance account * You have passed KYB * You have a sufﬁcient balance(Gift Card amount and fee amount) in your Binance funding wallet * You need &#x60;Enable Withdrawals&#x60; for the API Key which requests this endpoint.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    CreateASingleTokenGiftCardRequest createASingleTokenGiftCardRequest = new CreateASingleTokenGiftCardRequest(); // CreateASingleTokenGiftCardRequest | 
    try {
      CreateASingleTokenGiftCardResponse result = apiInstance.createASingleTokenGiftCard(createASingleTokenGiftCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#createASingleTokenGiftCard");
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
| **createASingleTokenGiftCardRequest** | [**CreateASingleTokenGiftCardRequest**](CreateASingleTokenGiftCardRequest.md)|  | |

### Return type

[**CreateASingleTokenGiftCardResponse**](CreateASingleTokenGiftCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Create a single-token gift card |  -  |

<a id="fetchRsaPublicKey"></a>
# **fetchRsaPublicKey**
> FetchRsaPublicKeyResponse fetchRsaPublicKey(recvWindow)

Fetch RSA Public Key(USER_DATA)

This API is for fetching the RSA Public Key. This RSA Public key will be used to encrypt the card code.  **Please note that the RSA Public key fetched is valid only for the current day.**  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    Long recvWindow = 56L; // Long | 
    try {
      FetchRsaPublicKeyResponse result = apiInstance.fetchRsaPublicKey(recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#fetchRsaPublicKey");
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

[**FetchRsaPublicKeyResponse**](FetchRsaPublicKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch RSA Public Key |  -  |

<a id="fetchTokenLimit"></a>
# **fetchTokenLimit**
> FetchTokenLimitResponse fetchTokenLimit(baseToken, recvWindow)

Fetch Token Limit(USER_DATA)

This API is to help you verify which tokens are available for you to create Stablecoin-Denominated gift cards as mentioned in section 2 and its’ limitation.  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String baseToken = "baseToken_example"; // String | The token you want to pay, example: BUSD
    Long recvWindow = 56L; // Long | 
    try {
      FetchTokenLimitResponse result = apiInstance.fetchTokenLimit(baseToken, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#fetchTokenLimit");
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
| **baseToken** | **String**| The token you want to pay, example: BUSD | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**FetchTokenLimitResponse**](FetchTokenLimitResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetch Token Limit |  -  |

<a id="redeemABinanceGiftCard"></a>
# **redeemABinanceGiftCard**
> RedeemABinanceGiftCardResponse redeemABinanceGiftCard(redeemABinanceGiftCardRequest)

Redeem a Binance Gift Card(USER_DATA)

This API is for redeeming a Binance Gift Card Once redeemed, the coins will be deposited in your funding wallet.  * Parameter code can be sent in two formats: * Plaintext * Encrypted  * Sending code in Encrypted format provides more security than sending it as a plaintext. To send card code in encrypted format the following steps must be followed: * Fetch RSA public key from api stated below. * Use the below algorithm to encrypt the card code using the RSA public key fetched above: &#x60;RSA/ECB/OAEPWithSHA-256AndMGF1Padding&#x60; **A sample code snippet (JAVA) is stated below for reference, the same approach can be used for different languages like C#, PERL, PYTHON, SHELL etc.:**  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    RedeemABinanceGiftCardRequest redeemABinanceGiftCardRequest = new RedeemABinanceGiftCardRequest(); // RedeemABinanceGiftCardRequest | 
    try {
      RedeemABinanceGiftCardResponse result = apiInstance.redeemABinanceGiftCard(redeemABinanceGiftCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#redeemABinanceGiftCard");
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
| **redeemABinanceGiftCardRequest** | [**RedeemABinanceGiftCardRequest**](RedeemABinanceGiftCardRequest.md)|  | |

### Return type

[**RedeemABinanceGiftCardResponse**](RedeemABinanceGiftCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Redeem a Binance Gift Card |  -  |

<a id="verifyBinanceGiftCardByGiftCardNumber"></a>
# **verifyBinanceGiftCardByGiftCardNumber**
> VerifyBinanceGiftCardByGiftCardNumberResponse verifyBinanceGiftCardByGiftCardNumber(referenceNo, recvWindow)

Verify Binance Gift Card by Gift Card Number(USER_DATA)

This API is for verifying whether the Binance Gift Card is valid or not by entering Gift Card Number.  **Please note that if you enter the wrong Gift Card Number 5 times within an hour, you will no longer be able to verify any Gift Card Number for that hour.**  Weight: 1

### Example
```java
// Import classes:
import com.binance.connector.client.gift_card.ApiClient;
import com.binance.connector.client.gift_card.ApiException;
import com.binance.connector.client.gift_card.Configuration;
import com.binance.connector.client.gift_card.models.*;
import com.binance.connector.client.gift_card.rest.api.MarketDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.binance.com");

    MarketDataApi apiInstance = new MarketDataApi(defaultClient);
    String referenceNo = "referenceNo_example"; // String | Enter the Gift Card Number
    Long recvWindow = 56L; // Long | 
    try {
      VerifyBinanceGiftCardByGiftCardNumberResponse result = apiInstance.verifyBinanceGiftCardByGiftCardNumber(referenceNo, recvWindow);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MarketDataApi#verifyBinanceGiftCardByGiftCardNumber");
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
| **referenceNo** | **String**| Enter the Gift Card Number | |
| **recvWindow** | **Long**|  | [optional] |

### Return type

[**VerifyBinanceGiftCardByGiftCardNumberResponse**](VerifyBinanceGiftCardByGiftCardNumberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Verify Binance Gift Card by Gift Card Number |  -  |

