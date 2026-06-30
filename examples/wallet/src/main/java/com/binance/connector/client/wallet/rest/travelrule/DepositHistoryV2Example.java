package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.DepositHistoryV2Response;

/** API examples for TravelRuleApi */
public class DepositHistoryV2Example {
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
     * Deposit History V2 (for local entities that required travel rule) (supporting network)
     * (USER_DATA)
     *
     * <p>Fetch deposit history for local entities that with required travel rule information. *
     * Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that
     * time interval is within * If both &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; are sent, time between &#x60;&#x60;startTime&#x60;&#x60; and
     * &#x60;&#x60;endTime&#x60;&#x60; must * Please, note that due to network-specific
     * characteristics, the returned source address may be inaccurate. If multiple source addresses
     * are found, only the first one will be returned. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void depositHistoryV2Example() throws ApiException {
        Long depositId = 1L;
        String txId = "1";
        String network = "";
        String coin = "";
        Boolean retrieveQuestionnaire = true;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long offset = 0L;
        Long limit = 7L;
        ApiResponse<DepositHistoryV2Response> response =
                getApi().depositHistoryV2(
                                depositId,
                                txId,
                                network,
                                coin,
                                retrieveQuestionnaire,
                                startTime,
                                endTime,
                                offset,
                                limit);
        System.out.println(response.getData());
    }
}
