package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetFuturesPositionRiskOfSubAccountV2Response;

/** API examples for AccountManagementApi */
public class GetFuturesPositionRiskOfSubAccountV2Example {
    private SubAccountRestApi api;

    public SubAccountRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SubAccountRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SubAccountRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Futures Position-Risk of Sub-account V2 (For Master Account) (USER_DATA)
     *
     * <p>Get Futures Position-Risk of Sub-account V2 Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getFuturesPositionRiskOfSubAccountV2Example() throws ApiException {
        String email = "sub-account-email@email.com";
        Long futuresType = 0L;
        Long recvWindow = 5000L;
        ApiResponse<GetFuturesPositionRiskOfSubAccountV2Response> response =
                getApi().getFuturesPositionRiskOfSubAccountV2(email, futuresType, recvWindow);
        System.out.println(response.getData());
    }
}
