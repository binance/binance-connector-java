package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireRequest;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireResponse;
import java.io.IOException;

/** API examples for TravelRuleApi */
public class SubmitDepositQuestionnaireExample {
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
     * Submit Deposit Questionnaire Broker (For local entities that require travel rule) (supporting
     * network) (USER_DATA)
     *
     * <p>Submit questionnaire for brokers of local entities that require travel rule. The
     * questionnaire is only applies to transactions from un-hosted wallets or VASPs that are not
     * yet onboarded with GTR. Weight(UID): 600 Security Type: USER_DATA Notes: - Questionnaire is
     * different for each local entity, please refer to &#x60;Deposit Questionnaire Content&#x60;
     * page. - If getting error like &#x60;Questionnaire format not valid.&#x60; or
     * &#x60;Questionnaire must not be blank&#x60;, please try to verify the format of the
     * questionnaire and use URL-encoded format.
     *
     * @throws ApiException if the Api call fails
     */
    public void submitDepositQuestionnaireExample() throws ApiException, IOException {
        SubmitDepositQuestionnaireRequest submitDepositQuestionnaireRequest =
                new SubmitDepositQuestionnaireRequest();
        submitDepositQuestionnaireRequest.subAccountId("1");
        submitDepositQuestionnaireRequest.depositId(1L);
        submitDepositQuestionnaireRequest.questionnaire("");
        submitDepositQuestionnaireRequest.beneficiaryPii("");
        ApiResponse<SubmitDepositQuestionnaireResponse> response =
                getApi().submitDepositQuestionnaire(submitDepositQuestionnaireRequest);
        System.out.println(response.getData());
    }
}
