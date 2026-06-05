package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.CheckQuestionnaireRequirementsResponse;

/** API examples for TravelRuleApi */
public class CheckQuestionnaireRequirementsExample {
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
     * Check Questionnaire Requirements (for local entities that require travel rule) (supporting
     * network) (USER_DATA)
     *
     * <p>This API will return user-specific Travel Rule questionnaire requirement information in
     * reference to the current API key. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void checkQuestionnaireRequirementsExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<CheckQuestionnaireRequirementsResponse> response =
                getApi().checkQuestionnaireRequirements(recvWindow);
        System.out.println(response.getData());
    }
}
