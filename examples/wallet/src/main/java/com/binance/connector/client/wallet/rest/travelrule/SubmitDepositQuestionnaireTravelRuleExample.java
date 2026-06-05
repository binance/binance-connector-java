package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireTravelRuleResponse;

/** API examples for TravelRuleApi */
public class SubmitDepositQuestionnaireTravelRuleExample {
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
     * Submit Deposit Questionnaire (For local entities that require travel rule) (supporting
     * network) (USER_DATA)
     *
     * <p>Submit questionnaire for local entities that require travel rule. The questionnaire is
     * only applies to transactions from unhosted wallets or VASPs that are not yet onboarded with
     * GTR. * Questionnaire is different for each local entity, please refer * If getting error like
     * &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;,
     * Weight: 600
     *
     * @throws ApiException if the Api call fails
     */
    public void submitDepositQuestionnaireTravelRuleExample() throws ApiException {
        SubmitDepositQuestionnaireTravelRuleRequest submitDepositQuestionnaireTravelRuleRequest =
                new SubmitDepositQuestionnaireTravelRuleRequest();
        submitDepositQuestionnaireTravelRuleRequest.tranId(1L);
        submitDepositQuestionnaireTravelRuleRequest.questionnaire("");
        ApiResponse<SubmitDepositQuestionnaireTravelRuleResponse> response =
                getApi().submitDepositQuestionnaireTravelRule(
                                submitDepositQuestionnaireTravelRuleRequest);
        System.out.println(response.getData());
    }
}
