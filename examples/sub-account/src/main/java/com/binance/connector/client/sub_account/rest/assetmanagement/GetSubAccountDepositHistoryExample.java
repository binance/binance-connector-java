package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetSubAccountDepositHistoryResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class GetSubAccountDepositHistoryExample {
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
     * Get Sub-account Deposit History (For Master Account) (USER_DATA)
     *
     * <p>Fetch sub-account deposit history Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getSubAccountDepositHistoryExample() throws ApiException, IOException {
        String email = "123@test.com";
        Boolean includeSource = false;
        String coin = "BTC";
        Long status = 0L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 1L;
        Long offset = 0L;
        Long recvWindow = 5000L;
        String txId = "1";
        ApiResponse<GetSubAccountDepositHistoryResponse> response =
                getApi().getSubAccountDepositHistory(
                                email,
                                includeSource,
                                coin,
                                status,
                                startTime,
                                endTime,
                                limit,
                                offset,
                                recvWindow,
                                txId);
        System.out.println(response.getData());
    }
}
