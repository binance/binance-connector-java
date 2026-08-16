package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireV2Request;
import com.binance.connector.client.wallet.rest.model.SubmitDepositQuestionnaireV2Response;
import java.io.IOException;

/** API examples for TravelRuleApi */
public class SubmitDepositQuestionnaireV2Example {
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
     * Submit Deposit Questionnaire V2 (For local entities that require travel rule) (supporting
     * network) (USER_DATA)
     *
     * <p>Submit questionnaire for local entities that require travel rule. The questionnaire is
     * only applies to transactions from unhosted wallets or VASPs that are not yet onboarded with
     * GTR. Weight(UID): 600 Security Type: USER_DATA Notes: - Questionnaire is different for each
     * local entity, please refer to &#x60;Deposit Questionnaire Content&#x60; page. - If getting
     * error like &#x60;Questionnaire format not valid.&#x60; or &#x60;Questionnaire must not be
     * blank&#x60;, please try to verify the format of the questionnaire and use URL-encoded format.
     *
     * @throws ApiException if the Api call fails
     */
    public void submitDepositQuestionnaireV2Example() throws ApiException, IOException {
        SubmitDepositQuestionnaireV2Request submitDepositQuestionnaireV2Request =
                new SubmitDepositQuestionnaireV2Request();
        submitDepositQuestionnaireV2Request.depositId(1L);
        submitDepositQuestionnaireV2Request.questionnaire("");
        ApiResponse<SubmitDepositQuestionnaireV2Response> response =
                getApi().submitDepositQuestionnaireV2(submitDepositQuestionnaireV2Request);
        System.out.println(response.getData());
    }
}
