package com.binance.connector.client.fiat.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.GetOrderDetailResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class GetOrderDetailExample {
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
     * Get Order Detail (USER_DATA)
     *
     * <p>Get Order Detail Before calling this api, please make sure you have already completed your
     * KYC or KYB, and already activated your fiat service on our website. Weight(IP): 1 Security
     * Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getOrderDetailExample() throws ApiException, IOException {
        String orderNo = "036752*678";
        Long recvWindow = 5000L;
        ApiResponse<GetOrderDetailResponse> response = getApi().getOrderDetail(orderNo, recvWindow);
        System.out.println(response.getData());
    }
}
