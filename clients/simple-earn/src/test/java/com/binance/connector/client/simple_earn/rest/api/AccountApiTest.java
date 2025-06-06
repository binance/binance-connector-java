/*
 * Binance Simple Earn REST API
 * OpenAPI Specification for the Binance Simple Earn REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.simple_earn.rest.api;

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
import com.binance.connector.client.simple_earn.rest.model.GetFlexiblePersonalLeftQuotaResponse;
import com.binance.connector.client.simple_earn.rest.model.GetFlexibleProductPositionResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedPersonalLeftQuotaResponse;
import com.binance.connector.client.simple_earn.rest.model.GetLockedProductPositionResponse;
import com.binance.connector.client.simple_earn.rest.model.GetSimpleEarnFlexibleProductListResponse;
import com.binance.connector.client.simple_earn.rest.model.GetSimpleEarnLockedProductListResponse;
import com.binance.connector.client.simple_earn.rest.model.SimpleAccountResponse;
import jakarta.validation.constraints.*;
import okhttp3.Call;
import okhttp3.Request;
import org.bouncycastle.crypto.CryptoException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

/** API tests for AccountApi */
public class AccountApiTest {

    private AccountApi api;
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

        api = new AccountApi(apiClientSpy);
    }

    /**
     * Get Flexible Personal Left Quota(USER_DATA)
     *
     * <p>Get Flexible Personal Left Quota Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFlexiblePersonalLeftQuotaTest() throws ApiException, CryptoException {
        String productId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetFlexiblePersonalLeftQuotaResponse> response =
                api.getFlexiblePersonalLeftQuota(productId, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "productId=1&recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "3449171bcce7a8aa43ee9684da7eebf17feeecb24ed8fd2858ca78fcc5d87e85",
                actualRequest.url().queryParameter("signature"));
        assertEquals(
                "/sapi/v1/simple-earn/flexible/personalLeftQuota",
                actualRequest.url().encodedPath());
    }

    /**
     * Get Flexible Product Position(USER_DATA)
     *
     * <p>Get Flexible Product Position Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFlexibleProductPositionTest() throws ApiException, CryptoException {
        String asset = "";
        String productId = "1";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetFlexibleProductPositionResponse> response =
                api.getFlexibleProductPosition(asset, productId, current, size, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "asset=&productId=1&current=1&size=10&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "1cc1b386baba7fc174869f28bbc9dcbfff30e18b98f074dd3f90eadd0fee8692",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/simple-earn/flexible/position", actualRequest.url().encodedPath());
    }

    /**
     * Get Locked Personal Left Quota(USER_DATA)
     *
     * <p>Get Locked Personal Left Quota Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLockedPersonalLeftQuotaTest() throws ApiException, CryptoException {
        String projectId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetLockedPersonalLeftQuotaResponse> response =
                api.getLockedPersonalLeftQuota(projectId, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "projectId=1&recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "7df8536b8711da59322819086e27ee0e183d18d1f4d6a68377c9c4a87f835ab8",
                actualRequest.url().queryParameter("signature"));
        assertEquals(
                "/sapi/v1/simple-earn/locked/personalLeftQuota", actualRequest.url().encodedPath());
    }

    /**
     * Get Locked Product Position
     *
     * <p>Get Locked Product Position Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLockedProductPositionTest() throws ApiException, CryptoException {
        String asset = "";
        String positionId = "1";
        String projectId = "1";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetLockedProductPositionResponse> response =
                api.getLockedProductPosition(
                        asset, positionId, projectId, current, size, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("3fa625e0c98e6f4e9f1ec21a44584f64734fa62a263ad96d4bea3583baa409d7", actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/simple-earn/locked/position", actualRequest.url().encodedPath());
    }

    /**
     * Get Simple Earn Flexible Product List(USER_DATA)
     *
     * <p>Get available Simple Earn flexible product list Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSimpleEarnFlexibleProductListTest() throws ApiException, CryptoException {
        String asset = "";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetSimpleEarnFlexibleProductListResponse> response =
                api.getSimpleEarnFlexibleProductList(asset, current, size, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "asset=&current=1&size=10&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "a8d7174d9767b6c5ac9e2a1b5c161cef80476f7dbb006361943091d5b77cd212",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/simple-earn/flexible/list", actualRequest.url().encodedPath());
    }

    /**
     * Get Simple Earn Locked Product List(USER_DATA)
     *
     * <p>Get Simple Earn Locked Product List * Get available Simple Earn locked product list
     * Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSimpleEarnLockedProductListTest() throws ApiException, CryptoException {
        String asset = "";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetSimpleEarnLockedProductListResponse> response =
                api.getSimpleEarnLockedProductList(asset, current, size, recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals(
                "asset=&current=1&size=10&recvWindow=5000&timestamp=1736393892000",
                signInputCaptor.getValue());
        assertEquals(
                "a8d7174d9767b6c5ac9e2a1b5c161cef80476f7dbb006361943091d5b77cd212",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/simple-earn/locked/list", actualRequest.url().encodedPath());
    }

    /**
     * Simple Account(USER_DATA)
     *
     * <p>Simple Account query Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void simpleAccountTest() throws ApiException, CryptoException {
        Long recvWindow = 5000L;
        ApiResponse<SimpleAccountResponse> response = api.simpleAccount(recvWindow);

        ArgumentCaptor<Call> callArgumentCaptor = ArgumentCaptor.forClass(Call.class);
        Mockito.verify(apiClientSpy)
                .execute(callArgumentCaptor.capture(), Mockito.any(java.lang.reflect.Type.class));

        ArgumentCaptor<String> signInputCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(signatureGeneratorSpy).signAsString(signInputCaptor.capture());

        Call captorValue = callArgumentCaptor.getValue();
        Request actualRequest = captorValue.request();

        assertEquals("recvWindow=5000&timestamp=1736393892000", signInputCaptor.getValue());
        assertEquals(
                "2cdd1e484bce80021437bee6b762e6a276b1954c3a0c011a16f6f2f6a47aba75",
                actualRequest.url().queryParameter("signature"));
        assertEquals("/sapi/v1/simple-earn/account", actualRequest.url().encodedPath());
    }
}
