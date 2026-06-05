package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.QueryUserDelegationHistoryResponse;

/** API examples for AssetApi */
public class QueryUserDelegationHistoryExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query User Delegation History(For Master Account)(USER_DATA)
     *
     * <p>Query User Delegation History Weight: 60
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUserDelegationHistoryExample() throws ApiException {
        String email = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        String type = "";
        String asset = "";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUserDelegationHistoryResponse> response =
                getApi().queryUserDelegationHistory(
                                email, startTime, endTime, type, asset, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
