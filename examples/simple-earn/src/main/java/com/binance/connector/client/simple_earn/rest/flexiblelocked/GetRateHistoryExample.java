package com.binance.connector.client.simple_earn.rest.flexiblelocked;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetRateHistoryResponse;

/** API examples for FlexibleLockedApi */
public class GetRateHistoryExample {
    private SimpleEarnRestApi api;

    public SimpleEarnRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SimpleEarnRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SimpleEarnRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Rate History(USER_DATA)
     *
     * <p>Get Rate History * The time between startTime and endTime cannot be longer than 1 year. *
     * If &#x60;startTime&#x60; and &#x60;endTime&#x60; are both not sent, then the last 30
     * days&#39; data will be returned. * If &#x60;startTime&#x60; is sent but &#x60;endTime&#x60;
     * is not sent, the next 30 days&#39; data beginning from &#x60;startTime&#x60; will be
     * returned. * If &#x60;endTime&#x60; is sent but &#x60;startTime&#x60; is not sent, the 30
     * days&#39; data before &#x60;endTime&#x60; will be returned. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getRateHistoryExample() throws ApiException {
        String productId = "1";
        String aprPeriod = "DAY";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetRateHistoryResponse> response =
                getApi().getRateHistory(
                                productId,
                                aprPeriod,
                                startTime,
                                endTime,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
