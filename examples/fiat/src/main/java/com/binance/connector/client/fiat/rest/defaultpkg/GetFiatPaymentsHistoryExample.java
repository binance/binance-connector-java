package com.binance.connector.client.fiat.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.GetFiatPaymentsHistoryResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class GetFiatPaymentsHistoryExample {
    private FiatRestApi api;

    public FiatRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = FiatRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new FiatRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Fiat Payments History (USER_DATA)
     *
     * <p>Get Fiat Payments History Weight(IP): 1 Security Type: USER_DATA Notes: - If
     * &#x60;beginTime&#x60; and &#x60;endTime&#x60; are not sent, recent 30-day data is returned. -
     * &#x60;paymentMethod&#x60; is returned only when querying buy history
     * (&#x60;transactionType&#x3D;0&#x60;). - Supported payment methods: &#x60;Cash Balance&#x60;,
     * &#x60;Credit Card&#x60;, &#x60;Online Banking&#x60;, &#x60;Bank Transfer&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void getFiatPaymentsHistoryExample() throws ApiException, IOException {
        String transactionType = "0";
        Long beginTime = 1641782889000L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long rows = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetFiatPaymentsHistoryResponse> response =
                getApi().getFiatPaymentsHistory(
                                transactionType, beginTime, endTime, page, rows, recvWindow);
        System.out.println(response.getData());
    }
}
