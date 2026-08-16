package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DepositHistoryTravelRuleResponse;
import java.io.IOException;

/** API examples for TravelRuleApi */
public class DepositHistoryTravelRuleExample {
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
     * Deposit History Travel Rule (for local entities that required travel rule) (supporting
     * network) (USER_DATA)
     *
     * <p>Fetch deposit history for local entities that required travel rule. Weight(IP): 1 Security
     * Type: USER_DATA Notes: - Please notice the default &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. - If both
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60;
     * and &#x60;endTime&#x60; must be less than 90 days. - Please, note that due to
     * network-specific characteristics, the returned source address may be inaccurate. If multiple
     * source addresses are found, only the first one will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    public void depositHistoryTravelRuleExample() throws ApiException, IOException {
        String trId = "1";
        String txId = "1";
        String tranId = "1";
        String network = "";
        String coin = "BTC";
        Long travelRuleStatus = 0L;
        Boolean pendingQuestionnaire = true;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long offset = 0L;
        Long limit = 1000L;
        ApiResponse<DepositHistoryTravelRuleResponse> response =
                getApi().depositHistoryTravelRule(
                                trId,
                                txId,
                                tranId,
                                network,
                                coin,
                                travelRuleStatus,
                                pendingQuestionnaire,
                                startTime,
                                endTime,
                                offset,
                                limit);
        System.out.println(response.getData());
    }
}
