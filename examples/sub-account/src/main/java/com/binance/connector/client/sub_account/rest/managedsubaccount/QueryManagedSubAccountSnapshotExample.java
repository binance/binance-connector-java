package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.OrderType;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountSnapshotResponse;
import java.io.IOException;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountSnapshotExample {
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
     * Query Managed Sub-account Snapshot (For Investor Master Account) (USER_DATA)
     *
     * <p>Query Managed Sub-account Snapshot Weight(IP): 2400 Security Type: USER_DATA Notes: - The
     * query time range must be less than 30 days. - Only data from the most recent month is
     * supported. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are omitted, records from the
     * last 7 days are returned by default.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountSnapshotExample() throws ApiException, IOException {
        String email = "abc@test.com";
        OrderType type = OrderType.SPOT;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryManagedSubAccountSnapshotResponse> response =
                getApi().queryManagedSubAccountSnapshot(
                                email, type, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
