package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogSubAccountTradingResponse;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountTransferLogSubAccountTradingExample {
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
     * Query Managed Sub Account Transfer Log (For Trading Team Sub Account) (USER_DATA)
     *
     * <p>Query Managed Sub Account Transfer Log (For Trading Team Sub Account) Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountTransferLogSubAccountTradingExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 0L;
        Long limit = 0L;
        String transfers = "";
        String transferFunctionAccountType = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryManagedSubAccountTransferLogSubAccountTradingResponse> response =
                getApi().queryManagedSubAccountTransferLogSubAccountTrading(
                                startTime,
                                endTime,
                                page,
                                limit,
                                transfers,
                                transferFunctionAccountType,
                                recvWindow);
        System.out.println(response.getData());
    }
}
