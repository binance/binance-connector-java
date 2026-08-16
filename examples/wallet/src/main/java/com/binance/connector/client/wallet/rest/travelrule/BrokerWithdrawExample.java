package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawRequest;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawResponse;
import java.io.IOException;

/** API examples for TravelRuleApi */
public class BrokerWithdrawExample {
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
     * Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA)
     *
     * <p>Submit a withdrawal request for brokers of local entities that required travel rule.
     * Weight(UID): 600 Security Type: USER_DATA Notes: - If &#x60;network&#x60; not send, return
     * with default network of the coin, but if the address could not match default network, the
     * withdraw will be rejected. - You can get &#x60;network&#x60; in &#x60;networkList&#x60; of a
     * coin in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. -
     * Questionnaire is different for each local entity, please refer to the &#x60;Withdraw
     * Questionnaire Contents&#x60; page. - If getting error like &#x60;Questionnaire format not
     * valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;, please try to verify the format
     * of the questionnaire and use URL-encoded format.
     *
     * @throws ApiException if the Api call fails
     */
    public void brokerWithdrawExample() throws ApiException, IOException {
        BrokerWithdrawRequest brokerWithdrawRequest = new BrokerWithdrawRequest();
        brokerWithdrawRequest.address("");
        brokerWithdrawRequest.coin("BTC");
        brokerWithdrawRequest.amount(1.0d);
        brokerWithdrawRequest.withdrawOrderId("1");
        brokerWithdrawRequest.questionnaire("");
        brokerWithdrawRequest.originatorPii("");
        ApiResponse<BrokerWithdrawResponse> response =
                getApi().brokerWithdraw(brokerWithdrawRequest);
        System.out.println(response.getData());
    }
}
