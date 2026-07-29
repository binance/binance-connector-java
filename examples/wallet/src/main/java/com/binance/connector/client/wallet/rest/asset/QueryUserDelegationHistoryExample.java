package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.OrderType;
import com.binance.connector.client.wallet.rest.model.QueryUserDelegationHistoryResponse;
import java.io.IOException;

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
     * Query User Delegation History(For Master Account) (USER_DATA)
     *
     * <p>Query User Delegation History Weight(IP): 60 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryUserDelegationHistoryExample() throws ApiException, IOException {
        String email = "abc@test.com";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        OrderType type = OrderType.MAIN_UMFUTURE;
        String asset = "BTC";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryUserDelegationHistoryResponse> response =
                getApi().queryUserDelegationHistory(
                                email, startTime, endTime, type, asset, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
