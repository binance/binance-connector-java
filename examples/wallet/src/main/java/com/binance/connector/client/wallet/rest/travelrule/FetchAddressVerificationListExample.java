package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.FetchAddressVerificationListResponse;

/** API examples for TravelRuleApi */
public class FetchAddressVerificationListExample {
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
     * Fetch address verification list (USER_DATA)
     *
     * <p>Fetch address verification list for user to check on status and other details for the
     * addresses stored in Address Book. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void fetchAddressVerificationListExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<FetchAddressVerificationListResponse> response =
                getApi().fetchAddressVerificationList(recvWindow);
        System.out.println(response.getData());
    }
}
