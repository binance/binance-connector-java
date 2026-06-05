package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetSummaryOfSubAccountsFuturesAccountV2Response;

/** API examples for AssetManagementApi */
public class GetSummaryOfSubAccountsFuturesAccountV2Example {
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
     * Get Summary of Sub-account&#39;s Futures Account V2 (For Master Account) (USER_DATA)
     *
     * <p>Get Summary of Sub-account&#39;s Futures Account Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void getSummaryOfSubAccountsFuturesAccountV2Example() throws ApiException {
        Long futuresType = 0L;
        Long page = 1L;
        Long limit = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetSummaryOfSubAccountsFuturesAccountV2Response> response =
                getApi().getSummaryOfSubAccountsFuturesAccountV2(
                                futuresType, page, limit, recvWindow);
        System.out.println(response.getData());
    }
}
