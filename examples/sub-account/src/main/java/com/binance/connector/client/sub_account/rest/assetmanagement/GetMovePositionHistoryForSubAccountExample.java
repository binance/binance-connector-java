package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetMovePositionHistoryForSubAccountResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class GetMovePositionHistoryForSubAccountExample {
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
     * Get Move Position History for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Query move position history Weight(IP): 1 Security Type: USER_DATA Notes: - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are both omitted, records from the last 90 days
     * are returned by default (up to 1000 records). - If &#x60;startTime&#x60; is sent and
     * &#x60;endTime&#x60; is omitted, records in &#x60;[max(startTime, now-90d), now]&#x60; are
     * returned. - If &#x60;startTime&#x60; is omitted and &#x60;endTime&#x60; is sent, records in
     * &#x60;[max(now, endTime-90d), endTime]&#x60; are returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void getMovePositionHistoryForSubAccountExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long page = 1L;
        Long rows = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetMovePositionHistoryForSubAccountResponse> response =
                getApi().getMovePositionHistoryForSubAccount(
                                symbol, page, rows, startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
