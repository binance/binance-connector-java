package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountSpotAssetsSummaryResponse;

/** API examples for AssetManagementApi */
public class QuerySubAccountSpotAssetsSummaryExample {
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
     * Query Sub-account Spot Assets Summary (For Master Account) (USER_DATA)
     *
     * <p>Get BTC valued asset summary of subaccounts. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void querySubAccountSpotAssetsSummaryExample() throws ApiException {
        String email = "";
        Long page = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QuerySubAccountSpotAssetsSummaryResponse> response =
                getApi().querySubAccountSpotAssetsSummary(email, page, size, recvWindow);
        System.out.println(response.getData());
    }
}
