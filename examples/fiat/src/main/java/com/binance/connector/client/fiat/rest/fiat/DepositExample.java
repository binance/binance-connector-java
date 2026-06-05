package com.binance.connector.client.fiat.rest.fiat;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.DepositRequest;
import com.binance.connector.client.fiat.rest.model.DepositResponse;

/** API examples for FiatApi */
public class DepositExample {
    private FiatRestApi api;

    public FiatRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = FiatRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new FiatRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Deposit(TRADE)
     *
     * <p>Submit deposit request, in this version, we only support BRL deposit via pix. For BRL
     * deposit via pix, you need to place an order before making a transfer from your bank. Before
     * calling this api, please make sure you have already completed your KYC or KYB, and already
     * activated your fiat service on our website. Weight: 45000
     *
     * @throws ApiException if the Api call fails
     */
    public void depositExample() throws ApiException {
        DepositRequest depositRequest = new DepositRequest();
        depositRequest.currency("");
        depositRequest.apiPaymentMethod("");
        depositRequest.amount(0L);
        ApiResponse<DepositResponse> response = getApi().deposit(depositRequest);
        System.out.println(response.getData());
    }
}
