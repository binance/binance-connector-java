/*
 * Binance Derivatives Trading USDS Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.rest.api;

import static org.junit.Assert.assertEquals;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.auth.BinanceAuthenticationFactory;
import com.binance.connector.client.common.auth.SignatureAuthentication;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.sign.HmacSignatureGenerator;
import com.binance.connector.client.common.sign.SignatureGenerator;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AcceptTheOfferedQuoteRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AcceptTheOfferedQuoteResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ListAllConvertPairsResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.OrderStatusResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestResponse;
import jakarta.validation.constraints.*;
import okhttp3.Call;
import okhttp3.Request;
import org.bouncycastle.crypto.CryptoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** API tests for ConvertApi */
public class ConvertApiTest {

    private ConvertApi api;
    private ApiClient apiClientSpy;
    private SignatureGenerator signatureGeneratorSpy;

    @BeforeEach
    public void initApiClient() throws ApiException {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setUrl("http://localhost:8080");
        SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
        signatureConfiguration.setApiKey("apiKey");
        signatureConfiguration.setSecretKey("secretKey");
        clientConfiguration.setSignatureConfiguration(signatureConfiguration);

        HmacSignatureGenerator signatureGenerator =
                new HmacSignatureGenerator(signatureConfiguration.getSecretKey());
        signatureGeneratorSpy = Mockito.spy(signatureGenerator);
        SignatureAuthentication signatureAuthentication =
                new SignatureAuthentication(
                        signatureConfiguration.getApiKey(), signatureGeneratorSpy);
        SignatureAuthentication authenticationSpy = Mockito.spy(signatureAuthentication);
        Mockito.doReturn("1736393892000").when(authenticationSpy).buildTimestamp();

        BinanceAuthenticationFactory factoryMock = Mockito.mock(BinanceAuthenticationFactory.class);
        Mockito.doReturn(authenticationSpy)
                .when(factoryMock)
                .getAuthentication(signatureConfiguration);

        ApiClient apiClient = new ApiClient(clientConfiguration, factoryMock);

        apiClientSpy = Mockito.spy(apiClient);
        Mockito.doReturn(new ApiResponse<>(200, null))
                .when(apiClientSpy)
                .execute(Mockito.any(), Mockito.any(java.lang.reflect.Type.class));
        Mockito.doReturn(new ApiResponse<>(200, null)).when(apiClientSpy).execute(Mockito.any());
        Mockito.doReturn("1736393892000").when(apiClientSpy).buildTimestamp();

        api = new ConvertApi(apiClientSpy);
    }

    /**
     * Accept the offered quote (USER_DATA)
     *
     * <p>Accept the offered quote by quote ID. Weight: 200(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acceptTheOfferedQuoteTest() throws ApiException, CryptoException {
        AcceptTheOfferedQuoteRequest acceptTheOfferedQuoteRequest =
                new AcceptTheOfferedQuoteRequest();

        acceptTheOfferedQuoteRequest.quoteId("1");

        ApiResponse<AcceptTheOfferedQuoteResponse> response =
                api.acceptTheOfferedQuote(acceptTheOfferedQuoteRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000quoteId=1", signInputCaptor.getValue());
        assertEquals(
                "0624eea4af8a8321e2c84e368ed873d71a9a5c971e629175b93556bd22fc325d",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/fapi/v1/convert/acceptQuote", actualRequest.url().encodedPath());
    }

    /**
     * List All Convert Pairs
     *
     * <p>Query for all convertible token pairs and the tokens’ respective upper/lower limits * User
     * needs to supply either or both of the input parameter * If not defined for both fromAsset and
     * toAsset, only partial token pairs will be returned * Asset BNFCR is only available to convert
     * for MICA region users. Weight: 20(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllConvertPairsTest() throws ApiException, CryptoException {
        String fromAsset = "";
        String toAsset = "";
        ApiResponse<ListAllConvertPairsResponse> response =
                api.listAllConvertPairs(fromAsset, toAsset);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(null, actualRequest.url().queryParameter("signature"));
        assertEquals("/fapi/v1/convert/exchangeInfo", actualRequest.url().encodedPath());
    }

    /**
     * Order status(USER_DATA)
     *
     * <p>Query order status by order ID. Weight: 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void orderStatusTest() throws ApiException, CryptoException {
        Long orderId = 1L;
        String quoteId = "1";
        ApiResponse<OrderStatusResponse> response = api.orderStatus(orderId, quoteId);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("orderId=1&quoteId=1&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "c8ea02b290636497dfc9f4f59d01ea6ceff503bf1955b020615bd7bb133a81c4",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/fapi/v1/convert/orderStatus", actualRequest.url().encodedPath());
    }

    /**
     * Send Quote Request(USER_DATA)
     *
     * <p>Request a quote for the requested token pairs * Either fromAmount or toAmount should be
     * sent * &#x60;quoteId&#x60; will be returned only if you have enough funds to convert Weight:
     * 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendQuoteRequestTest() throws ApiException, CryptoException {
        SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest();

        sendQuoteRequestRequest.fromAsset("");
        sendQuoteRequestRequest.toAsset("");

        ApiResponse<SendQuoteRequestResponse> response =
                api.sendQuoteRequest(sendQuoteRequestRequest);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("timestamp=1736393892000toAsset=&fromAsset=", signInputCaptor.getValue());
        assertEquals(
                "b018f458ed01eaa557ea9adbacf293f684bee81ed29da077d1a5e54a264000c3",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/fapi/v1/convert/getQuote", actualRequest.url().encodedPath());
    }
}
