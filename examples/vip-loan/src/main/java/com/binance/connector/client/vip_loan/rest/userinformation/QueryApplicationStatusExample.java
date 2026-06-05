package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.QueryApplicationStatusResponse;

/** API examples for UserInformationApi */
public class QueryApplicationStatusExample {
    private VipLoanRestApi api;

    public VipLoanRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = VipLoanRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new VipLoanRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Application Status(USER_DATA)
     *
     * <p>Query Application Status Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void queryApplicationStatusExample() throws ApiException {
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryApplicationStatusResponse> response =
                getApi().queryApplicationStatus(current, limit, recvWindow);
        System.out.println(response.getData());
    }
}
