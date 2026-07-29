package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.SubAccountTransferHistoryResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class SubAccountTransferHistoryExample {
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
     * Sub-account Transfer History (For Sub-account) (USER_DATA)
     *
     * <p>Sub-account Transfer History Weight(IP): 1 Security Type: USER_DATA Notes: - If
     * &#x60;type&#x60; is not sent, records of type &#x60;2&#x60; (transfer out) are returned by
     * default. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, data from the most
     * recent 30 days is returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void subAccountTransferHistoryExample() throws ApiException, IOException {
        String asset = "BTC";
        Long type = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 10L;
        Boolean returnFailHistory = false;
        Long recvWindow = 5000L;
        ApiResponse<SubAccountTransferHistoryResponse> response =
                getApi().subAccountTransferHistory(
                                asset,
                                type,
                                startTime,
                                endTime,
                                limit,
                                returnFailHistory,
                                recvWindow);
        System.out.println(response.getData());
    }
}
