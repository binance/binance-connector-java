package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyRequest;
import com.binance.connector.client.wallet.rest.model.OneClickArrivalDepositApplyResponse;

/** API examples for CapitalApi */
public class OneClickArrivalDepositApplyExample {
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
     * One click arrival deposit apply (for expired address deposit) (USER_DATA)
     *
     * <p>Apply deposit credit for expired address (One click arrival) * Params need to be in the
     * POST body Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void oneClickArrivalDepositApplyExample() throws ApiException {
        OneClickArrivalDepositApplyRequest oneClickArrivalDepositApplyRequest =
                new OneClickArrivalDepositApplyRequest();
        ApiResponse<OneClickArrivalDepositApplyResponse> response =
                getApi().oneClickArrivalDepositApply(oneClickArrivalDepositApplyRequest);
        System.out.println(response.getData());
    }
}
