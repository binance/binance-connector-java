package com.binance.connector.client.sub_account.rest.accountmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QuerySubAccountTransactionStatisticsResponse;

/** API examples for AccountManagementApi */
public class QuerySubAccountTransactionStatisticsExample {
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
     * Query Sub-account Transaction Statistics (For Master Account) (USER_DATA)
     *
     * <p>Query Sub-account Transaction statistics (For Master Account). Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void querySubAccountTransactionStatisticsExample() throws ApiException {
        String email = "";
        Long recvWindow = 5000L;
        ApiResponse<QuerySubAccountTransactionStatisticsResponse> response =
                getApi().querySubAccountTransactionStatistics(email, recvWindow);
        System.out.println(response.getData());
    }
}
